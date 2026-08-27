import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class edz extends eec {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<edz> a = RecordCodecBuilder.create($$0 -> a($$0).and(aew.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, edz::new));
   private final aew c;

   private edz(List<efp> $$0, aew $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eee b() {
      return eef.B;
   }

   @Override
   public void a(ecz $$0) {
      ecs<eed> $$1 = new ecs<>(ecv.b, this.c);
      if ($$0.a($$1)) {
         $$0.a("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.a("Unknown function table called " + this.c));
      }
   }

   @Override
   protected cjf a(cjf $$0, ecq $$1) {
      eed $$2 = $$1.a().getElement(ecv.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         ecq.c<?> $$3 = ecq.a($$2);
         if ($$1.b($$3)) {
            cjf var5;
            try {
               var5 = $$2.apply($$0, $$1);
            } finally {
               $$1.c($$3);
            }

            return var5;
         } else {
            b.warn("Detected infinite loop in loot tables");
            return $$0;
         }
      }
   }

   public static eec.a<?> a(aew $$0) {
      return a($$1 -> new edz($$1, $$0));
   }
}

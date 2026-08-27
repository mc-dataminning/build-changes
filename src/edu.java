import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class edu extends edx {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<edu> a = RecordCodecBuilder.create($$0 -> a($$0).and(aeu.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, edu::new));
   private final aeu c;

   private edu(List<efk> $$0, aeu $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public edz b() {
      return eea.B;
   }

   @Override
   public void a(ecu $$0) {
      ecn<edy> $$1 = new ecn<>(ecq.b, this.c);
      if ($$0.a($$1)) {
         $$0.a("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.a("Unknown function table called " + this.c));
      }
   }

   @Override
   protected cja a(cja $$0, ecl $$1) {
      edy $$2 = $$1.a().getElement(ecq.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         ecl.c<?> $$3 = ecl.a($$2);
         if ($$1.b($$3)) {
            cja var5;
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

   public static edx.a<?> a(aeu $$0) {
      return a($$1 -> new edu($$1, $$0));
   }
}

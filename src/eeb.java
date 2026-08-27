import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eeb extends eee {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eeb> a = RecordCodecBuilder.create($$0 -> a($$0).and(aey.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, eeb::new));
   private final aey c;

   private eeb(List<efr> $$0, aey $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eeg b() {
      return eeh.B;
   }

   @Override
   public void a(edb $$0) {
      ecu<eef> $$1 = new ecu<>(ecx.b, this.c);
      if ($$0.a($$1)) {
         $$0.a("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.a("Unknown function table called " + this.c));
      }
   }

   @Override
   protected cjh a(cjh $$0, ecs $$1) {
      eef $$2 = $$1.a().getElement(ecx.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         ecs.c<?> $$3 = ecs.a($$2);
         if ($$1.b($$3)) {
            cjh var5;
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

   public static eee.a<?> a(aey $$0) {
      return a($$1 -> new eeb($$1, $$0));
   }
}

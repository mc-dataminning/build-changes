import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record efj(aey b) implements efr {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<efj> a = RecordCodecBuilder.create($$0 -> $$0.group(aey.a.fieldOf("name").forGetter(efj::c)).apply($$0, efj::new));

   @Override
   public efs b() {
      return eft.q;
   }

   @Override
   public void a(edb $$0) {
      ecu<efr> $$1 = new ecu<>(ecx.a, this.b);
      if ($$0.a($$1)) {
         $$0.a("Condition " + this.b + " is recursively called");
      } else {
         efr.super.a($$0);
         $$0.b()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.a("Unknown condition table called " + this.b));
      }
   }

   public boolean a(ecs $$0) {
      efr $$1 = $$0.a().getElement(ecx.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         ecs.c<?> $$2 = ecs.a($$1);
         if ($$0.b($$2)) {
            boolean var4;
            try {
               var4 = $$1.test($$0);
            } finally {
               $$0.c($$2);
            }

            return var4;
         } else {
            c.warn("Detected infinite loop in loot tables");
            return false;
         }
      }
   }

   public static efr.a a(aey $$0) {
      return () -> new efj($$0);
   }

   public aey c() {
      return this.b;
   }
}

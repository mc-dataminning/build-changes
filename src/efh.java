import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record efh(aew b) implements efp {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<efh> a = RecordCodecBuilder.create($$0 -> $$0.group(aew.a.fieldOf("name").forGetter(efh::c)).apply($$0, efh::new));

   @Override
   public efq b() {
      return efr.q;
   }

   @Override
   public void a(ecz $$0) {
      ecs<efp> $$1 = new ecs<>(ecv.a, this.b);
      if ($$0.a($$1)) {
         $$0.a("Condition " + this.b + " is recursively called");
      } else {
         efp.super.a($$0);
         $$0.b()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.a("Unknown condition table called " + this.b));
      }
   }

   public boolean a(ecq $$0) {
      efp $$1 = $$0.a().getElement(ecv.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         ecq.c<?> $$2 = ecq.a($$1);
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

   public static efp.a a(aew $$0) {
      return () -> new efh($$0);
   }

   public aew c() {
      return this.b;
   }
}

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record efb(aez b) implements efj {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<efb> a = RecordCodecBuilder.create($$0 -> $$0.group(aez.a.fieldOf("name").forGetter(efb::c)).apply($$0, efb::new));

   @Override
   public efk b() {
      return efl.q;
   }

   @Override
   public void a(ect $$0) {
      ecm<efj> $$1 = new ecm<>(ecp.a, this.b);
      if ($$0.a($$1)) {
         $$0.a("Condition " + this.b + " is recursively called");
      } else {
         efj.super.a($$0);
         $$0.b()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.a("Unknown condition table called " + this.b));
      }
   }

   public boolean a(eck $$0) {
      efj $$1 = $$0.a().getElement(ecp.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         eck.c<?> $$2 = eck.a($$1);
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

   public static efj.a a(aez $$0) {
      return () -> new efb($$0);
   }

   public aez c() {
      return this.b;
   }
}

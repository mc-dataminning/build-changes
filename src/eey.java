import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eey(aer b) implements efg {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eey> a = RecordCodecBuilder.create($$0 -> $$0.group(aer.a.fieldOf("name").forGetter(eey::c)).apply($$0, eey::new));

   @Override
   public efh b() {
      return efi.q;
   }

   @Override
   public void a(ecq $$0) {
      ecj<efg> $$1 = new ecj<>(ecm.a, this.b);
      if ($$0.a($$1)) {
         $$0.a("Condition " + this.b + " is recursively called");
      } else {
         efg.super.a($$0);
         $$0.b()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.a("Unknown condition table called " + this.b));
      }
   }

   public boolean a(ech $$0) {
      efg $$1 = $$0.a().getElement(ecm.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         ech.c<?> $$2 = ech.a($$1);
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

   public static efg.a a(aer $$0) {
      return () -> new eey($$0);
   }

   public aer c() {
      return this.b;
   }
}

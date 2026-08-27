import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eex(aer b) implements eff {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eex> a = RecordCodecBuilder.create($$0 -> $$0.group(aer.a.fieldOf("name").forGetter(eex::c)).apply($$0, eex::new));

   @Override
   public efg b() {
      return efh.q;
   }

   @Override
   public void a(ecp $$0) {
      eci<eff> $$1 = new eci<>(ecl.a, this.b);
      if ($$0.a($$1)) {
         $$0.a("Condition " + this.b + " is recursively called");
      } else {
         eff.super.a($$0);
         $$0.b()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.a("Unknown condition table called " + this.b));
      }
   }

   public boolean a(ecg $$0) {
      eff $$1 = $$0.a().getElement(ecl.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         ecg.c<?> $$2 = ecg.a($$1);
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

   public static eff.a a(aer $$0) {
      return () -> new eex($$0);
   }

   public aer c() {
      return this.b;
   }
}

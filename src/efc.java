import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record efc(aeu b) implements efk {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<efc> a = RecordCodecBuilder.create($$0 -> $$0.group(aeu.a.fieldOf("name").forGetter(efc::c)).apply($$0, efc::new));

   @Override
   public efl b() {
      return efm.q;
   }

   @Override
   public void a(ecu $$0) {
      ecn<efk> $$1 = new ecn<>(ecq.a, this.b);
      if ($$0.a($$1)) {
         $$0.a("Condition " + this.b + " is recursively called");
      } else {
         efk.super.a($$0);
         $$0.b()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.a("Unknown condition table called " + this.b));
      }
   }

   public boolean a(ecl $$0) {
      efk $$1 = $$0.a().getElement(ecq.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         ecl.c<?> $$2 = ecl.a($$1);
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

   public static efk.a a(aeu $$0) {
      return () -> new efc($$0);
   }

   public aeu c() {
      return this.b;
   }
}

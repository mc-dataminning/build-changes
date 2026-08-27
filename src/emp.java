import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record emp(ajc b) implements emx {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<emp> a = RecordCodecBuilder.create($$0 -> $$0.group(ajc.a.fieldOf("name").forGetter(emp::c)).apply($$0, emp::new));

   @Override
   public emy b() {
      return emz.q;
   }

   @Override
   public void a(ekh $$0) {
      eka<emx> $$1 = new eka<>(ekd.a, this.b);
      if ($$0.a($$1)) {
         $$0.b("Condition " + this.b + " is recursively called");
      } else {
         emx.super.a($$0);
         $$0.a()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.b("Unknown condition table called " + this.b));
      }
   }

   public boolean a(ejy $$0) {
      emx $$1 = $$0.a().getElement(ekd.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         ejy.c<?> $$2 = ejy.a($$1);
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

   public static emx.a a(ajc $$0) {
      return () -> new emp($$0);
   }

   public ajc c() {
      return this.b;
   }
}

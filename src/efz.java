import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record efz(afw b) implements egh {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<efz> a = RecordCodecBuilder.create($$0 -> $$0.group(afw.a.fieldOf("name").forGetter(efz::c)).apply($$0, efz::new));

   @Override
   public egi b() {
      return egj.q;
   }

   @Override
   public void a(edr $$0) {
      edk<egh> $$1 = new edk<>(edn.a, this.b);
      if ($$0.a($$1)) {
         $$0.a("Condition " + this.b + " is recursively called");
      } else {
         egh.super.a($$0);
         $$0.b()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.a("Unknown condition table called " + this.b));
      }
   }

   public boolean a(edi $$0) {
      egh $$1 = $$0.a().getElement(edn.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         edi.c<?> $$2 = edi.a($$1);
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

   public static egh.a a(afw $$0) {
      return () -> new efz($$0);
   }

   public afw c() {
      return this.b;
   }
}

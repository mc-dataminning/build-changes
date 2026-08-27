import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record ejm(ahg b) implements eju {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<ejm> a = RecordCodecBuilder.create($$0 -> $$0.group(ahg.a.fieldOf("name").forGetter(ejm::c)).apply($$0, ejm::new));

   @Override
   public ejv b() {
      return ejw.q;
   }

   @Override
   public void a(ehe $$0) {
      egx<eju> $$1 = new egx<>(eha.a, this.b);
      if ($$0.a($$1)) {
         $$0.b("Condition " + this.b + " is recursively called");
      } else {
         eju.super.a($$0);
         $$0.a()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.b("Unknown condition table called " + this.b));
      }
   }

   public boolean a(egv $$0) {
      eju $$1 = $$0.a().getElement(eha.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         egv.c<?> $$2 = egv.a($$1);
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

   public static eju.a a(ahg $$0) {
      return () -> new ejm($$0);
   }

   public ahg c() {
      return this.b;
   }
}

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record ejw(ahh b) implements eke {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<ejw> a = RecordCodecBuilder.create($$0 -> $$0.group(ahh.a.fieldOf("name").forGetter(ejw::c)).apply($$0, ejw::new));

   @Override
   public ekf b() {
      return ekg.q;
   }

   @Override
   public void a(eho $$0) {
      ehh<eke> $$1 = new ehh<>(ehk.a, this.b);
      if ($$0.a($$1)) {
         $$0.b("Condition " + this.b + " is recursively called");
      } else {
         eke.super.a($$0);
         $$0.a()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.b("Unknown condition table called " + this.b));
      }
   }

   public boolean a(ehf $$0) {
      eke $$1 = $$0.a().getElement(ehk.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         ehf.c<?> $$2 = ehf.a($$1);
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

   public static eke.a a(ahh $$0) {
      return () -> new ejw($$0);
   }

   public ahh c() {
      return this.b;
   }
}

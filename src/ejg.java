import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record ejg(ahd b) implements ejo {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<ejg> a = RecordCodecBuilder.create($$0 -> $$0.group(ahd.a.fieldOf("name").forGetter(ejg::c)).apply($$0, ejg::new));

   @Override
   public ejp b() {
      return ejq.q;
   }

   @Override
   public void a(egy $$0) {
      egr<ejo> $$1 = new egr<>(egu.a, this.b);
      if ($$0.a($$1)) {
         $$0.b("Condition " + this.b + " is recursively called");
      } else {
         ejo.super.a($$0);
         $$0.a()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.b("Unknown condition table called " + this.b));
      }
   }

   public boolean a(egp $$0) {
      ejo $$1 = $$0.a().getElement(egu.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         egp.c<?> $$2 = egp.a($$1);
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

   public static ejo.a a(ahd $$0) {
      return () -> new ejg($$0);
   }

   public ahd c() {
      return this.b;
   }
}

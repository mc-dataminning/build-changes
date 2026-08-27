import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record epu(ajt b) implements eqc {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<epu> a = RecordCodecBuilder.create($$0 -> $$0.group(ajt.a.fieldOf("name").forGetter(epu::c)).apply($$0, epu::new));

   @Override
   public eqd b() {
      return eqe.q;
   }

   @Override
   public void a(enk $$0) {
      end<eqc> $$1 = new end<>(eng.a, this.b);
      if ($$0.a($$1)) {
         $$0.b("Condition " + this.b + " is recursively called");
      } else {
         eqc.super.a($$0);
         $$0.a()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.b("Unknown condition table called " + this.b));
      }
   }

   public boolean a(enb $$0) {
      eqc $$1 = $$0.a().getElement(eng.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         enb.c<?> $$2 = enb.a($$1);
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

   public static eqc.a a(ajt $$0) {
      return () -> new epu($$0);
   }

   public ajt c() {
      return this.b;
   }
}

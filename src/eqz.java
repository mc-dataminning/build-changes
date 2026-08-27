import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eqz(akf b) implements erh {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eqz> a = RecordCodecBuilder.create($$0 -> $$0.group(akf.a.fieldOf("name").forGetter(eqz::c)).apply($$0, eqz::new));

   @Override
   public eri b() {
      return erj.q;
   }

   @Override
   public void a(eoj $$0) {
      eoc<erh> $$1 = new eoc<>(eof.a, this.b);
      if ($$0.a($$1)) {
         $$0.b("Condition " + this.b + " is recursively called");
      } else {
         erh.super.a($$0);
         $$0.a()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.b("Unknown condition table called " + this.b));
      }
   }

   public boolean a(eoa $$0) {
      erh $$1 = $$0.a().getElement(eof.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         eoa.c<?> $$2 = eoa.a($$1);
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

   public static erh.a a(akf $$0) {
      return () -> new eqz($$0);
   }

   public akf c() {
      return this.b;
   }
}

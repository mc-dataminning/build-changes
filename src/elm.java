import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record elm(aiy b) implements elu {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<elm> a = RecordCodecBuilder.create($$0 -> $$0.group(aiy.a.fieldOf("name").forGetter(elm::c)).apply($$0, elm::new));

   @Override
   public elv b() {
      return elw.q;
   }

   @Override
   public void a(eje $$0) {
      eix<elu> $$1 = new eix<>(eja.a, this.b);
      if ($$0.a($$1)) {
         $$0.b("Condition " + this.b + " is recursively called");
      } else {
         elu.super.a($$0);
         $$0.a()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.b("Unknown condition table called " + this.b));
      }
   }

   public boolean a(eiv $$0) {
      elu $$1 = $$0.a().getElement(eja.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         eiv.c<?> $$2 = eiv.a($$1);
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

   public static elu.a a(aiy $$0) {
      return () -> new elm($$0);
   }

   public aiy c() {
      return this.b;
   }
}

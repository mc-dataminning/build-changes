import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eiv(agt b) implements ejd {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eiv> a = RecordCodecBuilder.create($$0 -> $$0.group(agt.a.fieldOf("name").forGetter(eiv::c)).apply($$0, eiv::new));

   @Override
   public eje b() {
      return ejf.q;
   }

   @Override
   public void a(egn $$0) {
      egg<ejd> $$1 = new egg<>(egj.a, this.b);
      if ($$0.a($$1)) {
         $$0.b("Condition " + this.b + " is recursively called");
      } else {
         ejd.super.a($$0);
         $$0.a()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.b("Unknown condition table called " + this.b));
      }
   }

   public boolean a(ege $$0) {
      ejd $$1 = $$0.a().getElement(egj.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         ege.c<?> $$2 = ege.a($$1);
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

   public static ejd.a a(agt $$0) {
      return () -> new eiv($$0);
   }

   public agt c() {
      return this.b;
   }
}

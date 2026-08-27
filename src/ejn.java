import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record ejn(ahg b) implements ejv {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<ejn> a = RecordCodecBuilder.create($$0 -> $$0.group(ahg.a.fieldOf("name").forGetter(ejn::c)).apply($$0, ejn::new));

   @Override
   public ejw b() {
      return ejx.q;
   }

   @Override
   public void a(ehf $$0) {
      egy<ejv> $$1 = new egy<>(ehb.a, this.b);
      if ($$0.a($$1)) {
         $$0.b("Condition " + this.b + " is recursively called");
      } else {
         ejv.super.a($$0);
         $$0.a()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.b("Unknown condition table called " + this.b));
      }
   }

   public boolean a(egw $$0) {
      ejv $$1 = $$0.a().getElement(ehb.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         egw.c<?> $$2 = egw.a($$1);
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

   public static ejv.a a(ahg $$0) {
      return () -> new ejn($$0);
   }

   public ahg c() {
      return this.b;
   }
}

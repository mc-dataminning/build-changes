import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eqd(ajv b) implements eql {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eqd> a = RecordCodecBuilder.create($$0 -> $$0.group(ajv.a.fieldOf("name").forGetter(eqd::c)).apply($$0, eqd::new));

   @Override
   public eqm b() {
      return eqn.q;
   }

   @Override
   public void a(ent $$0) {
      enm<eql> $$1 = new enm<>(enp.a, this.b);
      if ($$0.a($$1)) {
         $$0.b("Condition " + this.b + " is recursively called");
      } else {
         eql.super.a($$0);
         $$0.a()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.b("Unknown condition table called " + this.b));
      }
   }

   public boolean a(enk $$0) {
      eql $$1 = $$0.a().getElement(enp.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         enk.c<?> $$2 = enk.a($$1);
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

   public static eql.a a(ajv $$0) {
      return () -> new eqd($$0);
   }

   public ajv c() {
      return this.b;
   }
}

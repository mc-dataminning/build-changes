import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record enl(ajh b) implements ent {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<enl> a = RecordCodecBuilder.create($$0 -> $$0.group(ajh.a.fieldOf("name").forGetter(enl::c)).apply($$0, enl::new));

   @Override
   public enu b() {
      return env.q;
   }

   @Override
   public void a(eld $$0) {
      ekw<ent> $$1 = new ekw<>(ekz.a, this.b);
      if ($$0.a($$1)) {
         $$0.b("Condition " + this.b + " is recursively called");
      } else {
         ent.super.a($$0);
         $$0.a()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.b("Unknown condition table called " + this.b));
      }
   }

   public boolean a(eku $$0) {
      ent $$1 = $$0.a().getElement(ekz.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         eku.c<?> $$2 = eku.a($$1);
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

   public static ent.a a(ajh $$0) {
      return () -> new enl($$0);
   }

   public ajh c() {
      return this.b;
   }
}

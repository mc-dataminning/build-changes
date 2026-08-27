import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eum(aks<euu> b) implements euu {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eum> a = RecordCodecBuilder.create($$0 -> $$0.group(aks.a(li.aW).fieldOf("name").forGetter(eum::c)).apply($$0, eum::new));

   @Override
   public euv b() {
      return euw.r;
   }

   @Override
   public void a(erv $$0) {
      if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         euu.super.a($$0);
         $$0.a()
            .a(li.aW, this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(erp $$0) {
      euu $$1 = $$0.a().a(li.aW, this.b).map(ja.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         erp.c<?> $$2 = erp.a($$1);
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

   public static euu.a a(aks<euu> $$0) {
      return () -> new eum($$0);
   }

   public aks<euu> c() {
      return this.b;
   }
}

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eur(akq<eva> b) implements eva {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<eur> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akq.a(lu.be).fieldOf("name").forGetter(eur::c)).apply($$0, eur::new));

   @Override
   public evb b() {
      return evc.p;
   }

   @Override
   public void a(erv $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         eva.super.a($$0);
         $$0.a()
            .a(lu.be, this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(erp $$0) {
      eva $$1 = $$0.a().a(lu.be, this.b).map(jm.c::a).orElse(null);
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

   public static eva.a a(akq<eva> $$0) {
      return () -> new eur($$0);
   }

   public akq<eva> c() {
      return this.b;
   }
}

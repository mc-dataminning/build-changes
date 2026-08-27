import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record esf(akm<esn> b) implements esn {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<esf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akm.a(lf.aW).fieldOf("name").forGetter(esf::c)).apply($$0, esf::new));

   @Override
   public eso b() {
      return esp.r;
   }

   @Override
   public void a(epn $$0) {
      if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         esn.super.a($$0);
         $$0.a()
            .a(lf.aW, this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(eph $$0) {
      esn $$1 = $$0.a().a(lf.aW, this.b).map(ix.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         eph.c<?> $$2 = eph.a($$1);
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

   public static esn.a a(akm<esn> $$0) {
      return () -> new esf($$0);
   }

   public akm<esn> c() {
      return this.b;
   }
}

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record etj(ald<etr> b) implements etr {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<etj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ald.a(lq.aW).fieldOf("name").forGetter(etj::c)).apply($$0, etj::new));

   @Override
   public ets b() {
      return ett.r;
   }

   @Override
   public void a(eqn $$0) {
      if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         etr.super.a($$0);
         $$0.a()
            .a(lq.aW, this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(eqh $$0) {
      etr $$1 = $$0.a().a(lq.aW, this.b).map(ji.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         eqh.c<?> $$2 = eqh.a($$1);
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

   public static etr.a a(ald<etr> $$0) {
      return () -> new etj($$0);
   }

   public ald<etr> c() {
      return this.b;
   }
}

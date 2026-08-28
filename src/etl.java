import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record etl(ale<ett> b) implements ett {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<etl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.a(lq.aW).fieldOf("name").forGetter(etl::c)).apply($$0, etl::new));

   @Override
   public etu b() {
      return etv.r;
   }

   @Override
   public void a(eqp $$0) {
      if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         ett.super.a($$0);
         $$0.a()
            .a(lq.aW, this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(eqj $$0) {
      ett $$1 = $$0.a().a(lq.aW, this.b).map(ji.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         eqj.c<?> $$2 = eqj.a($$1);
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

   public static ett.a a(ale<ett> $$0) {
      return () -> new etl($$0);
   }

   public ale<ett> c() {
      return this.b;
   }
}

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eti(ald<etq> b) implements etq {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<eti> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ald.a(lq.aW).fieldOf("name").forGetter(eti::c)).apply($$0, eti::new));

   @Override
   public etr b() {
      return ets.r;
   }

   @Override
   public void a(eqm $$0) {
      if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         etq.super.a($$0);
         $$0.a()
            .a(lq.aW, this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(eqg $$0) {
      etq $$1 = $$0.a().a(lq.aW, this.b).map(ji.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         eqg.c<?> $$2 = eqg.a($$1);
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

   public static etq.a a(ald<etq> $$0) {
      return () -> new eti($$0);
   }

   public ald<etq> c() {
      return this.b;
   }
}

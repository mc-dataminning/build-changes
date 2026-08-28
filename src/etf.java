import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record etf(ala<etn> b) implements etn {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<etf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ala.a(lq.aW).fieldOf("name").forGetter(etf::c)).apply($$0, etf::new));

   @Override
   public eto b() {
      return etp.r;
   }

   @Override
   public void a(eqj $$0) {
      if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         etn.super.a($$0);
         $$0.a()
            .a(lq.aW, this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(eqd $$0) {
      etn $$1 = $$0.a().a(lq.aW, this.b).map(ji.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         eqd.c<?> $$2 = eqd.a($$1);
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

   public static etn.a a(ala<etn> $$0) {
      return () -> new etf($$0);
   }

   public ala<etn> c() {
      return this.b;
   }
}

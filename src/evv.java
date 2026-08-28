import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record evv(ala<ewe> b) implements ewe {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<evv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ala.a(lv.be).fieldOf("name").forGetter(evv::c)).apply($$0, evv::new));

   @Override
   public ewf b() {
      return ewg.p;
   }

   @Override
   public void a(esz $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         ewe.super.a($$0);
         $$0.a()
            .a(lv.be, this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(est $$0) {
      ewe $$1 = $$0.a().a(lv.be, this.b).map(jn.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         est.c<?> $$2 = est.a($$1);
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

   public static ewe.a a(ala<ewe> $$0) {
      return () -> new evv($$0);
   }

   public ala<ewe> c() {
      return this.b;
   }
}

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eyp(akt<eyy> b) implements eyy {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<eyp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akt.a(mc.bi).fieldOf("name").forGetter(eyp::c)).apply($$0, eyp::new));

   @Override
   public eyz b() {
      return eza.p;
   }

   @Override
   public void a(evv $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         eyy.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(evp $$0) {
      eyy $$1 = $$0.a().c(this.b).map(jr.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         evp.c<?> $$2 = evp.a($$1);
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

   public static eyy.a a(akt<eyy> $$0) {
      return () -> new eyp($$0);
   }

   public akt<eyy> c() {
      return this.b;
   }
}

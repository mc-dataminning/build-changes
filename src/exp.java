import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record exp(ali<exy> b) implements exy {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<exp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ali.a(ma.bf).fieldOf("name").forGetter(exp::c)).apply($$0, exp::new));

   @Override
   public exz b() {
      return eya.p;
   }

   @Override
   public void a(eut $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         exy.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(eun $$0) {
      exy $$1 = $$0.a().c(this.b).map(jq.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         eun.c<?> $$2 = eun.a($$1);
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

   public static exy.a a(ali<exy> $$0) {
      return () -> new exp($$0);
   }

   public ali<exy> c() {
      return this.b;
   }
}

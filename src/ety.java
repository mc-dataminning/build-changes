import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record ety(akj<euh> b) implements euh {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<ety> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akj.a(lr.bd).fieldOf("name").forGetter(ety::c)).apply($$0, ety::new));

   @Override
   public eui b() {
      return euj.p;
   }

   @Override
   public void a(erc $$0) {
      if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         euh.super.a($$0);
         $$0.a()
            .a(lr.bd, this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(eqw $$0) {
      euh $$1 = $$0.a().a(lr.bd, this.b).map(jj.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         eqw.c<?> $$2 = eqw.a($$1);
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

   public static euh.a a(akj<euh> $$0) {
      return () -> new ety($$0);
   }

   public akj<euh> c() {
      return this.b;
   }
}

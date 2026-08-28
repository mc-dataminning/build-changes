import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record ewy(alg<exh> b) implements exh {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<ewy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a(ly.bf).fieldOf("name").forGetter(ewy::c)).apply($$0, ewy::new));

   @Override
   public exi b() {
      return exj.p;
   }

   @Override
   public void a(euc $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         exh.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(etw $$0) {
      exh $$1 = $$0.a().c(this.b).map(jp.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         etw.c<?> $$2 = etw.a($$1);
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

   public static exh.a a(alg<exh> $$0) {
      return () -> new ewy($$0);
   }

   public alg<exh> c() {
      return this.b;
   }
}

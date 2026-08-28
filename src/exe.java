import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record exe(alh<exn> b) implements exn {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<exe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alh.a(lz.bf).fieldOf("name").forGetter(exe::c)).apply($$0, exe::new));

   @Override
   public exo b() {
      return exp.p;
   }

   @Override
   public void a(eui $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         exn.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(euc $$0) {
      exn $$1 = $$0.a().c(this.b).map(jq.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         euc.c<?> $$2 = euc.a($$1);
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

   public static exn.a a(alh<exn> $$0) {
      return () -> new exe($$0);
   }

   public alh<exn> c() {
      return this.b;
   }
}

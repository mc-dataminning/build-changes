import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eut(akq<evc> b) implements evc {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<eut> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akq.a(lu.be).fieldOf("name").forGetter(eut::c)).apply($$0, eut::new));

   @Override
   public evd b() {
      return eve.p;
   }

   @Override
   public void a(erx $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         evc.super.a($$0);
         $$0.a()
            .a(lu.be, this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(err $$0) {
      evc $$1 = $$0.a().a(lu.be, this.b).map(jm.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         err.c<?> $$2 = err.a($$1);
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

   public static evc.a a(akq<evc> $$0) {
      return () -> new eut($$0);
   }

   public akq<evc> c() {
      return this.b;
   }
}

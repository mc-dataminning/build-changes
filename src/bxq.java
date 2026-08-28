import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxq extends bwy<cog> {
   private static final int d = 1200;
   final float c;

   public bxq(float $$0) {
      super(ImmutableMap.of(cej.d, cek.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arc $$0, cog $$1) {
      return $$1.ec().g().map($$0x -> $$0x == cqm.b || $$0x == cqm.c || $$0x == cqm.d).orElse(true);
   }

   protected boolean a(arc $$0, cog $$1, long $$2) {
      return $$1.ec().a(cej.d);
   }

   protected void b(arc $$0, cog $$1, long $$2) {
      bxa.a($$1, $$1.ec().c(cej.d).get().b(), this.c, 1);
   }

   protected void c(arc $$0, cog $$1, long $$2) {
      Optional<jq> $$3 = $$1.ec().c(cej.d);
      $$3.ifPresent($$1x -> {
         ji $$2x = $$1x.b();
         arc $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            cgj $$4 = $$3x.A();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agc.c($$0, $$2x);
         }
      });
      $$1.ec().b(cej.d);
   }
}

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxt extends bxb<coj> {
   private static final int d = 1200;
   final float c;

   public bxt(float $$0) {
      super(ImmutableMap.of(cem.d, cen.a), 1200);
      this.c = $$0;
   }

   protected boolean a(ard $$0, coj $$1) {
      return $$1.eb().g().map($$0x -> $$0x == cqp.b || $$0x == cqp.c || $$0x == cqp.d).orElse(true);
   }

   protected boolean a(ard $$0, coj $$1, long $$2) {
      return $$1.eb().a(cem.d);
   }

   protected void b(ard $$0, coj $$1, long $$2) {
      bxd.a($$1, $$1.eb().c(cem.d).get().b(), this.c, 1);
   }

   protected void c(ard $$0, coj $$1, long $$2) {
      Optional<jq> $$3 = $$1.eb().c(cem.d);
      $$3.ifPresent($$1x -> {
         ji $$2x = $$1x.b();
         ard $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            cgm $$4 = $$3x.A();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agd.c($$0, $$2x);
         }
      });
      $$1.eb().b(cem.d);
   }
}

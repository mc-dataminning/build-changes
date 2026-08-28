import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxr extends bwz<coh> {
   private static final int d = 1200;
   final float c;

   public bxr(float $$0) {
      super(ImmutableMap.of(cek.d, cel.a), 1200);
      this.c = $$0;
   }

   protected boolean a(ard $$0, coh $$1) {
      return $$1.eb().g().map($$0x -> $$0x == cqn.b || $$0x == cqn.c || $$0x == cqn.d).orElse(true);
   }

   protected boolean a(ard $$0, coh $$1, long $$2) {
      return $$1.eb().a(cek.d);
   }

   protected void b(ard $$0, coh $$1, long $$2) {
      bxb.a($$1, $$1.eb().c(cek.d).get().b(), this.c, 1);
   }

   protected void c(ard $$0, coh $$1, long $$2) {
      Optional<jq> $$3 = $$1.eb().c(cek.d);
      $$3.ifPresent($$1x -> {
         ji $$2x = $$1x.b();
         ard $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            cgk $$4 = $$3x.A();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agd.c($$0, $$2x);
         }
      });
      $$1.eb().b(cek.d);
   }
}

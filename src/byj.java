import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byj extends bxr<cpd> {
   private static final int d = 1200;
   final float c;

   public byj(float $$0) {
      super(ImmutableMap.of(cfc.d, cfd.a), 1200);
      this.c = $$0;
   }

   protected boolean a(ard $$0, cpd $$1) {
      return $$1.ea().g().map($$0x -> $$0x == cri.b || $$0x == cri.c || $$0x == cri.d).orElse(true);
   }

   protected boolean a(ard $$0, cpd $$1, long $$2) {
      return $$1.ea().a(cfc.d);
   }

   protected void b(ard $$0, cpd $$1, long $$2) {
      bxt.a($$1, $$1.ea().c(cfc.d).get().b(), this.c, 1);
   }

   protected void c(ard $$0, cpd $$1, long $$2) {
      Optional<jq> $$3 = $$1.ea().c(cfc.d);
      $$3.ifPresent($$1x -> {
         ji $$2x = $$1x.b();
         ard $$3x = $$0.p().a($$1x.a());
         if ($$3x != null) {
            chc $$4 = $$3x.A();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agc.c($$0, $$2x);
         }
      });
      $$1.ea().b(cfc.d);
   }
}

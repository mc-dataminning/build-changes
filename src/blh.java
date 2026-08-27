import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class blh extends bkp<caz> {
   private static final int d = 1200;
   final float c;

   public blh(float $$0) {
      super(ImmutableMap.of(brz.d, bsa.a), 1200);
      this.c = $$0;
   }

   protected boolean a(akk $$0, caz $$1) {
      return $$1.dM().g().map($$0x -> $$0x == ccx.b || $$0x == ccx.c || $$0x == ccx.d).orElse(true);
   }

   protected boolean a(akk $$0, caz $$1, long $$2) {
      return $$1.dM().a(brz.d);
   }

   protected void b(akk $$0, caz $$1, long $$2) {
      bkr.a($$1, $$1.dM().c(brz.d).get().b(), this.c, 1);
   }

   protected void c(akk $$0, caz $$1, long $$2) {
      Optional<hd> $$3 = $$1.dM().c(brz.d);
      $$3.ifPresent($$1x -> {
         gu $$2x = $$1x.b();
         akk $$3x = $$0.n().a($$1x.a());
         if ($$3x != null) {
            btx $$4 = $$3x.w();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            aav.c($$0, $$2x);
         }
      });
      $$1.dM().b(brz.d);
   }
}

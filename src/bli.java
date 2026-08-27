import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bli extends bkq<cba> {
   private static final int d = 1200;
   final float c;

   public bli(float $$0) {
      super(ImmutableMap.of(bsa.d, bsb.a), 1200);
      this.c = $$0;
   }

   protected boolean a(akk $$0, cba $$1) {
      return $$1.dM().g().map($$0x -> $$0x == ccy.b || $$0x == ccy.c || $$0x == ccy.d).orElse(true);
   }

   protected boolean a(akk $$0, cba $$1, long $$2) {
      return $$1.dM().a(bsa.d);
   }

   protected void b(akk $$0, cba $$1, long $$2) {
      bks.a($$1, $$1.dM().c(bsa.d).get().b(), this.c, 1);
   }

   protected void c(akk $$0, cba $$1, long $$2) {
      Optional<hd> $$3 = $$1.dM().c(bsa.d);
      $$3.ifPresent($$1x -> {
         gu $$2x = $$1x.b();
         akk $$3x = $$0.n().a($$1x.a());
         if ($$3x != null) {
            bty $$4 = $$3x.w();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            aav.c($$0, $$2x);
         }
      });
      $$1.dM().b(bsa.d);
   }
}

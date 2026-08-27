import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class boe extends bnm<cee> {
   private static final int d = 1200;
   final float c;

   public boe(float $$0) {
      super(ImmutableMap.of(bux.d, buy.a), 1200);
      this.c = $$0;
   }

   protected boolean a(amp $$0, cee $$1) {
      return $$1.dO().g().map($$0x -> $$0x == cgd.b || $$0x == cgd.c || $$0x == cgd.d).orElse(true);
   }

   protected boolean a(amp $$0, cee $$1, long $$2) {
      return $$1.dO().a(bux.d);
   }

   protected void b(amp $$0, cee $$1, long $$2) {
      bno.a($$1, $$1.dO().c(bux.d).get().b(), this.c, 1);
   }

   protected void c(amp $$0, cee $$1, long $$2) {
      Optional<id> $$3 = $$1.dO().c(bux.d);
      $$3.ifPresent($$1x -> {
         hv $$2x = $$1x.b();
         amp $$3x = $$0.n().a($$1x.a());
         if ($$3x != null) {
            bww $$4 = $$3x.x();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            acv.c($$0, $$2x);
         }
      });
      $$1.dO().b(bux.d);
   }
}

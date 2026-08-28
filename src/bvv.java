import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvv extends bvd<cmf> {
   private static final int d = 1200;
   final float c;

   public bvv(float $$0) {
      super(ImmutableMap.of(cco.d, ccp.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arb $$0, cmf $$1) {
      return $$1.dS().g().map($$0x -> $$0x == coh.b || $$0x == coh.c || $$0x == coh.d).orElse(true);
   }

   protected boolean a(arb $$0, cmf $$1, long $$2) {
      return $$1.dS().a(cco.d);
   }

   protected void b(arb $$0, cmf $$1, long $$2) {
      bvf.a($$1, $$1.dS().c(cco.d).get().b(), this.c, 1);
   }

   protected void c(arb $$0, cmf $$1, long $$2) {
      Optional<jh> $$3 = $$1.dS().c(cco.d);
      $$3.ifPresent($$1x -> {
         iz $$2x = $$1x.b();
         arb $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            ceo $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agp.c($$0, $$2x);
         }
      });
      $$1.dS().b(cco.d);
   }
}

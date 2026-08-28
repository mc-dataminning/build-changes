import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwb extends bvj<cml> {
   private static final int d = 1200;
   final float c;

   public bwb(float $$0) {
      super(ImmutableMap.of(ccu.d, ccv.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arf $$0, cml $$1) {
      return $$1.dS().g().map($$0x -> $$0x == coo.b || $$0x == coo.c || $$0x == coo.d).orElse(true);
   }

   protected boolean a(arf $$0, cml $$1, long $$2) {
      return $$1.dS().a(ccu.d);
   }

   protected void b(arf $$0, cml $$1, long $$2) {
      bvl.a($$1, $$1.dS().c(ccu.d).get().b(), this.c, 1);
   }

   protected void c(arf $$0, cml $$1, long $$2) {
      Optional<jh> $$3 = $$1.dS().c(ccu.d);
      $$3.ifPresent($$1x -> {
         iz $$2x = $$1x.b();
         arf $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            ceu $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agt.c($$0, $$2x);
         }
      });
      $$1.dS().b(ccu.d);
   }
}

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwc extends bvk<cmm> {
   private static final int d = 1200;
   final float c;

   public bwc(float $$0) {
      super(ImmutableMap.of(ccv.d, ccw.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arf $$0, cmm $$1) {
      return $$1.dS().g().map($$0x -> $$0x == cop.b || $$0x == cop.c || $$0x == cop.d).orElse(true);
   }

   protected boolean a(arf $$0, cmm $$1, long $$2) {
      return $$1.dS().a(ccv.d);
   }

   protected void b(arf $$0, cmm $$1, long $$2) {
      bvm.a($$1, $$1.dS().c(ccv.d).get().b(), this.c, 1);
   }

   protected void c(arf $$0, cmm $$1, long $$2) {
      Optional<jh> $$3 = $$1.dS().c(ccv.d);
      $$3.ifPresent($$1x -> {
         iz $$2x = $$1x.b();
         arf $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cev $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agt.c($$0, $$2x);
         }
      });
      $$1.dS().b(ccv.d);
   }
}

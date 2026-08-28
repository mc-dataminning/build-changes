import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwp extends bvx<cnc> {
   private static final int d = 1200;
   final float c;

   public bwp(float $$0) {
      super(ImmutableMap.of(cdi.d, cdj.a), 1200);
      this.c = $$0;
   }

   protected boolean a(arg $$0, cnc $$1) {
      return $$1.dX().g().map($$0x -> $$0x == cpg.b || $$0x == cpg.c || $$0x == cpg.d).orElse(true);
   }

   protected boolean a(arg $$0, cnc $$1, long $$2) {
      return $$1.dX().a(cdi.d);
   }

   protected void b(arg $$0, cnc $$1, long $$2) {
      bvz.a($$1, $$1.dX().c(cdi.d).get().b(), this.c, 1);
   }

   protected void c(arg $$0, cnc $$1, long $$2) {
      Optional<jm> $$3 = $$1.dX().c(cdi.d);
      $$3.ifPresent($$1x -> {
         je $$2x = $$1x.b();
         arg $$3x = $$0.o().a($$1x.a());
         if ($$3x != null) {
            cfi $$4 = $$3x.y();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            agn.c($$0, $$2x);
         }
      });
      $$1.dX().b(cdi.d);
   }
}

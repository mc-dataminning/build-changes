import com.google.common.collect.ImmutableMap;

public class cbx<E extends coz> extends bxy<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cbx(int $$0) {
      super(ImmutableMap.of(cfj.aB, cfk.a, cfj.o, cfk.b, cfj.m, cfk.b, cfj.n, cfk.c, cfj.B, cfk.c, cfj.az, cfk.c, cfj.aG, cfk.c), $$0);
   }

   protected boolean a(ash $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ash $$0, E $$1, long $$2) {
      $$1.a(axf.Cu, 5.0F, 1.0F);
   }

   protected void c(ash $$0, E $$1, long $$2) {
      if ($$1.c(bwr.m)) {
         $$1.b(bwr.a);
      }

      $$1.eb().b(cfj.aB);
      $$1.eb().c(cfj.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.eb().a(cfj.az)) {
            cpa.a($$1, $$1x.dv());
         }
      });
   }
}

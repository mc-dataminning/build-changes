import com.google.common.collect.ImmutableMap;

public class cdk<E extends cra> extends bzl<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cdk(int $$0) {
      super(ImmutableMap.of(cgw.aC, cgx.a, cgw.p, cgx.b, cgw.n, cgx.b, cgw.o, cgx.c, cgw.C, cgx.c, cgw.aA, cgx.c, cgw.aH, cgx.c), $$0);
   }

   protected boolean a(ars $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ars $$0, E $$1, long $$2) {
      $$1.a(awp.CZ, 5.0F, 1.0F);
   }

   protected void c(ars $$0, E $$1, long $$2) {
      if ($$1.c(byg.m)) {
         $$1.b(byg.a);
      }

      $$1.ec().b(cgw.aC);
      $$1.ec().c(cgw.C).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.ec().a(cgw.aA)) {
            crb.a($$1, $$1x.dv());
         }
      });
   }
}

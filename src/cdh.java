import com.google.common.collect.ImmutableMap;

public class cdh extends bzl<cra> {
   private static final int c = 25;
   private static final int d = 20;

   public cdh() {
      super(ImmutableMap.of(cgw.az, cgx.a, cgw.p, cgx.b, cgw.aG, cgx.c, cgw.aE, cgx.c), crb.b);
   }

   protected void a(ars $$0, cra $$1, long $$2) {
      byu<cra> $$3 = $$1.ec();
      $$3.a(cgw.aE, baw.a, 25L);
      $$3.b(cgw.n);
      bxu $$4 = $$1.ec().c(cgw.az).get();
      bzn.a($$1, $$4);
      $$1.b(byg.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(ars $$0, cra $$1, long $$2) {
      return true;
   }

   protected void c(ars $$0, cra $$1, long $$2) {
      if (!$$1.ec().a(cgw.aE) && !$$1.ec().a(cgw.aG)) {
         $$1.ec().a(cgw.aG, baw.a, (long)(crb.b - 25));
         $$1.a(awp.CY, 3.0F, 1.0F);
      }
   }

   protected void d(ars $$0, cra $$1, long $$2) {
      if ($$1.c(byg.l)) {
         $$1.b(byg.a);
      }

      $$1.ec().c(cgw.az).ifPresent($$1::i);
      $$1.ec().b(cgw.az);
   }
}

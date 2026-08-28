import java.util.List;

public class dbj extends dag {
   public dbj(dag.a $$0) {
      super($$0);
   }

   public static ddn a() {
      jh<dno> $$0 = mh.a(mh.e);
      return new ddn(
         List.of(ddn.a.a(jk.a(dnq.bz.p()), 15.0F), ddn.a.b($$0.b(axn.Q), 15.0F), ddn.a.b($$0.b(axn.a), 5.0F), ddn.a.b(jk.a(dnq.fx.p(), dnq.fy.p()), 2.0F)),
         1.0F,
         1,
         true
      );
   }

   @Override
   public boolean a(dak $$0, dkj $$1, ebq $$2, iw $$3, byf $$4) {
      ddn $$5 = $$0.a(kl.A);
      if ($$5 == null) {
         return false;
      } else {
         if (!$$1.A_() && !$$2.a(axn.aN) && $$5.c() > 0) {
            $$0.a($$5.c(), $$4, bxo.a);
         }

         return true;
      }
   }

   @Override
   public bvc a(def $$0) {
      dkj $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebq $$3 = $$1.a_($$2);
      if ($$3.b() instanceof drh $$5 && !$$5.q($$3)) {
         csi $$6 = $$0.o();
         dak $$7 = $$0.n();
         if ($$6 instanceof asc) {
            aq.N.a((asc)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awy.lR, awz.e, 1.0F, 1.0F);
         ebq $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(egq.c, $$2, egq.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, byf.d($$0.p()));
         }

         return bvc.a;
      }

      return super.a($$0);
   }
}

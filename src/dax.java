import java.util.List;

public class dax extends czu {
   public dax(czu.a $$0) {
      super($$0);
   }

   public static ddb a() {
      jg<dnc> $$0 = mg.a(mg.e);
      return new ddb(
         List.of(ddb.a.a(jj.a(dne.bz.p()), 15.0F), ddb.a.b($$0.b(axe.Q), 15.0F), ddb.a.b($$0.b(axe.a), 5.0F), ddb.a.b(jj.a(dne.fx.p(), dne.fy.p()), 2.0F)),
         1.0F,
         1,
         true
      );
   }

   @Override
   public bur a(ddt $$0) {
      djx $$1 = $$0.q();
      iv $$2 = $$0.a();
      ebe $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dqv $$5 && !$$5.q($$3)) {
         crx $$6 = $$0.o();
         czy $$7 = $$0.n();
         if ($$6 instanceof art) {
            aq.N.a((art)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awp.lR, awq.e, 1.0F, 1.0F);
         ebe $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(ege.c, $$2, ege.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bxu.d($$0.p()));
         }

         return bur.a;
      }

      return super.a($$0);
   }
}

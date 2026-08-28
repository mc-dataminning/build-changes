import java.util.List;

public class daj extends czg {
   public daj(czg.a $$0) {
      super($$0);
   }

   public static dcn a() {
      jg<dmm> $$0 = mg.a(mg.e);
      return new dcn(
         List.of(dcn.a.a(jj.a(dmo.bz.p()), 15.0F), dcn.a.b($$0.b(axc.Q), 15.0F), dcn.a.b($$0.b(axc.a), 5.0F), dcn.a.b(jj.a(dmo.fx.p(), dmo.fy.p()), 2.0F)),
         1.0F,
         1,
         true
      );
   }

   @Override
   public bug a(ddf $$0) {
      djh $$1 = $$0.q();
      iv $$2 = $$0.a();
      eao $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dqf $$5 && !$$5.q($$3)) {
         crj $$6 = $$0.o();
         czk $$7 = $$0.n();
         if ($$6 instanceof arr) {
            aq.N.a((arr)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awn.lR, awo.e, 1.0F, 1.0F);
         eao $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(efo.c, $$2, efo.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bxj.d($$0.p()));
         }

         return bug.a;
      }

      return super.a($$0);
   }
}

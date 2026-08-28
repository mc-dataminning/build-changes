import java.util.List;

public class czx extends cyu {
   public czx(cyu.a $$0) {
      super($$0);
   }

   public static dcb a() {
      jf<dma> $$0 = mf.a(mf.e);
      return new dcb(
         List.of(dcb.a.a(ji.a(dmc.bz.p()), 15.0F), dcb.a.b($$0.b(axc.Q), 15.0F), dcb.a.b($$0.b(axc.a), 5.0F), dcb.a.b(ji.a(dmc.fu.p(), dmc.fv.p()), 2.0F)),
         1.0F,
         1,
         true
      );
   }

   @Override
   public bub a(dct $$0) {
      div $$1 = $$0.q();
      iu $$2 = $$0.a();
      dzz $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dps $$5 && !$$5.q($$3)) {
         cqy $$6 = $$0.o();
         cyy $$7 = $$0.n();
         if ($$6 instanceof arr) {
            ap.N.a((arr)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awn.lO, awo.e, 1.0F, 1.0F);
         dzz $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(eez.c, $$2, eez.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bxc.d($$0.p()));
         }

         return bub.a;
      }

      return super.a($$0);
   }
}

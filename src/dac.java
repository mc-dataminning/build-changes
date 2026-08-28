import java.util.List;

public class dac extends cyz {
   public dac(cyz.a $$0) {
      super($$0);
   }

   public static dcg a() {
      jf<dmf> $$0 = mf.a(mf.e);
      return new dcg(
         List.of(dcg.a.a(ji.a(dmh.bz.p()), 15.0F), dcg.a.b($$0.b(axc.Q), 15.0F), dcg.a.b($$0.b(axc.a), 5.0F), dcg.a.b(ji.a(dmh.fx.p(), dmh.fy.p()), 2.0F)),
         1.0F,
         1,
         true
      );
   }

   @Override
   public bud a(dcy $$0) {
      dja $$1 = $$0.q();
      iu $$2 = $$0.a();
      eah $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dpy $$5 && !$$5.q($$3)) {
         crc $$6 = $$0.o();
         czd $$7 = $$0.n();
         if ($$6 instanceof arr) {
            ap.N.a((arr)$$6, $$2, $$7);
         }

         $$1.a($$6, $$2, awn.lR, awo.e, 1.0F, 1.0F);
         eah $$8 = $$5.p($$3);
         $$1.b($$2, $$8);
         $$1.a(efh.c, $$2, efh.a.a($$0.o(), $$8));
         if ($$6 != null) {
            $$7.a(1, $$6, bxe.d($$0.p()));
         }

         return bud.a;
      }

      return super.a($$0);
   }
}

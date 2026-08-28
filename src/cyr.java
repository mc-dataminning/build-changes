import java.util.List;

public class cyr extends cxu {
   public cyr(cxu.a $$0) {
      super($$0);
   }

   @Override
   public cxy n() {
      cxy $$0 = super.n();
      $$0.b(kx.R, new czu(czv.a));
      return $$0;
   }

   @Override
   public btq a(dbp $$0) {
      dhp $$1 = $$0.q();
      jj $$2 = $$0.a();
      cqi $$3 = $$0.o();
      cxy $$4 = $$0.n();
      czu $$5 = $$4.a(kx.R, czu.a);
      dym $$6 = $$1.a_($$2);
      if ($$0.k() != jo.a && $$6.a(awz.cm) && $$5.a(czv.a)) {
         $$1.a(null, $$2, awk.kI, awl.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cyb.a($$4, $$3, new cxy(cyc.tl)));
         $$3.b(awu.c.b($$4.h()));
         if (!$$1.C) {
            arn $$7 = (arn)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lv.ap, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awk.cB, awl.e, 1.0F, 1.0F);
         $$1.a(null, edm.z, $$2);
         $$1.b($$2, dkw.to.m());
         return btq.a;
      } else {
         return btq.e;
      }
   }

   @Override
   public wv a(cxy $$0) {
      czu $$1 = $$0.a(kx.R);
      return $$1 != null ? $$1.a(this.m + ".effect.") : super.a($$0);
   }

   @Override
   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
      czu $$4 = $$0.a(kx.R);
      if ($$4 != null) {
         $$4.a($$2::add, $$0.a(kx.S, 1.0F), $$1.b());
      }
   }
}

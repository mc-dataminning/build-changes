import java.util.List;

public class cwr extends cvt {
   public cwr(cvt.a $$0) {
      super($$0);
   }

   @Override
   public cvx o() {
      cvx $$0 = super.o();
      $$0.b(kt.P, new cxw(cxx.a));
      return $$0;
   }

   @Override
   public bry a(czo $$0) {
      dev $$1 = $$0.q();
      jg $$2 = $$0.a();
      coh $$3 = $$0.o();
      cvx $$4 = $$0.n();
      cxw $$5 = $$4.a(kt.P, cxw.a);
      dvd $$6 = $$1.a_($$2);
      if ($$0.k() != jl.a && $$6.a(awz.ck) && $$5.a(cxx.a)) {
         $$1.a(null, $$2, awk.kj, awl.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cwa.a($$4, $$3, new cvx(cwb.sl)));
         $$3.b(awu.c.b($$4.h()));
         if (!$$1.C) {
            arm $$7 = (arm)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lq.am, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awk.cB, awl.e, 1.0F, 1.0F);
         $$1.a(null, eaa.z, $$2);
         $$1.b($$2, dia.sI.m());
         return bry.a;
      } else {
         return bry.e;
      }
   }

   @Override
   public xh c_(cvx $$0) {
      return $$0.a(kt.P, cxw.a).e().map($$0x -> xh.c(this.k + ".effect." + ((cxu)$$0x.a()).b())).orElseGet(() -> xh.c(this.k + ".effect.empty"));
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      cxw $$4 = $$0.a(kt.P);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}

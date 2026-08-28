import java.util.List;

public class cya extends cxd {
   public cya(cxd.a $$0) {
      super($$0);
   }

   @Override
   public cxh n() {
      cxh $$0 = super.n();
      $$0.b(kv.R, new cze(czf.a));
      return $$0;
   }

   @Override
   public bsy a(daz $$0) {
      dgz $$1 = $$0.q();
      ji $$2 = $$0.a();
      cpr $$3 = $$0.o();
      cxh $$4 = $$0.n();
      cze $$5 = $$4.a(kv.R, cze.a);
      dxq $$6 = $$1.a_($$2);
      if ($$0.k() != jn.a && $$6.a(awp.cm) && $$5.a(czf.a)) {
         $$1.a(null, $$2, awa.kI, awb.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cxk.a($$4, $$3, new cxh(cxl.tj)));
         $$3.b(awk.c.b($$4.h()));
         if (!$$1.C) {
            ard $$7 = (ard)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lt.ap, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awa.cB, awb.e, 1.0F, 1.0F);
         $$1.a(null, ecp.z, $$2);
         $$1.b($$2, dkg.tm.m());
         return bsy.a;
      } else {
         return bsy.e;
      }
   }

   @Override
   public wp a(cxh $$0) {
      cze $$1 = $$0.a(kv.R);
      return $$1 != null ? $$1.a(this.m + ".effect.") : super.a($$0);
   }

   @Override
   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
      cze $$4 = $$0.a(kv.R);
      if ($$4 != null) {
         $$4.a($$2::add, $$0.a(kv.S, 1.0F), $$1.b());
      }
   }
}

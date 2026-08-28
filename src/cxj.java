import java.util.List;

public class cxj extends cwl {
   public cxj(cwl.a $$0) {
      super($$0);
   }

   @Override
   public cwp n() {
      cwp $$0 = super.n();
      $$0.b(kv.Q, new cyo(cyp.a));
      return $$0;
   }

   @Override
   public bsj a(dai $$0) {
      dgi $$1 = $$0.q();
      ji $$2 = $$0.a();
      cox $$3 = $$0.o();
      cwp $$4 = $$0.n();
      cyo $$5 = $$4.a(kv.Q, cyo.a);
      dwx $$6 = $$1.a_($$2);
      if ($$0.k() != jn.a && $$6.a(awp.cl) && $$5.a(cyp.a)) {
         $$1.a(null, $$2, awa.kI, awb.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cws.a($$4, $$3, new cwp(cwt.th)));
         $$3.b(awk.c.b($$4.h()));
         if (!$$1.C) {
            arc $$7 = (arc)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lt.ao, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awa.cB, awb.e, 1.0F, 1.0F);
         $$1.a(null, ebt.z, $$2);
         $$1.b($$2, djo.tk.m());
         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   @Override
   public wo a(cwp $$0) {
      cyo $$1 = $$0.a(kv.Q);
      return $$1 != null ? $$1.a(this.l + ".effect.") : super.a($$0);
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wo> $$2, cyh $$3) {
      cyo $$4 = $$0.a(kv.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}

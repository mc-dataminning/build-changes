import java.util.List;

public class cxi extends cwk {
   public cxi(cwk.a $$0) {
      super($$0);
   }

   @Override
   public cwo n() {
      cwo $$0 = super.n();
      $$0.b(kv.Q, new cyn(cyo.a));
      return $$0;
   }

   @Override
   public bsj a(dah $$0) {
      dgh $$1 = $$0.q();
      ji $$2 = $$0.a();
      cow $$3 = $$0.o();
      cwo $$4 = $$0.n();
      cyn $$5 = $$4.a(kv.Q, cyn.a);
      dww $$6 = $$1.a_($$2);
      if ($$0.k() != jn.a && $$6.a(awp.cl) && $$5.a(cyo.a)) {
         $$1.a(null, $$2, awa.kI, awb.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cwr.a($$4, $$3, new cwo(cws.th)));
         $$3.b(awk.c.b($$4.h()));
         if (!$$1.C) {
            ard $$7 = (ard)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lt.ao, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awa.cB, awb.e, 1.0F, 1.0F);
         $$1.a(null, ebs.z, $$2);
         $$1.b($$2, djn.tk.m());
         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   @Override
   public wp a(cwo $$0) {
      cyn $$1 = $$0.a(kv.Q);
      return $$1 != null ? $$1.a(this.l + ".effect.") : super.a($$0);
   }

   @Override
   public void a(cwo $$0, cwk.b $$1, List<wp> $$2, cyg $$3) {
      cyn $$4 = $$0.a(kv.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}

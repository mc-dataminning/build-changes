import java.util.List;

public class cur extends ctv {
   private static final int a = 32;

   public cur(ctv.a $$0) {
      super($$0);
   }

   @Override
   public cua w() {
      cua $$0 = super.w();
      $$0.b(kn.G, new cwb(cwc.a));
      return $$0;
   }

   @Override
   public cua a(cua $$0, dcd $$1, bsy $$2) {
      cmh $$3 = $$2 instanceof cmh ? (cmh)$$2 : null;
      if ($$3 instanceof aql) {
         am.A.a((aql)$$3, $$0);
      }

      if (!$$1.B) {
         cwb $$4 = $$0.a(kn.G, cwb.a);
         $$4.a($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$3, $$3, $$2, $$2x.e(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(avp.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fL()) {
         if ($$0.e()) {
            return new cua(cud.sl);
         }

         if ($$3 != null) {
            $$3.fY().f(new cua(cud.sl));
         }
      }

      $$2.a(dxa.l);
      return $$0;
   }

   @Override
   public bqd a(cxm $$0) {
      dcd $$1 = $$0.q();
      ja $$2 = $$0.a();
      cmh $$3 = $$0.o();
      cua $$4 = $$0.n();
      cwb $$5 = $$4.a(kn.G, cwb.a);
      dsh $$6 = $$1.a_($$2);
      if ($$0.k() != jf.a && $$6.a(avu.ci) && $$5.a(cwc.a)) {
         $$1.a(null, $$2, avf.ki, avg.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cuc.a($$4, $$3, new cua(cud.sl)));
         $$3.b(avp.c.b($$4.g()));
         if (!$$1.B) {
            aqk $$7 = (aqk)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lj.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, avf.cB, avg.e, 1.0F, 1.0F);
         $$1.a(null, dxa.z, $$2);
         $$1.b($$2, dfh.sI.o());
         return bqd.a($$1.B);
      } else {
         return bqd.e;
      }
   }

   @Override
   public int a(cua $$0, bsy $$1) {
      return 32;
   }

   @Override
   public cvv b(cua $$0) {
      return cvv.c;
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      return cuc.a($$0, $$1, $$2);
   }

   @Override
   public String h(cua $$0) {
      return cvz.a($$0.a(kn.G, cwb.a).e(), this.a() + ".effect.");
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      cwb $$4 = $$0.a(kn.G);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}

import java.util.List;

public class cuu extends cty {
   private static final int a = 32;

   public cuu(cty.a $$0) {
      super($$0);
   }

   @Override
   public cud w() {
      cud $$0 = super.w();
      $$0.b(kn.G, new cwe(cwf.a));
      return $$0;
   }

   @Override
   public cud a(cud $$0, dcg $$1, btc $$2) {
      cml $$3 = $$2 instanceof cml ? (cml)$$2 : null;
      if ($$3 instanceof aqn) {
         am.A.a((aqn)$$3, $$0);
      }

      if (!$$1.B) {
         cwe $$4 = $$0.a(kn.G, cwe.a);
         $$4.a($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$3, $$3, $$2, $$2x.e(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(avr.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fN()) {
         if ($$0.e()) {
            return new cud(cug.sl);
         }

         if ($$3 != null) {
            $$3.ga().f(new cud(cug.sl));
         }
      }

      $$2.a(dxh.l);
      return $$0;
   }

   @Override
   public bqh a(cxp $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      cml $$3 = $$0.o();
      cud $$4 = $$0.n();
      cwe $$5 = $$4.a(kn.G, cwe.a);
      dsl $$6 = $$1.a_($$2);
      if ($$0.k() != jf.a && $$6.a(avw.ci) && $$5.a(cwf.a)) {
         $$1.a(null, $$2, avh.ki, avi.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cuf.a($$4, $$3, new cud(cug.sl)));
         $$3.b(avr.c.b($$4.g()));
         if (!$$1.B) {
            aqm $$7 = (aqm)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lj.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, avh.cB, avi.e, 1.0F, 1.0F);
         $$1.a(null, dxh.z, $$2);
         $$1.b($$2, dfk.sI.o());
         return bqh.a($$1.B);
      } else {
         return bqh.e;
      }
   }

   @Override
   public int a(cud $$0, btc $$1) {
      return 32;
   }

   @Override
   public cvy b(cud $$0) {
      return cvy.c;
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      return cuf.a($$0, $$1, $$2);
   }

   @Override
   public String h(cud $$0) {
      return cwc.a($$0.a(kn.G, cwe.a).e(), this.a() + ".effect.");
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      cwe $$4 = $$0.a(kn.G);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}

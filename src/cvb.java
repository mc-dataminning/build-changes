import java.util.List;

public class cvb extends cuf {
   private static final int a = 32;

   public cvb(cuf.a $$0) {
      super($$0);
   }

   @Override
   public cuk w() {
      cuk $$0 = super.w();
      $$0.b(km.F, new cwl(cwm.a));
      return $$0;
   }

   @Override
   public cuk a(cuk $$0, dbt $$1, btk $$2) {
      cms $$3 = $$2 instanceof cms ? (cms)$$2 : null;
      if ($$3 instanceof arc) {
         am.A.a((arc)$$3, $$0);
      }

      if (!$$1.B) {
         cwl $$4 = $$0.a(km.F, cwl.a);
         $$4.a($$2x -> {
            if ($$2x.c().a().a()) {
               $$2x.c().a().a($$3, $$3, $$2, $$2x.e(), 1.0);
            } else {
               $$2.b($$2x);
            }
         });
      }

      if ($$3 != null) {
         $$3.b(awg.c.b(this));
         $$0.a(1, $$3);
      }

      if ($$3 == null || !$$3.fP()) {
         if ($$0.e()) {
            return new cuk(cun.sl);
         }

         if ($$3 != null) {
            $$3.gc().f(new cuk(cun.sl));
         }
      }

      $$2.a(dwq.l);
      return $$0;
   }

   @Override
   public bqp a(cxx $$0) {
      dbt $$1 = $$0.q();
      iz $$2 = $$0.a();
      cms $$3 = $$0.o();
      cuk $$4 = $$0.n();
      cwl $$5 = $$4.a(km.F, cwl.a);
      drx $$6 = $$1.a_($$2);
      if ($$0.k() != je.a && $$6.a(awl.ci) && $$5.a(cwm.a)) {
         $$1.a(null, $$2, avw.ki, avx.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cum.a($$4, $$3, new cuk(cun.sl)));
         $$3.b(awg.c.b($$4.g()));
         if (!$$1.B) {
            arb $$7 = (arb)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lj.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, avw.cB, avx.e, 1.0F, 1.0F);
         $$1.a(null, dwq.z, $$2);
         $$1.b($$2, dew.sI.n());
         return bqp.a($$1.B);
      } else {
         return bqp.e;
      }
   }

   @Override
   public int b(cuk $$0) {
      return 32;
   }

   @Override
   public cwf c(cuk $$0) {
      return cwf.c;
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      return cum.a($$0, $$1, $$2);
   }

   @Override
   public String i(cuk $$0) {
      return cwj.a($$0.a(km.F, cwl.a).e(), this.a() + ".effect.");
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      cwl $$4 = $$0.a(km.F);
      if ($$4 != null) {
         $$4.a($$2::add, 1.0F, $$1.b());
      }
   }
}

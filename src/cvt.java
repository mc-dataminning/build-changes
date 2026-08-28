import java.util.List;

public class cvt extends cwi implements cxh {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cvt(cwi.a $$0) {
      super($$0);
   }

   @Override
   public bsk a(daf $$0) {
      dfm $$1 = $$0.q();
      if ($$1 instanceof arp $$2) {
         cwm $$3 = $$0.n();
         ezy $$4 = $$0.l();
         jm $$5 = $$0.k();
         cpn.a(new cpi($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bsk.a;
   }

   @Override
   public bsk a(dfm $$0, cou $$1, bsj $$2) {
      if ($$1.fH()) {
         cwm $$3 = $$1.b($$2);
         if ($$0 instanceof arp $$4) {
            cpn.a(new cpi($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awx.c.b(this));
         }

         return bsk.a;
      } else {
         return bsk.e;
      }
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      czc $$4 = $$0.a(ku.af);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cpn a(dfm $$0, ka $$1, cwm $$2, jm $$3) {
      return new cpi($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cxh.a b() {
      return cxh.a.a().a(cvt::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static ezy a(ky $$0, jm $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}

import java.util.List;

public class cwr extends cxg implements cyf {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cwr(cxg.a $$0) {
      super($$0);
   }

   @Override
   public bte a(dbd $$0) {
      dha $$1 = $$0.q();
      if ($$1 instanceof ash $$2) {
         cxk $$3 = $$0.n();
         fbs $$4 = $$0.l();
         jm $$5 = $$0.k();
         cql.a(new cqg($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bte.a;
   }

   @Override
   public bte a(dha $$0, cps $$1, btd $$2) {
      if ($$1.fH()) {
         cxk $$3 = $$1.b($$2);
         if ($$0 instanceof ash $$4) {
            cql.a(new cqg($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(axp.c.b(this));
         }

         return bte.a;
      } else {
         return bte.e;
      }
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      daa $$4 = $$0.a(ku.af);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cql a(dha $$0, ka $$1, cxk $$2, jm $$3) {
      return new cqg($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cyf.a b() {
      return cyf.a.a().a(cwr::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static fbs a(ky $$0, jm $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}

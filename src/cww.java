import java.util.List;

public class cww extends cxl implements cyk {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cww(cxl.a $$0) {
      super($$0);
   }

   @Override
   public btj a(dbi $$0) {
      dhi $$1 = $$0.q();
      if ($$1 instanceof ash $$2) {
         cxp $$3 = $$0.n();
         fby $$4 = $$0.l();
         jm $$5 = $$0.k();
         cqq.a(new cql($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return btj.a;
   }

   @Override
   public btj a(dhi $$0, cpx $$1, bti $$2) {
      if ($$1.fJ()) {
         cxp $$3 = $$1.b($$2);
         if ($$0 instanceof ash $$4) {
            cqq.a(new cql($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(axp.c.b(this));
         }

         return btj.a;
      } else {
         return btj.e;
      }
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      daf $$4 = $$0.a(ku.af);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cqq a(dhi $$0, ka $$1, cxp $$2, jm $$3) {
      return new cql($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cyk.a b() {
      return cyk.a.a().a(cww::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static fby a(ky $$0, jm $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}

import java.util.List;

public class cwn extends cxc implements cyb {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cwn(cxc.a $$0) {
      super($$0);
   }

   @Override
   public bta a(daz $$0) {
      dgz $$1 = $$0.q();
      if ($$1 instanceof arx $$2) {
         cxg $$3 = $$0.n();
         fbr $$4 = $$0.l();
         jm $$5 = $$0.k();
         cqh.a(new cqc($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bta.a;
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      if ($$1.fJ()) {
         cxg $$3 = $$1.b($$2);
         if ($$0 instanceof arx $$4) {
            cqh.a(new cqc($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(axf.c.b(this));
         }

         return bta.a;
      } else {
         return bta.e;
      }
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      czw $$4 = $$0.a(ku.af);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cqh a(dgz $$0, ka $$1, cxg $$2, jm $$3) {
      return new cqc($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cyb.a b() {
      return cyb.a.a().a(cwn::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static fbr a(ky $$0, jm $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}

import java.util.List;

public class cwv extends cxk implements cyj {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cwv(cxk.a $$0) {
      super($$0);
   }

   @Override
   public bti a(dbh $$0) {
      dhh $$1 = $$0.q();
      if ($$1 instanceof ash $$2) {
         cxo $$3 = $$0.n();
         fbx $$4 = $$0.l();
         jm $$5 = $$0.k();
         cqp.a(new cqk($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return bti.a;
   }

   @Override
   public bti a(dhh $$0, cpw $$1, bth $$2) {
      if ($$1.fH()) {
         cxo $$3 = $$1.b($$2);
         if ($$0 instanceof ash $$4) {
            cqp.a(new cqk($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(axp.c.b(this));
         }

         return bti.a;
      } else {
         return bti.e;
      }
   }

   @Override
   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
      dae $$4 = $$0.a(ku.af);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cqp a(dhh $$0, ka $$1, cxo $$2, jm $$3) {
      return new cqk($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cyj.a b() {
      return cyj.a.a().a(cwv::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static fbx a(ky $$0, jm $$1) {
      return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
   }
}

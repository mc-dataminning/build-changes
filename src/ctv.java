import java.util.List;

public class ctv extends cul implements cvi {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public ctv(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqv a(cyd $$0) {
      dbz $$1 = $$0.q();
      if (!$$1.B) {
         cuq $$2 = $$0.n();
         evs $$3 = $$0.l();
         je $$4 = $$0.k();
         cnl $$5 = new cnl($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bqv.a($$1.B);
   }

   @Override
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      if ($$1.fE()) {
         cuq $$3 = $$1.b($$2);
         if (!$$0.B) {
            cnl $$4 = new cnl($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(awk.c.b(this));
         }

         return bqw.a($$1.b($$2), $$0.x_());
      } else {
         return bqw.c($$1.b($$2));
      }
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      cxk $$4 = $$0.a(km.U);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cnq a(dbz $$0, js $$1, cuq $$2, je $$3) {
      return new cnl($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cvi.a c() {
      return cvi.a.a().a(ctv::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static evs a(kq $$0, je $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)btb.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)btb.P.m() / 2.0) - (double)btb.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)btb.P.l() / 2.0)
         );
   }
}

import java.util.List;

public class ctv extends cul implements cvm {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public ctv(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqr a(cyf $$0) {
      dcw $$1 = $$0.q();
      if (!$$1.B) {
         cuq $$2 = $$0.n();
         exa $$3 = $$0.l();
         ji $$4 = $$0.k();
         cnk $$5 = new cnk($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bqr.a($$1.B);
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      if ($$1.fB()) {
         cuq $$3 = $$1.b($$2);
         if (!$$0.B) {
            cnk $$4 = new cnk($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(avz.c.b(this));
         }

         return bqs.a($$1.b($$2), $$0.x_());
      } else {
         return bqs.c($$1.b($$2));
      }
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      cxm $$4 = $$0.a(kq.V);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cnp a(dcw $$0, jw $$1, cuq $$2, ji $$3) {
      return new cnk($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cvm.a c() {
      return cvm.a.a().a(ctv::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static exa a(ku $$0, ji $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)bsx.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)bsx.P.m() / 2.0) - (double)bsx.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)bsx.P.l() / 2.0)
         );
   }
}

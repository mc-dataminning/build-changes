import java.util.List;

public class ctf extends ctv implements cus {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public ctf(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqd a(cxm $$0) {
      dcd $$1 = $$0.q();
      if (!$$1.B) {
         cua $$2 = $$0.n();
         evz $$3 = $$0.l();
         jf $$4 = $$0.k();
         cmu $$5 = new cmu($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bqd.a($$1.B);
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      if ($$1.fA()) {
         cua $$3 = $$1.b($$2);
         if (!$$0.B) {
            cmu $$4 = new cmu($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(avp.c.b(this));
         }

         return bqe.a($$1.b($$2), $$0.x_());
      } else {
         return bqe.c($$1.b($$2));
      }
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      cwt $$4 = $$0.a(kn.U);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cmz a(dcd $$0, jt $$1, cua $$2, jf $$3) {
      return new cmu($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cus.a c() {
      return cus.a.a().a(ctf::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static evz a(kr $$0, jf $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)bsj.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)bsj.P.m() / 2.0) - (double)bsj.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)bsj.P.l() / 2.0)
         );
   }
}

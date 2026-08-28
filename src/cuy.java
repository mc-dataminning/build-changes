import java.util.List;

public class cuy extends cvn implements cwn {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final double b = 0.15;

   public cuy(cvn.a $$0) {
      super($$0);
   }

   @Override
   public brs a(czp $$0) {
      dej $$1 = $$0.q();
      if ($$1 instanceof arj $$2) {
         cvs $$3 = $$0.n();
         eyw $$4 = $$0.l();
         jk $$5 = $$0.k();
         cor.a(new col($$1, $$0.o(), $$4.d + (double)$$5.j() * 0.15, $$4.e + (double)$$5.k() * 0.15, $$4.f + (double)$$5.l() * 0.15, $$3), $$2, $$3);
         $$3.h(1);
      }

      return brs.a;
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      if ($$1.fF()) {
         cvs $$3 = $$1.b($$2);
         if ($$0 instanceof arj $$4) {
            cor.a(new col($$0, $$3, $$1), $$4, $$3);
            $$3.a(1, $$1);
            $$1.b(awq.c.b(this));
         }

         return brs.a;
      } else {
         return brs.e;
      }
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      cym $$4 = $$0.a(ks.aa);
      if ($$4 != null) {
         $$4.a($$1, $$2::add, $$3);
      }
   }

   @Override
   public cor a(dej $$0, jy $$1, cvs $$2, jk $$3) {
      return new col($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
   }

   @Override
   public cwn.a c() {
      return cwn.a.a().a(cuy::a).a(1.0F).b(0.5F).a(1004).a();
   }

   private static eyw a(kw $$0, jk $$1) {
      return $$0.a()
         .b(
            (double)$$1.j() * (0.5000099999997474 - (double)bty.P.l() / 2.0),
            (double)$$1.k() * (0.5000099999997474 - (double)bty.P.m() / 2.0) - (double)bty.P.m() / 2.0,
            (double)$$1.l() * (0.5000099999997474 - (double)bty.P.l() / 2.0)
         );
   }
}

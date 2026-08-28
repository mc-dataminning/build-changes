public class bsh {
   public static void a(dgj $$0, ji $$1, bse $$2) {
      a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2);
   }

   public static void a(dgj $$0, bum $$1, bse $$2) {
      a($$0, $$1.dA(), $$1.dC(), $$1.dG(), $$2);
   }

   private static void a(dgj $$0, double $$1, double $$2, double $$3, bse $$4) {
      for (int $$5 = 0; $$5 < $$4.b(); $$5++) {
         a($$0, $$1, $$2, $$3, $$4.a($$5));
      }
   }

   public static void a(dgj $$0, ji $$1, ka<cwq> $$2) {
      $$2.forEach($$2x -> a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2x));
   }

   public static void a(dgj $$0, double $$1, double $$2, double $$3, cwq $$4) {
      double $$5 = (double)but.aq.l();
      double $$6 = 1.0 - $$5;
      double $$7 = $$5 / 2.0;
      double $$8 = Math.floor($$1) + $$0.A.j() * $$6 + $$7;
      double $$9 = Math.floor($$2) + $$0.A.j() * $$6;
      double $$10 = Math.floor($$3) + $$0.A.j() * $$6 + $$7;

      while (!$$4.f()) {
         cld $$11 = new cld($$0, $$8, $$9, $$10, $$4.a($$0.A.a(21) + 10));
         float $$12 = 0.05F;
         $$11.n($$0.A.a(0.0, 0.11485000171139836), $$0.A.a(0.2, 0.11485000171139836), $$0.A.a(0.0, 0.11485000171139836));
         $$0.b($$11);
      }
   }

   public static void a(dwy $$0, dwy $$1, dgj $$2, ji $$3) {
      if (!$$0.a($$1.b())) {
         if ($$2.c_($$3) instanceof bse $$5) {
            a($$2, $$3, $$5);
            $$2.c($$3, $$0.b());
         }
      }
   }
}

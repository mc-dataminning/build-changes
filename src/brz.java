public class brz {
   public static void a(dfb $$0, jh $$1, brw $$2) {
      a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2);
   }

   public static void a(dfb $$0, bue $$1, brw $$2) {
      a($$0, $$1.dC(), $$1.dE(), $$1.dI(), $$2);
   }

   private static void a(dfb $$0, double $$1, double $$2, double $$3, brw $$4) {
      for (int $$5 = 0; $$5 < $$4.b(); $$5++) {
         a($$0, $$1, $$2, $$3, $$4.a($$5));
      }
   }

   public static void a(dfb $$0, jh $$1, jz<cwb> $$2) {
      $$2.forEach($$2x -> a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2x));
   }

   public static void a(dfb $$0, double $$1, double $$2, double $$3, cwb $$4) {
      double $$5 = (double)bul.ag.l();
      double $$6 = 1.0 - $$5;
      double $$7 = $$5 / 2.0;
      double $$8 = Math.floor($$1) + $$0.A.j() * $$6 + $$7;
      double $$9 = Math.floor($$2) + $$0.A.j() * $$6;
      double $$10 = Math.floor($$3) + $$0.A.j() * $$6 + $$7;

      while (!$$4.f()) {
         ckv $$11 = new ckv($$0, $$8, $$9, $$10, $$4.a($$0.A.a(21) + 10));
         float $$12 = 0.05F;
         $$11.n($$0.A.a(0.0, 0.11485000171139836), $$0.A.a(0.2, 0.11485000171139836), $$0.A.a(0.0, 0.11485000171139836));
         $$0.b($$11);
      }
   }

   public static void a(dvj $$0, dvj $$1, dfb $$2, jh $$3) {
      if (!$$0.a($$1.b())) {
         if ($$2.c_($$3) instanceof brw $$5) {
            a($$2, $$3, $$5);
            $$2.c($$3, $$0.b());
         }
      }
   }
}

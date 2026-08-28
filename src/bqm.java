public class bqm {
   public static void a(dcu $$0, jd $$1, bqj $$2) {
      a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2);
   }

   public static void a(dcu $$0, bsq $$1, bqj $$2) {
      a($$0, $$1.dv(), $$1.dx(), $$1.dB(), $$2);
   }

   private static void a(dcu $$0, double $$1, double $$2, double $$3, bqj $$4) {
      for (int $$5 = 0; $$5 < $$4.b(); $$5++) {
         a($$0, $$1, $$2, $$3, $$4.a($$5));
      }
   }

   public static void a(dcu $$0, jd $$1, jv<cuo> $$2) {
      $$2.forEach($$2x -> a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2x));
   }

   public static void a(dcu $$0, double $$1, double $$2, double $$3, cuo $$4) {
      double $$5 = (double)bsw.ag.l();
      double $$6 = 1.0 - $$5;
      double $$7 = $$5 / 2.0;
      double $$8 = Math.floor($$1) + $$0.z.j() * $$6 + $$7;
      double $$9 = Math.floor($$2) + $$0.z.j() * $$6;
      double $$10 = Math.floor($$3) + $$0.z.j() * $$6 + $$7;

      while (!$$4.e()) {
         cjf $$11 = new cjf($$0, $$8, $$9, $$10, $$4.a($$0.z.a(21) + 10));
         float $$12 = 0.05F;
         $$11.n($$0.z.a(0.0, 0.11485000171139836), $$0.z.a(0.2, 0.11485000171139836), $$0.z.a(0.0, 0.11485000171139836));
         $$0.b($$11);
      }
   }

   public static void a(dta $$0, dta $$1, dcu $$2, jd $$3) {
      if (!$$0.a($$1.b())) {
         if ($$2.c_($$3) instanceof bqj $$5) {
            a($$2, $$3, $$5);
            $$2.c($$3, $$0.b());
         }
      }
   }
}

public class buc {
   public static void a(djm $$0, iv $$1, btz $$2) {
      a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2);
   }

   public static void a(djm $$0, bwi $$1, btz $$2) {
      a($$0, $$1.dz(), $$1.dB(), $$1.dF(), $$2);
   }

   private static void a(djm $$0, double $$1, double $$2, double $$3, btz $$4) {
      for (int $$5 = 0; $$5 < $$4.b(); $$5++) {
         a($$0, $$1, $$2, $$3, $$4.a($$5));
      }
   }

   public static void a(djm $$0, iv $$1, jo<czn> $$2) {
      $$2.forEach($$2x -> a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2x));
   }

   public static void a(djm $$0, double $$1, double $$2, double $$3, czn $$4) {
      double $$5 = (double)bwr.aq.l();
      double $$6 = 1.0 - $$5;
      double $$7 = $$5 / 2.0;
      double $$8 = Math.floor($$1) + $$0.A.j() * $$6 + $$7;
      double $$9 = Math.floor($$2) + $$0.A.j() * $$6;
      double $$10 = Math.floor($$3) + $$0.A.j() * $$6 + $$7;

      while (!$$4.f()) {
         cnr $$11 = new cnr($$0, $$8, $$9, $$10, $$4.a($$0.A.a(21) + 10));
         float $$12 = 0.05F;
         $$11.n($$0.A.a(0.0, 0.11485000171139836), $$0.A.a(0.2, 0.11485000171139836), $$0.A.a(0.0, 0.11485000171139836));
         $$0.b($$11);
      }
   }

   public static void a(eat $$0, djm $$1, iv $$2) {
      $$1.b($$2, $$0.b());
   }
}

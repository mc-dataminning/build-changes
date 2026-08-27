public class bpw {
   public static void a(dca $$0, ir $$1, bpt $$2) {
      a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2);
   }

   public static void a(dca $$0, brv $$1, bpt $$2) {
      a($$0, $$1.dz(), $$1.dB(), $$1.dF(), $$2);
   }

   private static void a(dca $$0, double $$1, double $$2, double $$3, bpt $$4) {
      for (int $$5 = 0; $$5 < $$4.b(); $$5++) {
         a($$0, $$1, $$2, $$3, $$4.a($$5));
      }
   }

   public static void a(dca $$0, ir $$1, jj<cuh> $$2) {
      $$2.forEach($$2x -> a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2x));
   }

   public static void a(dca $$0, double $$1, double $$2, double $$3, cuh $$4) {
      double $$5 = (double)bsb.ai.k();
      double $$6 = 1.0 - $$5;
      double $$7 = $$5 / 2.0;
      double $$8 = Math.floor($$1) + $$0.A.j() * $$6 + $$7;
      double $$9 = Math.floor($$2) + $$0.A.j() * $$6;
      double $$10 = Math.floor($$3) + $$0.A.j() * $$6 + $$7;

      while (!$$4.d()) {
         cig $$11 = new cig($$0, $$8, $$9, $$10, $$4.a($$0.A.a(21) + 10));
         float $$12 = 0.05F;
         $$11.o($$0.A.a(0.0, 0.11485000171139836), $$0.A.a(0.2, 0.11485000171139836), $$0.A.a(0.0, 0.11485000171139836));
         $$0.b($$11);
      }
   }

   public static void a(dtc $$0, dtc $$1, dca $$2, ir $$3) {
      if (!$$0.a($$1.b())) {
         if ($$2.c_($$3) instanceof bpt $$5) {
            a($$2, $$3, $$5);
            $$2.c($$3, $$0.b());
         }
      }
   }
}

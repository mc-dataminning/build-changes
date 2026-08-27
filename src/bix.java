public class bix {
   public static void a(csf $$0, hx $$1, biu $$2) {
      a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2);
   }

   public static void a(csf $$0, bkv $$1, biu $$2) {
      a($$0, $$1.ds(), $$1.du(), $$1.dy(), $$2);
   }

   private static void a(csf $$0, double $$1, double $$2, double $$3, biu $$4) {
      for (int $$5 = 0; $$5 < $$4.b(); $$5++) {
         a($$0, $$1, $$2, $$3, $$4.a($$5));
      }
   }

   public static void a(csf $$0, hx $$1, ip<clo> $$2) {
      $$2.forEach($$2x -> a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2x));
   }

   public static void a(csf $$0, double $$1, double $$2, double $$3, clo $$4) {
      double $$5 = (double)bkz.ad.k();
      double $$6 = 1.0 - $$5;
      double $$7 = $$5 / 2.0;
      double $$8 = Math.floor($$1) + $$0.z.j() * $$6 + $$7;
      double $$9 = Math.floor($$2) + $$0.z.j() * $$6;
      double $$10 = Math.floor($$3) + $$0.z.j() * $$6 + $$7;

      while (!$$4.b()) {
         cas $$11 = new cas($$0, $$8, $$9, $$10, $$4.a($$0.z.a(21) + 10));
         float $$12 = 0.05F;
         $$11.o($$0.z.a(0.0, 0.11485000171139836), $$0.z.a(0.2, 0.11485000171139836), $$0.z.a(0.0, 0.11485000171139836));
         $$0.b($$11);
      }
   }

   public static void a(dhn $$0, dhn $$1, csf $$2, hx $$3) {
      if (!$$0.a($$1.b())) {
         if ($$2.c_($$3) instanceof biu $$5) {
            a($$2, $$3, $$5);
            $$2.c($$3, $$0.b());
         }
      }
   }
}

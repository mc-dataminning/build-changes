public class axn {
   private static final int a = 2;
   private static final int b = 6;
   private static final double[] c = new double[]{0.0, 1.0, 4.0, 6.0, 4.0, 1.0, 0.0};

   private axn() {
   }

   public static ewu a(ewu $$0, axn.a $$1) {
      int $$2 = aym.a($$0.a());
      int $$3 = aym.a($$0.b());
      int $$4 = aym.a($$0.c());
      double $$5 = $$0.a() - (double)$$2;
      double $$6 = $$0.b() - (double)$$3;
      double $$7 = $$0.c() - (double)$$4;
      double $$8 = 0.0;
      ewu $$9 = ewu.b;

      for (int $$10 = 0; $$10 < 6; $$10++) {
         double $$11 = aym.d($$5, c[$$10 + 1], c[$$10]);
         int $$12 = $$2 - 2 + $$10;

         for (int $$13 = 0; $$13 < 6; $$13++) {
            double $$14 = aym.d($$6, c[$$13 + 1], c[$$13]);
            int $$15 = $$3 - 2 + $$13;

            for (int $$16 = 0; $$16 < 6; $$16++) {
               double $$17 = aym.d($$7, c[$$16 + 1], c[$$16]);
               int $$18 = $$4 - 2 + $$16;
               double $$19 = $$11 * $$14 * $$17;
               $$8 += $$19;
               $$9 = $$9.e($$1.fetch($$12, $$15, $$18).a($$19));
            }
         }
      }

      return $$9.a(1.0 / $$8);
   }

   @FunctionalInterface
   public interface a {
      ewu fetch(int var1, int var2, int var3);
   }
}

public class exg {
   protected static final int[][] a = new int[][]{
      {1, 1, 0},
      {-1, 1, 0},
      {1, -1, 0},
      {-1, -1, 0},
      {1, 0, 1},
      {-1, 0, 1},
      {1, 0, -1},
      {-1, 0, -1},
      {0, 1, 1},
      {0, -1, 1},
      {0, 1, -1},
      {0, -1, -1},
      {1, 1, 0},
      {0, -1, 1},
      {-1, 1, 0},
      {0, -1, -1}
   };
   private static final double e = Math.sqrt(3.0);
   private static final double f = 0.5 * (e - 1.0);
   private static final double g = (3.0 - e) / 6.0;
   private final int[] h = new int[512];
   public final double b;
   public final double c;
   public final double d;

   public exg(bai $$0) {
      this.b = $$0.j() * 256.0;
      this.c = $$0.j() * 256.0;
      this.d = $$0.j() * 256.0;
      int $$1 = 0;

      while ($$1 < 256) {
         this.h[$$1] = $$1++;
      }

      for (int $$2 = 0; $$2 < 256; $$2++) {
         int $$3 = $$0.a(256 - $$2);
         int $$4 = this.h[$$2];
         this.h[$$2] = this.h[$$3 + $$2];
         this.h[$$3 + $$2] = $$4;
      }
   }

   private int a(int $$0) {
      return this.h[$$0 & 0xFF];
   }

   protected static double a(int[] $$0, double $$1, double $$2, double $$3) {
      return (double)$$0[0] * $$1 + (double)$$0[1] * $$2 + (double)$$0[2] * $$3;
   }

   private double a(int $$0, double $$1, double $$2, double $$3, double $$4) {
      double $$5 = $$4 - $$1 * $$1 - $$2 * $$2 - $$3 * $$3;
      double $$6;
      if ($$5 < 0.0) {
         $$6 = 0.0;
      } else {
         $$5 *= $$5;
         $$6 = $$5 * $$5 * a(a[$$0], $$1, $$2, $$3);
      }

      return $$6;
   }

   public double a(double $$0, double $$1) {
      double $$2 = ($$0 + $$1) * f;
      int $$3 = azz.a($$0 + $$2);
      int $$4 = azz.a($$1 + $$2);
      double $$5 = (double)($$3 + $$4) * g;
      double $$6 = (double)$$3 - $$5;
      double $$7 = (double)$$4 - $$5;
      double $$8 = $$0 - $$6;
      double $$9 = $$1 - $$7;
      int $$10;
      int $$11;
      if ($$8 > $$9) {
         $$10 = 1;
         $$11 = 0;
      } else {
         $$10 = 0;
         $$11 = 1;
      }

      double $$14 = $$8 - (double)$$10 + g;
      double $$15 = $$9 - (double)$$11 + g;
      double $$16 = $$8 - 1.0 + 2.0 * g;
      double $$17 = $$9 - 1.0 + 2.0 * g;
      int $$18 = $$3 & 0xFF;
      int $$19 = $$4 & 0xFF;
      int $$20 = this.a($$18 + this.a($$19)) % 12;
      int $$21 = this.a($$18 + $$10 + this.a($$19 + $$11)) % 12;
      int $$22 = this.a($$18 + 1 + this.a($$19 + 1)) % 12;
      double $$23 = this.a($$20, $$8, $$9, 0.0, 0.5);
      double $$24 = this.a($$21, $$14, $$15, 0.0, 0.5);
      double $$25 = this.a($$22, $$16, $$17, 0.0, 0.5);
      return 70.0 * ($$23 + $$24 + $$25);
   }

   public double a(double $$0, double $$1, double $$2) {
      double $$3 = 0.3333333333333333;
      double $$4 = ($$0 + $$1 + $$2) * 0.3333333333333333;
      int $$5 = azz.a($$0 + $$4);
      int $$6 = azz.a($$1 + $$4);
      int $$7 = azz.a($$2 + $$4);
      double $$8 = 0.16666666666666666;
      double $$9 = (double)($$5 + $$6 + $$7) * 0.16666666666666666;
      double $$10 = (double)$$5 - $$9;
      double $$11 = (double)$$6 - $$9;
      double $$12 = (double)$$7 - $$9;
      double $$13 = $$0 - $$10;
      double $$14 = $$1 - $$11;
      double $$15 = $$2 - $$12;
      int $$16;
      int $$17;
      int $$18;
      int $$19;
      int $$20;
      int $$21;
      if ($$13 >= $$14) {
         if ($$14 >= $$15) {
            $$16 = 1;
            $$17 = 0;
            $$18 = 0;
            $$19 = 1;
            $$20 = 1;
            $$21 = 0;
         } else if ($$13 >= $$15) {
            $$16 = 1;
            $$17 = 0;
            $$18 = 0;
            $$19 = 1;
            $$20 = 0;
            $$21 = 1;
         } else {
            $$16 = 0;
            $$17 = 0;
            $$18 = 1;
            $$19 = 1;
            $$20 = 0;
            $$21 = 1;
         }
      } else if ($$14 < $$15) {
         $$16 = 0;
         $$17 = 0;
         $$18 = 1;
         $$19 = 0;
         $$20 = 1;
         $$21 = 1;
      } else if ($$13 < $$15) {
         $$16 = 0;
         $$17 = 1;
         $$18 = 0;
         $$19 = 0;
         $$20 = 1;
         $$21 = 1;
      } else {
         $$16 = 0;
         $$17 = 1;
         $$18 = 0;
         $$19 = 1;
         $$20 = 1;
         $$21 = 0;
      }

      double $$52 = $$13 - (double)$$16 + 0.16666666666666666;
      double $$53 = $$14 - (double)$$17 + 0.16666666666666666;
      double $$54 = $$15 - (double)$$18 + 0.16666666666666666;
      double $$55 = $$13 - (double)$$19 + 0.3333333333333333;
      double $$56 = $$14 - (double)$$20 + 0.3333333333333333;
      double $$57 = $$15 - (double)$$21 + 0.3333333333333333;
      double $$58 = $$13 - 1.0 + 0.5;
      double $$59 = $$14 - 1.0 + 0.5;
      double $$60 = $$15 - 1.0 + 0.5;
      int $$61 = $$5 & 0xFF;
      int $$62 = $$6 & 0xFF;
      int $$63 = $$7 & 0xFF;
      int $$64 = this.a($$61 + this.a($$62 + this.a($$63))) % 12;
      int $$65 = this.a($$61 + $$16 + this.a($$62 + $$17 + this.a($$63 + $$18))) % 12;
      int $$66 = this.a($$61 + $$19 + this.a($$62 + $$20 + this.a($$63 + $$21))) % 12;
      int $$67 = this.a($$61 + 1 + this.a($$62 + 1 + this.a($$63 + 1))) % 12;
      double $$68 = this.a($$64, $$13, $$14, $$15, 0.6);
      double $$69 = this.a($$65, $$52, $$53, $$54, 0.6);
      double $$70 = this.a($$66, $$55, $$56, $$57, 0.6);
      double $$71 = this.a($$67, $$58, $$59, $$60, 0.6);
      return 32.0 * ($$68 + $$69 + $$70 + $$71);
   }
}

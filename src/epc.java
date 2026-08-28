import com.google.common.annotations.VisibleForTesting;

public final class epc {
   private static final float d = 1.0E-7F;
   private final byte[] e;
   public final double a;
   public final double b;
   public final double c;

   public epc(azk $$0) {
      this.a = $$0.j() * 256.0;
      this.b = $$0.j() * 256.0;
      this.c = $$0.j() * 256.0;
      this.e = new byte[256];

      for (int $$1 = 0; $$1 < 256; $$1++) {
         this.e[$$1] = (byte)$$1;
      }

      for (int $$2 = 0; $$2 < 256; $$2++) {
         int $$3 = $$0.a(256 - $$2);
         byte $$4 = this.e[$$2];
         this.e[$$2] = this.e[$$2 + $$3];
         this.e[$$2 + $$3] = $$4;
      }
   }

   public double a(double $$0, double $$1, double $$2) {
      return this.a($$0, $$1, $$2, 0.0, 0.0);
   }

   @Deprecated
   public double a(double $$0, double $$1, double $$2, double $$3, double $$4) {
      double $$5 = $$0 + this.a;
      double $$6 = $$1 + this.b;
      double $$7 = $$2 + this.c;
      int $$8 = azc.a($$5);
      int $$9 = azc.a($$6);
      int $$10 = azc.a($$7);
      double $$11 = $$5 - (double)$$8;
      double $$12 = $$6 - (double)$$9;
      double $$13 = $$7 - (double)$$10;
      double $$16;
      if ($$3 != 0.0) {
         double $$14;
         if ($$4 >= 0.0 && $$4 < $$12) {
            $$14 = $$4;
         } else {
            $$14 = $$12;
         }

         $$16 = (double)azc.a($$14 / $$3 + 1.0E-7F) * $$3;
      } else {
         $$16 = 0.0;
      }

      return this.a($$8, $$9, $$10, $$11, $$12 - $$16, $$13, $$12);
   }

   public double a(double $$0, double $$1, double $$2, double[] $$3) {
      double $$4 = $$0 + this.a;
      double $$5 = $$1 + this.b;
      double $$6 = $$2 + this.c;
      int $$7 = azc.a($$4);
      int $$8 = azc.a($$5);
      int $$9 = azc.a($$6);
      double $$10 = $$4 - (double)$$7;
      double $$11 = $$5 - (double)$$8;
      double $$12 = $$6 - (double)$$9;
      return this.a($$7, $$8, $$9, $$10, $$11, $$12, $$3);
   }

   private static double a(int $$0, double $$1, double $$2, double $$3) {
      return eph.a(eph.a[$$0 & 15], $$1, $$2, $$3);
   }

   private int a(int $$0) {
      return this.e[$$0 & 0xFF] & 0xFF;
   }

   private double a(int $$0, int $$1, int $$2, double $$3, double $$4, double $$5, double $$6) {
      int $$7 = this.a($$0);
      int $$8 = this.a($$0 + 1);
      int $$9 = this.a($$7 + $$1);
      int $$10 = this.a($$7 + $$1 + 1);
      int $$11 = this.a($$8 + $$1);
      int $$12 = this.a($$8 + $$1 + 1);
      double $$13 = a(this.a($$9 + $$2), $$3, $$4, $$5);
      double $$14 = a(this.a($$11 + $$2), $$3 - 1.0, $$4, $$5);
      double $$15 = a(this.a($$10 + $$2), $$3, $$4 - 1.0, $$5);
      double $$16 = a(this.a($$12 + $$2), $$3 - 1.0, $$4 - 1.0, $$5);
      double $$17 = a(this.a($$9 + $$2 + 1), $$3, $$4, $$5 - 1.0);
      double $$18 = a(this.a($$11 + $$2 + 1), $$3 - 1.0, $$4, $$5 - 1.0);
      double $$19 = a(this.a($$10 + $$2 + 1), $$3, $$4 - 1.0, $$5 - 1.0);
      double $$20 = a(this.a($$12 + $$2 + 1), $$3 - 1.0, $$4 - 1.0, $$5 - 1.0);
      double $$21 = azc.h($$3);
      double $$22 = azc.h($$6);
      double $$23 = azc.h($$5);
      return azc.a($$21, $$22, $$23, $$13, $$14, $$15, $$16, $$17, $$18, $$19, $$20);
   }

   private double a(int $$0, int $$1, int $$2, double $$3, double $$4, double $$5, double[] $$6) {
      int $$7 = this.a($$0);
      int $$8 = this.a($$0 + 1);
      int $$9 = this.a($$7 + $$1);
      int $$10 = this.a($$7 + $$1 + 1);
      int $$11 = this.a($$8 + $$1);
      int $$12 = this.a($$8 + $$1 + 1);
      int $$13 = this.a($$9 + $$2);
      int $$14 = this.a($$11 + $$2);
      int $$15 = this.a($$10 + $$2);
      int $$16 = this.a($$12 + $$2);
      int $$17 = this.a($$9 + $$2 + 1);
      int $$18 = this.a($$11 + $$2 + 1);
      int $$19 = this.a($$10 + $$2 + 1);
      int $$20 = this.a($$12 + $$2 + 1);
      int[] $$21 = eph.a[$$13 & 15];
      int[] $$22 = eph.a[$$14 & 15];
      int[] $$23 = eph.a[$$15 & 15];
      int[] $$24 = eph.a[$$16 & 15];
      int[] $$25 = eph.a[$$17 & 15];
      int[] $$26 = eph.a[$$18 & 15];
      int[] $$27 = eph.a[$$19 & 15];
      int[] $$28 = eph.a[$$20 & 15];
      double $$29 = eph.a($$21, $$3, $$4, $$5);
      double $$30 = eph.a($$22, $$3 - 1.0, $$4, $$5);
      double $$31 = eph.a($$23, $$3, $$4 - 1.0, $$5);
      double $$32 = eph.a($$24, $$3 - 1.0, $$4 - 1.0, $$5);
      double $$33 = eph.a($$25, $$3, $$4, $$5 - 1.0);
      double $$34 = eph.a($$26, $$3 - 1.0, $$4, $$5 - 1.0);
      double $$35 = eph.a($$27, $$3, $$4 - 1.0, $$5 - 1.0);
      double $$36 = eph.a($$28, $$3 - 1.0, $$4 - 1.0, $$5 - 1.0);
      double $$37 = azc.h($$3);
      double $$38 = azc.h($$4);
      double $$39 = azc.h($$5);
      double $$40 = azc.a(
         $$37,
         $$38,
         $$39,
         (double)$$21[0],
         (double)$$22[0],
         (double)$$23[0],
         (double)$$24[0],
         (double)$$25[0],
         (double)$$26[0],
         (double)$$27[0],
         (double)$$28[0]
      );
      double $$41 = azc.a(
         $$37,
         $$38,
         $$39,
         (double)$$21[1],
         (double)$$22[1],
         (double)$$23[1],
         (double)$$24[1],
         (double)$$25[1],
         (double)$$26[1],
         (double)$$27[1],
         (double)$$28[1]
      );
      double $$42 = azc.a(
         $$37,
         $$38,
         $$39,
         (double)$$21[2],
         (double)$$22[2],
         (double)$$23[2],
         (double)$$24[2],
         (double)$$25[2],
         (double)$$26[2],
         (double)$$27[2],
         (double)$$28[2]
      );
      double $$43 = azc.a($$38, $$39, $$30 - $$29, $$32 - $$31, $$34 - $$33, $$36 - $$35);
      double $$44 = azc.a($$39, $$37, $$31 - $$29, $$35 - $$33, $$32 - $$30, $$36 - $$34);
      double $$45 = azc.a($$37, $$38, $$33 - $$29, $$34 - $$30, $$35 - $$31, $$36 - $$32);
      double $$46 = azc.i($$3);
      double $$47 = azc.i($$4);
      double $$48 = azc.i($$5);
      double $$49 = $$40 + $$46 * $$43;
      double $$50 = $$41 + $$47 * $$44;
      double $$51 = $$42 + $$48 * $$45;
      $$6[0] += $$49;
      $$6[1] += $$50;
      $$6[2] += $$51;
      return azc.a($$37, $$38, $$39, $$29, $$30, $$31, $$32, $$33, $$34, $$35, $$36);
   }

   @VisibleForTesting
   public void a(StringBuilder $$0) {
      epd.a($$0, this.a, this.b, this.c, this.e);
   }
}

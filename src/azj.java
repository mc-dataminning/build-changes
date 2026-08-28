import java.util.function.Supplier;

public class azj {
   public static void a(dej $$0, jf $$1, lm $$2, bqx $$3) {
      for (jk $$4 : jk.values()) {
         a($$0, $$1, $$2, $$3, $$4, () -> a($$0.z), 0.55);
      }
   }

   public static void a(dej $$0, jf $$1, lm $$2, bqx $$3, jk $$4, Supplier<eyw> $$5, double $$6) {
      int $$7 = $$3.a($$0.z);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         a($$0, $$1, $$4, $$2, $$5.get(), $$6);
      }
   }

   private static eyw a(azn $$0) {
      return new eyw(azf.a($$0, -0.5, 0.5), azf.a($$0, -0.5, 0.5), azf.a($$0, -0.5, 0.5));
   }

   public static void a(jk.a $$0, dej $$1, jf $$2, double $$3, lm $$4, brd $$5) {
      eyw $$6 = eyw.b($$2);
      boolean $$7 = $$0 == jk.a.a;
      boolean $$8 = $$0 == jk.a.b;
      boolean $$9 = $$0 == jk.a.c;
      int $$10 = $$5.a($$1.z);

      for (int $$11 = 0; $$11 < $$10; $$11++) {
         double $$12 = $$6.d + azf.a($$1.z, -1.0, 1.0) * ($$7 ? 0.5 : $$3);
         double $$13 = $$6.e + azf.a($$1.z, -1.0, 1.0) * ($$8 ? 0.5 : $$3);
         double $$14 = $$6.f + azf.a($$1.z, -1.0, 1.0) * ($$9 ? 0.5 : $$3);
         double $$15 = $$7 ? azf.a($$1.z, -1.0, 1.0) : 0.0;
         double $$16 = $$8 ? azf.a($$1.z, -1.0, 1.0) : 0.0;
         double $$17 = $$9 ? azf.a($$1.z, -1.0, 1.0) : 0.0;
         $$1.a($$4, $$12, $$13, $$14, $$15, $$16, $$17);
      }
   }

   public static void a(dej $$0, jf $$1, jk $$2, lm $$3, eyw $$4, double $$5) {
      eyw $$6 = eyw.b($$1);
      int $$7 = $$2.j();
      int $$8 = $$2.k();
      int $$9 = $$2.l();
      double $$10 = $$6.d + ($$7 == 0 ? azf.a($$0.z, -0.5, 0.5) : (double)$$7 * $$5);
      double $$11 = $$6.e + ($$8 == 0 ? azf.a($$0.z, -0.5, 0.5) : (double)$$8 * $$5);
      double $$12 = $$6.f + ($$9 == 0 ? azf.a($$0.z, -0.5, 0.5) : (double)$$9 * $$5);
      double $$13 = $$7 == 0 ? $$4.a() : 0.0;
      double $$14 = $$8 == 0 ? $$4.b() : 0.0;
      double $$15 = $$9 == 0 ? $$4.c() : 0.0;
      $$0.a($$3, $$10, $$11, $$12, $$13, $$14, $$15);
   }

   public static void a(dej $$0, jf $$1, azn $$2, lm $$3) {
      double $$4 = (double)$$1.u() + $$2.j();
      double $$5 = (double)$$1.v() - 0.05;
      double $$6 = (double)$$1.w() + $$2.j();
      $$0.a($$3, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   public static void a(dek $$0, jf $$1, int $$2, lm $$3) {
      double $$4 = 0.5;
      dus $$5 = $$0.a_($$1);
      double $$6 = $$5.l() ? 1.0 : $$5.f($$0, $$1).c(jk.a.b);
      a($$0, $$1, $$2, 0.5, $$6, true, $$3);
   }

   public static void a(dek $$0, jf $$1, int $$2, double $$3, double $$4, boolean $$5, lm $$6) {
      azn $$7 = $$0.D_();

      for (int $$8 = 0; $$8 < $$2; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         double $$12 = 0.5 - $$3;
         double $$13 = (double)$$1.u() + $$12 + $$7.j() * $$3 * 2.0;
         double $$14 = (double)$$1.v() + $$7.j() * $$4;
         double $$15 = (double)$$1.w() + $$12 + $$7.j() * $$3 * 2.0;
         if ($$5 || !$$0.a_(jf.a($$13, $$14, $$15).e()).l()) {
            $$0.a($$6, $$13, $$14, $$15, $$9, $$10, $$11);
         }
      }
   }

   public static void a(dek $$0, jf $$1, int $$2) {
      eyw $$3 = $$1.b().b(0.0, 0.5, 0.0);
      lg $$4 = new lg(lo.bb, $$0.a_($$1));

      for (int $$5 = 0; (float)$$5 < (float)$$2 / 3.0F; $$5++) {
         double $$6 = $$3.d + $$0.D_().k() / 2.0;
         double $$7 = $$3.e;
         double $$8 = $$3.f + $$0.D_().k() / 2.0;
         double $$9 = $$0.D_().k() * 0.2F;
         double $$10 = $$0.D_().k() * 0.2F;
         double $$11 = $$0.D_().k() * 0.2F;
         $$0.a($$4, $$6, $$7, $$8, $$9, $$10, $$11);
      }

      for (int $$12 = 0; (float)$$12 < (float)$$2 / 1.5F; $$12++) {
         double $$13 = $$3.d + 3.5 * Math.cos((double)$$12) + $$0.D_().k() / 2.0;
         double $$14 = $$3.e;
         double $$15 = $$3.f + 3.5 * Math.sin((double)$$12) + $$0.D_().k() / 2.0;
         double $$16 = $$0.D_().k() * 0.05F;
         double $$17 = $$0.D_().k() * 0.05F;
         double $$18 = $$0.D_().k() * 0.05F;
         $$0.a($$4, $$13, $$14, $$15, $$16, $$17, $$18);
      }
   }
}

import java.util.function.Supplier;

public class awz {
   public static void a(cxb $$0, ib $$1, ka $$2, bmi $$3) {
      for (ih $$4 : ih.values()) {
         a($$0, $$1, $$2, $$3, $$4, () -> a($$0.z), 0.55);
      }
   }

   public static void a(cxb $$0, ib $$1, ka $$2, bmi $$3, ih $$4, Supplier<ept> $$5, double $$6) {
      int $$7 = $$3.a($$0.z);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         a($$0, $$1, $$4, $$2, $$5.get(), $$6);
      }
   }

   private static ept a(axd $$0) {
      return new ept(aww.a($$0, -0.5, 0.5), aww.a($$0, -0.5, 0.5), aww.a($$0, -0.5, 0.5));
   }

   public static void a(ih.a $$0, cxb $$1, ib $$2, double $$3, ka $$4, bmo $$5) {
      ept $$6 = ept.b($$2);
      boolean $$7 = $$0 == ih.a.a;
      boolean $$8 = $$0 == ih.a.b;
      boolean $$9 = $$0 == ih.a.c;
      int $$10 = $$5.a($$1.z);

      for (int $$11 = 0; $$11 < $$10; $$11++) {
         double $$12 = $$6.c + aww.a($$1.z, -1.0, 1.0) * ($$7 ? 0.5 : $$3);
         double $$13 = $$6.d + aww.a($$1.z, -1.0, 1.0) * ($$8 ? 0.5 : $$3);
         double $$14 = $$6.e + aww.a($$1.z, -1.0, 1.0) * ($$9 ? 0.5 : $$3);
         double $$15 = $$7 ? aww.a($$1.z, -1.0, 1.0) : 0.0;
         double $$16 = $$8 ? aww.a($$1.z, -1.0, 1.0) : 0.0;
         double $$17 = $$9 ? aww.a($$1.z, -1.0, 1.0) : 0.0;
         $$1.a($$4, $$12, $$13, $$14, $$15, $$16, $$17);
      }
   }

   public static void a(cxb $$0, ib $$1, ih $$2, ka $$3, ept $$4, double $$5) {
      ept $$6 = ept.b($$1);
      int $$7 = $$2.j();
      int $$8 = $$2.k();
      int $$9 = $$2.l();
      double $$10 = $$6.c + ($$7 == 0 ? aww.a($$0.z, -0.5, 0.5) : (double)$$7 * $$5);
      double $$11 = $$6.d + ($$8 == 0 ? aww.a($$0.z, -0.5, 0.5) : (double)$$8 * $$5);
      double $$12 = $$6.e + ($$9 == 0 ? aww.a($$0.z, -0.5, 0.5) : (double)$$9 * $$5);
      double $$13 = $$7 == 0 ? $$4.a() : 0.0;
      double $$14 = $$8 == 0 ? $$4.b() : 0.0;
      double $$15 = $$9 == 0 ? $$4.c() : 0.0;
      $$0.a($$3, $$10, $$11, $$12, $$13, $$14, $$15);
   }

   public static void a(cxb $$0, ib $$1, axd $$2, ka $$3) {
      double $$4 = (double)$$1.u() + $$2.j();
      double $$5 = (double)$$1.v() - 0.05;
      double $$6 = (double)$$1.w() + $$2.j();
      $$0.a($$3, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   public static void a(cxc $$0, ib $$1, int $$2, ka $$3) {
      double $$4 = 0.5;
      dnb $$5 = $$0.a_($$1);
      double $$6 = $$5.i() ? 1.0 : $$5.j($$0, $$1).c(ih.a.b);
      a($$0, $$1, $$2, 0.5, $$6, true, $$3);
   }

   public static void a(cxc $$0, ib $$1, int $$2, double $$3, double $$4, boolean $$5, ka $$6) {
      axd $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < $$2; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         double $$12 = 0.5 - $$3;
         double $$13 = (double)$$1.u() + $$12 + $$7.j() * $$3 * 2.0;
         double $$14 = (double)$$1.v() + $$7.j() * $$4;
         double $$15 = (double)$$1.w() + $$12 + $$7.j() * $$3 * 2.0;
         if ($$5 || !$$0.a_(ib.a($$13, $$14, $$15).d()).i()) {
            $$0.a($$6, $$13, $$14, $$15, $$9, $$10, $$11);
         }
      }
   }
}

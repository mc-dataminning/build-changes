import java.util.function.Supplier;

public class awk {
   public static void a(cvn $$0, hz $$1, jx $$2, bkz $$3) {
      for (ie $$4 : ie.values()) {
         a($$0, $$1, $$2, $$3, $$4, () -> a($$0.z), 0.55);
      }
   }

   public static void a(cvn $$0, hz $$1, jx $$2, bkz $$3, ie $$4, Supplier<ens> $$5, double $$6) {
      int $$7 = $$3.a($$0.z);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         a($$0, $$1, $$4, $$2, $$5.get(), $$6);
      }
   }

   private static ens a(awo $$0) {
      return new ens(awh.a($$0, -0.5, 0.5), awh.a($$0, -0.5, 0.5), awh.a($$0, -0.5, 0.5));
   }

   public static void a(ie.a $$0, cvn $$1, hz $$2, double $$3, jx $$4, blf $$5) {
      ens $$6 = ens.b($$2);
      boolean $$7 = $$0 == ie.a.a;
      boolean $$8 = $$0 == ie.a.b;
      boolean $$9 = $$0 == ie.a.c;
      int $$10 = $$5.a($$1.z);

      for (int $$11 = 0; $$11 < $$10; $$11++) {
         double $$12 = $$6.c + awh.a($$1.z, -1.0, 1.0) * ($$7 ? 0.5 : $$3);
         double $$13 = $$6.d + awh.a($$1.z, -1.0, 1.0) * ($$8 ? 0.5 : $$3);
         double $$14 = $$6.e + awh.a($$1.z, -1.0, 1.0) * ($$9 ? 0.5 : $$3);
         double $$15 = $$7 ? awh.a($$1.z, -1.0, 1.0) : 0.0;
         double $$16 = $$8 ? awh.a($$1.z, -1.0, 1.0) : 0.0;
         double $$17 = $$9 ? awh.a($$1.z, -1.0, 1.0) : 0.0;
         $$1.a($$4, $$12, $$13, $$14, $$15, $$16, $$17);
      }
   }

   public static void a(cvn $$0, hz $$1, ie $$2, jx $$3, ens $$4, double $$5) {
      ens $$6 = ens.b($$1);
      int $$7 = $$2.j();
      int $$8 = $$2.k();
      int $$9 = $$2.l();
      double $$10 = $$6.c + ($$7 == 0 ? awh.a($$0.z, -0.5, 0.5) : (double)$$7 * $$5);
      double $$11 = $$6.d + ($$8 == 0 ? awh.a($$0.z, -0.5, 0.5) : (double)$$8 * $$5);
      double $$12 = $$6.e + ($$9 == 0 ? awh.a($$0.z, -0.5, 0.5) : (double)$$9 * $$5);
      double $$13 = $$7 == 0 ? $$4.a() : 0.0;
      double $$14 = $$8 == 0 ? $$4.b() : 0.0;
      double $$15 = $$9 == 0 ? $$4.c() : 0.0;
      $$0.a($$3, $$10, $$11, $$12, $$13, $$14, $$15);
   }

   public static void a(cvn $$0, hz $$1, awo $$2, jx $$3) {
      double $$4 = (double)$$1.u() + $$2.j();
      double $$5 = (double)$$1.v() - 0.05;
      double $$6 = (double)$$1.w() + $$2.j();
      $$0.a($$3, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   public static void a(cvo $$0, hz $$1, int $$2, jx $$3) {
      double $$4 = 0.5;
      dlf $$5 = $$0.a_($$1);
      double $$6 = $$5.i() ? 1.0 : $$5.j($$0, $$1).c(ie.a.b);
      a($$0, $$1, $$2, 0.5, $$6, true, $$3);
   }

   public static void a(cvo $$0, hz $$1, int $$2, double $$3, double $$4, boolean $$5, jx $$6) {
      awo $$7 = $$0.F_();

      for (int $$8 = 0; $$8 < $$2; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         double $$12 = 0.5 - $$3;
         double $$13 = (double)$$1.u() + $$12 + $$7.j() * $$3 * 2.0;
         double $$14 = (double)$$1.v() + $$7.j() * $$4;
         double $$15 = (double)$$1.w() + $$12 + $$7.j() * $$3 * 2.0;
         if ($$5 || !$$0.a_(hz.a($$13, $$14, $$15).d()).i()) {
            $$0.a($$6, $$13, $$14, $$15, $$9, $$10, $$11);
         }
      }
   }
}

import java.util.function.Supplier;

public class arv {
   public static void a(cpq $$0, gw $$1, iv $$2, bfy $$3) {
      for (hc $$4 : hc.values()) {
         a($$0, $$1, $$2, $$3, $$4, () -> a($$0.z), 0.55);
      }
   }

   public static void a(cpq $$0, gw $$1, iv $$2, bfy $$3, hc $$4, Supplier<ehi> $$5, double $$6) {
      int $$7 = $$3.a($$0.z);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         a($$0, $$1, $$4, $$2, $$5.get(), $$6);
      }
   }

   private static ehi a(arx $$0) {
      return new ehi(ars.a($$0, -0.5, 0.5), ars.a($$0, -0.5, 0.5), ars.a($$0, -0.5, 0.5));
   }

   public static void a(hc.a $$0, cpq $$1, gw $$2, double $$3, iv $$4, bge $$5) {
      ehi $$6 = ehi.b($$2);
      boolean $$7 = $$0 == hc.a.a;
      boolean $$8 = $$0 == hc.a.b;
      boolean $$9 = $$0 == hc.a.c;
      int $$10 = $$5.a($$1.z);

      for (int $$11 = 0; $$11 < $$10; $$11++) {
         double $$12 = $$6.c + ars.a($$1.z, -1.0, 1.0) * ($$7 ? 0.5 : $$3);
         double $$13 = $$6.d + ars.a($$1.z, -1.0, 1.0) * ($$8 ? 0.5 : $$3);
         double $$14 = $$6.e + ars.a($$1.z, -1.0, 1.0) * ($$9 ? 0.5 : $$3);
         double $$15 = $$7 ? ars.a($$1.z, -1.0, 1.0) : 0.0;
         double $$16 = $$8 ? ars.a($$1.z, -1.0, 1.0) : 0.0;
         double $$17 = $$9 ? ars.a($$1.z, -1.0, 1.0) : 0.0;
         $$1.a($$4, $$12, $$13, $$14, $$15, $$16, $$17);
      }
   }

   public static void a(cpq $$0, gw $$1, hc $$2, iv $$3, ehi $$4, double $$5) {
      ehi $$6 = ehi.b($$1);
      int $$7 = $$2.j();
      int $$8 = $$2.k();
      int $$9 = $$2.l();
      double $$10 = $$6.c + ($$7 == 0 ? ars.a($$0.z, -0.5, 0.5) : (double)$$7 * $$5);
      double $$11 = $$6.d + ($$8 == 0 ? ars.a($$0.z, -0.5, 0.5) : (double)$$8 * $$5);
      double $$12 = $$6.e + ($$9 == 0 ? ars.a($$0.z, -0.5, 0.5) : (double)$$9 * $$5);
      double $$13 = $$7 == 0 ? $$4.a() : 0.0;
      double $$14 = $$8 == 0 ? $$4.b() : 0.0;
      double $$15 = $$9 == 0 ? $$4.c() : 0.0;
      $$0.a($$3, $$10, $$11, $$12, $$13, $$14, $$15);
   }

   public static void a(cpq $$0, gw $$1, arx $$2, iv $$3) {
      double $$4 = (double)$$1.u() + $$2.j();
      double $$5 = (double)$$1.v() - 0.05;
      double $$6 = (double)$$1.w() + $$2.j();
      $$0.a($$3, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}

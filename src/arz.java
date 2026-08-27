import java.util.function.Supplier;

public class arz {
   public static void a(cpv $$0, gw $$1, it $$2, bgd $$3) {
      for (ha $$4 : ha.values()) {
         a($$0, $$1, $$2, $$3, $$4, () -> a($$0.z), 0.55);
      }
   }

   public static void a(cpv $$0, gw $$1, it $$2, bgd $$3, ha $$4, Supplier<ehn> $$5, double $$6) {
      int $$7 = $$3.a($$0.z);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         a($$0, $$1, $$4, $$2, $$5.get(), $$6);
      }
   }

   private static ehn a(asc $$0) {
      return new ehn(arw.a($$0, -0.5, 0.5), arw.a($$0, -0.5, 0.5), arw.a($$0, -0.5, 0.5));
   }

   public static void a(ha.a $$0, cpv $$1, gw $$2, double $$3, it $$4, bgj $$5) {
      ehn $$6 = ehn.b($$2);
      boolean $$7 = $$0 == ha.a.a;
      boolean $$8 = $$0 == ha.a.b;
      boolean $$9 = $$0 == ha.a.c;
      int $$10 = $$5.a($$1.z);

      for (int $$11 = 0; $$11 < $$10; $$11++) {
         double $$12 = $$6.c + arw.a($$1.z, -1.0, 1.0) * ($$7 ? 0.5 : $$3);
         double $$13 = $$6.d + arw.a($$1.z, -1.0, 1.0) * ($$8 ? 0.5 : $$3);
         double $$14 = $$6.e + arw.a($$1.z, -1.0, 1.0) * ($$9 ? 0.5 : $$3);
         double $$15 = $$7 ? arw.a($$1.z, -1.0, 1.0) : 0.0;
         double $$16 = $$8 ? arw.a($$1.z, -1.0, 1.0) : 0.0;
         double $$17 = $$9 ? arw.a($$1.z, -1.0, 1.0) : 0.0;
         $$1.a($$4, $$12, $$13, $$14, $$15, $$16, $$17);
      }
   }

   public static void a(cpv $$0, gw $$1, ha $$2, it $$3, ehn $$4, double $$5) {
      ehn $$6 = ehn.b($$1);
      int $$7 = $$2.j();
      int $$8 = $$2.k();
      int $$9 = $$2.l();
      double $$10 = $$6.c + ($$7 == 0 ? arw.a($$0.z, -0.5, 0.5) : (double)$$7 * $$5);
      double $$11 = $$6.d + ($$8 == 0 ? arw.a($$0.z, -0.5, 0.5) : (double)$$8 * $$5);
      double $$12 = $$6.e + ($$9 == 0 ? arw.a($$0.z, -0.5, 0.5) : (double)$$9 * $$5);
      double $$13 = $$7 == 0 ? $$4.a() : 0.0;
      double $$14 = $$8 == 0 ? $$4.b() : 0.0;
      double $$15 = $$9 == 0 ? $$4.c() : 0.0;
      $$0.a($$3, $$10, $$11, $$12, $$13, $$14, $$15);
   }

   public static void a(cpv $$0, gw $$1, asc $$2, it $$3) {
      double $$4 = (double)$$1.u() + $$2.j();
      double $$5 = (double)$$1.v() - 0.05;
      double $$6 = (double)$$1.w() + $$2.j();
      $$0.a($$3, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}

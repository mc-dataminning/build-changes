import java.util.function.Supplier;

public class aub {
   public static void a(csy $$0, hv $$1, jt $$2, biq $$3) {
      for (ia $$4 : ia.values()) {
         a($$0, $$1, $$2, $$3, $$4, () -> a($$0.z), 0.55);
      }
   }

   public static void a(csy $$0, hv $$1, jt $$2, biq $$3, ia $$4, Supplier<elb> $$5, double $$6) {
      int $$7 = $$3.a($$0.z);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         a($$0, $$1, $$4, $$2, $$5.get(), $$6);
      }
   }

   private static elb a(auf $$0) {
      return new elb(aty.a($$0, -0.5, 0.5), aty.a($$0, -0.5, 0.5), aty.a($$0, -0.5, 0.5));
   }

   public static void a(ia.a $$0, csy $$1, hv $$2, double $$3, jt $$4, biw $$5) {
      elb $$6 = elb.b($$2);
      boolean $$7 = $$0 == ia.a.a;
      boolean $$8 = $$0 == ia.a.b;
      boolean $$9 = $$0 == ia.a.c;
      int $$10 = $$5.a($$1.z);

      for (int $$11 = 0; $$11 < $$10; $$11++) {
         double $$12 = $$6.c + aty.a($$1.z, -1.0, 1.0) * ($$7 ? 0.5 : $$3);
         double $$13 = $$6.d + aty.a($$1.z, -1.0, 1.0) * ($$8 ? 0.5 : $$3);
         double $$14 = $$6.e + aty.a($$1.z, -1.0, 1.0) * ($$9 ? 0.5 : $$3);
         double $$15 = $$7 ? aty.a($$1.z, -1.0, 1.0) : 0.0;
         double $$16 = $$8 ? aty.a($$1.z, -1.0, 1.0) : 0.0;
         double $$17 = $$9 ? aty.a($$1.z, -1.0, 1.0) : 0.0;
         $$1.a($$4, $$12, $$13, $$14, $$15, $$16, $$17);
      }
   }

   public static void a(csy $$0, hv $$1, ia $$2, jt $$3, elb $$4, double $$5) {
      elb $$6 = elb.b($$1);
      int $$7 = $$2.j();
      int $$8 = $$2.k();
      int $$9 = $$2.l();
      double $$10 = $$6.c + ($$7 == 0 ? aty.a($$0.z, -0.5, 0.5) : (double)$$7 * $$5);
      double $$11 = $$6.d + ($$8 == 0 ? aty.a($$0.z, -0.5, 0.5) : (double)$$8 * $$5);
      double $$12 = $$6.e + ($$9 == 0 ? aty.a($$0.z, -0.5, 0.5) : (double)$$9 * $$5);
      double $$13 = $$7 == 0 ? $$4.a() : 0.0;
      double $$14 = $$8 == 0 ? $$4.b() : 0.0;
      double $$15 = $$9 == 0 ? $$4.c() : 0.0;
      $$0.a($$3, $$10, $$11, $$12, $$13, $$14, $$15);
   }

   public static void a(csy $$0, hv $$1, auf $$2, jt $$3) {
      double $$4 = (double)$$1.u() + $$2.j();
      double $$5 = (double)$$1.v() - 0.05;
      double $$6 = (double)$$1.w() + $$2.j();
      $$0.a($$3, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}

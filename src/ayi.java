import java.util.function.Supplier;

public class ayi {
   public static void a(daz $$0, io $$1, kw $$2, bpb $$3) {
      for (it $$4 : it.values()) {
         a($$0, $$1, $$2, $$3, $$4, () -> a($$0.z), 0.55);
      }
   }

   public static void a(daz $$0, io $$1, kw $$2, bpb $$3, it $$4, Supplier<eum> $$5, double $$6) {
      int $$7 = $$3.a($$0.z);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         a($$0, $$1, $$4, $$2, $$5.get(), $$6);
      }
   }

   private static eum a(aym $$0) {
      return new eum(ayf.a($$0, -0.5, 0.5), ayf.a($$0, -0.5, 0.5), ayf.a($$0, -0.5, 0.5));
   }

   public static void a(it.a $$0, daz $$1, io $$2, double $$3, kw $$4, bph $$5) {
      eum $$6 = eum.b($$2);
      boolean $$7 = $$0 == it.a.a;
      boolean $$8 = $$0 == it.a.b;
      boolean $$9 = $$0 == it.a.c;
      int $$10 = $$5.a($$1.z);

      for (int $$11 = 0; $$11 < $$10; $$11++) {
         double $$12 = $$6.c + ayf.a($$1.z, -1.0, 1.0) * ($$7 ? 0.5 : $$3);
         double $$13 = $$6.d + ayf.a($$1.z, -1.0, 1.0) * ($$8 ? 0.5 : $$3);
         double $$14 = $$6.e + ayf.a($$1.z, -1.0, 1.0) * ($$9 ? 0.5 : $$3);
         double $$15 = $$7 ? ayf.a($$1.z, -1.0, 1.0) : 0.0;
         double $$16 = $$8 ? ayf.a($$1.z, -1.0, 1.0) : 0.0;
         double $$17 = $$9 ? ayf.a($$1.z, -1.0, 1.0) : 0.0;
         $$1.a($$4, $$12, $$13, $$14, $$15, $$16, $$17);
      }
   }

   public static void a(daz $$0, io $$1, it $$2, kw $$3, eum $$4, double $$5) {
      eum $$6 = eum.b($$1);
      int $$7 = $$2.j();
      int $$8 = $$2.k();
      int $$9 = $$2.l();
      double $$10 = $$6.c + ($$7 == 0 ? ayf.a($$0.z, -0.5, 0.5) : (double)$$7 * $$5);
      double $$11 = $$6.d + ($$8 == 0 ? ayf.a($$0.z, -0.5, 0.5) : (double)$$8 * $$5);
      double $$12 = $$6.e + ($$9 == 0 ? ayf.a($$0.z, -0.5, 0.5) : (double)$$9 * $$5);
      double $$13 = $$7 == 0 ? $$4.a() : 0.0;
      double $$14 = $$8 == 0 ? $$4.b() : 0.0;
      double $$15 = $$9 == 0 ? $$4.c() : 0.0;
      $$0.a($$3, $$10, $$11, $$12, $$13, $$14, $$15);
   }

   public static void a(daz $$0, io $$1, aym $$2, kw $$3) {
      double $$4 = (double)$$1.u() + $$2.j();
      double $$5 = (double)$$1.v() - 0.05;
      double $$6 = (double)$$1.w() + $$2.j();
      $$0.a($$3, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   public static void a(dba $$0, io $$1, int $$2, kw $$3) {
      double $$4 = 0.5;
      drd $$5 = $$0.a_($$1);
      double $$6 = $$5.i() ? 1.0 : $$5.j($$0, $$1).c(it.a.b);
      a($$0, $$1, $$2, 0.5, $$6, true, $$3);
   }

   public static void a(dba $$0, io $$1, int $$2, double $$3, double $$4, boolean $$5, kw $$6) {
      aym $$7 = $$0.E_();

      for (int $$8 = 0; $$8 < $$2; $$8++) {
         double $$9 = $$7.k() * 0.02;
         double $$10 = $$7.k() * 0.02;
         double $$11 = $$7.k() * 0.02;
         double $$12 = 0.5 - $$3;
         double $$13 = (double)$$1.u() + $$12 + $$7.j() * $$3 * 2.0;
         double $$14 = (double)$$1.v() + $$7.j() * $$4;
         double $$15 = (double)$$1.w() + $$12 + $$7.j() * $$3 * 2.0;
         if ($$5 || !$$0.a_(io.a($$13, $$14, $$15).d()).i()) {
            $$0.a($$6, $$13, $$14, $$15, $$9, $$10, $$11);
         }
      }
   }

   public static void a(dba $$0, io $$1, int $$2) {
      eum $$3 = $$1.b().b(0.0, 0.5, 0.0);
      kp $$4 = new kp(ky.bb, $$0.a_($$1));

      for (int $$5 = 0; (float)$$5 < (float)$$2 / 3.0F; $$5++) {
         double $$6 = $$3.c + $$0.E_().k() / 2.0;
         double $$7 = $$3.d;
         double $$8 = $$3.e + $$0.E_().k() / 2.0;
         double $$9 = $$0.E_().k() * 0.2F;
         double $$10 = $$0.E_().k() * 0.2F;
         double $$11 = $$0.E_().k() * 0.2F;
         $$0.a($$4, $$6, $$7, $$8, $$9, $$10, $$11);
      }

      for (int $$12 = 0; (float)$$12 < (float)$$2 / 1.5F; $$12++) {
         double $$13 = $$3.c + 3.5 * Math.cos((double)$$12) + $$0.E_().k() / 2.0;
         double $$14 = $$3.d;
         double $$15 = $$3.e + 3.5 * Math.sin((double)$$12) + $$0.E_().k() / 2.0;
         double $$16 = $$0.E_().k() * 0.05F;
         double $$17 = $$0.E_().k() * 0.05F;
         double $$18 = $$0.E_().k() * 0.05F;
         $$0.a($$4, $$13, $$14, $$15, $$16, $$17, $$18);
      }
   }
}

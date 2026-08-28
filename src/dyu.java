import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dyu extends dza implements dyt {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private jo<czn> g = jo.a(5, czn.k);
   private int h = -1;
   private long i;
   private jb j;

   public dyu(iv $$0, eat $$1) {
      super(dxt.s, $$0, $$1);
      this.j = $$1.c(dqr.b);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.g = jo.a(this.b(), czn.k);
      if (!this.b_($$0)) {
         bua.b($$0, this.g, $$1);
      }

      this.h = $$0.f("TransferCooldown");
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bua.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public czn a(int $$0, int $$1) {
      this.d_(null);
      return bua.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, czn $$1) {
      this.d_(null);
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   @Override
   public void c(eat $$0) {
      super.c($$0);
      this.j = $$0.c(dqr.b);
   }

   @Override
   protected wy j() {
      return wy.c("container.hopper");
   }

   public static void a(djm $$0, iv $$1, eat $$2, dyu $$3) {
      $$3.h--;
      $$3.i = $$0.ae();
      if (!$$3.s()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dyt)$$3));
      }
   }

   private static boolean a(djm $$0, iv $$1, eat $$2, dyu $$3, BooleanSupplier $$4) {
      if ($$0.C) {
         return false;
      } else {
         if (!$$3.s() && $$2.c(dqr.c)) {
            boolean $$5 = false;
            if (!$$3.c()) {
               $$5 = a($$0, $$1, $$3);
            }

            if (!$$3.k()) {
               $$5 |= $$4.getAsBoolean();
            }

            if ($$5) {
               $$3.d(8);
               a($$0, $$1, $$2);
               return true;
            }
         }

         return false;
      }
   }

   private boolean k() {
      for (czn $$0 : this.g) {
         if ($$0.f() || $$0.M() != $$0.k()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(djm $$0, iv $$1, dyu $$2) {
      btz $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         jb $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               czn $$6 = $$2.a($$5);
               if (!$$6.f()) {
                  int $$7 = $$6.M();
                  czn $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
                  if ($$8.f()) {
                     $$3.e();
                     return true;
                  }

                  $$6.e($$7);
                  if ($$7 == 1) {
                     $$2.a($$5, $$6);
                  }
               }
            }

            return false;
         }
      }
   }

   private static int[] a(btz $$0, jb $$1) {
      if ($$0 instanceof buq $$2) {
         return $$2.a($$1);
      } else {
         int $$3 = $$0.b();
         if ($$3 < f.length) {
            int[] $$4 = f[$$3];
            if ($$4 != null) {
               return $$4;
            } else {
               int[] $$5 = c($$3);
               f[$$3] = $$5;
               return $$5;
            }
         } else {
            return c($$3);
         }
      }
   }

   private static int[] c(int $$0) {
      int[] $$1 = new int[$$0];
      int $$2 = 0;

      while ($$2 < $$1.length) {
         $$1[$$2] = $$2++;
      }

      return $$1;
   }

   private static boolean b(btz $$0, jb $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         czn $$4 = $$0.a($$3);
         if ($$4.M() < $$4.k()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(djm $$0, dyt $$1) {
      iv $$2 = iv.a($$1.B(), $$1.C() + 1.0, $$1.D());
      eat $$3 = $$0.a_($$2);
      btz $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         jb $$5 = jb.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.E() && $$3.m($$0, $$2) && !$$3.a(axc.cG);
         if (!$$7) {
            for (cnr $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dyt $$0, btz $$1, int $$2, jb $$3) {
      czn $$4 = $$1.a($$2);
      if (!$$4.f() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.M();
         czn $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.f()) {
            $$1.e();
            return true;
         }

         $$4.e($$5);
         if ($$5 == 1) {
            $$1.a($$2, $$4);
         }
      }

      return false;
   }

   public static boolean a(btz $$0, cnr $$1) {
      boolean $$2 = false;
      czn $$3 = $$1.f().v();
      czn $$4 = a(null, $$0, $$3, null);
      if ($$4.f()) {
         $$2 = true;
         $$1.a(czn.k);
         $$1.aq();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static czn a(@Nullable btz $$0, btz $$1, czn $$2, @Nullable jb $$3) {
      if ($$1 instanceof buq $$4 && $$3 != null) {
         int[] $$5 = $$4.a($$3);

         for (int $$6 = 0; $$6 < $$5.length && !$$2.f(); $$6++) {
            $$2 = b($$0, $$1, $$2, $$5[$$6], $$3);
         }

         return $$2;
      }

      int $$7 = $$1.b();

      for (int $$8 = 0; $$8 < $$7 && !$$2.f(); $$8++) {
         $$2 = b($$0, $$1, $$2, $$8, $$3);
      }

      return $$2;
   }

   private static boolean a(btz $$0, czn $$1, int $$2, @Nullable jb $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof buq $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(btz $$0, btz $$1, czn $$2, int $$3, jb $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof buq $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static czn b(@Nullable btz $$0, btz $$1, czn $$2, int $$3, @Nullable jb $$4) {
      czn $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.f()) {
            $$1.a($$3, $$2);
            $$2 = czn.k;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.k() - $$5.M();
            int $$9 = Math.min($$2.M(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dyu $$10 && !$$10.t()) {
               int $$11 = 0;
               if ($$0 instanceof dyu $$12 && $$10.i >= $$12.i) {
                  $$11 = 1;
               }

               $$10.d(8 - $$11);
            }

            $$1.e();
         }
      }

      return $$2;
   }

   @Nullable
   private static btz b(djm $$0, iv $$1, dyu $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static btz a(djm $$0, dyt $$1, iv $$2, eat $$3) {
      return a($$0, $$2, $$3, $$1.B(), $$1.C() + 1.0, $$1.D());
   }

   public static List<cnr> b(djm $$0, dyt $$1) {
      fex $$2 = $$1.ai_().d($$1.B() - 0.5, $$1.C() - 0.5, $$1.D() - 0.5);
      return $$0.a(cnr.class, $$2, bwp.a);
   }

   @Nullable
   public static btz a(djm $$0, iv $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static btz a(djm $$0, iv $$1, eat $$2, double $$3, double $$4, double $$5) {
      btz $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static btz b(djm $$0, iv $$1, eat $$2) {
      dmr $$3 = $$2.b();
      if ($$3 instanceof bur) {
         return ((bur)$$3).a($$2, $$0, $$1);
      } else if ($$2.x() && $$0.c_($$1) instanceof btz $$5) {
         if ($$5 instanceof dxz && $$3 instanceof dnv) {
            $$5 = dnv.a((dnv)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static btz a(djm $$0, double $$1, double $$2, double $$3) {
      List<bwi> $$4 = $$0.a((bwi)null, new fex($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bwp.d);
      return !$$4.isEmpty() ? (btz)$$4.get($$0.A.a($$4.size())) : null;
   }

   private static boolean a(czn $$0, czn $$1) {
      return $$0.M() <= $$0.k() && czn.c($$0, $$1);
   }

   @Override
   public double B() {
      return (double)this.o.u() + 0.5;
   }

   @Override
   public double C() {
      return (double)this.o.v() + 0.5;
   }

   @Override
   public double D() {
      return (double)this.o.w() + 0.5;
   }

   @Override
   public boolean E() {
      return true;
   }

   private void d(int $$0) {
      this.h = $$0;
   }

   private boolean s() {
      return this.h > 0;
   }

   private boolean t() {
      return this.h > 8;
   }

   @Override
   protected jo<czn> f() {
      return this.g;
   }

   @Override
   protected void a(jo<czn> $$0) {
      this.g = $$0;
   }

   public static void a(djm $$0, iv $$1, eat $$2, bwi $$3, dyu $$4) {
      if ($$3 instanceof cnr $$5 && !$$5.f().f() && $$3.cQ().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.ai_())) {
         a($$0, $$1, $$2, $$4, () -> a((btz)$$4, $$5));
      }
   }

   @Override
   protected cvf a(int $$0, crl $$1) {
      return new cwg($$0, $$1, this);
   }
}

import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dyi extends dyo implements dyh {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private jn<czd> g = jn.a(5, czd.k);
   private int h = -1;
   private long i;
   private ja j;

   public dyi(iu $$0, eah $$1) {
      super(dxh.s, $$0, $$1);
      this.j = $$1.c(dqf.b);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.g = jn.a(this.b(), czd.k);
      if (!this.b_($$0)) {
         btx.b($$0, this.g, $$1);
      }

      this.h = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btx.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public czd a(int $$0, int $$1) {
      this.d_(null);
      return btx.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, czd $$1) {
      this.d_(null);
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   @Override
   public void c(eah $$0) {
      super.c($$0);
      this.j = $$0.c(dqf.b);
   }

   @Override
   protected wy j() {
      return wy.c("container.hopper");
   }

   public static void a(dja $$0, iu $$1, eah $$2, dyi $$3) {
      $$3.h--;
      $$3.i = $$0.ae();
      if (!$$3.s()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dyh)$$3));
      }
   }

   private static boolean a(dja $$0, iu $$1, eah $$2, dyi $$3, BooleanSupplier $$4) {
      if ($$0.C) {
         return false;
      } else {
         if (!$$3.s() && $$2.c(dqf.c)) {
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
      for (czd $$0 : this.g) {
         if ($$0.f() || $$0.M() != $$0.k()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dja $$0, iu $$1, dyi $$2) {
      btw $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         ja $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               czd $$6 = $$2.a($$5);
               if (!$$6.f()) {
                  int $$7 = $$6.M();
                  czd $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(btw $$0, ja $$1) {
      if ($$0 instanceof bun $$2) {
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

   private static boolean b(btw $$0, ja $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         czd $$4 = $$0.a($$3);
         if ($$4.M() < $$4.k()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(dja $$0, dyh $$1) {
      iu $$2 = iu.a($$1.C(), $$1.D() + 1.0, $$1.E());
      eah $$3 = $$0.a_($$2);
      btw $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         ja $$5 = ja.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.F() && $$3.m($$0, $$2) && !$$3.a(axc.cF);
         if (!$$7) {
            for (cnh $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dyh $$0, btw $$1, int $$2, ja $$3) {
      czd $$4 = $$1.a($$2);
      if (!$$4.f() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.M();
         czd $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(btw $$0, cnh $$1) {
      boolean $$2 = false;
      czd $$3 = $$1.f().v();
      czd $$4 = a(null, $$0, $$3, null);
      if ($$4.f()) {
         $$2 = true;
         $$1.a(czd.k);
         $$1.at();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static czd a(@Nullable btw $$0, btw $$1, czd $$2, @Nullable ja $$3) {
      if ($$1 instanceof bun $$4 && $$3 != null) {
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

   private static boolean a(btw $$0, czd $$1, int $$2, @Nullable ja $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bun $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(btw $$0, btw $$1, czd $$2, int $$3, ja $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bun $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static czd b(@Nullable btw $$0, btw $$1, czd $$2, int $$3, @Nullable ja $$4) {
      czd $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.f()) {
            $$1.a($$3, $$2);
            $$2 = czd.k;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.k() - $$5.M();
            int $$9 = Math.min($$2.M(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dyi $$10 && !$$10.t()) {
               int $$11 = 0;
               if ($$0 instanceof dyi $$12 && $$10.i >= $$12.i) {
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
   private static btw b(dja $$0, iu $$1, dyi $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static btw a(dja $$0, dyh $$1, iu $$2, eah $$3) {
      return a($$0, $$2, $$3, $$1.C(), $$1.D() + 1.0, $$1.E());
   }

   public static List<cnh> b(dja $$0, dyh $$1) {
      fel $$2 = $$1.ai_().d($$1.C() - 0.5, $$1.D() - 0.5, $$1.E() - 0.5);
      return $$0.a(cnh.class, $$2, bwm.a);
   }

   @Nullable
   public static btw a(dja $$0, iu $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static btw a(dja $$0, iu $$1, eah $$2, double $$3, double $$4, double $$5) {
      btw $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static btw b(dja $$0, iu $$1, eah $$2) {
      dmf $$3 = $$2.b();
      if ($$3 instanceof buo) {
         return ((buo)$$3).a($$2, $$0, $$1);
      } else if ($$2.x() && $$0.c_($$1) instanceof btw $$5) {
         if ($$5 instanceof dxn && $$3 instanceof dnj) {
            $$5 = dnj.a((dnj)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static btw a(dja $$0, double $$1, double $$2, double $$3) {
      List<bwf> $$4 = $$0.a((bwf)null, new fel($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bwm.d);
      return !$$4.isEmpty() ? (btw)$$4.get($$0.A.a($$4.size())) : null;
   }

   private static boolean a(czd $$0, czd $$1) {
      return $$0.M() <= $$0.k() && czd.c($$0, $$1);
   }

   @Override
   public double C() {
      return (double)this.o.u() + 0.5;
   }

   @Override
   public double D() {
      return (double)this.o.v() + 0.5;
   }

   @Override
   public double E() {
      return (double)this.o.w() + 0.5;
   }

   @Override
   public boolean F() {
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
   protected jn<czd> f() {
      return this.g;
   }

   @Override
   protected void a(jn<czd> $$0) {
      this.g = $$0;
   }

   public static void a(dja $$0, iu $$1, eah $$2, bwf $$3, dyi $$4) {
      if ($$3 instanceof cnh $$5 && !$$5.f().f() && $$3.cR().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.ai_())) {
         a($$0, $$1, $$2, $$4, () -> a((btw)$$4, $$5));
      }
   }

   @Override
   protected cuv a(int $$0, crb $$1) {
      return new cvw($$0, $$1, this);
   }
}

import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class duz extends dvf implements duy {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private ka<cwn> g = ka.a(5, cwn.j);
   private int h = -1;
   private long i;
   private jn j;

   public duz(ji $$0, dwv $$1) {
      super(dtz.s, $$0, $$1);
      this.j = $$1.c(dnh.b);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.g = ka.a(this.b(), cwn.j);
      if (!this.b_($$0)) {
         bsc.b($$0, this.g, $$1);
      }

      this.h = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsc.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public cwn a(int $$0, int $$1) {
      this.d_(null);
      return bsc.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cwn $$1) {
      this.d_(null);
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   @Override
   public void c(dwv $$0) {
      super.c($$0);
      this.j = $$0.c(dnh.b);
   }

   @Override
   protected wo j() {
      return wo.c("container.hopper");
   }

   public static void a(dgg $$0, ji $$1, dwv $$2, duz $$3) {
      $$3.h--;
      $$3.i = $$0.ad();
      if (!$$3.s()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (duy)$$3));
      }
   }

   private static boolean a(dgg $$0, ji $$1, dwv $$2, duz $$3, BooleanSupplier $$4) {
      if ($$0.C) {
         return false;
      } else {
         if (!$$3.s() && $$2.c(dnh.c)) {
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
      for (cwn $$0 : this.g) {
         if ($$0.f() || $$0.M() != $$0.k()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dgg $$0, ji $$1, duz $$2) {
      bsb $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         jn $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               cwn $$6 = $$2.a($$5);
               if (!$$6.f()) {
                  int $$7 = $$6.M();
                  cwn $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(bsb $$0, jn $$1) {
      if ($$0 instanceof bss $$2) {
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

   private static boolean b(bsb $$0, jn $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         cwn $$4 = $$0.a($$3);
         if ($$4.M() < $$4.k()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(dgg $$0, duy $$1) {
      ji $$2 = ji.a($$1.G(), $$1.H() + 1.0, $$1.I());
      dwv $$3 = $$0.a_($$2);
      bsb $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         jn $$5 = jn.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.J() && $$3.m($$0, $$2) && !$$3.a(awo.cC);
         if (!$$7) {
            for (cla $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(duy $$0, bsb $$1, int $$2, jn $$3) {
      cwn $$4 = $$1.a($$2);
      if (!$$4.f() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.M();
         cwn $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(bsb $$0, cla $$1) {
      boolean $$2 = false;
      cwn $$3 = $$1.l().v();
      cwn $$4 = a(null, $$0, $$3, null);
      if ($$4.f()) {
         $$2 = true;
         $$1.a(cwn.j);
         $$1.at();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cwn a(@Nullable bsb $$0, bsb $$1, cwn $$2, @Nullable jn $$3) {
      if ($$1 instanceof bss $$4 && $$3 != null) {
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

   private static boolean a(bsb $$0, cwn $$1, int $$2, @Nullable jn $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bss $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bsb $$0, bsb $$1, cwn $$2, int $$3, jn $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bss $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cwn b(@Nullable bsb $$0, bsb $$1, cwn $$2, int $$3, @Nullable jn $$4) {
      cwn $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.f()) {
            $$1.a($$3, $$2);
            $$2 = cwn.j;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.k() - $$5.M();
            int $$9 = Math.min($$2.M(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof duz $$10 && !$$10.t()) {
               int $$11 = 0;
               if ($$0 instanceof duz $$12 && $$10.i >= $$12.i) {
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
   private static bsb b(dgg $$0, ji $$1, duz $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static bsb a(dgg $$0, duy $$1, ji $$2, dwv $$3) {
      return a($$0, $$2, $$3, $$1.G(), $$1.H() + 1.0, $$1.I());
   }

   public static List<cla> b(dgg $$0, duy $$1) {
      fat $$2 = $$1.al_().d($$1.G() - 0.5, $$1.H() - 0.5, $$1.I() - 0.5);
      return $$0.a(cla.class, $$2, buo.a);
   }

   @Nullable
   public static bsb a(dgg $$0, ji $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bsb a(dgg $$0, ji $$1, dwv $$2, double $$3, double $$4, double $$5) {
      bsb $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static bsb b(dgg $$0, ji $$1, dwv $$2) {
      djk $$3 = $$2.b();
      if ($$3 instanceof bst) {
         return ((bst)$$3).a($$2, $$0, $$1);
      } else if ($$2.x() && $$0.c_($$1) instanceof bsb $$5) {
         if ($$5 instanceof due && $$3 instanceof dkn) {
            $$5 = dkn.a((dkn)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static bsb a(dgg $$0, double $$1, double $$2, double $$3) {
      List<buj> $$4 = $$0.a((buj)null, new fat($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), buo.d);
      return !$$4.isEmpty() ? (bsb)$$4.get($$0.A.a($$4.size())) : null;
   }

   private static boolean a(cwn $$0, cwn $$1) {
      return $$0.M() <= $$0.k() && cwn.c($$0, $$1);
   }

   @Override
   public double G() {
      return (double)this.p.u() + 0.5;
   }

   @Override
   public double H() {
      return (double)this.p.v() + 0.5;
   }

   @Override
   public double I() {
      return (double)this.p.w() + 0.5;
   }

   @Override
   public boolean J() {
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
   protected ka<cwn> f() {
      return this.g;
   }

   @Override
   protected void a(ka<cwn> $$0) {
      this.g = $$0;
   }

   public static void a(dgg $$0, ji $$1, dwv $$2, buj $$3, duz $$4) {
      if ($$3 instanceof cla $$5 && !$$5.l().f() && $$3.cR().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.al_())) {
         a($$0, $$1, $$2, $$4, () -> a((bsb)$$4, $$5));
      }
   }

   @Override
   protected csa a(int $$0, cou $$1) {
      return new ctb($$0, $$1, this);
   }
}

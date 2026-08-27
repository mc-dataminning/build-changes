import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class drc extends drm implements drb {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private jj<cuh> g = jj.a(5, cuh.i);
   private int h = -1;
   private long i;
   private iw j;

   public drc(ir $$0, dtc $$1) {
      super(dqe.s, $$0, $$1);
      this.j = $$1.c(djb.b);
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.g = jj.a(this.b(), cuh.i);
      if (!this.a_($$0)) {
         bpu.b($$0, this.g, $$1);
      }

      this.h = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpu.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public cuh a(int $$0, int $$1) {
      this.e_(null);
      return bpu.a(this.j(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cuh $$1) {
      this.e_(null);
      this.j().set($$0, $$1);
      $$1.f(this.a($$1));
   }

   @Override
   public void b(dtc $$0) {
      super.b($$0);
      this.j = $$0.c(djb.b);
   }

   @Override
   protected xe k() {
      return xe.c("container.hopper");
   }

   public static void a(dca $$0, ir $$1, dtc $$2, drc $$3) {
      $$3.h--;
      $$3.i = $$0.Z();
      if (!$$3.t()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (drb)$$3));
      }
   }

   private static boolean a(dca $$0, ir $$1, dtc $$2, drc $$3, BooleanSupplier $$4) {
      if ($$0.C) {
         return false;
      } else {
         if (!$$3.t() && $$2.c(djb.c)) {
            boolean $$5 = false;
            if (!$$3.c()) {
               $$5 = a($$0, $$1, $$3);
            }

            if (!$$3.l()) {
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

   private boolean l() {
      for (cuh $$0 : this.g) {
         if ($$0.d() || $$0.G() != $$0.i()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dca $$0, ir $$1, drc $$2) {
      bpt $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         iw $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               cuh $$6 = $$2.a($$5);
               if (!$$6.d()) {
                  int $$7 = $$6.G();
                  cuh $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
                  if ($$8.d()) {
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

   private static int[] a(bpt $$0, iw $$1) {
      if ($$0 instanceof bqm $$2) {
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

   private static boolean b(bpt $$0, iw $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         cuh $$4 = $$0.a($$3);
         if ($$4.G() < $$4.i()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(dca $$0, drb $$1) {
      ir $$2 = ir.a($$1.G(), $$1.I() + 1.0, $$1.J());
      dtc $$3 = $$0.a_($$2);
      bpt $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         iw $$5 = iw.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.K() && $$3.r($$0, $$2) && !$$3.a(awe.cC);
         if (!$$7) {
            for (cig $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(drb $$0, bpt $$1, int $$2, iw $$3) {
      cuh $$4 = $$1.a($$2);
      if (!$$4.d() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.G();
         cuh $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.d()) {
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

   public static boolean a(bpt $$0, cig $$1) {
      boolean $$2 = false;
      cuh $$3 = $$1.p().r();
      cuh $$4 = a(null, $$0, $$3, null);
      if ($$4.d()) {
         $$2 = true;
         $$1.a(cuh.i);
         $$1.ao();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cuh a(@Nullable bpt $$0, bpt $$1, cuh $$2, @Nullable iw $$3) {
      if ($$1 instanceof bqm $$4 && $$3 != null) {
         int[] $$5 = $$4.a($$3);

         for (int $$6 = 0; $$6 < $$5.length && !$$2.d(); $$6++) {
            $$2 = b($$0, $$1, $$2, $$5[$$6], $$3);
         }

         return $$2;
      }

      int $$7 = $$1.b();

      for (int $$8 = 0; $$8 < $$7 && !$$2.d(); $$8++) {
         $$2 = b($$0, $$1, $$2, $$8, $$3);
      }

      return $$2;
   }

   private static boolean a(bpt $$0, cuh $$1, int $$2, @Nullable iw $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bqm $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bpt $$0, bpt $$1, cuh $$2, int $$3, iw $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bqm $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cuh b(@Nullable bpt $$0, bpt $$1, cuh $$2, int $$3, @Nullable iw $$4) {
      cuh $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.d()) {
            $$1.a($$3, $$2);
            $$2 = cuh.i;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.i() - $$5.G();
            int $$9 = Math.min($$2.G(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof drc $$10 && !$$10.u()) {
               int $$11 = 0;
               if ($$0 instanceof drc $$12 && $$10.i >= $$12.i) {
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
   private static bpt b(dca $$0, ir $$1, drc $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static bpt a(dca $$0, drb $$1, ir $$2, dtc $$3) {
      return a($$0, $$2, $$3, $$1.G(), $$1.I() + 1.0, $$1.J());
   }

   public static List<cig> b(dca $$0, drb $$1) {
      ewp $$2 = $$1.aj_().d($$1.G() - 0.5, $$1.I() - 0.5, $$1.J() - 0.5);
      return $$0.a(cig.class, $$2, bsa.a);
   }

   @Nullable
   public static bpt a(dca $$0, ir $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bpt a(dca $$0, ir $$1, dtc $$2, double $$3, double $$4, double $$5) {
      bpt $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static bpt b(dca $$0, ir $$1, dtc $$2) {
      dfc $$3 = $$2.b();
      if ($$3 instanceof bqn) {
         return ((bqn)$$3).a($$2, $$0, $$1);
      } else if ($$2.t() && $$0.c_($$1) instanceof bpt $$5) {
         if ($$5 instanceof dqj && $$3 instanceof dgf) {
            $$5 = dgf.a((dgf)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static bpt a(dca $$0, double $$1, double $$2, double $$3) {
      List<brv> $$4 = $$0.a((brv)null, new ewp($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bsa.d);
      return !$$4.isEmpty() ? (bpt)$$4.get($$0.A.a($$4.size())) : null;
   }

   private static boolean a(cuh $$0, cuh $$1) {
      return $$0.G() <= $$0.i() && cuh.c($$0, $$1);
   }

   @Override
   public double G() {
      return (double)this.o.u() + 0.5;
   }

   @Override
   public double I() {
      return (double)this.o.v() + 0.5;
   }

   @Override
   public double J() {
      return (double)this.o.w() + 0.5;
   }

   @Override
   public boolean K() {
      return true;
   }

   private void d(int $$0) {
      this.h = $$0;
   }

   private boolean t() {
      return this.h > 0;
   }

   private boolean u() {
      return this.h > 8;
   }

   @Override
   protected jj<cuh> j() {
      return this.g;
   }

   @Override
   protected void a(jj<cuh> $$0) {
      this.g = $$0;
   }

   public static void a(dca $$0, ir $$1, dtc $$2, brv $$3, drc $$4) {
      if ($$3 instanceof cig $$5 && !$$5.p().d() && $$3.cP().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.aj_())) {
         a($$0, $$1, $$2, $$4, () -> a((bpt)$$4, $$5));
      }
   }

   @Override
   protected cpg a(int $$0, clx $$1) {
      return new cqg($$0, $$1, this);
   }
}

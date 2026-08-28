import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dvr extends dvx implements dvq {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private jz<cxk> g = jz.a(5, cxk.k);
   private int h = -1;
   private long i;
   private jm j;

   public dvr(jh $$0, dxn $$1) {
      super(dur.s, $$0, $$1);
      this.j = $$1.c(dob.b);
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.g = jz.a(this.b(), cxk.k);
      if (!this.b_($$0)) {
         bsy.b($$0, this.g, $$1);
      }

      this.h = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsy.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public cxk a(int $$0, int $$1) {
      this.d_(null);
      return bsy.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cxk $$1) {
      this.d_(null);
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   @Override
   public void c(dxn $$0) {
      super.c($$0);
      this.j = $$0.c(dob.b);
   }

   @Override
   protected xv j() {
      return xv.c("container.hopper");
   }

   public static void a(dha $$0, jh $$1, dxn $$2, dvr $$3) {
      $$3.h--;
      $$3.i = $$0.ac();
      if (!$$3.t()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dvq)$$3));
      }
   }

   private static boolean a(dha $$0, jh $$1, dxn $$2, dvr $$3, BooleanSupplier $$4) {
      if ($$0.C) {
         return false;
      } else {
         if (!$$3.t() && $$2.c(dob.c)) {
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
      for (cxk $$0 : this.g) {
         if ($$0.f() || $$0.L() != $$0.k()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dha $$0, jh $$1, dvr $$2) {
      bsx $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         jm $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               cxk $$6 = $$2.a($$5);
               if (!$$6.f()) {
                  int $$7 = $$6.L();
                  cxk $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(bsx $$0, jm $$1) {
      if ($$0 instanceof bto $$2) {
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

   private static boolean b(bsx $$0, jm $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         cxk $$4 = $$0.a($$3);
         if ($$4.L() < $$4.k()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(dha $$0, dvq $$1) {
      jh $$2 = jh.a($$1.G(), $$1.H() + 1.0, $$1.I());
      dxn $$3 = $$0.a_($$2);
      bsx $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         jm $$5 = jm.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.J() && $$3.m($$0, $$2) && !$$3.a(axu.cC);
         if (!$$7) {
            for (clw $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dvq $$0, bsx $$1, int $$2, jm $$3) {
      cxk $$4 = $$1.a($$2);
      if (!$$4.f() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.L();
         cxk $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(bsx $$0, clw $$1) {
      boolean $$2 = false;
      cxk $$3 = $$1.l().v();
      cxk $$4 = a(null, $$0, $$3, null);
      if ($$4.f()) {
         $$2 = true;
         $$1.a(cxk.k);
         $$1.at();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cxk a(@Nullable bsx $$0, bsx $$1, cxk $$2, @Nullable jm $$3) {
      if ($$1 instanceof bto $$4 && $$3 != null) {
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

   private static boolean a(bsx $$0, cxk $$1, int $$2, @Nullable jm $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bto $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bsx $$0, bsx $$1, cxk $$2, int $$3, jm $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bto $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cxk b(@Nullable bsx $$0, bsx $$1, cxk $$2, int $$3, @Nullable jm $$4) {
      cxk $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.f()) {
            $$1.a($$3, $$2);
            $$2 = cxk.k;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.k() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dvr $$10 && !$$10.u()) {
               int $$11 = 0;
               if ($$0 instanceof dvr $$12 && $$10.i >= $$12.i) {
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
   private static bsx b(dha $$0, jh $$1, dvr $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static bsx a(dha $$0, dvq $$1, jh $$2, dxn $$3) {
      return a($$0, $$2, $$3, $$1.G(), $$1.H() + 1.0, $$1.I());
   }

   public static List<clw> b(dha $$0, dvq $$1) {
      fbn $$2 = $$1.am_().d($$1.G() - 0.5, $$1.H() - 0.5, $$1.I() - 0.5);
      return $$0.a(clw.class, $$2, bvk.a);
   }

   @Nullable
   public static bsx a(dha $$0, jh $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bsx a(dha $$0, jh $$1, dxn $$2, double $$3, double $$4, double $$5) {
      bsx $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static bsx b(dha $$0, jh $$1, dxn $$2) {
      dke $$3 = $$2.b();
      if ($$3 instanceof btp) {
         return ((btp)$$3).a($$2, $$0, $$1);
      } else if ($$2.x() && $$0.c_($$1) instanceof bsx $$5) {
         if ($$5 instanceof duw && $$3 instanceof dli) {
            $$5 = dli.a((dli)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static bsx a(dha $$0, double $$1, double $$2, double $$3) {
      List<bvf> $$4 = $$0.a((bvf)null, new fbn($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bvk.d);
      return !$$4.isEmpty() ? (bsx)$$4.get($$0.A.a($$4.size())) : null;
   }

   private static boolean a(cxk $$0, cxk $$1) {
      return $$0.L() <= $$0.k() && cxk.c($$0, $$1);
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

   private boolean t() {
      return this.h > 0;
   }

   private boolean u() {
      return this.h > 8;
   }

   @Override
   protected jz<cxk> f() {
      return this.g;
   }

   @Override
   protected void a(jz<cxk> $$0) {
      this.g = $$0;
   }

   public static void a(dha $$0, jh $$1, dxn $$2, bvf $$3, dvr $$4) {
      if ($$3 instanceof clw $$5 && !$$5.l().f() && $$3.cR().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.am_())) {
         a($$0, $$1, $$2, $$4, () -> a((bsx)$$4, $$5));
      }
   }

   @Override
   protected csx a(int $$0, cpr $$1) {
      return new cty($$0, $$1, this);
   }
}

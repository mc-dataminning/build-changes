import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dth extends dtn implements dtg {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private jy<cvx> g = jy.a(5, cvx.k);
   private int h = -1;
   private long i;
   private jl j;

   public dth(jg $$0, dvd $$1) {
      super(dsi.r, $$0, $$1);
      this.j = $$1.c(dls.b);
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.g = jy.a(this.b(), cvx.k);
      if (!this.b_($$0)) {
         brs.b($$0, this.g, $$1);
      }

      this.h = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brs.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public cvx a(int $$0, int $$1) {
      this.e_(null);
      return brs.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cvx $$1) {
      this.e_(null);
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   @Override
   public void c(dvd $$0) {
      super.c($$0);
      this.j = $$0.c(dls.b);
   }

   @Override
   protected xh j() {
      return xh.c("container.hopper");
   }

   public static void a(dev $$0, jg $$1, dvd $$2, dth $$3) {
      $$3.h--;
      $$3.i = $$0.aa();
      if (!$$3.t()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dtg)$$3));
      }
   }

   private static boolean a(dev $$0, jg $$1, dvd $$2, dth $$3, BooleanSupplier $$4) {
      if ($$0.C) {
         return false;
      } else {
         if (!$$3.t() && $$2.c(dls.c)) {
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
      for (cvx $$0 : this.g) {
         if ($$0.f() || $$0.L() != $$0.k()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dev $$0, jg $$1, dth $$2) {
      brr $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         jl $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               cvx $$6 = $$2.a($$5);
               if (!$$6.f()) {
                  int $$7 = $$6.L();
                  cvx $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(brr $$0, jl $$1) {
      if ($$0 instanceof bsi $$2) {
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

   private static boolean b(brr $$0, jl $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         cvx $$4 = $$0.a($$3);
         if ($$4.L() < $$4.k()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(dev $$0, dtg $$1) {
      jg $$2 = jg.a($$1.K(), $$1.L() + 1.0, $$1.M());
      dvd $$3 = $$0.a_($$2);
      brr $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         jl $$5 = jl.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.O() && $$3.m($$0, $$2) && !$$3.a(awz.cB);
         if (!$$7) {
            for (ckq $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dtg $$0, brr $$1, int $$2, jl $$3) {
      cvx $$4 = $$1.a($$2);
      if (!$$4.f() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.L();
         cvx $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(brr $$0, ckq $$1) {
      boolean $$2 = false;
      cvx $$3 = $$1.m().v();
      cvx $$4 = a(null, $$0, $$3, null);
      if ($$4.f()) {
         $$2 = true;
         $$1.a(cvx.k);
         $$1.au();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cvx a(@Nullable brr $$0, brr $$1, cvx $$2, @Nullable jl $$3) {
      if ($$1 instanceof bsi $$4 && $$3 != null) {
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

   private static boolean a(brr $$0, cvx $$1, int $$2, @Nullable jl $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bsi $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(brr $$0, brr $$1, cvx $$2, int $$3, jl $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bsi $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cvx b(@Nullable brr $$0, brr $$1, cvx $$2, int $$3, @Nullable jl $$4) {
      cvx $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.f()) {
            $$1.a($$3, $$2);
            $$2 = cvx.k;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.k() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dth $$10 && !$$10.u()) {
               int $$11 = 0;
               if ($$0 instanceof dth $$12 && $$10.i >= $$12.i) {
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
   private static brr b(dev $$0, jg $$1, dth $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static brr a(dev $$0, dtg $$1, jg $$2, dvd $$3) {
      return a($$0, $$2, $$3, $$1.K(), $$1.L() + 1.0, $$1.M());
   }

   public static List<ckq> b(dev $$0, dtg $$1) {
      ezc $$2 = $$1.an_().d($$1.K() - 0.5, $$1.L() - 0.5, $$1.M() - 0.5);
      return $$0.a(ckq.class, $$2, bue.a);
   }

   @Nullable
   public static brr a(dev $$0, jg $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static brr a(dev $$0, jg $$1, dvd $$2, double $$3, double $$4, double $$5) {
      brr $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static brr b(dev $$0, jg $$1, dvd $$2) {
      dhy $$3 = $$2.b();
      if ($$3 instanceof bsj) {
         return ((bsj)$$3).a($$2, $$0, $$1);
      } else if ($$2.x() && $$0.c_($$1) instanceof brr $$5) {
         if ($$5 instanceof dsn && $$3 instanceof djb) {
            $$5 = djb.a((djb)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static brr a(dev $$0, double $$1, double $$2, double $$3) {
      List<btz> $$4 = $$0.a((btz)null, new ezc($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bue.d);
      return !$$4.isEmpty() ? (brr)$$4.get($$0.A.a($$4.size())) : null;
   }

   private static boolean a(cvx $$0, cvx $$1) {
      return $$0.L() <= $$0.k() && cvx.c($$0, $$1);
   }

   @Override
   public double K() {
      return (double)this.p.u() + 0.5;
   }

   @Override
   public double L() {
      return (double)this.p.v() + 0.5;
   }

   @Override
   public double M() {
      return (double)this.p.w() + 0.5;
   }

   @Override
   public boolean O() {
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
   protected jy<cvx> f() {
      return this.g;
   }

   @Override
   protected void a(jy<cvx> $$0) {
      this.g = $$0;
   }

   public static void a(dev $$0, jg $$1, dvd $$2, btz $$3, dth $$4) {
      if ($$3 instanceof ckq $$5 && !$$5.m().f() && $$3.cS().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.an_())) {
         a($$0, $$1, $$2, $$4, () -> a((brr)$$4, $$5));
      }
   }

   @Override
   protected crj a(int $$0, cog $$1) {
      return new csk($$0, $$1, this);
   }
}

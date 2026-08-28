import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dts extends dty implements dtr {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private jz<cwf> g = jz.a(5, cwf.k);
   private int h = -1;
   private long i;
   private jm j;

   public dts(jh $$0, dvo $$1) {
      super(dst.r, $$0, $$1);
      this.j = $$1.c(dmd.b);
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.g = jz.a(this.b(), cwf.k);
      if (!this.b_($$0)) {
         bsb.b($$0, this.g, $$1);
      }

      this.h = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bsb.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public cwf a(int $$0, int $$1) {
      this.e_(null);
      return bsb.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cwf $$1) {
      this.e_(null);
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   @Override
   public void c(dvo $$0) {
      super.c($$0);
      this.j = $$0.c(dmd.b);
   }

   @Override
   protected xl j() {
      return xl.c("container.hopper");
   }

   public static void a(dff $$0, jh $$1, dvo $$2, dts $$3) {
      $$3.h--;
      $$3.i = $$0.aa();
      if (!$$3.t()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dtr)$$3));
      }
   }

   private static boolean a(dff $$0, jh $$1, dvo $$2, dts $$3, BooleanSupplier $$4) {
      if ($$0.C) {
         return false;
      } else {
         if (!$$3.t() && $$2.c(dmd.c)) {
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
      for (cwf $$0 : this.g) {
         if ($$0.f() || $$0.L() != $$0.k()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dff $$0, jh $$1, dts $$2) {
      bsa $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         jm $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               cwf $$6 = $$2.a($$5);
               if (!$$6.f()) {
                  int $$7 = $$6.L();
                  cwf $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(bsa $$0, jm $$1) {
      if ($$0 instanceof bsr $$2) {
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

   private static boolean b(bsa $$0, jm $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         cwf $$4 = $$0.a($$3);
         if ($$4.L() < $$4.k()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(dff $$0, dtr $$1) {
      jh $$2 = jh.a($$1.L(), $$1.M() + 1.0, $$1.O());
      dvo $$3 = $$0.a_($$2);
      bsa $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         jm $$5 = jm.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.P() && $$3.m($$0, $$2) && !$$3.a(axd.cB);
         if (!$$7) {
            for (ckz $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dtr $$0, bsa $$1, int $$2, jm $$3) {
      cwf $$4 = $$1.a($$2);
      if (!$$4.f() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.L();
         cwf $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(bsa $$0, ckz $$1) {
      boolean $$2 = false;
      cwf $$3 = $$1.m().v();
      cwf $$4 = a(null, $$0, $$3, null);
      if ($$4.f()) {
         $$2 = true;
         $$1.a(cwf.k);
         $$1.av();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cwf a(@Nullable bsa $$0, bsa $$1, cwf $$2, @Nullable jm $$3) {
      if ($$1 instanceof bsr $$4 && $$3 != null) {
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

   private static boolean a(bsa $$0, cwf $$1, int $$2, @Nullable jm $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bsr $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bsa $$0, bsa $$1, cwf $$2, int $$3, jm $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bsr $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cwf b(@Nullable bsa $$0, bsa $$1, cwf $$2, int $$3, @Nullable jm $$4) {
      cwf $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.f()) {
            $$1.a($$3, $$2);
            $$2 = cwf.k;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.k() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dts $$10 && !$$10.u()) {
               int $$11 = 0;
               if ($$0 instanceof dts $$12 && $$10.i >= $$12.i) {
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
   private static bsa b(dff $$0, jh $$1, dts $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static bsa a(dff $$0, dtr $$1, jh $$2, dvo $$3) {
      return a($$0, $$2, $$3, $$1.L(), $$1.M() + 1.0, $$1.O());
   }

   public static List<ckz> b(dff $$0, dtr $$1) {
      ezm $$2 = $$1.an_().d($$1.L() - 0.5, $$1.M() - 0.5, $$1.O() - 0.5);
      return $$0.a(ckz.class, $$2, bun.a);
   }

   @Nullable
   public static bsa a(dff $$0, jh $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bsa a(dff $$0, jh $$1, dvo $$2, double $$3, double $$4, double $$5) {
      bsa $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static bsa b(dff $$0, jh $$1, dvo $$2) {
      dij $$3 = $$2.b();
      if ($$3 instanceof bss) {
         return ((bss)$$3).a($$2, $$0, $$1);
      } else if ($$2.x() && $$0.c_($$1) instanceof bsa $$5) {
         if ($$5 instanceof dsy && $$3 instanceof djm) {
            $$5 = djm.a((djm)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static bsa a(dff $$0, double $$1, double $$2, double $$3) {
      List<bui> $$4 = $$0.a((bui)null, new ezm($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bun.d);
      return !$$4.isEmpty() ? (bsa)$$4.get($$0.A.a($$4.size())) : null;
   }

   private static boolean a(cwf $$0, cwf $$1) {
      return $$0.L() <= $$0.k() && cwf.c($$0, $$1);
   }

   @Override
   public double L() {
      return (double)this.p.u() + 0.5;
   }

   @Override
   public double M() {
      return (double)this.p.v() + 0.5;
   }

   @Override
   public double O() {
      return (double)this.p.w() + 0.5;
   }

   @Override
   public boolean P() {
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
   protected jz<cwf> f() {
      return this.g;
   }

   @Override
   protected void a(jz<cwf> $$0) {
      this.g = $$0;
   }

   public static void a(dff $$0, jh $$1, dvo $$2, bui $$3, dts $$4) {
      if ($$3 instanceof ckz $$5 && !$$5.m().f() && $$3.cT().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.an_())) {
         a($$0, $$1, $$2, $$4, () -> a((bsa)$$4, $$5));
      }
   }

   @Override
   protected crs a(int $$0, coq $$1) {
      return new cst($$0, $$1, this);
   }
}

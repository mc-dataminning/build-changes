import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dvy extends dwe implements dvx {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private jz<cxo> g = jz.a(5, cxo.k);
   private int h = -1;
   private long i;
   private jm j;

   public dvy(jh $$0, dxu $$1) {
      super(duy.s, $$0, $$1);
      this.j = $$1.c(doi.b);
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.g = jz.a(this.b(), cxo.k);
      if (!this.b_($$0)) {
         btc.b($$0, this.g, $$1);
      }

      this.h = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btc.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public cxo a(int $$0, int $$1) {
      this.d_(null);
      return btc.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cxo $$1) {
      this.d_(null);
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   @Override
   public void c(dxu $$0) {
      super.c($$0);
      this.j = $$0.c(doi.b);
   }

   @Override
   protected xv j() {
      return xv.c("container.hopper");
   }

   public static void a(dhh $$0, jh $$1, dxu $$2, dvy $$3) {
      $$3.h--;
      $$3.i = $$0.ac();
      if (!$$3.t()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dvx)$$3));
      }
   }

   private static boolean a(dhh $$0, jh $$1, dxu $$2, dvy $$3, BooleanSupplier $$4) {
      if ($$0.C) {
         return false;
      } else {
         if (!$$3.t() && $$2.c(doi.c)) {
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
      for (cxo $$0 : this.g) {
         if ($$0.f() || $$0.L() != $$0.k()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dhh $$0, jh $$1, dvy $$2) {
      btb $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         jm $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               cxo $$6 = $$2.a($$5);
               if (!$$6.f()) {
                  int $$7 = $$6.L();
                  cxo $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(btb $$0, jm $$1) {
      if ($$0 instanceof bts $$2) {
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

   private static boolean b(btb $$0, jm $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         cxo $$4 = $$0.a($$3);
         if ($$4.L() < $$4.k()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(dhh $$0, dvx $$1) {
      jh $$2 = jh.a($$1.G(), $$1.H() + 1.0, $$1.I());
      dxu $$3 = $$0.a_($$2);
      btb $$4 = a($$0, $$1, $$2, $$3);
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
            for (cma $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dvx $$0, btb $$1, int $$2, jm $$3) {
      cxo $$4 = $$1.a($$2);
      if (!$$4.f() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.L();
         cxo $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(btb $$0, cma $$1) {
      boolean $$2 = false;
      cxo $$3 = $$1.l().v();
      cxo $$4 = a(null, $$0, $$3, null);
      if ($$4.f()) {
         $$2 = true;
         $$1.a(cxo.k);
         $$1.at();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cxo a(@Nullable btb $$0, btb $$1, cxo $$2, @Nullable jm $$3) {
      if ($$1 instanceof bts $$4 && $$3 != null) {
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

   private static boolean a(btb $$0, cxo $$1, int $$2, @Nullable jm $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bts $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(btb $$0, btb $$1, cxo $$2, int $$3, jm $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bts $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cxo b(@Nullable btb $$0, btb $$1, cxo $$2, int $$3, @Nullable jm $$4) {
      cxo $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.f()) {
            $$1.a($$3, $$2);
            $$2 = cxo.k;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.k() - $$5.L();
            int $$9 = Math.min($$2.L(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dvy $$10 && !$$10.u()) {
               int $$11 = 0;
               if ($$0 instanceof dvy $$12 && $$10.i >= $$12.i) {
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
   private static btb b(dhh $$0, jh $$1, dvy $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static btb a(dhh $$0, dvx $$1, jh $$2, dxu $$3) {
      return a($$0, $$2, $$3, $$1.G(), $$1.H() + 1.0, $$1.I());
   }

   public static List<cma> b(dhh $$0, dvx $$1) {
      fbs $$2 = $$1.am_().d($$1.G() - 0.5, $$1.H() - 0.5, $$1.I() - 0.5);
      return $$0.a(cma.class, $$2, bvo.a);
   }

   @Nullable
   public static btb a(dhh $$0, jh $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static btb a(dhh $$0, jh $$1, dxu $$2, double $$3, double $$4, double $$5) {
      btb $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static btb b(dhh $$0, jh $$1, dxu $$2) {
      dkl $$3 = $$2.b();
      if ($$3 instanceof btt) {
         return ((btt)$$3).a($$2, $$0, $$1);
      } else if ($$2.x() && $$0.c_($$1) instanceof btb $$5) {
         if ($$5 instanceof dvd && $$3 instanceof dlp) {
            $$5 = dlp.a((dlp)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static btb a(dhh $$0, double $$1, double $$2, double $$3) {
      List<bvj> $$4 = $$0.a((bvj)null, new fbs($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bvo.d);
      return !$$4.isEmpty() ? (btb)$$4.get($$0.A.a($$4.size())) : null;
   }

   private static boolean a(cxo $$0, cxo $$1) {
      return $$0.L() <= $$0.k() && cxo.c($$0, $$1);
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
   protected jz<cxo> f() {
      return this.g;
   }

   @Override
   protected void a(jz<cxo> $$0) {
      this.g = $$0;
   }

   public static void a(dhh $$0, jh $$1, dxu $$2, bvj $$3, dvy $$4) {
      if ($$3 instanceof cma $$5 && !$$5.l().f() && $$3.cR().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.am_())) {
         a($$0, $$1, $$2, $$4, () -> a((btb)$$4, $$5));
      }
   }

   @Override
   protected ctb a(int $$0, cpv $$1) {
      return new cuc($$0, $$1, this);
   }
}

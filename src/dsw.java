import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dsw extends dtc implements dsv {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private jx<cvs> g = jx.a(5, cvs.k);
   private int h = -1;
   private long i;
   private jk j;

   public dsw(jf $$0, dus $$1) {
      super(drx.r, $$0, $$1);
      this.j = $$1.c(dlh.b);
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.g = jx.a(this.b(), cvs.k);
      if (!this.b_($$0)) {
         brm.b($$0, this.g, $$1);
      }

      this.h = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brm.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public cvs a(int $$0, int $$1) {
      this.e_(null);
      return brm.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cvs $$1) {
      this.e_(null);
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   @Override
   public void c(dus $$0) {
      super.c($$0);
      this.j = $$0.c(dlh.b);
   }

   @Override
   protected xe j() {
      return xe.c("container.hopper");
   }

   public static void a(dej $$0, jf $$1, dus $$2, dsw $$3) {
      $$3.h--;
      $$3.i = $$0.aa();
      if (!$$3.t()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dsv)$$3));
      }
   }

   private static boolean a(dej $$0, jf $$1, dus $$2, dsw $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.t() && $$2.c(dlh.c)) {
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
      for (cvs $$0 : this.g) {
         if ($$0.f() || $$0.K() != $$0.k()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dej $$0, jf $$1, dsw $$2) {
      brl $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         jk $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               cvs $$6 = $$2.a($$5);
               if (!$$6.f()) {
                  int $$7 = $$6.K();
                  cvs $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(brl $$0, jk $$1) {
      if ($$0 instanceof bsc $$2) {
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

   private static boolean b(brl $$0, jk $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         cvs $$4 = $$0.a($$3);
         if ($$4.K() < $$4.k()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(dej $$0, dsv $$1) {
      jf $$2 = jf.a($$1.L(), $$1.M() + 1.0, $$1.O());
      dus $$3 = $$0.a_($$2);
      brl $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         jk $$5 = jk.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.P() && $$3.m($$0, $$2) && !$$3.a(awv.cA);
         if (!$$7) {
            for (ckh $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dsv $$0, brl $$1, int $$2, jk $$3) {
      cvs $$4 = $$1.a($$2);
      if (!$$4.f() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.K();
         cvs $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(brl $$0, ckh $$1) {
      boolean $$2 = false;
      cvs $$3 = $$1.m().u();
      cvs $$4 = a(null, $$0, $$3, null);
      if ($$4.f()) {
         $$2 = true;
         $$1.a(cvs.k);
         $$1.as();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cvs a(@Nullable brl $$0, brl $$1, cvs $$2, @Nullable jk $$3) {
      if ($$1 instanceof bsc $$4 && $$3 != null) {
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

   private static boolean a(brl $$0, cvs $$1, int $$2, @Nullable jk $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bsc $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(brl $$0, brl $$1, cvs $$2, int $$3, jk $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bsc $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cvs b(@Nullable brl $$0, brl $$1, cvs $$2, int $$3, @Nullable jk $$4) {
      cvs $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.f()) {
            $$1.a($$3, $$2);
            $$2 = cvs.k;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.k() - $$5.K();
            int $$9 = Math.min($$2.K(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dsw $$10 && !$$10.u()) {
               int $$11 = 0;
               if ($$0 instanceof dsw $$12 && $$10.i >= $$12.i) {
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
   private static brl b(dej $$0, jf $$1, dsw $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static brl a(dej $$0, dsv $$1, jf $$2, dus $$3) {
      return a($$0, $$2, $$3, $$1.L(), $$1.M() + 1.0, $$1.O());
   }

   public static List<ckh> b(dej $$0, dsv $$1) {
      eyr $$2 = $$1.am_().d($$1.L() - 0.5, $$1.M() - 0.5, $$1.O() - 0.5);
      return $$0.a(ckh.class, $$2, btw.a);
   }

   @Nullable
   public static brl a(dej $$0, jf $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static brl a(dej $$0, jf $$1, dus $$2, double $$3, double $$4, double $$5) {
      brl $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static brl b(dej $$0, jf $$1, dus $$2) {
      dhm $$3 = $$2.b();
      if ($$3 instanceof bsd) {
         return ((bsd)$$3).a($$2, $$0, $$1);
      } else if ($$2.x() && $$0.c_($$1) instanceof brl $$5) {
         if ($$5 instanceof dsc && $$3 instanceof dip) {
            $$5 = dip.a((dip)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static brl a(dej $$0, double $$1, double $$2, double $$3) {
      List<btr> $$4 = $$0.a((btr)null, new eyr($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), btw.d);
      return !$$4.isEmpty() ? (brl)$$4.get($$0.z.a($$4.size())) : null;
   }

   private static boolean a(cvs $$0, cvs $$1) {
      return $$0.K() <= $$0.k() && cvs.c($$0, $$1);
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
   protected jx<cvs> f() {
      return this.g;
   }

   @Override
   protected void a(jx<cvs> $$0) {
      this.g = $$0;
   }

   public static void a(dej $$0, jf $$1, dus $$2, btr $$3, dsw $$4) {
      if ($$3 instanceof ckh $$5 && !$$5.m().f() && $$3.cO().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.am_())) {
         a($$0, $$1, $$2, $$4, () -> a((brl)$$4, $$5));
      }
   }

   @Override
   protected cqz a(int $$0, cnw $$1) {
      return new csa($$0, $$1, this);
   }
}

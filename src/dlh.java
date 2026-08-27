import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dlh extends dlm implements dlg {
   public static final int e = 8;
   public static final int f = 5;
   private static final int[][] g = new int[54][];
   private iu<cqm> h = iu.a(5, cqm.h);
   private int i = -1;
   private long j;
   private ih k;

   public dlh(ib $$0, dnb $$1) {
      super(dkk.r, $$0, $$1);
      this.k = $$1.c(ddw.b);
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.h = iu.a(this.b(), cqm.h);
      if (!this.c_($$0)) {
         bmx.b($$0, this.h);
      }

      this.i = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         bmx.a($$0, this.h);
      }

      $$0.a("TransferCooldown", this.i);
   }

   @Override
   public int b() {
      return this.h.size();
   }

   @Override
   public cqm a(int $$0, int $$1) {
      this.e_(null);
      return bmx.a(this.j(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cqm $$1) {
      this.e_(null);
      this.j().set($$0, $$1);
      if ($$1.M() > this.ak_()) {
         $$1.f(this.ak_());
      }
   }

   @Override
   public void b(dnb $$0) {
      super.b($$0);
      this.k = $$0.c(ddw.b);
   }

   @Override
   protected vu k() {
      return vu.c("container.hopper");
   }

   public static void a(cxb $$0, ib $$1, dnb $$2, dlh $$3) {
      $$3.i--;
      $$3.j = $$0.X();
      if (!$$3.s()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dlg)$$3));
      }
   }

   private static boolean a(cxb $$0, ib $$1, dnb $$2, dlh $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.s() && $$2.c(ddw.c)) {
            boolean $$5 = false;
            if (!$$3.ai_()) {
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
      for (cqm $$0 : this.h) {
         if ($$0.b() || $$0.M() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(cxb $$0, ib $$1, dlh $$2) {
      bmw $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         ih $$4 = $$2.k.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               cqm $$6 = $$2.a($$5);
               if (!$$6.b()) {
                  int $$7 = $$6.M();
                  cqm $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
                  if ($$8.b()) {
                     $$3.e();
                     return true;
                  }

                  $$6.f($$7);
                  if ($$7 == 1) {
                     $$2.a($$5, $$6);
                  }
               }
            }

            return false;
         }
      }
   }

   private static int[] a(bmw $$0, ih $$1) {
      if ($$0 instanceof bnp $$2) {
         return $$2.a($$1);
      } else {
         int $$3 = $$0.b();
         if ($$3 < g.length) {
            int[] $$4 = g[$$3];
            if ($$4 != null) {
               return $$4;
            } else {
               int[] $$5 = c($$3);
               g[$$3] = $$5;
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

   private static boolean b(bmw $$0, ih $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         cqm $$4 = $$0.a($$3);
         if ($$4.M() < $$4.g()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(cxb $$0, dlg $$1) {
      ib $$2 = ib.a($$1.H(), $$1.I() + 1.0, $$1.J());
      dnb $$3 = $$0.a_($$2);
      bmw $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         ih $$5 = ih.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.K() && $$3.r($$0, $$2) && !$$3.a(aun.ct);
         if (!$$7) {
            for (cfe $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dlg $$0, bmw $$1, int $$2, ih $$3) {
      cqm $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.M();
         cqm $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$4.f($$5);
         if ($$5 == 1) {
            $$1.a($$2, $$4);
         }
      }

      return false;
   }

   public static boolean a(bmw $$0, cfe $$1) {
      boolean $$2 = false;
      cqm $$3 = $$1.p().q();
      cqm $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.a(cqm.h);
         $$1.am();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cqm a(@Nullable bmw $$0, bmw $$1, cqm $$2, @Nullable ih $$3) {
      if ($$1 instanceof bnp $$4 && $$3 != null) {
         int[] $$5 = $$4.a($$3);

         for (int $$6 = 0; $$6 < $$5.length && !$$2.b(); $$6++) {
            $$2 = b($$0, $$1, $$2, $$5[$$6], $$3);
         }

         return $$2;
      }

      int $$7 = $$1.b();

      for (int $$8 = 0; $$8 < $$7 && !$$2.b(); $$8++) {
         $$2 = b($$0, $$1, $$2, $$8, $$3);
      }

      return $$2;
   }

   private static boolean a(bmw $$0, cqm $$1, int $$2, @Nullable ih $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bnp $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bmw $$0, bmw $$1, cqm $$2, int $$3, ih $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bnp $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cqm b(@Nullable bmw $$0, bmw $$1, cqm $$2, int $$3, @Nullable ih $$4) {
      cqm $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.ai_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = cqm.h;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.M();
            int $$9 = Math.min($$2.M(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dlh $$10 && !$$10.t()) {
               int $$11 = 0;
               if ($$0 instanceof dlh $$12 && $$10.j >= $$12.j) {
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
   private static bmw b(cxb $$0, ib $$1, dlh $$2) {
      return a($$0, $$1.a($$2.k));
   }

   @Nullable
   private static bmw a(cxb $$0, dlg $$1, ib $$2, dnb $$3) {
      return a($$0, $$2, $$3, $$1.H(), $$1.I() + 1.0, $$1.J());
   }

   public static List<cfe> b(cxb $$0, dlg $$1) {
      epo $$2 = $$1.aj_().d($$1.H() - 0.5, $$1.I() - 0.5, $$1.J() - 0.5);
      return $$0.a(cfe.class, $$2, bpc.a);
   }

   @Nullable
   public static bmw a(cxb $$0, ib $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bmw a(cxb $$0, ib $$1, dnb $$2, double $$3, double $$4, double $$5) {
      bmw $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static bmw b(cxb $$0, ib $$1, dnb $$2) {
      dac $$3 = $$2.b();
      if ($$3 instanceof bnq) {
         return ((bnq)$$3).a($$2, $$0, $$1);
      } else if ($$2.t() && $$0.c_($$1) instanceof bmw $$5) {
         if ($$5 instanceof dkp && $$3 instanceof dbf) {
            $$5 = dbf.a((dbf)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static bmw a(cxb $$0, double $$1, double $$2, double $$3) {
      List<box> $$4 = $$0.a((box)null, new epo($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bpc.d);
      return !$$4.isEmpty() ? (bmw)$$4.get($$0.z.a($$4.size())) : null;
   }

   private static boolean a(cqm $$0, cqm $$1) {
      return $$0.M() <= $$0.g() && cqm.c($$0, $$1);
   }

   @Override
   public double H() {
      return (double)this.p.u() + 0.5;
   }

   @Override
   public double I() {
      return (double)this.p.v() + 0.5;
   }

   @Override
   public double J() {
      return (double)this.p.w() + 0.5;
   }

   @Override
   public boolean K() {
      return true;
   }

   private void d(int $$0) {
      this.i = $$0;
   }

   private boolean s() {
      return this.i > 0;
   }

   private boolean t() {
      return this.i > 8;
   }

   @Override
   protected iu<cqm> j() {
      return this.h;
   }

   @Override
   protected void a(iu<cqm> $$0) {
      this.h = $$0;
   }

   public static void a(cxb $$0, ib $$1, dnb $$2, box $$3, dlh $$4) {
      if ($$3 instanceof cfe $$5 && !$$5.p().b() && $$3.cH().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.aj_())) {
         a($$0, $$1, $$2, $$4, () -> a((bmw)$$4, $$5));
      }
   }

   @Override
   protected clq a(int $$0, cit $$1) {
      return new cmp($$0, $$1, this);
   }
}

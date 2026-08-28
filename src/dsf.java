import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dsf extends dsl implements dse {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private jw<cvl> g = jw.a(5, cvl.k);
   private int h = -1;
   private long i;
   private jj j;

   public dsf(je $$0, dua $$1) {
      super(drg.r, $$0, $$1);
      this.j = $$1.c(dkq.b);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.g = jw.a(this.b(), cvl.k);
      if (!this.b_($$0)) {
         bre.b($$0, this.g, $$1);
      }

      this.h = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bre.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public cvl a(int $$0, int $$1) {
      this.e_(null);
      return bre.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cvl $$1) {
      this.e_(null);
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   @Override
   public void c(dua $$0) {
      super.c($$0);
      this.j = $$0.c(dkq.b);
   }

   @Override
   protected xd j() {
      return xd.c("container.hopper");
   }

   public static void a(dds $$0, je $$1, dua $$2, dsf $$3) {
      $$3.h--;
      $$3.i = $$0.aa();
      if (!$$3.t()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dse)$$3));
      }
   }

   private static boolean a(dds $$0, je $$1, dua $$2, dsf $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.t() && $$2.c(dkq.c)) {
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
      for (cvl $$0 : this.g) {
         if ($$0.f() || $$0.J() != $$0.k()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dds $$0, je $$1, dsf $$2) {
      brd $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         jj $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               cvl $$6 = $$2.a($$5);
               if (!$$6.f()) {
                  int $$7 = $$6.J();
                  cvl $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(brd $$0, jj $$1) {
      if ($$0 instanceof bru $$2) {
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

   private static boolean b(brd $$0, jj $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         cvl $$4 = $$0.a($$3);
         if ($$4.J() < $$4.k()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(dds $$0, dse $$1) {
      je $$2 = je.a($$1.K(), $$1.L() + 1.0, $$1.M());
      dua $$3 = $$0.a_($$2);
      brd $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         jj $$5 = jj.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.O() && $$3.m($$0, $$2) && !$$3.a(aws.cA);
         if (!$$7) {
            for (cjz $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dse $$0, brd $$1, int $$2, jj $$3) {
      cvl $$4 = $$1.a($$2);
      if (!$$4.f() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.J();
         cvl $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(brd $$0, cjz $$1) {
      boolean $$2 = false;
      cvl $$3 = $$1.m().u();
      cvl $$4 = a(null, $$0, $$3, null);
      if ($$4.f()) {
         $$2 = true;
         $$1.a(cvl.k);
         $$1.as();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cvl a(@Nullable brd $$0, brd $$1, cvl $$2, @Nullable jj $$3) {
      if ($$1 instanceof bru $$4 && $$3 != null) {
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

   private static boolean a(brd $$0, cvl $$1, int $$2, @Nullable jj $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bru $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(brd $$0, brd $$1, cvl $$2, int $$3, jj $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bru $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cvl b(@Nullable brd $$0, brd $$1, cvl $$2, int $$3, @Nullable jj $$4) {
      cvl $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.f()) {
            $$1.a($$3, $$2);
            $$2 = cvl.k;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.k() - $$5.J();
            int $$9 = Math.min($$2.J(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dsf $$10 && !$$10.u()) {
               int $$11 = 0;
               if ($$0 instanceof dsf $$12 && $$10.i >= $$12.i) {
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
   private static brd b(dds $$0, je $$1, dsf $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static brd a(dds $$0, dse $$1, je $$2, dua $$3) {
      return a($$0, $$2, $$3, $$1.K(), $$1.L() + 1.0, $$1.M());
   }

   public static List<cjz> b(dds $$0, dse $$1) {
      exz $$2 = $$1.al_().d($$1.K() - 0.5, $$1.L() - 0.5, $$1.M() - 0.5);
      return $$0.a(cjz.class, $$2, bto.a);
   }

   @Nullable
   public static brd a(dds $$0, je $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static brd a(dds $$0, je $$1, dua $$2, double $$3, double $$4, double $$5) {
      brd $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static brd b(dds $$0, je $$1, dua $$2) {
      dgv $$3 = $$2.b();
      if ($$3 instanceof brv) {
         return ((brv)$$3).a($$2, $$0, $$1);
      } else if ($$2.x() && $$0.c_($$1) instanceof brd $$5) {
         if ($$5 instanceof drl && $$3 instanceof dhy) {
            $$5 = dhy.a((dhy)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static brd a(dds $$0, double $$1, double $$2, double $$3) {
      List<btj> $$4 = $$0.a((btj)null, new exz($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bto.d);
      return !$$4.isEmpty() ? (brd)$$4.get($$0.z.a($$4.size())) : null;
   }

   private static boolean a(cvl $$0, cvl $$1) {
      return $$0.J() <= $$0.k() && cvl.c($$0, $$1);
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
   protected jw<cvl> f() {
      return this.g;
   }

   @Override
   protected void a(jw<cvl> $$0) {
      this.g = $$0;
   }

   public static void a(dds $$0, je $$1, dua $$2, btj $$3, dsf $$4) {
      if ($$3 instanceof cjz $$5 && !$$5.m().f() && $$3.cO().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.al_())) {
         a($$0, $$1, $$2, $$4, () -> a((brd)$$4, $$5));
      }
   }

   @Override
   protected cqq a(int $$0, cno $$1) {
      return new crr($$0, $$1, this);
   }
}

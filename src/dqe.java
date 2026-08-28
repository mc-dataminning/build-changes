import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dqe extends dqk implements dqd {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private jr<cun> g = jr.a(5, cun.l);
   private int h = -1;
   private long i;
   private je j;

   public dqe(iz $$0, dsa $$1) {
      super(dph.r, $$0, $$1);
      this.j = $$1.c(dis.b);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.g = jr.a(this.b(), cun.l);
      if (!this.a_($$0)) {
         bqm.b($$0, this.g, $$1);
      }

      this.h = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqm.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public cun a(int $$0, int $$1) {
      this.e_(null);
      return bqm.a(this.j(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cun $$1) {
      this.e_(null);
      this.j().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   @Override
   public void b(dsa $$0) {
      super.b($$0);
      this.j = $$0.c(dis.b);
   }

   @Override
   protected xo k() {
      return xo.c("container.hopper");
   }

   public static void a(dbw $$0, iz $$1, dsa $$2, dqe $$3) {
      $$3.h--;
      $$3.i = $$0.Z();
      if (!$$3.u()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dqd)$$3));
      }
   }

   private static boolean a(dbw $$0, iz $$1, dsa $$2, dqe $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.u() && $$2.c(dis.c)) {
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
      for (cun $$0 : this.g) {
         if ($$0.e() || $$0.I() != $$0.j()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dbw $$0, iz $$1, dqe $$2) {
      bql $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         je $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               cun $$6 = $$2.a($$5);
               if (!$$6.e()) {
                  int $$7 = $$6.I();
                  cun $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
                  if ($$8.e()) {
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

   private static int[] a(bql $$0, je $$1) {
      if ($$0 instanceof bre $$2) {
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

   private static boolean b(bql $$0, je $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         cun $$4 = $$0.a($$3);
         if ($$4.I() < $$4.j()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(dbw $$0, dqd $$1) {
      iz $$2 = iz.a($$1.H(), $$1.I() + 1.0, $$1.J());
      dsa $$3 = $$0.a_($$2);
      bql $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         je $$5 = je.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.K() && $$3.r($$0, $$2) && !$$3.a(awo.cz);
         if (!$$7) {
            for (cjf $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dqd $$0, bql $$1, int $$2, je $$3) {
      cun $$4 = $$1.a($$2);
      if (!$$4.e() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.I();
         cun $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.e()) {
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

   public static boolean a(bql $$0, cjf $$1) {
      boolean $$2 = false;
      cun $$3 = $$1.p().s();
      cun $$4 = a(null, $$0, $$3, null);
      if ($$4.e()) {
         $$2 = true;
         $$1.a(cun.l);
         $$1.ao();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cun a(@Nullable bql $$0, bql $$1, cun $$2, @Nullable je $$3) {
      if ($$1 instanceof bre $$4 && $$3 != null) {
         int[] $$5 = $$4.a($$3);

         for (int $$6 = 0; $$6 < $$5.length && !$$2.e(); $$6++) {
            $$2 = b($$0, $$1, $$2, $$5[$$6], $$3);
         }

         return $$2;
      }

      int $$7 = $$1.b();

      for (int $$8 = 0; $$8 < $$7 && !$$2.e(); $$8++) {
         $$2 = b($$0, $$1, $$2, $$8, $$3);
      }

      return $$2;
   }

   private static boolean a(bql $$0, cun $$1, int $$2, @Nullable je $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bre $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bql $$0, bql $$1, cun $$2, int $$3, je $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bre $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cun b(@Nullable bql $$0, bql $$1, cun $$2, int $$3, @Nullable je $$4) {
      cun $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.e()) {
            $$1.a($$3, $$2);
            $$2 = cun.l;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.j() - $$5.I();
            int $$9 = Math.min($$2.I(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dqe $$10 && !$$10.v()) {
               int $$11 = 0;
               if ($$0 instanceof dqe $$12 && $$10.i >= $$12.i) {
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
   private static bql b(dbw $$0, iz $$1, dqe $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static bql a(dbw $$0, dqd $$1, iz $$2, dsa $$3) {
      return a($$0, $$2, $$3, $$1.H(), $$1.I() + 1.0, $$1.J());
   }

   public static List<cjf> b(dbw $$0, dqd $$1) {
      evk $$2 = $$1.aj_().d($$1.H() - 0.5, $$1.I() - 0.5, $$1.J() - 0.5);
      return $$0.a(cjf.class, $$2, bsx.a);
   }

   @Nullable
   public static bql a(dbw $$0, iz $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bql a(dbw $$0, iz $$1, dsa $$2, double $$3, double $$4, double $$5) {
      bql $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static bql b(dbw $$0, iz $$1, dsa $$2) {
      dex $$3 = $$2.b();
      if ($$3 instanceof brf) {
         return ((brf)$$3).a($$2, $$0, $$1);
      } else if ($$2.t() && $$0.c_($$1) instanceof bql $$5) {
         if ($$5 instanceof dpm && $$3 instanceof dga) {
            $$5 = dga.a((dga)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static bql a(dbw $$0, double $$1, double $$2, double $$3) {
      List<bss> $$4 = $$0.a((bss)null, new evk($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bsx.d);
      return !$$4.isEmpty() ? (bql)$$4.get($$0.z.a($$4.size())) : null;
   }

   private static boolean a(cun $$0, cun $$1) {
      return $$0.I() <= $$0.j() && cun.c($$0, $$1);
   }

   @Override
   public double H() {
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

   private boolean u() {
      return this.h > 0;
   }

   private boolean v() {
      return this.h > 8;
   }

   @Override
   protected jr<cun> j() {
      return this.g;
   }

   @Override
   protected void a(jr<cun> $$0) {
      this.g = $$0;
   }

   public static void a(dbw $$0, iz $$1, dsa $$2, bss $$3, dqe $$4) {
      if ($$3 instanceof cjf $$5 && !$$5.p().e() && $$3.cK().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.aj_())) {
         a($$0, $$1, $$2, $$4, () -> a((bql)$$4, $$5));
      }
   }

   @Override
   protected cps a(int $$0, cmu $$1) {
      return new cqr($$0, $$1, this);
   }
}

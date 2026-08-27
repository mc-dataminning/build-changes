import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dne extends dnk implements dnd {
   public static final int e = 8;
   public static final int f = 5;
   private static final int[][] g = new int[54][];
   private iu<crj> h = iu.a(5, crj.i);
   private int i = -1;
   private long j;
   private ih k;

   public dne(ib $$0, doz $$1) {
      super(dmh.r, $$0, $$1);
      this.k = $$1.c(dfs.b);
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.h = iu.a(this.b(), crj.i);
      if (!this.a_($$0)) {
         bnu.b($$0, this.h, $$1);
      }

      this.i = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bnu.a($$0, this.h, $$1);
      }

      $$0.a("TransferCooldown", this.i);
   }

   @Override
   public int b() {
      return this.h.size();
   }

   @Override
   public crj a(int $$0, int $$1) {
      this.e_(null);
      return bnu.a(this.j(), $$0, $$1);
   }

   @Override
   public void a(int $$0, crj $$1) {
      this.e_(null);
      this.j().set($$0, $$1);
      if ($$1.G() > this.aj_()) {
         $$1.e(this.aj_());
      }
   }

   @Override
   public void b(doz $$0) {
      super.b($$0);
      this.k = $$0.c(dfs.b);
   }

   @Override
   protected wg k() {
      return wg.c("container.hopper");
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dne $$3) {
      $$3.i--;
      $$3.j = $$0.Y();
      if (!$$3.t()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dnd)$$3));
      }
   }

   private static boolean a(cyx $$0, ib $$1, doz $$2, dne $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.t() && $$2.c(dfs.c)) {
            boolean $$5 = false;
            if (!$$3.ah_()) {
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
      for (crj $$0 : this.h) {
         if ($$0.d() || $$0.G() != $$0.i()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(cyx $$0, ib $$1, dne $$2) {
      bnt $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         ih $$4 = $$2.k.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               crj $$6 = $$2.a($$5);
               if (!$$6.d()) {
                  int $$7 = $$6.G();
                  crj $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(bnt $$0, ih $$1) {
      if ($$0 instanceof bom $$2) {
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

   private static boolean b(bnt $$0, ih $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         crj $$4 = $$0.a($$3);
         if ($$4.G() < $$4.i()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(cyx $$0, dnd $$1) {
      ib $$2 = ib.a($$1.H(), $$1.I() + 1.0, $$1.J());
      doz $$3 = $$0.a_($$2);
      bnt $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         ih $$5 = ih.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.K() && $$3.r($$0, $$2) && !$$3.a(avc.ct);
         if (!$$7) {
            for (cgd $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dnd $$0, bnt $$1, int $$2, ih $$3) {
      crj $$4 = $$1.a($$2);
      if (!$$4.d() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.G();
         crj $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(bnt $$0, cgd $$1) {
      boolean $$2 = false;
      crj $$3 = $$1.p().r();
      crj $$4 = a(null, $$0, $$3, null);
      if ($$4.d()) {
         $$2 = true;
         $$1.a(crj.i);
         $$1.am();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static crj a(@Nullable bnt $$0, bnt $$1, crj $$2, @Nullable ih $$3) {
      if ($$1 instanceof bom $$4 && $$3 != null) {
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

   private static boolean a(bnt $$0, crj $$1, int $$2, @Nullable ih $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bom $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bnt $$0, bnt $$1, crj $$2, int $$3, ih $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bom $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static crj b(@Nullable bnt $$0, bnt $$1, crj $$2, int $$3, @Nullable ih $$4) {
      crj $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.ah_();
         if ($$5.d()) {
            $$1.a($$3, $$2);
            $$2 = crj.i;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.i() - $$5.G();
            int $$9 = Math.min($$2.G(), $$8);
            $$2.g($$9);
            $$5.f($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dne $$10 && !$$10.u()) {
               int $$11 = 0;
               if ($$0 instanceof dne $$12 && $$10.j >= $$12.j) {
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
   private static bnt b(cyx $$0, ib $$1, dne $$2) {
      return a($$0, $$1.a($$2.k));
   }

   @Nullable
   private static bnt a(cyx $$0, dnd $$1, ib $$2, doz $$3) {
      return a($$0, $$2, $$3, $$1.H(), $$1.I() + 1.0, $$1.J());
   }

   public static List<cgd> b(cyx $$0, dnd $$1) {
      erv $$2 = $$1.ai_().d($$1.H() - 0.5, $$1.I() - 0.5, $$1.J() - 0.5);
      return $$0.a(cgd.class, $$2, bqa.a);
   }

   @Nullable
   public static bnt a(cyx $$0, ib $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bnt a(cyx $$0, ib $$1, doz $$2, double $$3, double $$4, double $$5) {
      bnt $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static bnt b(cyx $$0, ib $$1, doz $$2) {
      dby $$3 = $$2.b();
      if ($$3 instanceof bon) {
         return ((bon)$$3).a($$2, $$0, $$1);
      } else if ($$2.t() && $$0.c_($$1) instanceof bnt $$5) {
         if ($$5 instanceof dmm && $$3 instanceof ddb) {
            $$5 = ddb.a((ddb)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static bnt a(cyx $$0, double $$1, double $$2, double $$3) {
      List<bpv> $$4 = $$0.a((bpv)null, new erv($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bqa.d);
      return !$$4.isEmpty() ? (bnt)$$4.get($$0.z.a($$4.size())) : null;
   }

   private static boolean a(crj $$0, crj $$1) {
      return $$0.G() <= $$0.i() && crj.c($$0, $$1);
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

   private boolean t() {
      return this.i > 0;
   }

   private boolean u() {
      return this.i > 8;
   }

   @Override
   protected iu<crj> j() {
      return this.h;
   }

   @Override
   protected void a(iu<crj> $$0) {
      this.h = $$0;
   }

   public static void a(cyx $$0, ib $$1, doz $$2, bpv $$3, dne $$4) {
      if ($$3 instanceof cgd $$5 && !$$5.p().d() && $$3.cH().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.ai_())) {
         a($$0, $$1, $$2, $$4, () -> a((bnt)$$4, $$5));
      }
   }

   @Override
   protected cmp a(int $$0, cjs $$1) {
      return new cno($$0, $$1, this);
   }
}

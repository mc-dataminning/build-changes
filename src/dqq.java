import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dqq extends dqw implements dqp {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private js<cud> g = js.a(5, cud.l);
   private int h = -1;
   private long i;
   private jf j;

   public dqq(ja $$0, dsl $$1) {
      super(dps.r, $$0, $$1);
      this.j = $$1.c(djd.b);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.g = js.a(this.b(), cud.l);
      if (!this.a_($$0)) {
         bqb.b($$0, this.g, $$1);
      }

      this.h = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqb.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public cud a(int $$0, int $$1) {
      this.e_(null);
      return bqb.a(this.j(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cud $$1) {
      this.e_(null);
      this.j().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   @Override
   public void b(dsl $$0) {
      super.b($$0);
      this.j = $$0.c(djd.b);
   }

   @Override
   protected wu k() {
      return wu.c("container.hopper");
   }

   public static void a(dcg $$0, ja $$1, dsl $$2, dqq $$3) {
      $$3.h--;
      $$3.i = $$0.Z();
      if (!$$3.u()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dqp)$$3));
      }
   }

   private static boolean a(dcg $$0, ja $$1, dsl $$2, dqq $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.u() && $$2.c(djd.c)) {
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
      for (cud $$0 : this.g) {
         if ($$0.e() || $$0.H() != $$0.j()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dcg $$0, ja $$1, dqq $$2) {
      bqa $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         jf $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               cud $$6 = $$2.a($$5);
               if (!$$6.e()) {
                  int $$7 = $$6.H();
                  cud $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(bqa $$0, jf $$1) {
      if ($$0 instanceof bqt $$2) {
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

   private static boolean b(bqa $$0, jf $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         cud $$4 = $$0.a($$3);
         if ($$4.H() < $$4.j()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(dcg $$0, dqp $$1) {
      ja $$2 = ja.a($$1.H(), $$1.I() + 1.0, $$1.J());
      dsl $$3 = $$0.a_($$2);
      bqa $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         jf $$5 = jf.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.K() && $$3.r($$0, $$2) && !$$3.a(avw.cz);
         if (!$$7) {
            for (civ $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dqp $$0, bqa $$1, int $$2, jf $$3) {
      cud $$4 = $$1.a($$2);
      if (!$$4.e() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.H();
         cud $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(bqa $$0, civ $$1) {
      boolean $$2 = false;
      cud $$3 = $$1.p().s();
      cud $$4 = a(null, $$0, $$3, null);
      if ($$4.e()) {
         $$2 = true;
         $$1.a(cud.l);
         $$1.aq();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cud a(@Nullable bqa $$0, bqa $$1, cud $$2, @Nullable jf $$3) {
      if ($$1 instanceof bqt $$4 && $$3 != null) {
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

   private static boolean a(bqa $$0, cud $$1, int $$2, @Nullable jf $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bqt $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bqa $$0, bqa $$1, cud $$2, int $$3, jf $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bqt $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cud b(@Nullable bqa $$0, bqa $$1, cud $$2, int $$3, @Nullable jf $$4) {
      cud $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.e()) {
            $$1.a($$3, $$2);
            $$2 = cud.l;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.j() - $$5.H();
            int $$9 = Math.min($$2.H(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dqq $$10 && !$$10.v()) {
               int $$11 = 0;
               if ($$0 instanceof dqq $$12 && $$10.i >= $$12.i) {
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
   private static bqa b(dcg $$0, ja $$1, dqq $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static bqa a(dcg $$0, dqp $$1, ja $$2, dsl $$3) {
      return a($$0, $$2, $$3, $$1.H(), $$1.I() + 1.0, $$1.J());
   }

   public static List<civ> b(dcg $$0, dqp $$1) {
      ewc $$2 = $$1.ai_().d($$1.H() - 0.5, $$1.I() - 0.5, $$1.J() - 0.5);
      return $$0.a(civ.class, $$2, bsm.a);
   }

   @Nullable
   public static bqa a(dcg $$0, ja $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bqa a(dcg $$0, ja $$1, dsl $$2, double $$3, double $$4, double $$5) {
      bqa $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static bqa b(dcg $$0, ja $$1, dsl $$2) {
      dfi $$3 = $$2.b();
      if ($$3 instanceof bqu) {
         return ((bqu)$$3).a($$2, $$0, $$1);
      } else if ($$2.t() && $$0.c_($$1) instanceof bqa $$5) {
         if ($$5 instanceof dpx && $$3 instanceof dgl) {
            $$5 = dgl.a((dgl)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static bqa a(dcg $$0, double $$1, double $$2, double $$3) {
      List<bsh> $$4 = $$0.a((bsh)null, new ewc($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bsm.d);
      return !$$4.isEmpty() ? (bqa)$$4.get($$0.z.a($$4.size())) : null;
   }

   private static boolean a(cud $$0, cud $$1) {
      return $$0.H() <= $$0.j() && cud.c($$0, $$1);
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
   protected js<cud> j() {
      return this.g;
   }

   @Override
   protected void a(js<cud> $$0) {
      this.g = $$0;
   }

   public static void a(dcg $$0, ja $$1, dsl $$2, bsh $$3, dqq $$4) {
      if ($$3 instanceof civ $$5 && !$$5.p().e() && $$3.cM().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.ai_())) {
         a($$0, $$1, $$2, $$4, () -> a((bqa)$$4, $$5));
      }
   }

   @Override
   protected cpi a(int $$0, cmk $$1) {
      return new cqi($$0, $$1, this);
   }
}

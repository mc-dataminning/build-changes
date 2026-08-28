import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dqb extends dqh implements dqa {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private jr<cuk> g = jr.a(5, cuk.l);
   private int h = -1;
   private long i;
   private je j;

   public dqb(iz $$0, drx $$1) {
      super(dpe.r, $$0, $$1);
      this.j = $$1.c(dip.b);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.g = jr.a(this.b(), cuk.l);
      if (!this.a_($$0)) {
         bqj.b($$0, this.g, $$1);
      }

      this.h = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqj.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public cuk a(int $$0, int $$1) {
      this.e_(null);
      return bqj.a(this.j(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cuk $$1) {
      this.e_(null);
      this.j().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   @Override
   public void b(drx $$0) {
      super.b($$0);
      this.j = $$0.c(dip.b);
   }

   @Override
   protected xl k() {
      return xl.c("container.hopper");
   }

   public static void a(dbt $$0, iz $$1, drx $$2, dqb $$3) {
      $$3.h--;
      $$3.i = $$0.Z();
      if (!$$3.u()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dqa)$$3));
      }
   }

   private static boolean a(dbt $$0, iz $$1, drx $$2, dqb $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.u() && $$2.c(dip.c)) {
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
      for (cuk $$0 : this.g) {
         if ($$0.e() || $$0.I() != $$0.j()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dbt $$0, iz $$1, dqb $$2) {
      bqi $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         je $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               cuk $$6 = $$2.a($$5);
               if (!$$6.e()) {
                  int $$7 = $$6.I();
                  cuk $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(bqi $$0, je $$1) {
      if ($$0 instanceof brb $$2) {
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

   private static boolean b(bqi $$0, je $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         cuk $$4 = $$0.a($$3);
         if ($$4.I() < $$4.j()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(dbt $$0, dqa $$1) {
      iz $$2 = iz.a($$1.H(), $$1.I() + 1.0, $$1.J());
      drx $$3 = $$0.a_($$2);
      bqi $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         je $$5 = je.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.K() && $$3.r($$0, $$2) && !$$3.a(awl.cz);
         if (!$$7) {
            for (cjc $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dqa $$0, bqi $$1, int $$2, je $$3) {
      cuk $$4 = $$1.a($$2);
      if (!$$4.e() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.I();
         cuk $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(bqi $$0, cjc $$1) {
      boolean $$2 = false;
      cuk $$3 = $$1.p().s();
      cuk $$4 = a(null, $$0, $$3, null);
      if ($$4.e()) {
         $$2 = true;
         $$1.a(cuk.l);
         $$1.ao();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cuk a(@Nullable bqi $$0, bqi $$1, cuk $$2, @Nullable je $$3) {
      if ($$1 instanceof brb $$4 && $$3 != null) {
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

   private static boolean a(bqi $$0, cuk $$1, int $$2, @Nullable je $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof brb $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bqi $$0, bqi $$1, cuk $$2, int $$3, je $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof brb $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cuk b(@Nullable bqi $$0, bqi $$1, cuk $$2, int $$3, @Nullable je $$4) {
      cuk $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.e()) {
            $$1.a($$3, $$2);
            $$2 = cuk.l;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.j() - $$5.I();
            int $$9 = Math.min($$2.I(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dqb $$10 && !$$10.v()) {
               int $$11 = 0;
               if ($$0 instanceof dqb $$12 && $$10.i >= $$12.i) {
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
   private static bqi b(dbt $$0, iz $$1, dqb $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static bqi a(dbt $$0, dqa $$1, iz $$2, drx $$3) {
      return a($$0, $$2, $$3, $$1.H(), $$1.I() + 1.0, $$1.J());
   }

   public static List<cjc> b(dbt $$0, dqa $$1) {
      evh $$2 = $$1.aj_().d($$1.H() - 0.5, $$1.I() - 0.5, $$1.J() - 0.5);
      return $$0.a(cjc.class, $$2, bsu.a);
   }

   @Nullable
   public static bqi a(dbt $$0, iz $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bqi a(dbt $$0, iz $$1, drx $$2, double $$3, double $$4, double $$5) {
      bqi $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static bqi b(dbt $$0, iz $$1, drx $$2) {
      deu $$3 = $$2.b();
      if ($$3 instanceof brc) {
         return ((brc)$$3).a($$2, $$0, $$1);
      } else if ($$2.t() && $$0.c_($$1) instanceof bqi $$5) {
         if ($$5 instanceof dpj && $$3 instanceof dfx) {
            $$5 = dfx.a((dfx)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static bqi a(dbt $$0, double $$1, double $$2, double $$3) {
      List<bsp> $$4 = $$0.a((bsp)null, new evh($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bsu.d);
      return !$$4.isEmpty() ? (bqi)$$4.get($$0.z.a($$4.size())) : null;
   }

   private static boolean a(cuk $$0, cuk $$1) {
      return $$0.I() <= $$0.j() && cuk.c($$0, $$1);
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
   protected jr<cuk> j() {
      return this.g;
   }

   @Override
   protected void a(jr<cuk> $$0) {
      this.g = $$0;
   }

   public static void a(dbt $$0, iz $$1, drx $$2, bsp $$3, dqb $$4) {
      if ($$3 instanceof cjc $$5 && !$$5.p().e() && $$3.cK().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.aj_())) {
         a($$0, $$1, $$2, $$4, () -> a((bqi)$$4, $$5));
      }
   }

   @Override
   protected cpp a(int $$0, cmr $$1) {
      return new cqo($$0, $$1, this);
   }
}

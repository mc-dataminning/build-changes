import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dlf extends dlk implements dle {
   public static final int e = 8;
   public static final int f = 5;
   private static final int[][] g = new int[54][];
   private iu<cqk> h = iu.a(5, cqk.h);
   private int i = -1;
   private long j;
   private ih k;

   public dlf(ib $$0, dmz $$1) {
      super(dki.r, $$0, $$1);
      this.k = $$1.c(ddu.b);
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.h = iu.a(this.b(), cqk.h);
      if (!this.c_($$0)) {
         bmw.b($$0, this.h);
      }

      this.i = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         bmw.a($$0, this.h);
      }

      $$0.a("TransferCooldown", this.i);
   }

   @Override
   public int b() {
      return this.h.size();
   }

   @Override
   public cqk a(int $$0, int $$1) {
      this.e_(null);
      return bmw.a(this.j(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cqk $$1) {
      this.e_(null);
      this.j().set($$0, $$1);
      if ($$1.M() > this.ak_()) {
         $$1.f(this.ak_());
      }
   }

   @Override
   public void b(dmz $$0) {
      super.b($$0);
      this.k = $$0.c(ddu.b);
   }

   @Override
   protected vu k() {
      return vu.c("container.hopper");
   }

   public static void a(cwz $$0, ib $$1, dmz $$2, dlf $$3) {
      $$3.i--;
      $$3.j = $$0.X();
      if (!$$3.s()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dle)$$3));
      }
   }

   private static boolean a(cwz $$0, ib $$1, dmz $$2, dlf $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.s() && $$2.c(ddu.c)) {
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
      for (cqk $$0 : this.h) {
         if ($$0.b() || $$0.M() != $$0.g()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(cwz $$0, ib $$1, dlf $$2) {
      bmv $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         ih $$4 = $$2.k.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               cqk $$6 = $$2.a($$5);
               if (!$$6.b()) {
                  int $$7 = $$6.M();
                  cqk $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(bmv $$0, ih $$1) {
      if ($$0 instanceof bno $$2) {
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

   private static boolean b(bmv $$0, ih $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         cqk $$4 = $$0.a($$3);
         if ($$4.M() < $$4.g()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(cwz $$0, dle $$1) {
      ib $$2 = ib.a($$1.H(), $$1.I() + 1.0, $$1.J());
      dmz $$3 = $$0.a_($$2);
      bmv $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         ih $$5 = ih.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         if (!$$3.r($$0, $$2)) {
            for (cfd $$7 : b($$0, $$1)) {
               if (a($$1, $$7)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dle $$0, bmv $$1, int $$2, ih $$3) {
      cqk $$4 = $$1.a($$2);
      if (!$$4.b() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.M();
         cqk $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(bmv $$0, cfd $$1) {
      boolean $$2 = false;
      cqk $$3 = $$1.p().q();
      cqk $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.a(cqk.h);
         $$1.am();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cqk a(@Nullable bmv $$0, bmv $$1, cqk $$2, @Nullable ih $$3) {
      if ($$1 instanceof bno $$4 && $$3 != null) {
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

   private static boolean a(bmv $$0, cqk $$1, int $$2, @Nullable ih $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bno $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bmv $$0, bmv $$1, cqk $$2, int $$3, ih $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bno $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cqk b(@Nullable bmv $$0, bmv $$1, cqk $$2, int $$3, @Nullable ih $$4) {
      cqk $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.ai_();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = cqk.h;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.g() - $$5.M();
            int $$9 = Math.min($$2.M(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dlf $$10 && !$$10.t()) {
               int $$11 = 0;
               if ($$0 instanceof dlf $$12 && $$10.j >= $$12.j) {
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
   private static bmv b(cwz $$0, ib $$1, dlf $$2) {
      return a($$0, $$1.a($$2.k));
   }

   @Nullable
   private static bmv a(cwz $$0, dle $$1, ib $$2, dmz $$3) {
      return a($$0, $$2, $$3, $$1.H(), $$1.I() + 1.0, $$1.J());
   }

   public static List<cfd> b(cwz $$0, dle $$1) {
      epm $$2 = $$1.aj_().d($$1.H() - 0.5, $$1.I() - 0.5, $$1.J() - 0.5);
      return $$0.a(cfd.class, $$2, bpb.a);
   }

   @Nullable
   public static bmv a(cwz $$0, ib $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bmv a(cwz $$0, ib $$1, dmz $$2, double $$3, double $$4, double $$5) {
      bmv $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static bmv b(cwz $$0, ib $$1, dmz $$2) {
      daa $$3 = $$2.b();
      if ($$3 instanceof bnp) {
         return ((bnp)$$3).a($$2, $$0, $$1);
      } else if ($$2.t() && $$0.c_($$1) instanceof bmv $$5) {
         if ($$5 instanceof dkn && $$3 instanceof dbd) {
            $$5 = dbd.a((dbd)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static bmv a(cwz $$0, double $$1, double $$2, double $$3) {
      List<bow> $$4 = $$0.a((bow)null, new epm($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bpb.d);
      return !$$4.isEmpty() ? (bmv)$$4.get($$0.z.a($$4.size())) : null;
   }

   private static boolean a(cqk $$0, cqk $$1) {
      return $$0.M() <= $$0.g() && cqk.c($$0, $$1);
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
   protected iu<cqk> j() {
      return this.h;
   }

   @Override
   protected void a(iu<cqk> $$0) {
      this.h = $$0;
   }

   public static void a(cwz $$0, ib $$1, dmz $$2, bow $$3, dlf $$4) {
      if ($$3 instanceof cfd $$5 && !$$5.p().b() && $$3.cH().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.aj_())) {
         a($$0, $$1, $$2, $$4, () -> a((bmv)$$4, $$5));
      }
   }

   @Override
   protected clo a(int $$0, cir $$1) {
      return new cmn($$0, $$1, this);
   }
}

import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dzr extends dzx implements dzq {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private static final int g = -1;
   private jp<dak> h = jp.a(5, dak.l);
   private int i = -1;
   private long j;
   private jc k;

   public dzr(iw $$0, ebq $$1) {
      super(dyq.s, $$0, $$1);
      this.k = $$1.c(dro.b);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.h = jp.a(this.b(), dak.l);
      if (!this.b_($$0)) {
         buw.b($$0, this.h, $$1);
      }

      this.i = $$0.b("TransferCooldown", -1);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         buw.a($$0, this.h, $$1);
      }

      $$0.a("TransferCooldown", this.i);
   }

   @Override
   public int b() {
      return this.h.size();
   }

   @Override
   public dak a(int $$0, int $$1) {
      this.d_(null);
      return buw.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, dak $$1) {
      this.d_(null);
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   @Override
   public void c(ebq $$0) {
      super.c($$0);
      this.k = $$0.c(dro.b);
   }

   @Override
   protected xg j() {
      return xg.c("container.hopper");
   }

   public static void a(dkj $$0, iw $$1, ebq $$2, dzr $$3) {
      $$3.i--;
      $$3.j = $$0.ae();
      if (!$$3.s()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dzq)$$3));
      }
   }

   private static boolean a(dkj $$0, iw $$1, ebq $$2, dzr $$3, BooleanSupplier $$4) {
      if ($$0.C) {
         return false;
      } else {
         if (!$$3.s() && $$2.c(dro.c)) {
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
      for (dak $$0 : this.h) {
         if ($$0.f() || $$0.M() != $$0.k()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dkj $$0, iw $$1, dzr $$2) {
      buv $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         jc $$4 = $$2.k.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               dak $$6 = $$2.a($$5);
               if (!$$6.f()) {
                  int $$7 = $$6.M();
                  dak $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(buv $$0, jc $$1) {
      if ($$0 instanceof bvm $$2) {
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

   private static boolean b(buv $$0, jc $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         dak $$4 = $$0.a($$3);
         if ($$4.M() < $$4.k()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(dkj $$0, dzq $$1) {
      iw $$2 = iw.a($$1.B(), $$1.C() + 1.0, $$1.D());
      ebq $$3 = $$0.a_($$2);
      buv $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         jc $$5 = jc.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.E() && $$3.m($$0, $$2) && !$$3.a(axn.cG);
         if (!$$7) {
            for (coo $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dzq $$0, buv $$1, int $$2, jc $$3) {
      dak $$4 = $$1.a($$2);
      if (!$$4.f() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.M();
         dak $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(buv $$0, coo $$1) {
      boolean $$2 = false;
      dak $$3 = $$1.e().v();
      dak $$4 = a(null, $$0, $$3, null);
      if ($$4.f()) {
         $$2 = true;
         $$1.a(dak.l);
         $$1.aq();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static dak a(@Nullable buv $$0, buv $$1, dak $$2, @Nullable jc $$3) {
      if ($$1 instanceof bvm $$4 && $$3 != null) {
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

   private static boolean a(buv $$0, dak $$1, int $$2, @Nullable jc $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bvm $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(buv $$0, buv $$1, dak $$2, int $$3, jc $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bvm $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static dak b(@Nullable buv $$0, buv $$1, dak $$2, int $$3, @Nullable jc $$4) {
      dak $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.f()) {
            $$1.a($$3, $$2);
            $$2 = dak.l;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.k() - $$5.M();
            int $$9 = Math.min($$2.M(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dzr $$10 && !$$10.t()) {
               int $$11 = 0;
               if ($$0 instanceof dzr $$12 && $$10.j >= $$12.j) {
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
   private static buv b(dkj $$0, iw $$1, dzr $$2) {
      return a($$0, $$1.a($$2.k));
   }

   @Nullable
   private static buv a(dkj $$0, dzq $$1, iw $$2, ebq $$3) {
      return a($$0, $$2, $$3, $$1.B(), $$1.C() + 1.0, $$1.D());
   }

   public static List<coo> b(dkj $$0, dzq $$1) {
      ffx $$2 = $$1.ai_().d($$1.B() - 0.5, $$1.C() - 0.5, $$1.D() - 0.5);
      return $$0.a(coo.class, $$2, bxl.a);
   }

   @Nullable
   public static buv a(dkj $$0, iw $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static buv a(dkj $$0, iw $$1, ebq $$2, double $$3, double $$4, double $$5) {
      buv $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static buv b(dkj $$0, iw $$1, ebq $$2) {
      dno $$3 = $$2.b();
      if ($$3 instanceof bvn) {
         return ((bvn)$$3).a($$2, $$0, $$1);
      } else if ($$2.x() && $$0.c_($$1) instanceof buv $$5) {
         if ($$5 instanceof dyw && $$3 instanceof dos) {
            $$5 = dos.a((dos)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static buv a(dkj $$0, double $$1, double $$2, double $$3) {
      List<bxe> $$4 = $$0.a((bxe)null, new ffx($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bxl.d);
      return !$$4.isEmpty() ? (buv)$$4.get($$0.A.a($$4.size())) : null;
   }

   private static boolean a(dak $$0, dak $$1) {
      return $$0.M() <= $$0.k() && dak.c($$0, $$1);
   }

   @Override
   public double B() {
      return (double)this.o.u() + 0.5;
   }

   @Override
   public double C() {
      return (double)this.o.v() + 0.5;
   }

   @Override
   public double D() {
      return (double)this.o.w() + 0.5;
   }

   @Override
   public boolean E() {
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
   protected jp<dak> f() {
      return this.h;
   }

   @Override
   protected void a(jp<dak> $$0) {
      this.h = $$0;
   }

   public static void a(dkj $$0, iw $$1, ebq $$2, bxe $$3, dzr $$4) {
      if ($$3 instanceof coo $$5 && !$$5.e().f() && $$3.cR().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.ai_())) {
         a($$0, $$1, $$2, $$4, () -> a((buv)$$4, $$5));
      }
   }

   @Override
   protected cwb a(int $$0, csh $$1) {
      return new cxc($$0, $$1, this);
   }
}

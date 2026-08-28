import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dst extends dsz implements dss {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private jw<cvp> g = jw.a(5, cvp.k);
   private int h = -1;
   private long i;
   private jj j;

   public dst(je $$0, duo $$1) {
      super(dru.r, $$0, $$1);
      this.j = $$1.c(dle.b);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.g = jw.a(this.b(), cvp.k);
      if (!this.b_($$0)) {
         brj.b($$0, this.g, $$1);
      }

      this.h = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         brj.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public cvp a(int $$0, int $$1) {
      this.e_(null);
      return brj.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cvp $$1) {
      this.e_(null);
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
   }

   @Override
   public void c(duo $$0) {
      super.c($$0);
      this.j = $$0.c(dle.b);
   }

   @Override
   protected xd j() {
      return xd.c("container.hopper");
   }

   public static void a(deg $$0, je $$1, duo $$2, dst $$3) {
      $$3.h--;
      $$3.i = $$0.aa();
      if (!$$3.t()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dss)$$3));
      }
   }

   private static boolean a(deg $$0, je $$1, duo $$2, dst $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.t() && $$2.c(dle.c)) {
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
      for (cvp $$0 : this.g) {
         if ($$0.f() || $$0.J() != $$0.k()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(deg $$0, je $$1, dst $$2) {
      bri $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         jj $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               cvp $$6 = $$2.a($$5);
               if (!$$6.f()) {
                  int $$7 = $$6.J();
                  cvp $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(bri $$0, jj $$1) {
      if ($$0 instanceof brz $$2) {
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

   private static boolean b(bri $$0, jj $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         cvp $$4 = $$0.a($$3);
         if ($$4.J() < $$4.k()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(deg $$0, dss $$1) {
      je $$2 = je.a($$1.L(), $$1.M() + 1.0, $$1.O());
      duo $$3 = $$0.a_($$2);
      bri $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         jj $$5 = jj.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.P() && $$3.m($$0, $$2) && !$$3.a(awt.cA);
         if (!$$7) {
            for (cke $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dss $$0, bri $$1, int $$2, jj $$3) {
      cvp $$4 = $$1.a($$2);
      if (!$$4.f() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.J();
         cvp $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(bri $$0, cke $$1) {
      boolean $$2 = false;
      cvp $$3 = $$1.m().u();
      cvp $$4 = a(null, $$0, $$3, null);
      if ($$4.f()) {
         $$2 = true;
         $$1.a(cvp.k);
         $$1.as();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cvp a(@Nullable bri $$0, bri $$1, cvp $$2, @Nullable jj $$3) {
      if ($$1 instanceof brz $$4 && $$3 != null) {
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

   private static boolean a(bri $$0, cvp $$1, int $$2, @Nullable jj $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof brz $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bri $$0, bri $$1, cvp $$2, int $$3, jj $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof brz $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static cvp b(@Nullable bri $$0, bri $$1, cvp $$2, int $$3, @Nullable jj $$4) {
      cvp $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.f()) {
            $$1.a($$3, $$2);
            $$2 = cvp.k;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.k() - $$5.J();
            int $$9 = Math.min($$2.J(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dst $$10 && !$$10.u()) {
               int $$11 = 0;
               if ($$0 instanceof dst $$12 && $$10.i >= $$12.i) {
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
   private static bri b(deg $$0, je $$1, dst $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static bri a(deg $$0, dss $$1, je $$2, duo $$3) {
      return a($$0, $$2, $$3, $$1.L(), $$1.M() + 1.0, $$1.O());
   }

   public static List<cke> b(deg $$0, dss $$1) {
      eyn $$2 = $$1.al_().d($$1.L() - 0.5, $$1.M() - 0.5, $$1.O() - 0.5);
      return $$0.a(cke.class, $$2, btt.a);
   }

   @Nullable
   public static bri a(deg $$0, je $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bri a(deg $$0, je $$1, duo $$2, double $$3, double $$4, double $$5) {
      bri $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static bri b(deg $$0, je $$1, duo $$2) {
      dhj $$3 = $$2.b();
      if ($$3 instanceof bsa) {
         return ((bsa)$$3).a($$2, $$0, $$1);
      } else if ($$2.x() && $$0.c_($$1) instanceof bri $$5) {
         if ($$5 instanceof drz && $$3 instanceof dim) {
            $$5 = dim.a((dim)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static bri a(deg $$0, double $$1, double $$2, double $$3) {
      List<bto> $$4 = $$0.a((bto)null, new eyn($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), btt.d);
      return !$$4.isEmpty() ? (bri)$$4.get($$0.z.a($$4.size())) : null;
   }

   private static boolean a(cvp $$0, cvp $$1) {
      return $$0.J() <= $$0.k() && cvp.c($$0, $$1);
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
   protected jw<cvp> f() {
      return this.g;
   }

   @Override
   protected void a(jw<cvp> $$0) {
      this.g = $$0;
   }

   public static void a(deg $$0, je $$1, duo $$2, bto $$3, dst $$4) {
      if ($$3 instanceof cke $$5 && !$$5.m().f() && $$3.cO().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.al_())) {
         a($$0, $$1, $$2, $$4, () -> a((bri)$$4, $$5));
      }
   }

   @Override
   protected cqw a(int $$0, cnt $$1) {
      return new crx($$0, $$1, this);
   }
}

import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dnn extends dnt implements dnm {
   public static final int e = 8;
   public static final int f = 5;
   private static final int[][] g = new int[54][];
   private iw<crs> h = iw.a(5, crs.i);
   private int i = -1;
   private long j;
   private ij k;

   public dnn(id $$0, dpi $$1) {
      super(dmq.r, $$0, $$1);
      this.k = $$1.c(dgb.b);
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.h = iw.a(this.b(), crs.i);
      if (!this.a_($$0)) {
         bnz.b($$0, this.h, $$1);
      }

      this.i = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bnz.a($$0, this.h, $$1);
      }

      $$0.a("TransferCooldown", this.i);
   }

   @Override
   public int b() {
      return this.h.size();
   }

   @Override
   public crs a(int $$0, int $$1) {
      this.e_(null);
      return bnz.a(this.j(), $$0, $$1);
   }

   @Override
   public void a(int $$0, crs $$1) {
      this.e_(null);
      this.j().set($$0, $$1);
      if ($$1.G() > this.ah_()) {
         $$1.e(this.ah_());
      }
   }

   @Override
   public void b(dpi $$0) {
      super.b($$0);
      this.k = $$0.c(dgb.b);
   }

   @Override
   protected wi k() {
      return wi.c("container.hopper");
   }

   public static void a(czg $$0, id $$1, dpi $$2, dnn $$3) {
      $$3.i--;
      $$3.j = $$0.Y();
      if (!$$3.t()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dnm)$$3));
      }
   }

   private static boolean a(czg $$0, id $$1, dpi $$2, dnn $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.t() && $$2.c(dgb.c)) {
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
      for (crs $$0 : this.h) {
         if ($$0.d() || $$0.G() != $$0.i()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(czg $$0, id $$1, dnn $$2) {
      bny $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         ij $$4 = $$2.k.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               crs $$6 = $$2.a($$5);
               if (!$$6.d()) {
                  int $$7 = $$6.G();
                  crs $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(bny $$0, ij $$1) {
      if ($$0 instanceof bor $$2) {
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

   private static boolean b(bny $$0, ij $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         crs $$4 = $$0.a($$3);
         if ($$4.G() < $$4.i()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(czg $$0, dnm $$1) {
      id $$2 = id.a($$1.H(), $$1.I() + 1.0, $$1.J());
      dpi $$3 = $$0.a_($$2);
      bny $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         ij $$5 = ij.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.K() && $$3.r($$0, $$2) && !$$3.a(ave.ct);
         if (!$$7) {
            for (cgk $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dnm $$0, bny $$1, int $$2, ij $$3) {
      crs $$4 = $$1.a($$2);
      if (!$$4.d() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.G();
         crs $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(bny $$0, cgk $$1) {
      boolean $$2 = false;
      crs $$3 = $$1.p().r();
      crs $$4 = a(null, $$0, $$3, null);
      if ($$4.d()) {
         $$2 = true;
         $$1.a(crs.i);
         $$1.am();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static crs a(@Nullable bny $$0, bny $$1, crs $$2, @Nullable ij $$3) {
      if ($$1 instanceof bor $$4 && $$3 != null) {
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

   private static boolean a(bny $$0, crs $$1, int $$2, @Nullable ij $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bor $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bny $$0, bny $$1, crs $$2, int $$3, ij $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bor $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static crs b(@Nullable bny $$0, bny $$1, crs $$2, int $$3, @Nullable ij $$4) {
      crs $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.d()) {
            $$1.a($$3, $$2);
            $$2 = crs.i;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.i() - $$5.G();
            int $$9 = Math.min($$2.G(), $$8);
            $$2.g($$9);
            $$5.f($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dnn $$10 && !$$10.u()) {
               int $$11 = 0;
               if ($$0 instanceof dnn $$12 && $$10.j >= $$12.j) {
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
   private static bny b(czg $$0, id $$1, dnn $$2) {
      return a($$0, $$1.a($$2.k));
   }

   @Nullable
   private static bny a(czg $$0, dnm $$1, id $$2, dpi $$3) {
      return a($$0, $$2, $$3, $$1.H(), $$1.I() + 1.0, $$1.J());
   }

   public static List<cgk> b(czg $$0, dnm $$1) {
      ese $$2 = $$1.ai_().d($$1.H() - 0.5, $$1.I() - 0.5, $$1.J() - 0.5);
      return $$0.a(cgk.class, $$2, bqf.a);
   }

   @Nullable
   public static bny a(czg $$0, id $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bny a(czg $$0, id $$1, dpi $$2, double $$3, double $$4, double $$5) {
      bny $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static bny b(czg $$0, id $$1, dpi $$2) {
      dch $$3 = $$2.b();
      if ($$3 instanceof bos) {
         return ((bos)$$3).a($$2, $$0, $$1);
      } else if ($$2.t() && $$0.c_($$1) instanceof bny $$5) {
         if ($$5 instanceof dmv && $$3 instanceof ddk) {
            $$5 = ddk.a((ddk)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static bny a(czg $$0, double $$1, double $$2, double $$3) {
      List<bqa> $$4 = $$0.a((bqa)null, new ese($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bqf.d);
      return !$$4.isEmpty() ? (bny)$$4.get($$0.z.a($$4.size())) : null;
   }

   private static boolean a(crs $$0, crs $$1) {
      return $$0.G() <= $$0.i() && crs.c($$0, $$1);
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
   protected iw<crs> j() {
      return this.h;
   }

   @Override
   protected void a(iw<crs> $$0) {
      this.h = $$0;
   }

   public static void a(czg $$0, id $$1, dpi $$2, bqa $$3, dnn $$4) {
      if ($$3 instanceof cgk $$5 && !$$5.p().d() && $$3.cH().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.ai_())) {
         a($$0, $$1, $$2, $$4, () -> a((bny)$$4, $$5));
      }
   }

   @Override
   protected cmw a(int $$0, cjz $$1) {
      return new cnv($$0, $$1, this);
   }
}

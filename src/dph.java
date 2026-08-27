import java.util.List;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class dph extends dpn implements dpg {
   public static final int d = 8;
   public static final int e = 5;
   private static final int[][] f = new int[54][];
   private jg<ctq> g = jg.a(5, ctq.i);
   private int h = -1;
   private long i;
   private it j;

   public dph(io $$0, drd $$1) {
      super(dok.r, $$0, $$1);
      this.j = $$1.c(dhv.b);
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.g = jg.a(this.b(), ctq.i);
      if (!this.a_($$0)) {
         bpq.b($$0, this.g, $$1);
      }

      this.h = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpq.a($$0, this.g, $$1);
      }

      $$0.a("TransferCooldown", this.h);
   }

   @Override
   public int b() {
      return this.g.size();
   }

   @Override
   public ctq a(int $$0, int $$1) {
      this.e_(null);
      return bpq.a(this.j(), $$0, $$1);
   }

   @Override
   public void a(int $$0, ctq $$1) {
      this.e_(null);
      this.j().set($$0, $$1);
      $$1.f(this.e_($$1));
   }

   @Override
   public void b(drd $$0) {
      super.b($$0);
      this.j = $$0.c(dhv.b);
   }

   @Override
   protected wx k() {
      return wx.c("container.hopper");
   }

   public static void a(daz $$0, io $$1, drd $$2, dph $$3) {
      $$3.h--;
      $$3.i = $$0.Y();
      if (!$$3.u()) {
         $$3.d(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (dpg)$$3));
      }
   }

   private static boolean a(daz $$0, io $$1, drd $$2, dph $$3, BooleanSupplier $$4) {
      if ($$0.B) {
         return false;
      } else {
         if (!$$3.u() && $$2.c(dhv.c)) {
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
      for (ctq $$0 : this.g) {
         if ($$0.e() || $$0.I() != $$0.j()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(daz $$0, io $$1, dph $$2) {
      bpp $$3 = b($$0, $$1, $$2);
      if ($$3 == null) {
         return false;
      } else {
         it $$4 = $$2.j.g();
         if (b($$3, $$4)) {
            return false;
         } else {
            for (int $$5 = 0; $$5 < $$2.b(); $$5++) {
               ctq $$6 = $$2.a($$5);
               if (!$$6.e()) {
                  int $$7 = $$6.I();
                  ctq $$8 = a($$2, $$3, $$2.a($$5, 1), $$4);
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

   private static int[] a(bpp $$0, it $$1) {
      if ($$0 instanceof bqi $$2) {
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

   private static boolean b(bpp $$0, it $$1) {
      int[] $$2 = a($$0, $$1);

      for (int $$3 : $$2) {
         ctq $$4 = $$0.a($$3);
         if ($$4.I() < $$4.j()) {
            return false;
         }
      }

      return true;
   }

   public static boolean a(daz $$0, dpg $$1) {
      io $$2 = io.a($$1.H(), $$1.I() + 1.0, $$1.J());
      drd $$3 = $$0.a_($$2);
      bpp $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         it $$5 = it.a;

         for (int $$6 : a($$4, $$5)) {
            if (a($$1, $$4, $$6, $$5)) {
               return true;
            }
         }

         return false;
      } else {
         boolean $$7 = $$1.K() && $$3.r($$0, $$2) && !$$3.a(avx.cz);
         if (!$$7) {
            for (cii $$8 : b($$0, $$1)) {
               if (a($$1, $$8)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean a(dpg $$0, bpp $$1, int $$2, it $$3) {
      ctq $$4 = $$1.a($$2);
      if (!$$4.e() && a($$0, $$1, $$4, $$2, $$3)) {
         int $$5 = $$4.I();
         ctq $$6 = a($$1, $$0, $$1.a($$2, 1), null);
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

   public static boolean a(bpp $$0, cii $$1) {
      boolean $$2 = false;
      ctq $$3 = $$1.p().s();
      ctq $$4 = a(null, $$0, $$3, null);
      if ($$4.e()) {
         $$2 = true;
         $$1.a(ctq.i);
         $$1.ao();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static ctq a(@Nullable bpp $$0, bpp $$1, ctq $$2, @Nullable it $$3) {
      if ($$1 instanceof bqi $$4 && $$3 != null) {
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

   private static boolean a(bpp $$0, ctq $$1, int $$2, @Nullable it $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         if ($$0 instanceof bqi $$4 && !$$4.a($$2, $$1, $$3)) {
            return false;
         }

         return true;
      }
   }

   private static boolean a(bpp $$0, bpp $$1, ctq $$2, int $$3, it $$4) {
      if (!$$1.a($$0, $$3, $$2)) {
         return false;
      } else {
         if ($$1 instanceof bqi $$5 && !$$5.b($$3, $$2, $$4)) {
            return false;
         }

         return true;
      }
   }

   private static ctq b(@Nullable bpp $$0, bpp $$1, ctq $$2, int $$3, @Nullable it $$4) {
      ctq $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.e()) {
            $$1.a($$3, $$2);
            $$2 = ctq.i;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.j() - $$5.I();
            int $$9 = Math.min($$2.I(), $$8);
            $$2.h($$9);
            $$5.g($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof dph $$10 && !$$10.v()) {
               int $$11 = 0;
               if ($$0 instanceof dph $$12 && $$10.i >= $$12.i) {
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
   private static bpp b(daz $$0, io $$1, dph $$2) {
      return a($$0, $$1.a($$2.j));
   }

   @Nullable
   private static bpp a(daz $$0, dpg $$1, io $$2, drd $$3) {
      return a($$0, $$2, $$3, $$1.H(), $$1.I() + 1.0, $$1.J());
   }

   public static List<cii> b(daz $$0, dpg $$1) {
      euh $$2 = $$1.aj_().d($$1.H() - 0.5, $$1.I() - 0.5, $$1.J() - 0.5);
      return $$0.a(cii.class, $$2, bsb.a);
   }

   @Nullable
   public static bpp a(daz $$0, io $$1) {
      return a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bpp a(daz $$0, io $$1, drd $$2, double $$3, double $$4, double $$5) {
      bpp $$6 = b($$0, $$1, $$2);
      if ($$6 == null) {
         $$6 = a($$0, $$3, $$4, $$5);
      }

      return $$6;
   }

   @Nullable
   private static bpp b(daz $$0, io $$1, drd $$2) {
      dea $$3 = $$2.b();
      if ($$3 instanceof bqj) {
         return ((bqj)$$3).a($$2, $$0, $$1);
      } else if ($$2.t() && $$0.c_($$1) instanceof bpp $$5) {
         if ($$5 instanceof dop && $$3 instanceof dfd) {
            $$5 = dfd.a((dfd)$$3, $$2, $$0, $$1, true);
         }

         return $$5;
      } else {
         return null;
      }
   }

   @Nullable
   private static bpp a(daz $$0, double $$1, double $$2, double $$3) {
      List<brw> $$4 = $$0.a((brw)null, new euh($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bsb.d);
      return !$$4.isEmpty() ? (bpp)$$4.get($$0.z.a($$4.size())) : null;
   }

   private static boolean a(ctq $$0, ctq $$1) {
      return $$0.I() <= $$0.j() && ctq.c($$0, $$1);
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
   protected jg<ctq> j() {
      return this.g;
   }

   @Override
   protected void a(jg<ctq> $$0) {
      this.g = $$0;
   }

   public static void a(daz $$0, io $$1, drd $$2, brw $$3, dph $$4) {
      if ($$3 instanceof cii $$5 && !$$5.p().e() && $$3.cK().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w())).c($$4.aj_())) {
         a($$0, $$1, $$2, $$4, () -> a((bpp)$$4, $$5));
      }
   }

   @Override
   protected cov a(int $$0, clx $$1) {
      return new cpu($$0, $$1, this);
   }
}

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class emn extends eme {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<emi> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<eta> n = new Object2BooleanOpenHashMap();
   private final emd[] o = new emd[ir.c.a.b()];

   @Override
   public void a(dah $$0, brg $$1) {
      super.a($$0, $$1);
      $$1.C();
   }

   @Override
   public void b() {
      this.b.D();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public emd a() {
      im.a $$0 = new im.a();
      int $$1 = this.b.dt();
      dpy $$2 = this.a.a($$0.b(this.b.ds(), (double)$$1, this.b.dy()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.bc()) {
            while (true) {
               if (!$$2.a(dcx.G) && $$2.u() != els.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.ds(), (double)(++$$1), this.b.dy()));
            }
         } else if (this.b.aC()) {
            $$1 = axw.a(this.b.du() + 0.5);
         } else {
            $$0.b(this.b.ds(), this.b.du() + 1.0, this.b.dy());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dpy $$3 = this.a.a($$0);
               if (!$$3.i() && !$$3.a(emg.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a($$0.b(this.b.ds(), (double)(++$$1), this.b.dy()));
         }

         $$1--;
      }

      im $$4 = this.b.dn();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         eta $$5 = this.b.cI();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new im($$4.u(), $$1, $$4.w()));
   }

   protected emd c(im $$0) {
      emd $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(im $$0) {
      emi $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != emi.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public emm a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(emd[] $$0, emd $$1) {
      int $$2 = 0;
      int $$3 = 0;
      emi $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      emi $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != emi.w) {
         $$3 = axw.d(Math.max(1.0F, this.b.dH()));
      }

      double $$6 = this.d(new im($$1.a, $$1.b, $$1.c));

      for (ir $$7 : ir.c.a) {
         emd $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (ir $$9 : ir.c.a) {
         ir $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            emd $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable emd $$0, emd $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(emd $$0, @Nullable emd $$1, @Nullable emd $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != emi.d && $$2.l != emi.d) {
         boolean $$3 = $$2.l == emi.h && $$1.l == emi.h && (double)this.b.dh() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable emd $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == emi.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(emi $$0) {
      return $$0 == emi.h || $$0 == emi.s || $$0 == emi.t;
   }

   private boolean b(emd $$0) {
      eta $$1 = this.b.cI();
      etf $$2 = new etf((double)$$0.a - this.b.ds() + $$1.b() / 2.0, (double)$$0.b - this.b.du() + $$1.c() / 2.0, (double)$$0.c - this.b.dy() + $$1.d() / 2.0);
      int $$3 = axw.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(im $$0) {
      cza $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(avt.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(cza $$0, im $$1) {
      im $$2 = $$1.d();
      ety $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ir.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected emd a(int $$0, int $$1, int $$2, int $$3, double $$4, ir $$5, emi $$6) {
      emd $$7 = null;
      im.a $$8 = new im.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         emi $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != emi.c && (!this.c() || $$10 != emi.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != emi.h || this.g()) && $$10 != emi.m && $$10 != emi.e && $$10 != emi.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == emi.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == emi.b) {
               $$7 = this.d($$0, $$1, $$2);
            } else if (a($$10) && $$7 == null) {
               $$7 = this.a($$0, $$1, $$2, $$10);
            }

            return $$7;
         } else {
            return $$7;
         }
      }
   }

   private double h() {
      return Math.max(1.125, (double)this.b.dH());
   }

   private emd a(int $$0, int $$1, int $$2, emi $$3, float $$4) {
      emd $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private emd a(int $$0, int $$1, int $$2) {
      emd $$3 = this.c($$0, $$1, $$2);
      $$3.l = emi.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private emd a(int $$0, int $$1, int $$2, emi $$3) {
      emd $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private emd a(int $$0, int $$1, int $$2, int $$3, double $$4, ir $$5, emi $$6, im.a $$7) {
      emd $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dh() >= 1.0F) {
         return $$8;
      } else if ($$8.l != emi.b && $$8.l != emi.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dh() / 2.0;
         eta $$12 = new eta(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.di() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private emd a(int $$0, int $$1, int $$2, @Nullable emd $$3) {
      $$1--;

      while ($$1 > this.b.dN().I_()) {
         emi $$4 = this.b($$0, $$1, $$2);
         if ($$4 != emi.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private emd d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dN().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cv()) {
            return this.a($$0, $$3, $$2);
         }

         emi $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != emi.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(eta $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected emi b(int $$0, int $$1, int $$2) {
      return (emi)this.m.computeIfAbsent(im.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public emi a(emk $$0, int $$1, int $$2, int $$3, brg $$4) {
      Set<emi> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(emi.h)) {
         return emi.h;
      } else if ($$5.contains(emi.m)) {
         return emi.m;
      } else {
         emi $$6 = emi.a;

         for (emi $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != emi.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == emi.b ? emi.b : $$6;
      }
   }

   public Set<emi> b(emk $$0, int $$1, int $$2, int $$3) {
      EnumSet<emi> $$4 = EnumSet.noneOf(emi.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               emi $$11 = this.a($$0, $$8, $$9, $$10);
               im $$12 = this.b.dn();
               boolean $$13 = this.d();
               if ($$11 == emi.s && this.e() && $$13) {
                  $$11 = emi.d;
               }

               if ($$11 == emi.r && !$$13) {
                  $$11 = emi.a;
               }

               if ($$11 == emi.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != emi.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != emi.l) {
                  $$11 = emi.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public emi a(emk $$0, int $$1, int $$2, int $$3) {
      return a($$0, new im.a($$1, $$2, $$3));
   }

   public static emi b(brg $$0, im $$1) {
      return a(new emk($$0.dN(), $$0), $$1.j());
   }

   public static emi a(emk $$0, im.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      emi $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == emi.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> emi.b;
            case o -> emi.o;
            case q -> emi.q;
            case w -> emi.w;
            case f -> emi.g;
            case y -> emi.y;
            case e -> emi.z;
            default -> a($$0, $$2, $$3, $$4, emi.c);
         };
      } else {
         return $$5;
      }
   }

   public static emi a(emk $$0, int $$1, int $$2, int $$3, emi $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  emi $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == emi.q) {
                     return emi.p;
                  }

                  if ($$8 == emi.o || $$8 == emi.i) {
                     return emi.n;
                  }

                  if ($$8 == emi.j) {
                     return emi.k;
                  }

                  if ($$8 == emi.y) {
                     return emi.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static emi b(cza $$0, im $$1) {
      dpy $$2 = $$0.a_($$1);
      dcv $$3 = $$2.b();
      if ($$2.i()) {
         return emi.b;
      } else if ($$2.a(avo.P) || $$2.a(dcx.fm) || $$2.a(dcx.sD)) {
         return emi.e;
      } else if ($$2.a(dcx.qP)) {
         return emi.f;
      } else if ($$2.a(dcx.dQ) || $$2.a(dcx.oi)) {
         return emi.q;
      } else if ($$2.a(dcx.pg)) {
         return emi.w;
      } else if ($$2.a(dcx.fC)) {
         return emi.x;
      } else if (!$$2.a(dcx.cd) && !$$2.a(dcx.st)) {
         elr $$4 = $$2.u();
         if ($$4.a(avt.b)) {
            return emi.i;
         } else if (a($$2)) {
            return emi.o;
         } else if ($$3 instanceof dfb $$5) {
            if ($$2.c(dfb.c)) {
               return emi.r;
            } else {
               return $$5.b().c() ? emi.s : emi.t;
            }
         } else if ($$3 instanceof dck) {
            return emi.l;
         } else if ($$3 instanceof dhf) {
            return emi.v;
         } else if (!$$2.a(avo.S) && !$$2.a(avo.L) && (!($$3 instanceof dfu) || $$2.c(dfu.b))) {
            if (!$$2.a(emg.a)) {
               return emi.a;
            } else {
               return $$4.a(avt.a) ? emi.j : emi.b;
            }
         } else {
            return emi.h;
         }
      } else {
         return emi.y;
      }
   }
}

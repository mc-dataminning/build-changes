import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class esk extends esb {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<esf> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ezm> n = new Object2BooleanOpenHashMap();
   private final esa[] o = new esa[jm.c.a.b()];

   @Override
   public void a(dfs $$0, bvg $$1) {
      super.a($$0, $$1);
      $$1.G();
   }

   @Override
   public void b() {
      this.b.I();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public esa a() {
      jh.a $$0 = new jh.a();
      int $$1 = this.b.dE();
      dvo $$2 = this.a.a($$0.b(this.b.dD(), (double)$$1, this.b.dJ()));
      if (!this.b.a($$2.y())) {
         if (this.f() && this.b.bl()) {
            while (true) {
               if (!$$2.a(dil.G) && $$2.y() != erp.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.dD(), (double)(++$$1), this.b.dJ()));
            }
         } else if (this.b.aL()) {
            $$1 = azn.a(this.b.dF() + 0.5);
         } else {
            $$0.b(this.b.dD(), this.b.dF() + 1.0, this.b.dJ());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dvo $$3 = this.a.a($$0);
               if (!$$3.l() && !$$3.a(esd.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.y())) {
            $$2 = this.a.a($$0.b(this.b.dD(), (double)(++$$1), this.b.dJ()));
         }

         $$1--;
      }

      jh $$4 = this.b.dy();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ezm $$5 = this.b.cT();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new jh($$4.u(), $$1, $$4.w()));
   }

   protected esa c(jh $$0) {
      esa $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(jh $$0) {
      esf $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != esf.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public esj a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(esa[] $$0, esa $$1) {
      int $$2 = 0;
      int $$3 = 0;
      esf $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      esf $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != esf.w) {
         $$3 = azn.d(Math.max(1.0F, this.b.dS()));
      }

      double $$6 = this.d(new jh($$1.a, $$1.b, $$1.c));

      for (jm $$7 : jm.c.a) {
         esa $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jm $$9 : jm.c.a) {
         jm $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            esa $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable esa $$0, esa $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(esa $$0, @Nullable esa $$1, @Nullable esa $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != esf.d && $$2.l != esf.d) {
         boolean $$3 = $$2.l == esf.h && $$1.l == esf.h && (double)this.b.dt() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable esa $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == esf.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(esf $$0) {
      return $$0 == esf.h || $$0 == esf.s || $$0 == esf.t;
   }

   private boolean b(esa $$0) {
      ezm $$1 = this.b.cT();
      ezr $$2 = new ezr((double)$$0.a - this.b.dD() + $$1.b() / 2.0, (double)$$0.b - this.b.dF() + $$1.c() / 2.0, (double)$$0.c - this.b.dJ() + $$1.d() / 2.0);
      int $$3 = azn.c($$2.g() / $$1.a());
      $$2 = $$2.c((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(jh $$0) {
      dek $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(axj.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dek $$0, jh $$1) {
      jh $$2 = $$1.e();
      fal $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jm.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected esa a(int $$0, int $$1, int $$2, int $$3, double $$4, jm $$5, esf $$6) {
      esa $$7 = null;
      jh.a $$8 = new jh.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         esf $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != esf.c && (!this.c() || $$10 != esf.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != esf.h || this.g()) && $$10 != esf.m && $$10 != esf.e && $$10 != esf.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == esf.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == esf.b) {
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
      return Math.max(1.125, (double)this.b.dS());
   }

   private esa a(int $$0, int $$1, int $$2, esf $$3, float $$4) {
      esa $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private esa a(int $$0, int $$1, int $$2) {
      esa $$3 = this.c($$0, $$1, $$2);
      $$3.l = esf.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private esa a(int $$0, int $$1, int $$2, esf $$3) {
      esa $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private esa a(int $$0, int $$1, int $$2, int $$3, double $$4, jm $$5, esf $$6, jh.a $$7) {
      esa $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dt() >= 1.0F) {
         return $$8;
      } else if ($$8.l != esf.b && $$8.l != esf.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dt() / 2.0;
         ezm $$12 = new ezm(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.du() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private esa a(int $$0, int $$1, int $$2, @Nullable esa $$3) {
      $$1--;

      while ($$1 > this.b.dY().I_()) {
         esf $$4 = this.b($$0, $$1, $$2);
         if ($$4 != esf.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private esa d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dY().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cG()) {
            return this.a($$0, $$3, $$2);
         }

         esf $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != esf.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(ezm $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected esf b(int $$0, int $$1, int $$2) {
      return (esf)this.m.computeIfAbsent(jh.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public esf a(esh $$0, int $$1, int $$2, int $$3, bvg $$4) {
      Set<esf> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(esf.h)) {
         return esf.h;
      } else if ($$5.contains(esf.m)) {
         return esf.m;
      } else {
         esf $$6 = esf.a;

         for (esf $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != esf.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == esf.b ? esf.b : $$6;
      }
   }

   public Set<esf> b(esh $$0, int $$1, int $$2, int $$3) {
      EnumSet<esf> $$4 = EnumSet.noneOf(esf.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               esf $$11 = this.a($$0, $$8, $$9, $$10);
               jh $$12 = this.b.dy();
               boolean $$13 = this.d();
               if ($$11 == esf.s && this.e() && $$13) {
                  $$11 = esf.d;
               }

               if ($$11 == esf.r && !$$13) {
                  $$11 = esf.a;
               }

               if ($$11 == esf.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != esf.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != esf.l) {
                  $$11 = esf.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public esf a(esh $$0, int $$1, int $$2, int $$3) {
      return a($$0, new jh.a($$1, $$2, $$3));
   }

   public static esf b(bvg $$0, jh $$1) {
      return a(new esh($$0.dY(), $$0), $$1.k());
   }

   public static esf a(esh $$0, jh.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      esf $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == esf.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> esf.b;
            case o -> esf.o;
            case q -> esf.q;
            case w -> esf.w;
            case f -> esf.g;
            case y -> esf.y;
            case e -> esf.z;
            default -> a($$0, $$2, $$3, $$4, esf.c);
         };
      } else {
         return $$5;
      }
   }

   public static esf a(esh $$0, int $$1, int $$2, int $$3, esf $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  esf $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == esf.q) {
                     return esf.p;
                  }

                  if ($$8 == esf.o || $$8 == esf.i) {
                     return esf.n;
                  }

                  if ($$8 == esf.j) {
                     return esf.k;
                  }

                  if ($$8 == esf.y) {
                     return esf.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static esf b(dek $$0, jh $$1) {
      dvo $$2 = $$0.a_($$1);
      dij $$3 = $$2.b();
      if ($$2.l()) {
         return esf.b;
      } else if ($$2.a(axd.Q) || $$2.a(dil.fm) || $$2.a(dil.sD)) {
         return esf.e;
      } else if ($$2.a(dil.qP)) {
         return esf.f;
      } else if ($$2.a(dil.dQ) || $$2.a(dil.oi)) {
         return esf.q;
      } else if ($$2.a(dil.pg)) {
         return esf.w;
      } else if ($$2.a(dil.fC)) {
         return esf.x;
      } else if (!$$2.a(dil.cd) && !$$2.a(dil.st)) {
         ero $$4 = $$2.y();
         if ($$4.a(axj.b)) {
            return esf.i;
         } else if (a($$2)) {
            return esf.o;
         } else if ($$3 instanceof dkp $$5) {
            if ($$2.c(dkp.c)) {
               return esf.r;
            } else {
               return $$5.b().c() ? esf.s : esf.t;
            }
         } else if ($$3 instanceof dhy) {
            return esf.l;
         } else if ($$3 instanceof dms) {
            return esf.v;
         } else if (!$$2.a(axd.T) && !$$2.a(axd.M) && (!($$3 instanceof dlh) || $$2.c(dlh.b))) {
            if (!$$2.a(esd.a)) {
               return esf.a;
            } else {
               return $$4.a(axj.a) ? esf.j : esf.b;
            }
         } else {
            return esf.h;
         }
      } else {
         return esf.y;
      }
   }
}

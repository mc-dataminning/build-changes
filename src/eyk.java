import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class eyk extends eyb {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<eyf> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ffl> n = new Object2BooleanOpenHashMap();
   private final eya[] o = new eya[jb.c.a.b()];

   @Override
   public void a(dkk $$0, bxw $$1) {
      super.a($$0, $$1);
      $$1.G();
   }

   @Override
   public void b() {
      this.c.H();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public eya a() {
      iv.a $$0 = new iv.a();
      int $$1 = this.c.dB();
      ebe $$2 = this.b.a($$0.b(this.c.dA(), (double)$$1, this.c.dG()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bi()) {
            while (true) {
               if (!$$2.a(dne.J) && $$2.y() != exp.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.b.a($$0.b(this.c.dA(), (double)(++$$1), this.c.dG()));
            }
         } else if (this.c.aH()) {
            $$1 = azo.a(this.c.dC() + 0.5);
         } else {
            $$0.b(this.c.dA(), this.c.dC() + 1.0, this.c.dG());

            while ($$0.v() > this.b.a().K_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               ebe $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(eyd.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.c.a($$2.y())) {
            $$2 = this.b.a($$0.b(this.c.dA(), (double)(++$$1), this.c.dG()));
         }

         $$1--;
      }

      iv $$4 = this.c.dv();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ffl $$5 = this.c.cR();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new iv($$4.u(), $$1, $$4.w()));
   }

   protected eya c(iv $$0) {
      eya $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(iv $$0) {
      eyf $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != eyf.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public eyj a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eya[] $$0, eya $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eyf $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      eyf $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != eyf.w) {
         $$3 = azo.d(Math.max(1.0F, this.c.dP()));
      }

      double $$6 = this.d(new iv($$1.a, $$1.b, $$1.c));

      for (jb $$7 : jb.c.a) {
         eya $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jb $$9 : jb.c.a) {
         jb $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            eya $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eya $$0, eya $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eya $$0, @Nullable eya $$1, @Nullable eya $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eyf.d && $$2.l != eyf.d) {
         boolean $$3 = $$2.l == eyf.h && $$1.l == eyf.h && (double)this.c.dq() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable eya $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == eyf.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(eyf $$0) {
      return $$0 == eyf.h || $$0 == eyf.s || $$0 == eyf.t;
   }

   private boolean b(eya $$0) {
      ffl $$1 = this.c.cR();
      ffq $$2 = new ffq((double)$$0.a - this.c.dA() + $$1.b() / 2.0, (double)$$0.b - this.c.dC() + $$1.c() / 2.0, (double)$$0.c - this.c.dG() + $$1.d() / 2.0);
      int $$3 = azo.c($$2.g() / $$1.a());
      $$2 = $$2.c((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(iv $$0) {
      djb $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(axj.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(djb $$0, iv $$1) {
      iv $$2 = $$1.e();
      fgk $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jb.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eya a(int $$0, int $$1, int $$2, int $$3, double $$4, jb $$5, eyf $$6) {
      eya $$7 = null;
      iv.a $$8 = new iv.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eyf $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eyf.c && (!this.c() || $$10 != eyf.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eyf.h || this.g()) && $$10 != eyf.m && $$10 != eyf.e && $$10 != eyf.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == eyf.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == eyf.b) {
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
      return Math.max(1.125, (double)this.c.dP());
   }

   private eya a(int $$0, int $$1, int $$2, eyf $$3, float $$4) {
      eya $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eya a(int $$0, int $$1, int $$2) {
      eya $$3 = this.c($$0, $$1, $$2);
      $$3.l = eyf.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private eya a(int $$0, int $$1, int $$2, eyf $$3) {
      eya $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private eya a(int $$0, int $$1, int $$2, int $$3, double $$4, jb $$5, eyf $$6, iv.a $$7) {
      eya $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.dq() >= 1.0F) {
         return $$8;
      } else if ($$8.l != eyf.b && $$8.l != eyf.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.c.dq() / 2.0;
         ffl $$12 = new ffl(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.c.dr() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private eya a(int $$0, int $$1, int $$2, @Nullable eya $$3) {
      $$1--;

      while ($$1 > this.c.dV().K_()) {
         eyf $$4 = this.b($$0, $$1, $$2);
         if ($$4 != eyf.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private eya d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.dV().K_(); $$3--) {
         if ($$1 - $$3 > this.c.cE()) {
            return this.a($$0, $$3, $$2);
         }

         eyf $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != eyf.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(ffl $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected eyf b(int $$0, int $$1, int $$2) {
      return (eyf)this.m.computeIfAbsent(iv.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public eyf a(eyh $$0, int $$1, int $$2, int $$3, bxw $$4) {
      Set<eyf> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(eyf.h)) {
         return eyf.h;
      } else if ($$5.contains(eyf.m)) {
         return eyf.m;
      } else {
         eyf $$6 = eyf.a;

         for (eyf $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != eyf.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == eyf.b ? eyf.b : $$6;
      }
   }

   public Set<eyf> b(eyh $$0, int $$1, int $$2, int $$3) {
      EnumSet<eyf> $$4 = EnumSet.noneOf(eyf.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               eyf $$11 = this.a($$0, $$8, $$9, $$10);
               iv $$12 = this.c.dv();
               boolean $$13 = this.d();
               if ($$11 == eyf.s && this.e() && $$13) {
                  $$11 = eyf.d;
               }

               if ($$11 == eyf.r && !$$13) {
                  $$11 = eyf.a;
               }

               if ($$11 == eyf.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != eyf.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != eyf.l) {
                  $$11 = eyf.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public eyf a(eyh $$0, int $$1, int $$2, int $$3) {
      return a($$0, new iv.a($$1, $$2, $$3));
   }

   public static eyf b(bxw $$0, iv $$1) {
      return a(new eyh($$0.dV(), $$0), $$1.k());
   }

   public static eyf a(eyh $$0, iv.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eyf $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == eyf.b && $$3 >= $$0.a().K_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> eyf.b;
            case o -> eyf.o;
            case q -> eyf.q;
            case w -> eyf.w;
            case f -> eyf.g;
            case y -> eyf.y;
            case e -> eyf.z;
            default -> a($$0, $$2, $$3, $$4, eyf.c);
         };
      } else {
         return $$5;
      }
   }

   public static eyf a(eyh $$0, int $$1, int $$2, int $$3, eyf $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  eyf $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == eyf.q) {
                     return eyf.p;
                  }

                  if ($$8 == eyf.o || $$8 == eyf.i) {
                     return eyf.n;
                  }

                  if ($$8 == eyf.j) {
                     return eyf.k;
                  }

                  if ($$8 == eyf.y) {
                     return eyf.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static eyf b(djb $$0, iv $$1) {
      ebe $$2 = $$0.a_($$1);
      dnc $$3 = $$2.b();
      if ($$2.l()) {
         return eyf.b;
      } else if ($$2.a(axe.R) || $$2.a(dne.fF) || $$2.a(dne.tn)) {
         return eyf.e;
      } else if ($$2.a(dne.rx)) {
         return eyf.f;
      } else if ($$2.a(dne.eg) || $$2.a(dne.oO)) {
         return eyf.q;
      } else if ($$2.a(dne.pO)) {
         return eyf.w;
      } else if ($$2.a(dne.gb)) {
         return eyf.x;
      } else if (!$$2.a(dne.cn) && !$$2.a(dne.tb)) {
         exo $$4 = $$2.y();
         if ($$4.a(axj.b)) {
            return eyf.i;
         } else if (a($$2)) {
            return eyf.o;
         } else if ($$3 instanceof dpj $$5) {
            if ($$2.c(dpj.e)) {
               return eyf.r;
            } else {
               return $$5.b().c() ? eyf.s : eyf.t;
            }
         } else if ($$3 instanceof dmr) {
            return eyf.l;
         } else if ($$3 instanceof drs) {
            return eyf.v;
         } else if (!$$2.a(axe.U) && !$$2.a(axe.N) && (!($$3 instanceof dqd) || $$2.c(dqd.b))) {
            if (!$$2.a(eyd.a)) {
               return eyf.a;
            } else {
               return $$4.a(axj.a) ? eyf.j : eyf.b;
            }
         } else {
            return eyf.h;
         }
      } else {
         return eyf.y;
      }
   }
}

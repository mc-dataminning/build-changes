import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class exw extends exn {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<exr> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<fex> n = new Object2BooleanOpenHashMap();
   private final exm[] o = new exm[jb.c.a.b()];

   @Override
   public void a(djz $$0, bxl $$1) {
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
   public exm a() {
      iv.a $$0 = new iv.a();
      int $$1 = this.c.dA();
      eat $$2 = this.b.a($$0.b(this.c.dz(), (double)$$1, this.c.dF()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bh()) {
            while (true) {
               if (!$$2.a(dmt.J) && $$2.y() != exb.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.b.a($$0.b(this.c.dz(), (double)(++$$1), this.c.dF()));
            }
         } else if (this.c.aH()) {
            $$1 = azm.a(this.c.dB() + 0.5);
         } else {
            $$0.b(this.c.dz(), this.c.dB() + 1.0, this.c.dF());

            while ($$0.v() > this.b.a().G_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               eat $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(exp.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.c.a($$2.y())) {
            $$2 = this.b.a($$0.b(this.c.dz(), (double)(++$$1), this.c.dF()));
         }

         $$1--;
      }

      iv $$4 = this.c.du();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         fex $$5 = this.c.cQ();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new iv($$4.u(), $$1, $$4.w()));
   }

   protected exm c(iv $$0) {
      exm $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(iv $$0) {
      exr $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != exr.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public exv a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(exm[] $$0, exm $$1) {
      int $$2 = 0;
      int $$3 = 0;
      exr $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      exr $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != exr.w) {
         $$3 = azm.d(Math.max(1.0F, this.c.dO()));
      }

      double $$6 = this.d(new iv($$1.a, $$1.b, $$1.c));

      for (jb $$7 : jb.c.a) {
         exm $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jb $$9 : jb.c.a) {
         jb $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            exm $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable exm $$0, exm $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(exm $$0, @Nullable exm $$1, @Nullable exm $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != exr.d && $$2.l != exr.d) {
         boolean $$3 = $$2.l == exr.h && $$1.l == exr.h && (double)this.c.dp() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable exm $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == exr.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(exr $$0) {
      return $$0 == exr.h || $$0 == exr.s || $$0 == exr.t;
   }

   private boolean b(exm $$0) {
      fex $$1 = this.c.cQ();
      ffc $$2 = new ffc((double)$$0.a - this.c.dz() + $$1.b() / 2.0, (double)$$0.b - this.c.dB() + $$1.c() / 2.0, (double)$$0.c - this.c.dF() + $$1.d() / 2.0);
      int $$3 = azm.c($$2.g() / $$1.a());
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
      diq $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(axh.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(diq $$0, iv $$1) {
      iv $$2 = $$1.e();
      ffw $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jb.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected exm a(int $$0, int $$1, int $$2, int $$3, double $$4, jb $$5, exr $$6) {
      exm $$7 = null;
      iv.a $$8 = new iv.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         exr $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != exr.c && (!this.c() || $$10 != exr.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != exr.h || this.g()) && $$10 != exr.m && $$10 != exr.e && $$10 != exr.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == exr.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == exr.b) {
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
      return Math.max(1.125, (double)this.c.dO());
   }

   private exm a(int $$0, int $$1, int $$2, exr $$3, float $$4) {
      exm $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private exm a(int $$0, int $$1, int $$2) {
      exm $$3 = this.c($$0, $$1, $$2);
      $$3.l = exr.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private exm a(int $$0, int $$1, int $$2, exr $$3) {
      exm $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private exm a(int $$0, int $$1, int $$2, int $$3, double $$4, jb $$5, exr $$6, iv.a $$7) {
      exm $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.dp() >= 1.0F) {
         return $$8;
      } else if ($$8.l != exr.b && $$8.l != exr.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.c.dp() / 2.0;
         fex $$12 = new fex(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.c.dq() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private exm a(int $$0, int $$1, int $$2, @Nullable exm $$3) {
      $$1--;

      while ($$1 > this.c.dU().G_()) {
         exr $$4 = this.b($$0, $$1, $$2);
         if ($$4 != exr.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private exm d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.dU().G_(); $$3--) {
         if ($$1 - $$3 > this.c.cD()) {
            return this.a($$0, $$3, $$2);
         }

         exr $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != exr.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(fex $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected exr b(int $$0, int $$1, int $$2) {
      return (exr)this.m.computeIfAbsent(iv.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public exr a(ext $$0, int $$1, int $$2, int $$3, bxl $$4) {
      Set<exr> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(exr.h)) {
         return exr.h;
      } else if ($$5.contains(exr.m)) {
         return exr.m;
      } else {
         exr $$6 = exr.a;

         for (exr $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != exr.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == exr.b ? exr.b : $$6;
      }
   }

   public Set<exr> b(ext $$0, int $$1, int $$2, int $$3) {
      EnumSet<exr> $$4 = EnumSet.noneOf(exr.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               exr $$11 = this.a($$0, $$8, $$9, $$10);
               iv $$12 = this.c.du();
               boolean $$13 = this.d();
               if ($$11 == exr.s && this.e() && $$13) {
                  $$11 = exr.d;
               }

               if ($$11 == exr.r && !$$13) {
                  $$11 = exr.a;
               }

               if ($$11 == exr.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != exr.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != exr.l) {
                  $$11 = exr.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public exr a(ext $$0, int $$1, int $$2, int $$3) {
      return a($$0, new iv.a($$1, $$2, $$3));
   }

   public static exr b(bxl $$0, iv $$1) {
      return a(new ext($$0.dU(), $$0), $$1.k());
   }

   public static exr a(ext $$0, iv.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      exr $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == exr.b && $$3 >= $$0.a().G_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> exr.b;
            case o -> exr.o;
            case q -> exr.q;
            case w -> exr.w;
            case f -> exr.g;
            case y -> exr.y;
            case e -> exr.z;
            default -> a($$0, $$2, $$3, $$4, exr.c);
         };
      } else {
         return $$5;
      }
   }

   public static exr a(ext $$0, int $$1, int $$2, int $$3, exr $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  exr $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == exr.q) {
                     return exr.p;
                  }

                  if ($$8 == exr.o || $$8 == exr.i) {
                     return exr.n;
                  }

                  if ($$8 == exr.j) {
                     return exr.k;
                  }

                  if ($$8 == exr.y) {
                     return exr.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static exr b(diq $$0, iv $$1) {
      eat $$2 = $$0.a_($$1);
      dmr $$3 = $$2.b();
      if ($$2.l()) {
         return exr.b;
      } else if ($$2.a(axc.R) || $$2.a(dmt.fF) || $$2.a(dmt.tn)) {
         return exr.e;
      } else if ($$2.a(dmt.rx)) {
         return exr.f;
      } else if ($$2.a(dmt.eg) || $$2.a(dmt.oO)) {
         return exr.q;
      } else if ($$2.a(dmt.pO)) {
         return exr.w;
      } else if ($$2.a(dmt.gb)) {
         return exr.x;
      } else if (!$$2.a(dmt.cn) && !$$2.a(dmt.tb)) {
         exa $$4 = $$2.y();
         if ($$4.a(axh.b)) {
            return exr.i;
         } else if (a($$2)) {
            return exr.o;
         } else if ($$3 instanceof doy $$5) {
            if ($$2.c(doy.e)) {
               return exr.r;
            } else {
               return $$5.b().c() ? exr.s : exr.t;
            }
         } else if ($$3 instanceof dmg) {
            return exr.l;
         } else if ($$3 instanceof drh) {
            return exr.v;
         } else if (!$$2.a(axc.U) && !$$2.a(axc.N) && (!($$3 instanceof dps) || $$2.c(dps.b))) {
            if (!$$2.a(exp.a)) {
               return exr.a;
            } else {
               return $$4.a(axh.a) ? exr.j : exr.b;
            }
         } else {
            return exr.h;
         }
      } else {
         return exr.y;
      }
   }
}

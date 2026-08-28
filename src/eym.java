import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class eym extends eyd {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<eyh> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ffn> n = new Object2BooleanOpenHashMap();
   private final eyc[] o = new eyc[jc.c.a.b()];

   @Override
   public void a(dkm $$0, bxy $$1) {
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
   public eyc a() {
      iw.a $$0 = new iw.a();
      int $$1 = this.c.dB();
      ebg $$2 = this.b.a($$0.b(this.c.dA(), (double)$$1, this.c.dG()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bi()) {
            while (true) {
               if (!$$2.a(dng.J) && $$2.y() != exr.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.b.a($$0.b(this.c.dA(), (double)(++$$1), this.c.dG()));
            }
         } else if (this.c.aH()) {
            $$1 = azq.a(this.c.dC() + 0.5);
         } else {
            $$0.b(this.c.dA(), this.c.dC() + 1.0, this.c.dG());

            while ($$0.v() > this.b.a().K_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               ebg $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(eyf.a)) {
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

      iw $$4 = this.c.dv();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ffn $$5 = this.c.cR();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new iw($$4.u(), $$1, $$4.w()));
   }

   protected eyc c(iw $$0) {
      eyc $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(iw $$0) {
      eyh $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != eyh.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public eyl a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eyc[] $$0, eyc $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eyh $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      eyh $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != eyh.w) {
         $$3 = azq.d(Math.max(1.0F, this.c.dP()));
      }

      double $$6 = this.d(new iw($$1.a, $$1.b, $$1.c));

      for (jc $$7 : jc.c.a) {
         eyc $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jc $$9 : jc.c.a) {
         jc $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            eyc $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eyc $$0, eyc $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eyc $$0, @Nullable eyc $$1, @Nullable eyc $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eyh.d && $$2.l != eyh.d) {
         boolean $$3 = $$2.l == eyh.h && $$1.l == eyh.h && (double)this.c.dq() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable eyc $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == eyh.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(eyh $$0) {
      return $$0 == eyh.h || $$0 == eyh.s || $$0 == eyh.t;
   }

   private boolean b(eyc $$0) {
      ffn $$1 = this.c.cR();
      ffs $$2 = new ffs((double)$$0.a - this.c.dA() + $$1.b() / 2.0, (double)$$0.b - this.c.dC() + $$1.c() / 2.0, (double)$$0.c - this.c.dG() + $$1.d() / 2.0);
      int $$3 = azq.c($$2.g() / $$1.a());
      $$2 = $$2.c((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(iw $$0) {
      djd $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(axl.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(djd $$0, iw $$1) {
      iw $$2 = $$1.e();
      fgm $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jc.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eyc a(int $$0, int $$1, int $$2, int $$3, double $$4, jc $$5, eyh $$6) {
      eyc $$7 = null;
      iw.a $$8 = new iw.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eyh $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eyh.c && (!this.c() || $$10 != eyh.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eyh.h || this.g()) && $$10 != eyh.m && $$10 != eyh.e && $$10 != eyh.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == eyh.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == eyh.b) {
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

   private eyc a(int $$0, int $$1, int $$2, eyh $$3, float $$4) {
      eyc $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eyc a(int $$0, int $$1, int $$2) {
      eyc $$3 = this.c($$0, $$1, $$2);
      $$3.l = eyh.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private eyc a(int $$0, int $$1, int $$2, eyh $$3) {
      eyc $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private eyc a(int $$0, int $$1, int $$2, int $$3, double $$4, jc $$5, eyh $$6, iw.a $$7) {
      eyc $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.dq() >= 1.0F) {
         return $$8;
      } else if ($$8.l != eyh.b && $$8.l != eyh.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.c.dq() / 2.0;
         ffn $$12 = new ffn(
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
   private eyc a(int $$0, int $$1, int $$2, @Nullable eyc $$3) {
      $$1--;

      while ($$1 > this.c.dV().K_()) {
         eyh $$4 = this.b($$0, $$1, $$2);
         if ($$4 != eyh.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private eyc d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.dV().K_(); $$3--) {
         if ($$1 - $$3 > this.c.cE()) {
            return this.a($$0, $$3, $$2);
         }

         eyh $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != eyh.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(ffn $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected eyh b(int $$0, int $$1, int $$2) {
      return (eyh)this.m.computeIfAbsent(iw.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public eyh a(eyj $$0, int $$1, int $$2, int $$3, bxy $$4) {
      Set<eyh> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(eyh.h)) {
         return eyh.h;
      } else if ($$5.contains(eyh.m)) {
         return eyh.m;
      } else {
         eyh $$6 = eyh.a;

         for (eyh $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != eyh.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == eyh.b ? eyh.b : $$6;
      }
   }

   public Set<eyh> b(eyj $$0, int $$1, int $$2, int $$3) {
      EnumSet<eyh> $$4 = EnumSet.noneOf(eyh.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               eyh $$11 = this.a($$0, $$8, $$9, $$10);
               iw $$12 = this.c.dv();
               boolean $$13 = this.d();
               if ($$11 == eyh.s && this.e() && $$13) {
                  $$11 = eyh.d;
               }

               if ($$11 == eyh.r && !$$13) {
                  $$11 = eyh.a;
               }

               if ($$11 == eyh.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != eyh.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != eyh.l) {
                  $$11 = eyh.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public eyh a(eyj $$0, int $$1, int $$2, int $$3) {
      return a($$0, new iw.a($$1, $$2, $$3));
   }

   public static eyh b(bxy $$0, iw $$1) {
      return a(new eyj($$0.dV(), $$0), $$1.k());
   }

   public static eyh a(eyj $$0, iw.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eyh $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == eyh.b && $$3 >= $$0.a().K_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> eyh.b;
            case o -> eyh.o;
            case q -> eyh.q;
            case w -> eyh.w;
            case f -> eyh.g;
            case y -> eyh.y;
            case e -> eyh.z;
            default -> a($$0, $$2, $$3, $$4, eyh.c);
         };
      } else {
         return $$5;
      }
   }

   public static eyh a(eyj $$0, int $$1, int $$2, int $$3, eyh $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  eyh $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == eyh.q) {
                     return eyh.p;
                  }

                  if ($$8 == eyh.o || $$8 == eyh.i) {
                     return eyh.n;
                  }

                  if ($$8 == eyh.j) {
                     return eyh.k;
                  }

                  if ($$8 == eyh.y) {
                     return eyh.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static eyh b(djd $$0, iw $$1) {
      ebg $$2 = $$0.a_($$1);
      dne $$3 = $$2.b();
      if ($$2.l()) {
         return eyh.b;
      } else if ($$2.a(axg.R) || $$2.a(dng.fF) || $$2.a(dng.tn)) {
         return eyh.e;
      } else if ($$2.a(dng.rx)) {
         return eyh.f;
      } else if ($$2.a(dng.eg) || $$2.a(dng.oO)) {
         return eyh.q;
      } else if ($$2.a(dng.pO)) {
         return eyh.w;
      } else if ($$2.a(dng.gb)) {
         return eyh.x;
      } else if (!$$2.a(dng.cn) && !$$2.a(dng.tb)) {
         exq $$4 = $$2.y();
         if ($$4.a(axl.b)) {
            return eyh.i;
         } else if (a($$2)) {
            return eyh.o;
         } else if ($$3 instanceof dpl $$5) {
            if ($$2.c(dpl.e)) {
               return eyh.r;
            } else {
               return $$5.b().c() ? eyh.s : eyh.t;
            }
         } else if ($$3 instanceof dmt) {
            return eyh.l;
         } else if ($$3 instanceof dru) {
            return eyh.v;
         } else if (!$$2.a(axg.U) && !$$2.a(axg.N) && (!($$3 instanceof dqf) || $$2.c(dqf.b))) {
            if (!$$2.a(eyf.a)) {
               return eyh.a;
            } else {
               return $$4.a(axl.a) ? eyh.j : eyh.b;
            }
         } else {
            return eyh.h;
         }
      } else {
         return eyh.y;
      }
   }
}

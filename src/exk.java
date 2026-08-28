import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class exk extends exb {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<exf> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<fel> n = new Object2BooleanOpenHashMap();
   private final exa[] o = new exa[ja.c.a.b()];

   @Override
   public void a(djn $$0, bxg $$1) {
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
   public exa a() {
      iu.a $$0 = new iu.a();
      int $$1 = this.c.dB();
      eah $$2 = this.b.a($$0.b(this.c.dA(), (double)$$1, this.c.dG()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bj()) {
            while (true) {
               if (!$$2.a(dmh.J) && $$2.y() != ewp.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.b.a($$0.b(this.c.dA(), (double)(++$$1), this.c.dG()));
            }
         } else if (this.c.aJ()) {
            $$1 = azm.a(this.c.dC() + 0.5);
         } else {
            $$0.b(this.c.dA(), this.c.dC() + 1.0, this.c.dG());

            while ($$0.v() > this.b.a().G_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               eah $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(exd.a)) {
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

      iu $$4 = this.c.dv();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         fel $$5 = this.c.cR();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new iu($$4.u(), $$1, $$4.w()));
   }

   protected exa c(iu $$0) {
      exa $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(iu $$0) {
      exf $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != exf.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public exj a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(exa[] $$0, exa $$1) {
      int $$2 = 0;
      int $$3 = 0;
      exf $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      exf $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != exf.w) {
         $$3 = azm.d(Math.max(1.0F, this.c.dP()));
      }

      double $$6 = this.d(new iu($$1.a, $$1.b, $$1.c));

      for (ja $$7 : ja.c.a) {
         exa $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (ja $$9 : ja.c.a) {
         ja $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            exa $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable exa $$0, exa $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(exa $$0, @Nullable exa $$1, @Nullable exa $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != exf.d && $$2.l != exf.d) {
         boolean $$3 = $$2.l == exf.h && $$1.l == exf.h && (double)this.c.dq() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable exa $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == exf.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(exf $$0) {
      return $$0 == exf.h || $$0 == exf.s || $$0 == exf.t;
   }

   private boolean b(exa $$0) {
      fel $$1 = this.c.cR();
      feq $$2 = new feq((double)$$0.a - this.c.dA() + $$1.b() / 2.0, (double)$$0.b - this.c.dC() + $$1.c() / 2.0, (double)$$0.c - this.c.dG() + $$1.d() / 2.0);
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

   protected double d(iu $$0) {
      dig $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(axh.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dig $$0, iu $$1) {
      iu $$2 = $$1.e();
      ffk $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ja.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected exa a(int $$0, int $$1, int $$2, int $$3, double $$4, ja $$5, exf $$6) {
      exa $$7 = null;
      iu.a $$8 = new iu.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         exf $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != exf.c && (!this.c() || $$10 != exf.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != exf.h || this.g()) && $$10 != exf.m && $$10 != exf.e && $$10 != exf.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == exf.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == exf.b) {
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

   private exa a(int $$0, int $$1, int $$2, exf $$3, float $$4) {
      exa $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private exa a(int $$0, int $$1, int $$2) {
      exa $$3 = this.c($$0, $$1, $$2);
      $$3.l = exf.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private exa a(int $$0, int $$1, int $$2, exf $$3) {
      exa $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private exa a(int $$0, int $$1, int $$2, int $$3, double $$4, ja $$5, exf $$6, iu.a $$7) {
      exa $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.dq() >= 1.0F) {
         return $$8;
      } else if ($$8.l != exf.b && $$8.l != exf.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.c.dq() / 2.0;
         fel $$12 = new fel(
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
   private exa a(int $$0, int $$1, int $$2, @Nullable exa $$3) {
      $$1--;

      while ($$1 > this.c.dV().G_()) {
         exf $$4 = this.b($$0, $$1, $$2);
         if ($$4 != exf.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private exa d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.dV().G_(); $$3--) {
         if ($$1 - $$3 > this.c.cE()) {
            return this.a($$0, $$3, $$2);
         }

         exf $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != exf.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(fel $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected exf b(int $$0, int $$1, int $$2) {
      return (exf)this.m.computeIfAbsent(iu.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public exf a(exh $$0, int $$1, int $$2, int $$3, bxg $$4) {
      Set<exf> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(exf.h)) {
         return exf.h;
      } else if ($$5.contains(exf.m)) {
         return exf.m;
      } else {
         exf $$6 = exf.a;

         for (exf $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != exf.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == exf.b ? exf.b : $$6;
      }
   }

   public Set<exf> b(exh $$0, int $$1, int $$2, int $$3) {
      EnumSet<exf> $$4 = EnumSet.noneOf(exf.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               exf $$11 = this.a($$0, $$8, $$9, $$10);
               iu $$12 = this.c.dv();
               boolean $$13 = this.d();
               if ($$11 == exf.s && this.e() && $$13) {
                  $$11 = exf.d;
               }

               if ($$11 == exf.r && !$$13) {
                  $$11 = exf.a;
               }

               if ($$11 == exf.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != exf.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != exf.l) {
                  $$11 = exf.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public exf a(exh $$0, int $$1, int $$2, int $$3) {
      return a($$0, new iu.a($$1, $$2, $$3));
   }

   public static exf b(bxg $$0, iu $$1) {
      return a(new exh($$0.dV(), $$0), $$1.k());
   }

   public static exf a(exh $$0, iu.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      exf $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == exf.b && $$3 >= $$0.a().G_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> exf.b;
            case o -> exf.o;
            case q -> exf.q;
            case w -> exf.w;
            case f -> exf.g;
            case y -> exf.y;
            case e -> exf.z;
            default -> a($$0, $$2, $$3, $$4, exf.c);
         };
      } else {
         return $$5;
      }
   }

   public static exf a(exh $$0, int $$1, int $$2, int $$3, exf $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  exf $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == exf.q) {
                     return exf.p;
                  }

                  if ($$8 == exf.o || $$8 == exf.i) {
                     return exf.n;
                  }

                  if ($$8 == exf.j) {
                     return exf.k;
                  }

                  if ($$8 == exf.y) {
                     return exf.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static exf b(dig $$0, iu $$1) {
      eah $$2 = $$0.a_($$1);
      dmf $$3 = $$2.b();
      if ($$2.l()) {
         return exf.b;
      } else if ($$2.a(axc.R) || $$2.a(dmh.fF) || $$2.a(dmh.tn)) {
         return exf.e;
      } else if ($$2.a(dmh.rx)) {
         return exf.f;
      } else if ($$2.a(dmh.eg) || $$2.a(dmh.oO)) {
         return exf.q;
      } else if ($$2.a(dmh.pO)) {
         return exf.w;
      } else if ($$2.a(dmh.gb)) {
         return exf.x;
      } else if (!$$2.a(dmh.cn) && !$$2.a(dmh.tb)) {
         ewo $$4 = $$2.y();
         if ($$4.a(axh.b)) {
            return exf.i;
         } else if (a($$2)) {
            return exf.o;
         } else if ($$3 instanceof dom $$5) {
            if ($$2.c(dom.e)) {
               return exf.r;
            } else {
               return $$5.b().c() ? exf.s : exf.t;
            }
         } else if ($$3 instanceof dlu) {
            return exf.l;
         } else if ($$3 instanceof dqv) {
            return exf.v;
         } else if (!$$2.a(axc.U) && !$$2.a(axc.N) && (!($$3 instanceof dpg) || $$2.c(dpg.b))) {
            if (!$$2.a(exd.a)) {
               return exf.a;
            } else {
               return $$4.a(axh.a) ? exf.j : exf.b;
            }
         } else {
            return exf.h;
         }
      } else {
         return exf.y;
      }
   }
}

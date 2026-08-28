import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class evp extends evg {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<evk> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<fcp> n = new Object2BooleanOpenHashMap();
   private final evf[] o = new evf[jo.c.a.b()];

   @Override
   public void a(dic $$0, bwt $$1) {
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
   public evf a() {
      jj.a $$0 = new jj.a();
      int $$1 = this.c.dB();
      dym $$2 = this.b.a($$0.b(this.c.dA(), (double)$$1, this.c.dG()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bj()) {
            while (true) {
               if (!$$2.a(dkw.J) && $$2.y() != euu.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.b.a($$0.b(this.c.dA(), (double)(++$$1), this.c.dG()));
            }
         } else if (this.c.aJ()) {
            $$1 = azk.a(this.c.dC() + 0.5);
         } else {
            $$0.b(this.c.dA(), this.c.dC() + 1.0, this.c.dG());

            while ($$0.v() > this.b.a().G_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dym $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(evi.a)) {
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

      jj $$4 = this.c.dv();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         fcp $$5 = this.c.cR();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new jj($$4.u(), $$1, $$4.w()));
   }

   protected evf c(jj $$0) {
      evf $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(jj $$0) {
      evk $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != evk.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public evo a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(evf[] $$0, evf $$1) {
      int $$2 = 0;
      int $$3 = 0;
      evk $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      evk $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != evk.w) {
         $$3 = azk.d(Math.max(1.0F, this.c.dP()));
      }

      double $$6 = this.d(new jj($$1.a, $$1.b, $$1.c));

      for (jo $$7 : jo.c.a) {
         evf $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jo $$9 : jo.c.a) {
         jo $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            evf $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable evf $$0, evf $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(evf $$0, @Nullable evf $$1, @Nullable evf $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != evk.d && $$2.l != evk.d) {
         boolean $$3 = $$2.l == evk.h && $$1.l == evk.h && (double)this.c.dq() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable evf $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == evk.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(evk $$0) {
      return $$0 == evk.h || $$0 == evk.s || $$0 == evk.t;
   }

   private boolean b(evf $$0) {
      fcp $$1 = this.c.cR();
      fcu $$2 = new fcu((double)$$0.a - this.c.dA() + $$1.b() / 2.0, (double)$$0.b - this.c.dC() + $$1.c() / 2.0, (double)$$0.c - this.c.dG() + $$1.d() / 2.0);
      int $$3 = azk.c($$2.g() / $$1.a());
      $$2 = $$2.c((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(jj $$0) {
      dgv $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(axf.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dgv $$0, jj $$1) {
      jj $$2 = $$1.e();
      fdo $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jo.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected evf a(int $$0, int $$1, int $$2, int $$3, double $$4, jo $$5, evk $$6) {
      evf $$7 = null;
      jj.a $$8 = new jj.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         evk $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != evk.c && (!this.c() || $$10 != evk.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != evk.h || this.g()) && $$10 != evk.m && $$10 != evk.e && $$10 != evk.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == evk.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == evk.b) {
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

   private evf a(int $$0, int $$1, int $$2, evk $$3, float $$4) {
      evf $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private evf a(int $$0, int $$1, int $$2) {
      evf $$3 = this.c($$0, $$1, $$2);
      $$3.l = evk.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private evf a(int $$0, int $$1, int $$2, evk $$3) {
      evf $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private evf a(int $$0, int $$1, int $$2, int $$3, double $$4, jo $$5, evk $$6, jj.a $$7) {
      evf $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.dq() >= 1.0F) {
         return $$8;
      } else if ($$8.l != evk.b && $$8.l != evk.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.c.dq() / 2.0;
         fcp $$12 = new fcp(
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
   private evf a(int $$0, int $$1, int $$2, @Nullable evf $$3) {
      $$1--;

      while ($$1 > this.c.dV().G_()) {
         evk $$4 = this.b($$0, $$1, $$2);
         if ($$4 != evk.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private evf d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.dV().G_(); $$3--) {
         if ($$1 - $$3 > this.c.cE()) {
            return this.a($$0, $$3, $$2);
         }

         evk $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != evk.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(fcp $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected evk b(int $$0, int $$1, int $$2) {
      return (evk)this.m.computeIfAbsent(jj.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public evk a(evm $$0, int $$1, int $$2, int $$3, bwt $$4) {
      Set<evk> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(evk.h)) {
         return evk.h;
      } else if ($$5.contains(evk.m)) {
         return evk.m;
      } else {
         evk $$6 = evk.a;

         for (evk $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != evk.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == evk.b ? evk.b : $$6;
      }
   }

   public Set<evk> b(evm $$0, int $$1, int $$2, int $$3) {
      EnumSet<evk> $$4 = EnumSet.noneOf(evk.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               evk $$11 = this.a($$0, $$8, $$9, $$10);
               jj $$12 = this.c.dv();
               boolean $$13 = this.d();
               if ($$11 == evk.s && this.e() && $$13) {
                  $$11 = evk.d;
               }

               if ($$11 == evk.r && !$$13) {
                  $$11 = evk.a;
               }

               if ($$11 == evk.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != evk.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != evk.l) {
                  $$11 = evk.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public evk a(evm $$0, int $$1, int $$2, int $$3) {
      return a($$0, new jj.a($$1, $$2, $$3));
   }

   public static evk b(bwt $$0, jj $$1) {
      return a(new evm($$0.dV(), $$0), $$1.k());
   }

   public static evk a(evm $$0, jj.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      evk $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == evk.b && $$3 >= $$0.a().G_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> evk.b;
            case o -> evk.o;
            case q -> evk.q;
            case w -> evk.w;
            case f -> evk.g;
            case y -> evk.y;
            case e -> evk.z;
            default -> a($$0, $$2, $$3, $$4, evk.c);
         };
      } else {
         return $$5;
      }
   }

   public static evk a(evm $$0, int $$1, int $$2, int $$3, evk $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  evk $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == evk.q) {
                     return evk.p;
                  }

                  if ($$8 == evk.o || $$8 == evk.i) {
                     return evk.n;
                  }

                  if ($$8 == evk.j) {
                     return evk.k;
                  }

                  if ($$8 == evk.y) {
                     return evk.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static evk b(dgv $$0, jj $$1) {
      dym $$2 = $$0.a_($$1);
      dku $$3 = $$2.b();
      if ($$2.l()) {
         return evk.b;
      } else if ($$2.a(awz.R) || $$2.a(dkw.fB) || $$2.a(dkw.tj)) {
         return evk.e;
      } else if ($$2.a(dkw.rt)) {
         return evk.f;
      } else if ($$2.a(dkw.ed) || $$2.a(dkw.oK)) {
         return evk.q;
      } else if ($$2.a(dkw.pK)) {
         return evk.w;
      } else if ($$2.a(dkw.fX)) {
         return evk.x;
      } else if (!$$2.a(dkw.ck) && !$$2.a(dkw.sX)) {
         eut $$4 = $$2.y();
         if ($$4.a(axf.b)) {
            return evk.i;
         } else if (a($$2)) {
            return evk.o;
         } else if ($$3 instanceof dnb $$5) {
            if ($$2.c(dnb.e)) {
               return evk.r;
            } else {
               return $$5.b().c() ? evk.s : evk.t;
            }
         } else if ($$3 instanceof dkj) {
            return evk.l;
         } else if ($$3 instanceof dpi) {
            return evk.v;
         } else if (!$$2.a(awz.U) && !$$2.a(awz.N) && (!($$3 instanceof dnu) || $$2.c(dnu.b))) {
            if (!$$2.a(evi.a)) {
               return evk.a;
            } else {
               return $$4.a(axf.a) ? evk.j : evk.b;
            }
         } else {
            return evk.h;
         }
      } else {
         return evk.y;
      }
   }
}

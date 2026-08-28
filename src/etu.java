import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class etu extends etl {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<etp> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<fau> n = new Object2BooleanOpenHashMap();
   private final etk[] o = new etk[jn.c.a.b()];

   @Override
   public void a(dgu $$0, bvi $$1) {
      super.a($$0, $$1);
      $$1.H();
   }

   @Override
   public void b() {
      this.c.I();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public etk a() {
      ji.a $$0 = new ji.a();
      int $$1 = this.c.dB();
      dww $$2 = this.b.a($$0.b(this.c.dA(), (double)$$1, this.c.dG()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bj()) {
            while (true) {
               if (!$$2.a(djn.J) && $$2.y() != esz.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.b.a($$0.b(this.c.dA(), (double)(++$$1), this.c.dG()));
            }
         } else if (this.c.aJ()) {
            $$1 = ayz.a(this.c.dC() + 0.5);
         } else {
            $$0.b(this.c.dA(), this.c.dC() + 1.0, this.c.dG());

            while ($$0.v() > this.b.a().L_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dww $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(etn.a)) {
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

      ji $$4 = this.c.dv();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         fau $$5 = this.c.cR();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new ji($$4.u(), $$1, $$4.w()));
   }

   protected etk c(ji $$0) {
      etk $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(ji $$0) {
      etp $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != etp.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public ett a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(etk[] $$0, etk $$1) {
      int $$2 = 0;
      int $$3 = 0;
      etp $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      etp $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != etp.w) {
         $$3 = ayz.d(Math.max(1.0F, this.c.dP()));
      }

      double $$6 = this.d(new ji($$1.a, $$1.b, $$1.c));

      for (jn $$7 : jn.c.a) {
         etk $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jn $$9 : jn.c.a) {
         jn $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            etk $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable etk $$0, etk $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(etk $$0, @Nullable etk $$1, @Nullable etk $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != etp.d && $$2.l != etp.d) {
         boolean $$3 = $$2.l == etp.h && $$1.l == etp.h && (double)this.c.dq() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable etk $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == etp.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(etp $$0) {
      return $$0 == etp.h || $$0 == etp.s || $$0 == etp.t;
   }

   private boolean b(etk $$0) {
      fau $$1 = this.c.cR();
      faz $$2 = new faz((double)$$0.a - this.c.dA() + $$1.b() / 2.0, (double)$$0.b - this.c.dC() + $$1.c() / 2.0, (double)$$0.c - this.c.dG() + $$1.d() / 2.0);
      int $$3 = ayz.c($$2.g() / $$1.a());
      $$2 = $$2.c((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(ji $$0) {
      dfm $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(awv.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dfm $$0, ji $$1) {
      ji $$2 = $$1.e();
      fbt $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jn.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected etk a(int $$0, int $$1, int $$2, int $$3, double $$4, jn $$5, etp $$6) {
      etk $$7 = null;
      ji.a $$8 = new ji.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         etp $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != etp.c && (!this.c() || $$10 != etp.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != etp.h || this.g()) && $$10 != etp.m && $$10 != etp.e && $$10 != etp.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == etp.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == etp.b) {
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

   private etk a(int $$0, int $$1, int $$2, etp $$3, float $$4) {
      etk $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private etk a(int $$0, int $$1, int $$2) {
      etk $$3 = this.c($$0, $$1, $$2);
      $$3.l = etp.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private etk a(int $$0, int $$1, int $$2, etp $$3) {
      etk $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private etk a(int $$0, int $$1, int $$2, int $$3, double $$4, jn $$5, etp $$6, ji.a $$7) {
      etk $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.dq() >= 1.0F) {
         return $$8;
      } else if ($$8.l != etp.b && $$8.l != etp.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.c.dq() / 2.0;
         fau $$12 = new fau(
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
   private etk a(int $$0, int $$1, int $$2, @Nullable etk $$3) {
      $$1--;

      while ($$1 > this.c.dV().L_()) {
         etp $$4 = this.b($$0, $$1, $$2);
         if ($$4 != etp.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private etk d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.dV().L_(); $$3--) {
         if ($$1 - $$3 > this.c.cE()) {
            return this.a($$0, $$3, $$2);
         }

         etp $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != etp.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(fau $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected etp b(int $$0, int $$1, int $$2) {
      return (etp)this.m.computeIfAbsent(ji.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public etp a(etr $$0, int $$1, int $$2, int $$3, bvi $$4) {
      Set<etp> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(etp.h)) {
         return etp.h;
      } else if ($$5.contains(etp.m)) {
         return etp.m;
      } else {
         etp $$6 = etp.a;

         for (etp $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != etp.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == etp.b ? etp.b : $$6;
      }
   }

   public Set<etp> b(etr $$0, int $$1, int $$2, int $$3) {
      EnumSet<etp> $$4 = EnumSet.noneOf(etp.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               etp $$11 = this.a($$0, $$8, $$9, $$10);
               ji $$12 = this.c.dv();
               boolean $$13 = this.d();
               if ($$11 == etp.s && this.e() && $$13) {
                  $$11 = etp.d;
               }

               if ($$11 == etp.r && !$$13) {
                  $$11 = etp.a;
               }

               if ($$11 == etp.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != etp.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != etp.l) {
                  $$11 = etp.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public etp a(etr $$0, int $$1, int $$2, int $$3) {
      return a($$0, new ji.a($$1, $$2, $$3));
   }

   public static etp b(bvi $$0, ji $$1) {
      return a(new etr($$0.dV(), $$0), $$1.k());
   }

   public static etp a(etr $$0, ji.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      etp $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == etp.b && $$3 >= $$0.a().L_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> etp.b;
            case o -> etp.o;
            case q -> etp.q;
            case w -> etp.w;
            case f -> etp.g;
            case y -> etp.y;
            case e -> etp.z;
            default -> a($$0, $$2, $$3, $$4, etp.c);
         };
      } else {
         return $$5;
      }
   }

   public static etp a(etr $$0, int $$1, int $$2, int $$3, etp $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  etp $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == etp.q) {
                     return etp.p;
                  }

                  if ($$8 == etp.o || $$8 == etp.i) {
                     return etp.n;
                  }

                  if ($$8 == etp.j) {
                     return etp.k;
                  }

                  if ($$8 == etp.y) {
                     return etp.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static etp b(dfm $$0, ji $$1) {
      dww $$2 = $$0.a_($$1);
      djl $$3 = $$2.b();
      if ($$2.l()) {
         return etp.b;
      } else if ($$2.a(awp.R) || $$2.a(djn.fB) || $$2.a(djn.tf)) {
         return etp.e;
      } else if ($$2.a(djn.rr)) {
         return etp.f;
      } else if ($$2.a(djn.ed) || $$2.a(djn.oK)) {
         return etp.q;
      } else if ($$2.a(djn.pI)) {
         return etp.w;
      } else if ($$2.a(djn.fX)) {
         return etp.x;
      } else if (!$$2.a(djn.ck) && !$$2.a(djn.sV)) {
         esy $$4 = $$2.y();
         if ($$4.a(awv.b)) {
            return etp.i;
         } else if (a($$2)) {
            return etp.o;
         } else if ($$3 instanceof dls $$5) {
            if ($$2.c(dls.c)) {
               return etp.r;
            } else {
               return $$5.b().c() ? etp.s : etp.t;
            }
         } else if ($$3 instanceof dja) {
            return etp.l;
         } else if ($$3 instanceof dnx) {
            return etp.v;
         } else if (!$$2.a(awp.U) && !$$2.a(awp.N) && (!($$3 instanceof dml) || $$2.c(dml.b))) {
            if (!$$2.a(etn.a)) {
               return etp.a;
            } else {
               return $$4.a(awv.a) ? etp.j : etp.b;
            }
         } else {
            return etp.h;
         }
      } else {
         return etp.y;
      }
   }
}

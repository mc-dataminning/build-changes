import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class etw extends etn {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<etr> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<faw> n = new Object2BooleanOpenHashMap();
   private final etm[] o = new etm[jn.c.a.b()];

   @Override
   public void a(dgw $$0, bvk $$1) {
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
   public etm a() {
      ji.a $$0 = new ji.a();
      int $$1 = this.c.dB();
      dwy $$2 = this.b.a($$0.b(this.c.dA(), (double)$$1, this.c.dG()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bj()) {
            while (true) {
               if (!$$2.a(djp.J) && $$2.y() != etb.c.a(false)) {
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
               dwy $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(etp.a)) {
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
         faw $$5 = this.c.cR();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new ji($$4.u(), $$1, $$4.w()));
   }

   protected etm c(ji $$0) {
      etm $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(ji $$0) {
      etr $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != etr.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public etv a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(etm[] $$0, etm $$1) {
      int $$2 = 0;
      int $$3 = 0;
      etr $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      etr $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != etr.w) {
         $$3 = ayz.d(Math.max(1.0F, this.c.dP()));
      }

      double $$6 = this.d(new ji($$1.a, $$1.b, $$1.c));

      for (jn $$7 : jn.c.a) {
         etm $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jn $$9 : jn.c.a) {
         jn $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            etm $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable etm $$0, etm $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(etm $$0, @Nullable etm $$1, @Nullable etm $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != etr.d && $$2.l != etr.d) {
         boolean $$3 = $$2.l == etr.h && $$1.l == etr.h && (double)this.c.dq() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable etm $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == etr.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(etr $$0) {
      return $$0 == etr.h || $$0 == etr.s || $$0 == etr.t;
   }

   private boolean b(etm $$0) {
      faw $$1 = this.c.cR();
      fbb $$2 = new fbb((double)$$0.a - this.c.dA() + $$1.b() / 2.0, (double)$$0.b - this.c.dC() + $$1.c() / 2.0, (double)$$0.c - this.c.dG() + $$1.d() / 2.0);
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
      dfo $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(awv.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dfo $$0, ji $$1) {
      ji $$2 = $$1.e();
      fbv $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jn.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected etm a(int $$0, int $$1, int $$2, int $$3, double $$4, jn $$5, etr $$6) {
      etm $$7 = null;
      ji.a $$8 = new ji.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         etr $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != etr.c && (!this.c() || $$10 != etr.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != etr.h || this.g()) && $$10 != etr.m && $$10 != etr.e && $$10 != etr.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == etr.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == etr.b) {
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

   private etm a(int $$0, int $$1, int $$2, etr $$3, float $$4) {
      etm $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private etm a(int $$0, int $$1, int $$2) {
      etm $$3 = this.c($$0, $$1, $$2);
      $$3.l = etr.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private etm a(int $$0, int $$1, int $$2, etr $$3) {
      etm $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private etm a(int $$0, int $$1, int $$2, int $$3, double $$4, jn $$5, etr $$6, ji.a $$7) {
      etm $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.dq() >= 1.0F) {
         return $$8;
      } else if ($$8.l != etr.b && $$8.l != etr.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.c.dq() / 2.0;
         faw $$12 = new faw(
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
   private etm a(int $$0, int $$1, int $$2, @Nullable etm $$3) {
      $$1--;

      while ($$1 > this.c.dV().L_()) {
         etr $$4 = this.b($$0, $$1, $$2);
         if ($$4 != etr.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private etm d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.dV().L_(); $$3--) {
         if ($$1 - $$3 > this.c.cE()) {
            return this.a($$0, $$3, $$2);
         }

         etr $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != etr.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(faw $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected etr b(int $$0, int $$1, int $$2) {
      return (etr)this.m.computeIfAbsent(ji.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public etr a(ett $$0, int $$1, int $$2, int $$3, bvk $$4) {
      Set<etr> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(etr.h)) {
         return etr.h;
      } else if ($$5.contains(etr.m)) {
         return etr.m;
      } else {
         etr $$6 = etr.a;

         for (etr $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != etr.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == etr.b ? etr.b : $$6;
      }
   }

   public Set<etr> b(ett $$0, int $$1, int $$2, int $$3) {
      EnumSet<etr> $$4 = EnumSet.noneOf(etr.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               etr $$11 = this.a($$0, $$8, $$9, $$10);
               ji $$12 = this.c.dv();
               boolean $$13 = this.d();
               if ($$11 == etr.s && this.e() && $$13) {
                  $$11 = etr.d;
               }

               if ($$11 == etr.r && !$$13) {
                  $$11 = etr.a;
               }

               if ($$11 == etr.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != etr.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != etr.l) {
                  $$11 = etr.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public etr a(ett $$0, int $$1, int $$2, int $$3) {
      return a($$0, new ji.a($$1, $$2, $$3));
   }

   public static etr b(bvk $$0, ji $$1) {
      return a(new ett($$0.dV(), $$0), $$1.k());
   }

   public static etr a(ett $$0, ji.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      etr $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == etr.b && $$3 >= $$0.a().L_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> etr.b;
            case o -> etr.o;
            case q -> etr.q;
            case w -> etr.w;
            case f -> etr.g;
            case y -> etr.y;
            case e -> etr.z;
            default -> a($$0, $$2, $$3, $$4, etr.c);
         };
      } else {
         return $$5;
      }
   }

   public static etr a(ett $$0, int $$1, int $$2, int $$3, etr $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  etr $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == etr.q) {
                     return etr.p;
                  }

                  if ($$8 == etr.o || $$8 == etr.i) {
                     return etr.n;
                  }

                  if ($$8 == etr.j) {
                     return etr.k;
                  }

                  if ($$8 == etr.y) {
                     return etr.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static etr b(dfo $$0, ji $$1) {
      dwy $$2 = $$0.a_($$1);
      djn $$3 = $$2.b();
      if ($$2.l()) {
         return etr.b;
      } else if ($$2.a(awp.R) || $$2.a(djp.fB) || $$2.a(djp.tf)) {
         return etr.e;
      } else if ($$2.a(djp.rr)) {
         return etr.f;
      } else if ($$2.a(djp.ed) || $$2.a(djp.oK)) {
         return etr.q;
      } else if ($$2.a(djp.pI)) {
         return etr.w;
      } else if ($$2.a(djp.fX)) {
         return etr.x;
      } else if (!$$2.a(djp.ck) && !$$2.a(djp.sV)) {
         eta $$4 = $$2.y();
         if ($$4.a(awv.b)) {
            return etr.i;
         } else if (a($$2)) {
            return etr.o;
         } else if ($$3 instanceof dlu $$5) {
            if ($$2.c(dlu.c)) {
               return etr.r;
            } else {
               return $$5.b().c() ? etr.s : etr.t;
            }
         } else if ($$3 instanceof djc) {
            return etr.l;
         } else if ($$3 instanceof dnz) {
            return etr.v;
         } else if (!$$2.a(awp.U) && !$$2.a(awp.N) && (!($$3 instanceof dmn) || $$2.c(dmn.b))) {
            if (!$$2.a(etp.a)) {
               return etr.a;
            } else {
               return $$4.a(awv.a) ? etr.j : etr.b;
            }
         } else {
            return etr.h;
         }
      } else {
         return etr.y;
      }
   }
}

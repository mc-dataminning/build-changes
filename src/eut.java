import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class eut extends euk {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<euo> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<fbt> n = new Object2BooleanOpenHashMap();
   private final euj[] o = new euj[jm.c.a.b()];

   @Override
   public void a(dhv $$0, bwi $$1) {
      super.a($$0, $$1);
      $$1.E();
   }

   @Override
   public void b() {
      this.c.F();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public euj a() {
      jh.a $$0 = new jh.a();
      int $$1 = this.c.dC();
      dxv $$2 = this.b.a($$0.b(this.c.dB(), (double)$$1, this.c.dH()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bj()) {
            while (true) {
               if (!$$2.a(dko.J) && $$2.y() != ety.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.b.a($$0.b(this.c.dB(), (double)(++$$1), this.c.dH()));
            }
         } else if (this.c.aJ()) {
            $$1 = bae.a(this.c.dD() + 0.5);
         } else {
            $$0.b(this.c.dB(), this.c.dD() + 1.0, this.c.dH());

            while ($$0.v() > this.b.a().L_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dxv $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(eum.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.c.a($$2.y())) {
            $$2 = this.b.a($$0.b(this.c.dB(), (double)(++$$1), this.c.dH()));
         }

         $$1--;
      }

      jh $$4 = this.c.dw();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         fbt $$5 = this.c.cR();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new jh($$4.u(), $$1, $$4.w()));
   }

   protected euj c(jh $$0) {
      euj $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(jh $$0) {
      euo $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != euo.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public eus a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(euj[] $$0, euj $$1) {
      int $$2 = 0;
      int $$3 = 0;
      euo $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      euo $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != euo.w) {
         $$3 = bae.d(Math.max(1.0F, this.c.dQ()));
      }

      double $$6 = this.d(new jh($$1.a, $$1.b, $$1.c));

      for (jm $$7 : jm.c.a) {
         euj $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jm $$9 : jm.c.a) {
         jm $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            euj $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable euj $$0, euj $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(euj $$0, @Nullable euj $$1, @Nullable euj $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != euo.d && $$2.l != euo.d) {
         boolean $$3 = $$2.l == euo.h && $$1.l == euo.h && (double)this.c.dr() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable euj $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == euo.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(euo $$0) {
      return $$0 == euo.h || $$0 == euo.s || $$0 == euo.t;
   }

   private boolean b(euj $$0) {
      fbt $$1 = this.c.cR();
      fby $$2 = new fby((double)$$0.a - this.c.dB() + $$1.b() / 2.0, (double)$$0.b - this.c.dD() + $$1.c() / 2.0, (double)$$0.c - this.c.dH() + $$1.d() / 2.0);
      int $$3 = bae.c($$2.g() / $$1.a());
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
      dgn $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(aya.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dgn $$0, jh $$1) {
      jh $$2 = $$1.e();
      fcs $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jm.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected euj a(int $$0, int $$1, int $$2, int $$3, double $$4, jm $$5, euo $$6) {
      euj $$7 = null;
      jh.a $$8 = new jh.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         euo $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != euo.c && (!this.c() || $$10 != euo.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != euo.h || this.g()) && $$10 != euo.m && $$10 != euo.e && $$10 != euo.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == euo.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == euo.b) {
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
      return Math.max(1.125, (double)this.c.dQ());
   }

   private euj a(int $$0, int $$1, int $$2, euo $$3, float $$4) {
      euj $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private euj a(int $$0, int $$1, int $$2) {
      euj $$3 = this.c($$0, $$1, $$2);
      $$3.l = euo.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private euj a(int $$0, int $$1, int $$2, euo $$3) {
      euj $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private euj a(int $$0, int $$1, int $$2, int $$3, double $$4, jm $$5, euo $$6, jh.a $$7) {
      euj $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.dr() >= 1.0F) {
         return $$8;
      } else if ($$8.l != euo.b && $$8.l != euo.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.c.dr() / 2.0;
         fbt $$12 = new fbt(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.c.ds() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private euj a(int $$0, int $$1, int $$2, @Nullable euj $$3) {
      $$1--;

      while ($$1 > this.c.dW().L_()) {
         euo $$4 = this.b($$0, $$1, $$2);
         if ($$4 != euo.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private euj d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.dW().L_(); $$3--) {
         if ($$1 - $$3 > this.c.cE()) {
            return this.a($$0, $$3, $$2);
         }

         euo $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != euo.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(fbt $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected euo b(int $$0, int $$1, int $$2) {
      return (euo)this.m.computeIfAbsent(jh.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public euo a(euq $$0, int $$1, int $$2, int $$3, bwi $$4) {
      Set<euo> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(euo.h)) {
         return euo.h;
      } else if ($$5.contains(euo.m)) {
         return euo.m;
      } else {
         euo $$6 = euo.a;

         for (euo $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != euo.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == euo.b ? euo.b : $$6;
      }
   }

   public Set<euo> b(euq $$0, int $$1, int $$2, int $$3) {
      EnumSet<euo> $$4 = EnumSet.noneOf(euo.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               euo $$11 = this.a($$0, $$8, $$9, $$10);
               jh $$12 = this.c.dw();
               boolean $$13 = this.d();
               if ($$11 == euo.s && this.e() && $$13) {
                  $$11 = euo.d;
               }

               if ($$11 == euo.r && !$$13) {
                  $$11 = euo.a;
               }

               if ($$11 == euo.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != euo.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != euo.l) {
                  $$11 = euo.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public euo a(euq $$0, int $$1, int $$2, int $$3) {
      return a($$0, new jh.a($$1, $$2, $$3));
   }

   public static euo b(bwi $$0, jh $$1) {
      return a(new euq($$0.dW(), $$0), $$1.k());
   }

   public static euo a(euq $$0, jh.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      euo $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == euo.b && $$3 >= $$0.a().L_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> euo.b;
            case o -> euo.o;
            case q -> euo.q;
            case w -> euo.w;
            case f -> euo.g;
            case y -> euo.y;
            case e -> euo.z;
            default -> a($$0, $$2, $$3, $$4, euo.c);
         };
      } else {
         return $$5;
      }
   }

   public static euo a(euq $$0, int $$1, int $$2, int $$3, euo $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  euo $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == euo.q) {
                     return euo.p;
                  }

                  if ($$8 == euo.o || $$8 == euo.i) {
                     return euo.n;
                  }

                  if ($$8 == euo.j) {
                     return euo.k;
                  }

                  if ($$8 == euo.y) {
                     return euo.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static euo b(dgn $$0, jh $$1) {
      dxv $$2 = $$0.a_($$1);
      dkm $$3 = $$2.b();
      if ($$2.l()) {
         return euo.b;
      } else if ($$2.a(axu.R) || $$2.a(dko.fA) || $$2.a(dko.sY)) {
         return euo.e;
      } else if ($$2.a(dko.rk)) {
         return euo.f;
      } else if ($$2.a(dko.ed) || $$2.a(dko.oD)) {
         return euo.q;
      } else if ($$2.a(dko.pB)) {
         return euo.w;
      } else if ($$2.a(dko.fQ)) {
         return euo.x;
      } else if (!$$2.a(dko.ck) && !$$2.a(dko.sO)) {
         etx $$4 = $$2.y();
         if ($$4.a(aya.b)) {
            return euo.i;
         } else if (a($$2)) {
            return euo.o;
         } else if ($$3 instanceof dmu $$5) {
            if ($$2.c(dmu.c)) {
               return euo.r;
            } else {
               return $$5.b().c() ? euo.s : euo.t;
            }
         } else if ($$3 instanceof dkb) {
            return euo.l;
         } else if ($$3 instanceof doy) {
            return euo.v;
         } else if (!$$2.a(axu.U) && !$$2.a(axu.N) && (!($$3 instanceof dnm) || $$2.c(dnm.b))) {
            if (!$$2.a(eum.a)) {
               return euo.a;
            } else {
               return $$4.a(aya.a) ? euo.j : euo.b;
            }
         } else {
            return euo.h;
         }
      } else {
         return euo.y;
      }
   }
}

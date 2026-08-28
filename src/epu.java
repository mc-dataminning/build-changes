import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class epu extends epl {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<epp> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ewr> n = new Object2BooleanOpenHashMap();
   private final epk[] o = new epk[ji.c.a.b()];

   @Override
   public void a(ddh $$0, btn $$1) {
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
   public epk a() {
      jd.a $$0 = new jd.a();
      int $$1 = this.b.dw();
      dta $$2 = this.a.a($$0.b(this.b.dv(), (double)$$1, this.b.dB()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.bf()) {
            while (true) {
               if (!$$2.a(dfy.G) && $$2.u() != eoz.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.dv(), (double)(++$$1), this.b.dB()));
            }
         } else if (this.b.aF()) {
            $$1 = ayn.a(this.b.dx() + 0.5);
         } else {
            $$0.b(this.b.dv(), this.b.dx() + 1.0, this.b.dB());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dta $$3 = this.a.a($$0);
               if (!$$3.i() && !$$3.a(epn.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a($$0.b(this.b.dv(), (double)(++$$1), this.b.dB()));
         }

         $$1--;
      }

      jd $$4 = this.b.dq();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ewr $$5 = this.b.cL();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new jd($$4.u(), $$1, $$4.w()));
   }

   protected epk c(jd $$0) {
      epk $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(jd $$0) {
      epp $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != epp.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public ept a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(epk[] $$0, epk $$1) {
      int $$2 = 0;
      int $$3 = 0;
      epp $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      epp $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != epp.w) {
         $$3 = ayn.d(Math.max(1.0F, this.b.dK()));
      }

      double $$6 = this.d(new jd($$1.a, $$1.b, $$1.c));

      for (ji $$7 : ji.c.a) {
         epk $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (ji $$9 : ji.c.a) {
         ji $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            epk $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable epk $$0, epk $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(epk $$0, @Nullable epk $$1, @Nullable epk $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != epp.d && $$2.l != epp.d) {
         boolean $$3 = $$2.l == epp.h && $$1.l == epp.h && (double)this.b.dk() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable epk $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == epp.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(epp $$0) {
      return $$0 == epp.h || $$0 == epp.s || $$0 == epp.t;
   }

   private boolean b(epk $$0) {
      ewr $$1 = this.b.cL();
      eww $$2 = new eww((double)$$0.a - this.b.dv() + $$1.b() / 2.0, (double)$$0.b - this.b.dx() + $$1.c() / 2.0, (double)$$0.c - this.b.dB() + $$1.d() / 2.0);
      int $$3 = ayn.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(jd $$0) {
      dca $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(awj.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dca $$0, jd $$1) {
      jd $$2 = $$1.d();
      exp $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ji.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected epk a(int $$0, int $$1, int $$2, int $$3, double $$4, ji $$5, epp $$6) {
      epk $$7 = null;
      jd.a $$8 = new jd.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         epp $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != epp.c && (!this.c() || $$10 != epp.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != epp.h || this.g()) && $$10 != epp.m && $$10 != epp.e && $$10 != epp.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == epp.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == epp.b) {
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
      return Math.max(1.125, (double)this.b.dK());
   }

   private epk a(int $$0, int $$1, int $$2, epp $$3, float $$4) {
      epk $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private epk a(int $$0, int $$1, int $$2) {
      epk $$3 = this.c($$0, $$1, $$2);
      $$3.l = epp.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private epk a(int $$0, int $$1, int $$2, epp $$3) {
      epk $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private epk a(int $$0, int $$1, int $$2, int $$3, double $$4, ji $$5, epp $$6, jd.a $$7) {
      epk $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dk() >= 1.0F) {
         return $$8;
      } else if ($$8.l != epp.b && $$8.l != epp.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dk() / 2.0;
         ewr $$12 = new ewr(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.dl() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private epk a(int $$0, int $$1, int $$2, @Nullable epk $$3) {
      $$1--;

      while ($$1 > this.b.dQ().I_()) {
         epp $$4 = this.b($$0, $$1, $$2);
         if ($$4 != epp.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private epk d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dQ().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cy()) {
            return this.a($$0, $$3, $$2);
         }

         epp $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != epp.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(ewr $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected epp b(int $$0, int $$1, int $$2) {
      return (epp)this.m.computeIfAbsent(jd.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public epp a(epr $$0, int $$1, int $$2, int $$3, btn $$4) {
      Set<epp> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(epp.h)) {
         return epp.h;
      } else if ($$5.contains(epp.m)) {
         return epp.m;
      } else {
         epp $$6 = epp.a;

         for (epp $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != epp.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == epp.b ? epp.b : $$6;
      }
   }

   public Set<epp> b(epr $$0, int $$1, int $$2, int $$3) {
      EnumSet<epp> $$4 = EnumSet.noneOf(epp.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               epp $$11 = this.a($$0, $$8, $$9, $$10);
               jd $$12 = this.b.dq();
               boolean $$13 = this.d();
               if ($$11 == epp.s && this.e() && $$13) {
                  $$11 = epp.d;
               }

               if ($$11 == epp.r && !$$13) {
                  $$11 = epp.a;
               }

               if ($$11 == epp.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != epp.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != epp.l) {
                  $$11 = epp.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public epp a(epr $$0, int $$1, int $$2, int $$3) {
      return a($$0, new jd.a($$1, $$2, $$3));
   }

   public static epp b(btn $$0, jd $$1) {
      return a(new epr($$0.dQ(), $$0), $$1.j());
   }

   public static epp a(epr $$0, jd.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      epp $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == epp.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> epp.b;
            case o -> epp.o;
            case q -> epp.q;
            case w -> epp.w;
            case f -> epp.g;
            case y -> epp.y;
            case e -> epp.z;
            default -> a($$0, $$2, $$3, $$4, epp.c);
         };
      } else {
         return $$5;
      }
   }

   public static epp a(epr $$0, int $$1, int $$2, int $$3, epp $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  epp $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == epp.q) {
                     return epp.p;
                  }

                  if ($$8 == epp.o || $$8 == epp.i) {
                     return epp.n;
                  }

                  if ($$8 == epp.j) {
                     return epp.k;
                  }

                  if ($$8 == epp.y) {
                     return epp.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static epp b(dca $$0, jd $$1) {
      dta $$2 = $$0.a_($$1);
      dfw $$3 = $$2.b();
      if ($$2.i()) {
         return epp.b;
      } else if ($$2.a(awd.P) || $$2.a(dfy.fm) || $$2.a(dfy.sD)) {
         return epp.e;
      } else if ($$2.a(dfy.qP)) {
         return epp.f;
      } else if ($$2.a(dfy.dQ) || $$2.a(dfy.oi)) {
         return epp.q;
      } else if ($$2.a(dfy.pg)) {
         return epp.w;
      } else if ($$2.a(dfy.fC)) {
         return epp.x;
      } else if (!$$2.a(dfy.cd) && !$$2.a(dfy.st)) {
         eoy $$4 = $$2.u();
         if ($$4.a(awj.b)) {
            return epp.i;
         } else if (a($$2)) {
            return epp.o;
         } else if ($$3 instanceof dic $$5) {
            if ($$2.c(dic.c)) {
               return epp.r;
            } else {
               return $$5.b().c() ? epp.s : epp.t;
            }
         } else if ($$3 instanceof dfl) {
            return epp.l;
         } else if ($$3 instanceof dkg) {
            return epp.v;
         } else if (!$$2.a(awd.S) && !$$2.a(awd.L) && (!($$3 instanceof div) || $$2.c(div.b))) {
            if (!$$2.a(epn.a)) {
               return epp.a;
            } else {
               return $$4.a(awj.a) ? epp.j : epp.b;
            }
         } else {
            return epp.h;
         }
      } else {
         return epp.y;
      }
   }
}

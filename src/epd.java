import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class epd extends eou {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<eoy> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ewa> n = new Object2BooleanOpenHashMap();
   private final eot[] o = new eot[jf.c.a.b()];

   @Override
   public void a(dcs $$0, btd $$1) {
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
   public eot a() {
      ja.a $$0 = new ja.a();
      int $$1 = this.b.dw();
      dsk $$2 = this.a.a($$0.b(this.b.dv(), (double)$$1, this.b.dB()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.bf()) {
            while (true) {
               if (!$$2.a(dfj.G) && $$2.u() != eoi.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.dv(), (double)(++$$1), this.b.dB()));
            }
         } else if (this.b.aF()) {
            $$1 = ayg.a(this.b.dx() + 0.5);
         } else {
            $$0.b(this.b.dv(), this.b.dx() + 1.0, this.b.dB());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dsk $$3 = this.a.a($$0);
               if (!$$3.i() && !$$3.a(eow.a)) {
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

      ja $$4 = this.b.dq();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ewa $$5 = this.b.cL();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new ja($$4.u(), $$1, $$4.w()));
   }

   protected eot c(ja $$0) {
      eot $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(ja $$0) {
      eoy $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != eoy.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public epc a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eot[] $$0, eot $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eoy $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      eoy $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != eoy.w) {
         $$3 = ayg.d(Math.max(1.0F, this.b.dK()));
      }

      double $$6 = this.d(new ja($$1.a, $$1.b, $$1.c));

      for (jf $$7 : jf.c.a) {
         eot $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jf $$9 : jf.c.a) {
         jf $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            eot $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eot $$0, eot $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eot $$0, @Nullable eot $$1, @Nullable eot $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eoy.d && $$2.l != eoy.d) {
         boolean $$3 = $$2.l == eoy.h && $$1.l == eoy.h && (double)this.b.dk() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable eot $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == eoy.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(eoy $$0) {
      return $$0 == eoy.h || $$0 == eoy.s || $$0 == eoy.t;
   }

   private boolean b(eot $$0) {
      ewa $$1 = this.b.cL();
      ewf $$2 = new ewf((double)$$0.a - this.b.dv() + $$1.b() / 2.0, (double)$$0.b - this.b.dx() + $$1.c() / 2.0, (double)$$0.c - this.b.dB() + $$1.d() / 2.0);
      int $$3 = ayg.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(ja $$0) {
      dbl $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(awc.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dbl $$0, ja $$1) {
      ja $$2 = $$1.d();
      ewy $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jf.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eot a(int $$0, int $$1, int $$2, int $$3, double $$4, jf $$5, eoy $$6) {
      eot $$7 = null;
      ja.a $$8 = new ja.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eoy $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eoy.c && (!this.c() || $$10 != eoy.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eoy.h || this.g()) && $$10 != eoy.m && $$10 != eoy.e && $$10 != eoy.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == eoy.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == eoy.b) {
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

   private eot a(int $$0, int $$1, int $$2, eoy $$3, float $$4) {
      eot $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eot a(int $$0, int $$1, int $$2) {
      eot $$3 = this.c($$0, $$1, $$2);
      $$3.l = eoy.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private eot a(int $$0, int $$1, int $$2, eoy $$3) {
      eot $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private eot a(int $$0, int $$1, int $$2, int $$3, double $$4, jf $$5, eoy $$6, ja.a $$7) {
      eot $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dk() >= 1.0F) {
         return $$8;
      } else if ($$8.l != eoy.b && $$8.l != eoy.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dk() / 2.0;
         ewa $$12 = new ewa(
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
   private eot a(int $$0, int $$1, int $$2, @Nullable eot $$3) {
      $$1--;

      while ($$1 > this.b.dQ().I_()) {
         eoy $$4 = this.b($$0, $$1, $$2);
         if ($$4 != eoy.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private eot d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dQ().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cy()) {
            return this.a($$0, $$3, $$2);
         }

         eoy $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != eoy.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(ewa $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected eoy b(int $$0, int $$1, int $$2) {
      return (eoy)this.m.computeIfAbsent(ja.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public eoy a(epa $$0, int $$1, int $$2, int $$3, btd $$4) {
      Set<eoy> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(eoy.h)) {
         return eoy.h;
      } else if ($$5.contains(eoy.m)) {
         return eoy.m;
      } else {
         eoy $$6 = eoy.a;

         for (eoy $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != eoy.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == eoy.b ? eoy.b : $$6;
      }
   }

   public Set<eoy> b(epa $$0, int $$1, int $$2, int $$3) {
      EnumSet<eoy> $$4 = EnumSet.noneOf(eoy.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               eoy $$11 = this.a($$0, $$8, $$9, $$10);
               ja $$12 = this.b.dq();
               boolean $$13 = this.d();
               if ($$11 == eoy.s && this.e() && $$13) {
                  $$11 = eoy.d;
               }

               if ($$11 == eoy.r && !$$13) {
                  $$11 = eoy.a;
               }

               if ($$11 == eoy.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != eoy.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != eoy.l) {
                  $$11 = eoy.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public eoy a(epa $$0, int $$1, int $$2, int $$3) {
      return a($$0, new ja.a($$1, $$2, $$3));
   }

   public static eoy b(btd $$0, ja $$1) {
      return a(new epa($$0.dQ(), $$0), $$1.j());
   }

   public static eoy a(epa $$0, ja.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eoy $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == eoy.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> eoy.b;
            case o -> eoy.o;
            case q -> eoy.q;
            case w -> eoy.w;
            case f -> eoy.g;
            case y -> eoy.y;
            case e -> eoy.z;
            default -> a($$0, $$2, $$3, $$4, eoy.c);
         };
      } else {
         return $$5;
      }
   }

   public static eoy a(epa $$0, int $$1, int $$2, int $$3, eoy $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  eoy $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == eoy.q) {
                     return eoy.p;
                  }

                  if ($$8 == eoy.o || $$8 == eoy.i) {
                     return eoy.n;
                  }

                  if ($$8 == eoy.j) {
                     return eoy.k;
                  }

                  if ($$8 == eoy.y) {
                     return eoy.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static eoy b(dbl $$0, ja $$1) {
      dsk $$2 = $$0.a_($$1);
      dfh $$3 = $$2.b();
      if ($$2.i()) {
         return eoy.b;
      } else if ($$2.a(avw.P) || $$2.a(dfj.fm) || $$2.a(dfj.sD)) {
         return eoy.e;
      } else if ($$2.a(dfj.qP)) {
         return eoy.f;
      } else if ($$2.a(dfj.dQ) || $$2.a(dfj.oi)) {
         return eoy.q;
      } else if ($$2.a(dfj.pg)) {
         return eoy.w;
      } else if ($$2.a(dfj.fC)) {
         return eoy.x;
      } else if (!$$2.a(dfj.cd) && !$$2.a(dfj.st)) {
         eoh $$4 = $$2.u();
         if ($$4.a(awc.b)) {
            return eoy.i;
         } else if (a($$2)) {
            return eoy.o;
         } else if ($$3 instanceof dhn $$5) {
            if ($$2.c(dhn.c)) {
               return eoy.r;
            } else {
               return $$5.b().c() ? eoy.s : eoy.t;
            }
         } else if ($$3 instanceof dew) {
            return eoy.l;
         } else if ($$3 instanceof djr) {
            return eoy.v;
         } else if (!$$2.a(avw.S) && !$$2.a(avw.L) && (!($$3 instanceof dig) || $$2.c(dig.b))) {
            if (!$$2.a(eow.a)) {
               return eoy.a;
            } else {
               return $$4.a(awc.a) ? eoy.j : eoy.b;
            }
         } else {
            return eoy.h;
         }
      } else {
         return eoy.y;
      }
   }
}

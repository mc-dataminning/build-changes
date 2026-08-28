import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class eqa extends epr {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<epv> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ewx> n = new Object2BooleanOpenHashMap();
   private final epq[] o = new epq[ji.c.a.b()];

   @Override
   public void a(ddj $$0, btp $$1) {
      super.a($$0, $$1);
      $$1.E();
   }

   @Override
   public void b() {
      this.b.F();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public epq a() {
      jd.a $$0 = new jd.a();
      int $$1 = this.b.du();
      dtc $$2 = this.a.a($$0.b(this.b.dt(), (double)$$1, this.b.dz()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.bf()) {
            while (true) {
               if (!$$2.a(dga.G) && $$2.u() != epf.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.dt(), (double)(++$$1), this.b.dz()));
            }
         } else if (this.b.aF()) {
            $$1 = ayo.a(this.b.dv() + 0.5);
         } else {
            $$0.b(this.b.dt(), this.b.dv() + 1.0, this.b.dz());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dtc $$3 = this.a.a($$0);
               if (!$$3.i() && !$$3.a(ept.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a($$0.b(this.b.dt(), (double)(++$$1), this.b.dz()));
         }

         $$1--;
      }

      jd $$4 = this.b.do();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ewx $$5 = this.b.cK();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new jd($$4.u(), $$1, $$4.w()));
   }

   protected epq c(jd $$0) {
      epq $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(jd $$0) {
      epv $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != epv.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public epz a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(epq[] $$0, epq $$1) {
      int $$2 = 0;
      int $$3 = 0;
      epv $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      epv $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != epv.w) {
         $$3 = ayo.d(Math.max(1.0F, this.b.dI()));
      }

      double $$6 = this.d(new jd($$1.a, $$1.b, $$1.c));

      for (ji $$7 : ji.c.a) {
         epq $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (ji $$9 : ji.c.a) {
         ji $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            epq $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable epq $$0, epq $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(epq $$0, @Nullable epq $$1, @Nullable epq $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != epv.d && $$2.l != epv.d) {
         boolean $$3 = $$2.l == epv.h && $$1.l == epv.h && (double)this.b.dj() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable epq $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == epv.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(epv $$0) {
      return $$0 == epv.h || $$0 == epv.s || $$0 == epv.t;
   }

   private boolean b(epq $$0) {
      ewx $$1 = this.b.cK();
      exc $$2 = new exc((double)$$0.a - this.b.dt() + $$1.b() / 2.0, (double)$$0.b - this.b.dv() + $$1.c() / 2.0, (double)$$0.c - this.b.dz() + $$1.d() / 2.0);
      int $$3 = ayo.c($$2.f() / $$1.a());
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
      dcc $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(awk.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dcc $$0, jd $$1) {
      jd $$2 = $$1.e();
      exv $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ji.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected epq a(int $$0, int $$1, int $$2, int $$3, double $$4, ji $$5, epv $$6) {
      epq $$7 = null;
      jd.a $$8 = new jd.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         epv $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != epv.c && (!this.c() || $$10 != epv.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != epv.h || this.g()) && $$10 != epv.m && $$10 != epv.e && $$10 != epv.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == epv.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == epv.b) {
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
      return Math.max(1.125, (double)this.b.dI());
   }

   private epq a(int $$0, int $$1, int $$2, epv $$3, float $$4) {
      epq $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private epq a(int $$0, int $$1, int $$2) {
      epq $$3 = this.c($$0, $$1, $$2);
      $$3.l = epv.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private epq a(int $$0, int $$1, int $$2, epv $$3) {
      epq $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private epq a(int $$0, int $$1, int $$2, int $$3, double $$4, ji $$5, epv $$6, jd.a $$7) {
      epq $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dj() >= 1.0F) {
         return $$8;
      } else if ($$8.l != epv.b && $$8.l != epv.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dj() / 2.0;
         ewx $$12 = new ewx(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.dk() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private epq a(int $$0, int $$1, int $$2, @Nullable epq $$3) {
      $$1--;

      while ($$1 > this.b.dO().I_()) {
         epv $$4 = this.b($$0, $$1, $$2);
         if ($$4 != epv.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private epq d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dO().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cx()) {
            return this.a($$0, $$3, $$2);
         }

         epv $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != epv.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(ewx $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected epv b(int $$0, int $$1, int $$2) {
      return (epv)this.m.computeIfAbsent(jd.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public epv a(epx $$0, int $$1, int $$2, int $$3, btp $$4) {
      Set<epv> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(epv.h)) {
         return epv.h;
      } else if ($$5.contains(epv.m)) {
         return epv.m;
      } else {
         epv $$6 = epv.a;

         for (epv $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != epv.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == epv.b ? epv.b : $$6;
      }
   }

   public Set<epv> b(epx $$0, int $$1, int $$2, int $$3) {
      EnumSet<epv> $$4 = EnumSet.noneOf(epv.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               epv $$11 = this.a($$0, $$8, $$9, $$10);
               jd $$12 = this.b.do();
               boolean $$13 = this.d();
               if ($$11 == epv.s && this.e() && $$13) {
                  $$11 = epv.d;
               }

               if ($$11 == epv.r && !$$13) {
                  $$11 = epv.a;
               }

               if ($$11 == epv.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != epv.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != epv.l) {
                  $$11 = epv.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public epv a(epx $$0, int $$1, int $$2, int $$3) {
      return a($$0, new jd.a($$1, $$2, $$3));
   }

   public static epv b(btp $$0, jd $$1) {
      return a(new epx($$0.dO(), $$0), $$1.k());
   }

   public static epv a(epx $$0, jd.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      epv $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == epv.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> epv.b;
            case o -> epv.o;
            case q -> epv.q;
            case w -> epv.w;
            case f -> epv.g;
            case y -> epv.y;
            case e -> epv.z;
            default -> a($$0, $$2, $$3, $$4, epv.c);
         };
      } else {
         return $$5;
      }
   }

   public static epv a(epx $$0, int $$1, int $$2, int $$3, epv $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  epv $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == epv.q) {
                     return epv.p;
                  }

                  if ($$8 == epv.o || $$8 == epv.i) {
                     return epv.n;
                  }

                  if ($$8 == epv.j) {
                     return epv.k;
                  }

                  if ($$8 == epv.y) {
                     return epv.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static epv b(dcc $$0, jd $$1) {
      dtc $$2 = $$0.a_($$1);
      dfy $$3 = $$2.b();
      if ($$2.i()) {
         return epv.b;
      } else if ($$2.a(awe.Q) || $$2.a(dga.fm) || $$2.a(dga.sD)) {
         return epv.e;
      } else if ($$2.a(dga.qP)) {
         return epv.f;
      } else if ($$2.a(dga.dQ) || $$2.a(dga.oi)) {
         return epv.q;
      } else if ($$2.a(dga.pg)) {
         return epv.w;
      } else if ($$2.a(dga.fC)) {
         return epv.x;
      } else if (!$$2.a(dga.cd) && !$$2.a(dga.st)) {
         epe $$4 = $$2.u();
         if ($$4.a(awk.b)) {
            return epv.i;
         } else if (a($$2)) {
            return epv.o;
         } else if ($$3 instanceof die $$5) {
            if ($$2.c(die.c)) {
               return epv.r;
            } else {
               return $$5.b().c() ? epv.s : epv.t;
            }
         } else if ($$3 instanceof dfn) {
            return epv.l;
         } else if ($$3 instanceof dki) {
            return epv.v;
         } else if (!$$2.a(awe.T) && !$$2.a(awe.M) && (!($$3 instanceof dix) || $$2.c(dix.b))) {
            if (!$$2.a(ept.a)) {
               return epv.a;
            } else {
               return $$4.a(awk.a) ? epv.j : epv.b;
            }
         } else {
            return epv.h;
         }
      } else {
         return epv.y;
      }
   }
}

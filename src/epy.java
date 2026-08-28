import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class epy extends epp {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<ept> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ewv> n = new Object2BooleanOpenHashMap();
   private final epo[] o = new epo[ji.c.a.b()];

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
   public epo a() {
      jd.a $$0 = new jd.a();
      int $$1 = this.b.dv();
      dtc $$2 = this.a.a($$0.b(this.b.du(), (double)$$1, this.b.dA()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.bf()) {
            while (true) {
               if (!$$2.a(dga.G) && $$2.u() != epd.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.du(), (double)(++$$1), this.b.dA()));
            }
         } else if (this.b.aF()) {
            $$1 = ayo.a(this.b.dw() + 0.5);
         } else {
            $$0.b(this.b.du(), this.b.dw() + 1.0, this.b.dA());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dtc $$3 = this.a.a($$0);
               if (!$$3.i() && !$$3.a(epr.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a($$0.b(this.b.du(), (double)(++$$1), this.b.dA()));
         }

         $$1--;
      }

      jd $$4 = this.b.dp();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ewv $$5 = this.b.cL();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new jd($$4.u(), $$1, $$4.w()));
   }

   protected epo c(jd $$0) {
      epo $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(jd $$0) {
      ept $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != ept.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public epx a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(epo[] $$0, epo $$1) {
      int $$2 = 0;
      int $$3 = 0;
      ept $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      ept $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != ept.w) {
         $$3 = ayo.d(Math.max(1.0F, this.b.dJ()));
      }

      double $$6 = this.d(new jd($$1.a, $$1.b, $$1.c));

      for (ji $$7 : ji.c.a) {
         epo $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (ji $$9 : ji.c.a) {
         ji $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            epo $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable epo $$0, epo $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(epo $$0, @Nullable epo $$1, @Nullable epo $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != ept.d && $$2.l != ept.d) {
         boolean $$3 = $$2.l == ept.h && $$1.l == ept.h && (double)this.b.dk() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable epo $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == ept.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(ept $$0) {
      return $$0 == ept.h || $$0 == ept.s || $$0 == ept.t;
   }

   private boolean b(epo $$0) {
      ewv $$1 = this.b.cL();
      exa $$2 = new exa((double)$$0.a - this.b.du() + $$1.b() / 2.0, (double)$$0.b - this.b.dw() + $$1.c() / 2.0, (double)$$0.c - this.b.dA() + $$1.d() / 2.0);
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
      ext $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ji.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected epo a(int $$0, int $$1, int $$2, int $$3, double $$4, ji $$5, ept $$6) {
      epo $$7 = null;
      jd.a $$8 = new jd.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         ept $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != ept.c && (!this.c() || $$10 != ept.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != ept.h || this.g()) && $$10 != ept.m && $$10 != ept.e && $$10 != ept.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == ept.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == ept.b) {
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
      return Math.max(1.125, (double)this.b.dJ());
   }

   private epo a(int $$0, int $$1, int $$2, ept $$3, float $$4) {
      epo $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private epo a(int $$0, int $$1, int $$2) {
      epo $$3 = this.c($$0, $$1, $$2);
      $$3.l = ept.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private epo a(int $$0, int $$1, int $$2, ept $$3) {
      epo $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private epo a(int $$0, int $$1, int $$2, int $$3, double $$4, ji $$5, ept $$6, jd.a $$7) {
      epo $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dk() >= 1.0F) {
         return $$8;
      } else if ($$8.l != ept.b && $$8.l != ept.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dk() / 2.0;
         ewv $$12 = new ewv(
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
   private epo a(int $$0, int $$1, int $$2, @Nullable epo $$3) {
      $$1--;

      while ($$1 > this.b.dP().I_()) {
         ept $$4 = this.b($$0, $$1, $$2);
         if ($$4 != ept.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private epo d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dP().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cy()) {
            return this.a($$0, $$3, $$2);
         }

         ept $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != ept.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(ewv $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected ept b(int $$0, int $$1, int $$2) {
      return (ept)this.m.computeIfAbsent(jd.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public ept a(epv $$0, int $$1, int $$2, int $$3, btp $$4) {
      Set<ept> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(ept.h)) {
         return ept.h;
      } else if ($$5.contains(ept.m)) {
         return ept.m;
      } else {
         ept $$6 = ept.a;

         for (ept $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != ept.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == ept.b ? ept.b : $$6;
      }
   }

   public Set<ept> b(epv $$0, int $$1, int $$2, int $$3) {
      EnumSet<ept> $$4 = EnumSet.noneOf(ept.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               ept $$11 = this.a($$0, $$8, $$9, $$10);
               jd $$12 = this.b.dp();
               boolean $$13 = this.d();
               if ($$11 == ept.s && this.e() && $$13) {
                  $$11 = ept.d;
               }

               if ($$11 == ept.r && !$$13) {
                  $$11 = ept.a;
               }

               if ($$11 == ept.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != ept.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != ept.l) {
                  $$11 = ept.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public ept a(epv $$0, int $$1, int $$2, int $$3) {
      return a($$0, new jd.a($$1, $$2, $$3));
   }

   public static ept b(btp $$0, jd $$1) {
      return a(new epv($$0.dP(), $$0), $$1.k());
   }

   public static ept a(epv $$0, jd.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      ept $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == ept.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> ept.b;
            case o -> ept.o;
            case q -> ept.q;
            case w -> ept.w;
            case f -> ept.g;
            case y -> ept.y;
            case e -> ept.z;
            default -> a($$0, $$2, $$3, $$4, ept.c);
         };
      } else {
         return $$5;
      }
   }

   public static ept a(epv $$0, int $$1, int $$2, int $$3, ept $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  ept $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == ept.q) {
                     return ept.p;
                  }

                  if ($$8 == ept.o || $$8 == ept.i) {
                     return ept.n;
                  }

                  if ($$8 == ept.j) {
                     return ept.k;
                  }

                  if ($$8 == ept.y) {
                     return ept.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static ept b(dcc $$0, jd $$1) {
      dtc $$2 = $$0.a_($$1);
      dfy $$3 = $$2.b();
      if ($$2.i()) {
         return ept.b;
      } else if ($$2.a(awe.P) || $$2.a(dga.fm) || $$2.a(dga.sD)) {
         return ept.e;
      } else if ($$2.a(dga.qP)) {
         return ept.f;
      } else if ($$2.a(dga.dQ) || $$2.a(dga.oi)) {
         return ept.q;
      } else if ($$2.a(dga.pg)) {
         return ept.w;
      } else if ($$2.a(dga.fC)) {
         return ept.x;
      } else if (!$$2.a(dga.cd) && !$$2.a(dga.st)) {
         epc $$4 = $$2.u();
         if ($$4.a(awk.b)) {
            return ept.i;
         } else if (a($$2)) {
            return ept.o;
         } else if ($$3 instanceof die $$5) {
            if ($$2.c(die.c)) {
               return ept.r;
            } else {
               return $$5.b().c() ? ept.s : ept.t;
            }
         } else if ($$3 instanceof dfn) {
            return ept.l;
         } else if ($$3 instanceof dki) {
            return ept.v;
         } else if (!$$2.a(awe.S) && !$$2.a(awe.L) && (!($$3 instanceof dix) || $$2.c(dix.b))) {
            if (!$$2.a(epr.a)) {
               return ept.a;
            } else {
               return $$4.a(awk.a) ? ept.j : ept.b;
            }
         } else {
            return ept.h;
         }
      } else {
         return ept.y;
      }
   }
}

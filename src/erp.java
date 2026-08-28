import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class erp extends erg {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<erk> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<eyr> n = new Object2BooleanOpenHashMap();
   private final erf[] o = new erf[jk.c.a.b()];

   @Override
   public void a(dew $$0, bup $$1) {
      super.a($$0, $$1);
      $$1.G();
   }

   @Override
   public void b() {
      this.b.I();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public erf a() {
      jf.a $$0 = new jf.a();
      int $$1 = this.b.dy();
      dus $$2 = this.a.a($$0.b(this.b.dx(), (double)$$1, this.b.dD()));
      if (!this.b.a($$2.y())) {
         if (this.f() && this.b.bi()) {
            while (true) {
               if (!$$2.a(dho.G) && $$2.y() != equ.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.dx(), (double)(++$$1), this.b.dD()));
            }
         } else if (this.b.aH()) {
            $$1 = azf.a(this.b.dz() + 0.5);
         } else {
            $$0.b(this.b.dx(), this.b.dz() + 1.0, this.b.dD());

            while ($$0.v() > this.a.a().H_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dus $$3 = this.a.a($$0);
               if (!$$3.l() && !$$3.a(eri.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.y())) {
            $$2 = this.a.a($$0.b(this.b.dx(), (double)(++$$1), this.b.dD()));
         }

         $$1--;
      }

      jf $$4 = this.b.ds();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         eyr $$5 = this.b.cO();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new jf($$4.u(), $$1, $$4.w()));
   }

   protected erf c(jf $$0) {
      erf $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(jf $$0) {
      erk $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != erk.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public ero a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(erf[] $$0, erf $$1) {
      int $$2 = 0;
      int $$3 = 0;
      erk $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      erk $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != erk.w) {
         $$3 = azf.d(Math.max(1.0F, this.b.dM()));
      }

      double $$6 = this.d(new jf($$1.a, $$1.b, $$1.c));

      for (jk $$7 : jk.c.a) {
         erf $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jk $$9 : jk.c.a) {
         jk $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            erf $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable erf $$0, erf $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(erf $$0, @Nullable erf $$1, @Nullable erf $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != erk.d && $$2.l != erk.d) {
         boolean $$3 = $$2.l == erk.h && $$1.l == erk.h && (double)this.b.dn() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable erf $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == erk.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(erk $$0) {
      return $$0 == erk.h || $$0 == erk.s || $$0 == erk.t;
   }

   private boolean b(erf $$0) {
      eyr $$1 = this.b.cO();
      eyw $$2 = new eyw((double)$$0.a - this.b.dx() + $$1.b() / 2.0, (double)$$0.b - this.b.dz() + $$1.c() / 2.0, (double)$$0.c - this.b.dD() + $$1.d() / 2.0);
      int $$3 = azf.c($$2.g() / $$1.a());
      $$2 = $$2.c((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(jf $$0) {
      ddo $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(axb.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(ddo $$0, jf $$1) {
      jf $$2 = $$1.e();
      ezq $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jk.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected erf a(int $$0, int $$1, int $$2, int $$3, double $$4, jk $$5, erk $$6) {
      erf $$7 = null;
      jf.a $$8 = new jf.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         erk $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != erk.c && (!this.c() || $$10 != erk.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != erk.h || this.g()) && $$10 != erk.m && $$10 != erk.e && $$10 != erk.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == erk.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == erk.b) {
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
      return Math.max(1.125, (double)this.b.dM());
   }

   private erf a(int $$0, int $$1, int $$2, erk $$3, float $$4) {
      erf $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private erf a(int $$0, int $$1, int $$2) {
      erf $$3 = this.c($$0, $$1, $$2);
      $$3.l = erk.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private erf a(int $$0, int $$1, int $$2, erk $$3) {
      erf $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private erf a(int $$0, int $$1, int $$2, int $$3, double $$4, jk $$5, erk $$6, jf.a $$7) {
      erf $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dn() >= 1.0F) {
         return $$8;
      } else if ($$8.l != erk.b && $$8.l != erk.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dn() / 2.0;
         eyr $$12 = new eyr(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.do() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private erf a(int $$0, int $$1, int $$2, @Nullable erf $$3) {
      $$1--;

      while ($$1 > this.b.dS().H_()) {
         erk $$4 = this.b($$0, $$1, $$2);
         if ($$4 != erk.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private erf d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dS().H_(); $$3--) {
         if ($$1 - $$3 > this.b.cB()) {
            return this.a($$0, $$3, $$2);
         }

         erk $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != erk.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(eyr $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected erk b(int $$0, int $$1, int $$2) {
      return (erk)this.m.computeIfAbsent(jf.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public erk a(erm $$0, int $$1, int $$2, int $$3, bup $$4) {
      Set<erk> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(erk.h)) {
         return erk.h;
      } else if ($$5.contains(erk.m)) {
         return erk.m;
      } else {
         erk $$6 = erk.a;

         for (erk $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != erk.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == erk.b ? erk.b : $$6;
      }
   }

   public Set<erk> b(erm $$0, int $$1, int $$2, int $$3) {
      EnumSet<erk> $$4 = EnumSet.noneOf(erk.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               erk $$11 = this.a($$0, $$8, $$9, $$10);
               jf $$12 = this.b.ds();
               boolean $$13 = this.d();
               if ($$11 == erk.s && this.e() && $$13) {
                  $$11 = erk.d;
               }

               if ($$11 == erk.r && !$$13) {
                  $$11 = erk.a;
               }

               if ($$11 == erk.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != erk.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != erk.l) {
                  $$11 = erk.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public erk a(erm $$0, int $$1, int $$2, int $$3) {
      return a($$0, new jf.a($$1, $$2, $$3));
   }

   public static erk b(bup $$0, jf $$1) {
      return a(new erm($$0.dS(), $$0), $$1.k());
   }

   public static erk a(erm $$0, jf.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      erk $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == erk.b && $$3 >= $$0.a().H_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> erk.b;
            case o -> erk.o;
            case q -> erk.q;
            case w -> erk.w;
            case f -> erk.g;
            case y -> erk.y;
            case e -> erk.z;
            default -> a($$0, $$2, $$3, $$4, erk.c);
         };
      } else {
         return $$5;
      }
   }

   public static erk a(erm $$0, int $$1, int $$2, int $$3, erk $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  erk $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == erk.q) {
                     return erk.p;
                  }

                  if ($$8 == erk.o || $$8 == erk.i) {
                     return erk.n;
                  }

                  if ($$8 == erk.j) {
                     return erk.k;
                  }

                  if ($$8 == erk.y) {
                     return erk.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static erk b(ddo $$0, jf $$1) {
      dus $$2 = $$0.a_($$1);
      dhm $$3 = $$2.b();
      if ($$2.l()) {
         return erk.b;
      } else if ($$2.a(awv.Q) || $$2.a(dho.fm) || $$2.a(dho.sD)) {
         return erk.e;
      } else if ($$2.a(dho.qP)) {
         return erk.f;
      } else if ($$2.a(dho.dQ) || $$2.a(dho.oi)) {
         return erk.q;
      } else if ($$2.a(dho.pg)) {
         return erk.w;
      } else if ($$2.a(dho.fC)) {
         return erk.x;
      } else if (!$$2.a(dho.cd) && !$$2.a(dho.st)) {
         eqt $$4 = $$2.y();
         if ($$4.a(axb.b)) {
            return erk.i;
         } else if (a($$2)) {
            return erk.o;
         } else if ($$3 instanceof djs $$5) {
            if ($$2.c(djs.c)) {
               return erk.r;
            } else {
               return $$5.b().c() ? erk.s : erk.t;
            }
         } else if ($$3 instanceof dhb) {
            return erk.l;
         } else if ($$3 instanceof dlw) {
            return erk.v;
         } else if (!$$2.a(awv.T) && !$$2.a(awv.M) && (!($$3 instanceof dkl) || $$2.c(dkl.b))) {
            if (!$$2.a(eri.a)) {
               return erk.a;
            } else {
               return $$4.a(axb.a) ? erk.j : erk.b;
            }
         } else {
            return erk.h;
         }
      } else {
         return erk.y;
      }
   }
}

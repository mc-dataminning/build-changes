import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class eoq extends eoh {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<eol> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<evl> n = new Object2BooleanOpenHashMap();
   private final eog[] o = new eog[je.c.a.b()];

   @Override
   public void a(dck $$0, btq $$1) {
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
   public eog a() {
      iz.a $$0 = new iz.a();
      int $$1 = this.b.dv();
      dsb $$2 = this.a.a($$0.b(this.b.du(), (double)$$1, this.b.dA()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.be()) {
            while (true) {
               if (!$$2.a(dfa.G) && $$2.u() != env.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.du(), (double)(++$$1), this.b.dA()));
            }
         } else if (this.b.aE()) {
            $$1 = ayy.a(this.b.dw() + 0.5);
         } else {
            $$0.b(this.b.du(), this.b.dw() + 1.0, this.b.dA());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dsb $$3 = this.a.a($$0);
               if (!$$3.i() && !$$3.a(eoj.a)) {
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

      iz $$4 = this.b.dp();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         evl $$5 = this.b.cK();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new iz($$4.u(), $$1, $$4.w()));
   }

   protected eog c(iz $$0) {
      eog $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(iz $$0) {
      eol $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != eol.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public eop a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eog[] $$0, eog $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eol $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      eol $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != eol.w) {
         $$3 = ayy.d(Math.max(1.0F, this.b.dJ()));
      }

      double $$6 = this.d(new iz($$1.a, $$1.b, $$1.c));

      for (je $$7 : je.c.a) {
         eog $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (je $$9 : je.c.a) {
         je $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            eog $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eog $$0, eog $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eog $$0, @Nullable eog $$1, @Nullable eog $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eol.d && $$2.l != eol.d) {
         boolean $$3 = $$2.l == eol.h && $$1.l == eol.h && (double)this.b.dj() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable eog $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == eol.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(eol $$0) {
      return $$0 == eol.h || $$0 == eol.s || $$0 == eol.t;
   }

   private boolean b(eog $$0) {
      evl $$1 = this.b.cK();
      evq $$2 = new evq((double)$$0.a - this.b.du() + $$1.b() / 2.0, (double)$$0.b - this.b.dw() + $$1.c() / 2.0, (double)$$0.c - this.b.dA() + $$1.d() / 2.0);
      int $$3 = ayy.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(iz $$0) {
      dbd $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(awu.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dbd $$0, iz $$1) {
      iz $$2 = $$1.d();
      ewj $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(je.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eog a(int $$0, int $$1, int $$2, int $$3, double $$4, je $$5, eol $$6) {
      eog $$7 = null;
      iz.a $$8 = new iz.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eol $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eol.c && (!this.c() || $$10 != eol.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eol.h || this.g()) && $$10 != eol.m && $$10 != eol.e && $$10 != eol.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == eol.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == eol.b) {
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

   private eog a(int $$0, int $$1, int $$2, eol $$3, float $$4) {
      eog $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eog a(int $$0, int $$1, int $$2) {
      eog $$3 = this.c($$0, $$1, $$2);
      $$3.l = eol.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private eog a(int $$0, int $$1, int $$2, eol $$3) {
      eog $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private eog a(int $$0, int $$1, int $$2, int $$3, double $$4, je $$5, eol $$6, iz.a $$7) {
      eog $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dj() >= 1.0F) {
         return $$8;
      } else if ($$8.l != eol.b && $$8.l != eol.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dj() / 2.0;
         evl $$12 = new evl(
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
   private eog a(int $$0, int $$1, int $$2, @Nullable eog $$3) {
      $$1--;

      while ($$1 > this.b.dP().I_()) {
         eol $$4 = this.b($$0, $$1, $$2);
         if ($$4 != eol.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private eog d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dP().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cx()) {
            return this.a($$0, $$3, $$2);
         }

         eol $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != eol.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(evl $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected eol b(int $$0, int $$1, int $$2) {
      return (eol)this.m.computeIfAbsent(iz.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public eol a(eon $$0, int $$1, int $$2, int $$3, btq $$4) {
      Set<eol> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(eol.h)) {
         return eol.h;
      } else if ($$5.contains(eol.m)) {
         return eol.m;
      } else {
         eol $$6 = eol.a;

         for (eol $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != eol.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == eol.b ? eol.b : $$6;
      }
   }

   public Set<eol> b(eon $$0, int $$1, int $$2, int $$3) {
      EnumSet<eol> $$4 = EnumSet.noneOf(eol.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               eol $$11 = this.a($$0, $$8, $$9, $$10);
               iz $$12 = this.b.dp();
               boolean $$13 = this.d();
               if ($$11 == eol.s && this.e() && $$13) {
                  $$11 = eol.d;
               }

               if ($$11 == eol.r && !$$13) {
                  $$11 = eol.a;
               }

               if ($$11 == eol.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != eol.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != eol.l) {
                  $$11 = eol.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public eol a(eon $$0, int $$1, int $$2, int $$3) {
      return a($$0, new iz.a($$1, $$2, $$3));
   }

   public static eol b(btq $$0, iz $$1) {
      return a(new eon($$0.dP(), $$0), $$1.j());
   }

   public static eol a(eon $$0, iz.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eol $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == eol.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> eol.b;
            case o -> eol.o;
            case q -> eol.q;
            case w -> eol.w;
            case f -> eol.g;
            case y -> eol.y;
            case e -> eol.z;
            default -> a($$0, $$2, $$3, $$4, eol.c);
         };
      } else {
         return $$5;
      }
   }

   public static eol a(eon $$0, int $$1, int $$2, int $$3, eol $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  eol $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == eol.q) {
                     return eol.p;
                  }

                  if ($$8 == eol.o || $$8 == eol.i) {
                     return eol.n;
                  }

                  if ($$8 == eol.j) {
                     return eol.k;
                  }

                  if ($$8 == eol.y) {
                     return eol.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static eol b(dbd $$0, iz $$1) {
      dsb $$2 = $$0.a_($$1);
      dey $$3 = $$2.b();
      if ($$2.i()) {
         return eol.b;
      } else if ($$2.a(awo.P) || $$2.a(dfa.fm) || $$2.a(dfa.sD)) {
         return eol.e;
      } else if ($$2.a(dfa.qP)) {
         return eol.f;
      } else if ($$2.a(dfa.dQ) || $$2.a(dfa.oi)) {
         return eol.q;
      } else if ($$2.a(dfa.pg)) {
         return eol.w;
      } else if ($$2.a(dfa.fC)) {
         return eol.x;
      } else if (!$$2.a(dfa.cd) && !$$2.a(dfa.st)) {
         enu $$4 = $$2.u();
         if ($$4.a(awu.b)) {
            return eol.i;
         } else if (a($$2)) {
            return eol.o;
         } else if ($$3 instanceof dhe $$5) {
            if ($$2.c(dhe.c)) {
               return eol.r;
            } else {
               return $$5.b().c() ? eol.s : eol.t;
            }
         } else if ($$3 instanceof den) {
            return eol.l;
         } else if ($$3 instanceof dji) {
            return eol.v;
         } else if (!$$2.a(awo.S) && !$$2.a(awo.L) && (!($$3 instanceof dhx) || $$2.c(dhx.b))) {
            if (!$$2.a(eoj.a)) {
               return eol.a;
            } else {
               return $$4.a(awu.a) ? eol.j : eol.b;
            }
         } else {
            return eol.h;
         }
      } else {
         return eol.y;
      }
   }
}

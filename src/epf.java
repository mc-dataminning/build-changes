import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class epf extends eow {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<epa> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ewc> n = new Object2BooleanOpenHashMap();
   private final eov[] o = new eov[jf.c.a.b()];

   @Override
   public void a(dct $$0, bte $$1) {
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
   public eov a() {
      ja.a $$0 = new ja.a();
      int $$1 = this.b.dx();
      dsl $$2 = this.a.a($$0.b(this.b.dw(), (double)$$1, this.b.dC()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.bg()) {
            while (true) {
               if (!$$2.a(dfk.G) && $$2.u() != eok.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.dw(), (double)(++$$1), this.b.dC()));
            }
         } else if (this.b.aG()) {
            $$1 = ayg.a(this.b.dy() + 0.5);
         } else {
            $$0.b(this.b.dw(), this.b.dy() + 1.0, this.b.dC());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dsl $$3 = this.a.a($$0);
               if (!$$3.i() && !$$3.a(eoy.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a($$0.b(this.b.dw(), (double)(++$$1), this.b.dC()));
         }

         $$1--;
      }

      ja $$4 = this.b.dr();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ewc $$5 = this.b.cM();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new ja($$4.u(), $$1, $$4.w()));
   }

   protected eov c(ja $$0) {
      eov $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(ja $$0) {
      epa $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != epa.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public epe a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eov[] $$0, eov $$1) {
      int $$2 = 0;
      int $$3 = 0;
      epa $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      epa $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != epa.w) {
         $$3 = ayg.d(Math.max(1.0F, this.b.dL()));
      }

      double $$6 = this.d(new ja($$1.a, $$1.b, $$1.c));

      for (jf $$7 : jf.c.a) {
         eov $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jf $$9 : jf.c.a) {
         jf $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            eov $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eov $$0, eov $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eov $$0, @Nullable eov $$1, @Nullable eov $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != epa.d && $$2.l != epa.d) {
         boolean $$3 = $$2.l == epa.h && $$1.l == epa.h && (double)this.b.dl() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable eov $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == epa.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(epa $$0) {
      return $$0 == epa.h || $$0 == epa.s || $$0 == epa.t;
   }

   private boolean b(eov $$0) {
      ewc $$1 = this.b.cM();
      ewh $$2 = new ewh((double)$$0.a - this.b.dw() + $$1.b() / 2.0, (double)$$0.b - this.b.dy() + $$1.c() / 2.0, (double)$$0.c - this.b.dC() + $$1.d() / 2.0);
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
      dbm $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(awc.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dbm $$0, ja $$1) {
      ja $$2 = $$1.d();
      exa $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jf.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eov a(int $$0, int $$1, int $$2, int $$3, double $$4, jf $$5, epa $$6) {
      eov $$7 = null;
      ja.a $$8 = new ja.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         epa $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != epa.c && (!this.c() || $$10 != epa.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != epa.h || this.g()) && $$10 != epa.m && $$10 != epa.e && $$10 != epa.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == epa.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == epa.b) {
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
      return Math.max(1.125, (double)this.b.dL());
   }

   private eov a(int $$0, int $$1, int $$2, epa $$3, float $$4) {
      eov $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eov a(int $$0, int $$1, int $$2) {
      eov $$3 = this.c($$0, $$1, $$2);
      $$3.l = epa.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private eov a(int $$0, int $$1, int $$2, epa $$3) {
      eov $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private eov a(int $$0, int $$1, int $$2, int $$3, double $$4, jf $$5, epa $$6, ja.a $$7) {
      eov $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dl() >= 1.0F) {
         return $$8;
      } else if ($$8.l != epa.b && $$8.l != epa.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dl() / 2.0;
         ewc $$12 = new ewc(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.dm() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private eov a(int $$0, int $$1, int $$2, @Nullable eov $$3) {
      $$1--;

      while ($$1 > this.b.dR().I_()) {
         epa $$4 = this.b($$0, $$1, $$2);
         if ($$4 != epa.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private eov d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dR().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cz()) {
            return this.a($$0, $$3, $$2);
         }

         epa $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != epa.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(ewc $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected epa b(int $$0, int $$1, int $$2) {
      return (epa)this.m.computeIfAbsent(ja.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public epa a(epc $$0, int $$1, int $$2, int $$3, bte $$4) {
      Set<epa> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(epa.h)) {
         return epa.h;
      } else if ($$5.contains(epa.m)) {
         return epa.m;
      } else {
         epa $$6 = epa.a;

         for (epa $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != epa.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == epa.b ? epa.b : $$6;
      }
   }

   public Set<epa> b(epc $$0, int $$1, int $$2, int $$3) {
      EnumSet<epa> $$4 = EnumSet.noneOf(epa.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               epa $$11 = this.a($$0, $$8, $$9, $$10);
               ja $$12 = this.b.dr();
               boolean $$13 = this.d();
               if ($$11 == epa.s && this.e() && $$13) {
                  $$11 = epa.d;
               }

               if ($$11 == epa.r && !$$13) {
                  $$11 = epa.a;
               }

               if ($$11 == epa.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != epa.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != epa.l) {
                  $$11 = epa.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public epa a(epc $$0, int $$1, int $$2, int $$3) {
      return a($$0, new ja.a($$1, $$2, $$3));
   }

   public static epa b(bte $$0, ja $$1) {
      return a(new epc($$0.dR(), $$0), $$1.j());
   }

   public static epa a(epc $$0, ja.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      epa $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == epa.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> epa.b;
            case o -> epa.o;
            case q -> epa.q;
            case w -> epa.w;
            case f -> epa.g;
            case y -> epa.y;
            case e -> epa.z;
            default -> a($$0, $$2, $$3, $$4, epa.c);
         };
      } else {
         return $$5;
      }
   }

   public static epa a(epc $$0, int $$1, int $$2, int $$3, epa $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  epa $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == epa.q) {
                     return epa.p;
                  }

                  if ($$8 == epa.o || $$8 == epa.i) {
                     return epa.n;
                  }

                  if ($$8 == epa.j) {
                     return epa.k;
                  }

                  if ($$8 == epa.y) {
                     return epa.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static epa b(dbm $$0, ja $$1) {
      dsl $$2 = $$0.a_($$1);
      dfi $$3 = $$2.b();
      if ($$2.i()) {
         return epa.b;
      } else if ($$2.a(avw.P) || $$2.a(dfk.fm) || $$2.a(dfk.sD)) {
         return epa.e;
      } else if ($$2.a(dfk.qP)) {
         return epa.f;
      } else if ($$2.a(dfk.dQ) || $$2.a(dfk.oi)) {
         return epa.q;
      } else if ($$2.a(dfk.pg)) {
         return epa.w;
      } else if ($$2.a(dfk.fC)) {
         return epa.x;
      } else if (!$$2.a(dfk.cd) && !$$2.a(dfk.st)) {
         eoj $$4 = $$2.u();
         if ($$4.a(awc.b)) {
            return epa.i;
         } else if (a($$2)) {
            return epa.o;
         } else if ($$3 instanceof dho $$5) {
            if ($$2.c(dho.c)) {
               return epa.r;
            } else {
               return $$5.b().c() ? epa.s : epa.t;
            }
         } else if ($$3 instanceof dex) {
            return epa.l;
         } else if ($$3 instanceof djs) {
            return epa.v;
         } else if (!$$2.a(avw.S) && !$$2.a(avw.L) && (!($$3 instanceof dih) || $$2.c(dih.b))) {
            if (!$$2.a(eoy.a)) {
               return epa.a;
            } else {
               return $$4.a(awc.a) ? epa.j : epa.b;
            }
         } else {
            return epa.h;
         }
      } else {
         return epa.y;
      }
   }
}

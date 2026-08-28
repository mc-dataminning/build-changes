import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class esg extends erx {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<esb> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ezi> n = new Object2BooleanOpenHashMap();
   private final erw[] o = new erw[jm.c.a.b()];

   @Override
   public void a(dfo $$0, bvc $$1) {
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
   public erw a() {
      jh.a $$0 = new jh.a();
      int $$1 = this.b.dD();
      dvj $$2 = this.a.a($$0.b(this.b.dC(), (double)$$1, this.b.dI()));
      if (!this.b.a($$2.y())) {
         if (this.f() && this.b.bk()) {
            while (true) {
               if (!$$2.a(dig.G) && $$2.y() != erl.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.dC(), (double)(++$$1), this.b.dI()));
            }
         } else if (this.b.aK()) {
            $$1 = azk.a(this.b.dE() + 0.5);
         } else {
            $$0.b(this.b.dC(), this.b.dE() + 1.0, this.b.dI());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dvj $$3 = this.a.a($$0);
               if (!$$3.l() && !$$3.a(erz.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.y())) {
            $$2 = this.a.a($$0.b(this.b.dC(), (double)(++$$1), this.b.dI()));
         }

         $$1--;
      }

      jh $$4 = this.b.dx();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ezi $$5 = this.b.cS();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new jh($$4.u(), $$1, $$4.w()));
   }

   protected erw c(jh $$0) {
      erw $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(jh $$0) {
      esb $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != esb.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public esf a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(erw[] $$0, erw $$1) {
      int $$2 = 0;
      int $$3 = 0;
      esb $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      esb $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != esb.w) {
         $$3 = azk.d(Math.max(1.0F, this.b.dR()));
      }

      double $$6 = this.d(new jh($$1.a, $$1.b, $$1.c));

      for (jm $$7 : jm.c.a) {
         erw $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jm $$9 : jm.c.a) {
         jm $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            erw $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable erw $$0, erw $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(erw $$0, @Nullable erw $$1, @Nullable erw $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != esb.d && $$2.l != esb.d) {
         boolean $$3 = $$2.l == esb.h && $$1.l == esb.h && (double)this.b.ds() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable erw $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == esb.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(esb $$0) {
      return $$0 == esb.h || $$0 == esb.s || $$0 == esb.t;
   }

   private boolean b(erw $$0) {
      ezi $$1 = this.b.cS();
      ezn $$2 = new ezn((double)$$0.a - this.b.dC() + $$1.b() / 2.0, (double)$$0.b - this.b.dE() + $$1.c() / 2.0, (double)$$0.c - this.b.dI() + $$1.d() / 2.0);
      int $$3 = azk.c($$2.g() / $$1.a());
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
      deg $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(axg.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(deg $$0, jh $$1) {
      jh $$2 = $$1.e();
      fah $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jm.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected erw a(int $$0, int $$1, int $$2, int $$3, double $$4, jm $$5, esb $$6) {
      erw $$7 = null;
      jh.a $$8 = new jh.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         esb $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != esb.c && (!this.c() || $$10 != esb.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != esb.h || this.g()) && $$10 != esb.m && $$10 != esb.e && $$10 != esb.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == esb.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == esb.b) {
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
      return Math.max(1.125, (double)this.b.dR());
   }

   private erw a(int $$0, int $$1, int $$2, esb $$3, float $$4) {
      erw $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private erw a(int $$0, int $$1, int $$2) {
      erw $$3 = this.c($$0, $$1, $$2);
      $$3.l = esb.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private erw a(int $$0, int $$1, int $$2, esb $$3) {
      erw $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private erw a(int $$0, int $$1, int $$2, int $$3, double $$4, jm $$5, esb $$6, jh.a $$7) {
      erw $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.ds() >= 1.0F) {
         return $$8;
      } else if ($$8.l != esb.b && $$8.l != esb.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.ds() / 2.0;
         ezi $$12 = new ezi(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.dt() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private erw a(int $$0, int $$1, int $$2, @Nullable erw $$3) {
      $$1--;

      while ($$1 > this.b.dX().I_()) {
         esb $$4 = this.b($$0, $$1, $$2);
         if ($$4 != esb.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private erw d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dX().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cF()) {
            return this.a($$0, $$3, $$2);
         }

         esb $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != esb.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(ezi $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected esb b(int $$0, int $$1, int $$2) {
      return (esb)this.m.computeIfAbsent(jh.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public esb a(esd $$0, int $$1, int $$2, int $$3, bvc $$4) {
      Set<esb> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(esb.h)) {
         return esb.h;
      } else if ($$5.contains(esb.m)) {
         return esb.m;
      } else {
         esb $$6 = esb.a;

         for (esb $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != esb.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == esb.b ? esb.b : $$6;
      }
   }

   public Set<esb> b(esd $$0, int $$1, int $$2, int $$3) {
      EnumSet<esb> $$4 = EnumSet.noneOf(esb.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               esb $$11 = this.a($$0, $$8, $$9, $$10);
               jh $$12 = this.b.dx();
               boolean $$13 = this.d();
               if ($$11 == esb.s && this.e() && $$13) {
                  $$11 = esb.d;
               }

               if ($$11 == esb.r && !$$13) {
                  $$11 = esb.a;
               }

               if ($$11 == esb.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != esb.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != esb.l) {
                  $$11 = esb.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public esb a(esd $$0, int $$1, int $$2, int $$3) {
      return a($$0, new jh.a($$1, $$2, $$3));
   }

   public static esb b(bvc $$0, jh $$1) {
      return a(new esd($$0.dX(), $$0), $$1.k());
   }

   public static esb a(esd $$0, jh.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      esb $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == esb.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> esb.b;
            case o -> esb.o;
            case q -> esb.q;
            case w -> esb.w;
            case f -> esb.g;
            case y -> esb.y;
            case e -> esb.z;
            default -> a($$0, $$2, $$3, $$4, esb.c);
         };
      } else {
         return $$5;
      }
   }

   public static esb a(esd $$0, int $$1, int $$2, int $$3, esb $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  esb $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == esb.q) {
                     return esb.p;
                  }

                  if ($$8 == esb.o || $$8 == esb.i) {
                     return esb.n;
                  }

                  if ($$8 == esb.j) {
                     return esb.k;
                  }

                  if ($$8 == esb.y) {
                     return esb.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static esb b(deg $$0, jh $$1) {
      dvj $$2 = $$0.a_($$1);
      die $$3 = $$2.b();
      if ($$2.l()) {
         return esb.b;
      } else if ($$2.a(axa.Q) || $$2.a(dig.fm) || $$2.a(dig.sD)) {
         return esb.e;
      } else if ($$2.a(dig.qP)) {
         return esb.f;
      } else if ($$2.a(dig.dQ) || $$2.a(dig.oi)) {
         return esb.q;
      } else if ($$2.a(dig.pg)) {
         return esb.w;
      } else if ($$2.a(dig.fC)) {
         return esb.x;
      } else if (!$$2.a(dig.cd) && !$$2.a(dig.st)) {
         erk $$4 = $$2.y();
         if ($$4.a(axg.b)) {
            return esb.i;
         } else if (a($$2)) {
            return esb.o;
         } else if ($$3 instanceof dkk $$5) {
            if ($$2.c(dkk.c)) {
               return esb.r;
            } else {
               return $$5.b().c() ? esb.s : esb.t;
            }
         } else if ($$3 instanceof dht) {
            return esb.l;
         } else if ($$3 instanceof dmn) {
            return esb.v;
         } else if (!$$2.a(axa.T) && !$$2.a(axa.M) && (!($$3 instanceof dlc) || $$2.c(dlc.b))) {
            if (!$$2.a(erz.a)) {
               return esb.a;
            } else {
               return $$4.a(axg.a) ? esb.j : esb.b;
            }
         } else {
            return esb.h;
         }
      } else {
         return esb.y;
      }
   }
}

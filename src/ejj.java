import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ejj extends ejc {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<ejg> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<epo> n = new Object2BooleanOpenHashMap();
   private final ejb[] o = new ejb[ih.c.a.b()];

   @Override
   public void a(cxo $$0, bpr $$1) {
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
   public ejb a() {
      ib.a $$0 = new ib.a();
      int $$1 = this.b.ds();
      dnb $$2 = this.a.a_($$0.b(this.b.dr(), (double)$$1, this.b.dx()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.bc()) {
            while (true) {
               if (!$$2.a(dae.G) && $$2.u() != eiq.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dr(), (double)(++$$1), this.b.dx()));
            }
         } else if (this.b.aC()) {
            $$1 = aww.a(this.b.dt() + 0.5);
         } else {
            $$0.b(this.b.dr(), this.b.dt() + 1.0, this.b.dx());

            while ($$0.v() > this.a.I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dnb $$3 = this.a.a_($$0);
               if (!$$3.i() && !$$3.a(this.a, $$0, eje.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a_($$0.b(this.b.dr(), (double)(++$$1), this.b.dx()));
         }

         $$1--;
      }

      ib $$4 = this.b.dm();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         epo $$5 = this.b.cH();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new ib($$4.u(), $$1, $$4.w()));
   }

   protected ejb c(ib $$0) {
      ejb $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(ib $$0) {
      ejg $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != ejg.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public eji a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(ejb[] $$0, ejb $$1) {
      int $$2 = 0;
      int $$3 = 0;
      ejg $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      ejg $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != ejg.w) {
         $$3 = aww.d(Math.max(1.0F, this.b.dG()));
      }

      double $$6 = this.d(new ib($$1.a, $$1.b, $$1.c));

      for (ih $$7 : ih.c.a) {
         ejb $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (ih $$9 : ih.c.a) {
         ih $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            ejb $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable ejb $$0, ejb $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(ejb $$0, @Nullable ejb $$1, @Nullable ejb $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != ejg.d && $$2.l != ejg.d) {
         boolean $$3 = $$2.l == ejg.h && $$1.l == ejg.h && (double)this.b.dg() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable ejb $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == ejg.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(ejg $$0) {
      return $$0 == ejg.h || $$0 == ejg.s || $$0 == ejg.t;
   }

   private boolean b(ejb $$0) {
      epo $$1 = this.b.cH();
      ept $$2 = new ept((double)$$0.a - this.b.dr() + $$1.b() / 2.0, (double)$$0.b - this.b.dt() + $$1.c() / 2.0, (double)$$0.c - this.b.dx() + $$1.d() / 2.0);
      int $$3 = aww.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(ib $$0) {
      return (this.f() || this.c()) && this.a.b_($$0).a(aus.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(cwh $$0, ib $$1) {
      ib $$2 = $$1.d();
      eqm $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ih.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected ejb a(int $$0, int $$1, int $$2, int $$3, double $$4, ih $$5, ejg $$6) {
      ejb $$7 = null;
      ib.a $$8 = new ib.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         ejg $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != ejg.c && (!this.c() || $$10 != ejg.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != ejg.h || this.g()) && $$10 != ejg.m && $$10 != ejg.e && $$10 != ejg.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == ejg.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == ejg.b) {
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
      return Math.max(1.125, (double)this.b.dG());
   }

   private ejb a(int $$0, int $$1, int $$2, ejg $$3, float $$4) {
      ejb $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private ejb a(int $$0, int $$1, int $$2) {
      ejb $$3 = this.c($$0, $$1, $$2);
      $$3.l = ejg.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private ejb a(int $$0, int $$1, int $$2, ejg $$3) {
      ejb $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private ejb a(int $$0, int $$1, int $$2, int $$3, double $$4, ih $$5, ejg $$6, ib.a $$7) {
      ejb $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dg() >= 1.0F) {
         return $$8;
      } else if ($$8.l != ejg.b && $$8.l != ejg.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dg() / 2.0;
         epo $$12 = new epo(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.dh() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private ejb a(int $$0, int $$1, int $$2, @Nullable ejb $$3) {
      $$1--;

      while ($$1 > this.b.dM().I_()) {
         ejg $$4 = this.b($$0, $$1, $$2);
         if ($$4 != ejg.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private ejb d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dM().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cu()) {
            return this.a($$0, $$3, $$2);
         }

         ejg $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != ejg.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(epo $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public ejg a(cwh $$0, int $$1, int $$2, int $$3, bpr $$4) {
      Set<ejg> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(ejg.h)) {
         return ejg.h;
      } else if ($$5.contains(ejg.m)) {
         return ejg.m;
      } else {
         ejg $$6 = ejg.a;

         for (ejg $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != ejg.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == ejg.b ? ejg.b : $$6;
      }
   }

   public Set<ejg> b(cwh $$0, int $$1, int $$2, int $$3) {
      EnumSet<ejg> $$4 = EnumSet.noneOf(ejg.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               ejg $$11 = this.a($$0, $$8, $$9, $$10);
               ib $$12 = this.b.dm();
               boolean $$13 = this.d();
               if ($$11 == ejg.s && this.e() && $$13) {
                  $$11 = ejg.d;
               }

               if ($$11 == ejg.r && !$$13) {
                  $$11 = ejg.a;
               }

               if ($$11 == ejg.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != ejg.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != ejg.l) {
                  $$11 = ejg.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   protected ejg b(int $$0, int $$1, int $$2) {
      return (ejg)this.m.computeIfAbsent(ib.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public ejg a(cwh $$0, int $$1, int $$2, int $$3) {
      return a($$0, new ib.a($$1, $$2, $$3));
   }

   public static ejg a(cwh $$0, ib.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      ejg $$5 = b($$0, $$1);
      if ($$5 == ejg.b && $$3 >= $$0.I_() + 1) {
         return switch (b($$0, $$1.d($$2, $$3 - 1, $$4))) {
            case b, j, i, c -> ejg.b;
            case o -> ejg.o;
            case q -> ejg.q;
            case w -> ejg.w;
            case f -> ejg.g;
            case y -> ejg.y;
            case e -> ejg.z;
            default -> a($$0, $$1.d($$2, $$3, $$4), ejg.c);
         };
      } else {
         return $$5;
      }
   }

   public static ejg a(cwh $$0, ib.a $$1, ejg $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  ejg $$9 = b($$0, $$1);
                  if ($$9 == ejg.q) {
                     return ejg.p;
                  }

                  if ($$9 == ejg.o || $$9 == ejg.i) {
                     return ejg.n;
                  }

                  if ($$9 == ejg.j) {
                     return ejg.k;
                  }

                  if ($$9 == ejg.y) {
                     return ejg.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static ejg b(cwh $$0, ib $$1) {
      dnb $$2 = $$0.a_($$1);
      dac $$3 = $$2.b();
      if ($$2.i()) {
         return ejg.b;
      } else if ($$2.a(aun.P) || $$2.a(dae.fm) || $$2.a(dae.sD)) {
         return ejg.e;
      } else if ($$2.a(dae.qP)) {
         return ejg.f;
      } else if ($$2.a(dae.dQ) || $$2.a(dae.oi)) {
         return ejg.q;
      } else if ($$2.a(dae.pg)) {
         return ejg.w;
      } else if ($$2.a(dae.fC)) {
         return ejg.x;
      } else if (!$$2.a(dae.cd) && !$$2.a(dae.st)) {
         eip $$4 = $$2.u();
         if ($$4.a(aus.b)) {
            return ejg.i;
         } else if (a($$2)) {
            return ejg.o;
         } else if ($$3 instanceof dci $$5) {
            if ($$2.c(dci.c)) {
               return ejg.r;
            } else {
               return $$5.b().c() ? ejg.s : ejg.t;
            }
         } else if ($$3 instanceof czr) {
            return ejg.l;
         } else if ($$3 instanceof del) {
            return ejg.v;
         } else if (!$$2.a(aun.S) && !$$2.a(aun.L) && (!($$3 instanceof ddb) || $$2.c(ddb.b))) {
            if (!$$2.a($$0, $$1, eje.a)) {
               return ejg.a;
            } else {
               return $$4.a(aus.a) ? ejg.j : ejg.b;
            }
         } else {
            return ejg.h;
         }
      } else {
         return ejg.y;
      }
   }
}

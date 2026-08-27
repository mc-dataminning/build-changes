import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class emw extends emn {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<emr> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<etk> n = new Object2BooleanOpenHashMap();
   private final emm[] o = new emm[is.c.a.b()];

   @Override
   public void a(daq $$0, bsc $$1) {
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
   public emm a() {
      in.a $$0 = new in.a();
      int $$1 = this.b.dt();
      dqh $$2 = this.a.a($$0.b(this.b.ds(), (double)$$1, this.b.dy()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.bc()) {
            while (true) {
               if (!$$2.a(ddg.G) && $$2.u() != emb.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.ds(), (double)(++$$1), this.b.dy()));
            }
         } else if (this.b.aC()) {
            $$1 = axz.a(this.b.du() + 0.5);
         } else {
            $$0.b(this.b.ds(), this.b.du() + 1.0, this.b.dy());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dqh $$3 = this.a.a($$0);
               if (!$$3.i() && !$$3.a(emp.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a($$0.b(this.b.ds(), (double)(++$$1), this.b.dy()));
         }

         $$1--;
      }

      in $$4 = this.b.dn();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         etk $$5 = this.b.cI();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new in($$4.u(), $$1, $$4.w()));
   }

   protected emm c(in $$0) {
      emm $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(in $$0) {
      emr $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != emr.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public emv a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(emm[] $$0, emm $$1) {
      int $$2 = 0;
      int $$3 = 0;
      emr $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      emr $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != emr.w) {
         $$3 = axz.d(Math.max(1.0F, this.b.dH()));
      }

      double $$6 = this.d(new in($$1.a, $$1.b, $$1.c));

      for (is $$7 : is.c.a) {
         emm $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (is $$9 : is.c.a) {
         is $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            emm $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable emm $$0, emm $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(emm $$0, @Nullable emm $$1, @Nullable emm $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != emr.d && $$2.l != emr.d) {
         boolean $$3 = $$2.l == emr.h && $$1.l == emr.h && (double)this.b.dh() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable emm $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == emr.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(emr $$0) {
      return $$0 == emr.h || $$0 == emr.s || $$0 == emr.t;
   }

   private boolean b(emm $$0) {
      etk $$1 = this.b.cI();
      etp $$2 = new etp((double)$$0.a - this.b.ds() + $$1.b() / 2.0, (double)$$0.b - this.b.du() + $$1.c() / 2.0, (double)$$0.c - this.b.dy() + $$1.d() / 2.0);
      int $$3 = axz.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(in $$0) {
      czj $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(avw.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(czj $$0, in $$1) {
      in $$2 = $$1.d();
      eui $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(is.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected emm a(int $$0, int $$1, int $$2, int $$3, double $$4, is $$5, emr $$6) {
      emm $$7 = null;
      in.a $$8 = new in.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         emr $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != emr.c && (!this.c() || $$10 != emr.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != emr.h || this.g()) && $$10 != emr.m && $$10 != emr.e && $$10 != emr.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == emr.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == emr.b) {
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
      return Math.max(1.125, (double)this.b.dH());
   }

   private emm a(int $$0, int $$1, int $$2, emr $$3, float $$4) {
      emm $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private emm a(int $$0, int $$1, int $$2) {
      emm $$3 = this.c($$0, $$1, $$2);
      $$3.l = emr.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private emm a(int $$0, int $$1, int $$2, emr $$3) {
      emm $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private emm a(int $$0, int $$1, int $$2, int $$3, double $$4, is $$5, emr $$6, in.a $$7) {
      emm $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dh() >= 1.0F) {
         return $$8;
      } else if ($$8.l != emr.b && $$8.l != emr.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dh() / 2.0;
         etk $$12 = new etk(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.di() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private emm a(int $$0, int $$1, int $$2, @Nullable emm $$3) {
      $$1--;

      while ($$1 > this.b.dN().I_()) {
         emr $$4 = this.b($$0, $$1, $$2);
         if ($$4 != emr.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private emm d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dN().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cv()) {
            return this.a($$0, $$3, $$2);
         }

         emr $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != emr.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(etk $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected emr b(int $$0, int $$1, int $$2) {
      return (emr)this.m.computeIfAbsent(in.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public emr a(emt $$0, int $$1, int $$2, int $$3, bsc $$4) {
      Set<emr> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(emr.h)) {
         return emr.h;
      } else if ($$5.contains(emr.m)) {
         return emr.m;
      } else {
         emr $$6 = emr.a;

         for (emr $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != emr.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == emr.b ? emr.b : $$6;
      }
   }

   public Set<emr> b(emt $$0, int $$1, int $$2, int $$3) {
      EnumSet<emr> $$4 = EnumSet.noneOf(emr.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               emr $$11 = this.a($$0, $$8, $$9, $$10);
               in $$12 = this.b.dn();
               boolean $$13 = this.d();
               if ($$11 == emr.s && this.e() && $$13) {
                  $$11 = emr.d;
               }

               if ($$11 == emr.r && !$$13) {
                  $$11 = emr.a;
               }

               if ($$11 == emr.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != emr.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != emr.l) {
                  $$11 = emr.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public emr a(emt $$0, int $$1, int $$2, int $$3) {
      return a($$0, new in.a($$1, $$2, $$3));
   }

   public static emr b(bsc $$0, in $$1) {
      return a(new emt($$0.dN(), $$0), $$1.j());
   }

   public static emr a(emt $$0, in.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      emr $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == emr.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> emr.b;
            case o -> emr.o;
            case q -> emr.q;
            case w -> emr.w;
            case f -> emr.g;
            case y -> emr.y;
            case e -> emr.z;
            default -> a($$0, $$2, $$3, $$4, emr.c);
         };
      } else {
         return $$5;
      }
   }

   public static emr a(emt $$0, int $$1, int $$2, int $$3, emr $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  emr $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == emr.q) {
                     return emr.p;
                  }

                  if ($$8 == emr.o || $$8 == emr.i) {
                     return emr.n;
                  }

                  if ($$8 == emr.j) {
                     return emr.k;
                  }

                  if ($$8 == emr.y) {
                     return emr.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static emr b(czj $$0, in $$1) {
      dqh $$2 = $$0.a_($$1);
      dde $$3 = $$2.b();
      if ($$2.i()) {
         return emr.b;
      } else if ($$2.a(avr.P) || $$2.a(ddg.fm) || $$2.a(ddg.sD)) {
         return emr.e;
      } else if ($$2.a(ddg.qP)) {
         return emr.f;
      } else if ($$2.a(ddg.dQ) || $$2.a(ddg.oi)) {
         return emr.q;
      } else if ($$2.a(ddg.pg)) {
         return emr.w;
      } else if ($$2.a(ddg.fC)) {
         return emr.x;
      } else if (!$$2.a(ddg.cd) && !$$2.a(ddg.st)) {
         ema $$4 = $$2.u();
         if ($$4.a(avw.b)) {
            return emr.i;
         } else if (a($$2)) {
            return emr.o;
         } else if ($$3 instanceof dfk $$5) {
            if ($$2.c(dfk.c)) {
               return emr.r;
            } else {
               return $$5.b().c() ? emr.s : emr.t;
            }
         } else if ($$3 instanceof dct) {
            return emr.l;
         } else if ($$3 instanceof dho) {
            return emr.v;
         } else if (!$$2.a(avr.S) && !$$2.a(avr.L) && (!($$3 instanceof dgd) || $$2.c(dgd.b))) {
            if (!$$2.a(emp.a)) {
               return emr.a;
            } else {
               return $$4.a(avw.a) ? emr.j : emr.b;
            }
         } else {
            return emr.h;
         }
      } else {
         return emr.y;
      }
   }
}

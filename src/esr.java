import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class esr extends esi {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<esm> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ezt> n = new Object2BooleanOpenHashMap();
   private final esh[] o = new esh[jm.c.a.b()];

   @Override
   public void a(dfz $$0, bvj $$1) {
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
   public esh a() {
      jh.a $$0 = new jh.a();
      int $$1 = this.b.dB();
      dvv $$2 = this.a.a($$0.b(this.b.dA(), (double)$$1, this.b.dG()));
      if (!this.b.a($$2.y())) {
         if (this.f() && this.b.bj()) {
            while (true) {
               if (!$$2.a(dis.G) && $$2.y() != erw.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.dA(), (double)(++$$1), this.b.dG()));
            }
         } else if (this.b.aJ()) {
            $$1 = azm.a(this.b.dC() + 0.5);
         } else {
            $$0.b(this.b.dA(), this.b.dC() + 1.0, this.b.dG());

            while ($$0.v() > this.a.a().K_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dvv $$3 = this.a.a($$0);
               if (!$$3.l() && !$$3.a(esk.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.y())) {
            $$2 = this.a.a($$0.b(this.b.dA(), (double)(++$$1), this.b.dG()));
         }

         $$1--;
      }

      jh $$4 = this.b.dv();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ezt $$5 = this.b.cR();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new jh($$4.u(), $$1, $$4.w()));
   }

   protected esh c(jh $$0) {
      esh $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(jh $$0) {
      esm $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != esm.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public esq a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(esh[] $$0, esh $$1) {
      int $$2 = 0;
      int $$3 = 0;
      esm $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      esm $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != esm.w) {
         $$3 = azm.d(Math.max(1.0F, this.b.dP()));
      }

      double $$6 = this.d(new jh($$1.a, $$1.b, $$1.c));

      for (jm $$7 : jm.c.a) {
         esh $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jm $$9 : jm.c.a) {
         jm $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            esh $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable esh $$0, esh $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(esh $$0, @Nullable esh $$1, @Nullable esh $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != esm.d && $$2.l != esm.d) {
         boolean $$3 = $$2.l == esm.h && $$1.l == esm.h && (double)this.b.dq() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable esh $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == esm.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(esm $$0) {
      return $$0 == esm.h || $$0 == esm.s || $$0 == esm.t;
   }

   private boolean b(esh $$0) {
      ezt $$1 = this.b.cR();
      ezy $$2 = new ezy((double)$$0.a - this.b.dA() + $$1.b() / 2.0, (double)$$0.b - this.b.dC() + $$1.c() / 2.0, (double)$$0.c - this.b.dG() + $$1.d() / 2.0);
      int $$3 = azm.c($$2.g() / $$1.a());
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
      der $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(axi.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(der $$0, jh $$1) {
      jh $$2 = $$1.e();
      fas $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jm.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected esh a(int $$0, int $$1, int $$2, int $$3, double $$4, jm $$5, esm $$6) {
      esh $$7 = null;
      jh.a $$8 = new jh.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         esm $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != esm.c && (!this.c() || $$10 != esm.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != esm.h || this.g()) && $$10 != esm.m && $$10 != esm.e && $$10 != esm.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == esm.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == esm.b) {
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
      return Math.max(1.125, (double)this.b.dP());
   }

   private esh a(int $$0, int $$1, int $$2, esm $$3, float $$4) {
      esh $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private esh a(int $$0, int $$1, int $$2) {
      esh $$3 = this.c($$0, $$1, $$2);
      $$3.l = esm.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private esh a(int $$0, int $$1, int $$2, esm $$3) {
      esh $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private esh a(int $$0, int $$1, int $$2, int $$3, double $$4, jm $$5, esm $$6, jh.a $$7) {
      esh $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dq() >= 1.0F) {
         return $$8;
      } else if ($$8.l != esm.b && $$8.l != esm.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dq() / 2.0;
         ezt $$12 = new ezt(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.dr() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private esh a(int $$0, int $$1, int $$2, @Nullable esh $$3) {
      $$1--;

      while ($$1 > this.b.dV().K_()) {
         esm $$4 = this.b($$0, $$1, $$2);
         if ($$4 != esm.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private esh d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dV().K_(); $$3--) {
         if ($$1 - $$3 > this.b.cE()) {
            return this.a($$0, $$3, $$2);
         }

         esm $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != esm.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(ezt $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected esm b(int $$0, int $$1, int $$2) {
      return (esm)this.m.computeIfAbsent(jh.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public esm a(eso $$0, int $$1, int $$2, int $$3, bvj $$4) {
      Set<esm> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(esm.h)) {
         return esm.h;
      } else if ($$5.contains(esm.m)) {
         return esm.m;
      } else {
         esm $$6 = esm.a;

         for (esm $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != esm.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == esm.b ? esm.b : $$6;
      }
   }

   public Set<esm> b(eso $$0, int $$1, int $$2, int $$3) {
      EnumSet<esm> $$4 = EnumSet.noneOf(esm.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               esm $$11 = this.a($$0, $$8, $$9, $$10);
               jh $$12 = this.b.dv();
               boolean $$13 = this.d();
               if ($$11 == esm.s && this.e() && $$13) {
                  $$11 = esm.d;
               }

               if ($$11 == esm.r && !$$13) {
                  $$11 = esm.a;
               }

               if ($$11 == esm.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != esm.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != esm.l) {
                  $$11 = esm.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public esm a(eso $$0, int $$1, int $$2, int $$3) {
      return a($$0, new jh.a($$1, $$2, $$3));
   }

   public static esm b(bvj $$0, jh $$1) {
      return a(new eso($$0.dV(), $$0), $$1.k());
   }

   public static esm a(eso $$0, jh.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      esm $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == esm.b && $$3 >= $$0.a().K_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> esm.b;
            case o -> esm.o;
            case q -> esm.q;
            case w -> esm.w;
            case f -> esm.g;
            case y -> esm.y;
            case e -> esm.z;
            default -> a($$0, $$2, $$3, $$4, esm.c);
         };
      } else {
         return $$5;
      }
   }

   public static esm a(eso $$0, int $$1, int $$2, int $$3, esm $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  esm $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == esm.q) {
                     return esm.p;
                  }

                  if ($$8 == esm.o || $$8 == esm.i) {
                     return esm.n;
                  }

                  if ($$8 == esm.j) {
                     return esm.k;
                  }

                  if ($$8 == esm.y) {
                     return esm.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static esm b(der $$0, jh $$1) {
      dvv $$2 = $$0.a_($$1);
      diq $$3 = $$2.b();
      if ($$2.l()) {
         return esm.b;
      } else if ($$2.a(axc.Q) || $$2.a(dis.fm) || $$2.a(dis.sD)) {
         return esm.e;
      } else if ($$2.a(dis.qP)) {
         return esm.f;
      } else if ($$2.a(dis.dQ) || $$2.a(dis.oi)) {
         return esm.q;
      } else if ($$2.a(dis.pg)) {
         return esm.w;
      } else if ($$2.a(dis.fC)) {
         return esm.x;
      } else if (!$$2.a(dis.cd) && !$$2.a(dis.st)) {
         erv $$4 = $$2.y();
         if ($$4.a(axi.b)) {
            return esm.i;
         } else if (a($$2)) {
            return esm.o;
         } else if ($$3 instanceof dkw $$5) {
            if ($$2.c(dkw.c)) {
               return esm.r;
            } else {
               return $$5.b().c() ? esm.s : esm.t;
            }
         } else if ($$3 instanceof dif) {
            return esm.l;
         } else if ($$3 instanceof dmz) {
            return esm.v;
         } else if (!$$2.a(axc.T) && !$$2.a(axc.M) && (!($$3 instanceof dlo) || $$2.c(dlo.b))) {
            if (!$$2.a(esk.a)) {
               return esm.a;
            } else {
               return $$4.a(axi.a) ? esm.j : esm.b;
            }
         } else {
            return esm.h;
         }
      } else {
         return esm.y;
      }
   }
}

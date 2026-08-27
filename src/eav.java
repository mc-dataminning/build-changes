import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class eav extends eap {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<eam> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<eha> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(cpx $$0, biy $$1) {
      super.a($$0, $$1);
      $$1.z();
   }

   @Override
   public void b() {
      this.b.A();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public eao a() {
      gv.a $$0 = new gv.a();
      int $$1 = this.b.dq();
      dey $$2 = this.a.a_($$0.b(this.b.dp(), (double)$$1, this.b.dv()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aX()) {
            while (true) {
               if (!$$2.a(csl.G) && $$2.u() != eac.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dp(), (double)(++$$1), this.b.dv()));
            }
         } else if (this.b.aA()) {
            $$1 = aro.a(this.b.dr() + 0.5);
         } else {
            gv $$3 = this.b.dk();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, ear.a)) && $$3.v() > this.b.dK().C_()) {
               $$3 = $$3.d();
            }

            $$1 = $$3.c().v();
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a_($$0.b(this.b.dp(), (double)(++$$1), this.b.dv()));
         }

         $$1--;
      }

      gv $$4 = this.b.dk();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         eha $$5 = this.b.cG();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new gv($$4.u(), $$1, $$4.w()));
   }

   protected eao c(gv $$0) {
      eao $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(gv $$0) {
      eam $$1 = this.a(this.b, $$0);
      return $$1 != eam.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public eau a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aro.a($$0), aro.a($$1), aro.a($$2)));
   }

   @Override
   public int a(eao[] $$0, eao $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eam $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eam $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != eam.w) {
         $$3 = aro.d(Math.max(1.0F, this.b.dE()));
      }

      double $$6 = this.d(new gv($$1.a, $$1.b, $$1.c));
      eao $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, hb.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      eao $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, hb.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      eao $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, hb.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      eao $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, hb.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      eao $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, hb.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      eao $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, hb.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      eao $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, hb.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      eao $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, hb.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable eao $$0, eao $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eao $$0, @Nullable eao $$1, @Nullable eao $$2, @Nullable eao $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eam.d && $$2.l != eam.d && $$3.l != eam.d) {
         boolean $$4 = $$2.l == eam.h && $$1.l == eam.h && (double)this.b.df() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(eam $$0) {
      return $$0 == eam.h || $$0 == eam.s || $$0 == eam.t;
   }

   private boolean b(eao $$0) {
      eha $$1 = this.b.cG();
      ehf $$2 = new ehf((double)$$0.a - this.b.dp() + $$1.b() / 2.0, (double)$$0.b - this.b.dr() + $$1.c() / 2.0, (double)$$0.c - this.b.dv() + $$1.d() / 2.0);
      int $$3 = aro.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(gv $$0) {
      return (this.f() || this.c()) && this.a.b_($$0).a(apo.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(coq $$0, gv $$1) {
      gv $$2 = $$1.d();
      ehy $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(hb.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eao a(int $$0, int $$1, int $$2, int $$3, double $$4, hb $$5, eam $$6) {
      eao $$7 = null;
      gv.a $$8 = new gv.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eam $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.df() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eam.c && (!this.c() || $$10 != eam.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eam.h || this.g()) && $$10 != eam.m && $$10 != eam.e && $$10 != eam.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == eam.b || $$7.l == eam.c) && this.b.df() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  eha $$15 = new eha(
                     $$13 - $$12,
                     this.d($$8.b($$13, (double)($$1 + 1), $$14)) + 0.001,
                     $$14 - $$12,
                     $$13 + $$12,
                     (double)this.b.dg() + this.d($$8.b((double)$$7.a, (double)$$7.b, (double)$$7.c)) - 0.002,
                     $$14 + $$12
                  );
                  if (this.a($$15)) {
                     $$7 = null;
                  }
               }
            }

            if (!this.c() && $$10 == eam.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != eam.j) {
                  return $$7;
               }

               while ($$1 > this.b.dK().C_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != eam.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == eam.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == eam.b) {
                  if (--$$1 < this.b.dK().C_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.ct()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != eam.b && $$11 >= 0.0F) {
                     $$7 = this.a($$0, $$1, $$2, $$10, $$11);
                     break;
                  }

                  if ($$11 < 0.0F) {
                     return this.a($$0, $$1, $$2);
                  }
               }
            }

            if (a($$10) && $$7 == null) {
               $$7 = this.b($$0, $$1, $$2);
               $$7.i = true;
               $$7.l = $$10;
               $$7.k = $$10.a();
            }

            return $$7;
         } else {
            return $$7;
         }
      }
   }

   private double h() {
      return Math.max(1.125, (double)this.b.dE());
   }

   private eao a(int $$0, int $$1, int $$2, eam $$3, float $$4) {
      eao $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eao a(int $$0, int $$1, int $$2) {
      eao $$3 = this.b($$0, $$1, $$2);
      $$3.l = eam.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(eha $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public eam a(coq $$0, int $$1, int $$2, int $$3, biy $$4) {
      EnumSet<eam> $$5 = EnumSet.noneOf(eam.class);
      eam $$6 = eam.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dk());
      if ($$5.contains(eam.h)) {
         return eam.h;
      } else if ($$5.contains(eam.m)) {
         return eam.m;
      } else {
         eam $$7 = eam.a;

         for (eam $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == eam.b && $$4.a($$7) == 0.0F && this.d <= 1 ? eam.b : $$7;
      }
   }

   public eam a(coq $$0, int $$1, int $$2, int $$3, EnumSet<eam> $$4, eam $$5, gv $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               eam $$13 = this.a($$0, $$10, $$11, $$12);
               $$13 = this.a($$0, $$6, $$13);
               if ($$7 == 0 && $$8 == 0 && $$9 == 0) {
                  $$5 = $$13;
               }

               $$4.add($$13);
            }
         }
      }

      return $$5;
   }

   protected eam a(coq $$0, gv $$1, eam $$2) {
      boolean $$3 = this.d();
      if ($$2 == eam.s && this.e() && $$3) {
         $$2 = eam.d;
      }

      if ($$2 == eam.r && !$$3) {
         $$2 = eam.a;
      }

      if ($$2 == eam.l && !($$0.a_($$1).b() instanceof csa) && !($$0.a_($$1.d()).b() instanceof csa)) {
         $$2 = eam.m;
      }

      return $$2;
   }

   protected eam a(biy $$0, gv $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected eam a(biy $$0, int $$1, int $$2, int $$3) {
      return (eam)this.m.computeIfAbsent(gv.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public eam a(coq $$0, int $$1, int $$2, int $$3) {
      return a($$0, new gv.a($$1, $$2, $$3));
   }

   public static eam a(coq $$0, gv.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eam $$5 = b($$0, $$1);
      if ($$5 == eam.b && $$3 >= $$0.C_() + 1) {
         eam $$6 = b($$0, $$1.d($$2, $$3 - 1, $$4));
         $$5 = $$6 != eam.c && $$6 != eam.b && $$6 != eam.j && $$6 != eam.i ? eam.c : eam.b;
         if ($$6 == eam.o) {
            $$5 = eam.o;
         }

         if ($$6 == eam.q) {
            $$5 = eam.q;
         }

         if ($$6 == eam.w) {
            $$5 = eam.w;
         }

         if ($$6 == eam.f) {
            $$5 = eam.g;
         }

         if ($$6 == eam.y) {
            $$5 = eam.y;
         }
      }

      if ($$5 == eam.c) {
         $$5 = a($$0, $$1.d($$2, $$3, $$4), $$5);
      }

      return $$5;
   }

   public static eam a(coq $$0, gv.a $$1, eam $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dey $$9 = $$0.a_($$1);
                  if ($$9.a(csl.dQ) || $$9.a(csl.oi)) {
                     return eam.p;
                  }

                  if (a($$9)) {
                     return eam.n;
                  }

                  if ($$0.b_($$1).a(apo.a)) {
                     return eam.k;
                  }

                  if ($$9.a(csl.cd) || $$9.a(csl.rs)) {
                     return eam.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static eam b(coq $$0, gv $$1) {
      dey $$2 = $$0.a_($$1);
      csk $$3 = $$2.b();
      if ($$2.i()) {
         return eam.b;
      } else if ($$2.a(apj.P) || $$2.a(csl.fm) || $$2.a(csl.rC)) {
         return eam.e;
      } else if ($$2.a(csl.qC)) {
         return eam.f;
      } else if ($$2.a(csl.dQ) || $$2.a(csl.oi)) {
         return eam.q;
      } else if ($$2.a(csl.pg)) {
         return eam.w;
      } else if ($$2.a(csl.fC)) {
         return eam.x;
      } else if (!$$2.a(csl.cd) && !$$2.a(csl.rs)) {
         eab $$4 = $$0.b_($$1);
         if ($$4.a(apo.b)) {
            return eam.i;
         } else if (a($$2)) {
            return eam.o;
         } else if ($$3 instanceof cum $$5) {
            if ($$2.c(cum.b)) {
               return eam.r;
            } else {
               return $$5.a().c() ? eam.s : eam.t;
            }
         } else if ($$3 instanceof csa) {
            return eam.l;
         } else if ($$3 instanceof cwr) {
            return eam.v;
         } else if (!$$2.a(apj.S) && !$$2.a(apj.L) && (!($$3 instanceof cvf) || $$2.c(cvf.a))) {
            if (!$$2.a($$0, $$1, ear.a)) {
               return eam.a;
            } else {
               return $$4.a(apo.a) ? eam.j : eam.b;
            }
         } else {
            return eam.h;
         }
      } else {
         return eam.y;
      }
   }

   public static boolean a(dey $$0) {
      return $$0.a(apj.aJ) || $$0.a(csl.H) || $$0.a(csl.kJ) || csx.g($$0) || $$0.a(csl.fv);
   }
}

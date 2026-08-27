import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class ebg extends eba {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<eax> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ehi> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(cqi $$0, bji $$1) {
      super.a($$0, $$1);
      $$1.C();
   }

   @Override
   public void b() {
      this.b.E();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public eaz a() {
      gw.a $$0 = new gw.a();
      int $$1 = this.b.dr();
      dfj $$2 = this.a.a_($$0.b(this.b.dq(), (double)$$1, this.b.dw()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aY()) {
            while (true) {
               if (!$$2.a(csw.G) && $$2.u() != ean.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dq(), (double)(++$$1), this.b.dw()));
            }
         } else if (this.b.aB()) {
            $$1 = arx.a(this.b.ds() + 0.5);
         } else {
            gw $$3 = this.b.dl();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, ebc.a)) && $$3.v() > this.b.dL().H_()) {
               $$3 = $$3.d();
            }

            $$1 = $$3.c().v();
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a_($$0.b(this.b.dq(), (double)(++$$1), this.b.dw()));
         }

         $$1--;
      }

      gw $$4 = this.b.dl();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ehi $$5 = this.b.cH();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new gw($$4.u(), $$1, $$4.w()));
   }

   protected eaz c(gw $$0) {
      eaz $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(gw $$0) {
      eax $$1 = this.a(this.b, $$0);
      return $$1 != eax.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public ebf a(double $$0, double $$1, double $$2) {
      return this.a(this.b(arx.a($$0), arx.a($$1), arx.a($$2)));
   }

   @Override
   public int a(eaz[] $$0, eaz $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eax $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eax $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != eax.w) {
         $$3 = arx.d(Math.max(1.0F, this.b.dF()));
      }

      double $$6 = this.d(new gw($$1.a, $$1.b, $$1.c));
      eaz $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, hc.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      eaz $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, hc.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      eaz $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, hc.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      eaz $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, hc.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      eaz $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, hc.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      eaz $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, hc.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      eaz $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, hc.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      eaz $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, hc.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable eaz $$0, eaz $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eaz $$0, @Nullable eaz $$1, @Nullable eaz $$2, @Nullable eaz $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eax.d && $$2.l != eax.d && $$3.l != eax.d) {
         boolean $$4 = $$2.l == eax.h && $$1.l == eax.h && (double)this.b.dg() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(eax $$0) {
      return $$0 == eax.h || $$0 == eax.s || $$0 == eax.t;
   }

   private boolean b(eaz $$0) {
      ehi $$1 = this.b.cH();
      ehn $$2 = new ehn((double)$$0.a - this.b.dq() + $$1.b() / 2.0, (double)$$0.b - this.b.ds() + $$1.c() / 2.0, (double)$$0.c - this.b.dw() + $$1.d() / 2.0);
      int $$3 = arx.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(gw $$0) {
      return (this.f() || this.c()) && this.a.b_($$0).a(apy.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(cpb $$0, gw $$1) {
      gw $$2 = $$1.d();
      eig $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(hc.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eaz a(int $$0, int $$1, int $$2, int $$3, double $$4, hc $$5, eax $$6) {
      eaz $$7 = null;
      gw.a $$8 = new gw.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eax $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.dg() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eax.c && (!this.c() || $$10 != eax.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eax.h || this.g()) && $$10 != eax.m && $$10 != eax.e && $$10 != eax.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == eax.b || $$7.l == eax.c) && this.b.dg() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  ehi $$15 = new ehi(
                     $$13 - $$12,
                     this.d($$8.b($$13, (double)($$1 + 1), $$14)) + 0.001,
                     $$14 - $$12,
                     $$13 + $$12,
                     (double)this.b.dh() + this.d($$8.b((double)$$7.a, (double)$$7.b, (double)$$7.c)) - 0.002,
                     $$14 + $$12
                  );
                  if (this.a($$15)) {
                     $$7 = null;
                  }
               }
            }

            if (!this.c() && $$10 == eax.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != eax.j) {
                  return $$7;
               }

               while ($$1 > this.b.dL().H_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != eax.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == eax.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == eax.b) {
                  if (--$$1 < this.b.dL().H_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.cu()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != eax.b && $$11 >= 0.0F) {
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
      return Math.max(1.125, (double)this.b.dF());
   }

   private eaz a(int $$0, int $$1, int $$2, eax $$3, float $$4) {
      eaz $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eaz a(int $$0, int $$1, int $$2) {
      eaz $$3 = this.b($$0, $$1, $$2);
      $$3.l = eax.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(ehi $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public eax a(cpb $$0, int $$1, int $$2, int $$3, bji $$4) {
      EnumSet<eax> $$5 = EnumSet.noneOf(eax.class);
      eax $$6 = eax.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dl());
      if ($$5.contains(eax.h)) {
         return eax.h;
      } else if ($$5.contains(eax.m)) {
         return eax.m;
      } else {
         eax $$7 = eax.a;

         for (eax $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == eax.b && $$4.a($$7) == 0.0F && this.d <= 1 ? eax.b : $$7;
      }
   }

   public eax a(cpb $$0, int $$1, int $$2, int $$3, EnumSet<eax> $$4, eax $$5, gw $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               eax $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected eax a(cpb $$0, gw $$1, eax $$2) {
      boolean $$3 = this.d();
      if ($$2 == eax.s && this.e() && $$3) {
         $$2 = eax.d;
      }

      if ($$2 == eax.r && !$$3) {
         $$2 = eax.a;
      }

      if ($$2 == eax.l && !($$0.a_($$1).b() instanceof csl) && !($$0.a_($$1.d()).b() instanceof csl)) {
         $$2 = eax.m;
      }

      return $$2;
   }

   protected eax a(bji $$0, gw $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected eax a(bji $$0, int $$1, int $$2, int $$3) {
      return (eax)this.m.computeIfAbsent(gw.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public eax a(cpb $$0, int $$1, int $$2, int $$3) {
      return a($$0, new gw.a($$1, $$2, $$3));
   }

   public static eax a(cpb $$0, gw.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eax $$5 = b($$0, $$1);
      if ($$5 == eax.b && $$3 >= $$0.H_() + 1) {
         eax $$6 = b($$0, $$1.d($$2, $$3 - 1, $$4));
         $$5 = $$6 != eax.c && $$6 != eax.b && $$6 != eax.j && $$6 != eax.i ? eax.c : eax.b;
         if ($$6 == eax.o) {
            $$5 = eax.o;
         }

         if ($$6 == eax.q) {
            $$5 = eax.q;
         }

         if ($$6 == eax.w) {
            $$5 = eax.w;
         }

         if ($$6 == eax.f) {
            $$5 = eax.g;
         }

         if ($$6 == eax.y) {
            $$5 = eax.y;
         }
      }

      if ($$5 == eax.c) {
         $$5 = a($$0, $$1.d($$2, $$3, $$4), $$5);
      }

      return $$5;
   }

   public static eax a(cpb $$0, gw.a $$1, eax $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dfj $$9 = $$0.a_($$1);
                  if ($$9.a(csw.dQ) || $$9.a(csw.oi)) {
                     return eax.p;
                  }

                  if (a($$9)) {
                     return eax.n;
                  }

                  if ($$0.b_($$1).a(apy.a)) {
                     return eax.k;
                  }

                  if ($$9.a(csw.cd) || $$9.a(csw.rs)) {
                     return eax.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static eax b(cpb $$0, gw $$1) {
      dfj $$2 = $$0.a_($$1);
      csv $$3 = $$2.b();
      if ($$2.i()) {
         return eax.b;
      } else if ($$2.a(apt.P) || $$2.a(csw.fm) || $$2.a(csw.rC)) {
         return eax.e;
      } else if ($$2.a(csw.qC)) {
         return eax.f;
      } else if ($$2.a(csw.dQ) || $$2.a(csw.oi)) {
         return eax.q;
      } else if ($$2.a(csw.pg)) {
         return eax.w;
      } else if ($$2.a(csw.fC)) {
         return eax.x;
      } else if (!$$2.a(csw.cd) && !$$2.a(csw.rs)) {
         eam $$4 = $$0.b_($$1);
         if ($$4.a(apy.b)) {
            return eax.i;
         } else if (a($$2)) {
            return eax.o;
         } else if ($$3 instanceof cux $$5) {
            if ($$2.c(cux.b)) {
               return eax.r;
            } else {
               return $$5.a().c() ? eax.s : eax.t;
            }
         } else if ($$3 instanceof csl) {
            return eax.l;
         } else if ($$3 instanceof cxc) {
            return eax.v;
         } else if (!$$2.a(apt.S) && !$$2.a(apt.L) && (!($$3 instanceof cvq) || $$2.c(cvq.a))) {
            if (!$$2.a($$0, $$1, ebc.a)) {
               return eax.a;
            } else {
               return $$4.a(apy.a) ? eax.j : eax.b;
            }
         } else {
            return eax.h;
         }
      } else {
         return eax.y;
      }
   }

   public static boolean a(dfj $$0) {
      return $$0.a(apt.aJ) || $$0.a(csw.H) || $$0.a(csw.kJ) || cti.g($$0) || $$0.a(csw.fv);
   }
}

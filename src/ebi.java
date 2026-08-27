import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class ebi extends ebc {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<eaz> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ehk> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(cqk $$0, bjk $$1) {
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
   public ebb a() {
      gw.a $$0 = new gw.a();
      int $$1 = this.b.dr();
      dfl $$2 = this.a.a_($$0.b(this.b.dq(), (double)$$1, this.b.dw()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aX()) {
            while (true) {
               if (!$$2.a(csy.G) && $$2.u() != eap.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dq(), (double)(++$$1), this.b.dw()));
            }
         } else if (this.b.aA()) {
            $$1 = ary.a(this.b.ds() + 0.5);
         } else {
            gw $$3 = this.b.dl();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, ebe.a)) && $$3.v() > this.b.dL().H_()) {
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
         ehk $$5 = this.b.cG();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new gw($$4.u(), $$1, $$4.w()));
   }

   protected ebb c(gw $$0) {
      ebb $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(gw $$0) {
      eaz $$1 = this.a(this.b, $$0);
      return $$1 != eaz.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public ebh a(double $$0, double $$1, double $$2) {
      return this.a(this.b(ary.a($$0), ary.a($$1), ary.a($$2)));
   }

   @Override
   public int a(ebb[] $$0, ebb $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eaz $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eaz $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != eaz.w) {
         $$3 = ary.d(Math.max(1.0F, this.b.dF()));
      }

      double $$6 = this.d(new gw($$1.a, $$1.b, $$1.c));
      ebb $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, hc.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      ebb $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, hc.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      ebb $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, hc.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      ebb $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, hc.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      ebb $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, hc.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      ebb $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, hc.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      ebb $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, hc.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      ebb $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, hc.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable ebb $$0, ebb $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(ebb $$0, @Nullable ebb $$1, @Nullable ebb $$2, @Nullable ebb $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eaz.d && $$2.l != eaz.d && $$3.l != eaz.d) {
         boolean $$4 = $$2.l == eaz.h && $$1.l == eaz.h && (double)this.b.df() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(eaz $$0) {
      return $$0 == eaz.h || $$0 == eaz.s || $$0 == eaz.t;
   }

   private boolean b(ebb $$0) {
      ehk $$1 = this.b.cG();
      ehp $$2 = new ehp((double)$$0.a - this.b.dq() + $$1.b() / 2.0, (double)$$0.b - this.b.ds() + $$1.c() / 2.0, (double)$$0.c - this.b.dw() + $$1.d() / 2.0);
      int $$3 = ary.c($$2.f() / $$1.a());
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
      return (this.f() || this.c()) && this.a.b_($$0).a(apz.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(cpd $$0, gw $$1) {
      gw $$2 = $$1.d();
      eii $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(hc.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected ebb a(int $$0, int $$1, int $$2, int $$3, double $$4, hc $$5, eaz $$6) {
      ebb $$7 = null;
      gw.a $$8 = new gw.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eaz $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.df() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eaz.c && (!this.c() || $$10 != eaz.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eaz.h || this.g()) && $$10 != eaz.m && $$10 != eaz.e && $$10 != eaz.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == eaz.b || $$7.l == eaz.c) && this.b.df() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  ehk $$15 = new ehk(
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

            if (!this.c() && $$10 == eaz.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != eaz.j) {
                  return $$7;
               }

               while ($$1 > this.b.dL().H_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != eaz.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == eaz.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == eaz.b) {
                  if (--$$1 < this.b.dL().H_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.ct()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != eaz.b && $$11 >= 0.0F) {
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

   private ebb a(int $$0, int $$1, int $$2, eaz $$3, float $$4) {
      ebb $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private ebb a(int $$0, int $$1, int $$2) {
      ebb $$3 = this.b($$0, $$1, $$2);
      $$3.l = eaz.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(ehk $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public eaz a(cpd $$0, int $$1, int $$2, int $$3, bjk $$4) {
      EnumSet<eaz> $$5 = EnumSet.noneOf(eaz.class);
      eaz $$6 = eaz.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dl());
      if ($$5.contains(eaz.h)) {
         return eaz.h;
      } else if ($$5.contains(eaz.m)) {
         return eaz.m;
      } else {
         eaz $$7 = eaz.a;

         for (eaz $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == eaz.b && $$4.a($$7) == 0.0F && this.d <= 1 ? eaz.b : $$7;
      }
   }

   public eaz a(cpd $$0, int $$1, int $$2, int $$3, EnumSet<eaz> $$4, eaz $$5, gw $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               eaz $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected eaz a(cpd $$0, gw $$1, eaz $$2) {
      boolean $$3 = this.d();
      if ($$2 == eaz.s && this.e() && $$3) {
         $$2 = eaz.d;
      }

      if ($$2 == eaz.r && !$$3) {
         $$2 = eaz.a;
      }

      if ($$2 == eaz.l && !($$0.a_($$1).b() instanceof csn) && !($$0.a_($$1.d()).b() instanceof csn)) {
         $$2 = eaz.m;
      }

      return $$2;
   }

   protected eaz a(bjk $$0, gw $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected eaz a(bjk $$0, int $$1, int $$2, int $$3) {
      return (eaz)this.m.computeIfAbsent(gw.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public eaz a(cpd $$0, int $$1, int $$2, int $$3) {
      return a($$0, new gw.a($$1, $$2, $$3));
   }

   public static eaz a(cpd $$0, gw.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eaz $$5 = b($$0, $$1);
      if ($$5 == eaz.b && $$3 >= $$0.H_() + 1) {
         eaz $$6 = b($$0, $$1.d($$2, $$3 - 1, $$4));
         $$5 = $$6 != eaz.c && $$6 != eaz.b && $$6 != eaz.j && $$6 != eaz.i ? eaz.c : eaz.b;
         if ($$6 == eaz.o) {
            $$5 = eaz.o;
         }

         if ($$6 == eaz.q) {
            $$5 = eaz.q;
         }

         if ($$6 == eaz.w) {
            $$5 = eaz.w;
         }

         if ($$6 == eaz.f) {
            $$5 = eaz.g;
         }

         if ($$6 == eaz.y) {
            $$5 = eaz.y;
         }
      }

      if ($$5 == eaz.c) {
         $$5 = a($$0, $$1.d($$2, $$3, $$4), $$5);
      }

      return $$5;
   }

   public static eaz a(cpd $$0, gw.a $$1, eaz $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dfl $$9 = $$0.a_($$1);
                  if ($$9.a(csy.dQ) || $$9.a(csy.oi)) {
                     return eaz.p;
                  }

                  if (a($$9)) {
                     return eaz.n;
                  }

                  if ($$0.b_($$1).a(apz.a)) {
                     return eaz.k;
                  }

                  if ($$9.a(csy.cd) || $$9.a(csy.rs)) {
                     return eaz.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static eaz b(cpd $$0, gw $$1) {
      dfl $$2 = $$0.a_($$1);
      csx $$3 = $$2.b();
      if ($$2.i()) {
         return eaz.b;
      } else if ($$2.a(apu.P) || $$2.a(csy.fm) || $$2.a(csy.rC)) {
         return eaz.e;
      } else if ($$2.a(csy.qC)) {
         return eaz.f;
      } else if ($$2.a(csy.dQ) || $$2.a(csy.oi)) {
         return eaz.q;
      } else if ($$2.a(csy.pg)) {
         return eaz.w;
      } else if ($$2.a(csy.fC)) {
         return eaz.x;
      } else if (!$$2.a(csy.cd) && !$$2.a(csy.rs)) {
         eao $$4 = $$0.b_($$1);
         if ($$4.a(apz.b)) {
            return eaz.i;
         } else if (a($$2)) {
            return eaz.o;
         } else if ($$3 instanceof cuz $$5) {
            if ($$2.c(cuz.b)) {
               return eaz.r;
            } else {
               return $$5.a().c() ? eaz.s : eaz.t;
            }
         } else if ($$3 instanceof csn) {
            return eaz.l;
         } else if ($$3 instanceof cxe) {
            return eaz.v;
         } else if (!$$2.a(apu.S) && !$$2.a(apu.L) && (!($$3 instanceof cvs) || $$2.c(cvs.a))) {
            if (!$$2.a($$0, $$1, ebe.a)) {
               return eaz.a;
            } else {
               return $$4.a(apz.a) ? eaz.j : eaz.b;
            }
         } else {
            return eaz.h;
         }
      } else {
         return eaz.y;
      }
   }

   public static boolean a(dfl $$0) {
      return $$0.a(apu.aJ) || $$0.a(csy.H) || $$0.a(csy.kJ) || ctk.g($$0) || $$0.a(csy.fv);
   }
}

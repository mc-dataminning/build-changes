import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class eax extends ear {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<eao> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<egz> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(cpz $$0, bja $$1) {
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
   public eaq a() {
      gu.a $$0 = new gu.a();
      int $$1 = this.b.dq();
      dfa $$2 = this.a.a_($$0.b(this.b.dp(), (double)$$1, this.b.dv()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aX()) {
            while (true) {
               if (!$$2.a(csn.G) && $$2.u() != eae.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dp(), (double)(++$$1), this.b.dv()));
            }
         } else if (this.b.aA()) {
            $$1 = arp.a(this.b.dr() + 0.5);
         } else {
            gu $$3 = this.b.dk();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, eat.a)) && $$3.v() > this.b.dK().C_()) {
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

      gu $$4 = this.b.dk();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         egz $$5 = this.b.cG();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new gu($$4.u(), $$1, $$4.w()));
   }

   protected eaq c(gu $$0) {
      eaq $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(gu $$0) {
      eao $$1 = this.a(this.b, $$0);
      return $$1 != eao.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public eaw a(double $$0, double $$1, double $$2) {
      return this.a(this.b(arp.a($$0), arp.a($$1), arp.a($$2)));
   }

   @Override
   public int a(eaq[] $$0, eaq $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eao $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eao $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != eao.w) {
         $$3 = arp.d(Math.max(1.0F, this.b.dE()));
      }

      double $$6 = this.d(new gu($$1.a, $$1.b, $$1.c));
      eaq $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, ha.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      eaq $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, ha.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      eaq $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, ha.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      eaq $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, ha.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      eaq $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, ha.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      eaq $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, ha.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      eaq $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, ha.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      eaq $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, ha.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable eaq $$0, eaq $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eaq $$0, @Nullable eaq $$1, @Nullable eaq $$2, @Nullable eaq $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eao.d && $$2.l != eao.d && $$3.l != eao.d) {
         boolean $$4 = $$2.l == eao.h && $$1.l == eao.h && (double)this.b.df() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(eao $$0) {
      return $$0 == eao.h || $$0 == eao.s || $$0 == eao.t;
   }

   private boolean b(eaq $$0) {
      egz $$1 = this.b.cG();
      ehe $$2 = new ehe((double)$$0.a - this.b.dp() + $$1.b() / 2.0, (double)$$0.b - this.b.dr() + $$1.c() / 2.0, (double)$$0.c - this.b.dv() + $$1.d() / 2.0);
      int $$3 = arp.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(gu $$0) {
      return (this.f() || this.c()) && this.a.b_($$0).a(apq.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(cos $$0, gu $$1) {
      gu $$2 = $$1.d();
      ehx $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ha.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eaq a(int $$0, int $$1, int $$2, int $$3, double $$4, ha $$5, eao $$6) {
      eaq $$7 = null;
      gu.a $$8 = new gu.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eao $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.df() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eao.c && (!this.c() || $$10 != eao.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eao.h || this.g()) && $$10 != eao.m && $$10 != eao.e && $$10 != eao.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == eao.b || $$7.l == eao.c) && this.b.df() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  egz $$15 = new egz(
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

            if (!this.c() && $$10 == eao.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != eao.j) {
                  return $$7;
               }

               while ($$1 > this.b.dK().C_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != eao.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == eao.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == eao.b) {
                  if (--$$1 < this.b.dK().C_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.ct()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != eao.b && $$11 >= 0.0F) {
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

   private eaq a(int $$0, int $$1, int $$2, eao $$3, float $$4) {
      eaq $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eaq a(int $$0, int $$1, int $$2) {
      eaq $$3 = this.b($$0, $$1, $$2);
      $$3.l = eao.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(egz $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public eao a(cos $$0, int $$1, int $$2, int $$3, bja $$4) {
      EnumSet<eao> $$5 = EnumSet.noneOf(eao.class);
      eao $$6 = eao.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dk());
      if ($$5.contains(eao.h)) {
         return eao.h;
      } else if ($$5.contains(eao.m)) {
         return eao.m;
      } else {
         eao $$7 = eao.a;

         for (eao $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == eao.b && $$4.a($$7) == 0.0F && this.d <= 1 ? eao.b : $$7;
      }
   }

   public eao a(cos $$0, int $$1, int $$2, int $$3, EnumSet<eao> $$4, eao $$5, gu $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               eao $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected eao a(cos $$0, gu $$1, eao $$2) {
      boolean $$3 = this.d();
      if ($$2 == eao.s && this.e() && $$3) {
         $$2 = eao.d;
      }

      if ($$2 == eao.r && !$$3) {
         $$2 = eao.a;
      }

      if ($$2 == eao.l && !($$0.a_($$1).b() instanceof csc) && !($$0.a_($$1.d()).b() instanceof csc)) {
         $$2 = eao.m;
      }

      return $$2;
   }

   protected eao a(bja $$0, gu $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected eao a(bja $$0, int $$1, int $$2, int $$3) {
      return (eao)this.m.computeIfAbsent(gu.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public eao a(cos $$0, int $$1, int $$2, int $$3) {
      return a($$0, new gu.a($$1, $$2, $$3));
   }

   public static eao a(cos $$0, gu.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eao $$5 = b($$0, $$1);
      if ($$5 == eao.b && $$3 >= $$0.C_() + 1) {
         eao $$6 = b($$0, $$1.d($$2, $$3 - 1, $$4));
         $$5 = $$6 != eao.c && $$6 != eao.b && $$6 != eao.j && $$6 != eao.i ? eao.c : eao.b;
         if ($$6 == eao.o) {
            $$5 = eao.o;
         }

         if ($$6 == eao.q) {
            $$5 = eao.q;
         }

         if ($$6 == eao.w) {
            $$5 = eao.w;
         }

         if ($$6 == eao.f) {
            $$5 = eao.g;
         }

         if ($$6 == eao.y) {
            $$5 = eao.y;
         }
      }

      if ($$5 == eao.c) {
         $$5 = a($$0, $$1.d($$2, $$3, $$4), $$5);
      }

      return $$5;
   }

   public static eao a(cos $$0, gu.a $$1, eao $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dfa $$9 = $$0.a_($$1);
                  if ($$9.a(csn.dQ) || $$9.a(csn.oi)) {
                     return eao.p;
                  }

                  if (a($$9)) {
                     return eao.n;
                  }

                  if ($$0.b_($$1).a(apq.a)) {
                     return eao.k;
                  }

                  if ($$9.a(csn.cd) || $$9.a(csn.rs)) {
                     return eao.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static eao b(cos $$0, gu $$1) {
      dfa $$2 = $$0.a_($$1);
      csm $$3 = $$2.b();
      if ($$2.i()) {
         return eao.b;
      } else if ($$2.a(apl.P) || $$2.a(csn.fm) || $$2.a(csn.rC)) {
         return eao.e;
      } else if ($$2.a(csn.qC)) {
         return eao.f;
      } else if ($$2.a(csn.dQ) || $$2.a(csn.oi)) {
         return eao.q;
      } else if ($$2.a(csn.pg)) {
         return eao.w;
      } else if ($$2.a(csn.fC)) {
         return eao.x;
      } else if (!$$2.a(csn.cd) && !$$2.a(csn.rs)) {
         ead $$4 = $$0.b_($$1);
         if ($$4.a(apq.b)) {
            return eao.i;
         } else if (a($$2)) {
            return eao.o;
         } else if ($$3 instanceof cuo $$5) {
            if ($$2.c(cuo.b)) {
               return eao.r;
            } else {
               return $$5.a().c() ? eao.s : eao.t;
            }
         } else if ($$3 instanceof csc) {
            return eao.l;
         } else if ($$3 instanceof cwt) {
            return eao.v;
         } else if (!$$2.a(apl.S) && !$$2.a(apl.L) && (!($$3 instanceof cvh) || $$2.c(cvh.a))) {
            if (!$$2.a($$0, $$1, eat.a)) {
               return eao.a;
            } else {
               return $$4.a(apq.a) ? eao.j : eao.b;
            }
         } else {
            return eao.h;
         }
      } else {
         return eao.y;
      }
   }

   public static boolean a(dfa $$0) {
      return $$0.a(apl.aJ) || $$0.a(csn.H) || $$0.a(csn.kJ) || csz.g($$0) || $$0.a(csn.fv);
   }
}

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class eda extends ecu {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<ecr> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ejd> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(csf $$0, bla $$1) {
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
   public ect a() {
      ht.a $$0 = new ht.a();
      int $$1 = this.b.dr();
      dgw $$2 = this.a.a_($$0.b(this.b.dq(), (double)$$1, this.b.dw()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aX()) {
            while (true) {
               if (!$$2.a(cuv.G) && $$2.u() != ech.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dq(), (double)(++$$1), this.b.dw()));
            }
         } else if (this.b.aA()) {
            $$1 = ati.a(this.b.ds() + 0.5);
         } else {
            ht $$3 = this.b.dl();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, ecw.a)) && $$3.v() > this.b.dL().I_()) {
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

      ht $$4 = this.b.dl();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ejd $$5 = this.b.cG();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new ht($$4.u(), $$1, $$4.w()));
   }

   protected ect c(ht $$0) {
      ect $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(ht $$0) {
      ecr $$1 = this.a(this.b, $$0);
      return $$1 != ecr.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public ecz a(double $$0, double $$1, double $$2) {
      return this.a(this.b(ati.a($$0), ati.a($$1), ati.a($$2)));
   }

   @Override
   public int a(ect[] $$0, ect $$1) {
      int $$2 = 0;
      int $$3 = 0;
      ecr $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      ecr $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != ecr.w) {
         $$3 = ati.d(Math.max(1.0F, this.b.dF()));
      }

      double $$6 = this.d(new ht($$1.a, $$1.b, $$1.c));
      ect $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, hx.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      ect $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, hx.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      ect $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, hx.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      ect $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, hx.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      ect $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, hx.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      ect $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, hx.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      ect $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, hx.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      ect $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, hx.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable ect $$0, ect $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(ect $$0, @Nullable ect $$1, @Nullable ect $$2, @Nullable ect $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != ecr.d && $$2.l != ecr.d && $$3.l != ecr.d) {
         boolean $$4 = $$2.l == ecr.h && $$1.l == ecr.h && (double)this.b.df() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(ecr $$0) {
      return $$0 == ecr.h || $$0 == ecr.s || $$0 == ecr.t;
   }

   private boolean b(ect $$0) {
      ejd $$1 = this.b.cG();
      eji $$2 = new eji((double)$$0.a - this.b.dq() + $$1.b() / 2.0, (double)$$0.b - this.b.ds() + $$1.c() / 2.0, (double)$$0.c - this.b.dw() + $$1.d() / 2.0);
      int $$3 = ati.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(ht $$0) {
      return (this.f() || this.c()) && this.a.b_($$0).a(arh.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(cqy $$0, ht $$1) {
      ht $$2 = $$1.d();
      ekb $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(hx.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected ect a(int $$0, int $$1, int $$2, int $$3, double $$4, hx $$5, ecr $$6) {
      ect $$7 = null;
      ht.a $$8 = new ht.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         ecr $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.df() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != ecr.c && (!this.c() || $$10 != ecr.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != ecr.h || this.g()) && $$10 != ecr.m && $$10 != ecr.e && $$10 != ecr.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == ecr.b || $$7.l == ecr.c) && this.b.df() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  ejd $$15 = new ejd(
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

            if (!this.c() && $$10 == ecr.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != ecr.j) {
                  return $$7;
               }

               while ($$1 > this.b.dL().I_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != ecr.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == ecr.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == ecr.b) {
                  if (--$$1 < this.b.dL().I_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.ct()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != ecr.b && $$11 >= 0.0F) {
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

   private ect a(int $$0, int $$1, int $$2, ecr $$3, float $$4) {
      ect $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private ect a(int $$0, int $$1, int $$2) {
      ect $$3 = this.b($$0, $$1, $$2);
      $$3.l = ecr.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(ejd $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public ecr a(cqy $$0, int $$1, int $$2, int $$3, bla $$4) {
      EnumSet<ecr> $$5 = EnumSet.noneOf(ecr.class);
      ecr $$6 = ecr.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dl());
      if ($$5.contains(ecr.h)) {
         return ecr.h;
      } else if ($$5.contains(ecr.m)) {
         return ecr.m;
      } else {
         ecr $$7 = ecr.a;

         for (ecr $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == ecr.b && $$4.a($$7) == 0.0F && this.d <= 1 ? ecr.b : $$7;
      }
   }

   public ecr a(cqy $$0, int $$1, int $$2, int $$3, EnumSet<ecr> $$4, ecr $$5, ht $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               ecr $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected ecr a(cqy $$0, ht $$1, ecr $$2) {
      boolean $$3 = this.d();
      if ($$2 == ecr.s && this.e() && $$3) {
         $$2 = ecr.d;
      }

      if ($$2 == ecr.r && !$$3) {
         $$2 = ecr.a;
      }

      if ($$2 == ecr.l && !($$0.a_($$1).b() instanceof cui) && !($$0.a_($$1.d()).b() instanceof cui)) {
         $$2 = ecr.m;
      }

      return $$2;
   }

   protected ecr a(bla $$0, ht $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected ecr a(bla $$0, int $$1, int $$2, int $$3) {
      return (ecr)this.m.computeIfAbsent(ht.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public ecr a(cqy $$0, int $$1, int $$2, int $$3) {
      return a($$0, new ht.a($$1, $$2, $$3));
   }

   public static ecr a(cqy $$0, ht.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      ecr $$5 = b($$0, $$1);
      if ($$5 == ecr.b && $$3 >= $$0.I_() + 1) {
         ecr $$6 = b($$0, $$1.d($$2, $$3 - 1, $$4));
         $$5 = $$6 != ecr.c && $$6 != ecr.b && $$6 != ecr.j && $$6 != ecr.i ? ecr.c : ecr.b;
         if ($$6 == ecr.o) {
            $$5 = ecr.o;
         }

         if ($$6 == ecr.q) {
            $$5 = ecr.q;
         }

         if ($$6 == ecr.w) {
            $$5 = ecr.w;
         }

         if ($$6 == ecr.f) {
            $$5 = ecr.g;
         }

         if ($$6 == ecr.y) {
            $$5 = ecr.y;
         }
      }

      if ($$5 == ecr.c) {
         $$5 = a($$0, $$1.d($$2, $$3, $$4), $$5);
      }

      return $$5;
   }

   public static ecr a(cqy $$0, ht.a $$1, ecr $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dgw $$9 = $$0.a_($$1);
                  if ($$9.a(cuv.dQ) || $$9.a(cuv.oi)) {
                     return ecr.p;
                  }

                  if (a($$9)) {
                     return ecr.n;
                  }

                  if ($$0.b_($$1).a(arh.a)) {
                     return ecr.k;
                  }

                  if ($$9.a(cuv.cd) || $$9.a(cuv.rs)) {
                     return ecr.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static ecr b(cqy $$0, ht $$1) {
      dgw $$2 = $$0.a_($$1);
      cut $$3 = $$2.b();
      if ($$2.i()) {
         return ecr.b;
      } else if ($$2.a(arc.P) || $$2.a(cuv.fm) || $$2.a(cuv.rC)) {
         return ecr.e;
      } else if ($$2.a(cuv.qC)) {
         return ecr.f;
      } else if ($$2.a(cuv.dQ) || $$2.a(cuv.oi)) {
         return ecr.q;
      } else if ($$2.a(cuv.pg)) {
         return ecr.w;
      } else if ($$2.a(cuv.fC)) {
         return ecr.x;
      } else if (!$$2.a(cuv.cd) && !$$2.a(cuv.rs)) {
         ecg $$4 = $$0.b_($$1);
         if ($$4.a(arh.b)) {
            return ecr.i;
         } else if (a($$2)) {
            return ecr.o;
         } else if ($$3 instanceof cwy $$5) {
            if ($$2.c(cwy.c)) {
               return ecr.r;
            } else {
               return $$5.b().c() ? ecr.s : ecr.t;
            }
         } else if ($$3 instanceof cui) {
            return ecr.l;
         } else if ($$3 instanceof czc) {
            return ecr.v;
         } else if (!$$2.a(arc.S) && !$$2.a(arc.L) && (!($$3 instanceof cxr) || $$2.c(cxr.b))) {
            if (!$$2.a($$0, $$1, ecw.a)) {
               return ecr.a;
            } else {
               return $$4.a(arh.a) ? ecr.j : ecr.b;
            }
         } else {
            return ecr.h;
         }
      } else {
         return ecr.y;
      }
   }

   public static boolean a(dgw $$0) {
      return $$0.a(arc.aJ) || $$0.a(cuv.H) || $$0.a(cuv.kJ) || cvh.g($$0) || $$0.a(cuv.fv);
   }
}

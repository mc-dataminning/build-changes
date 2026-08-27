import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class eba extends eau {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<ear> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ehc> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(cqo $$0, bjo $$1) {
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
   public eat a() {
      gw.a $$0 = new gw.a();
      int $$1 = this.b.dr();
      dfd $$2 = this.a.a_($$0.b(this.b.dq(), (double)$$1, this.b.dw()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aX()) {
            while (true) {
               if (!$$2.a(cte.G) && $$2.u() != eah.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dq(), (double)(++$$1), this.b.dw()));
            }
         } else if (this.b.aA()) {
            $$1 = asb.a(this.b.ds() + 0.5);
         } else {
            gw $$3 = this.b.dl();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, eaw.a)) && $$3.v() > this.b.dL().H_()) {
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
         ehc $$5 = this.b.cG();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new gw($$4.u(), $$1, $$4.w()));
   }

   protected eat c(gw $$0) {
      eat $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(gw $$0) {
      ear $$1 = this.a(this.b, $$0);
      return $$1 != ear.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public eaz a(double $$0, double $$1, double $$2) {
      return this.a(this.b(asb.a($$0), asb.a($$1), asb.a($$2)));
   }

   @Override
   public int a(eat[] $$0, eat $$1) {
      int $$2 = 0;
      int $$3 = 0;
      ear $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      ear $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != ear.w) {
         $$3 = asb.d(Math.max(1.0F, this.b.dF()));
      }

      double $$6 = this.d(new gw($$1.a, $$1.b, $$1.c));
      eat $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, ha.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      eat $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, ha.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      eat $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, ha.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      eat $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, ha.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      eat $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, ha.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      eat $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, ha.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      eat $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, ha.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      eat $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, ha.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable eat $$0, eat $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eat $$0, @Nullable eat $$1, @Nullable eat $$2, @Nullable eat $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != ear.d && $$2.l != ear.d && $$3.l != ear.d) {
         boolean $$4 = $$2.l == ear.h && $$1.l == ear.h && (double)this.b.df() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(ear $$0) {
      return $$0 == ear.h || $$0 == ear.s || $$0 == ear.t;
   }

   private boolean b(eat $$0) {
      ehc $$1 = this.b.cG();
      ehh $$2 = new ehh((double)$$0.a - this.b.dq() + $$1.b() / 2.0, (double)$$0.b - this.b.ds() + $$1.c() / 2.0, (double)$$0.c - this.b.dw() + $$1.d() / 2.0);
      int $$3 = asb.c($$2.f() / $$1.a());
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
      return (this.f() || this.c()) && this.a.b_($$0).a(aqa.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(cph $$0, gw $$1) {
      gw $$2 = $$1.d();
      eia $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ha.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eat a(int $$0, int $$1, int $$2, int $$3, double $$4, ha $$5, ear $$6) {
      eat $$7 = null;
      gw.a $$8 = new gw.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         ear $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.df() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != ear.c && (!this.c() || $$10 != ear.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != ear.h || this.g()) && $$10 != ear.m && $$10 != ear.e && $$10 != ear.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == ear.b || $$7.l == ear.c) && this.b.df() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  ehc $$15 = new ehc(
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

            if (!this.c() && $$10 == ear.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != ear.j) {
                  return $$7;
               }

               while ($$1 > this.b.dL().H_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != ear.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == ear.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == ear.b) {
                  if (--$$1 < this.b.dL().H_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.ct()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != ear.b && $$11 >= 0.0F) {
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

   private eat a(int $$0, int $$1, int $$2, ear $$3, float $$4) {
      eat $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eat a(int $$0, int $$1, int $$2) {
      eat $$3 = this.b($$0, $$1, $$2);
      $$3.l = ear.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(ehc $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public ear a(cph $$0, int $$1, int $$2, int $$3, bjo $$4) {
      EnumSet<ear> $$5 = EnumSet.noneOf(ear.class);
      ear $$6 = ear.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dl());
      if ($$5.contains(ear.h)) {
         return ear.h;
      } else if ($$5.contains(ear.m)) {
         return ear.m;
      } else {
         ear $$7 = ear.a;

         for (ear $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == ear.b && $$4.a($$7) == 0.0F && this.d <= 1 ? ear.b : $$7;
      }
   }

   public ear a(cph $$0, int $$1, int $$2, int $$3, EnumSet<ear> $$4, ear $$5, gw $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               ear $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected ear a(cph $$0, gw $$1, ear $$2) {
      boolean $$3 = this.d();
      if ($$2 == ear.s && this.e() && $$3) {
         $$2 = ear.d;
      }

      if ($$2 == ear.r && !$$3) {
         $$2 = ear.a;
      }

      if ($$2 == ear.l && !($$0.a_($$1).b() instanceof csr) && !($$0.a_($$1.d()).b() instanceof csr)) {
         $$2 = ear.m;
      }

      return $$2;
   }

   protected ear a(bjo $$0, gw $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected ear a(bjo $$0, int $$1, int $$2, int $$3) {
      return (ear)this.m.computeIfAbsent(gw.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public ear a(cph $$0, int $$1, int $$2, int $$3) {
      return a($$0, new gw.a($$1, $$2, $$3));
   }

   public static ear a(cph $$0, gw.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      ear $$5 = b($$0, $$1);
      if ($$5 == ear.b && $$3 >= $$0.H_() + 1) {
         ear $$6 = b($$0, $$1.d($$2, $$3 - 1, $$4));
         $$5 = $$6 != ear.c && $$6 != ear.b && $$6 != ear.j && $$6 != ear.i ? ear.c : ear.b;
         if ($$6 == ear.o) {
            $$5 = ear.o;
         }

         if ($$6 == ear.q) {
            $$5 = ear.q;
         }

         if ($$6 == ear.w) {
            $$5 = ear.w;
         }

         if ($$6 == ear.f) {
            $$5 = ear.g;
         }

         if ($$6 == ear.y) {
            $$5 = ear.y;
         }
      }

      if ($$5 == ear.c) {
         $$5 = a($$0, $$1.d($$2, $$3, $$4), $$5);
      }

      return $$5;
   }

   public static ear a(cph $$0, gw.a $$1, ear $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dfd $$9 = $$0.a_($$1);
                  if ($$9.a(cte.dQ) || $$9.a(cte.oi)) {
                     return ear.p;
                  }

                  if (a($$9)) {
                     return ear.n;
                  }

                  if ($$0.b_($$1).a(aqa.a)) {
                     return ear.k;
                  }

                  if ($$9.a(cte.cd) || $$9.a(cte.rs)) {
                     return ear.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static ear b(cph $$0, gw $$1) {
      dfd $$2 = $$0.a_($$1);
      ctc $$3 = $$2.b();
      if ($$2.i()) {
         return ear.b;
      } else if ($$2.a(apv.P) || $$2.a(cte.fm) || $$2.a(cte.rC)) {
         return ear.e;
      } else if ($$2.a(cte.qC)) {
         return ear.f;
      } else if ($$2.a(cte.dQ) || $$2.a(cte.oi)) {
         return ear.q;
      } else if ($$2.a(cte.pg)) {
         return ear.w;
      } else if ($$2.a(cte.fC)) {
         return ear.x;
      } else if (!$$2.a(cte.cd) && !$$2.a(cte.rs)) {
         eag $$4 = $$0.b_($$1);
         if ($$4.a(aqa.b)) {
            return ear.i;
         } else if (a($$2)) {
            return ear.o;
         } else if ($$3 instanceof cvg $$5) {
            if ($$2.c(cvg.c)) {
               return ear.r;
            } else {
               return $$5.b().c() ? ear.s : ear.t;
            }
         } else if ($$3 instanceof csr) {
            return ear.l;
         } else if ($$3 instanceof cxk) {
            return ear.v;
         } else if (!$$2.a(apv.S) && !$$2.a(apv.L) && (!($$3 instanceof cvz) || $$2.c(cvz.b))) {
            if (!$$2.a($$0, $$1, eaw.a)) {
               return ear.a;
            } else {
               return $$4.a(aqa.a) ? ear.j : ear.b;
            }
         } else {
            return ear.h;
         }
      } else {
         return ear.y;
      }
   }

   public static boolean a(dfd $$0) {
      return $$0.a(apv.aJ) || $$0.a(cte.H) || $$0.a(cte.kJ) || ctq.g($$0) || $$0.a(cte.fv);
   }
}

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class eft extends efn {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<efk> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<elx> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(cuk $$0, bmq $$1) {
      super.a($$0, $$1);
      $$1.E();
   }

   @Override
   public void b() {
      this.b.G();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public efm a() {
      hx.a $$0 = new hx.a();
      int $$1 = this.b.dr();
      djp $$2 = this.a.a_($$0.b(this.b.dq(), (double)$$1, this.b.dw()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aZ()) {
            while (true) {
               if (!$$2.a(cxa.G) && $$2.u() != efa.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dq(), (double)(++$$1), this.b.dw()));
            }
         } else if (this.b.aC()) {
            $$1 = aup.a(this.b.ds() + 0.5);
         } else {
            hx $$3 = this.b.dl();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, efp.a)) && $$3.v() > this.b.dL().J_()) {
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

      hx $$4 = this.b.dl();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         elx $$5 = this.b.cH();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new hx($$4.u(), $$1, $$4.w()));
   }

   protected efm c(hx $$0) {
      efm $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(hx $$0) {
      efk $$1 = this.a(this.b, $$0);
      return $$1 != efk.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public efs a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aup.a($$0), aup.a($$1), aup.a($$2)));
   }

   @Override
   public int a(efm[] $$0, efm $$1) {
      int $$2 = 0;
      int $$3 = 0;
      efk $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      efk $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != efk.w) {
         $$3 = aup.d(Math.max(1.0F, this.b.dF()));
      }

      double $$6 = this.d(new hx($$1.a, $$1.b, $$1.c));
      efm $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, ic.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      efm $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, ic.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      efm $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, ic.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      efm $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, ic.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      efm $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, ic.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      efm $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, ic.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      efm $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, ic.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      efm $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, ic.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable efm $$0, efm $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(efm $$0, @Nullable efm $$1, @Nullable efm $$2, @Nullable efm $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != efk.d && $$2.l != efk.d && $$3.l != efk.d) {
         boolean $$4 = $$2.l == efk.h && $$1.l == efk.h && (double)this.b.dg() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(efk $$0) {
      return $$0 == efk.h || $$0 == efk.s || $$0 == efk.t;
   }

   private boolean b(efm $$0) {
      elx $$1 = this.b.cH();
      emc $$2 = new emc((double)$$0.a - this.b.dq() + $$1.b() / 2.0, (double)$$0.b - this.b.ds() + $$1.c() / 2.0, (double)$$0.c - this.b.dw() + $$1.d() / 2.0);
      int $$3 = aup.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(hx $$0) {
      return (this.f() || this.c()) && this.a.b_($$0).a(asn.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(ctd $$0, hx $$1) {
      hx $$2 = $$1.d();
      emv $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ic.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected efm a(int $$0, int $$1, int $$2, int $$3, double $$4, ic $$5, efk $$6) {
      efm $$7 = null;
      hx.a $$8 = new hx.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         efk $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.dg() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != efk.c && (!this.c() || $$10 != efk.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != efk.h || this.g()) && $$10 != efk.m && $$10 != efk.e && $$10 != efk.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == efk.b || $$7.l == efk.c) && this.b.dg() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  elx $$15 = new elx(
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

            if (!this.c() && $$10 == efk.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != efk.j) {
                  return $$7;
               }

               while ($$1 > this.b.dL().J_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != efk.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == efk.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == efk.b) {
                  if (--$$1 < this.b.dL().J_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.cu()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != efk.b && $$11 >= 0.0F) {
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

   private efm a(int $$0, int $$1, int $$2, efk $$3, float $$4) {
      efm $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private efm a(int $$0, int $$1, int $$2) {
      efm $$3 = this.b($$0, $$1, $$2);
      $$3.l = efk.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(elx $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public efk a(ctd $$0, int $$1, int $$2, int $$3, bmq $$4) {
      EnumSet<efk> $$5 = EnumSet.noneOf(efk.class);
      efk $$6 = efk.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dl());
      if ($$5.contains(efk.h)) {
         return efk.h;
      } else if ($$5.contains(efk.m)) {
         return efk.m;
      } else {
         efk $$7 = efk.a;

         for (efk $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == efk.b && $$4.a($$7) == 0.0F && this.d <= 1 ? efk.b : $$7;
      }
   }

   public efk a(ctd $$0, int $$1, int $$2, int $$3, EnumSet<efk> $$4, efk $$5, hx $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               efk $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected efk a(ctd $$0, hx $$1, efk $$2) {
      boolean $$3 = this.d();
      if ($$2 == efk.s && this.e() && $$3) {
         $$2 = efk.d;
      }

      if ($$2 == efk.r && !$$3) {
         $$2 = efk.a;
      }

      if ($$2 == efk.l && !($$0.a_($$1).b() instanceof cwn) && !($$0.a_($$1.d()).b() instanceof cwn)) {
         $$2 = efk.m;
      }

      return $$2;
   }

   protected efk a(bmq $$0, hx $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected efk a(bmq $$0, int $$1, int $$2, int $$3) {
      return (efk)this.m.computeIfAbsent(hx.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public efk a(ctd $$0, int $$1, int $$2, int $$3) {
      return a($$0, new hx.a($$1, $$2, $$3));
   }

   public static efk a(ctd $$0, hx.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      efk $$5 = b($$0, $$1);
      if ($$5 == efk.b && $$3 >= $$0.J_() + 1) {
         return switch (b($$0, $$1.d($$2, $$3 - 1, $$4))) {
            case b, j, i, c -> efk.b;
            case o -> efk.o;
            case q -> efk.q;
            case w -> efk.w;
            case f -> efk.g;
            case y -> efk.y;
            case e -> efk.z;
            default -> a($$0, $$1.d($$2, $$3, $$4), efk.c);
         };
      } else {
         return $$5;
      }
   }

   public static efk a(ctd $$0, hx.a $$1, efk $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  djp $$9 = $$0.a_($$1);
                  if ($$9.a(cxa.dQ) || $$9.a(cxa.oi)) {
                     return efk.p;
                  }

                  if (a($$9)) {
                     return efk.n;
                  }

                  if ($$0.b_($$1).a(asn.a)) {
                     return efk.k;
                  }

                  if ($$9.a(cxa.cd) || $$9.a(cxa.st)) {
                     return efk.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static efk b(ctd $$0, hx $$1) {
      djp $$2 = $$0.a_($$1);
      cwy $$3 = $$2.b();
      if ($$2.i()) {
         return efk.b;
      } else if ($$2.a(asi.P) || $$2.a(cxa.fm) || $$2.a(cxa.sD)) {
         return efk.e;
      } else if ($$2.a(cxa.qP)) {
         return efk.f;
      } else if ($$2.a(cxa.dQ) || $$2.a(cxa.oi)) {
         return efk.q;
      } else if ($$2.a(cxa.pg)) {
         return efk.w;
      } else if ($$2.a(cxa.fC)) {
         return efk.x;
      } else if (!$$2.a(cxa.cd) && !$$2.a(cxa.st)) {
         eez $$4 = $$0.b_($$1);
         if ($$4.a(asn.b)) {
            return efk.i;
         } else if (a($$2)) {
            return efk.o;
         } else if ($$3 instanceof cze $$5) {
            if ($$2.c(cze.c)) {
               return efk.r;
            } else {
               return $$5.b().c() ? efk.s : efk.t;
            }
         } else if ($$3 instanceof cwn) {
            return efk.l;
         } else if ($$3 instanceof dbh) {
            return efk.v;
         } else if (!$$2.a(asi.S) && !$$2.a(asi.L) && (!($$3 instanceof czx) || $$2.c(czx.b))) {
            if (!$$2.a($$0, $$1, efp.a)) {
               return efk.a;
            } else {
               return $$4.a(asn.a) ? efk.j : efk.b;
            }
         } else {
            return efk.h;
         }
      } else {
         return efk.y;
      }
   }

   public static boolean a(djp $$0) {
      return $$0.a(asi.aJ) || $$0.a(cxa.H) || $$0.a(cxa.kJ) || cxm.g($$0) || $$0.a(cxa.fv);
   }
}

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class ehq extends ehk {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<ehh> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<enu> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(cwe $$0, bok $$1) {
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
   public ehj a() {
      hz.a $$0 = new hz.a();
      int $$1 = this.b.ds();
      dlj $$2 = this.a.a_($$0.b(this.b.dr(), (double)$$1, this.b.dx()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aZ()) {
            while (true) {
               if (!$$2.a(cyu.G) && $$2.u() != egx.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dr(), (double)(++$$1), this.b.dx()));
            }
         } else if (this.b.aC()) {
            $$1 = awi.a(this.b.dt() + 0.5);
         } else {
            hz $$3 = this.b.dm();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, ehm.a)) && $$3.v() > this.b.dM().J_()) {
               $$3 = $$3.d();
            }

            $$1 = $$3.c().v();
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a_($$0.b(this.b.dr(), (double)(++$$1), this.b.dx()));
         }

         $$1--;
      }

      hz $$4 = this.b.dm();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         enu $$5 = this.b.cH();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new hz($$4.u(), $$1, $$4.w()));
   }

   protected ehj c(hz $$0) {
      ehj $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(hz $$0) {
      ehh $$1 = this.a(this.b, $$0);
      return $$1 != ehh.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public ehp a(double $$0, double $$1, double $$2) {
      return this.a(this.b(awi.a($$0), awi.a($$1), awi.a($$2)));
   }

   @Override
   public int a(ehj[] $$0, ehj $$1) {
      int $$2 = 0;
      int $$3 = 0;
      ehh $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      ehh $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != ehh.w) {
         $$3 = awi.d(Math.max(1.0F, this.b.dG()));
      }

      double $$6 = this.d(new hz($$1.a, $$1.b, $$1.c));
      ehj $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, ie.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      ehj $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, ie.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      ehj $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, ie.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      ehj $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, ie.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      ehj $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, ie.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      ehj $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, ie.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      ehj $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, ie.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      ehj $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, ie.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable ehj $$0, ehj $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(ehj $$0, @Nullable ehj $$1, @Nullable ehj $$2, @Nullable ehj $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != ehh.d && $$2.l != ehh.d && $$3.l != ehh.d) {
         boolean $$4 = $$2.l == ehh.h && $$1.l == ehh.h && (double)this.b.dg() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(ehh $$0) {
      return $$0 == ehh.h || $$0 == ehh.s || $$0 == ehh.t;
   }

   private boolean b(ehj $$0) {
      enu $$1 = this.b.cH();
      enz $$2 = new enz((double)$$0.a - this.b.dr() + $$1.b() / 2.0, (double)$$0.b - this.b.dt() + $$1.c() / 2.0, (double)$$0.c - this.b.dx() + $$1.d() / 2.0);
      int $$3 = awi.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(hz $$0) {
      return (this.f() || this.c()) && this.a.b_($$0).a(auf.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(cux $$0, hz $$1) {
      hz $$2 = $$1.d();
      eos $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ie.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected ehj a(int $$0, int $$1, int $$2, int $$3, double $$4, ie $$5, ehh $$6) {
      ehj $$7 = null;
      hz.a $$8 = new hz.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         ehh $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.dg() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != ehh.c && (!this.c() || $$10 != ehh.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != ehh.h || this.g()) && $$10 != ehh.m && $$10 != ehh.e && $$10 != ehh.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == ehh.b || $$7.l == ehh.c) && this.b.dg() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  enu $$15 = new enu(
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

            if (!this.c() && $$10 == ehh.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != ehh.j) {
                  return $$7;
               }

               while ($$1 > this.b.dM().J_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != ehh.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == ehh.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == ehh.b) {
                  if (--$$1 < this.b.dM().J_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.cu()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != ehh.b && $$11 >= 0.0F) {
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
      return Math.max(1.125, (double)this.b.dG());
   }

   private ehj a(int $$0, int $$1, int $$2, ehh $$3, float $$4) {
      ehj $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private ehj a(int $$0, int $$1, int $$2) {
      ehj $$3 = this.b($$0, $$1, $$2);
      $$3.l = ehh.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(enu $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public ehh a(cux $$0, int $$1, int $$2, int $$3, bok $$4) {
      EnumSet<ehh> $$5 = EnumSet.noneOf(ehh.class);
      ehh $$6 = ehh.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dm());
      if ($$5.contains(ehh.h)) {
         return ehh.h;
      } else if ($$5.contains(ehh.m)) {
         return ehh.m;
      } else {
         ehh $$7 = ehh.a;

         for (ehh $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == ehh.b && $$4.a($$7) == 0.0F && this.d <= 1 ? ehh.b : $$7;
      }
   }

   public ehh a(cux $$0, int $$1, int $$2, int $$3, EnumSet<ehh> $$4, ehh $$5, hz $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               ehh $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected ehh a(cux $$0, hz $$1, ehh $$2) {
      boolean $$3 = this.d();
      if ($$2 == ehh.s && this.e() && $$3) {
         $$2 = ehh.d;
      }

      if ($$2 == ehh.r && !$$3) {
         $$2 = ehh.a;
      }

      if ($$2 == ehh.l && !($$0.a_($$1).b() instanceof cyh) && !($$0.a_($$1.d()).b() instanceof cyh)) {
         $$2 = ehh.m;
      }

      return $$2;
   }

   protected ehh a(bok $$0, hz $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected ehh a(bok $$0, int $$1, int $$2, int $$3) {
      return (ehh)this.m.computeIfAbsent(hz.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public ehh a(cux $$0, int $$1, int $$2, int $$3) {
      return a($$0, new hz.a($$1, $$2, $$3));
   }

   public static ehh a(cux $$0, hz.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      ehh $$5 = b($$0, $$1);
      if ($$5 == ehh.b && $$3 >= $$0.J_() + 1) {
         return switch (b($$0, $$1.d($$2, $$3 - 1, $$4))) {
            case b, j, i, c -> ehh.b;
            case o -> ehh.o;
            case q -> ehh.q;
            case w -> ehh.w;
            case f -> ehh.g;
            case y -> ehh.y;
            case e -> ehh.z;
            default -> a($$0, $$1.d($$2, $$3, $$4), ehh.c);
         };
      } else {
         return $$5;
      }
   }

   public static ehh a(cux $$0, hz.a $$1, ehh $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dlj $$9 = $$0.a_($$1);
                  if ($$9.a(cyu.dQ) || $$9.a(cyu.oi)) {
                     return ehh.p;
                  }

                  if (a($$9)) {
                     return ehh.n;
                  }

                  if ($$0.b_($$1).a(auf.a)) {
                     return ehh.k;
                  }

                  if ($$9.a(cyu.cd) || $$9.a(cyu.st)) {
                     return ehh.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static ehh b(cux $$0, hz $$1) {
      dlj $$2 = $$0.a_($$1);
      cys $$3 = $$2.b();
      if ($$2.i()) {
         return ehh.b;
      } else if ($$2.a(aua.P) || $$2.a(cyu.fm) || $$2.a(cyu.sD)) {
         return ehh.e;
      } else if ($$2.a(cyu.qP)) {
         return ehh.f;
      } else if ($$2.a(cyu.dQ) || $$2.a(cyu.oi)) {
         return ehh.q;
      } else if ($$2.a(cyu.pg)) {
         return ehh.w;
      } else if ($$2.a(cyu.fC)) {
         return ehh.x;
      } else if (!$$2.a(cyu.cd) && !$$2.a(cyu.st)) {
         egw $$4 = $$0.b_($$1);
         if ($$4.a(auf.b)) {
            return ehh.i;
         } else if (a($$2)) {
            return ehh.o;
         } else if ($$3 instanceof day $$5) {
            if ($$2.c(day.c)) {
               return ehh.r;
            } else {
               return $$5.b().c() ? ehh.s : ehh.t;
            }
         } else if ($$3 instanceof cyh) {
            return ehh.l;
         } else if ($$3 instanceof ddb) {
            return ehh.v;
         } else if (!$$2.a(aua.S) && !$$2.a(aua.L) && (!($$3 instanceof dbr) || $$2.c(dbr.b))) {
            if (!$$2.a($$0, $$1, ehm.a)) {
               return ehh.a;
            } else {
               return $$4.a(auf.a) ? ehh.j : ehh.b;
            }
         } else {
            return ehh.h;
         }
      } else {
         return ehh.y;
      }
   }

   public static boolean a(dlj $$0) {
      return $$0.a(aua.aJ) || $$0.a(cyu.H) || $$0.a(cyu.kJ) || czg.g($$0) || $$0.a(cyu.fv);
   }
}

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class erl extends erc {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<erg> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<eyn> n = new Object2BooleanOpenHashMap();
   private final erb[] o = new erb[jj.c.a.b()];

   @Override
   public void a(det $$0, bum $$1) {
      super.a($$0, $$1);
      $$1.G();
   }

   @Override
   public void b() {
      this.b.I();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public erb a() {
      je.a $$0 = new je.a();
      int $$1 = this.b.dy();
      duo $$2 = this.a.a($$0.b(this.b.dx(), (double)$$1, this.b.dD()));
      if (!this.b.a($$2.y())) {
         if (this.f() && this.b.bi()) {
            while (true) {
               if (!$$2.a(dhl.G) && $$2.y() != eqq.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.dx(), (double)(++$$1), this.b.dD()));
            }
         } else if (this.b.aH()) {
            $$1 = azd.a(this.b.dz() + 0.5);
         } else {
            $$0.b(this.b.dx(), this.b.dz() + 1.0, this.b.dD());

            while ($$0.v() > this.a.a().G_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               duo $$3 = this.a.a($$0);
               if (!$$3.l() && !$$3.a(ere.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.y())) {
            $$2 = this.a.a($$0.b(this.b.dx(), (double)(++$$1), this.b.dD()));
         }

         $$1--;
      }

      je $$4 = this.b.ds();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         eyn $$5 = this.b.cO();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new je($$4.u(), $$1, $$4.w()));
   }

   protected erb c(je $$0) {
      erb $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(je $$0) {
      erg $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != erg.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public erk a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(erb[] $$0, erb $$1) {
      int $$2 = 0;
      int $$3 = 0;
      erg $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      erg $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != erg.w) {
         $$3 = azd.d(Math.max(1.0F, this.b.dM()));
      }

      double $$6 = this.d(new je($$1.a, $$1.b, $$1.c));

      for (jj $$7 : jj.c.a) {
         erb $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jj $$9 : jj.c.a) {
         jj $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            erb $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable erb $$0, erb $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(erb $$0, @Nullable erb $$1, @Nullable erb $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != erg.d && $$2.l != erg.d) {
         boolean $$3 = $$2.l == erg.h && $$1.l == erg.h && (double)this.b.dn() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable erb $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == erg.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(erg $$0) {
      return $$0 == erg.h || $$0 == erg.s || $$0 == erg.t;
   }

   private boolean b(erb $$0) {
      eyn $$1 = this.b.cO();
      eys $$2 = new eys((double)$$0.a - this.b.dx() + $$1.b() / 2.0, (double)$$0.b - this.b.dz() + $$1.c() / 2.0, (double)$$0.c - this.b.dD() + $$1.d() / 2.0);
      int $$3 = azd.c($$2.g() / $$1.a());
      $$2 = $$2.c((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(je $$0) {
      ddl $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(awz.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(ddl $$0, je $$1) {
      je $$2 = $$1.e();
      ezm $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jj.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected erb a(int $$0, int $$1, int $$2, int $$3, double $$4, jj $$5, erg $$6) {
      erb $$7 = null;
      je.a $$8 = new je.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         erg $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != erg.c && (!this.c() || $$10 != erg.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != erg.h || this.g()) && $$10 != erg.m && $$10 != erg.e && $$10 != erg.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == erg.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == erg.b) {
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
      return Math.max(1.125, (double)this.b.dM());
   }

   private erb a(int $$0, int $$1, int $$2, erg $$3, float $$4) {
      erb $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private erb a(int $$0, int $$1, int $$2) {
      erb $$3 = this.c($$0, $$1, $$2);
      $$3.l = erg.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private erb a(int $$0, int $$1, int $$2, erg $$3) {
      erb $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private erb a(int $$0, int $$1, int $$2, int $$3, double $$4, jj $$5, erg $$6, je.a $$7) {
      erb $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dn() >= 1.0F) {
         return $$8;
      } else if ($$8.l != erg.b && $$8.l != erg.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dn() / 2.0;
         eyn $$12 = new eyn(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.do() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private erb a(int $$0, int $$1, int $$2, @Nullable erb $$3) {
      $$1--;

      while ($$1 > this.b.dS().G_()) {
         erg $$4 = this.b($$0, $$1, $$2);
         if ($$4 != erg.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private erb d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dS().G_(); $$3--) {
         if ($$1 - $$3 > this.b.cB()) {
            return this.a($$0, $$3, $$2);
         }

         erg $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != erg.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(eyn $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected erg b(int $$0, int $$1, int $$2) {
      return (erg)this.m.computeIfAbsent(je.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public erg a(eri $$0, int $$1, int $$2, int $$3, bum $$4) {
      Set<erg> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(erg.h)) {
         return erg.h;
      } else if ($$5.contains(erg.m)) {
         return erg.m;
      } else {
         erg $$6 = erg.a;

         for (erg $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != erg.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == erg.b ? erg.b : $$6;
      }
   }

   public Set<erg> b(eri $$0, int $$1, int $$2, int $$3) {
      EnumSet<erg> $$4 = EnumSet.noneOf(erg.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               erg $$11 = this.a($$0, $$8, $$9, $$10);
               je $$12 = this.b.ds();
               boolean $$13 = this.d();
               if ($$11 == erg.s && this.e() && $$13) {
                  $$11 = erg.d;
               }

               if ($$11 == erg.r && !$$13) {
                  $$11 = erg.a;
               }

               if ($$11 == erg.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != erg.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != erg.l) {
                  $$11 = erg.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public erg a(eri $$0, int $$1, int $$2, int $$3) {
      return a($$0, new je.a($$1, $$2, $$3));
   }

   public static erg b(bum $$0, je $$1) {
      return a(new eri($$0.dS(), $$0), $$1.k());
   }

   public static erg a(eri $$0, je.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      erg $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == erg.b && $$3 >= $$0.a().G_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> erg.b;
            case o -> erg.o;
            case q -> erg.q;
            case w -> erg.w;
            case f -> erg.g;
            case y -> erg.y;
            case e -> erg.z;
            default -> a($$0, $$2, $$3, $$4, erg.c);
         };
      } else {
         return $$5;
      }
   }

   public static erg a(eri $$0, int $$1, int $$2, int $$3, erg $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  erg $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == erg.q) {
                     return erg.p;
                  }

                  if ($$8 == erg.o || $$8 == erg.i) {
                     return erg.n;
                  }

                  if ($$8 == erg.j) {
                     return erg.k;
                  }

                  if ($$8 == erg.y) {
                     return erg.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static erg b(ddl $$0, je $$1) {
      duo $$2 = $$0.a_($$1);
      dhj $$3 = $$2.b();
      if ($$2.l()) {
         return erg.b;
      } else if ($$2.a(awt.Q) || $$2.a(dhl.fm) || $$2.a(dhl.sD)) {
         return erg.e;
      } else if ($$2.a(dhl.qP)) {
         return erg.f;
      } else if ($$2.a(dhl.dQ) || $$2.a(dhl.oi)) {
         return erg.q;
      } else if ($$2.a(dhl.pg)) {
         return erg.w;
      } else if ($$2.a(dhl.fC)) {
         return erg.x;
      } else if (!$$2.a(dhl.cd) && !$$2.a(dhl.st)) {
         eqp $$4 = $$2.y();
         if ($$4.a(awz.b)) {
            return erg.i;
         } else if (a($$2)) {
            return erg.o;
         } else if ($$3 instanceof djp $$5) {
            if ($$2.c(djp.c)) {
               return erg.r;
            } else {
               return $$5.b().c() ? erg.s : erg.t;
            }
         } else if ($$3 instanceof dgy) {
            return erg.l;
         } else if ($$3 instanceof dlt) {
            return erg.v;
         } else if (!$$2.a(awt.T) && !$$2.a(awt.M) && (!($$3 instanceof dki) || $$2.c(dki.b))) {
            if (!$$2.a(ere.a)) {
               return erg.a;
            } else {
               return $$4.a(awz.a) ? erg.j : erg.b;
            }
         } else {
            return erg.h;
         }
      } else {
         return erg.y;
      }
   }
}

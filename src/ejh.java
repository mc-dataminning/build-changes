import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class ejh extends ejb {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<eiy> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<epm> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(cxm $$0, bpq $$1) {
      super.a($$0, $$1);
      $$1.C();
   }

   @Override
   public void b() {
      this.b.D();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public eja a() {
      ib.a $$0 = new ib.a();
      int $$1 = this.b.ds();
      dmz $$2 = this.a.a_($$0.b(this.b.dr(), (double)$$1, this.b.dx()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.bc()) {
            while (true) {
               if (!$$2.a(dac.G) && $$2.u() != eio.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dr(), (double)(++$$1), this.b.dx()));
            }
         } else if (this.b.aC()) {
            $$1 = aww.a(this.b.dt() + 0.5);
         } else {
            ib $$3 = this.b.dm();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, ejd.a)) && $$3.v() > this.b.dM().I_()) {
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

      ib $$4 = this.b.dm();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         epm $$5 = this.b.cH();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new ib($$4.u(), $$1, $$4.w()));
   }

   protected eja c(ib $$0) {
      eja $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(ib $$0) {
      eiy $$1 = this.a(this.b, $$0);
      return $$1 != eiy.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public ejg a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aww.a($$0), aww.a($$1), aww.a($$2)));
   }

   @Override
   public int a(eja[] $$0, eja $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eiy $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eiy $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != eiy.w) {
         $$3 = aww.d(Math.max(1.0F, this.b.dG()));
      }

      double $$6 = this.d(new ib($$1.a, $$1.b, $$1.c));
      eja $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, ih.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      eja $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, ih.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      eja $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, ih.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      eja $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, ih.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      eja $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, ih.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      eja $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, ih.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      eja $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, ih.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      eja $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, ih.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable eja $$0, eja $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eja $$0, @Nullable eja $$1, @Nullable eja $$2, @Nullable eja $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eiy.d && $$2.l != eiy.d && $$3.l != eiy.d) {
         boolean $$4 = $$2.l == eiy.h && $$1.l == eiy.h && (double)this.b.dg() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(eiy $$0) {
      return $$0 == eiy.h || $$0 == eiy.s || $$0 == eiy.t;
   }

   private boolean b(eja $$0) {
      epm $$1 = this.b.cH();
      epr $$2 = new epr((double)$$0.a - this.b.dr() + $$1.b() / 2.0, (double)$$0.b - this.b.dt() + $$1.c() / 2.0, (double)$$0.c - this.b.dx() + $$1.d() / 2.0);
      int $$3 = aww.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(ib $$0) {
      return (this.f() || this.c()) && this.a.b_($$0).a(aus.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(cwf $$0, ib $$1) {
      ib $$2 = $$1.d();
      eqk $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ih.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eja a(int $$0, int $$1, int $$2, int $$3, double $$4, ih $$5, eiy $$6) {
      eja $$7 = null;
      ib.a $$8 = new ib.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eiy $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.dg() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eiy.c && (!this.c() || $$10 != eiy.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eiy.h || this.g()) && $$10 != eiy.m && $$10 != eiy.e && $$10 != eiy.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == eiy.b || $$7.l == eiy.c) && this.b.dg() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  epm $$15 = new epm(
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

            if (!this.c() && $$10 == eiy.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != eiy.j) {
                  return $$7;
               }

               while ($$1 > this.b.dM().I_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != eiy.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == eiy.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == eiy.b) {
                  if (--$$1 < this.b.dM().I_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.cu()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != eiy.b && $$11 >= 0.0F) {
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

   private eja a(int $$0, int $$1, int $$2, eiy $$3, float $$4) {
      eja $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eja a(int $$0, int $$1, int $$2) {
      eja $$3 = this.b($$0, $$1, $$2);
      $$3.l = eiy.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(epm $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public eiy a(cwf $$0, int $$1, int $$2, int $$3, bpq $$4) {
      EnumSet<eiy> $$5 = EnumSet.noneOf(eiy.class);
      eiy $$6 = eiy.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dm());
      if ($$5.contains(eiy.h)) {
         return eiy.h;
      } else if ($$5.contains(eiy.m)) {
         return eiy.m;
      } else {
         eiy $$7 = eiy.a;

         for (eiy $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == eiy.b && $$4.a($$7) == 0.0F && this.d <= 1 ? eiy.b : $$7;
      }
   }

   public eiy a(cwf $$0, int $$1, int $$2, int $$3, EnumSet<eiy> $$4, eiy $$5, ib $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               eiy $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected eiy a(cwf $$0, ib $$1, eiy $$2) {
      boolean $$3 = this.d();
      if ($$2 == eiy.s && this.e() && $$3) {
         $$2 = eiy.d;
      }

      if ($$2 == eiy.r && !$$3) {
         $$2 = eiy.a;
      }

      if ($$2 == eiy.l && !($$0.a_($$1).b() instanceof czp) && !($$0.a_($$1.d()).b() instanceof czp)) {
         $$2 = eiy.m;
      }

      return $$2;
   }

   protected eiy a(bpq $$0, ib $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected eiy a(bpq $$0, int $$1, int $$2, int $$3) {
      return (eiy)this.m.computeIfAbsent(ib.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public eiy a(cwf $$0, int $$1, int $$2, int $$3) {
      return a($$0, new ib.a($$1, $$2, $$3));
   }

   public static eiy a(cwf $$0, ib.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eiy $$5 = b($$0, $$1);
      if ($$5 == eiy.b && $$3 >= $$0.I_() + 1) {
         return switch (b($$0, $$1.d($$2, $$3 - 1, $$4))) {
            case b, j, i, c -> eiy.b;
            case o -> eiy.o;
            case q -> eiy.q;
            case w -> eiy.w;
            case f -> eiy.g;
            case y -> eiy.y;
            case e -> eiy.z;
            default -> a($$0, $$1.d($$2, $$3, $$4), eiy.c);
         };
      } else {
         return $$5;
      }
   }

   public static eiy a(cwf $$0, ib.a $$1, eiy $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dmz $$9 = $$0.a_($$1);
                  if ($$9.a(dac.dQ) || $$9.a(dac.oi)) {
                     return eiy.p;
                  }

                  if (a($$9)) {
                     return eiy.n;
                  }

                  if ($$0.b_($$1).a(aus.a)) {
                     return eiy.k;
                  }

                  if ($$9.a(dac.cd) || $$9.a(dac.st)) {
                     return eiy.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static eiy b(cwf $$0, ib $$1) {
      dmz $$2 = $$0.a_($$1);
      daa $$3 = $$2.b();
      if ($$2.i()) {
         return eiy.b;
      } else if ($$2.a(aun.P) || $$2.a(dac.fm) || $$2.a(dac.sD)) {
         return eiy.e;
      } else if ($$2.a(dac.qP)) {
         return eiy.f;
      } else if ($$2.a(dac.dQ) || $$2.a(dac.oi)) {
         return eiy.q;
      } else if ($$2.a(dac.pg)) {
         return eiy.w;
      } else if ($$2.a(dac.fC)) {
         return eiy.x;
      } else if (!$$2.a(dac.cd) && !$$2.a(dac.st)) {
         ein $$4 = $$0.b_($$1);
         if ($$4.a(aus.b)) {
            return eiy.i;
         } else if (a($$2)) {
            return eiy.o;
         } else if ($$3 instanceof dcg $$5) {
            if ($$2.c(dcg.c)) {
               return eiy.r;
            } else {
               return $$5.b().c() ? eiy.s : eiy.t;
            }
         } else if ($$3 instanceof czp) {
            return eiy.l;
         } else if ($$3 instanceof dej) {
            return eiy.v;
         } else if (!$$2.a(aun.S) && !$$2.a(aun.L) && (!($$3 instanceof dcz) || $$2.c(dcz.b))) {
            if (!$$2.a($$0, $$1, ejd.a)) {
               return eiy.a;
            } else {
               return $$4.a(aus.a) ? eiy.j : eiy.b;
            }
         } else {
            return eiy.h;
         }
      } else {
         return eiy.y;
      }
   }

   public static boolean a(dmz $$0) {
      return $$0.a(aun.aK) || $$0.a(dac.H) || $$0.a(dac.kJ) || dao.g($$0) || $$0.a(dac.fv);
   }
}

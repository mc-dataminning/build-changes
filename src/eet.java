import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class eet extends een {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<eek> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ekw> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(ctl $$0, blx $$1) {
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
   public eem a() {
      hv.a $$0 = new hv.a();
      int $$1 = this.b.ds();
      dip $$2 = this.a.a_($$0.b(this.b.dr(), (double)$$1, this.b.dx()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aZ()) {
            while (true) {
               if (!$$2.a(cwb.G) && $$2.u() != eea.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dr(), (double)(++$$1), this.b.dx()));
            }
         } else if (this.b.aC()) {
            $$1 = aty.a(this.b.dt() + 0.5);
         } else {
            hv $$3 = this.b.dm();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, eep.a)) && $$3.v() > this.b.dM().J_()) {
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

      hv $$4 = this.b.dm();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ekw $$5 = this.b.cH();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new hv($$4.u(), $$1, $$4.w()));
   }

   protected eem c(hv $$0) {
      eem $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(hv $$0) {
      eek $$1 = this.a(this.b, $$0);
      return $$1 != eek.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public ees a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aty.a($$0), aty.a($$1), aty.a($$2)));
   }

   @Override
   public int a(eem[] $$0, eem $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eek $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eek $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != eek.w) {
         $$3 = aty.d(Math.max(1.0F, this.b.dG()));
      }

      double $$6 = this.d(new hv($$1.a, $$1.b, $$1.c));
      eem $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, ia.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      eem $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, ia.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      eem $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, ia.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      eem $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, ia.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      eem $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, ia.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      eem $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, ia.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      eem $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, ia.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      eem $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, ia.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable eem $$0, eem $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eem $$0, @Nullable eem $$1, @Nullable eem $$2, @Nullable eem $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eek.d && $$2.l != eek.d && $$3.l != eek.d) {
         boolean $$4 = $$2.l == eek.h && $$1.l == eek.h && (double)this.b.dg() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(eek $$0) {
      return $$0 == eek.h || $$0 == eek.s || $$0 == eek.t;
   }

   private boolean b(eem $$0) {
      ekw $$1 = this.b.cH();
      elb $$2 = new elb((double)$$0.a - this.b.dr() + $$1.b() / 2.0, (double)$$0.b - this.b.dt() + $$1.c() / 2.0, (double)$$0.c - this.b.dx() + $$1.d() / 2.0);
      int $$3 = aty.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(hv $$0) {
      return (this.f() || this.c()) && this.a.b_($$0).a(arw.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(cse $$0, hv $$1) {
      hv $$2 = $$1.d();
      elu $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ia.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eem a(int $$0, int $$1, int $$2, int $$3, double $$4, ia $$5, eek $$6) {
      eem $$7 = null;
      hv.a $$8 = new hv.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eek $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.dg() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eek.c && (!this.c() || $$10 != eek.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eek.h || this.g()) && $$10 != eek.m && $$10 != eek.e && $$10 != eek.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == eek.b || $$7.l == eek.c) && this.b.dg() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  ekw $$15 = new ekw(
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

            if (!this.c() && $$10 == eek.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != eek.j) {
                  return $$7;
               }

               while ($$1 > this.b.dM().J_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != eek.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == eek.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == eek.b) {
                  if (--$$1 < this.b.dM().J_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.cu()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != eek.b && $$11 >= 0.0F) {
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

   private eem a(int $$0, int $$1, int $$2, eek $$3, float $$4) {
      eem $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eem a(int $$0, int $$1, int $$2) {
      eem $$3 = this.b($$0, $$1, $$2);
      $$3.l = eek.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(ekw $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public eek a(cse $$0, int $$1, int $$2, int $$3, blx $$4) {
      EnumSet<eek> $$5 = EnumSet.noneOf(eek.class);
      eek $$6 = eek.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dm());
      if ($$5.contains(eek.h)) {
         return eek.h;
      } else if ($$5.contains(eek.m)) {
         return eek.m;
      } else {
         eek $$7 = eek.a;

         for (eek $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == eek.b && $$4.a($$7) == 0.0F && this.d <= 1 ? eek.b : $$7;
      }
   }

   public eek a(cse $$0, int $$1, int $$2, int $$3, EnumSet<eek> $$4, eek $$5, hv $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               eek $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected eek a(cse $$0, hv $$1, eek $$2) {
      boolean $$3 = this.d();
      if ($$2 == eek.s && this.e() && $$3) {
         $$2 = eek.d;
      }

      if ($$2 == eek.r && !$$3) {
         $$2 = eek.a;
      }

      if ($$2 == eek.l && !($$0.a_($$1).b() instanceof cvo) && !($$0.a_($$1.d()).b() instanceof cvo)) {
         $$2 = eek.m;
      }

      return $$2;
   }

   protected eek a(blx $$0, hv $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected eek a(blx $$0, int $$1, int $$2, int $$3) {
      return (eek)this.m.computeIfAbsent(hv.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public eek a(cse $$0, int $$1, int $$2, int $$3) {
      return a($$0, new hv.a($$1, $$2, $$3));
   }

   public static eek a(cse $$0, hv.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eek $$5 = b($$0, $$1);
      if ($$5 == eek.b && $$3 >= $$0.J_() + 1) {
         return switch (b($$0, $$1.d($$2, $$3 - 1, $$4))) {
            case b, j, i, c -> eek.b;
            case o -> eek.o;
            case q -> eek.q;
            case w -> eek.w;
            case f -> eek.g;
            case y -> eek.y;
            case e -> eek.z;
            default -> a($$0, $$1.d($$2, $$3, $$4), eek.c);
         };
      } else {
         return $$5;
      }
   }

   public static eek a(cse $$0, hv.a $$1, eek $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dip $$9 = $$0.a_($$1);
                  if ($$9.a(cwb.dQ) || $$9.a(cwb.oi)) {
                     return eek.p;
                  }

                  if (a($$9)) {
                     return eek.n;
                  }

                  if ($$0.b_($$1).a(arw.a)) {
                     return eek.k;
                  }

                  if ($$9.a(cwb.cd) || $$9.a(cwb.st)) {
                     return eek.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static eek b(cse $$0, hv $$1) {
      dip $$2 = $$0.a_($$1);
      cvz $$3 = $$2.b();
      if ($$2.i()) {
         return eek.b;
      } else if ($$2.a(arr.P) || $$2.a(cwb.fm) || $$2.a(cwb.sD)) {
         return eek.e;
      } else if ($$2.a(cwb.qP)) {
         return eek.f;
      } else if ($$2.a(cwb.dQ) || $$2.a(cwb.oi)) {
         return eek.q;
      } else if ($$2.a(cwb.pg)) {
         return eek.w;
      } else if ($$2.a(cwb.fC)) {
         return eek.x;
      } else if (!$$2.a(cwb.cd) && !$$2.a(cwb.st)) {
         edz $$4 = $$0.b_($$1);
         if ($$4.a(arw.b)) {
            return eek.i;
         } else if (a($$2)) {
            return eek.o;
         } else if ($$3 instanceof cyf $$5) {
            if ($$2.c(cyf.c)) {
               return eek.r;
            } else {
               return $$5.b().c() ? eek.s : eek.t;
            }
         } else if ($$3 instanceof cvo) {
            return eek.l;
         } else if ($$3 instanceof dai) {
            return eek.v;
         } else if (!$$2.a(arr.S) && !$$2.a(arr.L) && (!($$3 instanceof cyy) || $$2.c(cyy.b))) {
            if (!$$2.a($$0, $$1, eep.a)) {
               return eek.a;
            } else {
               return $$4.a(arw.a) ? eek.j : eek.b;
            }
         } else {
            return eek.h;
         }
      } else {
         return eek.y;
      }
   }

   public static boolean a(dip $$0) {
      return $$0.a(arr.aJ) || $$0.a(cwb.H) || $$0.a(cwb.kJ) || cwn.g($$0) || $$0.a(cwb.fv);
   }
}

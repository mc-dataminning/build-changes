import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class efl extends eff {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<efc> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<elo> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(cuc $$0, bmn $$1) {
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
   public efe a() {
      hx.a $$0 = new hx.a();
      int $$1 = this.b.ds();
      djh $$2 = this.a.a_($$0.b(this.b.dr(), (double)$$1, this.b.dx()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aZ()) {
            while (true) {
               if (!$$2.a(cws.G) && $$2.u() != ees.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dr(), (double)(++$$1), this.b.dx()));
            }
         } else if (this.b.aC()) {
            $$1 = auo.a(this.b.dt() + 0.5);
         } else {
            hx $$3 = this.b.dm();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, efh.a)) && $$3.v() > this.b.dM().J_()) {
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

      hx $$4 = this.b.dm();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         elo $$5 = this.b.cH();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new hx($$4.u(), $$1, $$4.w()));
   }

   protected efe c(hx $$0) {
      efe $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(hx $$0) {
      efc $$1 = this.a(this.b, $$0);
      return $$1 != efc.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public efk a(double $$0, double $$1, double $$2) {
      return this.a(this.b(auo.a($$0), auo.a($$1), auo.a($$2)));
   }

   @Override
   public int a(efe[] $$0, efe $$1) {
      int $$2 = 0;
      int $$3 = 0;
      efc $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      efc $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != efc.w) {
         $$3 = auo.d(Math.max(1.0F, this.b.dG()));
      }

      double $$6 = this.d(new hx($$1.a, $$1.b, $$1.c));
      efe $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, ic.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      efe $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, ic.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      efe $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, ic.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      efe $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, ic.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      efe $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, ic.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      efe $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, ic.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      efe $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, ic.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      efe $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, ic.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable efe $$0, efe $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(efe $$0, @Nullable efe $$1, @Nullable efe $$2, @Nullable efe $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != efc.d && $$2.l != efc.d && $$3.l != efc.d) {
         boolean $$4 = $$2.l == efc.h && $$1.l == efc.h && (double)this.b.dg() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(efc $$0) {
      return $$0 == efc.h || $$0 == efc.s || $$0 == efc.t;
   }

   private boolean b(efe $$0) {
      elo $$1 = this.b.cH();
      elt $$2 = new elt((double)$$0.a - this.b.dr() + $$1.b() / 2.0, (double)$$0.b - this.b.dt() + $$1.c() / 2.0, (double)$$0.c - this.b.dx() + $$1.d() / 2.0);
      int $$3 = auo.c($$2.f() / $$1.a());
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
      return (this.f() || this.c()) && this.a.b_($$0).a(asm.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(csv $$0, hx $$1) {
      hx $$2 = $$1.d();
      emm $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ic.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected efe a(int $$0, int $$1, int $$2, int $$3, double $$4, ic $$5, efc $$6) {
      efe $$7 = null;
      hx.a $$8 = new hx.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         efc $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.dg() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != efc.c && (!this.c() || $$10 != efc.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != efc.h || this.g()) && $$10 != efc.m && $$10 != efc.e && $$10 != efc.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == efc.b || $$7.l == efc.c) && this.b.dg() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  elo $$15 = new elo(
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

            if (!this.c() && $$10 == efc.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != efc.j) {
                  return $$7;
               }

               while ($$1 > this.b.dM().J_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != efc.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == efc.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == efc.b) {
                  if (--$$1 < this.b.dM().J_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.cu()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != efc.b && $$11 >= 0.0F) {
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

   private efe a(int $$0, int $$1, int $$2, efc $$3, float $$4) {
      efe $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private efe a(int $$0, int $$1, int $$2) {
      efe $$3 = this.b($$0, $$1, $$2);
      $$3.l = efc.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(elo $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public efc a(csv $$0, int $$1, int $$2, int $$3, bmn $$4) {
      EnumSet<efc> $$5 = EnumSet.noneOf(efc.class);
      efc $$6 = efc.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dm());
      if ($$5.contains(efc.h)) {
         return efc.h;
      } else if ($$5.contains(efc.m)) {
         return efc.m;
      } else {
         efc $$7 = efc.a;

         for (efc $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == efc.b && $$4.a($$7) == 0.0F && this.d <= 1 ? efc.b : $$7;
      }
   }

   public efc a(csv $$0, int $$1, int $$2, int $$3, EnumSet<efc> $$4, efc $$5, hx $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               efc $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected efc a(csv $$0, hx $$1, efc $$2) {
      boolean $$3 = this.d();
      if ($$2 == efc.s && this.e() && $$3) {
         $$2 = efc.d;
      }

      if ($$2 == efc.r && !$$3) {
         $$2 = efc.a;
      }

      if ($$2 == efc.l && !($$0.a_($$1).b() instanceof cwf) && !($$0.a_($$1.d()).b() instanceof cwf)) {
         $$2 = efc.m;
      }

      return $$2;
   }

   protected efc a(bmn $$0, hx $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected efc a(bmn $$0, int $$1, int $$2, int $$3) {
      return (efc)this.m.computeIfAbsent(hx.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public efc a(csv $$0, int $$1, int $$2, int $$3) {
      return a($$0, new hx.a($$1, $$2, $$3));
   }

   public static efc a(csv $$0, hx.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      efc $$5 = b($$0, $$1);
      if ($$5 == efc.b && $$3 >= $$0.J_() + 1) {
         return switch (b($$0, $$1.d($$2, $$3 - 1, $$4))) {
            case b, j, i, c -> efc.b;
            case o -> efc.o;
            case q -> efc.q;
            case w -> efc.w;
            case f -> efc.g;
            case y -> efc.y;
            case e -> efc.z;
            default -> a($$0, $$1.d($$2, $$3, $$4), efc.c);
         };
      } else {
         return $$5;
      }
   }

   public static efc a(csv $$0, hx.a $$1, efc $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  djh $$9 = $$0.a_($$1);
                  if ($$9.a(cws.dQ) || $$9.a(cws.oi)) {
                     return efc.p;
                  }

                  if (a($$9)) {
                     return efc.n;
                  }

                  if ($$0.b_($$1).a(asm.a)) {
                     return efc.k;
                  }

                  if ($$9.a(cws.cd) || $$9.a(cws.st)) {
                     return efc.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static efc b(csv $$0, hx $$1) {
      djh $$2 = $$0.a_($$1);
      cwq $$3 = $$2.b();
      if ($$2.i()) {
         return efc.b;
      } else if ($$2.a(ash.P) || $$2.a(cws.fm) || $$2.a(cws.sD)) {
         return efc.e;
      } else if ($$2.a(cws.qP)) {
         return efc.f;
      } else if ($$2.a(cws.dQ) || $$2.a(cws.oi)) {
         return efc.q;
      } else if ($$2.a(cws.pg)) {
         return efc.w;
      } else if ($$2.a(cws.fC)) {
         return efc.x;
      } else if (!$$2.a(cws.cd) && !$$2.a(cws.st)) {
         eer $$4 = $$0.b_($$1);
         if ($$4.a(asm.b)) {
            return efc.i;
         } else if (a($$2)) {
            return efc.o;
         } else if ($$3 instanceof cyw $$5) {
            if ($$2.c(cyw.c)) {
               return efc.r;
            } else {
               return $$5.b().c() ? efc.s : efc.t;
            }
         } else if ($$3 instanceof cwf) {
            return efc.l;
         } else if ($$3 instanceof daz) {
            return efc.v;
         } else if (!$$2.a(ash.S) && !$$2.a(ash.L) && (!($$3 instanceof czp) || $$2.c(czp.b))) {
            if (!$$2.a($$0, $$1, efh.a)) {
               return efc.a;
            } else {
               return $$4.a(asm.a) ? efc.j : efc.b;
            }
         } else {
            return efc.h;
         }
      } else {
         return efc.y;
      }
   }

   public static boolean a(djh $$0) {
      return $$0.a(ash.aJ) || $$0.a(cws.H) || $$0.a(cws.kJ) || cxe.g($$0) || $$0.a(cws.fv);
   }
}

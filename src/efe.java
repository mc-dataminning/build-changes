import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class efe extends eey {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<eev> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<elh> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(ctv $$0, bmh $$1) {
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
   public eex a() {
      hx.a $$0 = new hx.a();
      int $$1 = this.b.ds();
      dja $$2 = this.a.a_($$0.b(this.b.dr(), (double)$$1, this.b.dx()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aZ()) {
            while (true) {
               if (!$$2.a(cwl.G) && $$2.u() != eel.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dr(), (double)(++$$1), this.b.dx()));
            }
         } else if (this.b.aC()) {
            $$1 = aui.a(this.b.dt() + 0.5);
         } else {
            hx $$3 = this.b.dm();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, efa.a)) && $$3.v() > this.b.dM().J_()) {
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
         elh $$5 = this.b.cH();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new hx($$4.u(), $$1, $$4.w()));
   }

   protected eex c(hx $$0) {
      eex $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(hx $$0) {
      eev $$1 = this.a(this.b, $$0);
      return $$1 != eev.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public efd a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aui.a($$0), aui.a($$1), aui.a($$2)));
   }

   @Override
   public int a(eex[] $$0, eex $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eev $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eev $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != eev.w) {
         $$3 = aui.d(Math.max(1.0F, this.b.dG()));
      }

      double $$6 = this.d(new hx($$1.a, $$1.b, $$1.c));
      eex $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, ic.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      eex $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, ic.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      eex $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, ic.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      eex $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, ic.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      eex $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, ic.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      eex $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, ic.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      eex $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, ic.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      eex $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, ic.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable eex $$0, eex $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eex $$0, @Nullable eex $$1, @Nullable eex $$2, @Nullable eex $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eev.d && $$2.l != eev.d && $$3.l != eev.d) {
         boolean $$4 = $$2.l == eev.h && $$1.l == eev.h && (double)this.b.dg() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(eev $$0) {
      return $$0 == eev.h || $$0 == eev.s || $$0 == eev.t;
   }

   private boolean b(eex $$0) {
      elh $$1 = this.b.cH();
      elm $$2 = new elm((double)$$0.a - this.b.dr() + $$1.b() / 2.0, (double)$$0.b - this.b.dt() + $$1.c() / 2.0, (double)$$0.c - this.b.dx() + $$1.d() / 2.0);
      int $$3 = aui.c($$2.f() / $$1.a());
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
      return (this.f() || this.c()) && this.a.b_($$0).a(asg.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(cso $$0, hx $$1) {
      hx $$2 = $$1.d();
      emf $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ic.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eex a(int $$0, int $$1, int $$2, int $$3, double $$4, ic $$5, eev $$6) {
      eex $$7 = null;
      hx.a $$8 = new hx.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eev $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.dg() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eev.c && (!this.c() || $$10 != eev.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eev.h || this.g()) && $$10 != eev.m && $$10 != eev.e && $$10 != eev.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == eev.b || $$7.l == eev.c) && this.b.dg() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  elh $$15 = new elh(
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

            if (!this.c() && $$10 == eev.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != eev.j) {
                  return $$7;
               }

               while ($$1 > this.b.dM().J_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != eev.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == eev.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == eev.b) {
                  if (--$$1 < this.b.dM().J_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.cu()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != eev.b && $$11 >= 0.0F) {
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

   private eex a(int $$0, int $$1, int $$2, eev $$3, float $$4) {
      eex $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eex a(int $$0, int $$1, int $$2) {
      eex $$3 = this.b($$0, $$1, $$2);
      $$3.l = eev.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(elh $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public eev a(cso $$0, int $$1, int $$2, int $$3, bmh $$4) {
      EnumSet<eev> $$5 = EnumSet.noneOf(eev.class);
      eev $$6 = eev.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dm());
      if ($$5.contains(eev.h)) {
         return eev.h;
      } else if ($$5.contains(eev.m)) {
         return eev.m;
      } else {
         eev $$7 = eev.a;

         for (eev $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == eev.b && $$4.a($$7) == 0.0F && this.d <= 1 ? eev.b : $$7;
      }
   }

   public eev a(cso $$0, int $$1, int $$2, int $$3, EnumSet<eev> $$4, eev $$5, hx $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               eev $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected eev a(cso $$0, hx $$1, eev $$2) {
      boolean $$3 = this.d();
      if ($$2 == eev.s && this.e() && $$3) {
         $$2 = eev.d;
      }

      if ($$2 == eev.r && !$$3) {
         $$2 = eev.a;
      }

      if ($$2 == eev.l && !($$0.a_($$1).b() instanceof cvy) && !($$0.a_($$1.d()).b() instanceof cvy)) {
         $$2 = eev.m;
      }

      return $$2;
   }

   protected eev a(bmh $$0, hx $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected eev a(bmh $$0, int $$1, int $$2, int $$3) {
      return (eev)this.m.computeIfAbsent(hx.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public eev a(cso $$0, int $$1, int $$2, int $$3) {
      return a($$0, new hx.a($$1, $$2, $$3));
   }

   public static eev a(cso $$0, hx.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eev $$5 = b($$0, $$1);
      if ($$5 == eev.b && $$3 >= $$0.J_() + 1) {
         return switch (b($$0, $$1.d($$2, $$3 - 1, $$4))) {
            case b, j, i, c -> eev.b;
            case o -> eev.o;
            case q -> eev.q;
            case w -> eev.w;
            case f -> eev.g;
            case y -> eev.y;
            case e -> eev.z;
            default -> a($$0, $$1.d($$2, $$3, $$4), eev.c);
         };
      } else {
         return $$5;
      }
   }

   public static eev a(cso $$0, hx.a $$1, eev $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dja $$9 = $$0.a_($$1);
                  if ($$9.a(cwl.dQ) || $$9.a(cwl.oi)) {
                     return eev.p;
                  }

                  if (a($$9)) {
                     return eev.n;
                  }

                  if ($$0.b_($$1).a(asg.a)) {
                     return eev.k;
                  }

                  if ($$9.a(cwl.cd) || $$9.a(cwl.st)) {
                     return eev.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static eev b(cso $$0, hx $$1) {
      dja $$2 = $$0.a_($$1);
      cwj $$3 = $$2.b();
      if ($$2.i()) {
         return eev.b;
      } else if ($$2.a(asb.P) || $$2.a(cwl.fm) || $$2.a(cwl.sD)) {
         return eev.e;
      } else if ($$2.a(cwl.qP)) {
         return eev.f;
      } else if ($$2.a(cwl.dQ) || $$2.a(cwl.oi)) {
         return eev.q;
      } else if ($$2.a(cwl.pg)) {
         return eev.w;
      } else if ($$2.a(cwl.fC)) {
         return eev.x;
      } else if (!$$2.a(cwl.cd) && !$$2.a(cwl.st)) {
         eek $$4 = $$0.b_($$1);
         if ($$4.a(asg.b)) {
            return eev.i;
         } else if (a($$2)) {
            return eev.o;
         } else if ($$3 instanceof cyp $$5) {
            if ($$2.c(cyp.c)) {
               return eev.r;
            } else {
               return $$5.b().c() ? eev.s : eev.t;
            }
         } else if ($$3 instanceof cvy) {
            return eev.l;
         } else if ($$3 instanceof das) {
            return eev.v;
         } else if (!$$2.a(asb.S) && !$$2.a(asb.L) && (!($$3 instanceof czi) || $$2.c(czi.b))) {
            if (!$$2.a($$0, $$1, efa.a)) {
               return eev.a;
            } else {
               return $$4.a(asg.a) ? eev.j : eev.b;
            }
         } else {
            return eev.h;
         }
      } else {
         return eev.y;
      }
   }

   public static boolean a(dja $$0) {
      return $$0.a(asb.aJ) || $$0.a(cwl.H) || $$0.a(cwl.kJ) || cwx.g($$0) || $$0.a(cwl.fv);
   }
}

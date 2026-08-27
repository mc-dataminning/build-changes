import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class efk extends efe {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<efb> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<eln> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(cub $$0, bmm $$1) {
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
   public efd a() {
      hx.a $$0 = new hx.a();
      int $$1 = this.b.ds();
      djg $$2 = this.a.a_($$0.b(this.b.dr(), (double)$$1, this.b.dx()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aZ()) {
            while (true) {
               if (!$$2.a(cwr.G) && $$2.u() != eer.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dr(), (double)(++$$1), this.b.dx()));
            }
         } else if (this.b.aC()) {
            $$1 = aun.a(this.b.dt() + 0.5);
         } else {
            hx $$3 = this.b.dm();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, efg.a)) && $$3.v() > this.b.dM().J_()) {
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
         eln $$5 = this.b.cH();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new hx($$4.u(), $$1, $$4.w()));
   }

   protected efd c(hx $$0) {
      efd $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(hx $$0) {
      efb $$1 = this.a(this.b, $$0);
      return $$1 != efb.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public efj a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aun.a($$0), aun.a($$1), aun.a($$2)));
   }

   @Override
   public int a(efd[] $$0, efd $$1) {
      int $$2 = 0;
      int $$3 = 0;
      efb $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      efb $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != efb.w) {
         $$3 = aun.d(Math.max(1.0F, this.b.dG()));
      }

      double $$6 = this.d(new hx($$1.a, $$1.b, $$1.c));
      efd $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, ic.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      efd $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, ic.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      efd $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, ic.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      efd $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, ic.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      efd $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, ic.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      efd $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, ic.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      efd $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, ic.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      efd $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, ic.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable efd $$0, efd $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(efd $$0, @Nullable efd $$1, @Nullable efd $$2, @Nullable efd $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != efb.d && $$2.l != efb.d && $$3.l != efb.d) {
         boolean $$4 = $$2.l == efb.h && $$1.l == efb.h && (double)this.b.dg() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(efb $$0) {
      return $$0 == efb.h || $$0 == efb.s || $$0 == efb.t;
   }

   private boolean b(efd $$0) {
      eln $$1 = this.b.cH();
      els $$2 = new els((double)$$0.a - this.b.dr() + $$1.b() / 2.0, (double)$$0.b - this.b.dt() + $$1.c() / 2.0, (double)$$0.c - this.b.dx() + $$1.d() / 2.0);
      int $$3 = aun.c($$2.f() / $$1.a());
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
      return (this.f() || this.c()) && this.a.b_($$0).a(asl.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(csu $$0, hx $$1) {
      hx $$2 = $$1.d();
      eml $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ic.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected efd a(int $$0, int $$1, int $$2, int $$3, double $$4, ic $$5, efb $$6) {
      efd $$7 = null;
      hx.a $$8 = new hx.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         efb $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.dg() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != efb.c && (!this.c() || $$10 != efb.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != efb.h || this.g()) && $$10 != efb.m && $$10 != efb.e && $$10 != efb.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == efb.b || $$7.l == efb.c) && this.b.dg() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  eln $$15 = new eln(
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

            if (!this.c() && $$10 == efb.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != efb.j) {
                  return $$7;
               }

               while ($$1 > this.b.dM().J_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != efb.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == efb.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == efb.b) {
                  if (--$$1 < this.b.dM().J_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.cu()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != efb.b && $$11 >= 0.0F) {
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

   private efd a(int $$0, int $$1, int $$2, efb $$3, float $$4) {
      efd $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private efd a(int $$0, int $$1, int $$2) {
      efd $$3 = this.b($$0, $$1, $$2);
      $$3.l = efb.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(eln $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public efb a(csu $$0, int $$1, int $$2, int $$3, bmm $$4) {
      EnumSet<efb> $$5 = EnumSet.noneOf(efb.class);
      efb $$6 = efb.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dm());
      if ($$5.contains(efb.h)) {
         return efb.h;
      } else if ($$5.contains(efb.m)) {
         return efb.m;
      } else {
         efb $$7 = efb.a;

         for (efb $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == efb.b && $$4.a($$7) == 0.0F && this.d <= 1 ? efb.b : $$7;
      }
   }

   public efb a(csu $$0, int $$1, int $$2, int $$3, EnumSet<efb> $$4, efb $$5, hx $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               efb $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected efb a(csu $$0, hx $$1, efb $$2) {
      boolean $$3 = this.d();
      if ($$2 == efb.s && this.e() && $$3) {
         $$2 = efb.d;
      }

      if ($$2 == efb.r && !$$3) {
         $$2 = efb.a;
      }

      if ($$2 == efb.l && !($$0.a_($$1).b() instanceof cwe) && !($$0.a_($$1.d()).b() instanceof cwe)) {
         $$2 = efb.m;
      }

      return $$2;
   }

   protected efb a(bmm $$0, hx $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected efb a(bmm $$0, int $$1, int $$2, int $$3) {
      return (efb)this.m.computeIfAbsent(hx.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public efb a(csu $$0, int $$1, int $$2, int $$3) {
      return a($$0, new hx.a($$1, $$2, $$3));
   }

   public static efb a(csu $$0, hx.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      efb $$5 = b($$0, $$1);
      if ($$5 == efb.b && $$3 >= $$0.J_() + 1) {
         return switch (b($$0, $$1.d($$2, $$3 - 1, $$4))) {
            case b, j, i, c -> efb.b;
            case o -> efb.o;
            case q -> efb.q;
            case w -> efb.w;
            case f -> efb.g;
            case y -> efb.y;
            case e -> efb.z;
            default -> a($$0, $$1.d($$2, $$3, $$4), efb.c);
         };
      } else {
         return $$5;
      }
   }

   public static efb a(csu $$0, hx.a $$1, efb $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  djg $$9 = $$0.a_($$1);
                  if ($$9.a(cwr.dQ) || $$9.a(cwr.oi)) {
                     return efb.p;
                  }

                  if (a($$9)) {
                     return efb.n;
                  }

                  if ($$0.b_($$1).a(asl.a)) {
                     return efb.k;
                  }

                  if ($$9.a(cwr.cd) || $$9.a(cwr.st)) {
                     return efb.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static efb b(csu $$0, hx $$1) {
      djg $$2 = $$0.a_($$1);
      cwp $$3 = $$2.b();
      if ($$2.i()) {
         return efb.b;
      } else if ($$2.a(asg.P) || $$2.a(cwr.fm) || $$2.a(cwr.sD)) {
         return efb.e;
      } else if ($$2.a(cwr.qP)) {
         return efb.f;
      } else if ($$2.a(cwr.dQ) || $$2.a(cwr.oi)) {
         return efb.q;
      } else if ($$2.a(cwr.pg)) {
         return efb.w;
      } else if ($$2.a(cwr.fC)) {
         return efb.x;
      } else if (!$$2.a(cwr.cd) && !$$2.a(cwr.st)) {
         eeq $$4 = $$0.b_($$1);
         if ($$4.a(asl.b)) {
            return efb.i;
         } else if (a($$2)) {
            return efb.o;
         } else if ($$3 instanceof cyv $$5) {
            if ($$2.c(cyv.c)) {
               return efb.r;
            } else {
               return $$5.b().c() ? efb.s : efb.t;
            }
         } else if ($$3 instanceof cwe) {
            return efb.l;
         } else if ($$3 instanceof day) {
            return efb.v;
         } else if (!$$2.a(asg.S) && !$$2.a(asg.L) && (!($$3 instanceof czo) || $$2.c(czo.b))) {
            if (!$$2.a($$0, $$1, efg.a)) {
               return efb.a;
            } else {
               return $$4.a(asl.a) ? efb.j : efb.b;
            }
         } else {
            return efb.h;
         }
      } else {
         return efb.y;
      }
   }

   public static boolean a(djg $$0) {
      return $$0.a(asg.aJ) || $$0.a(cwr.H) || $$0.a(cwr.kJ) || cxd.g($$0) || $$0.a(cwr.fv);
   }
}

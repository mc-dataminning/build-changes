import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class ebb extends eav {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<eas> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ehd> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(cqd $$0, bjd $$1) {
      super.a($$0, $$1);
      $$1.z();
   }

   @Override
   public void b() {
      this.b.A();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public eau a() {
      gw.a $$0 = new gw.a();
      int $$1 = this.b.dq();
      dfe $$2 = this.a.a_($$0.b(this.b.dp(), (double)$$1, this.b.dv()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aX()) {
            while (true) {
               if (!$$2.a(csr.G) && $$2.u() != eai.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dp(), (double)(++$$1), this.b.dv()));
            }
         } else if (this.b.aA()) {
            $$1 = ars.a(this.b.dr() + 0.5);
         } else {
            gw $$3 = this.b.dk();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, eax.a)) && $$3.v() > this.b.dK().C_()) {
               $$3 = $$3.d();
            }

            $$1 = $$3.c().v();
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a_($$0.b(this.b.dp(), (double)(++$$1), this.b.dv()));
         }

         $$1--;
      }

      gw $$4 = this.b.dk();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ehd $$5 = this.b.cG();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new gw($$4.u(), $$1, $$4.w()));
   }

   protected eau c(gw $$0) {
      eau $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(gw $$0) {
      eas $$1 = this.a(this.b, $$0);
      return $$1 != eas.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public eba a(double $$0, double $$1, double $$2) {
      return this.a(this.b(ars.a($$0), ars.a($$1), ars.a($$2)));
   }

   @Override
   public int a(eau[] $$0, eau $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eas $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eas $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != eas.w) {
         $$3 = ars.d(Math.max(1.0F, this.b.dE()));
      }

      double $$6 = this.d(new gw($$1.a, $$1.b, $$1.c));
      eau $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, hc.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      eau $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, hc.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      eau $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, hc.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      eau $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, hc.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      eau $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, hc.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      eau $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, hc.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      eau $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, hc.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      eau $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, hc.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable eau $$0, eau $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eau $$0, @Nullable eau $$1, @Nullable eau $$2, @Nullable eau $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eas.d && $$2.l != eas.d && $$3.l != eas.d) {
         boolean $$4 = $$2.l == eas.h && $$1.l == eas.h && (double)this.b.df() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(eas $$0) {
      return $$0 == eas.h || $$0 == eas.s || $$0 == eas.t;
   }

   private boolean b(eau $$0) {
      ehd $$1 = this.b.cG();
      ehi $$2 = new ehi((double)$$0.a - this.b.dp() + $$1.b() / 2.0, (double)$$0.b - this.b.dr() + $$1.c() / 2.0, (double)$$0.c - this.b.dv() + $$1.d() / 2.0);
      int $$3 = ars.c($$2.f() / $$1.a());
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
      return (this.f() || this.c()) && this.a.b_($$0).a(apt.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(cow $$0, gw $$1) {
      gw $$2 = $$1.d();
      eib $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(hc.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eau a(int $$0, int $$1, int $$2, int $$3, double $$4, hc $$5, eas $$6) {
      eau $$7 = null;
      gw.a $$8 = new gw.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eas $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.df() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eas.c && (!this.c() || $$10 != eas.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eas.h || this.g()) && $$10 != eas.m && $$10 != eas.e && $$10 != eas.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == eas.b || $$7.l == eas.c) && this.b.df() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  ehd $$15 = new ehd(
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

            if (!this.c() && $$10 == eas.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != eas.j) {
                  return $$7;
               }

               while ($$1 > this.b.dK().C_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != eas.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == eas.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == eas.b) {
                  if (--$$1 < this.b.dK().C_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.ct()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != eas.b && $$11 >= 0.0F) {
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
      return Math.max(1.125, (double)this.b.dE());
   }

   private eau a(int $$0, int $$1, int $$2, eas $$3, float $$4) {
      eau $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eau a(int $$0, int $$1, int $$2) {
      eau $$3 = this.b($$0, $$1, $$2);
      $$3.l = eas.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(ehd $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public eas a(cow $$0, int $$1, int $$2, int $$3, bjd $$4) {
      EnumSet<eas> $$5 = EnumSet.noneOf(eas.class);
      eas $$6 = eas.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dk());
      if ($$5.contains(eas.h)) {
         return eas.h;
      } else if ($$5.contains(eas.m)) {
         return eas.m;
      } else {
         eas $$7 = eas.a;

         for (eas $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == eas.b && $$4.a($$7) == 0.0F && this.d <= 1 ? eas.b : $$7;
      }
   }

   public eas a(cow $$0, int $$1, int $$2, int $$3, EnumSet<eas> $$4, eas $$5, gw $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               eas $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected eas a(cow $$0, gw $$1, eas $$2) {
      boolean $$3 = this.d();
      if ($$2 == eas.s && this.e() && $$3) {
         $$2 = eas.d;
      }

      if ($$2 == eas.r && !$$3) {
         $$2 = eas.a;
      }

      if ($$2 == eas.l && !($$0.a_($$1).b() instanceof csg) && !($$0.a_($$1.d()).b() instanceof csg)) {
         $$2 = eas.m;
      }

      return $$2;
   }

   protected eas a(bjd $$0, gw $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected eas a(bjd $$0, int $$1, int $$2, int $$3) {
      return (eas)this.m.computeIfAbsent(gw.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public eas a(cow $$0, int $$1, int $$2, int $$3) {
      return a($$0, new gw.a($$1, $$2, $$3));
   }

   public static eas a(cow $$0, gw.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eas $$5 = b($$0, $$1);
      if ($$5 == eas.b && $$3 >= $$0.C_() + 1) {
         eas $$6 = b($$0, $$1.d($$2, $$3 - 1, $$4));
         $$5 = $$6 != eas.c && $$6 != eas.b && $$6 != eas.j && $$6 != eas.i ? eas.c : eas.b;
         if ($$6 == eas.o) {
            $$5 = eas.o;
         }

         if ($$6 == eas.q) {
            $$5 = eas.q;
         }

         if ($$6 == eas.w) {
            $$5 = eas.w;
         }

         if ($$6 == eas.f) {
            $$5 = eas.g;
         }

         if ($$6 == eas.y) {
            $$5 = eas.y;
         }
      }

      if ($$5 == eas.c) {
         $$5 = a($$0, $$1.d($$2, $$3, $$4), $$5);
      }

      return $$5;
   }

   public static eas a(cow $$0, gw.a $$1, eas $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dfe $$9 = $$0.a_($$1);
                  if ($$9.a(csr.dQ) || $$9.a(csr.oi)) {
                     return eas.p;
                  }

                  if (a($$9)) {
                     return eas.n;
                  }

                  if ($$0.b_($$1).a(apt.a)) {
                     return eas.k;
                  }

                  if ($$9.a(csr.cd) || $$9.a(csr.rs)) {
                     return eas.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static eas b(cow $$0, gw $$1) {
      dfe $$2 = $$0.a_($$1);
      csq $$3 = $$2.b();
      if ($$2.i()) {
         return eas.b;
      } else if ($$2.a(apo.P) || $$2.a(csr.fm) || $$2.a(csr.rC)) {
         return eas.e;
      } else if ($$2.a(csr.qC)) {
         return eas.f;
      } else if ($$2.a(csr.dQ) || $$2.a(csr.oi)) {
         return eas.q;
      } else if ($$2.a(csr.pg)) {
         return eas.w;
      } else if ($$2.a(csr.fC)) {
         return eas.x;
      } else if (!$$2.a(csr.cd) && !$$2.a(csr.rs)) {
         eah $$4 = $$0.b_($$1);
         if ($$4.a(apt.b)) {
            return eas.i;
         } else if (a($$2)) {
            return eas.o;
         } else if ($$3 instanceof cus $$5) {
            if ($$2.c(cus.b)) {
               return eas.r;
            } else {
               return $$5.a().c() ? eas.s : eas.t;
            }
         } else if ($$3 instanceof csg) {
            return eas.l;
         } else if ($$3 instanceof cwx) {
            return eas.v;
         } else if (!$$2.a(apo.S) && !$$2.a(apo.L) && (!($$3 instanceof cvl) || $$2.c(cvl.a))) {
            if (!$$2.a($$0, $$1, eax.a)) {
               return eas.a;
            } else {
               return $$4.a(apt.a) ? eas.j : eas.b;
            }
         } else {
            return eas.h;
         }
      } else {
         return eas.y;
      }
   }

   public static boolean a(dfe $$0) {
      return $$0.a(apo.aJ) || $$0.a(csr.H) || $$0.a(csr.kJ) || ctd.g($$0) || $$0.a(csr.fv);
   }
}

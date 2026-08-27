import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class dxy extends dxs {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<dxp> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<eed> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(cmz $$0, bgb $$1) {
      super.a($$0, $$1);
      $$1.A();
   }

   @Override
   public void b() {
      this.b.C();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public dxr a() {
      gu.a $$0 = new gu.a();
      int $$1 = this.b.do();
      dcb $$2 = this.a.a_($$0.b(this.b.dn(), (double)$$1, this.b.dt()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aV()) {
            while (true) {
               if (!$$2.a(cpo.G) && $$2.u() != dxf.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dn(), (double)(++$$1), this.b.dt()));
            }
         } else if (this.b.ay()) {
            $$1 = apa.a(this.b.dp() + 0.5);
         } else {
            gu $$3 = this.b.di();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, dxu.a)) && $$3.v() > this.b.dI().C_()) {
               $$3 = $$3.d();
            }

            $$1 = $$3.c().v();
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a_($$0.b(this.b.dn(), (double)(++$$1), this.b.dt()));
         }

         $$1--;
      }

      gu $$4 = this.b.di();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         eed $$5 = this.b.cE();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new gu($$4.u(), $$1, $$4.w()));
   }

   protected dxr c(gu $$0) {
      dxr $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(gu $$0) {
      dxp $$1 = this.a(this.b, $$0);
      return $$1 != dxp.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public dxx a(double $$0, double $$1, double $$2) {
      return this.a(this.b(apa.a($$0), apa.a($$1), apa.a($$2)));
   }

   @Override
   public int a(dxr[] $$0, dxr $$1) {
      int $$2 = 0;
      int $$3 = 0;
      dxp $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      dxp $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != dxp.w) {
         $$3 = apa.d(Math.max(1.0F, this.b.dC()));
      }

      double $$6 = this.d(new gu($$1.a, $$1.b, $$1.c));
      dxr $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, ha.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      dxr $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, ha.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      dxr $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, ha.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      dxr $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, ha.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      dxr $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, ha.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      dxr $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, ha.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      dxr $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, ha.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      dxr $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, ha.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable dxr $$0, dxr $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(dxr $$0, @Nullable dxr $$1, @Nullable dxr $$2, @Nullable dxr $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != dxp.d && $$2.l != dxp.d && $$3.l != dxp.d) {
         boolean $$4 = $$2.l == dxp.h && $$1.l == dxp.h && (double)this.b.dd() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(dxp $$0) {
      return $$0 == dxp.h || $$0 == dxp.s || $$0 == dxp.t;
   }

   private boolean b(dxr $$0) {
      eed $$1 = this.b.cE();
      eei $$2 = new eei((double)$$0.a - this.b.dn() + $$1.b() / 2.0, (double)$$0.b - this.b.dp() + $$1.c() / 2.0, (double)$$0.c - this.b.dt() + $$1.d() / 2.0);
      int $$3 = apa.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(gu $$0) {
      return (this.f() || this.c()) && this.a.b_($$0).a(anb.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(cls $$0, gu $$1) {
      gu $$2 = $$1.d();
      efb $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.b() ? 0.0 : $$3.c(ha.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected dxr a(int $$0, int $$1, int $$2, int $$3, double $$4, ha $$5, dxp $$6) {
      dxr $$7 = null;
      gu.a $$8 = new gu.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         dxp $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.dd() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != dxp.c && (!this.c() || $$10 != dxp.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != dxp.h || this.g()) && $$10 != dxp.m && $$10 != dxp.e && $$10 != dxp.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == dxp.b || $$7.l == dxp.c) && this.b.dd() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  eed $$15 = new eed(
                     $$13 - $$12,
                     this.d($$8.b($$13, (double)($$1 + 1), $$14)) + 0.001,
                     $$14 - $$12,
                     $$13 + $$12,
                     (double)this.b.de() + this.d($$8.b((double)$$7.a, (double)$$7.b, (double)$$7.c)) - 0.002,
                     $$14 + $$12
                  );
                  if (this.a($$15)) {
                     $$7 = null;
                  }
               }
            }

            if (!this.c() && $$10 == dxp.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != dxp.j) {
                  return $$7;
               }

               while ($$1 > this.b.dI().C_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != dxp.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == dxp.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == dxp.b) {
                  if (--$$1 < this.b.dI().C_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.cr()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != dxp.b && $$11 >= 0.0F) {
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
      return Math.max(1.125, (double)this.b.dC());
   }

   private dxr a(int $$0, int $$1, int $$2, dxp $$3, float $$4) {
      dxr $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private dxr a(int $$0, int $$1, int $$2) {
      dxr $$3 = this.b($$0, $$1, $$2);
      $$3.l = dxp.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(eed $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public dxp a(cls $$0, int $$1, int $$2, int $$3, bgb $$4) {
      EnumSet<dxp> $$5 = EnumSet.noneOf(dxp.class);
      dxp $$6 = dxp.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.di());
      if ($$5.contains(dxp.h)) {
         return dxp.h;
      } else if ($$5.contains(dxp.m)) {
         return dxp.m;
      } else {
         dxp $$7 = dxp.a;

         for (dxp $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == dxp.b && $$4.a($$7) == 0.0F && this.d <= 1 ? dxp.b : $$7;
      }
   }

   public dxp a(cls $$0, int $$1, int $$2, int $$3, EnumSet<dxp> $$4, dxp $$5, gu $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               dxp $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected dxp a(cls $$0, gu $$1, dxp $$2) {
      boolean $$3 = this.d();
      if ($$2 == dxp.s && this.e() && $$3) {
         $$2 = dxp.d;
      }

      if ($$2 == dxp.r && !$$3) {
         $$2 = dxp.a;
      }

      if ($$2 == dxp.l && !($$0.a_($$1).b() instanceof cpd) && !($$0.a_($$1.d()).b() instanceof cpd)) {
         $$2 = dxp.m;
      }

      return $$2;
   }

   protected dxp a(bgb $$0, gu $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected dxp a(bgb $$0, int $$1, int $$2, int $$3) {
      return (dxp)this.m.computeIfAbsent(gu.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public dxp a(cls $$0, int $$1, int $$2, int $$3) {
      return a($$0, new gu.a($$1, $$2, $$3));
   }

   public static dxp a(cls $$0, gu.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      dxp $$5 = b($$0, $$1);
      if ($$5 == dxp.b && $$3 >= $$0.C_() + 1) {
         dxp $$6 = b($$0, $$1.d($$2, $$3 - 1, $$4));
         $$5 = $$6 != dxp.c && $$6 != dxp.b && $$6 != dxp.j && $$6 != dxp.i ? dxp.c : dxp.b;
         if ($$6 == dxp.o) {
            $$5 = dxp.o;
         }

         if ($$6 == dxp.q) {
            $$5 = dxp.q;
         }

         if ($$6 == dxp.w) {
            $$5 = dxp.w;
         }

         if ($$6 == dxp.f) {
            $$5 = dxp.g;
         }

         if ($$6 == dxp.y) {
            $$5 = dxp.y;
         }
      }

      if ($$5 == dxp.c) {
         $$5 = a($$0, $$1.d($$2, $$3, $$4), $$5);
      }

      return $$5;
   }

   public static dxp a(cls $$0, gu.a $$1, dxp $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dcb $$9 = $$0.a_($$1);
                  if ($$9.a(cpo.dQ) || $$9.a(cpo.oi)) {
                     return dxp.p;
                  }

                  if (a($$9)) {
                     return dxp.n;
                  }

                  if ($$0.b_($$1).a(anb.a)) {
                     return dxp.k;
                  }

                  if ($$9.a(cpo.cd) || $$9.a(cpo.rs)) {
                     return dxp.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static dxp b(cls $$0, gu $$1) {
      dcb $$2 = $$0.a_($$1);
      cpn $$3 = $$2.b();
      if ($$2.i()) {
         return dxp.b;
      } else if ($$2.a(amw.P) || $$2.a(cpo.fm) || $$2.a(cpo.rC)) {
         return dxp.e;
      } else if ($$2.a(cpo.qC)) {
         return dxp.f;
      } else if ($$2.a(cpo.dQ) || $$2.a(cpo.oi)) {
         return dxp.q;
      } else if ($$2.a(cpo.pg)) {
         return dxp.w;
      } else if ($$2.a(cpo.fC)) {
         return dxp.x;
      } else if (!$$2.a(cpo.cd) && !$$2.a(cpo.rs)) {
         dxe $$4 = $$0.b_($$1);
         if ($$4.a(anb.b)) {
            return dxp.i;
         } else if (a($$2)) {
            return dxp.o;
         } else if ($$3 instanceof crp $$5) {
            if ($$2.c(crp.b)) {
               return dxp.r;
            } else {
               return $$5.a().c() ? dxp.s : dxp.t;
            }
         } else if ($$3 instanceof cpd) {
            return dxp.l;
         } else if ($$3 instanceof ctu) {
            return dxp.v;
         } else if (!$$2.a(amw.S) && !$$2.a(amw.L) && (!($$3 instanceof csi) || $$2.c(csi.a))) {
            if (!$$2.a($$0, $$1, dxu.a)) {
               return dxp.a;
            } else {
               return $$4.a(anb.a) ? dxp.j : dxp.b;
            }
         } else {
            return dxp.h;
         }
      } else {
         return dxp.y;
      }
   }

   public static boolean a(dcb $$0) {
      return $$0.a(amw.aI) || $$0.a(cpo.H) || $$0.a(cpo.kJ) || cqa.g($$0) || $$0.a(cpo.fv);
   }
}

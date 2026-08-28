import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class exc extends ewt {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<ewx> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<fed> n = new Object2BooleanOpenHashMap();
   private final ews[] o = new ews[ja.c.a.b()];

   @Override
   public void a(dji $$0, bxe $$1) {
      super.a($$0, $$1);
      $$1.G();
   }

   @Override
   public void b() {
      this.c.H();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public ews a() {
      iu.a $$0 = new iu.a();
      int $$1 = this.c.dB();
      dzz $$2 = this.b.a($$0.b(this.c.dA(), (double)$$1, this.c.dG()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bj()) {
            while (true) {
               if (!$$2.a(dmc.J) && $$2.y() != ewh.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.b.a($$0.b(this.c.dA(), (double)(++$$1), this.c.dG()));
            }
         } else if (this.c.aJ()) {
            $$1 = azm.a(this.c.dC() + 0.5);
         } else {
            $$0.b(this.c.dA(), this.c.dC() + 1.0, this.c.dG());

            while ($$0.v() > this.b.a().G_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dzz $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(ewv.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.c.a($$2.y())) {
            $$2 = this.b.a($$0.b(this.c.dA(), (double)(++$$1), this.c.dG()));
         }

         $$1--;
      }

      iu $$4 = this.c.dv();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         fed $$5 = this.c.cR();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new iu($$4.u(), $$1, $$4.w()));
   }

   protected ews c(iu $$0) {
      ews $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(iu $$0) {
      ewx $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != ewx.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public exb a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(ews[] $$0, ews $$1) {
      int $$2 = 0;
      int $$3 = 0;
      ewx $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      ewx $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != ewx.w) {
         $$3 = azm.d(Math.max(1.0F, this.c.dP()));
      }

      double $$6 = this.d(new iu($$1.a, $$1.b, $$1.c));

      for (ja $$7 : ja.c.a) {
         ews $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (ja $$9 : ja.c.a) {
         ja $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            ews $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable ews $$0, ews $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(ews $$0, @Nullable ews $$1, @Nullable ews $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != ewx.d && $$2.l != ewx.d) {
         boolean $$3 = $$2.l == ewx.h && $$1.l == ewx.h && (double)this.c.dq() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable ews $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == ewx.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(ewx $$0) {
      return $$0 == ewx.h || $$0 == ewx.s || $$0 == ewx.t;
   }

   private boolean b(ews $$0) {
      fed $$1 = this.c.cR();
      fei $$2 = new fei((double)$$0.a - this.c.dA() + $$1.b() / 2.0, (double)$$0.b - this.c.dC() + $$1.c() / 2.0, (double)$$0.c - this.c.dG() + $$1.d() / 2.0);
      int $$3 = azm.c($$2.g() / $$1.a());
      $$2 = $$2.c((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(iu $$0) {
      dib $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(axh.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dib $$0, iu $$1) {
      iu $$2 = $$1.e();
      ffc $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ja.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected ews a(int $$0, int $$1, int $$2, int $$3, double $$4, ja $$5, ewx $$6) {
      ews $$7 = null;
      iu.a $$8 = new iu.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         ewx $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != ewx.c && (!this.c() || $$10 != ewx.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != ewx.h || this.g()) && $$10 != ewx.m && $$10 != ewx.e && $$10 != ewx.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == ewx.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == ewx.b) {
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
      return Math.max(1.125, (double)this.c.dP());
   }

   private ews a(int $$0, int $$1, int $$2, ewx $$3, float $$4) {
      ews $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private ews a(int $$0, int $$1, int $$2) {
      ews $$3 = this.c($$0, $$1, $$2);
      $$3.l = ewx.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private ews a(int $$0, int $$1, int $$2, ewx $$3) {
      ews $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private ews a(int $$0, int $$1, int $$2, int $$3, double $$4, ja $$5, ewx $$6, iu.a $$7) {
      ews $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.dq() >= 1.0F) {
         return $$8;
      } else if ($$8.l != ewx.b && $$8.l != ewx.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.c.dq() / 2.0;
         fed $$12 = new fed(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.c.dr() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private ews a(int $$0, int $$1, int $$2, @Nullable ews $$3) {
      $$1--;

      while ($$1 > this.c.dV().G_()) {
         ewx $$4 = this.b($$0, $$1, $$2);
         if ($$4 != ewx.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private ews d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.dV().G_(); $$3--) {
         if ($$1 - $$3 > this.c.cE()) {
            return this.a($$0, $$3, $$2);
         }

         ewx $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != ewx.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(fed $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected ewx b(int $$0, int $$1, int $$2) {
      return (ewx)this.m.computeIfAbsent(iu.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public ewx a(ewz $$0, int $$1, int $$2, int $$3, bxe $$4) {
      Set<ewx> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(ewx.h)) {
         return ewx.h;
      } else if ($$5.contains(ewx.m)) {
         return ewx.m;
      } else {
         ewx $$6 = ewx.a;

         for (ewx $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != ewx.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == ewx.b ? ewx.b : $$6;
      }
   }

   public Set<ewx> b(ewz $$0, int $$1, int $$2, int $$3) {
      EnumSet<ewx> $$4 = EnumSet.noneOf(ewx.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               ewx $$11 = this.a($$0, $$8, $$9, $$10);
               iu $$12 = this.c.dv();
               boolean $$13 = this.d();
               if ($$11 == ewx.s && this.e() && $$13) {
                  $$11 = ewx.d;
               }

               if ($$11 == ewx.r && !$$13) {
                  $$11 = ewx.a;
               }

               if ($$11 == ewx.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != ewx.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != ewx.l) {
                  $$11 = ewx.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public ewx a(ewz $$0, int $$1, int $$2, int $$3) {
      return a($$0, new iu.a($$1, $$2, $$3));
   }

   public static ewx b(bxe $$0, iu $$1) {
      return a(new ewz($$0.dV(), $$0), $$1.k());
   }

   public static ewx a(ewz $$0, iu.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      ewx $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == ewx.b && $$3 >= $$0.a().G_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> ewx.b;
            case o -> ewx.o;
            case q -> ewx.q;
            case w -> ewx.w;
            case f -> ewx.g;
            case y -> ewx.y;
            case e -> ewx.z;
            default -> a($$0, $$2, $$3, $$4, ewx.c);
         };
      } else {
         return $$5;
      }
   }

   public static ewx a(ewz $$0, int $$1, int $$2, int $$3, ewx $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  ewx $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == ewx.q) {
                     return ewx.p;
                  }

                  if ($$8 == ewx.o || $$8 == ewx.i) {
                     return ewx.n;
                  }

                  if ($$8 == ewx.j) {
                     return ewx.k;
                  }

                  if ($$8 == ewx.y) {
                     return ewx.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static ewx b(dib $$0, iu $$1) {
      dzz $$2 = $$0.a_($$1);
      dma $$3 = $$2.b();
      if ($$2.l()) {
         return ewx.b;
      } else if ($$2.a(axc.R) || $$2.a(dmc.fC) || $$2.a(dmc.tk)) {
         return ewx.e;
      } else if ($$2.a(dmc.ru)) {
         return ewx.f;
      } else if ($$2.a(dmc.ee) || $$2.a(dmc.oL)) {
         return ewx.q;
      } else if ($$2.a(dmc.pL)) {
         return ewx.w;
      } else if ($$2.a(dmc.fY)) {
         return ewx.x;
      } else if (!$$2.a(dmc.cl) && !$$2.a(dmc.sY)) {
         ewg $$4 = $$2.y();
         if ($$4.a(axh.b)) {
            return ewx.i;
         } else if (a($$2)) {
            return ewx.o;
         } else if ($$3 instanceof doh $$5) {
            if ($$2.c(doh.e)) {
               return ewx.r;
            } else {
               return $$5.b().c() ? ewx.s : ewx.t;
            }
         } else if ($$3 instanceof dlp) {
            return ewx.l;
         } else if ($$3 instanceof dqp) {
            return ewx.v;
         } else if (!$$2.a(axc.U) && !$$2.a(axc.N) && (!($$3 instanceof dpa) || $$2.c(dpa.b))) {
            if (!$$2.a(ewv.a)) {
               return ewx.a;
            } else {
               return $$4.a(axh.a) ? ewx.j : ewx.b;
            }
         } else {
            return ewx.h;
         }
      } else {
         return ewx.y;
      }
   }
}

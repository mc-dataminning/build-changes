import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class enq extends enh {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<enl> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<euf> n = new Object2BooleanOpenHashMap();
   private final eng[] o = new eng[it.c.a.b()];

   @Override
   public void a(dbk $$0, bsq $$1) {
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
   public eng a() {
      io.a $$0 = new io.a();
      int $$1 = this.b.dv();
      drb $$2 = this.a.a($$0.b(this.b.du(), (double)$$1, this.b.dA()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.be()) {
            while (true) {
               if (!$$2.a(dea.G) && $$2.u() != emv.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.du(), (double)(++$$1), this.b.dA()));
            }
         } else if (this.b.aE()) {
            $$1 = ayd.a(this.b.dw() + 0.5);
         } else {
            $$0.b(this.b.du(), this.b.dw() + 1.0, this.b.dA());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               drb $$3 = this.a.a($$0);
               if (!$$3.i() && !$$3.a(enj.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a($$0.b(this.b.du(), (double)(++$$1), this.b.dA()));
         }

         $$1--;
      }

      io $$4 = this.b.dp();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         euf $$5 = this.b.cK();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new io($$4.u(), $$1, $$4.w()));
   }

   protected eng c(io $$0) {
      eng $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(io $$0) {
      enl $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != enl.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public enp a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eng[] $$0, eng $$1) {
      int $$2 = 0;
      int $$3 = 0;
      enl $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      enl $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != enl.w) {
         $$3 = ayd.d(Math.max(1.0F, this.b.dJ()));
      }

      double $$6 = this.d(new io($$1.a, $$1.b, $$1.c));

      for (it $$7 : it.c.a) {
         eng $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (it $$9 : it.c.a) {
         it $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            eng $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eng $$0, eng $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eng $$0, @Nullable eng $$1, @Nullable eng $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != enl.d && $$2.l != enl.d) {
         boolean $$3 = $$2.l == enl.h && $$1.l == enl.h && (double)this.b.dj() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable eng $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == enl.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(enl $$0) {
      return $$0 == enl.h || $$0 == enl.s || $$0 == enl.t;
   }

   private boolean b(eng $$0) {
      euf $$1 = this.b.cK();
      euk $$2 = new euk((double)$$0.a - this.b.du() + $$1.b() / 2.0, (double)$$0.b - this.b.dw() + $$1.c() / 2.0, (double)$$0.c - this.b.dA() + $$1.d() / 2.0);
      int $$3 = ayd.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(io $$0) {
      dad $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(awb.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dad $$0, io $$1) {
      io $$2 = $$1.d();
      evd $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(it.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eng a(int $$0, int $$1, int $$2, int $$3, double $$4, it $$5, enl $$6) {
      eng $$7 = null;
      io.a $$8 = new io.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         enl $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != enl.c && (!this.c() || $$10 != enl.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != enl.h || this.g()) && $$10 != enl.m && $$10 != enl.e && $$10 != enl.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == enl.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == enl.b) {
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
      return Math.max(1.125, (double)this.b.dJ());
   }

   private eng a(int $$0, int $$1, int $$2, enl $$3, float $$4) {
      eng $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eng a(int $$0, int $$1, int $$2) {
      eng $$3 = this.c($$0, $$1, $$2);
      $$3.l = enl.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private eng a(int $$0, int $$1, int $$2, enl $$3) {
      eng $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private eng a(int $$0, int $$1, int $$2, int $$3, double $$4, it $$5, enl $$6, io.a $$7) {
      eng $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dj() >= 1.0F) {
         return $$8;
      } else if ($$8.l != enl.b && $$8.l != enl.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dj() / 2.0;
         euf $$12 = new euf(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.dk() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private eng a(int $$0, int $$1, int $$2, @Nullable eng $$3) {
      $$1--;

      while ($$1 > this.b.dP().I_()) {
         enl $$4 = this.b($$0, $$1, $$2);
         if ($$4 != enl.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private eng d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dP().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cx()) {
            return this.a($$0, $$3, $$2);
         }

         enl $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != enl.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(euf $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected enl b(int $$0, int $$1, int $$2) {
      return (enl)this.m.computeIfAbsent(io.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public enl a(enn $$0, int $$1, int $$2, int $$3, bsq $$4) {
      Set<enl> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(enl.h)) {
         return enl.h;
      } else if ($$5.contains(enl.m)) {
         return enl.m;
      } else {
         enl $$6 = enl.a;

         for (enl $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != enl.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == enl.b ? enl.b : $$6;
      }
   }

   public Set<enl> b(enn $$0, int $$1, int $$2, int $$3) {
      EnumSet<enl> $$4 = EnumSet.noneOf(enl.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               enl $$11 = this.a($$0, $$8, $$9, $$10);
               io $$12 = this.b.dp();
               boolean $$13 = this.d();
               if ($$11 == enl.s && this.e() && $$13) {
                  $$11 = enl.d;
               }

               if ($$11 == enl.r && !$$13) {
                  $$11 = enl.a;
               }

               if ($$11 == enl.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != enl.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != enl.l) {
                  $$11 = enl.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public enl a(enn $$0, int $$1, int $$2, int $$3) {
      return a($$0, new io.a($$1, $$2, $$3));
   }

   public static enl b(bsq $$0, io $$1) {
      return a(new enn($$0.dP(), $$0), $$1.j());
   }

   public static enl a(enn $$0, io.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      enl $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == enl.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> enl.b;
            case o -> enl.o;
            case q -> enl.q;
            case w -> enl.w;
            case f -> enl.g;
            case y -> enl.y;
            case e -> enl.z;
            default -> a($$0, $$2, $$3, $$4, enl.c);
         };
      } else {
         return $$5;
      }
   }

   public static enl a(enn $$0, int $$1, int $$2, int $$3, enl $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  enl $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == enl.q) {
                     return enl.p;
                  }

                  if ($$8 == enl.o || $$8 == enl.i) {
                     return enl.n;
                  }

                  if ($$8 == enl.j) {
                     return enl.k;
                  }

                  if ($$8 == enl.y) {
                     return enl.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static enl b(dad $$0, io $$1) {
      drb $$2 = $$0.a_($$1);
      ddy $$3 = $$2.b();
      if ($$2.i()) {
         return enl.b;
      } else if ($$2.a(avw.P) || $$2.a(dea.fm) || $$2.a(dea.sD)) {
         return enl.e;
      } else if ($$2.a(dea.qP)) {
         return enl.f;
      } else if ($$2.a(dea.dQ) || $$2.a(dea.oi)) {
         return enl.q;
      } else if ($$2.a(dea.pg)) {
         return enl.w;
      } else if ($$2.a(dea.fC)) {
         return enl.x;
      } else if (!$$2.a(dea.cd) && !$$2.a(dea.st)) {
         emu $$4 = $$2.u();
         if ($$4.a(awb.b)) {
            return enl.i;
         } else if (a($$2)) {
            return enl.o;
         } else if ($$3 instanceof dge $$5) {
            if ($$2.c(dge.c)) {
               return enl.r;
            } else {
               return $$5.b().c() ? enl.s : enl.t;
            }
         } else if ($$3 instanceof ddn) {
            return enl.l;
         } else if ($$3 instanceof dii) {
            return enl.v;
         } else if (!$$2.a(avw.S) && !$$2.a(avw.L) && (!($$3 instanceof dgx) || $$2.c(dgx.b))) {
            if (!$$2.a(enj.a)) {
               return enl.a;
            } else {
               return $$4.a(awb.a) ? enl.j : enl.b;
            }
         } else {
            return enl.h;
         }
      } else {
         return enl.y;
      }
   }
}

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ens extends enj {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<enn> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<euh> n = new Object2BooleanOpenHashMap();
   private final eni[] o = new eni[it.c.a.b()];

   @Override
   public void a(dbm $$0, bss $$1) {
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
   public eni a() {
      io.a $$0 = new io.a();
      int $$1 = this.b.dv();
      drd $$2 = this.a.a($$0.b(this.b.du(), (double)$$1, this.b.dA()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.be()) {
            while (true) {
               if (!$$2.a(dec.G) && $$2.u() != emx.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.du(), (double)(++$$1), this.b.dA()));
            }
         } else if (this.b.aE()) {
            $$1 = ayf.a(this.b.dw() + 0.5);
         } else {
            $$0.b(this.b.du(), this.b.dw() + 1.0, this.b.dA());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               drd $$3 = this.a.a($$0);
               if (!$$3.i() && !$$3.a(enl.a)) {
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
         euh $$5 = this.b.cK();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new io($$4.u(), $$1, $$4.w()));
   }

   protected eni c(io $$0) {
      eni $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(io $$0) {
      enn $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != enn.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public enr a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eni[] $$0, eni $$1) {
      int $$2 = 0;
      int $$3 = 0;
      enn $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      enn $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != enn.w) {
         $$3 = ayf.d(Math.max(1.0F, this.b.dJ()));
      }

      double $$6 = this.d(new io($$1.a, $$1.b, $$1.c));

      for (it $$7 : it.c.a) {
         eni $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (it $$9 : it.c.a) {
         it $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            eni $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eni $$0, eni $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eni $$0, @Nullable eni $$1, @Nullable eni $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != enn.d && $$2.l != enn.d) {
         boolean $$3 = $$2.l == enn.h && $$1.l == enn.h && (double)this.b.dj() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable eni $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == enn.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(enn $$0) {
      return $$0 == enn.h || $$0 == enn.s || $$0 == enn.t;
   }

   private boolean b(eni $$0) {
      euh $$1 = this.b.cK();
      eum $$2 = new eum((double)$$0.a - this.b.du() + $$1.b() / 2.0, (double)$$0.b - this.b.dw() + $$1.c() / 2.0, (double)$$0.c - this.b.dA() + $$1.d() / 2.0);
      int $$3 = ayf.c($$2.f() / $$1.a());
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
      daf $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(awc.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(daf $$0, io $$1) {
      io $$2 = $$1.d();
      evf $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(it.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eni a(int $$0, int $$1, int $$2, int $$3, double $$4, it $$5, enn $$6) {
      eni $$7 = null;
      io.a $$8 = new io.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         enn $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != enn.c && (!this.c() || $$10 != enn.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != enn.h || this.g()) && $$10 != enn.m && $$10 != enn.e && $$10 != enn.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == enn.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == enn.b) {
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

   private eni a(int $$0, int $$1, int $$2, enn $$3, float $$4) {
      eni $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eni a(int $$0, int $$1, int $$2) {
      eni $$3 = this.c($$0, $$1, $$2);
      $$3.l = enn.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private eni a(int $$0, int $$1, int $$2, enn $$3) {
      eni $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private eni a(int $$0, int $$1, int $$2, int $$3, double $$4, it $$5, enn $$6, io.a $$7) {
      eni $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dj() >= 1.0F) {
         return $$8;
      } else if ($$8.l != enn.b && $$8.l != enn.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dj() / 2.0;
         euh $$12 = new euh(
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
   private eni a(int $$0, int $$1, int $$2, @Nullable eni $$3) {
      $$1--;

      while ($$1 > this.b.dP().I_()) {
         enn $$4 = this.b($$0, $$1, $$2);
         if ($$4 != enn.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private eni d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dP().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cx()) {
            return this.a($$0, $$3, $$2);
         }

         enn $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != enn.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(euh $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected enn b(int $$0, int $$1, int $$2) {
      return (enn)this.m.computeIfAbsent(io.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public enn a(enp $$0, int $$1, int $$2, int $$3, bss $$4) {
      Set<enn> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(enn.h)) {
         return enn.h;
      } else if ($$5.contains(enn.m)) {
         return enn.m;
      } else {
         enn $$6 = enn.a;

         for (enn $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != enn.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == enn.b ? enn.b : $$6;
      }
   }

   public Set<enn> b(enp $$0, int $$1, int $$2, int $$3) {
      EnumSet<enn> $$4 = EnumSet.noneOf(enn.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               enn $$11 = this.a($$0, $$8, $$9, $$10);
               io $$12 = this.b.dp();
               boolean $$13 = this.d();
               if ($$11 == enn.s && this.e() && $$13) {
                  $$11 = enn.d;
               }

               if ($$11 == enn.r && !$$13) {
                  $$11 = enn.a;
               }

               if ($$11 == enn.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != enn.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != enn.l) {
                  $$11 = enn.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public enn a(enp $$0, int $$1, int $$2, int $$3) {
      return a($$0, new io.a($$1, $$2, $$3));
   }

   public static enn b(bss $$0, io $$1) {
      return a(new enp($$0.dP(), $$0), $$1.j());
   }

   public static enn a(enp $$0, io.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      enn $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == enn.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> enn.b;
            case o -> enn.o;
            case q -> enn.q;
            case w -> enn.w;
            case f -> enn.g;
            case y -> enn.y;
            case e -> enn.z;
            default -> a($$0, $$2, $$3, $$4, enn.c);
         };
      } else {
         return $$5;
      }
   }

   public static enn a(enp $$0, int $$1, int $$2, int $$3, enn $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  enn $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == enn.q) {
                     return enn.p;
                  }

                  if ($$8 == enn.o || $$8 == enn.i) {
                     return enn.n;
                  }

                  if ($$8 == enn.j) {
                     return enn.k;
                  }

                  if ($$8 == enn.y) {
                     return enn.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static enn b(daf $$0, io $$1) {
      drd $$2 = $$0.a_($$1);
      dea $$3 = $$2.b();
      if ($$2.i()) {
         return enn.b;
      } else if ($$2.a(avx.P) || $$2.a(dec.fm) || $$2.a(dec.sD)) {
         return enn.e;
      } else if ($$2.a(dec.qP)) {
         return enn.f;
      } else if ($$2.a(dec.dQ) || $$2.a(dec.oi)) {
         return enn.q;
      } else if ($$2.a(dec.pg)) {
         return enn.w;
      } else if ($$2.a(dec.fC)) {
         return enn.x;
      } else if (!$$2.a(dec.cd) && !$$2.a(dec.st)) {
         emw $$4 = $$2.u();
         if ($$4.a(awc.b)) {
            return enn.i;
         } else if (a($$2)) {
            return enn.o;
         } else if ($$3 instanceof dgg $$5) {
            if ($$2.c(dgg.c)) {
               return enn.r;
            } else {
               return $$5.b().c() ? enn.s : enn.t;
            }
         } else if ($$3 instanceof ddp) {
            return enn.l;
         } else if ($$3 instanceof dik) {
            return enn.v;
         } else if (!$$2.a(avx.S) && !$$2.a(avx.L) && (!($$3 instanceof dgz) || $$2.c(dgz.b))) {
            if (!$$2.a(enl.a)) {
               return enn.a;
            } else {
               return $$4.a(awc.a) ? enn.j : enn.b;
            }
         } else {
            return enn.h;
         }
      } else {
         return enn.y;
      }
   }
}

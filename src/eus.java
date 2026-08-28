import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class eus extends euj {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<eun> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<fbs> n = new Object2BooleanOpenHashMap();
   private final eui[] o = new eui[jn.c.a.b()];

   @Override
   public void a(dhm $$0, bwa $$1) {
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
   public eui a() {
      ji.a $$0 = new ji.a();
      int $$1 = this.c.dA();
      dxq $$2 = this.b.a($$0.b(this.c.dz(), (double)$$1, this.c.dF()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bj()) {
            while (true) {
               if (!$$2.a(dkg.J) && $$2.y() != etx.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.b.a($$0.b(this.c.dz(), (double)(++$$1), this.c.dF()));
            }
         } else if (this.c.aJ()) {
            $$1 = ayz.a(this.c.dB() + 0.5);
         } else {
            $$0.b(this.c.dz(), this.c.dB() + 1.0, this.c.dF());

            while ($$0.v() > this.b.a().G_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dxq $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(eul.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.c.a($$2.y())) {
            $$2 = this.b.a($$0.b(this.c.dz(), (double)(++$$1), this.c.dF()));
         }

         $$1--;
      }

      ji $$4 = this.c.du();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         fbs $$5 = this.c.cQ();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new ji($$4.u(), $$1, $$4.w()));
   }

   protected eui c(ji $$0) {
      eui $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(ji $$0) {
      eun $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != eun.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public eur a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eui[] $$0, eui $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eun $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      eun $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != eun.w) {
         $$3 = ayz.d(Math.max(1.0F, this.c.dO()));
      }

      double $$6 = this.d(new ji($$1.a, $$1.b, $$1.c));

      for (jn $$7 : jn.c.a) {
         eui $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jn $$9 : jn.c.a) {
         jn $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            eui $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eui $$0, eui $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eui $$0, @Nullable eui $$1, @Nullable eui $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eun.d && $$2.l != eun.d) {
         boolean $$3 = $$2.l == eun.h && $$1.l == eun.h && (double)this.c.dp() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable eui $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == eun.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(eun $$0) {
      return $$0 == eun.h || $$0 == eun.s || $$0 == eun.t;
   }

   private boolean b(eui $$0) {
      fbs $$1 = this.c.cQ();
      fbx $$2 = new fbx((double)$$0.a - this.c.dz() + $$1.b() / 2.0, (double)$$0.b - this.c.dB() + $$1.c() / 2.0, (double)$$0.c - this.c.dF() + $$1.d() / 2.0);
      int $$3 = ayz.c($$2.g() / $$1.a());
      $$2 = $$2.c((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(ji $$0) {
      dgf $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(awv.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dgf $$0, ji $$1) {
      ji $$2 = $$1.e();
      fcr $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jn.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eui a(int $$0, int $$1, int $$2, int $$3, double $$4, jn $$5, eun $$6) {
      eui $$7 = null;
      ji.a $$8 = new ji.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eun $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eun.c && (!this.c() || $$10 != eun.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eun.h || this.g()) && $$10 != eun.m && $$10 != eun.e && $$10 != eun.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == eun.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == eun.b) {
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
      return Math.max(1.125, (double)this.c.dO());
   }

   private eui a(int $$0, int $$1, int $$2, eun $$3, float $$4) {
      eui $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eui a(int $$0, int $$1, int $$2) {
      eui $$3 = this.c($$0, $$1, $$2);
      $$3.l = eun.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private eui a(int $$0, int $$1, int $$2, eun $$3) {
      eui $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private eui a(int $$0, int $$1, int $$2, int $$3, double $$4, jn $$5, eun $$6, ji.a $$7) {
      eui $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.dp() >= 1.0F) {
         return $$8;
      } else if ($$8.l != eun.b && $$8.l != eun.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.c.dp() / 2.0;
         fbs $$12 = new fbs(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.c.dq() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private eui a(int $$0, int $$1, int $$2, @Nullable eui $$3) {
      $$1--;

      while ($$1 > this.c.dU().G_()) {
         eun $$4 = this.b($$0, $$1, $$2);
         if ($$4 != eun.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private eui d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.dU().G_(); $$3--) {
         if ($$1 - $$3 > this.c.cD()) {
            return this.a($$0, $$3, $$2);
         }

         eun $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != eun.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(fbs $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected eun b(int $$0, int $$1, int $$2) {
      return (eun)this.m.computeIfAbsent(ji.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public eun a(eup $$0, int $$1, int $$2, int $$3, bwa $$4) {
      Set<eun> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(eun.h)) {
         return eun.h;
      } else if ($$5.contains(eun.m)) {
         return eun.m;
      } else {
         eun $$6 = eun.a;

         for (eun $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != eun.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == eun.b ? eun.b : $$6;
      }
   }

   public Set<eun> b(eup $$0, int $$1, int $$2, int $$3) {
      EnumSet<eun> $$4 = EnumSet.noneOf(eun.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               eun $$11 = this.a($$0, $$8, $$9, $$10);
               ji $$12 = this.c.du();
               boolean $$13 = this.d();
               if ($$11 == eun.s && this.e() && $$13) {
                  $$11 = eun.d;
               }

               if ($$11 == eun.r && !$$13) {
                  $$11 = eun.a;
               }

               if ($$11 == eun.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != eun.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != eun.l) {
                  $$11 = eun.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public eun a(eup $$0, int $$1, int $$2, int $$3) {
      return a($$0, new ji.a($$1, $$2, $$3));
   }

   public static eun b(bwa $$0, ji $$1) {
      return a(new eup($$0.dU(), $$0), $$1.k());
   }

   public static eun a(eup $$0, ji.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eun $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == eun.b && $$3 >= $$0.a().G_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> eun.b;
            case o -> eun.o;
            case q -> eun.q;
            case w -> eun.w;
            case f -> eun.g;
            case y -> eun.y;
            case e -> eun.z;
            default -> a($$0, $$2, $$3, $$4, eun.c);
         };
      } else {
         return $$5;
      }
   }

   public static eun a(eup $$0, int $$1, int $$2, int $$3, eun $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  eun $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == eun.q) {
                     return eun.p;
                  }

                  if ($$8 == eun.o || $$8 == eun.i) {
                     return eun.n;
                  }

                  if ($$8 == eun.j) {
                     return eun.k;
                  }

                  if ($$8 == eun.y) {
                     return eun.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static eun b(dgf $$0, ji $$1) {
      dxq $$2 = $$0.a_($$1);
      dke $$3 = $$2.b();
      if ($$2.l()) {
         return eun.b;
      } else if ($$2.a(awp.R) || $$2.a(dkg.fB) || $$2.a(dkg.th)) {
         return eun.e;
      } else if ($$2.a(dkg.rr)) {
         return eun.f;
      } else if ($$2.a(dkg.ed) || $$2.a(dkg.oK)) {
         return eun.q;
      } else if ($$2.a(dkg.pI)) {
         return eun.w;
      } else if ($$2.a(dkg.fX)) {
         return eun.x;
      } else if (!$$2.a(dkg.ck) && !$$2.a(dkg.sV)) {
         etw $$4 = $$2.y();
         if ($$4.a(awv.b)) {
            return eun.i;
         } else if (a($$2)) {
            return eun.o;
         } else if ($$3 instanceof dml $$5) {
            if ($$2.c(dml.e)) {
               return eun.r;
            } else {
               return $$5.b().c() ? eun.s : eun.t;
            }
         } else if ($$3 instanceof djt) {
            return eun.l;
         } else if ($$3 instanceof dos) {
            return eun.v;
         } else if (!$$2.a(awp.U) && !$$2.a(awp.N) && (!($$3 instanceof dne) || $$2.c(dne.b))) {
            if (!$$2.a(eul.a)) {
               return eun.a;
            } else {
               return $$4.a(awv.a) ? eun.j : eun.b;
            }
         } else {
            return eun.h;
         }
      } else {
         return eun.y;
      }
   }
}

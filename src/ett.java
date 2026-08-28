import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ett extends etk {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<eto> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<fat> n = new Object2BooleanOpenHashMap();
   private final etj[] o = new etj[jn.c.a.b()];

   @Override
   public void a(dgt $$0, bvh $$1) {
      super.a($$0, $$1);
      $$1.E();
   }

   @Override
   public void b() {
      this.c.F();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public etj a() {
      ji.a $$0 = new ji.a();
      int $$1 = this.c.dC();
      dwv $$2 = this.b.a($$0.b(this.c.dB(), (double)$$1, this.c.dH()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bj()) {
            while (true) {
               if (!$$2.a(djm.J) && $$2.y() != esy.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.b.a($$0.b(this.c.dB(), (double)(++$$1), this.c.dH()));
            }
         } else if (this.c.aJ()) {
            $$1 = ayy.a(this.c.dD() + 0.5);
         } else {
            $$0.b(this.c.dB(), this.c.dD() + 1.0, this.c.dH());

            while ($$0.v() > this.b.a().L_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dwv $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(etm.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.c.a($$2.y())) {
            $$2 = this.b.a($$0.b(this.c.dB(), (double)(++$$1), this.c.dH()));
         }

         $$1--;
      }

      ji $$4 = this.c.dw();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         fat $$5 = this.c.cR();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new ji($$4.u(), $$1, $$4.w()));
   }

   protected etj c(ji $$0) {
      etj $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(ji $$0) {
      eto $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != eto.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public ets a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(etj[] $$0, etj $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eto $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      eto $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != eto.w) {
         $$3 = ayy.d(Math.max(1.0F, this.c.dQ()));
      }

      double $$6 = this.d(new ji($$1.a, $$1.b, $$1.c));

      for (jn $$7 : jn.c.a) {
         etj $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jn $$9 : jn.c.a) {
         jn $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            etj $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable etj $$0, etj $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(etj $$0, @Nullable etj $$1, @Nullable etj $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eto.d && $$2.l != eto.d) {
         boolean $$3 = $$2.l == eto.h && $$1.l == eto.h && (double)this.c.dr() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable etj $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == eto.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(eto $$0) {
      return $$0 == eto.h || $$0 == eto.s || $$0 == eto.t;
   }

   private boolean b(etj $$0) {
      fat $$1 = this.c.cR();
      fay $$2 = new fay((double)$$0.a - this.c.dB() + $$1.b() / 2.0, (double)$$0.b - this.c.dD() + $$1.c() / 2.0, (double)$$0.c - this.c.dH() + $$1.d() / 2.0);
      int $$3 = ayy.c($$2.g() / $$1.a());
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
      dfl $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(awu.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dfl $$0, ji $$1) {
      ji $$2 = $$1.e();
      fbs $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jn.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected etj a(int $$0, int $$1, int $$2, int $$3, double $$4, jn $$5, eto $$6) {
      etj $$7 = null;
      ji.a $$8 = new ji.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eto $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eto.c && (!this.c() || $$10 != eto.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eto.h || this.g()) && $$10 != eto.m && $$10 != eto.e && $$10 != eto.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == eto.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == eto.b) {
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
      return Math.max(1.125, (double)this.c.dQ());
   }

   private etj a(int $$0, int $$1, int $$2, eto $$3, float $$4) {
      etj $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private etj a(int $$0, int $$1, int $$2) {
      etj $$3 = this.c($$0, $$1, $$2);
      $$3.l = eto.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private etj a(int $$0, int $$1, int $$2, eto $$3) {
      etj $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private etj a(int $$0, int $$1, int $$2, int $$3, double $$4, jn $$5, eto $$6, ji.a $$7) {
      etj $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.dr() >= 1.0F) {
         return $$8;
      } else if ($$8.l != eto.b && $$8.l != eto.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.c.dr() / 2.0;
         fat $$12 = new fat(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.c.ds() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private etj a(int $$0, int $$1, int $$2, @Nullable etj $$3) {
      $$1--;

      while ($$1 > this.c.dW().L_()) {
         eto $$4 = this.b($$0, $$1, $$2);
         if ($$4 != eto.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private etj d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.dW().L_(); $$3--) {
         if ($$1 - $$3 > this.c.cE()) {
            return this.a($$0, $$3, $$2);
         }

         eto $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != eto.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(fat $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected eto b(int $$0, int $$1, int $$2) {
      return (eto)this.m.computeIfAbsent(ji.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public eto a(etq $$0, int $$1, int $$2, int $$3, bvh $$4) {
      Set<eto> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(eto.h)) {
         return eto.h;
      } else if ($$5.contains(eto.m)) {
         return eto.m;
      } else {
         eto $$6 = eto.a;

         for (eto $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != eto.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == eto.b ? eto.b : $$6;
      }
   }

   public Set<eto> b(etq $$0, int $$1, int $$2, int $$3) {
      EnumSet<eto> $$4 = EnumSet.noneOf(eto.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               eto $$11 = this.a($$0, $$8, $$9, $$10);
               ji $$12 = this.c.dw();
               boolean $$13 = this.d();
               if ($$11 == eto.s && this.e() && $$13) {
                  $$11 = eto.d;
               }

               if ($$11 == eto.r && !$$13) {
                  $$11 = eto.a;
               }

               if ($$11 == eto.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != eto.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != eto.l) {
                  $$11 = eto.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public eto a(etq $$0, int $$1, int $$2, int $$3) {
      return a($$0, new ji.a($$1, $$2, $$3));
   }

   public static eto b(bvh $$0, ji $$1) {
      return a(new etq($$0.dW(), $$0), $$1.k());
   }

   public static eto a(etq $$0, ji.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eto $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == eto.b && $$3 >= $$0.a().L_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> eto.b;
            case o -> eto.o;
            case q -> eto.q;
            case w -> eto.w;
            case f -> eto.g;
            case y -> eto.y;
            case e -> eto.z;
            default -> a($$0, $$2, $$3, $$4, eto.c);
         };
      } else {
         return $$5;
      }
   }

   public static eto a(etq $$0, int $$1, int $$2, int $$3, eto $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  eto $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == eto.q) {
                     return eto.p;
                  }

                  if ($$8 == eto.o || $$8 == eto.i) {
                     return eto.n;
                  }

                  if ($$8 == eto.j) {
                     return eto.k;
                  }

                  if ($$8 == eto.y) {
                     return eto.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static eto b(dfl $$0, ji $$1) {
      dwv $$2 = $$0.a_($$1);
      djk $$3 = $$2.b();
      if ($$2.l()) {
         return eto.b;
      } else if ($$2.a(awo.R) || $$2.a(djm.fB) || $$2.a(djm.tf)) {
         return eto.e;
      } else if ($$2.a(djm.rr)) {
         return eto.f;
      } else if ($$2.a(djm.ed) || $$2.a(djm.oK)) {
         return eto.q;
      } else if ($$2.a(djm.pI)) {
         return eto.w;
      } else if ($$2.a(djm.fX)) {
         return eto.x;
      } else if (!$$2.a(djm.ck) && !$$2.a(djm.sV)) {
         esx $$4 = $$2.y();
         if ($$4.a(awu.b)) {
            return eto.i;
         } else if (a($$2)) {
            return eto.o;
         } else if ($$3 instanceof dlr $$5) {
            if ($$2.c(dlr.c)) {
               return eto.r;
            } else {
               return $$5.b().c() ? eto.s : eto.t;
            }
         } else if ($$3 instanceof diz) {
            return eto.l;
         } else if ($$3 instanceof dnw) {
            return eto.v;
         } else if (!$$2.a(awo.U) && !$$2.a(awo.N) && (!($$3 instanceof dmk) || $$2.c(dmk.b))) {
            if (!$$2.a(etm.a)) {
               return eto.a;
            } else {
               return $$4.a(awu.a) ? eto.j : eto.b;
            }
         } else {
            return eto.h;
         }
      } else {
         return eto.y;
      }
   }
}

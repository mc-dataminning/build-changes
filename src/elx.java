import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class elx extends elo {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<els> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ese> n = new Object2BooleanOpenHashMap();
   private final eln[] o = new eln[ij.c.a.b()];

   @Override
   public void a(czt $$0, bqv $$1) {
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
   public eln a() {
      id.a $$0 = new id.a();
      int $$1 = this.b.ds();
      dpi $$2 = this.a.a($$0.b(this.b.dr(), (double)$$1, this.b.dx()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.bc()) {
            while (true) {
               if (!$$2.a(dcj.G) && $$2.u() != elc.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.dr(), (double)(++$$1), this.b.dx()));
            }
         } else if (this.b.aC()) {
            $$1 = axm.a(this.b.dt() + 0.5);
         } else {
            $$0.b(this.b.dr(), this.b.dt() + 1.0, this.b.dx());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dpi $$3 = this.a.a($$0);
               if (!$$3.i() && !$$3.a(elq.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a($$0.b(this.b.dr(), (double)(++$$1), this.b.dx()));
         }

         $$1--;
      }

      id $$4 = this.b.dm();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ese $$5 = this.b.cH();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new id($$4.u(), $$1, $$4.w()));
   }

   protected eln c(id $$0) {
      eln $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(id $$0) {
      els $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != els.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public elw a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eln[] $$0, eln $$1) {
      int $$2 = 0;
      int $$3 = 0;
      els $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      els $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != els.w) {
         $$3 = axm.d(Math.max(1.0F, this.b.dG()));
      }

      double $$6 = this.d(new id($$1.a, $$1.b, $$1.c));

      for (ij $$7 : ij.c.a) {
         eln $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (ij $$9 : ij.c.a) {
         ij $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            eln $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eln $$0, eln $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eln $$0, @Nullable eln $$1, @Nullable eln $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != els.d && $$2.l != els.d) {
         boolean $$3 = $$2.l == els.h && $$1.l == els.h && (double)this.b.dg() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable eln $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == els.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(els $$0) {
      return $$0 == els.h || $$0 == els.s || $$0 == els.t;
   }

   private boolean b(eln $$0) {
      ese $$1 = this.b.cH();
      esj $$2 = new esj((double)$$0.a - this.b.dr() + $$1.b() / 2.0, (double)$$0.b - this.b.dt() + $$1.c() / 2.0, (double)$$0.c - this.b.dx() + $$1.d() / 2.0);
      int $$3 = axm.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(id $$0) {
      cym $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(avj.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(cym $$0, id $$1) {
      id $$2 = $$1.d();
      etc $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ij.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eln a(int $$0, int $$1, int $$2, int $$3, double $$4, ij $$5, els $$6) {
      eln $$7 = null;
      id.a $$8 = new id.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         els $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != els.c && (!this.c() || $$10 != els.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != els.h || this.g()) && $$10 != els.m && $$10 != els.e && $$10 != els.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == els.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == els.b) {
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
      return Math.max(1.125, (double)this.b.dG());
   }

   private eln a(int $$0, int $$1, int $$2, els $$3, float $$4) {
      eln $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eln a(int $$0, int $$1, int $$2) {
      eln $$3 = this.c($$0, $$1, $$2);
      $$3.l = els.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private eln a(int $$0, int $$1, int $$2, els $$3) {
      eln $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private eln a(int $$0, int $$1, int $$2, int $$3, double $$4, ij $$5, els $$6, id.a $$7) {
      eln $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dg() >= 1.0F) {
         return $$8;
      } else if ($$8.l != els.b && $$8.l != els.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dg() / 2.0;
         ese $$12 = new ese(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.dh() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private eln a(int $$0, int $$1, int $$2, @Nullable eln $$3) {
      $$1--;

      while ($$1 > this.b.dM().I_()) {
         els $$4 = this.b($$0, $$1, $$2);
         if ($$4 != els.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private eln d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dM().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cu()) {
            return this.a($$0, $$3, $$2);
         }

         els $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != els.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(ese $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected els b(int $$0, int $$1, int $$2) {
      return (els)this.m.computeIfAbsent(id.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public els a(elu $$0, int $$1, int $$2, int $$3, bqv $$4) {
      Set<els> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(els.h)) {
         return els.h;
      } else if ($$5.contains(els.m)) {
         return els.m;
      } else {
         els $$6 = els.a;

         for (els $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != els.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == els.b ? els.b : $$6;
      }
   }

   public Set<els> b(elu $$0, int $$1, int $$2, int $$3) {
      EnumSet<els> $$4 = EnumSet.noneOf(els.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               els $$11 = this.a($$0, $$8, $$9, $$10);
               id $$12 = this.b.dm();
               boolean $$13 = this.d();
               if ($$11 == els.s && this.e() && $$13) {
                  $$11 = els.d;
               }

               if ($$11 == els.r && !$$13) {
                  $$11 = els.a;
               }

               if ($$11 == els.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != els.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != els.l) {
                  $$11 = els.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public els a(elu $$0, int $$1, int $$2, int $$3) {
      return a($$0, new id.a($$1, $$2, $$3));
   }

   public static els b(bqv $$0, id $$1) {
      return a(new elu($$0.dM(), $$0), $$1.j());
   }

   public static els a(elu $$0, id.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      els $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == els.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> els.b;
            case o -> els.o;
            case q -> els.q;
            case w -> els.w;
            case f -> els.g;
            case y -> els.y;
            case e -> els.z;
            default -> a($$0, $$2, $$3, $$4, els.c);
         };
      } else {
         return $$5;
      }
   }

   public static els a(elu $$0, int $$1, int $$2, int $$3, els $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  els $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == els.q) {
                     return els.p;
                  }

                  if ($$8 == els.o || $$8 == els.i) {
                     return els.n;
                  }

                  if ($$8 == els.j) {
                     return els.k;
                  }

                  if ($$8 == els.y) {
                     return els.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static els b(cym $$0, id $$1) {
      dpi $$2 = $$0.a_($$1);
      dch $$3 = $$2.b();
      if ($$2.i()) {
         return els.b;
      } else if ($$2.a(ave.P) || $$2.a(dcj.fm) || $$2.a(dcj.sD)) {
         return els.e;
      } else if ($$2.a(dcj.qP)) {
         return els.f;
      } else if ($$2.a(dcj.dQ) || $$2.a(dcj.oi)) {
         return els.q;
      } else if ($$2.a(dcj.pg)) {
         return els.w;
      } else if ($$2.a(dcj.fC)) {
         return els.x;
      } else if (!$$2.a(dcj.cd) && !$$2.a(dcj.st)) {
         elb $$4 = $$2.u();
         if ($$4.a(avj.b)) {
            return els.i;
         } else if (a($$2)) {
            return els.o;
         } else if ($$3 instanceof den $$5) {
            if ($$2.c(den.c)) {
               return els.r;
            } else {
               return $$5.b().c() ? els.s : els.t;
            }
         } else if ($$3 instanceof dbw) {
            return els.l;
         } else if ($$3 instanceof dgq) {
            return els.v;
         } else if (!$$2.a(ave.S) && !$$2.a(ave.L) && (!($$3 instanceof dfg) || $$2.c(dfg.b))) {
            if (!$$2.a(elq.a)) {
               return els.a;
            } else {
               return $$4.a(avj.a) ? els.j : els.b;
            }
         } else {
            return els.h;
         }
      } else {
         return els.y;
      }
   }
}

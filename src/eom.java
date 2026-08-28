import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class eom extends eod {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<eoh> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<evh> n = new Object2BooleanOpenHashMap();
   private final eoc[] o = new eoc[je.c.a.b()];

   @Override
   public void a(dcg $$0, btm $$1) {
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
   public eoc a() {
      iz.a $$0 = new iz.a();
      int $$1 = this.b.dv();
      drx $$2 = this.a.a($$0.b(this.b.du(), (double)$$1, this.b.dA()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.be()) {
            while (true) {
               if (!$$2.a(dew.G) && $$2.u() != enr.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.du(), (double)(++$$1), this.b.dA()));
            }
         } else if (this.b.aE()) {
            $$1 = ayu.a(this.b.dw() + 0.5);
         } else {
            $$0.b(this.b.du(), this.b.dw() + 1.0, this.b.dA());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               drx $$3 = this.a.a($$0);
               if (!$$3.i() && !$$3.a(eof.a)) {
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

      iz $$4 = this.b.dp();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         evh $$5 = this.b.cK();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new iz($$4.u(), $$1, $$4.w()));
   }

   protected eoc c(iz $$0) {
      eoc $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(iz $$0) {
      eoh $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != eoh.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public eol a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eoc[] $$0, eoc $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eoh $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      eoh $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != eoh.w) {
         $$3 = ayu.d(Math.max(1.0F, this.b.dJ()));
      }

      double $$6 = this.d(new iz($$1.a, $$1.b, $$1.c));

      for (je $$7 : je.c.a) {
         eoc $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (je $$9 : je.c.a) {
         je $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            eoc $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eoc $$0, eoc $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eoc $$0, @Nullable eoc $$1, @Nullable eoc $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eoh.d && $$2.l != eoh.d) {
         boolean $$3 = $$2.l == eoh.h && $$1.l == eoh.h && (double)this.b.dj() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable eoc $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == eoh.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(eoh $$0) {
      return $$0 == eoh.h || $$0 == eoh.s || $$0 == eoh.t;
   }

   private boolean b(eoc $$0) {
      evh $$1 = this.b.cK();
      evm $$2 = new evm((double)$$0.a - this.b.du() + $$1.b() / 2.0, (double)$$0.b - this.b.dw() + $$1.c() / 2.0, (double)$$0.c - this.b.dA() + $$1.d() / 2.0);
      int $$3 = ayu.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(iz $$0) {
      daz $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(awr.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(daz $$0, iz $$1) {
      iz $$2 = $$1.d();
      ewf $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(je.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eoc a(int $$0, int $$1, int $$2, int $$3, double $$4, je $$5, eoh $$6) {
      eoc $$7 = null;
      iz.a $$8 = new iz.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eoh $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eoh.c && (!this.c() || $$10 != eoh.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eoh.h || this.g()) && $$10 != eoh.m && $$10 != eoh.e && $$10 != eoh.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == eoh.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == eoh.b) {
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

   private eoc a(int $$0, int $$1, int $$2, eoh $$3, float $$4) {
      eoc $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eoc a(int $$0, int $$1, int $$2) {
      eoc $$3 = this.c($$0, $$1, $$2);
      $$3.l = eoh.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private eoc a(int $$0, int $$1, int $$2, eoh $$3) {
      eoc $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private eoc a(int $$0, int $$1, int $$2, int $$3, double $$4, je $$5, eoh $$6, iz.a $$7) {
      eoc $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dj() >= 1.0F) {
         return $$8;
      } else if ($$8.l != eoh.b && $$8.l != eoh.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dj() / 2.0;
         evh $$12 = new evh(
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
   private eoc a(int $$0, int $$1, int $$2, @Nullable eoc $$3) {
      $$1--;

      while ($$1 > this.b.dP().I_()) {
         eoh $$4 = this.b($$0, $$1, $$2);
         if ($$4 != eoh.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private eoc d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dP().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cx()) {
            return this.a($$0, $$3, $$2);
         }

         eoh $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != eoh.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(evh $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected eoh b(int $$0, int $$1, int $$2) {
      return (eoh)this.m.computeIfAbsent(iz.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public eoh a(eoj $$0, int $$1, int $$2, int $$3, btm $$4) {
      Set<eoh> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(eoh.h)) {
         return eoh.h;
      } else if ($$5.contains(eoh.m)) {
         return eoh.m;
      } else {
         eoh $$6 = eoh.a;

         for (eoh $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != eoh.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == eoh.b ? eoh.b : $$6;
      }
   }

   public Set<eoh> b(eoj $$0, int $$1, int $$2, int $$3) {
      EnumSet<eoh> $$4 = EnumSet.noneOf(eoh.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               eoh $$11 = this.a($$0, $$8, $$9, $$10);
               iz $$12 = this.b.dp();
               boolean $$13 = this.d();
               if ($$11 == eoh.s && this.e() && $$13) {
                  $$11 = eoh.d;
               }

               if ($$11 == eoh.r && !$$13) {
                  $$11 = eoh.a;
               }

               if ($$11 == eoh.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != eoh.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != eoh.l) {
                  $$11 = eoh.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public eoh a(eoj $$0, int $$1, int $$2, int $$3) {
      return a($$0, new iz.a($$1, $$2, $$3));
   }

   public static eoh b(btm $$0, iz $$1) {
      return a(new eoj($$0.dP(), $$0), $$1.j());
   }

   public static eoh a(eoj $$0, iz.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eoh $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == eoh.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> eoh.b;
            case o -> eoh.o;
            case q -> eoh.q;
            case w -> eoh.w;
            case f -> eoh.g;
            case y -> eoh.y;
            case e -> eoh.z;
            default -> a($$0, $$2, $$3, $$4, eoh.c);
         };
      } else {
         return $$5;
      }
   }

   public static eoh a(eoj $$0, int $$1, int $$2, int $$3, eoh $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  eoh $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == eoh.q) {
                     return eoh.p;
                  }

                  if ($$8 == eoh.o || $$8 == eoh.i) {
                     return eoh.n;
                  }

                  if ($$8 == eoh.j) {
                     return eoh.k;
                  }

                  if ($$8 == eoh.y) {
                     return eoh.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static eoh b(daz $$0, iz $$1) {
      drx $$2 = $$0.a_($$1);
      deu $$3 = $$2.b();
      if ($$2.i()) {
         return eoh.b;
      } else if ($$2.a(awl.P) || $$2.a(dew.fm) || $$2.a(dew.sD)) {
         return eoh.e;
      } else if ($$2.a(dew.qP)) {
         return eoh.f;
      } else if ($$2.a(dew.dQ) || $$2.a(dew.oi)) {
         return eoh.q;
      } else if ($$2.a(dew.pg)) {
         return eoh.w;
      } else if ($$2.a(dew.fC)) {
         return eoh.x;
      } else if (!$$2.a(dew.cd) && !$$2.a(dew.st)) {
         enq $$4 = $$2.u();
         if ($$4.a(awr.b)) {
            return eoh.i;
         } else if (a($$2)) {
            return eoh.o;
         } else if ($$3 instanceof dha $$5) {
            if ($$2.c(dha.c)) {
               return eoh.r;
            } else {
               return $$5.b().c() ? eoh.s : eoh.t;
            }
         } else if ($$3 instanceof dej) {
            return eoh.l;
         } else if ($$3 instanceof dje) {
            return eoh.v;
         } else if (!$$2.a(awl.S) && !$$2.a(awl.L) && (!($$3 instanceof dht) || $$2.c(dht.b))) {
            if (!$$2.a(eof.a)) {
               return eoh.a;
            } else {
               return $$4.a(awr.a) ? eoh.j : eoh.b;
            }
         } else {
            return eoh.h;
         }
      } else {
         return eoh.y;
      }
   }
}

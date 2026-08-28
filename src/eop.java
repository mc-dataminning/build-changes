import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class eop extends eog {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<eok> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<evk> n = new Object2BooleanOpenHashMap();
   private final eof[] o = new eof[je.c.a.b()];

   @Override
   public void a(dcj $$0, btp $$1) {
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
   public eof a() {
      iz.a $$0 = new iz.a();
      int $$1 = this.b.dv();
      dsa $$2 = this.a.a($$0.b(this.b.du(), (double)$$1, this.b.dA()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.be()) {
            while (true) {
               if (!$$2.a(dez.G) && $$2.u() != enu.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.du(), (double)(++$$1), this.b.dA()));
            }
         } else if (this.b.aE()) {
            $$1 = ayx.a(this.b.dw() + 0.5);
         } else {
            $$0.b(this.b.du(), this.b.dw() + 1.0, this.b.dA());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dsa $$3 = this.a.a($$0);
               if (!$$3.i() && !$$3.a(eoi.a)) {
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
         evk $$5 = this.b.cK();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new iz($$4.u(), $$1, $$4.w()));
   }

   protected eof c(iz $$0) {
      eof $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(iz $$0) {
      eok $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != eok.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public eoo a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eof[] $$0, eof $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eok $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      eok $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != eok.w) {
         $$3 = ayx.d(Math.max(1.0F, this.b.dJ()));
      }

      double $$6 = this.d(new iz($$1.a, $$1.b, $$1.c));

      for (je $$7 : je.c.a) {
         eof $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (je $$9 : je.c.a) {
         je $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            eof $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eof $$0, eof $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eof $$0, @Nullable eof $$1, @Nullable eof $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eok.d && $$2.l != eok.d) {
         boolean $$3 = $$2.l == eok.h && $$1.l == eok.h && (double)this.b.dj() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable eof $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == eok.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(eok $$0) {
      return $$0 == eok.h || $$0 == eok.s || $$0 == eok.t;
   }

   private boolean b(eof $$0) {
      evk $$1 = this.b.cK();
      evp $$2 = new evp((double)$$0.a - this.b.du() + $$1.b() / 2.0, (double)$$0.b - this.b.dw() + $$1.c() / 2.0, (double)$$0.c - this.b.dA() + $$1.d() / 2.0);
      int $$3 = ayx.c($$2.f() / $$1.a());
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
      dbc $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(awu.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dbc $$0, iz $$1) {
      iz $$2 = $$1.d();
      ewi $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(je.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eof a(int $$0, int $$1, int $$2, int $$3, double $$4, je $$5, eok $$6) {
      eof $$7 = null;
      iz.a $$8 = new iz.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eok $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eok.c && (!this.c() || $$10 != eok.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eok.h || this.g()) && $$10 != eok.m && $$10 != eok.e && $$10 != eok.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == eok.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == eok.b) {
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

   private eof a(int $$0, int $$1, int $$2, eok $$3, float $$4) {
      eof $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eof a(int $$0, int $$1, int $$2) {
      eof $$3 = this.c($$0, $$1, $$2);
      $$3.l = eok.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private eof a(int $$0, int $$1, int $$2, eok $$3) {
      eof $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private eof a(int $$0, int $$1, int $$2, int $$3, double $$4, je $$5, eok $$6, iz.a $$7) {
      eof $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dj() >= 1.0F) {
         return $$8;
      } else if ($$8.l != eok.b && $$8.l != eok.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dj() / 2.0;
         evk $$12 = new evk(
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
   private eof a(int $$0, int $$1, int $$2, @Nullable eof $$3) {
      $$1--;

      while ($$1 > this.b.dP().I_()) {
         eok $$4 = this.b($$0, $$1, $$2);
         if ($$4 != eok.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private eof d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dP().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cx()) {
            return this.a($$0, $$3, $$2);
         }

         eok $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != eok.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(evk $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected eok b(int $$0, int $$1, int $$2) {
      return (eok)this.m.computeIfAbsent(iz.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public eok a(eom $$0, int $$1, int $$2, int $$3, btp $$4) {
      Set<eok> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(eok.h)) {
         return eok.h;
      } else if ($$5.contains(eok.m)) {
         return eok.m;
      } else {
         eok $$6 = eok.a;

         for (eok $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != eok.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == eok.b ? eok.b : $$6;
      }
   }

   public Set<eok> b(eom $$0, int $$1, int $$2, int $$3) {
      EnumSet<eok> $$4 = EnumSet.noneOf(eok.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               eok $$11 = this.a($$0, $$8, $$9, $$10);
               iz $$12 = this.b.dp();
               boolean $$13 = this.d();
               if ($$11 == eok.s && this.e() && $$13) {
                  $$11 = eok.d;
               }

               if ($$11 == eok.r && !$$13) {
                  $$11 = eok.a;
               }

               if ($$11 == eok.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != eok.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != eok.l) {
                  $$11 = eok.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public eok a(eom $$0, int $$1, int $$2, int $$3) {
      return a($$0, new iz.a($$1, $$2, $$3));
   }

   public static eok b(btp $$0, iz $$1) {
      return a(new eom($$0.dP(), $$0), $$1.j());
   }

   public static eok a(eom $$0, iz.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eok $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == eok.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> eok.b;
            case o -> eok.o;
            case q -> eok.q;
            case w -> eok.w;
            case f -> eok.g;
            case y -> eok.y;
            case e -> eok.z;
            default -> a($$0, $$2, $$3, $$4, eok.c);
         };
      } else {
         return $$5;
      }
   }

   public static eok a(eom $$0, int $$1, int $$2, int $$3, eok $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  eok $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == eok.q) {
                     return eok.p;
                  }

                  if ($$8 == eok.o || $$8 == eok.i) {
                     return eok.n;
                  }

                  if ($$8 == eok.j) {
                     return eok.k;
                  }

                  if ($$8 == eok.y) {
                     return eok.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static eok b(dbc $$0, iz $$1) {
      dsa $$2 = $$0.a_($$1);
      dex $$3 = $$2.b();
      if ($$2.i()) {
         return eok.b;
      } else if ($$2.a(awo.P) || $$2.a(dez.fm) || $$2.a(dez.sD)) {
         return eok.e;
      } else if ($$2.a(dez.qP)) {
         return eok.f;
      } else if ($$2.a(dez.dQ) || $$2.a(dez.oi)) {
         return eok.q;
      } else if ($$2.a(dez.pg)) {
         return eok.w;
      } else if ($$2.a(dez.fC)) {
         return eok.x;
      } else if (!$$2.a(dez.cd) && !$$2.a(dez.st)) {
         ent $$4 = $$2.u();
         if ($$4.a(awu.b)) {
            return eok.i;
         } else if (a($$2)) {
            return eok.o;
         } else if ($$3 instanceof dhd $$5) {
            if ($$2.c(dhd.c)) {
               return eok.r;
            } else {
               return $$5.b().c() ? eok.s : eok.t;
            }
         } else if ($$3 instanceof dem) {
            return eok.l;
         } else if ($$3 instanceof djh) {
            return eok.v;
         } else if (!$$2.a(awo.S) && !$$2.a(awo.L) && (!($$3 instanceof dhw) || $$2.c(dhw.b))) {
            if (!$$2.a(eoi.a)) {
               return eok.a;
            } else {
               return $$4.a(awu.a) ? eok.j : eok.b;
            }
         } else {
            return eok.h;
         }
      } else {
         return eok.y;
      }
   }
}

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class ehj extends ehd {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<eha> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<enn> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(cwa $$0, boi $$1) {
      super.a($$0, $$1);
      $$1.E();
   }

   @Override
   public void b() {
      this.b.G();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public ehc a() {
      hz.a $$0 = new hz.a();
      int $$1 = this.b.ds();
      dlf $$2 = this.a.a_($$0.b(this.b.dr(), (double)$$1, this.b.dx()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aZ()) {
            while (true) {
               if (!$$2.a(cyq.G) && $$2.u() != egq.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dr(), (double)(++$$1), this.b.dx()));
            }
         } else if (this.b.aC()) {
            $$1 = awh.a(this.b.dt() + 0.5);
         } else {
            hz $$3 = this.b.dm();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, ehf.a)) && $$3.v() > this.b.dM().J_()) {
               $$3 = $$3.d();
            }

            $$1 = $$3.c().v();
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a_($$0.b(this.b.dr(), (double)(++$$1), this.b.dx()));
         }

         $$1--;
      }

      hz $$4 = this.b.dm();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         enn $$5 = this.b.cH();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new hz($$4.u(), $$1, $$4.w()));
   }

   protected ehc c(hz $$0) {
      ehc $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(hz $$0) {
      eha $$1 = this.a(this.b, $$0);
      return $$1 != eha.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public ehi a(double $$0, double $$1, double $$2) {
      return this.a(this.b(awh.a($$0), awh.a($$1), awh.a($$2)));
   }

   @Override
   public int a(ehc[] $$0, ehc $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eha $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      eha $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != eha.w) {
         $$3 = awh.d(Math.max(1.0F, this.b.dG()));
      }

      double $$6 = this.d(new hz($$1.a, $$1.b, $$1.c));
      ehc $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, ie.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      ehc $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, ie.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      ehc $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, ie.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      ehc $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, ie.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      ehc $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, ie.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      ehc $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, ie.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      ehc $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, ie.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      ehc $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, ie.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable ehc $$0, ehc $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(ehc $$0, @Nullable ehc $$1, @Nullable ehc $$2, @Nullable ehc $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eha.d && $$2.l != eha.d && $$3.l != eha.d) {
         boolean $$4 = $$2.l == eha.h && $$1.l == eha.h && (double)this.b.dg() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(eha $$0) {
      return $$0 == eha.h || $$0 == eha.s || $$0 == eha.t;
   }

   private boolean b(ehc $$0) {
      enn $$1 = this.b.cH();
      ens $$2 = new ens((double)$$0.a - this.b.dr() + $$1.b() / 2.0, (double)$$0.b - this.b.dt() + $$1.c() / 2.0, (double)$$0.c - this.b.dx() + $$1.d() / 2.0);
      int $$3 = awh.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(hz $$0) {
      return (this.f() || this.c()) && this.a.b_($$0).a(aue.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(cut $$0, hz $$1) {
      hz $$2 = $$1.d();
      eol $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ie.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected ehc a(int $$0, int $$1, int $$2, int $$3, double $$4, ie $$5, eha $$6) {
      ehc $$7 = null;
      hz.a $$8 = new hz.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eha $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.dg() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eha.c && (!this.c() || $$10 != eha.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eha.h || this.g()) && $$10 != eha.m && $$10 != eha.e && $$10 != eha.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == eha.b || $$7.l == eha.c) && this.b.dg() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  enn $$15 = new enn(
                     $$13 - $$12,
                     this.d($$8.b($$13, (double)($$1 + 1), $$14)) + 0.001,
                     $$14 - $$12,
                     $$13 + $$12,
                     (double)this.b.dh() + this.d($$8.b((double)$$7.a, (double)$$7.b, (double)$$7.c)) - 0.002,
                     $$14 + $$12
                  );
                  if (this.a($$15)) {
                     $$7 = null;
                  }
               }
            }

            if (!this.c() && $$10 == eha.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != eha.j) {
                  return $$7;
               }

               while ($$1 > this.b.dM().J_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != eha.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == eha.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == eha.b) {
                  if (--$$1 < this.b.dM().J_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.cu()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != eha.b && $$11 >= 0.0F) {
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
      return Math.max(1.125, (double)this.b.dG());
   }

   private ehc a(int $$0, int $$1, int $$2, eha $$3, float $$4) {
      ehc $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private ehc a(int $$0, int $$1, int $$2) {
      ehc $$3 = this.b($$0, $$1, $$2);
      $$3.l = eha.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(enn $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public eha a(cut $$0, int $$1, int $$2, int $$3, boi $$4) {
      EnumSet<eha> $$5 = EnumSet.noneOf(eha.class);
      eha $$6 = eha.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dm());
      if ($$5.contains(eha.h)) {
         return eha.h;
      } else if ($$5.contains(eha.m)) {
         return eha.m;
      } else {
         eha $$7 = eha.a;

         for (eha $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == eha.b && $$4.a($$7) == 0.0F && this.d <= 1 ? eha.b : $$7;
      }
   }

   public eha a(cut $$0, int $$1, int $$2, int $$3, EnumSet<eha> $$4, eha $$5, hz $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               eha $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected eha a(cut $$0, hz $$1, eha $$2) {
      boolean $$3 = this.d();
      if ($$2 == eha.s && this.e() && $$3) {
         $$2 = eha.d;
      }

      if ($$2 == eha.r && !$$3) {
         $$2 = eha.a;
      }

      if ($$2 == eha.l && !($$0.a_($$1).b() instanceof cyd) && !($$0.a_($$1.d()).b() instanceof cyd)) {
         $$2 = eha.m;
      }

      return $$2;
   }

   protected eha a(boi $$0, hz $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected eha a(boi $$0, int $$1, int $$2, int $$3) {
      return (eha)this.m.computeIfAbsent(hz.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public eha a(cut $$0, int $$1, int $$2, int $$3) {
      return a($$0, new hz.a($$1, $$2, $$3));
   }

   public static eha a(cut $$0, hz.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eha $$5 = b($$0, $$1);
      if ($$5 == eha.b && $$3 >= $$0.J_() + 1) {
         return switch (b($$0, $$1.d($$2, $$3 - 1, $$4))) {
            case b, j, i, c -> eha.b;
            case o -> eha.o;
            case q -> eha.q;
            case w -> eha.w;
            case f -> eha.g;
            case y -> eha.y;
            case e -> eha.z;
            default -> a($$0, $$1.d($$2, $$3, $$4), eha.c);
         };
      } else {
         return $$5;
      }
   }

   public static eha a(cut $$0, hz.a $$1, eha $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dlf $$9 = $$0.a_($$1);
                  if ($$9.a(cyq.dQ) || $$9.a(cyq.oi)) {
                     return eha.p;
                  }

                  if (a($$9)) {
                     return eha.n;
                  }

                  if ($$0.b_($$1).a(aue.a)) {
                     return eha.k;
                  }

                  if ($$9.a(cyq.cd) || $$9.a(cyq.st)) {
                     return eha.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static eha b(cut $$0, hz $$1) {
      dlf $$2 = $$0.a_($$1);
      cyo $$3 = $$2.b();
      if ($$2.i()) {
         return eha.b;
      } else if ($$2.a(atz.P) || $$2.a(cyq.fm) || $$2.a(cyq.sD)) {
         return eha.e;
      } else if ($$2.a(cyq.qP)) {
         return eha.f;
      } else if ($$2.a(cyq.dQ) || $$2.a(cyq.oi)) {
         return eha.q;
      } else if ($$2.a(cyq.pg)) {
         return eha.w;
      } else if ($$2.a(cyq.fC)) {
         return eha.x;
      } else if (!$$2.a(cyq.cd) && !$$2.a(cyq.st)) {
         egp $$4 = $$0.b_($$1);
         if ($$4.a(aue.b)) {
            return eha.i;
         } else if (a($$2)) {
            return eha.o;
         } else if ($$3 instanceof dau $$5) {
            if ($$2.c(dau.c)) {
               return eha.r;
            } else {
               return $$5.b().c() ? eha.s : eha.t;
            }
         } else if ($$3 instanceof cyd) {
            return eha.l;
         } else if ($$3 instanceof dcx) {
            return eha.v;
         } else if (!$$2.a(atz.S) && !$$2.a(atz.L) && (!($$3 instanceof dbn) || $$2.c(dbn.b))) {
            if (!$$2.a($$0, $$1, ehf.a)) {
               return eha.a;
            } else {
               return $$4.a(aue.a) ? eha.j : eha.b;
            }
         } else {
            return eha.h;
         }
      } else {
         return eha.y;
      }
   }

   public static boolean a(dlf $$0) {
      return $$0.a(atz.aJ) || $$0.a(cyq.H) || $$0.a(cyq.kJ) || czc.g($$0) || $$0.a(cyq.fv);
   }
}

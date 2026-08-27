import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class edm extends edg {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<edd> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ejp> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(csn $$0, bli $$1) {
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
   public edf a() {
      ht.a $$0 = new ht.a();
      int $$1 = this.b.dt();
      dhi $$2 = this.a.a_($$0.b(this.b.ds(), (double)$$1, this.b.dy()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aZ()) {
            while (true) {
               if (!$$2.a(cvc.G) && $$2.u() != ect.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.ds(), (double)(++$$1), this.b.dy()));
            }
         } else if (this.b.aC()) {
            $$1 = atm.a(this.b.du() + 0.5);
         } else {
            ht $$3 = this.b.dn();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, edi.a)) && $$3.v() > this.b.dN().I_()) {
               $$3 = $$3.d();
            }

            $$1 = $$3.c().v();
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a_($$0.b(this.b.ds(), (double)(++$$1), this.b.dy()));
         }

         $$1--;
      }

      ht $$4 = this.b.dn();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ejp $$5 = this.b.cH();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new ht($$4.u(), $$1, $$4.w()));
   }

   protected edf c(ht $$0) {
      edf $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(ht $$0) {
      edd $$1 = this.a(this.b, $$0);
      return $$1 != edd.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public edl a(double $$0, double $$1, double $$2) {
      return this.a(this.b(atm.a($$0), atm.a($$1), atm.a($$2)));
   }

   @Override
   public int a(edf[] $$0, edf $$1) {
      int $$2 = 0;
      int $$3 = 0;
      edd $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      edd $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != edd.w) {
         $$3 = atm.d(Math.max(1.0F, this.b.dH()));
      }

      double $$6 = this.d(new ht($$1.a, $$1.b, $$1.c));
      edf $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, hx.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      edf $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, hx.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      edf $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, hx.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      edf $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, hx.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      edf $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, hx.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      edf $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, hx.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      edf $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, hx.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      edf $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, hx.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable edf $$0, edf $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(edf $$0, @Nullable edf $$1, @Nullable edf $$2, @Nullable edf $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != edd.d && $$2.l != edd.d && $$3.l != edd.d) {
         boolean $$4 = $$2.l == edd.h && $$1.l == edd.h && (double)this.b.dh() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(edd $$0) {
      return $$0 == edd.h || $$0 == edd.s || $$0 == edd.t;
   }

   private boolean b(edf $$0) {
      ejp $$1 = this.b.cH();
      eju $$2 = new eju((double)$$0.a - this.b.ds() + $$1.b() / 2.0, (double)$$0.b - this.b.du() + $$1.c() / 2.0, (double)$$0.c - this.b.dy() + $$1.d() / 2.0);
      int $$3 = atm.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(ht $$0) {
      return (this.f() || this.c()) && this.a.b_($$0).a(arl.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(crg $$0, ht $$1) {
      ht $$2 = $$1.d();
      ekn $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(hx.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected edf a(int $$0, int $$1, int $$2, int $$3, double $$4, hx $$5, edd $$6) {
      edf $$7 = null;
      ht.a $$8 = new ht.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         edd $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.dh() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != edd.c && (!this.c() || $$10 != edd.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != edd.h || this.g()) && $$10 != edd.m && $$10 != edd.e && $$10 != edd.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == edd.b || $$7.l == edd.c) && this.b.dh() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  ejp $$15 = new ejp(
                     $$13 - $$12,
                     this.d($$8.b($$13, (double)($$1 + 1), $$14)) + 0.001,
                     $$14 - $$12,
                     $$13 + $$12,
                     (double)this.b.di() + this.d($$8.b((double)$$7.a, (double)$$7.b, (double)$$7.c)) - 0.002,
                     $$14 + $$12
                  );
                  if (this.a($$15)) {
                     $$7 = null;
                  }
               }
            }

            if (!this.c() && $$10 == edd.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != edd.j) {
                  return $$7;
               }

               while ($$1 > this.b.dN().I_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != edd.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == edd.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == edd.b) {
                  if (--$$1 < this.b.dN().I_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.cu()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != edd.b && $$11 >= 0.0F) {
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
      return Math.max(1.125, (double)this.b.dH());
   }

   private edf a(int $$0, int $$1, int $$2, edd $$3, float $$4) {
      edf $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private edf a(int $$0, int $$1, int $$2) {
      edf $$3 = this.b($$0, $$1, $$2);
      $$3.l = edd.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(ejp $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public edd a(crg $$0, int $$1, int $$2, int $$3, bli $$4) {
      EnumSet<edd> $$5 = EnumSet.noneOf(edd.class);
      edd $$6 = edd.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dn());
      if ($$5.contains(edd.h)) {
         return edd.h;
      } else if ($$5.contains(edd.m)) {
         return edd.m;
      } else {
         edd $$7 = edd.a;

         for (edd $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == edd.b && $$4.a($$7) == 0.0F && this.d <= 1 ? edd.b : $$7;
      }
   }

   public edd a(crg $$0, int $$1, int $$2, int $$3, EnumSet<edd> $$4, edd $$5, ht $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               edd $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected edd a(crg $$0, ht $$1, edd $$2) {
      boolean $$3 = this.d();
      if ($$2 == edd.s && this.e() && $$3) {
         $$2 = edd.d;
      }

      if ($$2 == edd.r && !$$3) {
         $$2 = edd.a;
      }

      if ($$2 == edd.l && !($$0.a_($$1).b() instanceof cup) && !($$0.a_($$1.d()).b() instanceof cup)) {
         $$2 = edd.m;
      }

      return $$2;
   }

   protected edd a(bli $$0, ht $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected edd a(bli $$0, int $$1, int $$2, int $$3) {
      return (edd)this.m.computeIfAbsent(ht.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public edd a(crg $$0, int $$1, int $$2, int $$3) {
      return a($$0, new ht.a($$1, $$2, $$3));
   }

   public static edd a(crg $$0, ht.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      edd $$5 = b($$0, $$1);
      if ($$5 == edd.b && $$3 >= $$0.I_() + 1) {
         edd $$6 = b($$0, $$1.d($$2, $$3 - 1, $$4));
         $$5 = $$6 != edd.c && $$6 != edd.b && $$6 != edd.j && $$6 != edd.i ? edd.c : edd.b;
         if ($$6 == edd.o) {
            $$5 = edd.o;
         }

         if ($$6 == edd.q) {
            $$5 = edd.q;
         }

         if ($$6 == edd.w) {
            $$5 = edd.w;
         }

         if ($$6 == edd.f) {
            $$5 = edd.g;
         }

         if ($$6 == edd.y) {
            $$5 = edd.y;
         }
      }

      if ($$5 == edd.c) {
         $$5 = a($$0, $$1.d($$2, $$3, $$4), $$5);
      }

      return $$5;
   }

   public static edd a(crg $$0, ht.a $$1, edd $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dhi $$9 = $$0.a_($$1);
                  if ($$9.a(cvc.dQ) || $$9.a(cvc.oi)) {
                     return edd.p;
                  }

                  if (a($$9)) {
                     return edd.n;
                  }

                  if ($$0.b_($$1).a(arl.a)) {
                     return edd.k;
                  }

                  if ($$9.a(cvc.cd) || $$9.a(cvc.st)) {
                     return edd.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static edd b(crg $$0, ht $$1) {
      dhi $$2 = $$0.a_($$1);
      cva $$3 = $$2.b();
      if ($$2.i()) {
         return edd.b;
      } else if ($$2.a(arg.P) || $$2.a(cvc.fm) || $$2.a(cvc.sD)) {
         return edd.e;
      } else if ($$2.a(cvc.qP)) {
         return edd.f;
      } else if ($$2.a(cvc.dQ) || $$2.a(cvc.oi)) {
         return edd.q;
      } else if ($$2.a(cvc.pg)) {
         return edd.w;
      } else if ($$2.a(cvc.fC)) {
         return edd.x;
      } else if (!$$2.a(cvc.cd) && !$$2.a(cvc.st)) {
         ecs $$4 = $$0.b_($$1);
         if ($$4.a(arl.b)) {
            return edd.i;
         } else if (a($$2)) {
            return edd.o;
         } else if ($$3 instanceof cxg $$5) {
            if ($$2.c(cxg.c)) {
               return edd.r;
            } else {
               return $$5.b().c() ? edd.s : edd.t;
            }
         } else if ($$3 instanceof cup) {
            return edd.l;
         } else if ($$3 instanceof czj) {
            return edd.v;
         } else if (!$$2.a(arg.S) && !$$2.a(arg.L) && (!($$3 instanceof cxz) || $$2.c(cxz.b))) {
            if (!$$2.a($$0, $$1, edi.a)) {
               return edd.a;
            } else {
               return $$4.a(arl.a) ? edd.j : edd.b;
            }
         } else {
            return edd.h;
         }
      } else {
         return edd.y;
      }
   }

   public static boolean a(dhi $$0) {
      return $$0.a(arg.aJ) || $$0.a(cvc.H) || $$0.a(cvc.kJ) || cvo.g($$0) || $$0.a(cvc.fv);
   }
}

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class eby extends ebs {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<ebp> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<eia> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(crm $$0, bkl $$1) {
      super.a($$0, $$1);
      $$1.C();
   }

   @Override
   public void b() {
      this.b.E();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public ebr a() {
      ht.a $$0 = new ht.a();
      int $$1 = this.b.dr();
      dgb $$2 = this.a.a_($$0.b(this.b.dq(), (double)$$1, this.b.dw()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aX()) {
            while (true) {
               if (!$$2.a(cuc.G) && $$2.u() != ebf.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.dq(), (double)(++$$1), this.b.dw()));
            }
         } else if (this.b.aA()) {
            $$1 = asy.a(this.b.ds() + 0.5);
         } else {
            ht $$3 = this.b.dl();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, ebu.a)) && $$3.v() > this.b.dL().I_()) {
               $$3 = $$3.d();
            }

            $$1 = $$3.c().v();
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a_($$0.b(this.b.dq(), (double)(++$$1), this.b.dw()));
         }

         $$1--;
      }

      ht $$4 = this.b.dl();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         eia $$5 = this.b.cG();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new ht($$4.u(), $$1, $$4.w()));
   }

   protected ebr c(ht $$0) {
      ebr $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(ht $$0) {
      ebp $$1 = this.a(this.b, $$0);
      return $$1 != ebp.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public ebx a(double $$0, double $$1, double $$2) {
      return this.a(this.b(asy.a($$0), asy.a($$1), asy.a($$2)));
   }

   @Override
   public int a(ebr[] $$0, ebr $$1) {
      int $$2 = 0;
      int $$3 = 0;
      ebp $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      ebp $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != ebp.w) {
         $$3 = asy.d(Math.max(1.0F, this.b.dF()));
      }

      double $$6 = this.d(new ht($$1.a, $$1.b, $$1.c));
      ebr $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, hx.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      ebr $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, hx.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      ebr $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, hx.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      ebr $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, hx.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      ebr $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, hx.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      ebr $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, hx.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      ebr $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, hx.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      ebr $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, hx.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable ebr $$0, ebr $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(ebr $$0, @Nullable ebr $$1, @Nullable ebr $$2, @Nullable ebr $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != ebp.d && $$2.l != ebp.d && $$3.l != ebp.d) {
         boolean $$4 = $$2.l == ebp.h && $$1.l == ebp.h && (double)this.b.df() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(ebp $$0) {
      return $$0 == ebp.h || $$0 == ebp.s || $$0 == ebp.t;
   }

   private boolean b(ebr $$0) {
      eia $$1 = this.b.cG();
      eif $$2 = new eif((double)$$0.a - this.b.dq() + $$1.b() / 2.0, (double)$$0.b - this.b.ds() + $$1.c() / 2.0, (double)$$0.c - this.b.dw() + $$1.d() / 2.0);
      int $$3 = asy.c($$2.f() / $$1.a());
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
      return (this.f() || this.c()) && this.a.b_($$0).a(aqx.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(cqf $$0, ht $$1) {
      ht $$2 = $$1.d();
      eiy $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(hx.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected ebr a(int $$0, int $$1, int $$2, int $$3, double $$4, hx $$5, ebp $$6) {
      ebr $$7 = null;
      ht.a $$8 = new ht.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         ebp $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.df() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != ebp.c && (!this.c() || $$10 != ebp.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != ebp.h || this.g()) && $$10 != ebp.m && $$10 != ebp.e && $$10 != ebp.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == ebp.b || $$7.l == ebp.c) && this.b.df() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  eia $$15 = new eia(
                     $$13 - $$12,
                     this.d($$8.b($$13, (double)($$1 + 1), $$14)) + 0.001,
                     $$14 - $$12,
                     $$13 + $$12,
                     (double)this.b.dg() + this.d($$8.b((double)$$7.a, (double)$$7.b, (double)$$7.c)) - 0.002,
                     $$14 + $$12
                  );
                  if (this.a($$15)) {
                     $$7 = null;
                  }
               }
            }

            if (!this.c() && $$10 == ebp.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != ebp.j) {
                  return $$7;
               }

               while ($$1 > this.b.dL().I_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != ebp.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == ebp.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == ebp.b) {
                  if (--$$1 < this.b.dL().I_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.ct()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != ebp.b && $$11 >= 0.0F) {
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
      return Math.max(1.125, (double)this.b.dF());
   }

   private ebr a(int $$0, int $$1, int $$2, ebp $$3, float $$4) {
      ebr $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private ebr a(int $$0, int $$1, int $$2) {
      ebr $$3 = this.b($$0, $$1, $$2);
      $$3.l = ebp.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(eia $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public ebp a(cqf $$0, int $$1, int $$2, int $$3, bkl $$4) {
      EnumSet<ebp> $$5 = EnumSet.noneOf(ebp.class);
      ebp $$6 = ebp.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dl());
      if ($$5.contains(ebp.h)) {
         return ebp.h;
      } else if ($$5.contains(ebp.m)) {
         return ebp.m;
      } else {
         ebp $$7 = ebp.a;

         for (ebp $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == ebp.b && $$4.a($$7) == 0.0F && this.d <= 1 ? ebp.b : $$7;
      }
   }

   public ebp a(cqf $$0, int $$1, int $$2, int $$3, EnumSet<ebp> $$4, ebp $$5, ht $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               ebp $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected ebp a(cqf $$0, ht $$1, ebp $$2) {
      boolean $$3 = this.d();
      if ($$2 == ebp.s && this.e() && $$3) {
         $$2 = ebp.d;
      }

      if ($$2 == ebp.r && !$$3) {
         $$2 = ebp.a;
      }

      if ($$2 == ebp.l && !($$0.a_($$1).b() instanceof ctp) && !($$0.a_($$1.d()).b() instanceof ctp)) {
         $$2 = ebp.m;
      }

      return $$2;
   }

   protected ebp a(bkl $$0, ht $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected ebp a(bkl $$0, int $$1, int $$2, int $$3) {
      return (ebp)this.m.computeIfAbsent(ht.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public ebp a(cqf $$0, int $$1, int $$2, int $$3) {
      return a($$0, new ht.a($$1, $$2, $$3));
   }

   public static ebp a(cqf $$0, ht.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      ebp $$5 = b($$0, $$1);
      if ($$5 == ebp.b && $$3 >= $$0.I_() + 1) {
         ebp $$6 = b($$0, $$1.d($$2, $$3 - 1, $$4));
         $$5 = $$6 != ebp.c && $$6 != ebp.b && $$6 != ebp.j && $$6 != ebp.i ? ebp.c : ebp.b;
         if ($$6 == ebp.o) {
            $$5 = ebp.o;
         }

         if ($$6 == ebp.q) {
            $$5 = ebp.q;
         }

         if ($$6 == ebp.w) {
            $$5 = ebp.w;
         }

         if ($$6 == ebp.f) {
            $$5 = ebp.g;
         }

         if ($$6 == ebp.y) {
            $$5 = ebp.y;
         }
      }

      if ($$5 == ebp.c) {
         $$5 = a($$0, $$1.d($$2, $$3, $$4), $$5);
      }

      return $$5;
   }

   public static ebp a(cqf $$0, ht.a $$1, ebp $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dgb $$9 = $$0.a_($$1);
                  if ($$9.a(cuc.dQ) || $$9.a(cuc.oi)) {
                     return ebp.p;
                  }

                  if (a($$9)) {
                     return ebp.n;
                  }

                  if ($$0.b_($$1).a(aqx.a)) {
                     return ebp.k;
                  }

                  if ($$9.a(cuc.cd) || $$9.a(cuc.rs)) {
                     return ebp.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static ebp b(cqf $$0, ht $$1) {
      dgb $$2 = $$0.a_($$1);
      cua $$3 = $$2.b();
      if ($$2.i()) {
         return ebp.b;
      } else if ($$2.a(aqs.P) || $$2.a(cuc.fm) || $$2.a(cuc.rC)) {
         return ebp.e;
      } else if ($$2.a(cuc.qC)) {
         return ebp.f;
      } else if ($$2.a(cuc.dQ) || $$2.a(cuc.oi)) {
         return ebp.q;
      } else if ($$2.a(cuc.pg)) {
         return ebp.w;
      } else if ($$2.a(cuc.fC)) {
         return ebp.x;
      } else if (!$$2.a(cuc.cd) && !$$2.a(cuc.rs)) {
         ebe $$4 = $$0.b_($$1);
         if ($$4.a(aqx.b)) {
            return ebp.i;
         } else if (a($$2)) {
            return ebp.o;
         } else if ($$3 instanceof cwe $$5) {
            if ($$2.c(cwe.c)) {
               return ebp.r;
            } else {
               return $$5.b().c() ? ebp.s : ebp.t;
            }
         } else if ($$3 instanceof ctp) {
            return ebp.l;
         } else if ($$3 instanceof cyi) {
            return ebp.v;
         } else if (!$$2.a(aqs.S) && !$$2.a(aqs.L) && (!($$3 instanceof cwx) || $$2.c(cwx.b))) {
            if (!$$2.a($$0, $$1, ebu.a)) {
               return ebp.a;
            } else {
               return $$4.a(aqx.a) ? ebp.j : ebp.b;
            }
         } else {
            return ebp.h;
         }
      } else {
         return ebp.y;
      }
   }

   public static boolean a(dgb $$0) {
      return $$0.a(aqs.aJ) || $$0.a(cuc.H) || $$0.a(cuc.kJ) || cuo.g($$0) || $$0.a(cuc.fv);
   }
}

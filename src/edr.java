import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class edr extends edl {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<edi> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<eju> n = new Object2BooleanOpenHashMap();

   @Override
   public void a(css $$0, bln $$1) {
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
   public edk a() {
      hx.a $$0 = new hx.a();
      int $$1 = this.b.dt();
      dhn $$2 = this.a.a_($$0.b(this.b.ds(), (double)$$1, this.b.dy()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.aZ()) {
            while (true) {
               if (!$$2.a(cvh.G) && $$2.u() != ecy.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a_($$0.b(this.b.ds(), (double)(++$$1), this.b.dy()));
            }
         } else if (this.b.aC()) {
            $$1 = atq.a(this.b.du() + 0.5);
         } else {
            hx $$3 = this.b.dn();

            while ((this.a.a_($$3).i() || this.a.a_($$3).a(this.a, $$3, edn.a)) && $$3.v() > this.b.dN().J_()) {
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

      hx $$4 = this.b.dn();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         eju $$5 = this.b.cH();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new hx($$4.u(), $$1, $$4.w()));
   }

   protected edk c(hx $$0) {
      edk $$1 = this.b($$0);
      $$1.l = this.a(this.b, $$1.a());
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(hx $$0) {
      edi $$1 = this.a(this.b, $$0);
      return $$1 != edi.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public edq a(double $$0, double $$1, double $$2) {
      return this.a(this.b(atq.a($$0), atq.a($$1), atq.a($$2)));
   }

   @Override
   public int a(edk[] $$0, edk $$1) {
      int $$2 = 0;
      int $$3 = 0;
      edi $$4 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      edi $$5 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != edi.w) {
         $$3 = atq.d(Math.max(1.0F, this.b.dH()));
      }

      double $$6 = this.d(new hx($$1.a, $$1.b, $$1.c));
      edk $$7 = this.a($$1.a, $$1.b, $$1.c + 1, $$3, $$6, ib.d, $$5);
      if (this.a($$7, $$1)) {
         $$0[$$2++] = $$7;
      }

      edk $$8 = this.a($$1.a - 1, $$1.b, $$1.c, $$3, $$6, ib.e, $$5);
      if (this.a($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      edk $$9 = this.a($$1.a + 1, $$1.b, $$1.c, $$3, $$6, ib.f, $$5);
      if (this.a($$9, $$1)) {
         $$0[$$2++] = $$9;
      }

      edk $$10 = this.a($$1.a, $$1.b, $$1.c - 1, $$3, $$6, ib.c, $$5);
      if (this.a($$10, $$1)) {
         $$0[$$2++] = $$10;
      }

      edk $$11 = this.a($$1.a - 1, $$1.b, $$1.c - 1, $$3, $$6, ib.c, $$5);
      if (this.a($$1, $$8, $$10, $$11)) {
         $$0[$$2++] = $$11;
      }

      edk $$12 = this.a($$1.a + 1, $$1.b, $$1.c - 1, $$3, $$6, ib.c, $$5);
      if (this.a($$1, $$9, $$10, $$12)) {
         $$0[$$2++] = $$12;
      }

      edk $$13 = this.a($$1.a - 1, $$1.b, $$1.c + 1, $$3, $$6, ib.d, $$5);
      if (this.a($$1, $$8, $$7, $$13)) {
         $$0[$$2++] = $$13;
      }

      edk $$14 = this.a($$1.a + 1, $$1.b, $$1.c + 1, $$3, $$6, ib.d, $$5);
      if (this.a($$1, $$9, $$7, $$14)) {
         $$0[$$2++] = $$14;
      }

      return $$2;
   }

   protected boolean a(@Nullable edk $$0, edk $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(edk $$0, @Nullable edk $$1, @Nullable edk $$2, @Nullable edk $$3) {
      if ($$3 == null || $$2 == null || $$1 == null) {
         return false;
      } else if ($$3.i) {
         return false;
      } else if ($$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != edi.d && $$2.l != edi.d && $$3.l != edi.d) {
         boolean $$4 = $$2.l == edi.h && $$1.l == edi.h && (double)this.b.dh() < 0.5;
         return $$3.k >= 0.0F && ($$2.b < $$0.b || $$2.k >= 0.0F || $$4) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$4);
      } else {
         return false;
      }
   }

   private static boolean a(edi $$0) {
      return $$0 == edi.h || $$0 == edi.s || $$0 == edi.t;
   }

   private boolean b(edk $$0) {
      eju $$1 = this.b.cH();
      ejz $$2 = new ejz((double)$$0.a - this.b.ds() + $$1.b() / 2.0, (double)$$0.b - this.b.du() + $$1.c() / 2.0, (double)$$0.c - this.b.dy() + $$1.d() / 2.0);
      int $$3 = atq.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(hx $$0) {
      return (this.f() || this.c()) && this.a.b_($$0).a(arp.a) ? (double)$$0.v() + 0.5 : a(this.a, $$0);
   }

   public static double a(crl $$0, hx $$1) {
      hx $$2 = $$1.d();
      eks $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ib.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected edk a(int $$0, int $$1, int $$2, int $$3, double $$4, ib $$5, edi $$6) {
      edk $$7 = null;
      hx.a $$8 = new hx.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         edi $$10 = this.a(this.b, $$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         double $$12 = (double)this.b.dh() / 2.0;
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != edi.c && (!this.c() || $$10 != edi.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != edi.h || this.g()) && $$10 != edi.m && $$10 != edi.e && $$10 != edi.f) {
               $$7 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
               if ($$7 != null && ($$7.l == edi.b || $$7.l == edi.c) && this.b.dh() < 1.0F) {
                  double $$13 = (double)($$0 - $$5.j()) + 0.5;
                  double $$14 = (double)($$2 - $$5.l()) + 0.5;
                  eju $$15 = new eju(
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

            if (!this.c() && $$10 == edi.j && !this.f()) {
               if (this.a(this.b, $$0, $$1 - 1, $$2) != edi.j) {
                  return $$7;
               }

               while ($$1 > this.b.dN().J_()) {
                  $$10 = this.a(this.b, $$0, --$$1, $$2);
                  if ($$10 != edi.j) {
                     return $$7;
                  }

                  $$7 = this.a($$0, $$1, $$2, $$10, this.b.a($$10));
               }
            }

            if ($$10 == edi.b) {
               int $$16 = 0;
               int $$17 = $$1;

               while ($$10 == edi.b) {
                  if (--$$1 < this.b.dN().J_()) {
                     return this.a($$0, $$17, $$2);
                  }

                  if ($$16++ >= this.b.cu()) {
                     return this.a($$0, $$1, $$2);
                  }

                  $$10 = this.a(this.b, $$0, $$1, $$2);
                  $$11 = this.b.a($$10);
                  if ($$10 != edi.b && $$11 >= 0.0F) {
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

   private edk a(int $$0, int $$1, int $$2, edi $$3, float $$4) {
      edk $$5 = this.b($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private edk a(int $$0, int $$1, int $$2) {
      edk $$3 = this.b($$0, $$1, $$2);
      $$3.l = edi.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private boolean a(eju $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a(this.b, $$0));
   }

   @Override
   public edi a(crl $$0, int $$1, int $$2, int $$3, bln $$4) {
      EnumSet<edi> $$5 = EnumSet.noneOf(edi.class);
      edi $$6 = edi.a;
      $$6 = this.a($$0, $$1, $$2, $$3, $$5, $$6, $$4.dn());
      if ($$5.contains(edi.h)) {
         return edi.h;
      } else if ($$5.contains(edi.m)) {
         return edi.m;
      } else {
         edi $$7 = edi.a;

         for (edi $$8 : $$5) {
            if ($$4.a($$8) < 0.0F) {
               return $$8;
            }

            if ($$4.a($$8) >= $$4.a($$7)) {
               $$7 = $$8;
            }
         }

         return $$6 == edi.b && $$4.a($$7) == 0.0F && this.d <= 1 ? edi.b : $$7;
      }
   }

   public edi a(crl $$0, int $$1, int $$2, int $$3, EnumSet<edi> $$4, edi $$5, hx $$6) {
      for (int $$7 = 0; $$7 < this.d; $$7++) {
         for (int $$8 = 0; $$8 < this.e; $$8++) {
            for (int $$9 = 0; $$9 < this.f; $$9++) {
               int $$10 = $$7 + $$1;
               int $$11 = $$8 + $$2;
               int $$12 = $$9 + $$3;
               edi $$13 = this.a($$0, $$10, $$11, $$12);
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

   protected edi a(crl $$0, hx $$1, edi $$2) {
      boolean $$3 = this.d();
      if ($$2 == edi.s && this.e() && $$3) {
         $$2 = edi.d;
      }

      if ($$2 == edi.r && !$$3) {
         $$2 = edi.a;
      }

      if ($$2 == edi.l && !($$0.a_($$1).b() instanceof cuu) && !($$0.a_($$1.d()).b() instanceof cuu)) {
         $$2 = edi.m;
      }

      return $$2;
   }

   protected edi a(bln $$0, hx $$1) {
      return this.a($$0, $$1.u(), $$1.v(), $$1.w());
   }

   protected edi a(bln $$0, int $$1, int $$2, int $$3) {
      return (edi)this.m.computeIfAbsent(hx.a($$1, $$2, $$3), $$4 -> this.a(this.a, $$1, $$2, $$3, $$0));
   }

   @Override
   public edi a(crl $$0, int $$1, int $$2, int $$3) {
      return a($$0, new hx.a($$1, $$2, $$3));
   }

   public static edi a(crl $$0, hx.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      edi $$5 = b($$0, $$1);
      if ($$5 == edi.b && $$3 >= $$0.J_() + 1) {
         edi $$6 = b($$0, $$1.d($$2, $$3 - 1, $$4));
         $$5 = $$6 != edi.c && $$6 != edi.b && $$6 != edi.j && $$6 != edi.i ? edi.c : edi.b;
         if ($$6 == edi.o) {
            $$5 = edi.o;
         }

         if ($$6 == edi.q) {
            $$5 = edi.q;
         }

         if ($$6 == edi.w) {
            $$5 = edi.w;
         }

         if ($$6 == edi.f) {
            $$5 = edi.g;
         }

         if ($$6 == edi.y) {
            $$5 = edi.y;
         }
      }

      if ($$5 == edi.c) {
         $$5 = a($$0, $$1.d($$2, $$3, $$4), $$5);
      }

      return $$5;
   }

   public static edi a(crl $$0, hx.a $$1, edi $$2) {
      int $$3 = $$1.u();
      int $$4 = $$1.v();
      int $$5 = $$1.w();

      for (int $$6 = -1; $$6 <= 1; $$6++) {
         for (int $$7 = -1; $$7 <= 1; $$7++) {
            for (int $$8 = -1; $$8 <= 1; $$8++) {
               if ($$6 != 0 || $$8 != 0) {
                  $$1.d($$3 + $$6, $$4 + $$7, $$5 + $$8);
                  dhn $$9 = $$0.a_($$1);
                  if ($$9.a(cvh.dQ) || $$9.a(cvh.oi)) {
                     return edi.p;
                  }

                  if (a($$9)) {
                     return edi.n;
                  }

                  if ($$0.b_($$1).a(arp.a)) {
                     return edi.k;
                  }

                  if ($$9.a(cvh.cd) || $$9.a(cvh.st)) {
                     return edi.y;
                  }
               }
            }
         }
      }

      return $$2;
   }

   protected static edi b(crl $$0, hx $$1) {
      dhn $$2 = $$0.a_($$1);
      cvf $$3 = $$2.b();
      if ($$2.i()) {
         return edi.b;
      } else if ($$2.a(ark.P) || $$2.a(cvh.fm) || $$2.a(cvh.sD)) {
         return edi.e;
      } else if ($$2.a(cvh.qP)) {
         return edi.f;
      } else if ($$2.a(cvh.dQ) || $$2.a(cvh.oi)) {
         return edi.q;
      } else if ($$2.a(cvh.pg)) {
         return edi.w;
      } else if ($$2.a(cvh.fC)) {
         return edi.x;
      } else if (!$$2.a(cvh.cd) && !$$2.a(cvh.st)) {
         ecx $$4 = $$0.b_($$1);
         if ($$4.a(arp.b)) {
            return edi.i;
         } else if (a($$2)) {
            return edi.o;
         } else if ($$3 instanceof cxl $$5) {
            if ($$2.c(cxl.c)) {
               return edi.r;
            } else {
               return $$5.b().c() ? edi.s : edi.t;
            }
         } else if ($$3 instanceof cuu) {
            return edi.l;
         } else if ($$3 instanceof czo) {
            return edi.v;
         } else if (!$$2.a(ark.S) && !$$2.a(ark.L) && (!($$3 instanceof cye) || $$2.c(cye.b))) {
            if (!$$2.a($$0, $$1, edn.a)) {
               return edi.a;
            } else {
               return $$4.a(arp.a) ? edi.j : edi.b;
            }
         } else {
            return edi.h;
         }
      } else {
         return edi.y;
      }
   }

   public static boolean a(dhn $$0) {
      return $$0.a(ark.aJ) || $$0.a(cvh.H) || $$0.a(cvh.kJ) || cvt.g($$0) || $$0.a(cvh.fv);
   }
}

import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ebk {
   private static final int c = 2;
   public static final int a = 21;
   private static final int d = 3;
   public static final int b = 21;
   private static final dfi.f e = ($$0, $$1, $$2) -> $$0.a(csw.co);
   private static final float f = 4.0F;
   private static final double g = 1.0;
   private final cpw h;
   private final ha.a i;
   private final ha j;
   private int k;
   @Nullable
   private gw l;
   private int m;
   private final int n;

   public static Optional<ebk> a(cpw $$0, gw $$1, ha.a $$2) {
      return a($$0, $$1, $$0x -> $$0x.a() && $$0x.k == 0, $$2);
   }

   public static Optional<ebk> a(cpw $$0, gw $$1, Predicate<ebk> $$2, ha.a $$3) {
      Optional<ebk> $$4 = Optional.of(new ebk($$0, $$1, $$3)).filter($$2);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ha.a $$5 = $$3 == ha.a.a ? ha.a.c : ha.a.a;
         return Optional.of(new ebk($$0, $$1, $$5)).filter($$2);
      }
   }

   public ebk(cpw $$0, gw $$1, ha.a $$2) {
      this.h = $$0;
      this.i = $$2;
      this.j = $$2 == ha.a.a ? ha.e : ha.d;
      this.l = this.a($$1);
      if (this.l == null) {
         this.l = $$1;
         this.n = 1;
         this.m = 1;
      } else {
         this.n = this.d();
         if (this.n > 0) {
            this.m = this.e();
         }
      }
   }

   @Nullable
   private gw a(gw $$0) {
      int $$1 = Math.max(this.h.H_(), $$0.v() - 21);

      while ($$0.v() > $$1 && a(this.h.a_($$0.d()))) {
         $$0 = $$0.d();
      }

      ha $$2 = this.j.g();
      int $$3 = this.a($$0, $$2) - 1;
      return $$3 < 0 ? null : $$0.a($$2, $$3);
   }

   private int d() {
      int $$0 = this.a(this.l, this.j);
      return $$0 >= 2 && $$0 <= 21 ? $$0 : 0;
   }

   private int a(gw $$0, ha $$1) {
      gw.a $$2 = new gw.a();

      for (int $$3 = 0; $$3 <= 21; $$3++) {
         $$2.g($$0).c($$1, $$3);
         dfj $$4 = this.h.a_($$2);
         if (!a($$4)) {
            if (e.test($$4, this.h, $$2)) {
               return $$3;
            }
            break;
         }

         dfj $$5 = this.h.a_($$2.c(ha.a));
         if (!e.test($$5, this.h, $$2)) {
            break;
         }
      }

      return 0;
   }

   private int e() {
      gw.a $$0 = new gw.a();
      int $$1 = this.a($$0);
      return $$1 >= 3 && $$1 <= 21 && this.a($$0, $$1) ? $$1 : 0;
   }

   private boolean a(gw.a $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.n; $$2++) {
         gw.a $$3 = $$0.g(this.l).c(ha.b, $$1).c(this.j, $$2);
         if (!e.test(this.h.a_($$3), this.h, $$3)) {
            return false;
         }
      }

      return true;
   }

   private int a(gw.a $$0) {
      for (int $$1 = 0; $$1 < 21; $$1++) {
         $$0.g(this.l).c(ha.b, $$1).c(this.j, -1);
         if (!e.test(this.h.a_($$0), this.h, $$0)) {
            return $$1;
         }

         $$0.g(this.l).c(ha.b, $$1).c(this.j, this.n);
         if (!e.test(this.h.a_($$0), this.h, $$0)) {
            return $$1;
         }

         for (int $$2 = 0; $$2 < this.n; $$2++) {
            $$0.g(this.l).c(ha.b, $$1).c(this.j, $$2);
            dfj $$3 = this.h.a_($$0);
            if (!a($$3)) {
               return $$1;
            }

            if ($$3.a(csw.ee)) {
               this.k++;
            }
         }
      }

      return 21;
   }

   private static boolean a(dfj $$0) {
      return $$0.i() || $$0.a(aps.aJ) || $$0.a(csw.ee);
   }

   public boolean a() {
      return this.l != null && this.n >= 2 && this.n <= 21 && this.m >= 3 && this.m <= 21;
   }

   public void b() {
      dfj $$0 = csw.ee.n().a(cxx.a, this.i);
      gw.a(this.l, this.l.a(ha.b, this.m - 1).a(this.j, this.n - 1)).forEach($$1 -> this.h.a($$1, $$0, 18));
   }

   public boolean c() {
      return this.a() && this.k == this.n * this.m;
   }

   public static ehn a(l.a $$0, ha.a $$1, ehn $$2, bir $$3) {
      double $$4 = (double)$$0.b - (double)$$3.a;
      double $$5 = (double)$$0.c - (double)$$3.b;
      gw $$6 = $$0.a;
      double $$8;
      if ($$4 > 0.0) {
         float $$7 = (float)$$6.a($$1) + $$3.a / 2.0F;
         $$8 = arw.a(arw.c($$2.a($$1) - (double)$$7, 0.0, $$4), 0.0, 1.0);
      } else {
         $$8 = 0.5;
      }

      double $$11;
      if ($$5 > 0.0) {
         ha.a $$10 = ha.a.b;
         $$11 = arw.a(arw.c($$2.a($$10) - (double)$$6.a($$10), 0.0, $$5), 0.0, 1.0);
      } else {
         $$11 = 0.0;
      }

      ha.a $$13 = $$1 == ha.a.a ? ha.a.c : ha.a.a;
      double $$14 = $$2.a($$13) - ((double)$$6.a($$13) + 0.5);
      return new ehn($$8, $$11, $$14);
   }

   public static ebj a(akq $$0, l.a $$1, ha.a $$2, ehn $$3, biq $$4, ehn $$5, float $$6, float $$7) {
      gw $$8 = $$1.a;
      dfj $$9 = $$0.a_($$8);
      ha.a $$10 = $$9.d(dfz.H).orElse(ha.a.a);
      double $$11 = (double)$$1.b;
      double $$12 = (double)$$1.c;
      bir $$13 = $$4.a($$4.an());
      int $$14 = $$2 == $$10 ? 0 : 90;
      ehn $$15 = $$2 == $$10 ? $$5 : new ehn($$5.e, $$5.d, -$$5.c);
      double $$16 = (double)$$13.a / 2.0 + ($$11 - (double)$$13.a) * $$3.a();
      double $$17 = ($$12 - (double)$$13.b) * $$3.b();
      double $$18 = 0.5 + $$3.c();
      boolean $$19 = $$10 == ha.a.a;
      ehn $$20 = new ehn((double)$$8.u() + ($$19 ? $$16 : $$18), (double)$$8.v() + $$17, (double)$$8.w() + ($$19 ? $$18 : $$16));
      ehn $$21 = a($$20, $$0, $$4, $$13);
      return new ebj($$21, $$15, $$6 + (float)$$14, $$7);
   }

   private static ehn a(ehn $$0, akq $$1, biq $$2, bir $$3) {
      if (!($$3.a > 4.0F) && !($$3.b > 4.0F)) {
         double $$4 = (double)$$3.b / 2.0;
         ehn $$5 = $$0.b(0.0, $$4, 0.0);
         eig $$6 = eid.a(ehi.a($$5, (double)$$3.a, 0.0, (double)$$3.a).b(0.0, 1.0, 0.0).g(1.0E-6));
         Optional<ehn> $$7 = $$1.a($$2, $$6, $$5, (double)$$3.a, (double)$$3.b, (double)$$3.a);
         Optional<ehn> $$8 = $$7.map($$1x -> $$1x.a(0.0, $$4, 0.0));
         return $$8.orElse($$0);
      } else {
         return $$0;
      }
   }
}

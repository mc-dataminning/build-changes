import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class eqe {
   private static final int c = 2;
   public static final int a = 21;
   private static final int d = 3;
   public static final int b = 21;
   private static final dtb.f e = ($$0, $$1, $$2) -> $$0.a(dfe.cZ);
   private static final float f = 4.0F;
   private static final double g = 1.0;
   private final dcb h;
   private final iw.a i;
   private final iw j;
   private int k;
   @Nullable
   private ir l;
   private int m;
   private final int n;

   public static Optional<eqe> a(dcb $$0, ir $$1, iw.a $$2) {
      return a($$0, $$1, $$0x -> $$0x.a() && $$0x.k == 0, $$2);
   }

   public static Optional<eqe> a(dcb $$0, ir $$1, Predicate<eqe> $$2, iw.a $$3) {
      Optional<eqe> $$4 = Optional.of(new eqe($$0, $$1, $$3)).filter($$2);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         iw.a $$5 = $$3 == iw.a.a ? iw.a.c : iw.a.a;
         return Optional.of(new eqe($$0, $$1, $$5)).filter($$2);
      }
   }

   public eqe(dcb $$0, ir $$1, iw.a $$2) {
      this.h = $$0;
      this.i = $$2;
      this.j = $$2 == iw.a.a ? iw.e : iw.d;
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
   private ir a(ir $$0) {
      int $$1 = Math.max(this.h.J_(), $$0.v() - 21);

      while ($$0.v() > $$1 && a(this.h.a_($$0.d()))) {
         $$0 = $$0.d();
      }

      iw $$2 = this.j.g();
      int $$3 = this.a($$0, $$2) - 1;
      return $$3 < 0 ? null : $$0.a($$2, $$3);
   }

   private int d() {
      int $$0 = this.a(this.l, this.j);
      return $$0 >= 2 && $$0 <= 21 ? $$0 : 0;
   }

   private int a(ir $$0, iw $$1) {
      ir.a $$2 = new ir.a();

      for (int $$3 = 0; $$3 <= 21; $$3++) {
         $$2.g($$0).c($$1, $$3);
         dtc $$4 = this.h.a_($$2);
         if (!a($$4)) {
            if (e.test($$4, this.h, $$2)) {
               return $$3;
            }
            break;
         }

         dtc $$5 = this.h.a_($$2.d(iw.a));
         if (!e.test($$5, this.h, $$2)) {
            break;
         }
      }

      return 0;
   }

   private int e() {
      ir.a $$0 = new ir.a();
      int $$1 = this.a($$0);
      return $$1 >= 3 && $$1 <= 21 && this.a($$0, $$1) ? $$1 : 0;
   }

   private boolean a(ir.a $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.n; $$2++) {
         ir.a $$3 = $$0.g(this.l).c(iw.b, $$1).c(this.j, $$2);
         if (!e.test(this.h.a_($$3), this.h, $$3)) {
            return false;
         }
      }

      return true;
   }

   private int a(ir.a $$0) {
      for (int $$1 = 0; $$1 < 21; $$1++) {
         $$0.g(this.l).c(iw.b, $$1).c(this.j, -1);
         if (!e.test(this.h.a_($$0), this.h, $$0)) {
            return $$1;
         }

         $$0.g(this.l).c(iw.b, $$1).c(this.j, this.n);
         if (!e.test(this.h.a_($$0), this.h, $$0)) {
            return $$1;
         }

         for (int $$2 = 0; $$2 < this.n; $$2++) {
            $$0.g(this.l).c(iw.b, $$1).c(this.j, $$2);
            dtc $$3 = this.h.a_($$0);
            if (!a($$3)) {
               return $$1;
            }

            if ($$3.a(dfe.eR)) {
               this.k++;
            }
         }
      }

      return 21;
   }

   private static boolean a(dtc $$0) {
      return $$0.i() || $$0.a(awe.aM) || $$0.a(dfe.eR);
   }

   public boolean a() {
      return this.l != null && this.n >= 2 && this.n <= 21 && this.m >= 3 && this.m <= 21;
   }

   public void b() {
      dtc $$0 = dfe.eR.n().a(dkl.b, this.i);
      ir.c(this.l, this.l.a(iw.b, this.m - 1).a(this.j, this.n - 1)).forEach($$1 -> this.h.a($$1, $$0, 18));
   }

   public boolean c() {
      return this.a() && this.k == this.n * this.m;
   }

   public static ewu a(l.a $$0, iw.a $$1, ewu $$2, bry $$3) {
      double $$4 = (double)$$0.b - (double)$$3.a();
      double $$5 = (double)$$0.c - (double)$$3.b();
      ir $$6 = $$0.a;
      double $$8;
      if ($$4 > 0.0) {
         double $$7 = (double)$$6.a($$1) + (double)$$3.a() / 2.0;
         $$8 = aym.a(aym.c($$2.a($$1) - $$7, 0.0, $$4), 0.0, 1.0);
      } else {
         $$8 = 0.5;
      }

      double $$11;
      if ($$5 > 0.0) {
         iw.a $$10 = iw.a.b;
         $$11 = aym.a(aym.c($$2.a($$10) - (double)$$6.a($$10), 0.0, $$5), 0.0, 1.0);
      } else {
         $$11 = 0.0;
      }

      iw.a $$13 = $$1 == iw.a.a ? iw.a.c : iw.a.a;
      double $$14 = $$2.a($$13) - ((double)$$6.a($$13) + 0.5);
      return new ewu($$8, $$11, $$14);
   }

   public static eqd a(aqt $$0, l.a $$1, iw.a $$2, ewu $$3, brv $$4, ewu $$5, float $$6, float $$7) {
      ir $$8 = $$1.a;
      dtc $$9 = $$0.a_($$8);
      iw.a $$10 = $$9.d(dts.H).orElse(iw.a.a);
      double $$11 = (double)$$1.b;
      double $$12 = (double)$$1.c;
      bry $$13 = $$4.a($$4.ar());
      int $$14 = $$2 == $$10 ? 0 : 90;
      ewu $$15 = $$2 == $$10 ? $$5 : new ewu($$5.e, $$5.d, -$$5.c);
      double $$16 = (double)$$13.a() / 2.0 + ($$11 - (double)$$13.a()) * $$3.a();
      double $$17 = ($$12 - (double)$$13.b()) * $$3.b();
      double $$18 = 0.5 + $$3.c();
      boolean $$19 = $$10 == iw.a.a;
      ewu $$20 = new ewu((double)$$8.u() + ($$19 ? $$16 : $$18), (double)$$8.v() + $$17, (double)$$8.w() + ($$19 ? $$18 : $$16));
      ewu $$21 = a($$20, $$0, $$4, $$13);
      return new eqd($$21, $$15, $$6 + (float)$$14, $$7);
   }

   private static ewu a(ewu $$0, aqt $$1, brv $$2, bry $$3) {
      if (!($$3.a() > 4.0F) && !($$3.b() > 4.0F)) {
         double $$4 = (double)$$3.b() / 2.0;
         ewu $$5 = $$0.b(0.0, $$4, 0.0);
         exn $$6 = exk.a(ewp.a($$5, (double)$$3.a(), 0.0, (double)$$3.a()).b(0.0, 1.0, 0.0).g(1.0E-6));
         Optional<ewu> $$7 = $$1.a($$2, $$6, $$5, (double)$$3.a(), (double)$$3.b(), (double)$$3.a());
         Optional<ewu> $$8 = $$7.map($$1x -> $$1x.a(0.0, $$4, 0.0));
         return $$8.orElse($$0);
      } else {
         return $$0;
      }
   }
}

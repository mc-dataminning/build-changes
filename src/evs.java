import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;

public class evs {
   private static final int c = 2;
   public static final int a = 21;
   private static final int d = 3;
   public static final int b = 21;
   private static final dyl.f e = ($$0, $$1, $$2) -> $$0.a(dkw.cv);
   private static final float f = 4.0F;
   private static final double g = 1.0;
   private final jo.a h;
   private final jo i;
   private final int j;
   private final jj k;
   private final int l;
   private final int m;

   private evs(jo.a $$0, int $$1, jo $$2, jj $$3, int $$4, int $$5) {
      this.h = $$0;
      this.j = $$1;
      this.i = $$2;
      this.k = $$3;
      this.m = $$4;
      this.l = $$5;
   }

   public static Optional<evs> a(dhq $$0, jj $$1, jo.a $$2) {
      return a($$0, $$1, $$0x -> $$0x.a() && $$0x.j == 0, $$2);
   }

   public static Optional<evs> a(dhq $$0, jj $$1, Predicate<evs> $$2, jo.a $$3) {
      Optional<evs> $$4 = Optional.of(a((dgv)$$0, $$1, $$3)).filter($$2);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         jo.a $$5 = $$3 == jo.a.a ? jo.a.c : jo.a.a;
         return Optional.of(a((dgv)$$0, $$1, $$5)).filter($$2);
      }
   }

   public static evs a(dgv $$0, jj $$1, jo.a $$2) {
      jo $$3 = $$2 == jo.a.a ? jo.e : jo.d;
      jj $$4 = a($$0, $$3, $$1);
      if ($$4 == null) {
         return new evs($$2, 0, $$3, $$1, 0, 0);
      } else {
         int $$5 = a($$0, $$4, $$3);
         if ($$5 == 0) {
            return new evs($$2, 0, $$3, $$4, 0, 0);
         } else {
            MutableInt $$6 = new MutableInt();
            int $$7 = a($$0, $$4, $$3, $$5, $$6);
            return new evs($$2, $$6.getValue(), $$3, $$4, $$5, $$7);
         }
      }
   }

   @Nullable
   private static jj a(dgv $$0, jo $$1, jj $$2) {
      int $$3 = Math.max($$0.G_(), $$2.v() - 21);

      while ($$2.v() > $$3 && a($$0.a_($$2.e()))) {
         $$2 = $$2.e();
      }

      jo $$4 = $$1.g();
      int $$5 = b($$0, $$2, $$4) - 1;
      return $$5 < 0 ? null : $$2.a($$4, $$5);
   }

   private static int a(dgv $$0, jj $$1, jo $$2) {
      int $$3 = b($$0, $$1, $$2);
      return $$3 >= 2 && $$3 <= 21 ? $$3 : 0;
   }

   private static int b(dgv $$0, jj $$1, jo $$2) {
      jj.a $$3 = new jj.a();

      for (int $$4 = 0; $$4 <= 21; $$4++) {
         $$3.g($$1).c($$2, $$4);
         dym $$5 = $$0.a_($$3);
         if (!a($$5)) {
            if (e.test($$5, $$0, $$3)) {
               return $$4;
            }
            break;
         }

         dym $$6 = $$0.a_($$3.c(jo.a));
         if (!e.test($$6, $$0, $$3)) {
            break;
         }
      }

      return 0;
   }

   private static int a(dgv $$0, jj $$1, jo $$2, int $$3, MutableInt $$4) {
      jj.a $$5 = new jj.a();
      int $$6 = a($$0, $$1, $$2, $$5, $$3, $$4);
      return $$6 >= 3 && $$6 <= 21 && a($$0, $$1, $$2, $$5, $$3, $$6) ? $$6 : 0;
   }

   private static boolean a(dgv $$0, jj $$1, jo $$2, jj.a $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         jj.a $$7 = $$3.g($$1).c(jo.b, $$5).c($$2, $$6);
         if (!e.test($$0.a_($$7), $$0, $$7)) {
            return false;
         }
      }

      return true;
   }

   private static int a(dgv $$0, jj $$1, jo $$2, jj.a $$3, int $$4, MutableInt $$5) {
      for (int $$6 = 0; $$6 < 21; $$6++) {
         $$3.g($$1).c(jo.b, $$6).c($$2, -1);
         if (!e.test($$0.a_($$3), $$0, $$3)) {
            return $$6;
         }

         $$3.g($$1).c(jo.b, $$6).c($$2, $$4);
         if (!e.test($$0.a_($$3), $$0, $$3)) {
            return $$6;
         }

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$3.g($$1).c(jo.b, $$6).c($$2, $$7);
            dym $$8 = $$0.a_($$3);
            if (!a($$8)) {
               return $$6;
            }

            if ($$8.a(dkw.eq)) {
               $$5.increment();
            }
         }
      }

      return 21;
   }

   private static boolean a(dym $$0) {
      return $$0.l() || $$0.a(awz.aN) || $$0.a(dkw.eq);
   }

   public boolean a() {
      return this.m >= 2 && this.m <= 21 && this.l >= 3 && this.l <= 21;
   }

   public void a(dhq $$0) {
      dym $$1 = dkw.eq.m().b(dqd.b, this.h);
      jj.c(this.k, this.k.a(jo.b, this.l - 1).a(this.i, this.m - 1)).forEach($$2 -> $$0.a($$2, $$1, 18));
   }

   public boolean b() {
      return this.a() && this.j == this.m * this.l;
   }

   public static fcu a(l.a $$0, jo.a $$1, fcu $$2, bvv $$3) {
      double $$4 = (double)$$0.b - (double)$$3.a();
      double $$5 = (double)$$0.c - (double)$$3.b();
      jj $$6 = $$0.a;
      double $$8;
      if ($$4 > 0.0) {
         double $$7 = (double)$$6.a($$1) + (double)$$3.a() / 2.0;
         $$8 = azk.a(azk.c($$2.a($$1) - $$7, 0.0, $$4), 0.0, 1.0);
      } else {
         $$8 = 0.5;
      }

      double $$11;
      if ($$5 > 0.0) {
         jo.a $$10 = jo.a.b;
         $$11 = azk.a(azk.c($$2.a($$10) - (double)$$6.a($$10), 0.0, $$5), 0.0, 1.0);
      } else {
         $$11 = 0.0;
      }

      jo.a $$13 = $$1 == jo.a.a ? jo.a.c : jo.a.a;
      double $$14 = $$2.a($$13) - ((double)$$6.a($$13) + 0.5);
      return new fcu($$8, $$11, $$14);
   }

   public static fcu a(fcu $$0, arn $$1, bvs $$2, bvv $$3) {
      if (!($$3.a() > 4.0F) && !($$3.b() > 4.0F)) {
         double $$4 = (double)$$3.b() / 2.0;
         fcu $$5 = $$0.b(0.0, $$4, 0.0);
         fdo $$6 = fdl.a(fcp.a($$5, (double)$$3.a(), 0.0, (double)$$3.a()).b(0.0, 1.0, 0.0).g(1.0E-6));
         Optional<fcu> $$7 = $$1.a($$2, $$6, $$5, (double)$$3.a(), (double)$$3.b(), (double)$$3.a());
         Optional<fcu> $$8 = $$7.map($$1x -> $$1x.a(0.0, $$4, 0.0));
         return $$8.orElse($$0);
      } else {
         return $$0;
      }
   }
}

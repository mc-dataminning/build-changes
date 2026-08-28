import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;

public class eup {
   private static final int c = 2;
   public static final int a = 21;
   private static final int d = 3;
   public static final int b = 21;
   private static final dxn.f e = ($$0, $$1, $$2) -> $$0.a(dkf.cv);
   private static final float f = 4.0F;
   private static final double g = 1.0;
   private final jm.a h;
   private final jm i;
   private final int j;
   private final jh k;
   private final int l;
   private final int m;

   private eup(jm.a $$0, int $$1, jm $$2, jh $$3, int $$4, int $$5) {
      this.h = $$0;
      this.j = $$1;
      this.i = $$2;
      this.k = $$3;
      this.m = $$4;
      this.l = $$5;
   }

   public static Optional<eup> a(dha $$0, jh $$1, jm.a $$2) {
      return a($$0, $$1, $$0x -> $$0x.a() && $$0x.j == 0, $$2);
   }

   public static Optional<eup> a(dha $$0, jh $$1, Predicate<eup> $$2, jm.a $$3) {
      Optional<eup> $$4 = Optional.of(a((dge)$$0, $$1, $$3)).filter($$2);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         jm.a $$5 = $$3 == jm.a.a ? jm.a.c : jm.a.a;
         return Optional.of(a((dge)$$0, $$1, $$5)).filter($$2);
      }
   }

   public static eup a(dge $$0, jh $$1, jm.a $$2) {
      jm $$3 = $$2 == jm.a.a ? jm.e : jm.d;
      jh $$4 = a($$0, $$3, $$1);
      if ($$4 == null) {
         return new eup($$2, 0, $$3, $$1, 0, 0);
      } else {
         int $$5 = a($$0, $$4, $$3);
         if ($$5 == 0) {
            return new eup($$2, 0, $$3, $$4, 0, 0);
         } else {
            MutableInt $$6 = new MutableInt();
            int $$7 = a($$0, $$4, $$3, $$5, $$6);
            return new eup($$2, $$6.getValue(), $$3, $$4, $$5, $$7);
         }
      }
   }

   @Nullable
   private static jh a(dge $$0, jm $$1, jh $$2) {
      int $$3 = Math.max($$0.L_(), $$2.v() - 21);

      while ($$2.v() > $$3 && a($$0.a_($$2.e()))) {
         $$2 = $$2.e();
      }

      jm $$4 = $$1.g();
      int $$5 = b($$0, $$2, $$4) - 1;
      return $$5 < 0 ? null : $$2.a($$4, $$5);
   }

   private static int a(dge $$0, jh $$1, jm $$2) {
      int $$3 = b($$0, $$1, $$2);
      return $$3 >= 2 && $$3 <= 21 ? $$3 : 0;
   }

   private static int b(dge $$0, jh $$1, jm $$2) {
      jh.a $$3 = new jh.a();

      for (int $$4 = 0; $$4 <= 21; $$4++) {
         $$3.g($$1).c($$2, $$4);
         dxo $$5 = $$0.a_($$3);
         if (!a($$5)) {
            if (e.test($$5, $$0, $$3)) {
               return $$4;
            }
            break;
         }

         dxo $$6 = $$0.a_($$3.c(jm.a));
         if (!e.test($$6, $$0, $$3)) {
            break;
         }
      }

      return 0;
   }

   private static int a(dge $$0, jh $$1, jm $$2, int $$3, MutableInt $$4) {
      jh.a $$5 = new jh.a();
      int $$6 = a($$0, $$1, $$2, $$5, $$3, $$4);
      return $$6 >= 3 && $$6 <= 21 && a($$0, $$1, $$2, $$5, $$3, $$6) ? $$6 : 0;
   }

   private static boolean a(dge $$0, jh $$1, jm $$2, jh.a $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         jh.a $$7 = $$3.g($$1).c(jm.b, $$5).c($$2, $$6);
         if (!e.test($$0.a_($$7), $$0, $$7)) {
            return false;
         }
      }

      return true;
   }

   private static int a(dge $$0, jh $$1, jm $$2, jh.a $$3, int $$4, MutableInt $$5) {
      for (int $$6 = 0; $$6 < 21; $$6++) {
         $$3.g($$1).c(jm.b, $$6).c($$2, -1);
         if (!e.test($$0.a_($$3), $$0, $$3)) {
            return $$6;
         }

         $$3.g($$1).c(jm.b, $$6).c($$2, $$4);
         if (!e.test($$0.a_($$3), $$0, $$3)) {
            return $$6;
         }

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$3.g($$1).c(jm.b, $$6).c($$2, $$7);
            dxo $$8 = $$0.a_($$3);
            if (!a($$8)) {
               return $$6;
            }

            if ($$8.a(dkf.eq)) {
               $$5.increment();
            }
         }
      }

      return 21;
   }

   private static boolean a(dxo $$0) {
      return $$0.l() || $$0.a(axk.aN) || $$0.a(dkf.eq);
   }

   public boolean a() {
      return this.m >= 2 && this.m <= 21 && this.l >= 3 && this.l <= 21;
   }

   public void a(dha $$0) {
      dxo $$1 = dkf.eq.m().b(dpk.b, this.h);
      jh.c(this.k, this.k.a(jm.b, this.l - 1).a(this.i, this.m - 1)).forEach($$2 -> $$0.a($$2, $$1, 18));
   }

   public boolean b() {
      return this.a() && this.j == this.m * this.l;
   }

   public static fbr a(l.a $$0, jm.a $$1, fbr $$2, bve $$3) {
      double $$4 = (double)$$0.b - (double)$$3.a();
      double $$5 = (double)$$0.c - (double)$$3.b();
      jh $$6 = $$0.a;
      double $$8;
      if ($$4 > 0.0) {
         double $$7 = (double)$$6.a($$1) + (double)$$3.a() / 2.0;
         $$8 = azu.a(azu.c($$2.a($$1) - $$7, 0.0, $$4), 0.0, 1.0);
      } else {
         $$8 = 0.5;
      }

      double $$11;
      if ($$5 > 0.0) {
         jm.a $$10 = jm.a.b;
         $$11 = azu.a(azu.c($$2.a($$10) - (double)$$6.a($$10), 0.0, $$5), 0.0, 1.0);
      } else {
         $$11 = 0.0;
      }

      jm.a $$13 = $$1 == jm.a.a ? jm.a.c : jm.a.a;
      double $$14 = $$2.a($$13) - ((double)$$6.a($$13) + 0.5);
      return new fbr($$8, $$11, $$14);
   }

   public static fbr a(fbr $$0, arx $$1, bvb $$2, bve $$3) {
      if (!($$3.a() > 4.0F) && !($$3.b() > 4.0F)) {
         double $$4 = (double)$$3.b() / 2.0;
         fbr $$5 = $$0.b(0.0, $$4, 0.0);
         fcl $$6 = fci.a(fbm.a($$5, (double)$$3.a(), 0.0, (double)$$3.a()).b(0.0, 1.0, 0.0).g(1.0E-6));
         Optional<fbr> $$7 = $$1.a($$2, $$6, $$5, (double)$$3.a(), (double)$$3.b(), (double)$$3.a());
         Optional<fbr> $$8 = $$7.map($$1x -> $$1x.a(0.0, $$4, 0.0));
         return $$8.orElse($$0);
      } else {
         return $$0;
      }
   }
}

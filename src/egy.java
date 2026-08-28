import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public class egy extends efw<eiq> {
   public egy(Codec<eiq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<eiq> $$0) {
      dhe $$1 = $$0.b();
      ji $$2 = $$0.e();
      if (!$$1.a_($$2).l()) {
         return false;
      } else {
         azg $$3 = $$0.d();
         ji $$4 = $$0.e();
         eiq $$5 = $$0.f();
         ji.a $$6 = $$4.k();
         if (a($$1, $$0.c(), $$5, $$3, $$6, $$4)) {
            a($$1, $$5, $$3, $$4, $$6);
         }

         return true;
      }
   }

   private static boolean a(dhe $$0, eiq $$1, ji $$2) {
      ji.a $$3 = $$2.k();

      for (int $$4 = 1; $$4 <= $$1.c; $$4++) {
         $$3.c(jn.b);
         dwv $$5 = $$0.a_($$3);
         if (!a($$5, $$4, $$1.n)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dwv $$0, int $$1, int $$2) {
      if ($$0.l()) {
         return true;
      } else {
         int $$3 = $$1 + 1;
         return $$3 <= $$2 && $$0.y().a(awu.a);
      }
   }

   private static boolean a(dhe $$0, dyr $$1, eiq $$2, azg $$3, ji.a $$4, ji $$5) {
      for (int $$6 = 0; $$6 < $$2.h; $$6++) {
         $$4.c(jn.b);
         if ($$2.o.test($$0, $$4) && a($$0, $$2, $$4)) {
            ji $$7 = $$4.e();
            if ($$0.b_($$7).a(awu.b) || !$$0.a_($$7).e()) {
               return false;
            }

            if ($$2.b.a().a($$0, $$1, $$3, $$4)) {
               a($$5, $$5.v() + $$6, $$0, $$2, $$3);
               return true;
            }
         }
      }

      return false;
   }

   private static void a(ji $$0, int $$1, dhe $$2, eiq $$3, azg $$4) {
      int $$5 = $$0.u();
      int $$6 = $$0.w();
      ji.a $$7 = $$0.k();

      for (int $$8 = $$0.v(); $$8 < $$1; $$8++) {
         a($$2, $$3, $$4, $$5, $$6, $$7.d($$5, $$8, $$6));
      }
   }

   private static void a(dhe $$0, eiq $$1, azg $$2, int $$3, int $$4, ji.a $$5) {
      int $$6 = $$1.d;
      Predicate<dwv> $$7 = $$1x -> $$1x.a($$1.e);

      for (int $$8 = 0; $$8 < $$1.g; $$8++) {
         $$5.a($$5, $$2.a($$6) - $$2.a($$6), 0, $$2.a($$6) - $$2.a($$6));
         if ($$7.test($$0.a_($$5))) {
            $$0.a($$5, $$1.f.a($$2, $$5), 2);
         }

         $$5.p($$3);
         $$5.r($$4);
      }
   }

   private static void a(dhe $$0, eiq $$1, azg $$2, ji $$3, ji.a $$4) {
      int $$5 = $$1.i;
      int $$6 = $$1.j;

      for (int $$7 = 0; $$7 < $$1.l; $$7++) {
         $$4.a($$3, $$2.a($$5) - $$2.a($$5), $$2.a($$6) - $$2.a($$6), $$2.a($$5) - $$2.a($$5));
         if ($$0.u($$4)) {
            dwv $$8 = $$1.k.a($$2, $$4);
            if ($$8.a($$0, $$4) && $$0.a_($$4.d()).c($$0, $$4, jn.a)) {
               $$0.a($$4, $$8, 2);
            }
         }
      }
   }
}

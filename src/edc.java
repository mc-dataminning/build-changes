import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public class edc extends eca<eeu> {
   public edc(Codec<eeu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eeu> $$0) {
      ddq $$1 = $$0.b();
      jd $$2 = $$0.e();
      if (!$$1.a_($$2).i()) {
         return false;
      } else {
         ayv $$3 = $$0.d();
         jd $$4 = $$0.e();
         eeu $$5 = $$0.f();
         jd.a $$6 = $$4.j();
         if (a($$1, $$0.c(), $$5, $$3, $$6, $$4)) {
            a($$1, $$5, $$3, $$4, $$6);
         }

         return true;
      }
   }

   private static boolean a(ddq $$0, eeu $$1, jd $$2) {
      jd.a $$3 = $$2.j();

      for (int $$4 = 1; $$4 <= $$1.c; $$4++) {
         $$3.c(ji.b);
         dta $$5 = $$0.a_($$3);
         if (!a($$5, $$4, $$1.n)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dta $$0, int $$1, int $$2) {
      if ($$0.i()) {
         return true;
      } else {
         int $$3 = $$1 + 1;
         return $$3 <= $$2 && $$0.u().a(awj.a);
      }
   }

   private static boolean a(ddq $$0, dux $$1, eeu $$2, ayv $$3, jd.a $$4, jd $$5) {
      for (int $$6 = 0; $$6 < $$2.h; $$6++) {
         $$4.c(ji.b);
         if ($$2.o.test($$0, $$4) && a($$0, $$2, $$4)) {
            jd $$7 = $$4.d();
            if ($$0.b_($$7).a(awj.b) || !$$0.a_($$7).e()) {
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

   private static void a(jd $$0, int $$1, ddq $$2, eeu $$3, ayv $$4) {
      int $$5 = $$0.u();
      int $$6 = $$0.w();
      jd.a $$7 = $$0.j();

      for (int $$8 = $$0.v(); $$8 < $$1; $$8++) {
         a($$2, $$3, $$4, $$5, $$6, $$7.d($$5, $$8, $$6));
      }
   }

   private static void a(ddq $$0, eeu $$1, ayv $$2, int $$3, int $$4, jd.a $$5) {
      int $$6 = $$1.d;
      Predicate<dta> $$7 = $$1x -> $$1x.a($$1.e);

      for (int $$8 = 0; $$8 < $$1.g; $$8++) {
         $$5.a($$5, $$2.a($$6) - $$2.a($$6), 0, $$2.a($$6) - $$2.a($$6));
         if ($$7.test($$0.a_($$5))) {
            $$0.a($$5, $$1.f.a($$2, $$5), 2);
         }

         $$5.p($$3);
         $$5.r($$4);
      }
   }

   private static void a(ddq $$0, eeu $$1, ayv $$2, jd $$3, jd.a $$4) {
      int $$5 = $$1.i;
      int $$6 = $$1.j;

      for (int $$7 = 0; $$7 < $$1.l; $$7++) {
         $$4.a($$3, $$2.a($$5) - $$2.a($$5), $$2.a($$6) - $$2.a($$6), $$2.a($$5) - $$2.a($$5));
         if ($$0.u($$4)) {
            dta $$8 = $$1.k.a($$2, $$4);
            if ($$8.a($$0, $$4) && $$0.a_($$4.c()).d($$0, $$4, ji.a)) {
               $$0.a($$4, $$8, 2);
            }
         }
      }
   }
}

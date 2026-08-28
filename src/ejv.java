import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public class ejv extends eit<eln> {
   public ejv(Codec<eln> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<eln> $$0) {
      djo $$1 = $$0.b();
      iu $$2 = $$0.e();
      if (!$$1.a_($$2).l()) {
         return false;
      } else {
         azt $$3 = $$0.d();
         iu $$4 = $$0.e();
         eln $$5 = $$0.f();
         iu.a $$6 = $$4.k();
         if (a($$1, $$0.c(), $$5, $$3, $$6, $$4)) {
            a($$1, $$5, $$3, $$4, $$6);
         }

         return true;
      }
   }

   private static boolean a(djo $$0, eln $$1, iu $$2) {
      iu.a $$3 = $$2.k();

      for (int $$4 = 1; $$4 <= $$1.c; $$4++) {
         $$3.c(ja.b);
         dzo $$5 = $$0.a_($$3);
         if (!a($$5, $$4, $$1.n)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dzo $$0, int $$1, int $$2) {
      if ($$0.l()) {
         return true;
      } else {
         int $$3 = $$1 + 1;
         return $$3 <= $$2 && $$0.y().a(axf.a);
      }
   }

   private static boolean a(djo $$0, ebm $$1, eln $$2, azt $$3, iu.a $$4, iu $$5) {
      for (int $$6 = 0; $$6 < $$2.h; $$6++) {
         $$4.c(ja.b);
         if ($$2.o.test($$0, $$4) && a($$0, $$2, $$4)) {
            iu $$7 = $$4.e();
            if ($$0.b_($$7).a(axf.b) || !$$0.a_($$7).e()) {
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

   private static void a(iu $$0, int $$1, djo $$2, eln $$3, azt $$4) {
      int $$5 = $$0.u();
      int $$6 = $$0.w();
      iu.a $$7 = $$0.k();

      for (int $$8 = $$0.v(); $$8 < $$1; $$8++) {
         a($$2, $$3, $$4, $$5, $$6, $$7.d($$5, $$8, $$6));
      }
   }

   private static void a(djo $$0, eln $$1, azt $$2, int $$3, int $$4, iu.a $$5) {
      int $$6 = $$1.d;
      Predicate<dzo> $$7 = $$1x -> $$1x.a($$1.e);

      for (int $$8 = 0; $$8 < $$1.g; $$8++) {
         $$5.a($$5, $$2.a($$6) - $$2.a($$6), 0, $$2.a($$6) - $$2.a($$6));
         if ($$7.test($$0.a_($$5))) {
            $$0.a($$5, $$1.f.a($$2, $$5), 2);
         }

         $$5.p($$3);
         $$5.r($$4);
      }
   }

   private static void a(djo $$0, eln $$1, azt $$2, iu $$3, iu.a $$4) {
      int $$5 = $$1.i;
      int $$6 = $$1.j;

      for (int $$7 = 0; $$7 < $$1.l; $$7++) {
         $$4.a($$3, $$2.a($$5) - $$2.a($$5), $$2.a($$6) - $$2.a($$6), $$2.a($$5) - $$2.a($$5));
         if ($$0.v($$4)) {
            dzo $$8 = $$1.k.a($$2, $$4);
            if ($$8.a($$0, $$4) && $$0.a_($$4.d()).c($$0, $$4, ja.a)) {
               $$0.a($$4, $$8, 2);
            }
         }
      }
   }
}

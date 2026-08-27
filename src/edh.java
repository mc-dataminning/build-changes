import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public class edh extends eca<efa> {
   public edh(Codec<efa> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<efa> $$0) {
      dcv $$1 = $$0.b();
      ir $$2 = $$0.e();
      if (!$$1.a_($$2).i()) {
         return false;
      } else {
         ayt $$3 = $$0.d();
         ir $$4 = $$0.e();
         efa $$5 = $$0.f();
         ir.a $$6 = $$4.j();
         if (a($$1, $$0.c(), $$5, $$3, $$6, $$4)) {
            a($$1, $$5, $$3, $$4, $$6);
         }

         return true;
      }
   }

   private static boolean a(dcv $$0, efa $$1, ir $$2) {
      ir.a $$3 = $$2.j();

      for (int $$4 = 1; $$4 <= $$1.c; $$4++) {
         $$3.d(iw.b);
         dtc $$5 = $$0.a_($$3);
         if (!a($$5, $$4, $$1.n)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dtc $$0, int $$1, int $$2) {
      if ($$0.i()) {
         return true;
      } else {
         int $$3 = $$1 + 1;
         return $$3 <= $$2 && $$0.u().a(awj.a);
      }
   }

   private static boolean a(dcv $$0, duz $$1, efa $$2, ayt $$3, ir.a $$4, ir $$5) {
      for (int $$6 = 0; $$6 < $$2.h; $$6++) {
         $$4.d(iw.b);
         if ($$2.o.test($$0, $$4) && a($$0, $$2, $$4)) {
            ir $$7 = $$4.d();
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

   private static void a(ir $$0, int $$1, dcv $$2, efa $$3, ayt $$4) {
      int $$5 = $$0.u();
      int $$6 = $$0.w();
      ir.a $$7 = $$0.j();

      for (int $$8 = $$0.v(); $$8 < $$1; $$8++) {
         a($$2, $$3, $$4, $$5, $$6, $$7.d($$5, $$8, $$6));
      }
   }

   private static void a(dcv $$0, efa $$1, ayt $$2, int $$3, int $$4, ir.a $$5) {
      int $$6 = $$1.d;
      Predicate<dtc> $$7 = $$1x -> $$1x.a($$1.e);

      for (int $$8 = 0; $$8 < $$1.g; $$8++) {
         $$5.a($$5, $$2.a($$6) - $$2.a($$6), 0, $$2.a($$6) - $$2.a($$6));
         if ($$7.test($$0.a_($$5))) {
            $$0.a($$5, $$1.f.a($$2, $$5), 2);
         }

         $$5.p($$3);
         $$5.r($$4);
      }
   }

   private static void a(dcv $$0, efa $$1, ayt $$2, ir $$3, ir.a $$4) {
      int $$5 = $$1.i;
      int $$6 = $$1.j;

      for (int $$7 = 0; $$7 < $$1.l; $$7++) {
         $$4.a($$3, $$2.a($$5) - $$2.a($$5), $$2.a($$6) - $$2.a($$6), $$2.a($$5) - $$2.a($$5));
         if ($$0.u($$4)) {
            dtc $$8 = $$1.k.a($$2, $$4);
            if ($$8.a($$0, $$4) && $$0.a_($$4.c()).d($$0, $$4, iw.a)) {
               $$0.a($$4, $$8, 2);
            }
         }
      }
   }
}

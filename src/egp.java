import com.mojang.serialization.Codec;
import java.util.List;

public class egp extends efx<eig> {
   public egp(Codec<eig> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efz<eig> $$0) {
      dhf $$1 = $$0.b();
      ji $$2 = $$0.e();
      azh $$3 = $$0.d();
      eig $$4 = $$0.f();
      if (!c($$1.a_($$2))) {
         return false;
      } else {
         List<jn> $$5 = $$4.a($$3);
         if (a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
         } else {
            ji.a $$6 = $$2.k();

            for (jn $$7 : $$5) {
               $$6.g($$2);
               List<jn> $$8 = $$4.a($$3, $$7.g());

               for (int $$9 = 0; $$9 < $$4.c; $$9++) {
                  $$6.a($$2, $$7);
                  dww $$10 = $$1.a_($$6);
                  if (!c($$10) && !$$10.a($$4.b)) {
                     break;
                  }

                  if (a($$1, $$6, $$10, $$4, $$3, $$8)) {
                     return true;
                  }
               }
            }

            return false;
         }
      }
   }

   public static boolean a(dhf $$0, ji $$1, dww $$2, eig $$3, azh $$4, List<jn> $$5) {
      ji.a $$6 = $$1.k();

      for (jn $$7 : $$5) {
         dww $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            dww $$9 = $$3.b.c($$2, $$0, $$1, $$7);
            if ($$9 == null) {
               return false;
            }

            $$0.a($$1, $$9, 3);
            $$0.y($$1).e($$1);
            if ($$4.i() < $$3.g) {
               $$3.b.c().a($$9, $$0, $$1, $$7, $$4, true);
            }

            return true;
         }
      }

      return false;
   }

   private static boolean c(dww $$0) {
      return $$0.l() || $$0.a(djn.J);
   }
}

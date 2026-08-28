import com.mojang.serialization.Codec;
import java.util.List;

public class ego extends efw<eif> {
   public ego(Codec<eif> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<eif> $$0) {
      dhe $$1 = $$0.b();
      ji $$2 = $$0.e();
      azg $$3 = $$0.d();
      eif $$4 = $$0.f();
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
                  dwv $$10 = $$1.a_($$6);
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

   public static boolean a(dhe $$0, ji $$1, dwv $$2, eif $$3, azg $$4, List<jn> $$5) {
      ji.a $$6 = $$1.k();

      for (jn $$7 : $$5) {
         dwv $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            dwv $$9 = $$3.b.c($$2, $$0, $$1, $$7);
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

   private static boolean c(dwv $$0) {
      return $$0.l() || $$0.a(djm.J);
   }
}

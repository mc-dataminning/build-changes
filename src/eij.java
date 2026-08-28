import com.mojang.serialization.Codec;
import java.util.List;

public class eij extends ehr<eka> {
   public eij(Codec<eka> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<eka> $$0) {
      dio $$1 = $$0.b();
      jj $$2 = $$0.e();
      azs $$3 = $$0.d();
      eka $$4 = $$0.f();
      if (!c($$1.a_($$2))) {
         return false;
      } else {
         List<jo> $$5 = $$4.a($$3);
         if (a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
         } else {
            jj.a $$6 = $$2.k();

            for (jo $$7 : $$5) {
               $$6.g($$2);
               List<jo> $$8 = $$4.a($$3, $$7.g());

               for (int $$9 = 0; $$9 < $$4.c; $$9++) {
                  $$6.a($$2, $$7);
                  dym $$10 = $$1.a_($$6);
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

   public static boolean a(dio $$0, jj $$1, dym $$2, eka $$3, azs $$4, List<jo> $$5) {
      jj.a $$6 = $$1.k();

      for (jo $$7 : $$5) {
         dym $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            dym $$9 = $$3.b.c($$2, $$0, $$1, $$7);
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

   private static boolean c(dym $$0) {
      return $$0.l() || $$0.a(dkw.J);
   }
}

import com.mojang.serialization.Codec;
import java.util.List;

public class ecs extends eca<eej> {
   public ecs(Codec<eej> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eej> $$0) {
      ddq $$1 = $$0.b();
      jd $$2 = $$0.e();
      ayv $$3 = $$0.d();
      eej $$4 = $$0.f();
      if (!c($$1.a_($$2))) {
         return false;
      } else {
         List<ji> $$5 = $$4.a($$3);
         if (a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
         } else {
            jd.a $$6 = $$2.j();

            for (ji $$7 : $$5) {
               $$6.g($$2);
               List<ji> $$8 = $$4.a($$3, $$7.g());

               for (int $$9 = 0; $$9 < $$4.c; $$9++) {
                  $$6.a($$2, $$7);
                  dta $$10 = $$1.a_($$6);
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

   public static boolean a(ddq $$0, jd $$1, dta $$2, eej $$3, ayv $$4, List<ji> $$5) {
      jd.a $$6 = $$1.j();

      for (ji $$7 : $$5) {
         dta $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            dta $$9 = $$3.b.c($$2, $$0, $$1, $$7);
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

   private static boolean c(dta $$0) {
      return $$0.i() || $$0.a(dfy.G);
   }
}

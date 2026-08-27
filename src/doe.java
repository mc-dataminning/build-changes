import com.mojang.serialization.Codec;
import java.util.List;

public class doe extends dnm<dpv> {
   public doe(Codec<dpv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dno<dpv> $$0) {
      cqf $$1 = $$0.b();
      gu $$2 = $$0.e();
      aru $$3 = $$0.d();
      dpv $$4 = $$0.f();
      if (!c($$1.a_($$2))) {
         return false;
      } else {
         List<ha> $$5 = $$4.a($$3);
         if (a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
         } else {
            gu.a $$6 = $$2.j();

            for (ha $$7 : $$5) {
               $$6.g($$2);
               List<ha> $$8 = $$4.a($$3, $$7.g());

               for (int $$9 = 0; $$9 < $$4.c; $$9++) {
                  $$6.a($$2, $$7);
                  dez $$10 = $$1.a_($$6);
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

   public static boolean a(cqf $$0, gu $$1, dez $$2, dpv $$3, aru $$4, List<ha> $$5) {
      gu.a $$6 = $$1.j();

      for (ha $$7 : $$5) {
         dez $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            dez $$9 = $$3.b.c($$2, $$0, $$1, $$7);
            if ($$9 == null) {
               return false;
            }

            $$0.a($$1, $$9, 3);
            $$0.x($$1).e($$1);
            if ($$4.i() < $$3.g) {
               $$3.b.b().a($$9, $$0, $$1, $$7, $$4, true);
            }

            return true;
         }
      }

      return false;
   }

   private static boolean c(dez $$0) {
      return $$0.i() || $$0.a(csm.G);
   }
}

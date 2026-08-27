import com.mojang.serialization.Codec;
import java.util.List;

public class dyn extends dxv<eae> {
   public dyn(Codec<eae> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<eae> $$0) {
      czs $$1 = $$0.b();
      ib $$2 = $$0.e();
      axr $$3 = $$0.d();
      eae $$4 = $$0.f();
      if (!c($$1.a_($$2))) {
         return false;
      } else {
         List<ih> $$5 = $$4.a($$3);
         if (a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
         } else {
            ib.a $$6 = $$2.j();

            for (ih $$7 : $$5) {
               $$6.g($$2);
               List<ih> $$8 = $$4.a($$3, $$7.g());

               for (int $$9 = 0; $$9 < $$4.c; $$9++) {
                  $$6.a($$2, $$7);
                  doz $$10 = $$1.a_($$6);
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

   public static boolean a(czs $$0, ib $$1, doz $$2, eae $$3, axr $$4, List<ih> $$5) {
      ib.a $$6 = $$1.j();

      for (ih $$7 : $$5) {
         doz $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            doz $$9 = $$3.b.c($$2, $$0, $$1, $$7);
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

   private static boolean c(doz $$0) {
      return $$0.i() || $$0.a(dca.G);
   }
}

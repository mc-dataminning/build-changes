import com.mojang.serialization.Codec;
import java.util.List;

public class ebq extends eay<edh> {
   public ebq(Codec<edh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eba<edh> $$0) {
      dct $$1 = $$0.b();
      iz $$2 = $$0.e();
      azh $$3 = $$0.d();
      edh $$4 = $$0.f();
      if (!c($$1.a_($$2))) {
         return false;
      } else {
         List<je> $$5 = $$4.a($$3);
         if (a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
         } else {
            iz.a $$6 = $$2.j();

            for (je $$7 : $$5) {
               $$6.g($$2);
               List<je> $$8 = $$4.a($$3, $$7.g());

               for (int $$9 = 0; $$9 < $$4.c; $$9++) {
                  $$6.a($$2, $$7);
                  dsc $$10 = $$1.a_($$6);
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

   public static boolean a(dct $$0, iz $$1, dsc $$2, edh $$3, azh $$4, List<je> $$5) {
      iz.a $$6 = $$1.j();

      for (je $$7 : $$5) {
         dsc $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            dsc $$9 = $$3.b.c($$2, $$0, $$1, $$7);
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

   private static boolean c(dsc $$0) {
      return $$0.i() || $$0.a(dfb.G);
   }
}

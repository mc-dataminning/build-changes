import com.mojang.serialization.Codec;
import java.util.List;

public class dzv extends dzd<ebm> {
   public dzv(Codec<ebm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebm> $$0) {
      day $$1 = $$0.b();
      in $$2 = $$0.e();
      ayg $$3 = $$0.d();
      ebm $$4 = $$0.f();
      if (!c($$1.a_($$2))) {
         return false;
      } else {
         List<is> $$5 = $$4.a($$3);
         if (a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
         } else {
            in.a $$6 = $$2.j();

            for (is $$7 : $$5) {
               $$6.g($$2);
               List<is> $$8 = $$4.a($$3, $$7.g());

               for (int $$9 = 0; $$9 < $$4.c; $$9++) {
                  $$6.a($$2, $$7);
                  dqh $$10 = $$1.a_($$6);
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

   public static boolean a(day $$0, in $$1, dqh $$2, ebm $$3, ayg $$4, List<is> $$5) {
      in.a $$6 = $$1.j();

      for (is $$7 : $$5) {
         dqh $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            dqh $$9 = $$3.b.c($$2, $$0, $$1, $$7);
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

   private static boolean c(dqh $$0) {
      return $$0.i() || $$0.a(ddg.G);
   }
}

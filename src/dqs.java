import com.mojang.serialization.Codec;
import java.util.List;

public class dqs extends dqa<dsj> {
   public dqs(Codec<dsj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dsj> $$0) {
      csz $$1 = $$0.b();
      hx $$2 = $$0.e();
      atw $$3 = $$0.d();
      dsj $$4 = $$0.f();
      if (!c($$1.a_($$2))) {
         return false;
      } else {
         List<ib> $$5 = $$4.a($$3);
         if (a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
         } else {
            hx.a $$6 = $$2.j();

            for (ib $$7 : $$5) {
               $$6.g($$2);
               List<ib> $$8 = $$4.a($$3, $$7.g());

               for (int $$9 = 0; $$9 < $$4.c; $$9++) {
                  $$6.a($$2, $$7);
                  dhn $$10 = $$1.a_($$6);
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

   public static boolean a(csz $$0, hx $$1, dhn $$2, dsj $$3, atw $$4, List<ib> $$5) {
      hx.a $$6 = $$1.j();

      for (ib $$7 : $$5) {
         dhn $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            dhn $$9 = $$3.b.c($$2, $$0, $$1, $$7);
            if ($$9 == null) {
               return false;
            }

            $$0.a($$1, $$9, 3);
            $$0.x($$1).e($$1);
            if ($$4.i() < $$3.g) {
               $$3.b.c().a($$9, $$0, $$1, $$7, $$4, true);
            }

            return true;
         }
      }

      return false;
   }

   private static boolean c(dhn $$0) {
      return $$0.i() || $$0.a(cvh.G);
   }
}

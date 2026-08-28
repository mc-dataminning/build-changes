import com.mojang.serialization.Codec;
import java.util.List;

public class elo extends ekw<eng> {
   public elo(Codec<eng> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<eng> $$0) {
      dli $$1 = $$0.b();
      iw $$2 = $$0.e();
      bai $$3 = $$0.d();
      eng $$4 = $$0.f();
      if (!c($$1.a_($$2))) {
         return false;
      } else {
         List<jc> $$5 = $$4.a($$3);
         if (a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
         } else {
            iw.a $$6 = $$2.k();

            for (jc $$7 : $$5) {
               $$6.g($$2);
               List<jc> $$8 = $$4.a($$3, $$7.g());

               for (int $$9 = 0; $$9 < $$4.c; $$9++) {
                  $$6.a($$2, $$7);
                  ebq $$10 = $$1.a_($$6);
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

   public static boolean a(dli $$0, iw $$1, ebq $$2, eng $$3, bai $$4, List<jc> $$5) {
      iw.a $$6 = $$1.k();

      for (jc $$7 : $$5) {
         ebq $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            ebq $$9 = $$3.b.c($$2, $$0, $$1, $$7);
            if ($$9 == null) {
               return false;
            }

            $$0.a($$1, $$9, 3);
            $$0.z($$1).e($$1);
            if ($$4.i() < $$3.g) {
               $$3.b.c().a($$9, $$0, $$1, $$7, $$4, true);
            }

            return true;
         }
      }

      return false;
   }

   private static boolean c(ebq $$0) {
      return $$0.l() || $$0.a(dnq.J);
   }
}

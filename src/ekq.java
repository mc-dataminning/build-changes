import com.mojang.serialization.Codec;
import java.util.List;

public class ekq extends ejy<emh> {
   public ekq(Codec<emh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<emh> $$0) {
      dkl $$1 = $$0.b();
      iv $$2 = $$0.e();
      azv $$3 = $$0.d();
      emh $$4 = $$0.f();
      if (!c($$1.a_($$2))) {
         return false;
      } else {
         List<jb> $$5 = $$4.a($$3);
         if (a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
         } else {
            iv.a $$6 = $$2.k();

            for (jb $$7 : $$5) {
               $$6.g($$2);
               List<jb> $$8 = $$4.a($$3, $$7.g());

               for (int $$9 = 0; $$9 < $$4.c; $$9++) {
                  $$6.a($$2, $$7);
                  eat $$10 = $$1.a_($$6);
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

   public static boolean a(dkl $$0, iv $$1, eat $$2, emh $$3, azv $$4, List<jb> $$5) {
      iv.a $$6 = $$1.k();

      for (jb $$7 : $$5) {
         eat $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            eat $$9 = $$3.b.c($$2, $$0, $$1, $$7);
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

   private static boolean c(eat $$0) {
      return $$0.l() || $$0.a(dmt.J);
   }
}

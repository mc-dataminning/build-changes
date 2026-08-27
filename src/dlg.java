import com.mojang.serialization.Codec;
import java.util.List;

public class dlg extends dko<dmx> {
   public dlg(Codec<dmx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dmx> $$0) {
      cng $$1 = $$0.b();
      gu $$2 = $$0.e();
      apf $$3 = $$0.d();
      dmx $$4 = $$0.f();
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
                  dcb $$10 = $$1.a_($$6);
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

   public static boolean a(cng $$0, gu $$1, dcb $$2, dmx $$3, apf $$4, List<ha> $$5) {
      gu.a $$6 = $$1.j();

      for (ha $$7 : $$5) {
         dcb $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            dcb $$9 = $$3.b.c($$2, $$0, $$1, $$7);
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

   private static boolean c(dcb $$0) {
      return $$0.i() || $$0.a(cpo.G);
   }
}

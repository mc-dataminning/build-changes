import com.mojang.serialization.Codec;
import java.util.List;

public class dod extends dnl<dpu> {
   public dod(Codec<dpu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpu> $$0) {
      cqe $$1 = $$0.b();
      gv $$2 = $$0.e();
      art $$3 = $$0.d();
      dpu $$4 = $$0.f();
      if (!c($$1.a_($$2))) {
         return false;
      } else {
         List<hb> $$5 = $$4.a($$3);
         if (a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
         } else {
            gv.a $$6 = $$2.j();

            for (hb $$7 : $$5) {
               $$6.g($$2);
               List<hb> $$8 = $$4.a($$3, $$7.g());

               for (int $$9 = 0; $$9 < $$4.c; $$9++) {
                  $$6.a($$2, $$7);
                  dey $$10 = $$1.a_($$6);
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

   public static boolean a(cqe $$0, gv $$1, dey $$2, dpu $$3, art $$4, List<hb> $$5) {
      gv.a $$6 = $$1.j();

      for (hb $$7 : $$5) {
         dey $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            dey $$9 = $$3.b.c($$2, $$0, $$1, $$7);
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

   private static boolean c(dey $$0) {
      return $$0.i() || $$0.a(csl.G);
   }
}

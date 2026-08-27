import com.mojang.serialization.Codec;
import java.util.List;

public class dru extends drc<dtl> {
   public dru(Codec<dtl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtl> $$0) {
      ctt $$1 = $$0.b();
      hv $$2 = $$0.e();
      auf $$3 = $$0.d();
      dtl $$4 = $$0.f();
      if (!c($$1.a_($$2))) {
         return false;
      } else {
         List<ia> $$5 = $$4.a($$3);
         if (a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
         } else {
            hv.a $$6 = $$2.j();

            for (ia $$7 : $$5) {
               $$6.g($$2);
               List<ia> $$8 = $$4.a($$3, $$7.g());

               for (int $$9 = 0; $$9 < $$4.c; $$9++) {
                  $$6.a($$2, $$7);
                  dip $$10 = $$1.a_($$6);
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

   public static boolean a(ctt $$0, hv $$1, dip $$2, dtl $$3, auf $$4, List<ia> $$5) {
      hv.a $$6 = $$1.j();

      for (ia $$7 : $$5) {
         dip $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            dip $$9 = $$3.b.c($$2, $$0, $$1, $$7);
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

   private static boolean c(dip $$0) {
      return $$0.i() || $$0.a(cwb.G);
   }
}

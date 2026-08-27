import com.mojang.serialization.Codec;
import java.util.List;

public class dqb extends dpj<drs> {
   public dqb(Codec<drs> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpl<drs> $$0) {
      csm $$1 = $$0.b();
      ht $$2 = $$0.e();
      ato $$3 = $$0.d();
      drs $$4 = $$0.f();
      if (!c($$1.a_($$2))) {
         return false;
      } else {
         List<hx> $$5 = $$4.a($$3);
         if (a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
         } else {
            ht.a $$6 = $$2.j();

            for (hx $$7 : $$5) {
               $$6.g($$2);
               List<hx> $$8 = $$4.a($$3, $$7.g());

               for (int $$9 = 0; $$9 < $$4.c; $$9++) {
                  $$6.a($$2, $$7);
                  dgw $$10 = $$1.a_($$6);
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

   public static boolean a(csm $$0, ht $$1, dgw $$2, drs $$3, ato $$4, List<hx> $$5) {
      ht.a $$6 = $$1.j();

      for (hx $$7 : $$5) {
         dgw $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            dgw $$9 = $$3.b.c($$2, $$0, $$1, $$7);
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

   private static boolean c(dgw $$0) {
      return $$0.i() || $$0.a(cuv.G);
   }
}

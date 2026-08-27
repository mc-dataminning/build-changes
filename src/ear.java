import com.mojang.serialization.Codec;
import java.util.List;

public class ear extends dzz<eci> {
   public ear(Codec<eci> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<eci> $$0) {
      dbu $$1 = $$0.b();
      io $$2 = $$0.e();
      aym $$3 = $$0.d();
      eci $$4 = $$0.f();
      if (!c($$1.a_($$2))) {
         return false;
      } else {
         List<it> $$5 = $$4.a($$3);
         if (a($$1, $$2, $$1.a_($$2), $$4, $$3, $$5)) {
            return true;
         } else {
            io.a $$6 = $$2.j();

            for (it $$7 : $$5) {
               $$6.g($$2);
               List<it> $$8 = $$4.a($$3, $$7.g());

               for (int $$9 = 0; $$9 < $$4.c; $$9++) {
                  $$6.a($$2, $$7);
                  drd $$10 = $$1.a_($$6);
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

   public static boolean a(dbu $$0, io $$1, drd $$2, eci $$3, aym $$4, List<it> $$5) {
      io.a $$6 = $$1.j();

      for (it $$7 : $$5) {
         drd $$8 = $$0.a_($$6.a($$1, $$7));
         if ($$8.a($$3.h)) {
            drd $$9 = $$3.b.c($$2, $$0, $$1, $$7);
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

   private static boolean c(drd $$0) {
      return $$0.i() || $$0.a(dec.G);
   }
}

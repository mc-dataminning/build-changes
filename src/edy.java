import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class edy extends edv {
   public edy(Codec<efj> $$0) {
      super($$0);
   }

   @Override
   protected Set<ir> a(dcv $$0, efj $$1, ayt $$2, ir $$3, Predicate<dtc> $$4, int $$5, int $$6) {
      Set<ir> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<ir> $$8 = new HashSet<>();
      ir.a $$9 = new ir.a();

      for (ir $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (ir $$11 : $$8) {
         $$0.a($$11, dfe.al.n(), 2);
      }

      return $$8;
   }

   private static boolean a(dcv $$0, Set<ir> $$1, ir $$2, ir.a $$3) {
      return a($$0, $$2, $$3, iw.c) || a($$0, $$2, $$3, iw.f) || a($$0, $$2, $$3, iw.d) || a($$0, $$2, $$3, iw.e) || a($$0, $$2, $$3, iw.a);
   }

   private static boolean a(dcv $$0, ir $$1, ir.a $$2, iw $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(dcv $$0, efj $$1, duz $$2, ayt $$3, ir $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dtc $$5 = $$0.a_($$4);
         if ($$5.b(dts.C) && !$$5.c(dts.C)) {
            $$0.a($$4, $$5.a(dts.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

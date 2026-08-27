import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class ebr extends ebo {
   public ebr(Codec<edc> $$0) {
      super($$0);
   }

   @Override
   protected Set<io> a(dbu $$0, edc $$1, aym $$2, io $$3, Predicate<drd> $$4, int $$5, int $$6) {
      Set<io> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<io> $$8 = new HashSet<>();
      io.a $$9 = new io.a();

      for (io $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (io $$11 : $$8) {
         $$0.a($$11, dec.G.n(), 2);
      }

      return $$8;
   }

   private static boolean a(dbu $$0, Set<io> $$1, io $$2, io.a $$3) {
      return a($$0, $$2, $$3, it.c) || a($$0, $$2, $$3, it.f) || a($$0, $$2, $$3, it.d) || a($$0, $$2, $$3, it.e) || a($$0, $$2, $$3, it.a);
   }

   private static boolean a(dbu $$0, io $$1, io.a $$2, it $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(dbu $$0, edc $$1, dta $$2, aym $$3, io $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         drd $$5 = $$0.a_($$4);
         if ($$5.b(drt.C) && !$$5.c(drt.C)) {
            $$0.a($$4, $$5.a(drt.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

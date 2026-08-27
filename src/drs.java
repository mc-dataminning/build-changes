import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class drs extends drp {
   public drs(Codec<dtd> $$0) {
      super($$0);
   }

   @Override
   protected Set<hx> a(csz $$0, dtd $$1, atw $$2, hx $$3, Predicate<dhn> $$4, int $$5, int $$6) {
      Set<hx> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<hx> $$8 = new HashSet<>();
      hx.a $$9 = new hx.a();

      for (hx $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (hx $$11 : $$8) {
         $$0.a($$11, cvh.G.o(), 2);
      }

      return $$8;
   }

   private static boolean a(csz $$0, Set<hx> $$1, hx $$2, hx.a $$3) {
      return a($$0, $$2, $$3, ib.c) || a($$0, $$2, $$3, ib.f) || a($$0, $$2, $$3, ib.d) || a($$0, $$2, $$3, ib.e) || a($$0, $$2, $$3, ib.a);
   }

   private static boolean a(csz $$0, hx $$1, hx.a $$2, ib $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(csz $$0, dtd $$1, djk $$2, atw $$3, hx $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dhn $$5 = $$0.a_($$4);
         if ($$5.b(did.C) && !$$5.c(did.C)) {
            $$0.a($$4, $$5.a(did.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

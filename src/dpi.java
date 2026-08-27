import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class dpi extends dpf {
   public dpi(Codec<dqt> $$0) {
      super($$0);
   }

   @Override
   protected Set<gw> a(cqv $$0, dqt $$1, ash $$2, gw $$3, Predicate<dfd> $$4, int $$5, int $$6) {
      Set<gw> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<gw> $$8 = new HashSet<>();
      gw.a $$9 = new gw.a();

      for (gw $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (gw $$11 : $$8) {
         $$0.a($$11, cte.G.o(), 2);
      }

      return $$8;
   }

   private static boolean a(cqv $$0, Set<gw> $$1, gw $$2, gw.a $$3) {
      return a($$0, $$2, $$3, ha.c) || a($$0, $$2, $$3, ha.f) || a($$0, $$2, $$3, ha.d) || a($$0, $$2, $$3, ha.e) || a($$0, $$2, $$3, ha.a);
   }

   private static boolean a(cqv $$0, gw $$1, gw.a $$2, ha $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(cqv $$0, dqt $$1, dha $$2, ash $$3, gw $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dfd $$5 = $$0.a_($$4);
         if ($$5.b(dft.C) && !$$5.c(dft.C)) {
            $$0.a($$4, $$5.a(dft.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class dsu extends dsr {
   public dsu(Codec<duf> $$0) {
      super($$0);
   }

   @Override
   protected Set<hv> a(ctt $$0, duf $$1, auf $$2, hv $$3, Predicate<dip> $$4, int $$5, int $$6) {
      Set<hv> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<hv> $$8 = new HashSet<>();
      hv.a $$9 = new hv.a();

      for (hv $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (hv $$11 : $$8) {
         $$0.a($$11, cwb.G.o(), 2);
      }

      return $$8;
   }

   private static boolean a(ctt $$0, Set<hv> $$1, hv $$2, hv.a $$3) {
      return a($$0, $$2, $$3, ia.c) || a($$0, $$2, $$3, ia.f) || a($$0, $$2, $$3, ia.d) || a($$0, $$2, $$3, ia.e) || a($$0, $$2, $$3, ia.a);
   }

   private static boolean a(ctt $$0, hv $$1, hv.a $$2, ia $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(ctt $$0, duf $$1, dkm $$2, auf $$3, hv $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dip $$5 = $$0.a_($$4);
         if ($$5.b(djf.C) && !$$5.c(djf.C)) {
            $$0.a($$4, $$5.a(djf.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class dvk extends dvh {
   public dvk(Codec<dwv> $$0) {
      super($$0);
   }

   @Override
   protected Set<hz> a(cwi $$0, dwv $$1, awo $$2, hz $$3, Predicate<dlf> $$4, int $$5, int $$6) {
      Set<hz> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<hz> $$8 = new HashSet<>();
      hz.a $$9 = new hz.a();

      for (hz $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (hz $$11 : $$8) {
         $$0.a($$11, cyq.G.o(), 2);
      }

      return $$8;
   }

   private static boolean a(cwi $$0, Set<hz> $$1, hz $$2, hz.a $$3) {
      return a($$0, $$2, $$3, ie.c) || a($$0, $$2, $$3, ie.f) || a($$0, $$2, $$3, ie.d) || a($$0, $$2, $$3, ie.e) || a($$0, $$2, $$3, ie.a);
   }

   private static boolean a(cwi $$0, hz $$1, hz.a $$2, ie $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(cwi $$0, dwv $$1, dnc $$2, awo $$3, hz $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dlf $$5 = $$0.a_($$4);
         if ($$5.b(dlv.C) && !$$5.c(dlv.C)) {
            $$0.a($$4, $$5.a(dlv.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class eco extends ecl {
   public eco(Codec<edz> $$0) {
      super($$0);
   }

   @Override
   protected Set<iz> a(dcr $$0, edz $$1, azf $$2, iz $$3, Predicate<dsa> $$4, int $$5, int $$6) {
      Set<iz> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<iz> $$8 = new HashSet<>();
      iz.a $$9 = new iz.a();

      for (iz $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (iz $$11 : $$8) {
         $$0.a($$11, dez.G.o(), 2);
      }

      return $$8;
   }

   private static boolean a(dcr $$0, Set<iz> $$1, iz $$2, iz.a $$3) {
      return a($$0, $$2, $$3, je.c) || a($$0, $$2, $$3, je.f) || a($$0, $$2, $$3, je.d) || a($$0, $$2, $$3, je.e) || a($$0, $$2, $$3, je.a);
   }

   private static boolean a(dcr $$0, iz $$1, iz.a $$2, je $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(dcr $$0, edz $$1, dtx $$2, azf $$3, iz $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dsa $$5 = $$0.a_($$4);
         if ($$5.b(dsq.C) && !$$5.c(dsq.C)) {
            $$0.a($$4, $$5.a(dsq.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class ecl extends eci {
   public ecl(Codec<edw> $$0) {
      super($$0);
   }

   @Override
   protected Set<iz> a(dco $$0, edw $$1, azc $$2, iz $$3, Predicate<drx> $$4, int $$5, int $$6) {
      Set<iz> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<iz> $$8 = new HashSet<>();
      iz.a $$9 = new iz.a();

      for (iz $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (iz $$11 : $$8) {
         $$0.a($$11, dew.G.n(), 2);
      }

      return $$8;
   }

   private static boolean a(dco $$0, Set<iz> $$1, iz $$2, iz.a $$3) {
      return a($$0, $$2, $$3, je.c) || a($$0, $$2, $$3, je.f) || a($$0, $$2, $$3, je.d) || a($$0, $$2, $$3, je.e) || a($$0, $$2, $$3, je.a);
   }

   private static boolean a(dco $$0, iz $$1, iz.a $$2, je $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(dco $$0, edw $$1, dtu $$2, azc $$3, iz $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         drx $$5 = $$0.a_($$4);
         if ($$5.b(dsn.C) && !$$5.c(dsn.C)) {
            $$0.a($$4, $$5.a(dsn.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

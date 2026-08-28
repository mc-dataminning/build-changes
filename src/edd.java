import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class edd extends eda {
   public edd(Codec<eeo> $$0) {
      super($$0);
   }

   @Override
   protected Set<ja> a(ddc $$0, eeo $$1, ayo $$2, ja $$3, Predicate<dsl> $$4, int $$5, int $$6) {
      Set<ja> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<ja> $$8 = new HashSet<>();
      ja.a $$9 = new ja.a();

      for (ja $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (ja $$11 : $$8) {
         $$0.a($$11, dfk.G.o(), 2);
      }

      return $$8;
   }

   private static boolean a(ddc $$0, Set<ja> $$1, ja $$2, ja.a $$3) {
      return a($$0, $$2, $$3, jf.c) || a($$0, $$2, $$3, jf.f) || a($$0, $$2, $$3, jf.d) || a($$0, $$2, $$3, jf.e) || a($$0, $$2, $$3, jf.a);
   }

   private static boolean a(ddc $$0, ja $$1, ja.a $$2, jf $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(ddc $$0, eeo $$1, dui $$2, ayo $$3, ja $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dsl $$5 = $$0.a_($$4);
         if ($$5.b(dtb.C) && !$$5.c(dtb.C)) {
            $$0.a($$4, $$5.a(dtb.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

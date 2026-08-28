import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class ejj extends ejg {
   public ejj(Codec<eku> $$0) {
      super($$0);
   }

   @Override
   protected Set<jj> a(dio $$0, eku $$1, azs $$2, jj $$3, Predicate<dym> $$4, int $$5, int $$6) {
      Set<jj> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<jj> $$8 = new HashSet<>();
      jj.a $$9 = new jj.a();

      for (jj $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (jj $$11 : $$8) {
         $$0.a($$11, dkw.J.m(), 2);
      }

      return $$8;
   }

   private static boolean a(dio $$0, Set<jj> $$1, jj $$2, jj.a $$3) {
      return a($$0, $$2, $$3, jo.c) || a($$0, $$2, $$3, jo.f) || a($$0, $$2, $$3, jo.d) || a($$0, $$2, $$3, jo.e) || a($$0, $$2, $$3, jo.a);
   }

   private static boolean a(dio $$0, jj $$1, jj.a $$2, jo $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).c($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(dio $$0, eku $$1, eak $$2, azs $$3, jj $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.e())) {
         dym $$5 = $$0.a_($$4);
         if ($$5.b(dzc.I) && !$$5.c(dzc.I)) {
            $$0.a($$4, $$5.b(dzc.I, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

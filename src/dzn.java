import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class dzn extends dzk {
   public dzn(Codec<eay> $$0) {
      super($$0);
   }

   @Override
   protected Set<ib> a(czs $$0, eay $$1, axr $$2, ib $$3, Predicate<doz> $$4, int $$5, int $$6) {
      Set<ib> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<ib> $$8 = new HashSet<>();
      ib.a $$9 = new ib.a();

      for (ib $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (ib $$11 : $$8) {
         $$0.a($$11, dca.G.n(), 2);
      }

      return $$8;
   }

   private static boolean a(czs $$0, Set<ib> $$1, ib $$2, ib.a $$3) {
      return a($$0, $$2, $$3, ih.c) || a($$0, $$2, $$3, ih.f) || a($$0, $$2, $$3, ih.d) || a($$0, $$2, $$3, ih.e) || a($$0, $$2, $$3, ih.a);
   }

   private static boolean a(czs $$0, ib $$1, ib.a $$2, ih $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(czs $$0, eay $$1, dqw $$2, axr $$3, ib $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         doz $$5 = $$0.a_($$4);
         if ($$5.b(dpp.C) && !$$5.c(dpp.C)) {
            $$0.a($$4, $$5.a(dpp.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

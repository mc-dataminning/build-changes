import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class drb extends dqy {
   public drb(Codec<dsm> $$0) {
      super($$0);
   }

   @Override
   protected Set<ht> a(csm $$0, dsm $$1, ato $$2, ht $$3, Predicate<dgw> $$4, int $$5, int $$6) {
      Set<ht> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<ht> $$8 = new HashSet<>();
      ht.a $$9 = new ht.a();

      for (ht $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (ht $$11 : $$8) {
         $$0.a($$11, cuv.G.o(), 2);
      }

      return $$8;
   }

   private static boolean a(csm $$0, Set<ht> $$1, ht $$2, ht.a $$3) {
      return a($$0, $$2, $$3, hx.c) || a($$0, $$2, $$3, hx.f) || a($$0, $$2, $$3, hx.d) || a($$0, $$2, $$3, hx.e) || a($$0, $$2, $$3, hx.a);
   }

   private static boolean a(csm $$0, ht $$1, ht.a $$2, hx $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(csm $$0, dsm $$1, dit $$2, ato $$3, ht $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dgw $$5 = $$0.a_($$4);
         if ($$5.b(dhm.C) && !$$5.c(dhm.C)) {
            $$0.a($$4, $$5.a(dhm.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

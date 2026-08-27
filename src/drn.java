import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class drn extends drk {
   public drn(Codec<dsy> $$0) {
      super($$0);
   }

   @Override
   protected Set<ht> a(csu $$0, dsy $$1, ats $$2, ht $$3, Predicate<dhi> $$4, int $$5, int $$6) {
      Set<ht> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<ht> $$8 = new HashSet<>();
      ht.a $$9 = new ht.a();

      for (ht $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (ht $$11 : $$8) {
         $$0.a($$11, cvc.G.o(), 2);
      }

      return $$8;
   }

   private static boolean a(csu $$0, Set<ht> $$1, ht $$2, ht.a $$3) {
      return a($$0, $$2, $$3, hx.c) || a($$0, $$2, $$3, hx.f) || a($$0, $$2, $$3, hx.d) || a($$0, $$2, $$3, hx.e) || a($$0, $$2, $$3, hx.a);
   }

   private static boolean a(csu $$0, ht $$1, ht.a $$2, hx $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(csu $$0, dsy $$1, djf $$2, ats $$3, ht $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dhi $$5 = $$0.a_($$4);
         if ($$5.b(dhy.C) && !$$5.c(dhy.C)) {
            $$0.a($$4, $$5.a(dhy.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

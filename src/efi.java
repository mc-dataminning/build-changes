import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class efi extends eff {
   public efi(Codec<egt> $$0) {
      super($$0);
   }

   @Override
   protected Set<je> a(dfd $$0, egt $$1, azl $$2, je $$3, Predicate<duo> $$4, int $$5, int $$6) {
      Set<je> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<je> $$8 = new HashSet<>();
      je.a $$9 = new je.a();

      for (je $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (je $$11 : $$8) {
         $$0.a($$11, dhl.G.o(), 2);
      }

      return $$8;
   }

   private static boolean a(dfd $$0, Set<je> $$1, je $$2, je.a $$3) {
      return a($$0, $$2, $$3, jj.c) || a($$0, $$2, $$3, jj.f) || a($$0, $$2, $$3, jj.d) || a($$0, $$2, $$3, jj.e) || a($$0, $$2, $$3, jj.a);
   }

   private static boolean a(dfd $$0, je $$1, je.a $$2, jj $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).c($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(dfd $$0, egt $$1, dwl $$2, azl $$3, je $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.e())) {
         duo $$5 = $$0.a_($$4);
         if ($$5.b(dve.C) && !$$5.c(dve.C)) {
            $$0.a($$4, $$5.b(dve.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

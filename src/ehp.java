import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class ehp extends ehm {
   public ehp(Codec<eja> $$0) {
      super($$0);
   }

   @Override
   protected Set<ji> a(dhf $$0, eja $$1, azh $$2, ji $$3, Predicate<dww> $$4, int $$5, int $$6) {
      Set<ji> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<ji> $$8 = new HashSet<>();
      ji.a $$9 = new ji.a();

      for (ji $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (ji $$11 : $$8) {
         $$0.a($$11, djn.J.m(), 2);
      }

      return $$8;
   }

   private static boolean a(dhf $$0, Set<ji> $$1, ji $$2, ji.a $$3) {
      return a($$0, $$2, $$3, jn.c) || a($$0, $$2, $$3, jn.f) || a($$0, $$2, $$3, jn.d) || a($$0, $$2, $$3, jn.e) || a($$0, $$2, $$3, jn.a);
   }

   private static boolean a(dhf $$0, ji $$1, ji.a $$2, jn $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).c($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(dhf $$0, eja $$1, dys $$2, azh $$3, ji $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.e())) {
         dww $$5 = $$0.a_($$4);
         if ($$5.b(dxm.J) && !$$5.c(dxm.J)) {
            $$0.a($$4, $$5.b(dxm.J, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

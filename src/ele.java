import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class ele extends elb {
   public ele(Codec<emp> $$0) {
      super($$0);
   }

   @Override
   protected Set<iu> a(djz $$0, emp $$1, azv $$2, iu $$3, Predicate<eah> $$4, int $$5, int $$6) {
      Set<iu> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<iu> $$8 = new HashSet<>();
      iu.a $$9 = new iu.a();

      for (iu $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (iu $$11 : $$8) {
         $$0.a($$11, dmh.J.m(), 2);
      }

      return $$8;
   }

   private static boolean a(djz $$0, Set<iu> $$1, iu $$2, iu.a $$3) {
      return a($$0, $$2, $$3, ja.c) || a($$0, $$2, $$3, ja.f) || a($$0, $$2, $$3, ja.d) || a($$0, $$2, $$3, ja.e) || a($$0, $$2, $$3, ja.a);
   }

   private static boolean a(djz $$0, iu $$1, iu.a $$2, ja $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).c($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(djz $$0, emp $$1, ecf $$2, azv $$3, iu $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.e())) {
         eah $$5 = $$0.a_($$4);
         if ($$5.b(eax.I) && !$$5.c(eax.I)) {
            $$0.a($$4, $$5.b(eax.I, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

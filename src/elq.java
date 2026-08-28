import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class elq extends eln {
   public elq(Codec<enb> $$0) {
      super($$0);
   }

   @Override
   protected Set<iv> a(dkl $$0, enb $$1, azv $$2, iv $$3, Predicate<eat> $$4, int $$5, int $$6) {
      Set<iv> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<iv> $$8 = new HashSet<>();
      iv.a $$9 = new iv.a();

      for (iv $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (iv $$11 : $$8) {
         $$0.a($$11, dmt.J.m(), 2);
      }

      return $$8;
   }

   private static boolean a(dkl $$0, Set<iv> $$1, iv $$2, iv.a $$3) {
      return a($$0, $$2, $$3, jb.c) || a($$0, $$2, $$3, jb.f) || a($$0, $$2, $$3, jb.d) || a($$0, $$2, $$3, jb.e) || a($$0, $$2, $$3, jb.a);
   }

   private static boolean a(dkl $$0, iv $$1, iv.a $$2, jb $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).c($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(dkl $$0, enb $$1, ecr $$2, azv $$3, iv $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.e())) {
         eat $$5 = $$0.a_($$4);
         if ($$5.b(ebj.I) && !$$5.c(ebj.I)) {
            $$0.a($$4, $$5.b(ebj.I, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

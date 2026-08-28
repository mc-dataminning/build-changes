import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class eih extends eie {
   public eih(Codec<ejs> $$0) {
      super($$0);
   }

   @Override
   protected Set<jh> a(dhx $$0, ejs $$1, bac $$2, jh $$3, Predicate<dxo> $$4, int $$5, int $$6) {
      Set<jh> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<jh> $$8 = new HashSet<>();
      jh.a $$9 = new jh.a();

      for (jh $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (jh $$11 : $$8) {
         $$0.a($$11, dkf.J.m(), 2);
      }

      return $$8;
   }

   private static boolean a(dhx $$0, Set<jh> $$1, jh $$2, jh.a $$3) {
      return a($$0, $$2, $$3, jm.c) || a($$0, $$2, $$3, jm.f) || a($$0, $$2, $$3, jm.d) || a($$0, $$2, $$3, jm.e) || a($$0, $$2, $$3, jm.a);
   }

   private static boolean a(dhx $$0, jh $$1, jh.a $$2, jm $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).c($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(dhx $$0, ejs $$1, dzk $$2, bac $$3, jh $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.e())) {
         dxo $$5 = $$0.a_($$4);
         if ($$5.b(dye.J) && !$$5.c(dye.J)) {
            $$0.a($$4, $$5.b(dye.J, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

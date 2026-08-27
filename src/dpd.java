import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class dpd extends dpa {
   public dpd(Codec<dqo> $$0) {
      super($$0);
   }

   @Override
   protected Set<gv> a(cqe $$0, dqo $$1, art $$2, gv $$3, Predicate<dey> $$4, int $$5, int $$6) {
      Set<gv> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<gv> $$8 = new HashSet<>();
      gv.a $$9 = new gv.a();

      for (gv $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (gv $$11 : $$8) {
         $$0.a($$11, csl.G.n(), 2);
      }

      return $$8;
   }

   private static boolean a(cqe $$0, Set<gv> $$1, gv $$2, gv.a $$3) {
      return a($$0, $$2, $$3, hb.c) || a($$0, $$2, $$3, hb.f) || a($$0, $$2, $$3, hb.d) || a($$0, $$2, $$3, hb.e) || a($$0, $$2, $$3, hb.a);
   }

   private static boolean a(cqe $$0, gv $$1, gv.a $$2, hb $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(cqe $$0, dqo $$1, dgv $$2, art $$3, gv $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dey $$5 = $$0.a_($$4);
         if ($$5.b(dfo.C) && !$$5.c(dfo.C)) {
            $$0.a($$4, $$5.a(dfo.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class dpe extends dpb {
   public dpe(Codec<dqp> $$0) {
      super($$0);
   }

   @Override
   protected Set<gu> a(cqf $$0, dqp $$1, aru $$2, gu $$3, Predicate<dez> $$4, int $$5, int $$6) {
      Set<gu> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<gu> $$8 = new HashSet<>();
      gu.a $$9 = new gu.a();

      for (gu $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (gu $$11 : $$8) {
         $$0.a($$11, csm.G.n(), 2);
      }

      return $$8;
   }

   private static boolean a(cqf $$0, Set<gu> $$1, gu $$2, gu.a $$3) {
      return a($$0, $$2, $$3, ha.c) || a($$0, $$2, $$3, ha.f) || a($$0, $$2, $$3, ha.d) || a($$0, $$2, $$3, ha.e) || a($$0, $$2, $$3, ha.a);
   }

   private static boolean a(cqf $$0, gu $$1, gu.a $$2, ha $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(cqf $$0, dqp $$1, dgw $$2, aru $$3, gu $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dez $$5 = $$0.a_($$4);
         if ($$5.b(dfp.C) && !$$5.c(dfp.C)) {
            $$0.a($$4, $$5.a(dfp.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class eav extends eas {
   public eav(Codec<ecg> $$0) {
      super($$0);
   }

   @Override
   protected Set<in> a(day $$0, ecg $$1, ayg $$2, in $$3, Predicate<dqh> $$4, int $$5, int $$6) {
      Set<in> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<in> $$8 = new HashSet<>();
      in.a $$9 = new in.a();

      for (in $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (in $$11 : $$8) {
         $$0.a($$11, ddg.G.n(), 2);
      }

      return $$8;
   }

   private static boolean a(day $$0, Set<in> $$1, in $$2, in.a $$3) {
      return a($$0, $$2, $$3, is.c) || a($$0, $$2, $$3, is.f) || a($$0, $$2, $$3, is.d) || a($$0, $$2, $$3, is.e) || a($$0, $$2, $$3, is.a);
   }

   private static boolean a(day $$0, in $$1, in.a $$2, is $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(day $$0, ecg $$1, dse $$2, ayg $$3, in $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dqh $$5 = $$0.a_($$4);
         if ($$5.b(dqx.C) && !$$5.c(dqx.C)) {
            $$0.a($$4, $$5.a(dqx.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

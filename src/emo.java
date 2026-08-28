import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class emo extends eml {
   public emo(Codec<eoa> $$0) {
      super($$0);
   }

   @Override
   protected Set<iw> a(dli $$0, eoa $$1, bai $$2, iw $$3, Predicate<ebq> $$4, int $$5, int $$6) {
      Set<iw> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<iw> $$8 = new HashSet<>();
      iw.a $$9 = new iw.a();

      for (iw $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (iw $$11 : $$8) {
         $$0.a($$11, dnq.J.m(), 2);
      }

      return $$8;
   }

   private static boolean a(dli $$0, Set<iw> $$1, iw $$2, iw.a $$3) {
      return a($$0, $$2, $$3, jc.c) || a($$0, $$2, $$3, jc.f) || a($$0, $$2, $$3, jc.d) || a($$0, $$2, $$3, jc.e) || a($$0, $$2, $$3, jc.a);
   }

   private static boolean a(dli $$0, iw $$1, iw.a $$2, jc $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).c($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(dli $$0, eoa $$1, edo $$2, bai $$3, iw $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.e())) {
         ebq $$5 = $$0.a_($$4);
         if ($$5.b(ecg.I) && !$$5.c(ecg.I)) {
            $$0.a($$4, $$5.b(ecg.I, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

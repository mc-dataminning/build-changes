import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class eds extends edp {
   public eds(Codec<efd> $$0) {
      super($$0);
   }

   @Override
   protected Set<jd> a(ddq $$0, efd $$1, ayv $$2, jd $$3, Predicate<dta> $$4, int $$5, int $$6) {
      Set<jd> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<jd> $$8 = new HashSet<>();
      jd.a $$9 = new jd.a();

      for (jd $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (jd $$11 : $$8) {
         $$0.a($$11, dfy.G.o(), 2);
      }

      return $$8;
   }

   private static boolean a(ddq $$0, Set<jd> $$1, jd $$2, jd.a $$3) {
      return a($$0, $$2, $$3, ji.c) || a($$0, $$2, $$3, ji.f) || a($$0, $$2, $$3, ji.d) || a($$0, $$2, $$3, ji.e) || a($$0, $$2, $$3, ji.a);
   }

   private static boolean a(ddq $$0, jd $$1, jd.a $$2, ji $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(ddq $$0, efd $$1, dux $$2, ayv $$3, jd $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dta $$5 = $$0.a_($$4);
         if ($$5.b(dtq.C) && !$$5.c(dtq.C)) {
            $$0.a($$4, $$5.a(dtq.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

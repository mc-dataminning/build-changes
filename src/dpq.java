import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class dpq extends dpn {
   public dpq(Codec<drb> $$0) {
      super($$0);
   }

   @Override
   protected Set<gw> a(cqr $$0, drb $$1, ase $$2, gw $$3, Predicate<dfl> $$4, int $$5, int $$6) {
      Set<gw> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<gw> $$8 = new HashSet<>();
      gw.a $$9 = new gw.a();

      for (gw $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (gw $$11 : $$8) {
         $$0.a($$11, csy.G.n(), 2);
      }

      return $$8;
   }

   private static boolean a(cqr $$0, Set<gw> $$1, gw $$2, gw.a $$3) {
      return a($$0, $$2, $$3, hc.c) || a($$0, $$2, $$3, hc.f) || a($$0, $$2, $$3, hc.d) || a($$0, $$2, $$3, hc.e) || a($$0, $$2, $$3, hc.a);
   }

   private static boolean a(cqr $$0, gw $$1, gw.a $$2, hc $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).d($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(cqr $$0, drb $$1, dhi $$2, ase $$3, gw $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.d())) {
         dfl $$5 = $$0.a_($$4);
         if ($$5.b(dgb.C) && !$$5.c(dgb.C)) {
            $$0.a($$4, $$5.a(dgb.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

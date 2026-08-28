import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class efm extends efj {
   public efm(Codec<egx> $$0) {
      super($$0);
   }

   @Override
   protected Set<jf> a(dfg $$0, egx $$1, azn $$2, jf $$3, Predicate<dus> $$4, int $$5, int $$6) {
      Set<jf> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<jf> $$8 = new HashSet<>();
      jf.a $$9 = new jf.a();

      for (jf $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (jf $$11 : $$8) {
         $$0.a($$11, dho.G.n(), 2);
      }

      return $$8;
   }

   private static boolean a(dfg $$0, Set<jf> $$1, jf $$2, jf.a $$3) {
      return a($$0, $$2, $$3, jk.c) || a($$0, $$2, $$3, jk.f) || a($$0, $$2, $$3, jk.d) || a($$0, $$2, $$3, jk.e) || a($$0, $$2, $$3, jk.a);
   }

   private static boolean a(dfg $$0, jf $$1, jf.a $$2, jk $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).c($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(dfg $$0, egx $$1, dwp $$2, azn $$3, jf $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.e())) {
         dus $$5 = $$0.a_($$4);
         if ($$5.b(dvi.C) && !$$5.c(dvi.C)) {
            $$0.a($$4, $$5.b(dvi.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

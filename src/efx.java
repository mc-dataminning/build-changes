import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class efx extends efu {
   public efx(Codec<ehi> $$0) {
      super($$0);
   }

   @Override
   protected Set<jg> a(dfs $$0, ehi $$1, azr $$2, jg $$3, Predicate<dvd> $$4, int $$5, int $$6) {
      Set<jg> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<jg> $$8 = new HashSet<>();
      jg.a $$9 = new jg.a();

      for (jg $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (jg $$11 : $$8) {
         $$0.a($$11, dia.G.m(), 2);
      }

      return $$8;
   }

   private static boolean a(dfs $$0, Set<jg> $$1, jg $$2, jg.a $$3) {
      return a($$0, $$2, $$3, jl.c) || a($$0, $$2, $$3, jl.f) || a($$0, $$2, $$3, jl.d) || a($$0, $$2, $$3, jl.e) || a($$0, $$2, $$3, jl.a);
   }

   private static boolean a(dfs $$0, jg $$1, jg.a $$2, jl $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).c($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(dfs $$0, ehi $$1, dxa $$2, azr $$3, jg $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.e())) {
         dvd $$5 = $$0.a_($$4);
         if ($$5.b(dvt.C) && !$$5.c(dvt.C)) {
            $$0.a($$4, $$5.b(dvt.C, Boolean.valueOf(true)), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}

import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eff extends eef<egy> {
   public eff(Codec<egy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egy> $$0) {
      egy $$1 = $$0.f();
      dfs $$2 = $$0.b();
      azr $$3 = $$0.d();
      dhy $$4 = $$1.b.b();
      jg $$5 = a($$2, $$0.e().k().a(jl.a.b, $$2.I_() + 1, $$2.an()), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (jg $$11 : jg.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dvd $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static jg a(dew $$0, jg.a $$1, dhy $$2) {
      while ($$1.v() > $$0.I_() + 1) {
         dvd $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(jl.a);
      }

      return null;
   }
}

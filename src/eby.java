import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eby extends eay<edr> {
   public eby(Codec<edr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eba<edr> $$0) {
      edr $$1 = $$0.f();
      dct $$2 = $$0.b();
      azh $$3 = $$0.d();
      dez $$4 = $$1.b.b();
      iz $$5 = a($$2, $$0.e().j().a(je.a.b, $$2.I_() + 1, $$2.am() - 1), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (iz $$11 : iz.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dsc $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static iz a(dbz $$0, iz.a $$1, dez $$2) {
      while ($$1.v() > $$0.I_() + 1) {
         dsc $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(je.a);
      }

      return null;
   }
}

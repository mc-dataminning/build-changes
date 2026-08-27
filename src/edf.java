import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class edf extends eca<eez> {
   public edf(Codec<eez> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eez> $$0) {
      eez $$1 = $$0.f();
      dcv $$2 = $$0.b();
      ayt $$3 = $$0.d();
      dfc $$4 = $$1.b.b();
      ir $$5 = a($$2, $$0.e().j().a(iw.a.b, $$2.J_() + 1, $$2.am() - 1), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (ir $$11 : ir.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dtc $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static ir a(dcb $$0, ir.a $$1, dfc $$2) {
      while ($$1.v() > $$0.J_() + 1) {
         dtc $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.d(iw.a);
      }

      return null;
   }
}

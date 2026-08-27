import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ead extends dzd<ebw> {
   public ead(Codec<ebw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebw> $$0) {
      ebw $$1 = $$0.f();
      day $$2 = $$0.b();
      ayg $$3 = $$0.d();
      dde $$4 = $$1.b.b();
      in $$5 = a($$2, $$0.e().j().a(is.a.b, $$2.I_() + 1, $$2.al() - 1), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (in $$11 : in.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dqh $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static in a(dae $$0, in.a $$1, dde $$2) {
      while ($$1.v() > $$0.I_() + 1) {
         dqh $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(is.a);
      }

      return null;
   }
}

import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dsc extends drc<dtv> {
   public dsc(Codec<dtv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtv> $$0) {
      dtv $$1 = $$0.f();
      ctt $$2 = $$0.b();
      auf $$3 = $$0.d();
      cvz $$4 = $$1.b.b();
      hv $$5 = a($$2, $$0.e().j().a(ia.a.b, $$2.J_() + 1, $$2.ak() - 1), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (hv $$11 : hv.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dip $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static hv a(csz $$0, hv.a $$1, cvz $$2) {
      while ($$1.v() > $$0.J_() + 1) {
         dip $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(ia.a);
      }

      return null;
   }
}

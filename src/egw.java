import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class egw extends efw<eip> {
   public egw(Codec<eip> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<eip> $$0) {
      eip $$1 = $$0.f();
      dhe $$2 = $$0.b();
      azg $$3 = $$0.d();
      djk $$4 = $$1.b.b();
      ji $$5 = a($$2, $$0.e().k().a(jn.a.b, $$2.L_() + 1, $$2.an()), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (ji $$11 : ji.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dwv $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static ji a(dgh $$0, ji.a $$1, djk $$2) {
      while ($$1.v() > $$0.L_() + 1) {
         dwv $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(jn.a);
      }

      return null;
   }
}

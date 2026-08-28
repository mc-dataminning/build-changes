import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eeu extends edu<egn> {
   public eeu(Codec<egn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egn> $$0) {
      egn $$1 = $$0.f();
      dfg $$2 = $$0.b();
      azn $$3 = $$0.d();
      dhm $$4 = $$1.b.b();
      jf $$5 = a($$2, $$0.e().k().a(jk.a.b, $$2.H_() + 1, $$2.an()), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (jf $$11 : jf.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dus $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static jf a(dek $$0, jf.a $$1, dhm $$2) {
      while ($$1.v() > $$0.H_() + 1) {
         dus $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(jk.a);
      }

      return null;
   }
}

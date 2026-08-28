import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ece extends ebe<edx> {
   public ece(Codec<edx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebg<edx> $$0) {
      edx $$1 = $$0.f();
      dcz $$2 = $$0.b();
      aym $$3 = $$0.d();
      dff $$4 = $$1.b.b();
      ja $$5 = a($$2, $$0.e().j().a(jf.a.b, $$2.I_() + 1, $$2.am() - 1), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (ja $$11 : ja.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dsh $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static ja a(dce $$0, ja.a $$1, dff $$2) {
      while ($$1.v() > $$0.I_() + 1) {
         dsh $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(jf.a);
      }

      return null;
   }
}

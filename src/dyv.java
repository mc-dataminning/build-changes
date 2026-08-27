import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dyv extends dxv<eao> {
   public dyv(Codec<eao> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dxx<eao> $$0) {
      eao $$1 = $$0.f();
      czs $$2 = $$0.b();
      axr $$3 = $$0.d();
      dby $$4 = $$1.b.b();
      ib $$5 = a($$2, $$0.e().j().a(ih.a.b, $$2.I_() + 1, $$2.al() - 1), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (ib $$11 : ib.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            doz $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static ib a(cyy $$0, ib.a $$1, dby $$2) {
      while ($$1.v() > $$0.I_() + 1) {
         doz $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(ih.a);
      }

      return null;
   }
}

import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eke extends eje<elx> {
   public eke(Codec<elx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<elx> $$0) {
      elx $$1 = $$0.f();
      dju $$2 = $$0.b();
      azv $$3 = $$0.d();
      dma $$4 = $$1.b.b();
      iu $$5 = a($$2, $$0.e().k().a(ja.a.b, $$2.G_() + 1, $$2.ao()), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (iu $$11 : iu.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dzz $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static iu a(diw $$0, iu.a $$1, dma $$2) {
      while ($$1.v() > $$0.G_() + 1) {
         dzz $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(ja.a);
      }

      return null;
   }
}

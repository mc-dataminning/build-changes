import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class elw extends ekw<enq> {
   public elw(Codec<enq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<enq> $$0) {
      enq $$1 = $$0.f();
      dli $$2 = $$0.b();
      bai $$3 = $$0.d();
      dno $$4 = $$1.b.b();
      iw $$5 = a($$2, $$0.e().k().a(jc.a.b, $$2.K_() + 1, $$2.ao()), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (iw $$11 : iw.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            ebq $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static iw a(dkk $$0, iw.a $$1, dno $$2) {
      while ($$1.v() > $$0.K_() + 1) {
         ebq $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(jc.a);
      }

      return null;
   }
}

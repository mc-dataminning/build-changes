import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dqj extends dpj<dsc> {
   public dqj(Codec<dsc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpl<dsc> $$0) {
      dsc $$1 = $$0.f();
      csm $$2 = $$0.b();
      ato $$3 = $$0.d();
      cut $$4 = $$1.b.b();
      ht $$5 = a($$2, $$0.e().j().a(hx.a.b, $$2.I_() + 1, $$2.aj() - 1), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (ht $$11 : ht.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dgw $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static ht a(crt $$0, ht.a $$1, cut $$2) {
      while ($$1.v() > $$0.I_() + 1) {
         dgw $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(hx.a);
      }

      return null;
   }
}

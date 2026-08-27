import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dus extends dts<dwl> {
   public dus(Codec<dwl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dwl> $$0) {
      dwl $$1 = $$0.f();
      cwi $$2 = $$0.b();
      awo $$3 = $$0.d();
      cyo $$4 = $$1.b.b();
      hz $$5 = a($$2, $$0.e().j().a(ie.a.b, $$2.J_() + 1, $$2.al() - 1), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (hz $$11 : hz.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dlf $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static hz a(cvo $$0, hz.a $$1, cyo $$2) {
      while ($$1.v() > $$0.J_() + 1) {
         dlf $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(ie.a);
      }

      return null;
   }
}

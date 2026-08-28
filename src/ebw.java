import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ebw extends eaw<edp> {
   public ebw(Codec<edp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eay<edp> $$0) {
      edp $$1 = $$0.f();
      dcr $$2 = $$0.b();
      azf $$3 = $$0.d();
      dex $$4 = $$1.b.b();
      iz $$5 = a($$2, $$0.e().j().a(je.a.b, $$2.I_() + 1, $$2.am() - 1), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (iz $$11 : iz.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dsa $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static iz a(dbx $$0, iz.a $$1, dex $$2) {
      while ($$1.v() > $$0.I_() + 1) {
         dsa $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(je.a);
      }

      return null;
   }
}

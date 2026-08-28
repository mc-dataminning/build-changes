import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ehw extends egw<ejp> {
   public ehw(Codec<ejp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egy<ejp> $$0) {
      ejp $$1 = $$0.f();
      dig $$2 = $$0.b();
      bam $$3 = $$0.d();
      dkm $$4 = $$1.b.b();
      jh $$5 = a($$2, $$0.e().k().a(jm.a.b, $$2.L_() + 1, $$2.am()), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (jh $$11 : jh.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dxv $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static jh a(dhj $$0, jh.a $$1, dkm $$2) {
      while ($$1.v() > $$0.L_() + 1) {
         dxv $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(jm.a);
      }

      return null;
   }
}

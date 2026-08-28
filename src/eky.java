import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eky extends ejy<emr> {
   public eky(Codec<emr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<emr> $$0) {
      emr $$1 = $$0.f();
      dkl $$2 = $$0.b();
      azv $$3 = $$0.d();
      dmr $$4 = $$1.b.b();
      iv $$5 = a($$2, $$0.e().k().a(jb.a.b, $$2.G_() + 1, $$2.ao()), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (iv $$11 : iv.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            eat $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static iv a(djn $$0, iv.a $$1, dmr $$2) {
      while ($$1.v() > $$0.G_() + 1) {
         eat $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(jb.a);
      }

      return null;
   }
}

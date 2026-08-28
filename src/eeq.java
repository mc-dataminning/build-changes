import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eeq extends edq<egj> {
   public eeq(Codec<egj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<egj> $$0) {
      egj $$1 = $$0.f();
      dfd $$2 = $$0.b();
      azl $$3 = $$0.d();
      dhj $$4 = $$1.b.b();
      je $$5 = a($$2, $$0.e().k().a(jj.a.b, $$2.G_() + 1, $$2.an()), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (je $$11 : je.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            duo $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static je a(deh $$0, je.a $$1, dhj $$2) {
      while ($$1.v() > $$0.G_() + 1) {
         duo $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(jj.a);
      }

      return null;
   }
}

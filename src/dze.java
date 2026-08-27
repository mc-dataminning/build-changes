import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dze extends dye<eax> {
   public dze(Codec<eax> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<eax> $$0) {
      eax $$1 = $$0.f();
      dab $$2 = $$0.b();
      axt $$3 = $$0.d();
      dch $$4 = $$1.b.b();
      id $$5 = a($$2, $$0.e().j().a(ij.a.b, $$2.I_() + 1, $$2.al() - 1), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (id $$11 : id.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dpi $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static id a(czh $$0, id.a $$1, dch $$2) {
      while ($$1.v() > $$0.I_() + 1) {
         dpi $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(ij.a);
      }

      return null;
   }
}

import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eir extends ehr<ekk> {
   public eir(Codec<ekk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekk> $$0) {
      ekk $$1 = $$0.f();
      dio $$2 = $$0.b();
      azs $$3 = $$0.d();
      dku $$4 = $$1.b.b();
      jj $$5 = a($$2, $$0.e().k().a(jo.a.b, $$2.G_() + 1, $$2.ao()), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (jj $$11 : jj.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dym $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static jj a(dhq $$0, jj.a $$1, dku $$2) {
      while ($$1.v() > $$0.G_() + 1) {
         dym $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(jo.a);
      }

      return null;
   }
}

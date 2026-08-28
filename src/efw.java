import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class efw extends eew<ehp> {
   public efw(Codec<ehp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eey<ehp> $$0) {
      ehp $$1 = $$0.f();
      dgk $$2 = $$0.b();
      azu $$3 = $$0.d();
      diq $$4 = $$1.b.b();
      jh $$5 = a($$2, $$0.e().k().a(jm.a.b, $$2.K_() + 1, $$2.al()), $$4);
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

            dvv $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static jh a(dfn $$0, jh.a $$1, diq $$2) {
      while ($$1.v() > $$0.K_() + 1) {
         dvv $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(jm.a);
      }

      return null;
   }
}

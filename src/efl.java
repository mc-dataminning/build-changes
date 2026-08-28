import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class efl extends eel<ehe> {
   public efl(Codec<ehe> $$0) {
      super($$0);
   }

   @Override
   public boolean a(een<ehe> $$0) {
      ehe $$1 = $$0.f();
      dfy $$2 = $$0.b();
      azs $$3 = $$0.d();
      die $$4 = $$1.b.b();
      jh $$5 = a($$2, $$0.e().k().a(jm.a.b, $$2.I_() + 1, $$2.al()), $$4);
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

            dvj $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static jh a(dfc $$0, jh.a $$1, die $$2) {
      while ($$1.v() > $$0.I_() + 1) {
         dvj $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(jm.a);
      }

      return null;
   }
}

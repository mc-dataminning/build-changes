import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmy extends dob {
   public static final dyl<dxz> L = dye.X;

   protected dmy(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmy> a();

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dhc $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      for (jm $$1 : $$0.f()) {
         dxo $$2;
         if ($$1.o() == jm.a.b) {
            $$2 = this.m().b(L, $$1 == jm.b ? dxz.c : dxz.a).b(aF, $$0.g());
         } else {
            $$2 = this.m().b(L, dxz.b).b(aF, $$1.g());
         }

         if ($$2.a((dhc)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jm n(dxo $$0) {
      switch ((dxz)$$0.c(L)) {
         case c:
            return jm.a;
         case a:
            return jm.b;
         default:
            return $$0.c(aF);
      }
   }
}

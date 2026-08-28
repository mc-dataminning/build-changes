import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlc extends dme {
   public static final dwl<dvz> L = dwe.U;

   protected dlc(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlc> a();

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dfi $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      for (jm $$1 : $$0.f()) {
         dvo $$2;
         if ($$1.o() == jm.a.b) {
            $$2 = this.m().b(L, $$1 == jm.b ? dvz.c : dvz.a).b(aF, $$0.g());
         } else {
            $$2 = this.m().b(L, dvz.b).b(aF, $$1.g());
         }

         if ($$2.a((dfi)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jm n(dvo $$0) {
      switch ((dvz)$$0.c(L)) {
         case c:
            return jm.a;
         case a:
            return jm.b;
         default:
            return $$0.c(aF);
      }
   }
}

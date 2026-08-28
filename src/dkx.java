import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dkx extends dlz {
   public static final dwh<dvu> L = dvz.U;

   protected dkx(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkx> a();

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dfe $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      for (jm $$1 : $$0.f()) {
         dvj $$2;
         if ($$1.o() == jm.a.b) {
            $$2 = this.m().b(L, $$1 == jm.b ? dvu.c : dvu.a).b(aF, $$0.g());
         } else {
            $$2 = this.m().b(L, dvu.b).b(aF, $$1.g());
         }

         if ($$2.a((dfe)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return n($$0).g() == $$1 && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static jm n(dvj $$0) {
      switch ((dvu)$$0.c(L)) {
         case c:
            return jm.a;
         case a:
            return jm.b;
         default:
            return $$0.c(aF);
      }
   }
}

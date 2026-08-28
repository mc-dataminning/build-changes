import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dng extends doj {
   public static final dyr<dyf> L = dyk.V;

   protected dng(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dng> a();

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dhk $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      for (jm $$1 : $$0.f()) {
         dxu $$2;
         if ($$1.o() == jm.a.b) {
            $$2 = this.m().b(L, $$1 == jm.b ? dyf.c : dyf.a).b(aF, $$0.g());
         } else {
            $$2 = this.m().b(L, dyf.b).b(aF, $$1.g());
         }

         if ($$2.a((dhk)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jm n(dxu $$0) {
      switch ((dyf)$$0.c(L)) {
         case c:
            return jm.a;
         case a:
            return jm.b;
         default:
            return $$0.c(aF);
      }
   }
}

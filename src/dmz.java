import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmz extends doc {
   public static final dyk<dxy> L = dyd.V;

   protected dmz(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmz> a();

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dhd $$0, jh $$1, jm $$2) {
      jh $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      for (jm $$1 : $$0.f()) {
         dxn $$2;
         if ($$1.o() == jm.a.b) {
            $$2 = this.m().b(L, $$1 == jm.b ? dxy.c : dxy.a).b(aF, $$0.g());
         } else {
            $$2 = this.m().b(L, dxy.b).b(aF, $$1.g());
         }

         if ($$2.a((dhd)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jm n(dxn $$0) {
      switch ((dxy)$$0.c(L)) {
         case c:
            return jm.a;
         case a:
            return jm.b;
         default:
            return $$0.c(aF);
      }
   }
}

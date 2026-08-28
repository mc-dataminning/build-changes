import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmz extends dod {
   public static final dyo<dyb> c = dyg.X;

   protected dmz(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmz> a();

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dhc $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      for (jn $$1 : $$0.f()) {
         dxq $$2;
         if ($$1.o() == jn.a.b) {
            $$2 = this.m().b(c, $$1 == jn.b ? dyb.c : dyb.a).b(e, $$0.g());
         } else {
            $$2 = this.m().b(c, dyb.b).b(e, $$1.g());
         }

         if ($$2.a((dhc)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jn n(dxq $$0) {
      switch ((dyb)$$0.c(c)) {
         case c:
            return jn.a;
         case a:
            return jn.b;
         default:
            return $$0.c(e);
      }
   }
}

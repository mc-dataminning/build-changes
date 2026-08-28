import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmg extends dnj {
   public static final dxt<dxh> L = dxm.X;

   protected dmg(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmg> a();

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dgk $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      for (jn $$1 : $$0.f()) {
         dww $$2;
         if ($$1.o() == jn.a.b) {
            $$2 = this.m().b(L, $$1 == jn.b ? dxh.c : dxh.a).b(aF, $$0.g());
         } else {
            $$2 = this.m().b(L, dxh.b).b(aF, $$1.g());
         }

         if ($$2.a((dgk)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jn n(dww $$0) {
      switch ((dxh)$$0.c(L)) {
         case c:
            return jn.a;
         case a:
            return jn.b;
         default:
            return $$0.c(aF);
      }
   }
}

import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmf extends dni {
   public static final dxs<dxg> L = dxl.X;

   protected dmf(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmf> a();

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dgj $$0, ji $$1, jn $$2) {
      ji $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      for (jn $$1 : $$0.f()) {
         dwv $$2;
         if ($$1.o() == jn.a.b) {
            $$2 = this.m().b(L, $$1 == jn.b ? dxg.c : dxg.a).b(aF, $$0.g());
         } else {
            $$2 = this.m().b(L, dxg.b).b(aF, $$1.g());
         }

         if ($$2.a((dgj)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jn n(dwv $$0) {
      switch ((dxg)$$0.c(L)) {
         case c:
            return jn.a;
         case a:
            return jn.b;
         default:
            return $$0.c(aF);
      }
   }
}

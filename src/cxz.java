import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cxz extends cza {
   public static final dil<dhy> K = did.U;

   protected cxz(dhm.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cxz> a();

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(csi $$0, hx $$1, ib $$2) {
      hx $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      for (ib $$1 : $$0.f()) {
         dhn $$2;
         if ($$1.o() == ib.a.b) {
            $$2 = this.o().a(K, $$1 == ib.b ? dhy.c : dhy.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dhy.b).a(aE, $$1.g());
         }

         if ($$2.a((csi)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ib h(dhn $$0) {
      switch ((dhy)$$0.c(K)) {
         case c:
            return ib.a;
         case a:
            return ib.b;
         default:
            return $$0.c(aE);
      }
   }
}

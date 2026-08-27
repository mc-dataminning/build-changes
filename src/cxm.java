import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cxm extends cyo {
   public static final dhu<dhh> K = dhm.U;

   protected cxm(dgv.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cxm> a();

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(crv $$0, ht $$1, hx $$2) {
      ht $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      for (hx $$1 : $$0.f()) {
         dgw $$2;
         if ($$1.o() == hx.a.b) {
            $$2 = this.o().a(K, $$1 == hx.b ? dhh.c : dhh.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dhh.b).a(aE, $$1.g());
         }

         if ($$2.a((crv)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static hx h(dgw $$0) {
      switch ((dhh)$$0.c(K)) {
         case c:
            return hx.a;
         case a:
            return hx.b;
         default:
            return $$0.c(aE);
      }
   }
}

import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cxu extends cyv {
   public static final dig<dht> K = dhy.U;

   protected cxu(dhh.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cxu> a();

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(csd $$0, ht $$1, hx $$2) {
      ht $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      for (hx $$1 : $$0.f()) {
         dhi $$2;
         if ($$1.o() == hx.a.b) {
            $$2 = this.o().a(K, $$1 == hx.b ? dht.c : dht.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dht.b).a(aE, $$1.g());
         }

         if ($$2.a((csd)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static hx h(dhi $$0) {
      switch ((dht)$$0.c(K)) {
         case c:
            return hx.a;
         case a:
            return hx.b;
         default:
            return $$0.c(aE);
      }
   }
}

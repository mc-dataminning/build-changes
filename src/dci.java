import com.mojang.serialization.MapCodec;

public class dci extends cyv {
   public static final MapCodec<dci> a = b(dci::new);

   @Override
   public MapCodec<dci> a() {
      return a;
   }

   public dci(dhm.d $$0) {
      super($$0);
   }

   @Override
   public void a(csf $$0, dhn $$1, hx $$2, bkv $$3, float $$4) {
      if ($$3.bU()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ah().k());
      }
   }

   @Override
   public void a(crl $$0, bkv $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bkv $$0) {
      ejz $$1 = $$0.dq();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bll ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bkv $$3) {
      double $$4 = Math.abs($$3.dq().d);
      if ($$4 < 0.1 && !$$3.bT()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.g($$3.dq().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}

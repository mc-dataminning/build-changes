import com.mojang.serialization.MapCodec;

public class djb extends dfo {
   public static final MapCodec<djb> a = b(djb::new);

   @Override
   public MapCodec<djb> a() {
      return a;
   }

   public djb(doy.d $$0) {
      super($$0);
   }

   @Override
   public void a(cyx $$0, doz $$1, ib $$2, bpv $$3, float $$4) {
      if ($$3.bU()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ai().k());
      }
   }

   @Override
   public void a(cyd $$0, bpv $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bpv $$0) {
      esa $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bqo ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, bpv $$3) {
      double $$4 = Math.abs($$3.dp().d);
      if ($$4 < 0.1 && !$$3.bT()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.g($$3.dp().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}

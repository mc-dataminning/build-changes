import com.mojang.serialization.MapCodec;

public class ddm extends czz {
   public static final MapCodec<ddm> a = b(ddm::new);

   @Override
   public MapCodec<ddm> a() {
      return a;
   }

   public ddm(diz.d $$0) {
      super($$0);
   }

   @Override
   public void a(cti $$0, dja $$1, hx $$2, blp $$3, float $$4) {
      if ($$3.bU()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ai().k());
      }
   }

   @Override
   public void a(cso $$0, blp $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(blp $$0) {
      elm $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bmf ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, blp $$3) {
      double $$4 = Math.abs($$3.dp().d);
      if ($$4 < 0.1 && !$$3.bT()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.g($$3.dp().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}

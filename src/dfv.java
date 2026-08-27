import com.mojang.serialization.MapCodec;

public class dfv extends dci {
   public static final MapCodec<dfv> a = b(dfv::new);

   @Override
   public MapCodec<dfv> a() {
      return a;
   }

   public dfv(dli.d $$0) {
      super($$0);
   }

   @Override
   public void a(cvr $$0, dlj $$1, hz $$2, bnq $$3, float $$4) {
      if ($$3.bU()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ah().k());
      }
   }

   @Override
   public void a(cux $$0, bnq $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bnq $$0) {
      enz $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof boi ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, bnq $$3) {
      double $$4 = Math.abs($$3.dp().d);
      if ($$4 < 0.1 && !$$3.bT()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.g($$3.dp().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}

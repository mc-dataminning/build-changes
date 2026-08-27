import com.mojang.serialization.MapCodec;

public class dfr extends dce {
   public static final MapCodec<dfr> a = b(dfr::new);

   @Override
   public MapCodec<dfr> a() {
      return a;
   }

   public dfr(dle.d $$0) {
      super($$0);
   }

   @Override
   public void a(cvn $$0, dlf $$1, hz $$2, bno $$3, float $$4) {
      if ($$3.bU()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ai().k());
      }
   }

   @Override
   public void a(cut $$0, bno $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bno $$0) {
      ens $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bog ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bno $$3) {
      double $$4 = Math.abs($$3.dp().d);
      if ($$4 < 0.1 && !$$3.bT()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.g($$3.dp().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}

import com.mojang.serialization.MapCodec;

public class dpo extends dko {
   public static final MapCodec<dpo> a = b(dpo::new);
   private static final fcr b = dke.b(12.0, 0.0, 3.0);

   @Override
   public MapCodec<dpo> a() {
      return a;
   }

   public dpo(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b;
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.a(awp.aO) || $$0.a(dkg.ek) || super.b($$0, $$1, $$2);
   }
}

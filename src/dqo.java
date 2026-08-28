import com.mojang.serialization.MapCodec;

public class dqo extends dis implements dim {
   public static final MapCodec<dqo> a = b(dqo::new);
   protected static final float b = 6.0F;
   protected static final fal c = dij.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dqo> a() {
      return a;
   }

   protected dqo(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return c;
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return o($$2).m().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      dkr.a($$0, o($$3).m(), $$2, 2);
   }

   private static dkr o(dvo $$0) {
      return (dkr)($$0.a(dil.bu) ? dil.iI : dil.iH);
   }
}

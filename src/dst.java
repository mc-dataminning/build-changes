import com.mojang.serialization.MapCodec;

public class dst extends dkv implements dko {
   public static final MapCodec<dst> a = b(dst::new);
   protected static final float b = 6.0F;
   protected static final fcr c = dkl.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dst> a() {
      return a;
   }

   protected dst(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return c;
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return o($$2).m().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      dmv.a($$0, o($$3).m(), $$2, 2);
   }

   private static dmv o(dxu $$0) {
      return (dmv)($$0.a(dkn.bB) ? dkn.iZ : dkn.iY);
   }
}

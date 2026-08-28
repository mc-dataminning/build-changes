import com.mojang.serialization.MapCodec;

public class dsu extends dkw implements dkp {
   public static final MapCodec<dsu> a = b(dsu::new);
   protected static final float b = 6.0F;
   protected static final fcs c = dkm.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dsu> a() {
      return a;
   }

   protected dsu(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return c;
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return o($$2).m().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      dmw.a($$0, o($$3).m(), $$2, 2);
   }

   private static dmw o(dxv $$0) {
      return (dmw)($$0.a(dko.bB) ? dko.iZ : dko.iY);
   }
}

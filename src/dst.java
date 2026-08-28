import com.mojang.serialization.MapCodec;

public class dst extends dmw implements dkp {
   public static final MapCodec<dst> c = b(dst::new);

   @Override
   public MapCodec<dst> a() {
      return c;
   }

   public dst(dxu.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return true;
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      a($$0, $$2, new cxp(this));
   }
}

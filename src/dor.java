import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dor extends dob implements dpe {
   public static final MapCodec<dor> c = b(dor::new);
   protected static final fcr g = dkl.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dor> a() {
      return c;
   }

   protected dor(dxt.d $$0) {
      super($$0, jm.b, g, true, 0.14);
   }

   @Override
   protected boolean h(dxu $$0) {
      return $$0.a(dkn.J);
   }

   @Override
   protected dkl b() {
      return dkn.my;
   }

   @Override
   protected boolean o(dxu $$0) {
      return !$$0.a(dkn.le);
   }

   @Override
   public boolean a(@Nullable cpw $$0, dgm $$1, jh $$2, dxu $$3, etv $$4) {
      return false;
   }

   @Override
   public boolean a(dhi $$0, jh $$1, dxu $$2, etw $$3) {
      return false;
   }

   @Override
   protected int a(bam $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return $$1.a(aya.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected etw b_(dxu $$0) {
      return etx.c.a(false);
   }
}

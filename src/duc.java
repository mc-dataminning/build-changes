import com.mojang.serialization.MapCodec;

public class duc extends dob {
   public static final MapCodec<duc> c = b(duc::new);
   protected static final fcr g = dkl.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<duc> a() {
      return c;
   }

   public duc(dxt.d $$0) {
      super($$0, jm.a, g, false, 0.1);
   }

   @Override
   protected int a(bam $$0) {
      return dpt.a($$0);
   }

   @Override
   protected dkl b() {
      return dkn.oV;
   }

   @Override
   protected boolean h(dxu $$0) {
      return dpt.a($$0);
   }
}

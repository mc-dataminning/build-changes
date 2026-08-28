import com.mojang.serialization.MapCodec;

public class dth extends dob {
   public static final MapCodec<dth> c = b(dth::new);
   public static final fcr g = dkl.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dth> a() {
      return c;
   }

   public dth(dxt.d $$0) {
      super($$0, jm.b, g, false, 0.1);
   }

   @Override
   protected int a(bam $$0) {
      return dpt.a($$0);
   }

   @Override
   protected dkl b() {
      return dkn.oX;
   }

   @Override
   protected boolean h(dxu $$0) {
      return dpt.a($$0);
   }
}

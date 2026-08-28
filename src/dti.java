import com.mojang.serialization.MapCodec;

public class dti extends doa {
   public static final MapCodec<dti> c = b(dti::new);
   public static final fcr e = dkl.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dti> a() {
      return c;
   }

   public dti(dxt.d $$0) {
      super($$0, jm.b, e, false);
   }

   @Override
   protected dob c() {
      return (dob)dkn.oW;
   }
}

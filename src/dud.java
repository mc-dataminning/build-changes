import com.mojang.serialization.MapCodec;

public class dud extends doa {
   public static final MapCodec<dud> c = b(dud::new);
   public static final fcr e = dkl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dud> a() {
      return c;
   }

   public dud(dxt.d $$0) {
      super($$0, jm.a, e, false);
   }

   @Override
   protected dob c() {
      return (dob)dkn.oU;
   }
}

import com.mojang.serialization.MapCodec;

public class doq extends dip {
   public static final MapCodec<doq> c = b(doq::new);
   public static final ewm e = dfb.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<doq> a() {
      return c;
   }

   public doq(dsd.d $$0) {
      super($$0, je.a, e, false);
   }

   @Override
   protected diq c() {
      return (diq)dfd.oz;
   }
}

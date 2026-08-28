import com.mojang.serialization.MapCodec;

public class dob extends div {
   public static final MapCodec<dob> c = b(dob::new);
   public static final ewy e = dfh.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dob> a() {
      return c;
   }

   public dob(dsj.d $$0) {
      super($$0, jf.b, e, false);
   }

   @Override
   protected diw c() {
      return (diw)dfj.oB;
   }
}

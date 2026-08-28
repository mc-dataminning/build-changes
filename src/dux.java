import com.mojang.serialization.MapCodec;

public class dux extends dpk {
   public static final MapCodec<dux> c = b(dux::new);
   private static final feq e = dlu.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dux> a() {
      return c;
   }

   public dux(dzn.d $$0) {
      super($$0, ja.b, e, false);
   }

   @Override
   protected dpl c() {
      return (dpl)dlw.pd;
   }
}

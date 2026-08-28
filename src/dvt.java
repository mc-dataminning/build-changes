import com.mojang.serialization.MapCodec;

public class dvt extends dpk {
   public static final MapCodec<dvt> c = b(dvt::new);
   private static final feq e = dlu.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dvt> a() {
      return c;
   }

   public dvt(dzn.d $$0) {
      super($$0, ja.a, e, false);
   }

   @Override
   protected dpl c() {
      return (dpl)dlw.pb;
   }
}

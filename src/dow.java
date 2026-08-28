import com.mojang.serialization.MapCodec;

public class dow extends div {
   public static final MapCodec<dow> c = b(dow::new);
   public static final ewy e = dfh.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dow> a() {
      return c;
   }

   public dow(dsj.d $$0) {
      super($$0, jf.a, e, false);
   }

   @Override
   protected diw c() {
      return (diw)dfj.oz;
   }
}

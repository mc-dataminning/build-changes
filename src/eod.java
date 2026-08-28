import com.mojang.serialization.MapCodec;

public class eod<P extends eoc> {
   public static final eod<eof> a = a("two_layers_feature_size", eof.d);
   public static final eod<eoe> b = a("three_layers_feature_size", eoe.d);
   private final MapCodec<P> c;

   private static <P extends eoc> eod<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.Y, $$0, new eod<>($$1));
   }

   private eod(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}

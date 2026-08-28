import com.mojang.serialization.MapCodec;

public class eee<P extends eed> {
   public static final eee<eeg> a = a("two_layers_feature_size", eeg.d);
   public static final eee<eef> b = a("three_layers_feature_size", eef.d);
   private final MapCodec<P> c;

   private static <P extends eed> eee<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.aa, $$0, new eee<>($$1));
   }

   private eee(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}

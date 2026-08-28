import com.mojang.serialization.MapCodec;

public class eef<P extends eee> {
   public static final eef<eeh> a = a("two_layers_feature_size", eeh.d);
   public static final eef<eeg> b = a("three_layers_feature_size", eeg.d);
   private final MapCodec<P> c;

   private static <P extends eee> eef<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.aa, $$0, new eef<>($$1));
   }

   private eef(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}

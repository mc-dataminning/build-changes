import com.mojang.serialization.MapCodec;

public class eeg<P extends eef> {
   public static final eeg<eei> a = a("two_layers_feature_size", eei.d);
   public static final eeg<eeh> b = a("three_layers_feature_size", eeh.d);
   private final MapCodec<P> c;

   private static <P extends eef> eeg<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.aa, $$0, new eeg<>($$1));
   }

   private eeg(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}

import com.mojang.serialization.MapCodec;

public class elz<P extends ely> {
   public static final elz<emb> a = a("two_layers_feature_size", emb.d);
   public static final elz<ema> b = a("three_layers_feature_size", ema.d);
   private final MapCodec<P> c;

   private static <P extends ely> elz<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.Y, $$0, new elz<>($$1));
   }

   private elz(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}

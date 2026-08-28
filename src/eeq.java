import com.mojang.serialization.MapCodec;

public class eeq<P extends eep> {
   public static final eeq<ees> a = a("two_layers_feature_size", ees.d);
   public static final eeq<eer> b = a("three_layers_feature_size", eer.d);
   private final MapCodec<P> c;

   private static <P extends eep> eeq<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.Y, $$0, new eeq<>($$1));
   }

   private eeq(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}

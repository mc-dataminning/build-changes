import com.mojang.serialization.MapCodec;

public class eer<P extends eeq> {
   public static final eer<eet> a = a("two_layers_feature_size", eet.d);
   public static final eer<ees> b = a("three_layers_feature_size", ees.d);
   private final MapCodec<P> c;

   private static <P extends eeq> eer<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.Y, $$0, new eer<>($$1));
   }

   private eer(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}

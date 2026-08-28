import com.mojang.serialization.MapCodec;

public class ent<P extends ens> {
   public static final ent<env> a = a("two_layers_feature_size", env.d);
   public static final ent<enu> b = a("three_layers_feature_size", enu.d);
   private final MapCodec<P> c;

   private static <P extends ens> ent<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.Y, $$0, new ent<>($$1));
   }

   private ent(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}

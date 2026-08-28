import com.mojang.serialization.MapCodec;

public class enr<P extends enq> {
   public static final enr<ent> a = a("two_layers_feature_size", ent.d);
   public static final enr<ens> b = a("three_layers_feature_size", ens.d);
   private final MapCodec<P> c;

   private static <P extends enq> enr<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.Y, $$0, new enr<>($$1));
   }

   private enr(MapCodec<P> $$0) {
      this.c = $$0;
   }

   public MapCodec<P> a() {
      return this.c;
   }
}

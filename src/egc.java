import com.mojang.serialization.MapCodec;

public class egc<P extends egb> {
   public static final egc<ega> a = a("straight_trunk_placer", ega.a);
   public static final egc<efx> b = a("forking_trunk_placer", efx.a);
   public static final egc<efy> c = a("giant_trunk_placer", efy.a);
   public static final egc<efz> d = a("mega_jungle_trunk_placer", efz.b);
   public static final egc<efv> e = a("dark_oak_trunk_placer", efv.a);
   public static final egc<efw> f = a("fancy_trunk_placer", efw.a);
   public static final egc<eft> g = a("bending_trunk_placer", eft.a);
   public static final egc<egd> h = a("upwards_branching_trunk_placer", egd.a);
   public static final egc<efu> i = a("cherry_trunk_placer", efu.a);
   private final MapCodec<P> j;

   private static <P extends egb> egc<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.X, $$0, new egc<>($$1));
   }

   private egc(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

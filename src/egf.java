import com.mojang.serialization.MapCodec;

public class egf<P extends ege> {
   public static final egf<egd> a = a("straight_trunk_placer", egd.a);
   public static final egf<ega> b = a("forking_trunk_placer", ega.a);
   public static final egf<egb> c = a("giant_trunk_placer", egb.a);
   public static final egf<egc> d = a("mega_jungle_trunk_placer", egc.b);
   public static final egf<efy> e = a("dark_oak_trunk_placer", efy.a);
   public static final egf<efz> f = a("fancy_trunk_placer", efz.a);
   public static final egf<efw> g = a("bending_trunk_placer", efw.a);
   public static final egf<egg> h = a("upwards_branching_trunk_placer", egg.a);
   public static final egf<efx> i = a("cherry_trunk_placer", efx.a);
   private final MapCodec<P> j;

   private static <P extends ege> egf<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.X, $$0, new egf<>($$1));
   }

   private egf(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

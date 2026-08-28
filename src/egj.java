import com.mojang.serialization.MapCodec;

public class egj<P extends egi> {
   public static final egj<egh> a = a("straight_trunk_placer", egh.a);
   public static final egj<ege> b = a("forking_trunk_placer", ege.a);
   public static final egj<egf> c = a("giant_trunk_placer", egf.a);
   public static final egj<egg> d = a("mega_jungle_trunk_placer", egg.b);
   public static final egj<egc> e = a("dark_oak_trunk_placer", egc.a);
   public static final egj<egd> f = a("fancy_trunk_placer", egd.a);
   public static final egj<ega> g = a("bending_trunk_placer", ega.a);
   public static final egj<egk> h = a("upwards_branching_trunk_placer", egk.a);
   public static final egj<egb> i = a("cherry_trunk_placer", egb.a);
   private final MapCodec<P> j;

   private static <P extends egi> egj<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.X, $$0, new egj<>($$1));
   }

   private egj(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

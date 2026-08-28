import com.mojang.serialization.MapCodec;

public class egn<P extends egm> {
   public static final egn<egl> a = a("straight_trunk_placer", egl.a);
   public static final egn<egi> b = a("forking_trunk_placer", egi.a);
   public static final egn<egj> c = a("giant_trunk_placer", egj.a);
   public static final egn<egk> d = a("mega_jungle_trunk_placer", egk.b);
   public static final egn<egg> e = a("dark_oak_trunk_placer", egg.a);
   public static final egn<egh> f = a("fancy_trunk_placer", egh.a);
   public static final egn<ege> g = a("bending_trunk_placer", ege.a);
   public static final egn<ego> h = a("upwards_branching_trunk_placer", ego.a);
   public static final egn<egf> i = a("cherry_trunk_placer", egf.a);
   private final MapCodec<P> j;

   private static <P extends egm> egn<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.V, $$0, new egn<>($$1));
   }

   private egn(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

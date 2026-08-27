import com.mojang.serialization.Codec;

public class ehp<P extends eho> {
   public static final ehp<ehn> a = a("straight_trunk_placer", ehn.a);
   public static final ehp<ehk> b = a("forking_trunk_placer", ehk.a);
   public static final ehp<ehl> c = a("giant_trunk_placer", ehl.a);
   public static final ehp<ehm> d = a("mega_jungle_trunk_placer", ehm.b);
   public static final ehp<ehi> e = a("dark_oak_trunk_placer", ehi.a);
   public static final ehp<ehj> f = a("fancy_trunk_placer", ehj.a);
   public static final ehp<ehg> g = a("bending_trunk_placer", ehg.a);
   public static final ehp<ehq> h = a("upwards_branching_trunk_placer", ehq.a);
   public static final ehp<ehh> i = a("cherry_trunk_placer", ehh.a);
   private final Codec<P> j;

   private static <P extends eho> ehp<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.X, $$0, new ehp<>($$1));
   }

   private ehp(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}

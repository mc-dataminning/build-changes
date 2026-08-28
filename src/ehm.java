import com.mojang.serialization.MapCodec;

public class ehm<P extends ehl> {
   public static final ehm<ehk> a = a("straight_trunk_placer", ehk.a);
   public static final ehm<ehh> b = a("forking_trunk_placer", ehh.a);
   public static final ehm<ehi> c = a("giant_trunk_placer", ehi.a);
   public static final ehm<ehj> d = a("mega_jungle_trunk_placer", ehj.b);
   public static final ehm<ehf> e = a("dark_oak_trunk_placer", ehf.a);
   public static final ehm<ehg> f = a("fancy_trunk_placer", ehg.a);
   public static final ehm<ehd> g = a("bending_trunk_placer", ehd.a);
   public static final ehm<ehn> h = a("upwards_branching_trunk_placer", ehn.a);
   public static final ehm<ehe> i = a("cherry_trunk_placer", ehe.a);
   private final MapCodec<P> j;

   private static <P extends ehl> ehm<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.V, $$0, new ehm<>($$1));
   }

   private ehm(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

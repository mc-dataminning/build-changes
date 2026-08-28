import com.mojang.serialization.MapCodec;

public class ehj<P extends ehi> {
   public static final ehj<ehh> a = a("straight_trunk_placer", ehh.a);
   public static final ehj<ehe> b = a("forking_trunk_placer", ehe.a);
   public static final ehj<ehf> c = a("giant_trunk_placer", ehf.a);
   public static final ehj<ehg> d = a("mega_jungle_trunk_placer", ehg.b);
   public static final ehj<ehc> e = a("dark_oak_trunk_placer", ehc.a);
   public static final ehj<ehd> f = a("fancy_trunk_placer", ehd.a);
   public static final ehj<eha> g = a("bending_trunk_placer", eha.a);
   public static final ehj<ehk> h = a("upwards_branching_trunk_placer", ehk.a);
   public static final ehj<ehb> i = a("cherry_trunk_placer", ehb.a);
   private final MapCodec<P> j;

   private static <P extends ehi> ehj<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.V, $$0, new ehj<>($$1));
   }

   private ehj(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

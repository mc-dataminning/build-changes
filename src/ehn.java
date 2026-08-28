import com.mojang.serialization.MapCodec;

public class ehn<P extends ehm> {
   public static final ehn<ehl> a = a("straight_trunk_placer", ehl.a);
   public static final ehn<ehi> b = a("forking_trunk_placer", ehi.a);
   public static final ehn<ehj> c = a("giant_trunk_placer", ehj.a);
   public static final ehn<ehk> d = a("mega_jungle_trunk_placer", ehk.b);
   public static final ehn<ehg> e = a("dark_oak_trunk_placer", ehg.a);
   public static final ehn<ehh> f = a("fancy_trunk_placer", ehh.a);
   public static final ehn<ehe> g = a("bending_trunk_placer", ehe.a);
   public static final ehn<eho> h = a("upwards_branching_trunk_placer", eho.a);
   public static final ehn<ehf> i = a("cherry_trunk_placer", ehf.a);
   private final MapCodec<P> j;

   private static <P extends ehm> ehn<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.V, $$0, new ehn<>($$1));
   }

   private ehn(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

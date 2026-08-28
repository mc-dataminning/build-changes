import com.mojang.serialization.MapCodec;

public class ehh<P extends ehg> {
   public static final ehh<ehb> a = a("blob_foliage_placer", ehb.a);
   public static final ehh<ehm> b = a("spruce_foliage_placer", ehm.a);
   public static final ehh<ehk> c = a("pine_foliage_placer", ehk.a);
   public static final ehh<eha> d = a("acacia_foliage_placer", eha.a);
   public static final ehh<ehc> e = a("bush_foliage_placer", ehc.c);
   public static final ehh<ehf> f = a("fancy_foliage_placer", ehf.c);
   public static final ehh<ehi> g = a("jungle_foliage_placer", ehi.a);
   public static final ehh<ehj> h = a("mega_pine_foliage_placer", ehj.a);
   public static final ehh<ehe> i = a("dark_oak_foliage_placer", ehe.a);
   public static final ehh<ehl> j = a("random_spread_foliage_placer", ehl.a);
   public static final ehh<ehd> k = a("cherry_foliage_placer", ehd.a);
   private final MapCodec<P> l;

   private static <P extends ehg> ehh<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.U, $$0, new ehh<>($$1));
   }

   private ehh(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

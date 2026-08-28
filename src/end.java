import com.mojang.serialization.MapCodec;

public class end<P extends enc> {
   public static final end<emx> a = a("blob_foliage_placer", emx.a);
   public static final end<eni> b = a("spruce_foliage_placer", eni.a);
   public static final end<eng> c = a("pine_foliage_placer", eng.a);
   public static final end<emw> d = a("acacia_foliage_placer", emw.a);
   public static final end<emy> e = a("bush_foliage_placer", emy.c);
   public static final end<enb> f = a("fancy_foliage_placer", enb.c);
   public static final end<ene> g = a("jungle_foliage_placer", ene.a);
   public static final end<enf> h = a("mega_pine_foliage_placer", enf.a);
   public static final end<ena> i = a("dark_oak_foliage_placer", ena.a);
   public static final end<enh> j = a("random_spread_foliage_placer", enh.a);
   public static final end<emz> k = a("cherry_foliage_placer", emz.a);
   private final MapCodec<P> l;

   private static <P extends enc> end<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.U, $$0, new end<>($$1));
   }

   private end(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

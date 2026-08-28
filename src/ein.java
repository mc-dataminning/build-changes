import com.mojang.serialization.MapCodec;

public class ein<P extends eim> {
   public static final ein<eih> a = a("blob_foliage_placer", eih.a);
   public static final ein<eis> b = a("spruce_foliage_placer", eis.a);
   public static final ein<eiq> c = a("pine_foliage_placer", eiq.a);
   public static final ein<eig> d = a("acacia_foliage_placer", eig.a);
   public static final ein<eii> e = a("bush_foliage_placer", eii.c);
   public static final ein<eil> f = a("fancy_foliage_placer", eil.c);
   public static final ein<eio> g = a("jungle_foliage_placer", eio.a);
   public static final ein<eip> h = a("mega_pine_foliage_placer", eip.a);
   public static final ein<eik> i = a("dark_oak_foliage_placer", eik.a);
   public static final ein<eir> j = a("random_spread_foliage_placer", eir.a);
   public static final ein<eij> k = a("cherry_foliage_placer", eij.a);
   private final MapCodec<P> l;

   private static <P extends eim> ein<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.U, $$0, new ein<>($$1));
   }

   private ein(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

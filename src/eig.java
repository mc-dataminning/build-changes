import com.mojang.serialization.MapCodec;

public class eig<P extends eif> {
   public static final eig<eia> a = a("blob_foliage_placer", eia.a);
   public static final eig<eil> b = a("spruce_foliage_placer", eil.a);
   public static final eig<eij> c = a("pine_foliage_placer", eij.a);
   public static final eig<ehz> d = a("acacia_foliage_placer", ehz.a);
   public static final eig<eib> e = a("bush_foliage_placer", eib.c);
   public static final eig<eie> f = a("fancy_foliage_placer", eie.c);
   public static final eig<eih> g = a("jungle_foliage_placer", eih.a);
   public static final eig<eii> h = a("mega_pine_foliage_placer", eii.a);
   public static final eig<eid> i = a("dark_oak_foliage_placer", eid.a);
   public static final eig<eik> j = a("random_spread_foliage_placer", eik.a);
   public static final eig<eic> k = a("cherry_foliage_placer", eic.a);
   private final MapCodec<P> l;

   private static <P extends eif> eig<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.U, $$0, new eig<>($$1));
   }

   private eig(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

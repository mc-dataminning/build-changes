import com.mojang.serialization.MapCodec;

public class efc<P extends efb> {
   public static final efc<eew> a = a("blob_foliage_placer", eew.a);
   public static final efc<efh> b = a("spruce_foliage_placer", efh.a);
   public static final efc<eff> c = a("pine_foliage_placer", eff.a);
   public static final efc<eev> d = a("acacia_foliage_placer", eev.a);
   public static final efc<eex> e = a("bush_foliage_placer", eex.c);
   public static final efc<efa> f = a("fancy_foliage_placer", efa.c);
   public static final efc<efd> g = a("jungle_foliage_placer", efd.a);
   public static final efc<efe> h = a("mega_pine_foliage_placer", efe.a);
   public static final efc<eez> i = a("dark_oak_foliage_placer", eez.a);
   public static final efc<efg> j = a("random_spread_foliage_placer", efg.a);
   public static final efc<eey> k = a("cherry_foliage_placer", eey.a);
   private final MapCodec<P> l;

   private static <P extends efb> efc<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.U, $$0, new efc<>($$1));
   }

   private efc(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

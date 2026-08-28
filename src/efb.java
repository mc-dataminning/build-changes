import com.mojang.serialization.MapCodec;

public class efb<P extends efa> {
   public static final efb<eev> a = a("blob_foliage_placer", eev.a);
   public static final efb<efg> b = a("spruce_foliage_placer", efg.a);
   public static final efb<efe> c = a("pine_foliage_placer", efe.a);
   public static final efb<eeu> d = a("acacia_foliage_placer", eeu.a);
   public static final efb<eew> e = a("bush_foliage_placer", eew.c);
   public static final efb<eez> f = a("fancy_foliage_placer", eez.c);
   public static final efb<efc> g = a("jungle_foliage_placer", efc.a);
   public static final efb<efd> h = a("mega_pine_foliage_placer", efd.a);
   public static final efb<eey> i = a("dark_oak_foliage_placer", eey.a);
   public static final efb<eff> j = a("random_spread_foliage_placer", eff.a);
   public static final efb<eex> k = a("cherry_foliage_placer", eex.a);
   private final MapCodec<P> l;

   private static <P extends efa> efb<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.U, $$0, new efb<>($$1));
   }

   private efb(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

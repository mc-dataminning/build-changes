import com.mojang.serialization.MapCodec;

public class eev<P extends eeu> {
   public static final eev<eep> a = a("blob_foliage_placer", eep.a);
   public static final eev<efa> b = a("spruce_foliage_placer", efa.a);
   public static final eev<eey> c = a("pine_foliage_placer", eey.a);
   public static final eev<eeo> d = a("acacia_foliage_placer", eeo.a);
   public static final eev<eeq> e = a("bush_foliage_placer", eeq.c);
   public static final eev<eet> f = a("fancy_foliage_placer", eet.c);
   public static final eev<eew> g = a("jungle_foliage_placer", eew.a);
   public static final eev<eex> h = a("mega_pine_foliage_placer", eex.a);
   public static final eev<ees> i = a("dark_oak_foliage_placer", ees.a);
   public static final eev<eez> j = a("random_spread_foliage_placer", eez.a);
   public static final eev<eer> k = a("cherry_foliage_placer", eer.a);
   private final MapCodec<P> l;

   private static <P extends eeu> eev<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.U, $$0, new eev<>($$1));
   }

   private eev(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

import com.mojang.serialization.MapCodec;

public class egt<P extends egs> {
   public static final egt<egn> a = a("blob_foliage_placer", egn.a);
   public static final egt<egy> b = a("spruce_foliage_placer", egy.a);
   public static final egt<egw> c = a("pine_foliage_placer", egw.a);
   public static final egt<egm> d = a("acacia_foliage_placer", egm.a);
   public static final egt<ego> e = a("bush_foliage_placer", ego.c);
   public static final egt<egr> f = a("fancy_foliage_placer", egr.c);
   public static final egt<egu> g = a("jungle_foliage_placer", egu.a);
   public static final egt<egv> h = a("mega_pine_foliage_placer", egv.a);
   public static final egt<egq> i = a("dark_oak_foliage_placer", egq.a);
   public static final egt<egx> j = a("random_spread_foliage_placer", egx.a);
   public static final egt<egp> k = a("cherry_foliage_placer", egp.a);
   private final MapCodec<P> l;

   private static <P extends egs> egt<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.U, $$0, new egt<>($$1));
   }

   private egt(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

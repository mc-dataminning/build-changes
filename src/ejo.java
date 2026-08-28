import com.mojang.serialization.MapCodec;

public class ejo<P extends ejn> {
   public static final ejo<eji> a = a("blob_foliage_placer", eji.a);
   public static final ejo<ejt> b = a("spruce_foliage_placer", ejt.a);
   public static final ejo<ejr> c = a("pine_foliage_placer", ejr.a);
   public static final ejo<ejh> d = a("acacia_foliage_placer", ejh.a);
   public static final ejo<ejj> e = a("bush_foliage_placer", ejj.c);
   public static final ejo<ejm> f = a("fancy_foliage_placer", ejm.c);
   public static final ejo<ejp> g = a("jungle_foliage_placer", ejp.a);
   public static final ejo<ejq> h = a("mega_pine_foliage_placer", ejq.a);
   public static final ejo<ejl> i = a("dark_oak_foliage_placer", ejl.a);
   public static final ejo<ejs> j = a("random_spread_foliage_placer", ejs.a);
   public static final ejo<ejk> k = a("cherry_foliage_placer", ejk.a);
   private final MapCodec<P> l;

   private static <P extends ejn> ejo<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.U, $$0, new ejo<>($$1));
   }

   private ejo(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

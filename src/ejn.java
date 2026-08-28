import com.mojang.serialization.MapCodec;

public class ejn<P extends ejm> {
   public static final ejn<ejh> a = a("blob_foliage_placer", ejh.a);
   public static final ejn<ejs> b = a("spruce_foliage_placer", ejs.a);
   public static final ejn<ejq> c = a("pine_foliage_placer", ejq.a);
   public static final ejn<ejg> d = a("acacia_foliage_placer", ejg.a);
   public static final ejn<eji> e = a("bush_foliage_placer", eji.c);
   public static final ejn<ejl> f = a("fancy_foliage_placer", ejl.c);
   public static final ejn<ejo> g = a("jungle_foliage_placer", ejo.a);
   public static final ejn<ejp> h = a("mega_pine_foliage_placer", ejp.a);
   public static final ejn<ejk> i = a("dark_oak_foliage_placer", ejk.a);
   public static final ejn<ejr> j = a("random_spread_foliage_placer", ejr.a);
   public static final ejn<ejj> k = a("cherry_foliage_placer", ejj.a);
   private final MapCodec<P> l;

   private static <P extends ejm> ejn<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.U, $$0, new ejn<>($$1));
   }

   private ejn(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

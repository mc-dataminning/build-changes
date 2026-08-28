import com.mojang.serialization.MapCodec;

public class ejq<P extends ejp> {
   public static final ejq<ejk> a = a("blob_foliage_placer", ejk.a);
   public static final ejq<ejv> b = a("spruce_foliage_placer", ejv.a);
   public static final ejq<ejt> c = a("pine_foliage_placer", ejt.a);
   public static final ejq<ejj> d = a("acacia_foliage_placer", ejj.a);
   public static final ejq<ejl> e = a("bush_foliage_placer", ejl.c);
   public static final ejq<ejo> f = a("fancy_foliage_placer", ejo.c);
   public static final ejq<ejr> g = a("jungle_foliage_placer", ejr.a);
   public static final ejq<ejs> h = a("mega_pine_foliage_placer", ejs.a);
   public static final ejq<ejn> i = a("dark_oak_foliage_placer", ejn.a);
   public static final ejq<eju> j = a("random_spread_foliage_placer", eju.a);
   public static final ejq<ejm> k = a("cherry_foliage_placer", ejm.a);
   private final MapCodec<P> l;

   private static <P extends ejp> ejq<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.U, $$0, new ejq<>($$1));
   }

   private ejq(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

import com.mojang.serialization.MapCodec;

public class ejp<P extends ejo> {
   public static final ejp<ejj> a = a("blob_foliage_placer", ejj.a);
   public static final ejp<eju> b = a("spruce_foliage_placer", eju.a);
   public static final ejp<ejs> c = a("pine_foliage_placer", ejs.a);
   public static final ejp<eji> d = a("acacia_foliage_placer", eji.a);
   public static final ejp<ejk> e = a("bush_foliage_placer", ejk.c);
   public static final ejp<ejn> f = a("fancy_foliage_placer", ejn.c);
   public static final ejp<ejq> g = a("jungle_foliage_placer", ejq.a);
   public static final ejp<ejr> h = a("mega_pine_foliage_placer", ejr.a);
   public static final ejp<ejm> i = a("dark_oak_foliage_placer", ejm.a);
   public static final ejp<ejt> j = a("random_spread_foliage_placer", ejt.a);
   public static final ejp<ejl> k = a("cherry_foliage_placer", ejl.a);
   private final MapCodec<P> l;

   private static <P extends ejo> ejp<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.U, $$0, new ejp<>($$1));
   }

   private ejp(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

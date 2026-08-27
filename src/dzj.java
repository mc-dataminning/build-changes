import com.mojang.serialization.Codec;

public class dzj<P extends dzi> {
   public static final dzj<dzd> a = a("blob_foliage_placer", dzd.a);
   public static final dzj<dzo> b = a("spruce_foliage_placer", dzo.a);
   public static final dzj<dzm> c = a("pine_foliage_placer", dzm.a);
   public static final dzj<dzc> d = a("acacia_foliage_placer", dzc.a);
   public static final dzj<dze> e = a("bush_foliage_placer", dze.c);
   public static final dzj<dzh> f = a("fancy_foliage_placer", dzh.c);
   public static final dzj<dzk> g = a("jungle_foliage_placer", dzk.a);
   public static final dzj<dzl> h = a("mega_pine_foliage_placer", dzl.a);
   public static final dzj<dzg> i = a("dark_oak_foliage_placer", dzg.a);
   public static final dzj<dzn> j = a("random_spread_foliage_placer", dzn.a);
   public static final dzj<dzf> k = a("cherry_foliage_placer", dzf.a);
   private final Codec<P> l;

   private static <P extends dzi> dzj<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.W, $$0, new dzj<>($$1));
   }

   private dzj(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}

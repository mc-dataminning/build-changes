import com.mojang.serialization.Codec;

public class dzh<P extends dzg> {
   public static final dzh<dzb> a = a("blob_foliage_placer", dzb.a);
   public static final dzh<dzm> b = a("spruce_foliage_placer", dzm.a);
   public static final dzh<dzk> c = a("pine_foliage_placer", dzk.a);
   public static final dzh<dza> d = a("acacia_foliage_placer", dza.a);
   public static final dzh<dzc> e = a("bush_foliage_placer", dzc.c);
   public static final dzh<dzf> f = a("fancy_foliage_placer", dzf.c);
   public static final dzh<dzi> g = a("jungle_foliage_placer", dzi.a);
   public static final dzh<dzj> h = a("mega_pine_foliage_placer", dzj.a);
   public static final dzh<dze> i = a("dark_oak_foliage_placer", dze.a);
   public static final dzh<dzl> j = a("random_spread_foliage_placer", dzl.a);
   public static final dzh<dzd> k = a("cherry_foliage_placer", dzd.a);
   private final Codec<P> l;

   private static <P extends dzg> dzh<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.W, $$0, new dzh<>($$1));
   }

   private dzh(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}

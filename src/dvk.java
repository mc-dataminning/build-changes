import com.mojang.serialization.Codec;

public class dvk<P extends dvj> {
   public static final dvk<dve> a = a("blob_foliage_placer", dve.a);
   public static final dvk<dvp> b = a("spruce_foliage_placer", dvp.a);
   public static final dvk<dvn> c = a("pine_foliage_placer", dvn.a);
   public static final dvk<dvd> d = a("acacia_foliage_placer", dvd.a);
   public static final dvk<dvf> e = a("bush_foliage_placer", dvf.c);
   public static final dvk<dvi> f = a("fancy_foliage_placer", dvi.c);
   public static final dvk<dvl> g = a("jungle_foliage_placer", dvl.a);
   public static final dvk<dvm> h = a("mega_pine_foliage_placer", dvm.a);
   public static final dvk<dvh> i = a("dark_oak_foliage_placer", dvh.a);
   public static final dvk<dvo> j = a("random_spread_foliage_placer", dvo.a);
   public static final dvk<dvg> k = a("cherry_foliage_placer", dvg.a);
   private final Codec<P> l;

   private static <P extends dvj> dvk<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.W, $$0, new dvk<>($$1));
   }

   private dvk(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}

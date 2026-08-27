import com.mojang.serialization.Codec;

public class dvl<P extends dvk> {
   public static final dvl<dvf> a = a("blob_foliage_placer", dvf.a);
   public static final dvl<dvq> b = a("spruce_foliage_placer", dvq.a);
   public static final dvl<dvo> c = a("pine_foliage_placer", dvo.a);
   public static final dvl<dve> d = a("acacia_foliage_placer", dve.a);
   public static final dvl<dvg> e = a("bush_foliage_placer", dvg.c);
   public static final dvl<dvj> f = a("fancy_foliage_placer", dvj.c);
   public static final dvl<dvm> g = a("jungle_foliage_placer", dvm.a);
   public static final dvl<dvn> h = a("mega_pine_foliage_placer", dvn.a);
   public static final dvl<dvi> i = a("dark_oak_foliage_placer", dvi.a);
   public static final dvl<dvp> j = a("random_spread_foliage_placer", dvp.a);
   public static final dvl<dvh> k = a("cherry_foliage_placer", dvh.a);
   private final Codec<P> l;

   private static <P extends dvk> dvl<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.W, $$0, new dvl<>($$1));
   }

   private dvl(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}

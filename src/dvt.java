import com.mojang.serialization.Codec;

public class dvt<P extends dvs> {
   public static final dvt<dvn> a = a("blob_foliage_placer", dvn.a);
   public static final dvt<dvy> b = a("spruce_foliage_placer", dvy.a);
   public static final dvt<dvw> c = a("pine_foliage_placer", dvw.a);
   public static final dvt<dvm> d = a("acacia_foliage_placer", dvm.a);
   public static final dvt<dvo> e = a("bush_foliage_placer", dvo.c);
   public static final dvt<dvr> f = a("fancy_foliage_placer", dvr.c);
   public static final dvt<dvu> g = a("jungle_foliage_placer", dvu.a);
   public static final dvt<dvv> h = a("mega_pine_foliage_placer", dvv.a);
   public static final dvt<dvq> i = a("dark_oak_foliage_placer", dvq.a);
   public static final dvt<dvx> j = a("random_spread_foliage_placer", dvx.a);
   public static final dvt<dvp> k = a("cherry_foliage_placer", dvp.a);
   private final Codec<P> l;

   private static <P extends dvs> dvt<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.W, $$0, new dvt<>($$1));
   }

   private dvt(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}

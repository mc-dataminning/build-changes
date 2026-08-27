import com.mojang.serialization.Codec;

public class dsf<P extends dse> {
   public static final dsf<drz> a = a("blob_foliage_placer", drz.a);
   public static final dsf<dsk> b = a("spruce_foliage_placer", dsk.a);
   public static final dsf<dsi> c = a("pine_foliage_placer", dsi.a);
   public static final dsf<dry> d = a("acacia_foliage_placer", dry.a);
   public static final dsf<dsa> e = a("bush_foliage_placer", dsa.c);
   public static final dsf<dsd> f = a("fancy_foliage_placer", dsd.c);
   public static final dsf<dsg> g = a("jungle_foliage_placer", dsg.a);
   public static final dsf<dsh> h = a("mega_pine_foliage_placer", dsh.a);
   public static final dsf<dsc> i = a("dark_oak_foliage_placer", dsc.a);
   public static final dsf<dsj> j = a("random_spread_foliage_placer", dsj.a);
   public static final dsf<dsb> k = a("cherry_foliage_placer", dsb.a);
   private final Codec<P> l;

   private static <P extends dse> dsf<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.X, $$0, new dsf<>($$1));
   }

   private dsf(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}

import com.mojang.serialization.Codec;

public class ead<P extends eac> {
   public static final ead<eab> a = a("straight_trunk_placer", eab.a);
   public static final ead<dzy> b = a("forking_trunk_placer", dzy.a);
   public static final ead<dzz> c = a("giant_trunk_placer", dzz.a);
   public static final ead<eaa> d = a("mega_jungle_trunk_placer", eaa.b);
   public static final ead<dzw> e = a("dark_oak_trunk_placer", dzw.a);
   public static final ead<dzx> f = a("fancy_trunk_placer", dzx.a);
   public static final ead<dzu> g = a("bending_trunk_placer", dzu.a);
   public static final ead<eae> h = a("upwards_branching_trunk_placer", eae.a);
   public static final ead<dzv> i = a("cherry_trunk_placer", dzv.a);
   private final Codec<P> j;

   private static <P extends eac> ead<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.X, $$0, new ead<>($$1));
   }

   private ead(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}

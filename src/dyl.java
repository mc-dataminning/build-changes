import com.mojang.serialization.Codec;

public class dyl<P extends dyk> {
   public static final dyl<dyf> a = a("blob_foliage_placer", dyf.a);
   public static final dyl<dyq> b = a("spruce_foliage_placer", dyq.a);
   public static final dyl<dyo> c = a("pine_foliage_placer", dyo.a);
   public static final dyl<dye> d = a("acacia_foliage_placer", dye.a);
   public static final dyl<dyg> e = a("bush_foliage_placer", dyg.c);
   public static final dyl<dyj> f = a("fancy_foliage_placer", dyj.c);
   public static final dyl<dym> g = a("jungle_foliage_placer", dym.a);
   public static final dyl<dyn> h = a("mega_pine_foliage_placer", dyn.a);
   public static final dyl<dyi> i = a("dark_oak_foliage_placer", dyi.a);
   public static final dyl<dyp> j = a("random_spread_foliage_placer", dyp.a);
   public static final dyl<dyh> k = a("cherry_foliage_placer", dyh.a);
   private final Codec<P> l;

   private static <P extends dyk> dyl<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.W, $$0, new dyl<>($$1));
   }

   private dyl(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}

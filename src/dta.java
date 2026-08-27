import com.mojang.serialization.Codec;

public class dta<P extends dsz> {
   public static final dta<dsu> a = a("blob_foliage_placer", dsu.a);
   public static final dta<dtf> b = a("spruce_foliage_placer", dtf.a);
   public static final dta<dtd> c = a("pine_foliage_placer", dtd.a);
   public static final dta<dst> d = a("acacia_foliage_placer", dst.a);
   public static final dta<dsv> e = a("bush_foliage_placer", dsv.c);
   public static final dta<dsy> f = a("fancy_foliage_placer", dsy.c);
   public static final dta<dtb> g = a("jungle_foliage_placer", dtb.a);
   public static final dta<dtc> h = a("mega_pine_foliage_placer", dtc.a);
   public static final dta<dsx> i = a("dark_oak_foliage_placer", dsx.a);
   public static final dta<dte> j = a("random_spread_foliage_placer", dte.a);
   public static final dta<dsw> k = a("cherry_foliage_placer", dsw.a);
   private final Codec<P> l;

   private static <P extends dsz> dta<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.X, $$0, new dta<>($$1));
   }

   private dta(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}

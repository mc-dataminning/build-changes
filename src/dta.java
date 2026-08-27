import com.mojang.serialization.Codec;

public class dta<P extends dsz> {
   public static final dta<dsy> a = a("straight_trunk_placer", dsy.a);
   public static final dta<dsv> b = a("forking_trunk_placer", dsv.a);
   public static final dta<dsw> c = a("giant_trunk_placer", dsw.a);
   public static final dta<dsx> d = a("mega_jungle_trunk_placer", dsx.b);
   public static final dta<dst> e = a("dark_oak_trunk_placer", dst.a);
   public static final dta<dsu> f = a("fancy_trunk_placer", dsu.a);
   public static final dta<dsr> g = a("bending_trunk_placer", dsr.a);
   public static final dta<dtb> h = a("upwards_branching_trunk_placer", dtb.a);
   public static final dta<dss> i = a("cherry_trunk_placer", dss.a);
   private final Codec<P> j;

   private static <P extends dsz> dta<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.Y, $$0, new dta<>($$1));
   }

   private dta(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}

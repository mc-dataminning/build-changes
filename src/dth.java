import com.mojang.serialization.Codec;

public class dth<P extends dtg> {
   public static final dth<dtf> a = a("straight_trunk_placer", dtf.a);
   public static final dth<dtc> b = a("forking_trunk_placer", dtc.a);
   public static final dth<dtd> c = a("giant_trunk_placer", dtd.a);
   public static final dth<dte> d = a("mega_jungle_trunk_placer", dte.b);
   public static final dth<dta> e = a("dark_oak_trunk_placer", dta.a);
   public static final dth<dtb> f = a("fancy_trunk_placer", dtb.a);
   public static final dth<dsy> g = a("bending_trunk_placer", dsy.a);
   public static final dth<dti> h = a("upwards_branching_trunk_placer", dti.a);
   public static final dth<dsz> i = a("cherry_trunk_placer", dsz.a);
   private final Codec<P> j;

   private static <P extends dtg> dth<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.Y, $$0, new dth<>($$1));
   }

   private dth(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}

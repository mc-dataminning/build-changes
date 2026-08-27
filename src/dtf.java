import com.mojang.serialization.Codec;

public class dtf<P extends dte> {
   public static final dtf<dtd> a = a("straight_trunk_placer", dtd.a);
   public static final dtf<dta> b = a("forking_trunk_placer", dta.a);
   public static final dtf<dtb> c = a("giant_trunk_placer", dtb.a);
   public static final dtf<dtc> d = a("mega_jungle_trunk_placer", dtc.b);
   public static final dtf<dsy> e = a("dark_oak_trunk_placer", dsy.a);
   public static final dtf<dsz> f = a("fancy_trunk_placer", dsz.a);
   public static final dtf<dsw> g = a("bending_trunk_placer", dsw.a);
   public static final dtf<dtg> h = a("upwards_branching_trunk_placer", dtg.a);
   public static final dtf<dsx> i = a("cherry_trunk_placer", dsx.a);
   private final Codec<P> j;

   private static <P extends dte> dtf<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.Y, $$0, new dtf<>($$1));
   }

   private dtf(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}

import com.mojang.serialization.Codec;

public class dzi<P extends dzh> {
   public static final dzi<dzg> a = a("straight_trunk_placer", dzg.a);
   public static final dzi<dzd> b = a("forking_trunk_placer", dzd.a);
   public static final dzi<dze> c = a("giant_trunk_placer", dze.a);
   public static final dzi<dzf> d = a("mega_jungle_trunk_placer", dzf.b);
   public static final dzi<dzb> e = a("dark_oak_trunk_placer", dzb.a);
   public static final dzi<dzc> f = a("fancy_trunk_placer", dzc.a);
   public static final dzi<dyz> g = a("bending_trunk_placer", dyz.a);
   public static final dzi<dzj> h = a("upwards_branching_trunk_placer", dzj.a);
   public static final dzi<dza> i = a("cherry_trunk_placer", dza.a);
   private final Codec<P> j;

   private static <P extends dzh> dzi<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.X, $$0, new dzi<>($$1));
   }

   private dzi(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}

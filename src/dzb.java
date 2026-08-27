import com.mojang.serialization.Codec;

public class dzb<P extends dza> {
   public static final dzb<dyz> a = a("straight_trunk_placer", dyz.a);
   public static final dzb<dyw> b = a("forking_trunk_placer", dyw.a);
   public static final dzb<dyx> c = a("giant_trunk_placer", dyx.a);
   public static final dzb<dyy> d = a("mega_jungle_trunk_placer", dyy.b);
   public static final dzb<dyu> e = a("dark_oak_trunk_placer", dyu.a);
   public static final dzb<dyv> f = a("fancy_trunk_placer", dyv.a);
   public static final dzb<dys> g = a("bending_trunk_placer", dys.a);
   public static final dzb<dzc> h = a("upwards_branching_trunk_placer", dzc.a);
   public static final dzb<dyt> i = a("cherry_trunk_placer", dyt.a);
   private final Codec<P> j;

   private static <P extends dza> dzb<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.X, $$0, new dzb<>($$1));
   }

   private dzb(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}

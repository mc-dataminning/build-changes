import com.mojang.serialization.Codec;

public class ebb<P extends eba> {
   public static final ebb<eaz> a = a("straight_trunk_placer", eaz.a);
   public static final ebb<eaw> b = a("forking_trunk_placer", eaw.a);
   public static final ebb<eax> c = a("giant_trunk_placer", eax.a);
   public static final ebb<eay> d = a("mega_jungle_trunk_placer", eay.b);
   public static final ebb<eau> e = a("dark_oak_trunk_placer", eau.a);
   public static final ebb<eav> f = a("fancy_trunk_placer", eav.a);
   public static final ebb<eas> g = a("bending_trunk_placer", eas.a);
   public static final ebb<ebc> h = a("upwards_branching_trunk_placer", ebc.a);
   public static final ebb<eat> i = a("cherry_trunk_placer", eat.a);
   private final Codec<P> j;

   private static <P extends eba> ebb<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.X, $$0, new ebb<>($$1));
   }

   private ebb(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}

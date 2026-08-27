import com.mojang.serialization.Codec;

public class eaz<P extends eay> {
   public static final eaz<eax> a = a("straight_trunk_placer", eax.a);
   public static final eaz<eau> b = a("forking_trunk_placer", eau.a);
   public static final eaz<eav> c = a("giant_trunk_placer", eav.a);
   public static final eaz<eaw> d = a("mega_jungle_trunk_placer", eaw.b);
   public static final eaz<eas> e = a("dark_oak_trunk_placer", eas.a);
   public static final eaz<eat> f = a("fancy_trunk_placer", eat.a);
   public static final eaz<eaq> g = a("bending_trunk_placer", eaq.a);
   public static final eaz<eba> h = a("upwards_branching_trunk_placer", eba.a);
   public static final eaz<ear> i = a("cherry_trunk_placer", ear.a);
   private final Codec<P> j;

   private static <P extends eay> eaz<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.X, $$0, new eaz<>($$1));
   }

   private eaz(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}

import com.mojang.serialization.Codec;

public class ede<P extends edd> {
   public static final ede<edc> a = a("straight_trunk_placer", edc.a);
   public static final ede<ecz> b = a("forking_trunk_placer", ecz.a);
   public static final ede<eda> c = a("giant_trunk_placer", eda.a);
   public static final ede<edb> d = a("mega_jungle_trunk_placer", edb.b);
   public static final ede<ecx> e = a("dark_oak_trunk_placer", ecx.a);
   public static final ede<ecy> f = a("fancy_trunk_placer", ecy.a);
   public static final ede<ecv> g = a("bending_trunk_placer", ecv.a);
   public static final ede<edf> h = a("upwards_branching_trunk_placer", edf.a);
   public static final ede<ecw> i = a("cherry_trunk_placer", ecw.a);
   private final Codec<P> j;

   private static <P extends edd> ede<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.X, $$0, new ede<>($$1));
   }

   private ede(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}

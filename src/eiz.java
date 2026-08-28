import com.mojang.serialization.MapCodec;

public class eiz<P extends eiy> {
   public static final eiz<eix> a = a("straight_trunk_placer", eix.a);
   public static final eiz<eiu> b = a("forking_trunk_placer", eiu.a);
   public static final eiz<eiv> c = a("giant_trunk_placer", eiv.a);
   public static final eiz<eiw> d = a("mega_jungle_trunk_placer", eiw.b);
   public static final eiz<eis> e = a("dark_oak_trunk_placer", eis.a);
   public static final eiz<eit> f = a("fancy_trunk_placer", eit.a);
   public static final eiz<eiq> g = a("bending_trunk_placer", eiq.a);
   public static final eiz<eja> h = a("upwards_branching_trunk_placer", eja.a);
   public static final eiz<eir> i = a("cherry_trunk_placer", eir.a);
   private final MapCodec<P> j;

   private static <P extends eiy> eiz<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.V, $$0, new eiz<>($$1));
   }

   private eiz(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

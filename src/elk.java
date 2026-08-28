import com.mojang.serialization.MapCodec;

public class elk<P extends elj> {
   public static final elk<eli> a = a("straight_trunk_placer", eli.a);
   public static final elk<elf> b = a("forking_trunk_placer", elf.a);
   public static final elk<elg> c = a("giant_trunk_placer", elg.a);
   public static final elk<elh> d = a("mega_jungle_trunk_placer", elh.b);
   public static final elk<eld> e = a("dark_oak_trunk_placer", eld.a);
   public static final elk<ele> f = a("fancy_trunk_placer", ele.a);
   public static final elk<elb> g = a("bending_trunk_placer", elb.a);
   public static final elk<ell> h = a("upwards_branching_trunk_placer", ell.a);
   public static final elk<elc> i = a("cherry_trunk_placer", elc.a);
   private final MapCodec<P> j;

   private static <P extends elj> elk<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.V, $$0, new elk<>($$1));
   }

   private elk(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

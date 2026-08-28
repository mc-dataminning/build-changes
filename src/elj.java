import com.mojang.serialization.MapCodec;

public class elj<P extends eli> {
   public static final elj<elh> a = a("straight_trunk_placer", elh.a);
   public static final elj<ele> b = a("forking_trunk_placer", ele.a);
   public static final elj<elf> c = a("giant_trunk_placer", elf.a);
   public static final elj<elg> d = a("mega_jungle_trunk_placer", elg.b);
   public static final elj<elc> e = a("dark_oak_trunk_placer", elc.a);
   public static final elj<eld> f = a("fancy_trunk_placer", eld.a);
   public static final elj<ela> g = a("bending_trunk_placer", ela.a);
   public static final elj<elk> h = a("upwards_branching_trunk_placer", elk.a);
   public static final elj<elb> i = a("cherry_trunk_placer", elb.a);
   private final MapCodec<P> j;

   private static <P extends eli> elj<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.V, $$0, new elj<>($$1));
   }

   private elj(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

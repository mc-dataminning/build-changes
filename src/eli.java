import com.mojang.serialization.MapCodec;

public class eli<P extends elh> {
   public static final eli<elg> a = a("straight_trunk_placer", elg.a);
   public static final eli<eld> b = a("forking_trunk_placer", eld.a);
   public static final eli<ele> c = a("giant_trunk_placer", ele.a);
   public static final eli<elf> d = a("mega_jungle_trunk_placer", elf.b);
   public static final eli<elb> e = a("dark_oak_trunk_placer", elb.a);
   public static final eli<elc> f = a("fancy_trunk_placer", elc.a);
   public static final eli<ekz> g = a("bending_trunk_placer", ekz.a);
   public static final eli<elj> h = a("upwards_branching_trunk_placer", elj.a);
   public static final eli<ela> i = a("cherry_trunk_placer", ela.a);
   private final MapCodec<P> j;

   private static <P extends elh> eli<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.V, $$0, new eli<>($$1));
   }

   private eli(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

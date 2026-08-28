import com.mojang.serialization.MapCodec;

public class elh<P extends elg> {
   public static final elh<elf> a = a("straight_trunk_placer", elf.a);
   public static final elh<elc> b = a("forking_trunk_placer", elc.a);
   public static final elh<eld> c = a("giant_trunk_placer", eld.a);
   public static final elh<ele> d = a("mega_jungle_trunk_placer", ele.b);
   public static final elh<ela> e = a("dark_oak_trunk_placer", ela.a);
   public static final elh<elb> f = a("fancy_trunk_placer", elb.a);
   public static final elh<eky> g = a("bending_trunk_placer", eky.a);
   public static final elh<eli> h = a("upwards_branching_trunk_placer", eli.a);
   public static final elh<ekz> i = a("cherry_trunk_placer", ekz.a);
   private final MapCodec<P> j;

   private static <P extends elg> elh<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.V, $$0, new elh<>($$1));
   }

   private elh(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

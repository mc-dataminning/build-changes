import com.mojang.serialization.MapCodec;

public class efi<P extends efh> {
   public static final efi<efg> a = a("straight_trunk_placer", efg.a);
   public static final efi<efd> b = a("forking_trunk_placer", efd.a);
   public static final efi<efe> c = a("giant_trunk_placer", efe.a);
   public static final efi<eff> d = a("mega_jungle_trunk_placer", eff.b);
   public static final efi<efb> e = a("dark_oak_trunk_placer", efb.a);
   public static final efi<efc> f = a("fancy_trunk_placer", efc.a);
   public static final efi<eez> g = a("bending_trunk_placer", eez.a);
   public static final efi<efj> h = a("upwards_branching_trunk_placer", efj.a);
   public static final efi<efa> i = a("cherry_trunk_placer", efa.a);
   private final MapCodec<P> j;

   private static <P extends efh> efi<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.X, $$0, new efi<>($$1));
   }

   private efi(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

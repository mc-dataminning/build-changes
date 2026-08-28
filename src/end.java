import com.mojang.serialization.MapCodec;

public class end<P extends enc> {
   public static final end<enb> a = a("straight_trunk_placer", enb.a);
   public static final end<emy> b = a("forking_trunk_placer", emy.a);
   public static final end<emz> c = a("giant_trunk_placer", emz.a);
   public static final end<ena> d = a("mega_jungle_trunk_placer", ena.b);
   public static final end<emw> e = a("dark_oak_trunk_placer", emw.a);
   public static final end<emx> f = a("fancy_trunk_placer", emx.a);
   public static final end<emu> g = a("bending_trunk_placer", emu.a);
   public static final end<ene> h = a("upwards_branching_trunk_placer", ene.a);
   public static final end<emv> i = a("cherry_trunk_placer", emv.a);
   private final MapCodec<P> j;

   private static <P extends enc> end<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.V, $$0, new end<>($$1));
   }

   private end(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

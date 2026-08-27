import com.mojang.serialization.Codec;

public class dxc<P extends dxb> {
   public static final dxc<dxa> a = a("straight_trunk_placer", dxa.a);
   public static final dxc<dwx> b = a("forking_trunk_placer", dwx.a);
   public static final dxc<dwy> c = a("giant_trunk_placer", dwy.a);
   public static final dxc<dwz> d = a("mega_jungle_trunk_placer", dwz.b);
   public static final dxc<dwv> e = a("dark_oak_trunk_placer", dwv.a);
   public static final dxc<dww> f = a("fancy_trunk_placer", dww.a);
   public static final dxc<dwt> g = a("bending_trunk_placer", dwt.a);
   public static final dxc<dxd> h = a("upwards_branching_trunk_placer", dxd.a);
   public static final dxc<dwu> i = a("cherry_trunk_placer", dwu.a);
   private final Codec<P> j;

   private static <P extends dxb> dxc<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.X, $$0, new dxc<>($$1));
   }

   private dxc(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}

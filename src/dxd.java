import com.mojang.serialization.Codec;

public class dxd<P extends dxc> {
   public static final dxd<dxb> a = a("straight_trunk_placer", dxb.a);
   public static final dxd<dwy> b = a("forking_trunk_placer", dwy.a);
   public static final dxd<dwz> c = a("giant_trunk_placer", dwz.a);
   public static final dxd<dxa> d = a("mega_jungle_trunk_placer", dxa.b);
   public static final dxd<dww> e = a("dark_oak_trunk_placer", dww.a);
   public static final dxd<dwx> f = a("fancy_trunk_placer", dwx.a);
   public static final dxd<dwu> g = a("bending_trunk_placer", dwu.a);
   public static final dxd<dxe> h = a("upwards_branching_trunk_placer", dxe.a);
   public static final dxd<dwv> i = a("cherry_trunk_placer", dwv.a);
   private final Codec<P> j;

   private static <P extends dxc> dxd<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.X, $$0, new dxd<>($$1));
   }

   private dxd(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}

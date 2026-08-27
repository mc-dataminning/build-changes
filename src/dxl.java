import com.mojang.serialization.Codec;

public class dxl<P extends dxk> {
   public static final dxl<dxj> a = a("straight_trunk_placer", dxj.a);
   public static final dxl<dxg> b = a("forking_trunk_placer", dxg.a);
   public static final dxl<dxh> c = a("giant_trunk_placer", dxh.a);
   public static final dxl<dxi> d = a("mega_jungle_trunk_placer", dxi.b);
   public static final dxl<dxe> e = a("dark_oak_trunk_placer", dxe.a);
   public static final dxl<dxf> f = a("fancy_trunk_placer", dxf.a);
   public static final dxl<dxc> g = a("bending_trunk_placer", dxc.a);
   public static final dxl<dxm> h = a("upwards_branching_trunk_placer", dxm.a);
   public static final dxl<dxd> i = a("cherry_trunk_placer", dxd.a);
   private final Codec<P> j;

   private static <P extends dxk> dxl<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.X, $$0, new dxl<>($$1));
   }

   private dxl(Codec<P> $$0) {
      this.j = $$0;
   }

   public Codec<P> a() {
      return this.j;
   }
}

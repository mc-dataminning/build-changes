import com.mojang.serialization.MapCodec;

public class ejy<P extends ejx> {
   public static final ejy<ejw> a = a("straight_trunk_placer", ejw.a);
   public static final ejy<ejt> b = a("forking_trunk_placer", ejt.a);
   public static final ejy<eju> c = a("giant_trunk_placer", eju.a);
   public static final ejy<ejv> d = a("mega_jungle_trunk_placer", ejv.b);
   public static final ejy<ejr> e = a("dark_oak_trunk_placer", ejr.a);
   public static final ejy<ejs> f = a("fancy_trunk_placer", ejs.a);
   public static final ejy<ejp> g = a("bending_trunk_placer", ejp.a);
   public static final ejy<ejz> h = a("upwards_branching_trunk_placer", ejz.a);
   public static final ejy<ejq> i = a("cherry_trunk_placer", ejq.a);
   private final MapCodec<P> j;

   private static <P extends ejx> ejy<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.V, $$0, new ejy<>($$1));
   }

   private ejy(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

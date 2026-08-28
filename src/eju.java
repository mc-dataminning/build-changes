import com.mojang.serialization.MapCodec;

public class eju<P extends ejt> {
   public static final eju<ejs> a = a("straight_trunk_placer", ejs.a);
   public static final eju<ejp> b = a("forking_trunk_placer", ejp.a);
   public static final eju<ejq> c = a("giant_trunk_placer", ejq.a);
   public static final eju<ejr> d = a("mega_jungle_trunk_placer", ejr.b);
   public static final eju<ejn> e = a("dark_oak_trunk_placer", ejn.a);
   public static final eju<ejo> f = a("fancy_trunk_placer", ejo.a);
   public static final eju<ejl> g = a("bending_trunk_placer", ejl.a);
   public static final eju<ejv> h = a("upwards_branching_trunk_placer", ejv.a);
   public static final eju<ejm> i = a("cherry_trunk_placer", ejm.a);
   private final MapCodec<P> j;

   private static <P extends ejt> eju<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.V, $$0, new eju<>($$1));
   }

   private eju(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

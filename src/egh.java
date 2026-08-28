import com.mojang.serialization.MapCodec;

public class egh<P extends egg> {
   public static final egh<egi> a = a("trunk_vine", egi.a);
   public static final egh<egf> b = a("leave_vine", egf.a);
   public static final egh<ege> c = a("cocoa", ege.a);
   public static final egh<egd> d = a("beehive", egd.a);
   public static final egh<egb> e = a("alter_ground", egb.a);
   public static final egh<egc> f = a("attached_to_leaves", egc.a);
   private final MapCodec<P> g;

   private static <P extends egg> egh<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.X, $$0, new egh<>($$1));
   }

   private egh(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}

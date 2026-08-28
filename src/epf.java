import com.mojang.serialization.MapCodec;

public class epf<P extends epe> {
   public static final epf<epd> a = a("straight_trunk_placer", epd.a);
   public static final epf<epa> b = a("forking_trunk_placer", epa.a);
   public static final epf<epb> c = a("giant_trunk_placer", epb.a);
   public static final epf<epc> d = a("mega_jungle_trunk_placer", epc.b);
   public static final epf<eoy> e = a("dark_oak_trunk_placer", eoy.a);
   public static final epf<eoz> f = a("fancy_trunk_placer", eoz.a);
   public static final epf<eow> g = a("bending_trunk_placer", eow.a);
   public static final epf<epg> h = a("upwards_branching_trunk_placer", epg.a);
   public static final epf<eox> i = a("cherry_trunk_placer", eox.a);
   private final MapCodec<P> j;

   private static <P extends epe> epf<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.V, $$0, new epf<>($$1));
   }

   private epf(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

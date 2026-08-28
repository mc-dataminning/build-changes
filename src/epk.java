import com.mojang.serialization.MapCodec;

public class epk<P extends epj> {
   public static final epk<epi> a = a("straight_trunk_placer", epi.a);
   public static final epk<epf> b = a("forking_trunk_placer", epf.a);
   public static final epk<epg> c = a("giant_trunk_placer", epg.a);
   public static final epk<eph> d = a("mega_jungle_trunk_placer", eph.b);
   public static final epk<epd> e = a("dark_oak_trunk_placer", epd.a);
   public static final epk<epe> f = a("fancy_trunk_placer", epe.a);
   public static final epk<epb> g = a("bending_trunk_placer", epb.a);
   public static final epk<epl> h = a("upwards_branching_trunk_placer", epl.a);
   public static final epk<epc> i = a("cherry_trunk_placer", epc.a);
   private final MapCodec<P> j;

   private static <P extends epj> epk<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.V, $$0, new epk<>($$1));
   }

   private epk(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

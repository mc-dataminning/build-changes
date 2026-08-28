import com.mojang.serialization.MapCodec;

public class emh<P extends emg> {
   public static final emh<emf> a = a("straight_trunk_placer", emf.a);
   public static final emh<emc> b = a("forking_trunk_placer", emc.a);
   public static final emh<emd> c = a("giant_trunk_placer", emd.a);
   public static final emh<eme> d = a("mega_jungle_trunk_placer", eme.b);
   public static final emh<ema> e = a("dark_oak_trunk_placer", ema.a);
   public static final emh<emb> f = a("fancy_trunk_placer", emb.a);
   public static final emh<ely> g = a("bending_trunk_placer", ely.a);
   public static final emh<emi> h = a("upwards_branching_trunk_placer", emi.a);
   public static final emh<elz> i = a("cherry_trunk_placer", elz.a);
   private final MapCodec<P> j;

   private static <P extends emg> emh<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.V, $$0, new emh<>($$1));
   }

   private emh(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

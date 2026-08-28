import com.mojang.serialization.MapCodec;

public class emg<P extends emf> {
   public static final emg<eme> a = a("straight_trunk_placer", eme.a);
   public static final emg<emb> b = a("forking_trunk_placer", emb.a);
   public static final emg<emc> c = a("giant_trunk_placer", emc.a);
   public static final emg<emd> d = a("mega_jungle_trunk_placer", emd.b);
   public static final emg<elz> e = a("dark_oak_trunk_placer", elz.a);
   public static final emg<ema> f = a("fancy_trunk_placer", ema.a);
   public static final emg<elx> g = a("bending_trunk_placer", elx.a);
   public static final emg<emh> h = a("upwards_branching_trunk_placer", emh.a);
   public static final emg<ely> i = a("cherry_trunk_placer", ely.a);
   private final MapCodec<P> j;

   private static <P extends emf> emg<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.V, $$0, new emg<>($$1));
   }

   private emg(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

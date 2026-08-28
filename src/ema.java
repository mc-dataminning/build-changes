import com.mojang.serialization.MapCodec;

public class ema<P extends elz> {
   public static final ema<ely> a = a("straight_trunk_placer", ely.a);
   public static final ema<elv> b = a("forking_trunk_placer", elv.a);
   public static final ema<elw> c = a("giant_trunk_placer", elw.a);
   public static final ema<elx> d = a("mega_jungle_trunk_placer", elx.b);
   public static final ema<elt> e = a("dark_oak_trunk_placer", elt.a);
   public static final ema<elu> f = a("fancy_trunk_placer", elu.a);
   public static final ema<elr> g = a("bending_trunk_placer", elr.a);
   public static final ema<emb> h = a("upwards_branching_trunk_placer", emb.a);
   public static final ema<els> i = a("cherry_trunk_placer", els.a);
   private final MapCodec<P> j;

   private static <P extends elz> ema<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.V, $$0, new ema<>($$1));
   }

   private ema(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

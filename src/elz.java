import com.mojang.serialization.MapCodec;

public class elz<P extends ely> {
   public static final elz<elx> a = a("straight_trunk_placer", elx.a);
   public static final elz<elu> b = a("forking_trunk_placer", elu.a);
   public static final elz<elv> c = a("giant_trunk_placer", elv.a);
   public static final elz<elw> d = a("mega_jungle_trunk_placer", elw.b);
   public static final elz<els> e = a("dark_oak_trunk_placer", els.a);
   public static final elz<elt> f = a("fancy_trunk_placer", elt.a);
   public static final elz<elq> g = a("bending_trunk_placer", elq.a);
   public static final elz<ema> h = a("upwards_branching_trunk_placer", ema.a);
   public static final elz<elr> i = a("cherry_trunk_placer", elr.a);
   private final MapCodec<P> j;

   private static <P extends ely> elz<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.V, $$0, new elz<>($$1));
   }

   private elz(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}

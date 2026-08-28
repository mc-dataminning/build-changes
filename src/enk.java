import com.mojang.serialization.MapCodec;

public class enk<P extends enj> {
   public static final enk<ene> a = a("blob_foliage_placer", ene.a);
   public static final enk<enp> b = a("spruce_foliage_placer", enp.a);
   public static final enk<enn> c = a("pine_foliage_placer", enn.a);
   public static final enk<end> d = a("acacia_foliage_placer", end.a);
   public static final enk<enf> e = a("bush_foliage_placer", enf.c);
   public static final enk<eni> f = a("fancy_foliage_placer", eni.c);
   public static final enk<enl> g = a("jungle_foliage_placer", enl.a);
   public static final enk<enm> h = a("mega_pine_foliage_placer", enm.a);
   public static final enk<enh> i = a("dark_oak_foliage_placer", enh.a);
   public static final enk<eno> j = a("random_spread_foliage_placer", eno.a);
   public static final enk<eng> k = a("cherry_foliage_placer", eng.a);
   private final MapCodec<P> l;

   private static <P extends enj> enk<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.U, $$0, new enk<>($$1));
   }

   private enk(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

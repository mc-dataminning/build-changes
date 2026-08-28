import com.mojang.serialization.MapCodec;

public class enp<P extends eno> {
   public static final enp<enj> a = a("blob_foliage_placer", enj.a);
   public static final enp<enu> b = a("spruce_foliage_placer", enu.a);
   public static final enp<ens> c = a("pine_foliage_placer", ens.a);
   public static final enp<eni> d = a("acacia_foliage_placer", eni.a);
   public static final enp<enk> e = a("bush_foliage_placer", enk.c);
   public static final enp<enn> f = a("fancy_foliage_placer", enn.c);
   public static final enp<enq> g = a("jungle_foliage_placer", enq.a);
   public static final enp<enr> h = a("mega_pine_foliage_placer", enr.a);
   public static final enp<enm> i = a("dark_oak_foliage_placer", enm.a);
   public static final enp<ent> j = a("random_spread_foliage_placer", ent.a);
   public static final enp<enl> k = a("cherry_foliage_placer", enl.a);
   private final MapCodec<P> l;

   private static <P extends eno> enp<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.U, $$0, new enp<>($$1));
   }

   private enp(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

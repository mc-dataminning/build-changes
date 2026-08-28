import com.mojang.serialization.MapCodec;

public class eli<P extends elh> {
   public static final eli<elc> a = a("blob_foliage_placer", elc.a);
   public static final eli<eln> b = a("spruce_foliage_placer", eln.a);
   public static final eli<ell> c = a("pine_foliage_placer", ell.a);
   public static final eli<elb> d = a("acacia_foliage_placer", elb.a);
   public static final eli<eld> e = a("bush_foliage_placer", eld.c);
   public static final eli<elg> f = a("fancy_foliage_placer", elg.c);
   public static final eli<elj> g = a("jungle_foliage_placer", elj.a);
   public static final eli<elk> h = a("mega_pine_foliage_placer", elk.a);
   public static final eli<elf> i = a("dark_oak_foliage_placer", elf.a);
   public static final eli<elm> j = a("random_spread_foliage_placer", elm.a);
   public static final eli<ele> k = a("cherry_foliage_placer", ele.a);
   private final MapCodec<P> l;

   private static <P extends elh> eli<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.U, $$0, new eli<>($$1));
   }

   private eli(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

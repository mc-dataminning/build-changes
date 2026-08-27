import com.mojang.serialization.Codec;

public class ebm<P extends ebl> {
   public static final ebm<ebg> a = a("blob_foliage_placer", ebg.a);
   public static final ebm<ebr> b = a("spruce_foliage_placer", ebr.a);
   public static final ebm<ebp> c = a("pine_foliage_placer", ebp.a);
   public static final ebm<ebf> d = a("acacia_foliage_placer", ebf.a);
   public static final ebm<ebh> e = a("bush_foliage_placer", ebh.c);
   public static final ebm<ebk> f = a("fancy_foliage_placer", ebk.c);
   public static final ebm<ebn> g = a("jungle_foliage_placer", ebn.a);
   public static final ebm<ebo> h = a("mega_pine_foliage_placer", ebo.a);
   public static final ebm<ebj> i = a("dark_oak_foliage_placer", ebj.a);
   public static final ebm<ebq> j = a("random_spread_foliage_placer", ebq.a);
   public static final ebm<ebi> k = a("cherry_foliage_placer", ebi.a);
   private final Codec<P> l;

   private static <P extends ebl> ebm<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.W, $$0, new ebm<>($$1));
   }

   private ebm(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}

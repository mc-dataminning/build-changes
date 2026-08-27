import com.mojang.serialization.Codec;

public class dre<P extends drd> {
   public static final dre<dqy> a = a("blob_foliage_placer", dqy.a);
   public static final dre<drj> b = a("spruce_foliage_placer", drj.a);
   public static final dre<drh> c = a("pine_foliage_placer", drh.a);
   public static final dre<dqx> d = a("acacia_foliage_placer", dqx.a);
   public static final dre<dqz> e = a("bush_foliage_placer", dqz.c);
   public static final dre<drc> f = a("fancy_foliage_placer", drc.c);
   public static final dre<drf> g = a("jungle_foliage_placer", drf.a);
   public static final dre<drg> h = a("mega_pine_foliage_placer", drg.a);
   public static final dre<drb> i = a("dark_oak_foliage_placer", drb.a);
   public static final dre<dri> j = a("random_spread_foliage_placer", dri.a);
   public static final dre<dra> k = a("cherry_foliage_placer", dra.a);
   private final Codec<P> l;

   private static <P extends drd> dre<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.X, $$0, new dre<>($$1));
   }

   private dre(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}

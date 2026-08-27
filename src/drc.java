import com.mojang.serialization.Codec;

public class drc<P extends drb> {
   public static final drc<dqw> a = a("blob_foliage_placer", dqw.a);
   public static final drc<drh> b = a("spruce_foliage_placer", drh.a);
   public static final drc<drf> c = a("pine_foliage_placer", drf.a);
   public static final drc<dqv> d = a("acacia_foliage_placer", dqv.a);
   public static final drc<dqx> e = a("bush_foliage_placer", dqx.c);
   public static final drc<dra> f = a("fancy_foliage_placer", dra.c);
   public static final drc<drd> g = a("jungle_foliage_placer", drd.a);
   public static final drc<dre> h = a("mega_pine_foliage_placer", dre.a);
   public static final drc<dqz> i = a("dark_oak_foliage_placer", dqz.a);
   public static final drc<drg> j = a("random_spread_foliage_placer", drg.a);
   public static final drc<dqy> k = a("cherry_foliage_placer", dqy.a);
   private final Codec<P> l;

   private static <P extends drb> drc<P> a(String $$0, Codec<P> $$1) {
      return hs.a(jc.X, $$0, new drc<>($$1));
   }

   private drc(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}

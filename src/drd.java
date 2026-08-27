import com.mojang.serialization.Codec;

public class drd<P extends drc> {
   public static final drd<dqx> a = a("blob_foliage_placer", dqx.a);
   public static final drd<dri> b = a("spruce_foliage_placer", dri.a);
   public static final drd<drg> c = a("pine_foliage_placer", drg.a);
   public static final drd<dqw> d = a("acacia_foliage_placer", dqw.a);
   public static final drd<dqy> e = a("bush_foliage_placer", dqy.c);
   public static final drd<drb> f = a("fancy_foliage_placer", drb.c);
   public static final drd<dre> g = a("jungle_foliage_placer", dre.a);
   public static final drd<drf> h = a("mega_pine_foliage_placer", drf.a);
   public static final drd<dra> i = a("dark_oak_foliage_placer", dra.a);
   public static final drd<drh> j = a("random_spread_foliage_placer", drh.a);
   public static final drd<dqz> k = a("cherry_foliage_placer", dqz.a);
   private final Codec<P> l;

   private static <P extends drc> drd<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.X, $$0, new drd<>($$1));
   }

   private drd(Codec<P> $$0) {
      this.l = $$0;
   }

   public Codec<P> a() {
      return this.l;
   }
}

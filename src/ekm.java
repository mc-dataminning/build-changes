import com.mojang.serialization.MapCodec;

public class ekm<P extends ekl> {
   public static final ekm<ekg> a = a("blob_foliage_placer", ekg.a);
   public static final ekm<ekr> b = a("spruce_foliage_placer", ekr.a);
   public static final ekm<ekp> c = a("pine_foliage_placer", ekp.a);
   public static final ekm<ekf> d = a("acacia_foliage_placer", ekf.a);
   public static final ekm<ekh> e = a("bush_foliage_placer", ekh.c);
   public static final ekm<ekk> f = a("fancy_foliage_placer", ekk.c);
   public static final ekm<ekn> g = a("jungle_foliage_placer", ekn.a);
   public static final ekm<eko> h = a("mega_pine_foliage_placer", eko.a);
   public static final ekm<ekj> i = a("dark_oak_foliage_placer", ekj.a);
   public static final ekm<ekq> j = a("random_spread_foliage_placer", ekq.a);
   public static final ekm<eki> k = a("cherry_foliage_placer", eki.a);
   private final MapCodec<P> l;

   private static <P extends ekl> ekm<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.U, $$0, new ekm<>($$1));
   }

   private ekm(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

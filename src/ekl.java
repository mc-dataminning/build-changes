import com.mojang.serialization.MapCodec;

public class ekl<P extends ekk> {
   public static final ekl<ekf> a = a("blob_foliage_placer", ekf.a);
   public static final ekl<ekq> b = a("spruce_foliage_placer", ekq.a);
   public static final ekl<eko> c = a("pine_foliage_placer", eko.a);
   public static final ekl<eke> d = a("acacia_foliage_placer", eke.a);
   public static final ekl<ekg> e = a("bush_foliage_placer", ekg.c);
   public static final ekl<ekj> f = a("fancy_foliage_placer", ekj.c);
   public static final ekl<ekm> g = a("jungle_foliage_placer", ekm.a);
   public static final ekl<ekn> h = a("mega_pine_foliage_placer", ekn.a);
   public static final ekl<eki> i = a("dark_oak_foliage_placer", eki.a);
   public static final ekl<ekp> j = a("random_spread_foliage_placer", ekp.a);
   public static final ekl<ekh> k = a("cherry_foliage_placer", ekh.a);
   private final MapCodec<P> l;

   private static <P extends ekk> ekl<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.U, $$0, new ekl<>($$1));
   }

   private ekl(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

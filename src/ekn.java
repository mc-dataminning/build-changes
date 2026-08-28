import com.mojang.serialization.MapCodec;

public class ekn<P extends ekm> {
   public static final ekn<ekh> a = a("blob_foliage_placer", ekh.a);
   public static final ekn<eks> b = a("spruce_foliage_placer", eks.a);
   public static final ekn<ekq> c = a("pine_foliage_placer", ekq.a);
   public static final ekn<ekg> d = a("acacia_foliage_placer", ekg.a);
   public static final ekn<eki> e = a("bush_foliage_placer", eki.c);
   public static final ekn<ekl> f = a("fancy_foliage_placer", ekl.c);
   public static final ekn<eko> g = a("jungle_foliage_placer", eko.a);
   public static final ekn<ekp> h = a("mega_pine_foliage_placer", ekp.a);
   public static final ekn<ekk> i = a("dark_oak_foliage_placer", ekk.a);
   public static final ekn<ekr> j = a("random_spread_foliage_placer", ekr.a);
   public static final ekn<ekj> k = a("cherry_foliage_placer", ekj.a);
   private final MapCodec<P> l;

   private static <P extends ekm> ekn<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.U, $$0, new ekn<>($$1));
   }

   private ekn(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

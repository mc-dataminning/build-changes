import com.mojang.serialization.MapCodec;

public class ekg<P extends ekf> {
   public static final ekg<eka> a = a("blob_foliage_placer", eka.a);
   public static final ekg<ekl> b = a("spruce_foliage_placer", ekl.a);
   public static final ekg<ekj> c = a("pine_foliage_placer", ekj.a);
   public static final ekg<ejz> d = a("acacia_foliage_placer", ejz.a);
   public static final ekg<ekb> e = a("bush_foliage_placer", ekb.c);
   public static final ekg<eke> f = a("fancy_foliage_placer", eke.c);
   public static final ekg<ekh> g = a("jungle_foliage_placer", ekh.a);
   public static final ekg<eki> h = a("mega_pine_foliage_placer", eki.a);
   public static final ekg<ekd> i = a("dark_oak_foliage_placer", ekd.a);
   public static final ekg<ekk> j = a("random_spread_foliage_placer", ekk.a);
   public static final ekg<ekc> k = a("cherry_foliage_placer", ekc.a);
   private final MapCodec<P> l;

   private static <P extends ekf> ekg<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.U, $$0, new ekg<>($$1));
   }

   private ekg(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

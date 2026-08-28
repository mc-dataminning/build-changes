import com.mojang.serialization.MapCodec;

public class eoo<P extends eon> {
   public static final eoo<eoi> a = a("blob_foliage_placer", eoi.a);
   public static final eoo<eot> b = a("spruce_foliage_placer", eot.a);
   public static final eoo<eor> c = a("pine_foliage_placer", eor.a);
   public static final eoo<eoh> d = a("acacia_foliage_placer", eoh.a);
   public static final eoo<eoj> e = a("bush_foliage_placer", eoj.c);
   public static final eoo<eom> f = a("fancy_foliage_placer", eom.c);
   public static final eoo<eop> g = a("jungle_foliage_placer", eop.a);
   public static final eoo<eoq> h = a("mega_pine_foliage_placer", eoq.a);
   public static final eoo<eol> i = a("dark_oak_foliage_placer", eol.a);
   public static final eoo<eos> j = a("random_spread_foliage_placer", eos.a);
   public static final eoo<eok> k = a("cherry_foliage_placer", eok.a);
   private final MapCodec<P> l;

   private static <P extends eon> eoo<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.U, $$0, new eoo<>($$1));
   }

   private eoo(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

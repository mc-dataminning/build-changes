import com.mojang.serialization.MapCodec;

public class eoe<P extends eod> {
   public static final eoe<eny> a = a("blob_foliage_placer", eny.a);
   public static final eoe<eoj> b = a("spruce_foliage_placer", eoj.a);
   public static final eoe<eoh> c = a("pine_foliage_placer", eoh.a);
   public static final eoe<enx> d = a("acacia_foliage_placer", enx.a);
   public static final eoe<enz> e = a("bush_foliage_placer", enz.c);
   public static final eoe<eoc> f = a("fancy_foliage_placer", eoc.c);
   public static final eoe<eof> g = a("jungle_foliage_placer", eof.a);
   public static final eoe<eog> h = a("mega_pine_foliage_placer", eog.a);
   public static final eoe<eob> i = a("dark_oak_foliage_placer", eob.a);
   public static final eoe<eoi> j = a("random_spread_foliage_placer", eoi.a);
   public static final eoe<eoa> k = a("cherry_foliage_placer", eoa.a);
   private final MapCodec<P> l;

   private static <P extends eod> eoe<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.U, $$0, new eoe<>($$1));
   }

   private eoe(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

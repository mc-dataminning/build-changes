import com.mojang.serialization.MapCodec;

public class eoc<P extends eob> {
   public static final eoc<enw> a = a("blob_foliage_placer", enw.a);
   public static final eoc<eoh> b = a("spruce_foliage_placer", eoh.a);
   public static final eoc<eof> c = a("pine_foliage_placer", eof.a);
   public static final eoc<env> d = a("acacia_foliage_placer", env.a);
   public static final eoc<enx> e = a("bush_foliage_placer", enx.c);
   public static final eoc<eoa> f = a("fancy_foliage_placer", eoa.c);
   public static final eoc<eod> g = a("jungle_foliage_placer", eod.a);
   public static final eoc<eoe> h = a("mega_pine_foliage_placer", eoe.a);
   public static final eoc<enz> i = a("dark_oak_foliage_placer", enz.a);
   public static final eoc<eog> j = a("random_spread_foliage_placer", eog.a);
   public static final eoc<eny> k = a("cherry_foliage_placer", eny.a);
   private final MapCodec<P> l;

   private static <P extends eob> eoc<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.U, $$0, new eoc<>($$1));
   }

   private eoc(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

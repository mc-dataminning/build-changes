import com.mojang.serialization.MapCodec;

public class ehw<P extends ehv> {
   public static final ehw<ehq> a = a("blob_foliage_placer", ehq.a);
   public static final ehw<eib> b = a("spruce_foliage_placer", eib.a);
   public static final ehw<ehz> c = a("pine_foliage_placer", ehz.a);
   public static final ehw<ehp> d = a("acacia_foliage_placer", ehp.a);
   public static final ehw<ehr> e = a("bush_foliage_placer", ehr.c);
   public static final ehw<ehu> f = a("fancy_foliage_placer", ehu.c);
   public static final ehw<ehx> g = a("jungle_foliage_placer", ehx.a);
   public static final ehw<ehy> h = a("mega_pine_foliage_placer", ehy.a);
   public static final ehw<eht> i = a("dark_oak_foliage_placer", eht.a);
   public static final ehw<eia> j = a("random_spread_foliage_placer", eia.a);
   public static final ehw<ehs> k = a("cherry_foliage_placer", ehs.a);
   private final MapCodec<P> l;

   private static <P extends ehv> ehw<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.U, $$0, new ehw<>($$1));
   }

   private ehw(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

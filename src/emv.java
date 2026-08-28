import com.mojang.serialization.MapCodec;

public class emv<P extends emu> {
   public static final emv<emp> a = a("blob_foliage_placer", emp.a);
   public static final emv<ena> b = a("spruce_foliage_placer", ena.a);
   public static final emv<emy> c = a("pine_foliage_placer", emy.a);
   public static final emv<emo> d = a("acacia_foliage_placer", emo.a);
   public static final emv<emq> e = a("bush_foliage_placer", emq.c);
   public static final emv<emt> f = a("fancy_foliage_placer", emt.c);
   public static final emv<emw> g = a("jungle_foliage_placer", emw.a);
   public static final emv<emx> h = a("mega_pine_foliage_placer", emx.a);
   public static final emv<ems> i = a("dark_oak_foliage_placer", ems.a);
   public static final emv<emz> j = a("random_spread_foliage_placer", emz.a);
   public static final emv<emr> k = a("cherry_foliage_placer", emr.a);
   private final MapCodec<P> l;

   private static <P extends emu> emv<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.U, $$0, new emv<>($$1));
   }

   private emv(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}

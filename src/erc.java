import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class erc {
   public static final Codec<ere> a = lq.D.r().dispatch(ere::a, erf::a);
   public static final erf b = a("empty", eqz.a);
   public static final erf c = a("item", erb.a);
   public static final erf d = a("loot_table", erh.a);
   public static final erf e = a("dynamic", eqy.a);
   public static final erf f = a("tag", erj.a);
   public static final erf g = a("alternatives", eqv.a);
   public static final erf h = a("sequence", eri.a);
   public static final erf i = a("group", era.a);

   private static erf a(String $$0, MapCodec<? extends ere> $$1) {
      return jw.a(lq.D, new akk($$0), new erf($$1));
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eri {
   public static final Codec<erk> a = lq.D.r().dispatch(erk::a, erl::a);
   public static final erl b = a("empty", erf.a);
   public static final erl c = a("item", erh.a);
   public static final erl d = a("loot_table", ern.a);
   public static final erl e = a("dynamic", ere.a);
   public static final erl f = a("tag", erp.a);
   public static final erl g = a("alternatives", erb.a);
   public static final erl h = a("sequence", ero.a);
   public static final erl i = a("group", erg.a);

   private static erl a(String $$0, MapCodec<? extends erk> $$1) {
      return jw.a(lq.D, new akk($$0), new erl($$1));
   }
}

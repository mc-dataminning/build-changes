import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eqv {
   public static final Codec<eqx> a = lp.F.q().dispatch(eqx::a, eqy::a);
   public static final eqy b = a("empty", eqs.a);
   public static final eqy c = a("item", equ.a);
   public static final eqy d = a("loot_table", era.a);
   public static final eqy e = a("dynamic", eqr.a);
   public static final eqy f = a("tag", erc.a);
   public static final eqy g = a("alternatives", eqo.a);
   public static final eqy h = a("sequence", erb.a);
   public static final eqy i = a("group", eqt.a);

   private static eqy a(String $$0, MapCodec<? extends eqx> $$1) {
      return jv.a(lp.F, new ale($$0), new eqy($$1));
   }
}

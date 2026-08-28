import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class equ {
   public static final Codec<eqw> a = lp.F.q().dispatch(eqw::a, eqx::a);
   public static final eqx b = a("empty", eqr.a);
   public static final eqx c = a("item", eqt.a);
   public static final eqx d = a("loot_table", eqz.a);
   public static final eqx e = a("dynamic", eqq.a);
   public static final eqx f = a("tag", erb.a);
   public static final eqx g = a("alternatives", eqn.a);
   public static final eqx h = a("sequence", era.a);
   public static final eqx i = a("group", eqs.a);

   private static eqx a(String $$0, MapCodec<? extends eqw> $$1) {
      return jv.a(lp.F, new ale($$0), new eqx($$1));
   }
}

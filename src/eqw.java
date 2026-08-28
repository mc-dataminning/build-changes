import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eqw {
   public static final Codec<eqy> a = lp.F.q().dispatch(eqy::a, eqz::a);
   public static final eqz b = a("empty", eqt.a);
   public static final eqz c = a("item", eqv.a);
   public static final eqz d = a("loot_table", erb.a);
   public static final eqz e = a("dynamic", eqs.a);
   public static final eqz f = a("tag", erd.a);
   public static final eqz g = a("alternatives", eqp.a);
   public static final eqz h = a("sequence", erc.a);
   public static final eqz i = a("group", equ.a);

   private static eqz a(String $$0, MapCodec<? extends eqy> $$1) {
      return jv.a(lp.F, new alf($$0), new eqz($$1));
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eqr {
   public static final Codec<eqt> a = lp.F.q().dispatch(eqt::a, equ::a);
   public static final equ b = a("empty", eqo.a);
   public static final equ c = a("item", eqq.a);
   public static final equ d = a("loot_table", eqw.a);
   public static final equ e = a("dynamic", eqn.a);
   public static final equ f = a("tag", eqy.a);
   public static final equ g = a("alternatives", eqk.a);
   public static final equ h = a("sequence", eqx.a);
   public static final equ i = a("group", eqp.a);

   private static equ a(String $$0, MapCodec<? extends eqt> $$1) {
      return jv.a(lp.F, new alb($$0), new equ($$1));
   }
}

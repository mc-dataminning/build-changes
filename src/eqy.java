import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eqy {
   public static final Codec<era> a = lp.F.q().dispatch(era::a, erb::a);
   public static final erb b = a("empty", eqv.a);
   public static final erb c = a("item", eqx.a);
   public static final erb d = a("loot_table", erd.a);
   public static final erb e = a("dynamic", equ.a);
   public static final erb f = a("tag", erf.a);
   public static final erb g = a("alternatives", eqr.a);
   public static final erb h = a("sequence", ere.a);
   public static final erb i = a("group", eqw.a);

   private static erb a(String $$0, MapCodec<? extends era> $$1) {
      return jv.a(lp.F, new alf($$0), new erb($$1));
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eqx {
   public static final Codec<eqz> a = lp.F.q().dispatch(eqz::a, era::a);
   public static final era b = a("empty", equ.a);
   public static final era c = a("item", eqw.a);
   public static final era d = a("loot_table", erc.a);
   public static final era e = a("dynamic", eqt.a);
   public static final era f = a("tag", ere.a);
   public static final era g = a("alternatives", eqq.a);
   public static final era h = a("sequence", erd.a);
   public static final era i = a("group", eqv.a);

   private static era a(String $$0, MapCodec<? extends eqz> $$1) {
      return jv.a(lp.F, new alf($$0), new era($$1));
   }
}

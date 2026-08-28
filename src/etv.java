import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class etv {
   public static final Codec<etx> a = lu.D.q().dispatch(etx::a, ety::a);
   public static final ety b = a("empty", ets.a);
   public static final ety c = a("item", etu.a);
   public static final ety d = a("loot_table", eua.a);
   public static final ety e = a("dynamic", etr.a);
   public static final ety f = a("tag", euc.a);
   public static final ety g = a("alternatives", eto.a);
   public static final ety h = a("sequence", eub.a);
   public static final ety i = a("group", ett.a);

   private static ety a(String $$0, MapCodec<? extends etx> $$1) {
      return ka.a(lu.D, alc.b($$0), new ety($$1));
   }
}

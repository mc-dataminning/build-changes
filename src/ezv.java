import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ezv {
   public static final Codec<ezx> a = mf.D.q().dispatch(ezx::a, ezy::a);
   public static final ezy b = a("empty", ezs.a);
   public static final ezy c = a("item", ezu.a);
   public static final ezy d = a("loot_table", faa.a);
   public static final ezy e = a("dynamic", ezr.a);
   public static final ezy f = a("tag", fac.a);
   public static final ezy g = a("alternatives", ezo.a);
   public static final ezy h = a("sequence", fab.a);
   public static final ezy i = a("group", ezt.a);

   private static ezy a(String $$0, MapCodec<? extends ezx> $$1) {
      return jr.a(mf.D, alg.b($$0), new ezy($$1));
   }
}

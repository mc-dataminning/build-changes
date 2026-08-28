import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class etz {
   public static final Codec<eub> a = lv.D.q().dispatch(eub::a, euc::a);
   public static final euc b = a("empty", etw.a);
   public static final euc c = a("item", ety.a);
   public static final euc d = a("loot_table", eue.a);
   public static final euc e = a("dynamic", etv.a);
   public static final euc f = a("tag", eug.a);
   public static final euc g = a("alternatives", ets.a);
   public static final euc h = a("sequence", euf.a);
   public static final euc i = a("group", etx.a);

   private static euc a(String $$0, MapCodec<? extends eub> $$1) {
      return kb.a(lv.D, ale.b($$0), new euc($$1));
   }
}

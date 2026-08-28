import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class euq {
   public static final Codec<eus> a = ly.D.q().dispatch(eus::a, eut::a);
   public static final eut b = a("empty", eun.a);
   public static final eut c = a("item", eup.a);
   public static final eut d = a("loot_table", euv.a);
   public static final eut e = a("dynamic", eum.a);
   public static final eut f = a("tag", eux.a);
   public static final eut g = a("alternatives", euj.a);
   public static final eut h = a("sequence", euw.a);
   public static final eut i = a("group", euo.a);

   private static eut a(String $$0, MapCodec<? extends eus> $$1) {
      return kd.a(ly.D, ali.b($$0), new eut($$1));
   }
}

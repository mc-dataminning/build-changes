import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class evb {
   public static final Codec<evd> a = lz.D.q().dispatch(evd::a, eve::a);
   public static final eve b = a("empty", euy.a);
   public static final eve c = a("item", eva.a);
   public static final eve d = a("loot_table", evg.a);
   public static final eve e = a("dynamic", eux.a);
   public static final eve f = a("tag", evi.a);
   public static final eve g = a("alternatives", euu.a);
   public static final eve h = a("sequence", evh.a);
   public static final eve i = a("group", euz.a);

   private static eve a(String $$0, MapCodec<? extends evd> $$1) {
      return kd.a(lz.D, alj.b($$0), new eve($$1));
   }
}

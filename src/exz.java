import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class exz {
   public static final Codec<eyb> a = md.D.q().dispatch(eyb::a, eyc::a);
   public static final eyc b = a("empty", exw.a);
   public static final eyc c = a("item", exy.a);
   public static final eyc d = a("loot_table", eye.a);
   public static final eyc e = a("dynamic", exv.a);
   public static final eyc f = a("tag", eyg.a);
   public static final eyc g = a("alternatives", exs.a);
   public static final eyc h = a("sequence", eyf.a);
   public static final eyc i = a("group", exx.a);

   private static eyc a(String $$0, MapCodec<? extends eyb> $$1) {
      return kf.a(md.D, ald.b($$0), new eyc($$1));
   }
}

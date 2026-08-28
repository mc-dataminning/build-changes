import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class exc {
   public static final Codec<exe> a = ma.D.q().dispatch(exe::a, exf::a);
   public static final exf b = a("empty", ewz.a);
   public static final exf c = a("item", exb.a);
   public static final exf d = a("loot_table", exh.a);
   public static final exf e = a("dynamic", ewy.a);
   public static final exf f = a("tag", exj.a);
   public static final exf g = a("alternatives", ewv.a);
   public static final exf h = a("sequence", exi.a);
   public static final exf i = a("group", exa.a);

   private static exf a(String $$0, MapCodec<? extends exe> $$1) {
      return kd.a(ma.D, alz.b($$0), new exf($$1));
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class exd {
   public static final Codec<exf> a = ma.D.q().dispatch(exf::a, exg::a);
   public static final exg b = a("empty", exa.a);
   public static final exg c = a("item", exc.a);
   public static final exg d = a("loot_table", exi.a);
   public static final exg e = a("dynamic", ewz.a);
   public static final exg f = a("tag", exk.a);
   public static final exg g = a("alternatives", eww.a);
   public static final exg h = a("sequence", exj.a);
   public static final exg i = a("group", exb.a);

   private static exg a(String $$0, MapCodec<? extends exf> $$1) {
      return kd.a(ma.D, alz.b($$0), new exg($$1));
   }
}

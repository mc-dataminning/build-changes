import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class eww {
   public static final Codec<ewy> a = ma.D.q().dispatch(ewy::a, ewz::a);
   public static final ewz b = a("empty", ewt.a);
   public static final ewz c = a("item", ewv.a);
   public static final ewz d = a("loot_table", exb.a);
   public static final ewz e = a("dynamic", ews.a);
   public static final ewz f = a("tag", exd.a);
   public static final ewz g = a("alternatives", ewp.a);
   public static final ewz h = a("sequence", exc.a);
   public static final ewz i = a("group", ewu.a);

   private static ewz a(String $$0, MapCodec<? extends ewy> $$1) {
      return kd.a(ma.D, alp.b($$0), new ewz($$1));
   }
}

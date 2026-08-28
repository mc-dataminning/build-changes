import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ewf {
   public static final Codec<ewh> a = mb.D.q().dispatch(ewh::a, ewi::a);
   public static final ewi b = a("empty", ewc.a);
   public static final ewi c = a("item", ewe.a);
   public static final ewi d = a("loot_table", ewk.a);
   public static final ewi e = a("dynamic", ewb.a);
   public static final ewi f = a("tag", ewm.a);
   public static final ewi g = a("alternatives", evy.a);
   public static final ewi h = a("sequence", ewl.a);
   public static final ewi i = a("group", ewd.a);

   private static ewi a(String $$0, MapCodec<? extends ewh> $$1) {
      return ke.a(mb.D, akv.b($$0), new ewi($$1));
   }
}

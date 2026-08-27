import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public class euw {
   private static final Codec<euu> v = lh.H.q().dispatch("condition", euu::b, euv::a);
   public static final Codec<euu> a = axu.a((Supplier<Codec<euu>>)(() -> axu.e(v, eui.b)));
   public static final Codec<ja<euu>> b = akp.a(li.aW, a);
   public static final euv c = a("inverted", eur.a);
   public static final euv d = a("any_of", euj.a);
   public static final euv e = a("all_of", eui.a);
   public static final euv f = a("random_chance", eva.a);
   public static final euv g = a("random_chance_with_looting", evb.a);
   public static final euv h = a("entity_properties", eux.a);
   public static final euv i = a("killed_by_player", euy.a);
   public static final euv j = a("entity_scores", eup.a);
   public static final euv k = a("block_state_property", eut.a);
   public static final euv l = a("match_tool", evc.a);
   public static final euv m = a("table_bonus", euk.a);
   public static final euv n = a("survives_explosion", euq.a);
   public static final euv o = a("damage_source_properties", euo.a);
   public static final euv p = a("location_check", eus.a);
   public static final euv q = a("weather_check", evf.a);
   public static final euv r = a("reference", eum.a);
   public static final euv s = a("time_check", evd.a);
   public static final euv t = a("value_check", eve.a);
   public static final euv u = a("killer_main_hand_tool", euz.a);

   private static euv a(String $$0, Codec<? extends euu> $$1) {
      return jn.a(lh.H, new akt($$0), new euv($$1));
   }
}

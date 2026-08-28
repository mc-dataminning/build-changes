import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ets {
   private static final Codec<etq> u = lp.H.q().dispatch("condition", etq::b, etr::a);
   public static final Codec<etq> a = Codec.lazyInitialized(() -> Codec.withAlternative(u, ete.b));
   public static final Codec<ji<etq>> b = ala.a(lq.aW, a);
   public static final etr c = a("inverted", etn.a);
   public static final etr d = a("any_of", etf.a);
   public static final etr e = a("all_of", ete.a);
   public static final etr f = a("random_chance", etv.a);
   public static final etr g = a("random_chance_with_looting", etw.a);
   public static final etr h = a("entity_properties", ett.a);
   public static final etr i = a("killed_by_player", etu.a);
   public static final etr j = a("entity_scores", etl.a);
   public static final etr k = a("block_state_property", etp.a);
   public static final etr l = a("match_tool", etx.a);
   public static final etr m = a("table_bonus", etg.a);
   public static final etr n = a("survives_explosion", etm.a);
   public static final etr o = a("damage_source_properties", etk.a);
   public static final etr p = a("location_check", eto.a);
   public static final etr q = a("weather_check", eua.a);
   public static final etr r = a("reference", eti.a);
   public static final etr s = a("time_check", ety.a);
   public static final etr t = a("value_check", etz.a);

   private static etr a(String $$0, MapCodec<? extends etq> $$1) {
      return jv.a(lp.H, new ale($$0), new etr($$1));
   }
}

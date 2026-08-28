import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ett {
   private static final Codec<etr> u = lp.H.q().dispatch("condition", etr::b, ets::a);
   public static final Codec<etr> a = Codec.lazyInitialized(() -> Codec.withAlternative(u, etf.b));
   public static final Codec<ji<etr>> b = ala.a(lq.aW, a);
   public static final ets c = a("inverted", eto.a);
   public static final ets d = a("any_of", etg.a);
   public static final ets e = a("all_of", etf.a);
   public static final ets f = a("random_chance", etw.a);
   public static final ets g = a("random_chance_with_looting", etx.a);
   public static final ets h = a("entity_properties", etu.a);
   public static final ets i = a("killed_by_player", etv.a);
   public static final ets j = a("entity_scores", etm.a);
   public static final ets k = a("block_state_property", etq.a);
   public static final ets l = a("match_tool", ety.a);
   public static final ets m = a("table_bonus", eth.a);
   public static final ets n = a("survives_explosion", etn.a);
   public static final ets o = a("damage_source_properties", etl.a);
   public static final ets p = a("location_check", etp.a);
   public static final ets q = a("weather_check", eub.a);
   public static final ets r = a("reference", etj.a);
   public static final ets s = a("time_check", etz.a);
   public static final ets t = a("value_check", eua.a);

   private static ets a(String $$0, MapCodec<? extends etr> $$1) {
      return jv.a(lp.H, new ale($$0), new ets($$1));
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class etp {
   private static final Codec<etn> u = lp.H.q().dispatch("condition", etn::b, eto::a);
   public static final Codec<etn> a = Codec.lazyInitialized(() -> Codec.withAlternative(u, etb.b));
   public static final Codec<ji<etn>> b = akx.a(lq.aW, a);
   public static final eto c = a("inverted", etk.a);
   public static final eto d = a("any_of", etc.a);
   public static final eto e = a("all_of", etb.a);
   public static final eto f = a("random_chance", ets.a);
   public static final eto g = a("random_chance_with_looting", ett.a);
   public static final eto h = a("entity_properties", etq.a);
   public static final eto i = a("killed_by_player", etr.a);
   public static final eto j = a("entity_scores", eti.a);
   public static final eto k = a("block_state_property", etm.a);
   public static final eto l = a("match_tool", etu.a);
   public static final eto m = a("table_bonus", etd.a);
   public static final eto n = a("survives_explosion", etj.a);
   public static final eto o = a("damage_source_properties", eth.a);
   public static final eto p = a("location_check", etl.a);
   public static final eto q = a("weather_check", etx.a);
   public static final eto r = a("reference", etf.a);
   public static final eto s = a("time_check", etv.a);
   public static final eto t = a("value_check", etw.a);

   private static eto a(String $$0, MapCodec<? extends etn> $$1) {
      return jv.a(lp.H, new alb($$0), new eto($$1));
   }
}

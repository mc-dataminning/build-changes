import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class etu {
   private static final Codec<ets> u = lp.H.q().dispatch("condition", ets::b, ett::a);
   public static final Codec<ets> a = Codec.lazyInitialized(() -> Codec.withAlternative(u, etg.b));
   public static final Codec<ji<ets>> b = alb.a(lq.aW, a);
   public static final ett c = a("inverted", etp.a);
   public static final ett d = a("any_of", eth.a);
   public static final ett e = a("all_of", etg.a);
   public static final ett f = a("random_chance", etx.a);
   public static final ett g = a("random_chance_with_looting", ety.a);
   public static final ett h = a("entity_properties", etv.a);
   public static final ett i = a("killed_by_player", etw.a);
   public static final ett j = a("entity_scores", etn.a);
   public static final ett k = a("block_state_property", etr.a);
   public static final ett l = a("match_tool", etz.a);
   public static final ett m = a("table_bonus", eti.a);
   public static final ett n = a("survives_explosion", eto.a);
   public static final ett o = a("damage_source_properties", etm.a);
   public static final ett p = a("location_check", etq.a);
   public static final ett q = a("weather_check", euc.a);
   public static final ett r = a("reference", etk.a);
   public static final ett s = a("time_check", eua.a);
   public static final ett t = a("value_check", eub.a);

   private static ett a(String $$0, MapCodec<? extends ets> $$1) {
      return jv.a(lp.H, new alf($$0), new ett($$1));
   }
}

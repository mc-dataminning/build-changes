import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class etv {
   private static final Codec<ett> u = lp.H.q().dispatch("condition", ett::b, etu::a);
   public static final Codec<ett> a = Codec.lazyInitialized(() -> Codec.withAlternative(u, eth.b));
   public static final Codec<ji<ett>> b = alb.a(lq.aW, a);
   public static final etu c = a("inverted", etq.a);
   public static final etu d = a("any_of", eti.a);
   public static final etu e = a("all_of", eth.a);
   public static final etu f = a("random_chance", ety.a);
   public static final etu g = a("random_chance_with_looting", etz.a);
   public static final etu h = a("entity_properties", etw.a);
   public static final etu i = a("killed_by_player", etx.a);
   public static final etu j = a("entity_scores", eto.a);
   public static final etu k = a("block_state_property", ets.a);
   public static final etu l = a("match_tool", eua.a);
   public static final etu m = a("table_bonus", etj.a);
   public static final etu n = a("survives_explosion", etp.a);
   public static final etu o = a("damage_source_properties", etn.a);
   public static final etu p = a("location_check", etr.a);
   public static final etu q = a("weather_check", eud.a);
   public static final etu r = a("reference", etl.a);
   public static final etu s = a("time_check", eub.a);
   public static final etu t = a("value_check", euc.a);

   private static etu a(String $$0, MapCodec<? extends ett> $$1) {
      return jv.a(lp.H, new alf($$0), new etu($$1));
   }
}

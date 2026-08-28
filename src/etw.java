import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class etw {
   private static final Codec<etu> u = lp.H.q().dispatch("condition", etu::b, etv::a);
   public static final Codec<etu> a = Codec.lazyInitialized(() -> Codec.withAlternative(u, eti.b));
   public static final Codec<ji<etu>> b = alb.a(lq.aW, a);
   public static final etv c = a("inverted", etr.a);
   public static final etv d = a("any_of", etj.a);
   public static final etv e = a("all_of", eti.a);
   public static final etv f = a("random_chance", etz.a);
   public static final etv g = a("random_chance_with_looting", eua.a);
   public static final etv h = a("entity_properties", etx.a);
   public static final etv i = a("killed_by_player", ety.a);
   public static final etv j = a("entity_scores", etp.a);
   public static final etv k = a("block_state_property", ett.a);
   public static final etv l = a("match_tool", eub.a);
   public static final etv m = a("table_bonus", etk.a);
   public static final etv n = a("survives_explosion", etq.a);
   public static final etv o = a("damage_source_properties", eto.a);
   public static final etv p = a("location_check", ets.a);
   public static final etv q = a("weather_check", eue.a);
   public static final etv r = a("reference", etm.a);
   public static final etv s = a("time_check", euc.a);
   public static final etv t = a("value_check", eud.a);

   private static etv a(String $$0, MapCodec<? extends etu> $$1) {
      return jv.a(lp.H, new alf($$0), new etv($$1));
   }
}

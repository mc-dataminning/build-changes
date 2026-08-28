import com.mojang.serialization.MapCodec;

public class fde {
   public static final fdd a = a("inverted", fcz.a);
   public static final fdd b = a("any_of", fcq.a);
   public static final fdd c = a("all_of", fcp.a);
   public static final fdd d = a("random_chance", fdh.a);
   public static final fdd e = a("random_chance_with_enchanted_bonus", fdi.a);
   public static final fdd f = a("entity_properties", fdf.a);
   public static final fdd g = a("killed_by_player", fdg.a);
   public static final fdd h = a("entity_scores", fcx.a);
   public static final fdd i = a("block_state_property", fdb.a);
   public static final fdd j = a("match_tool", fdj.a);
   public static final fdd k = a("table_bonus", fcr.a);
   public static final fdd l = a("survives_explosion", fcy.a);
   public static final fdd m = a("damage_source_properties", fcv.a);
   public static final fdd n = a("location_check", fda.a);
   public static final fdd o = a("weather_check", fdm.a);
   public static final fdd p = a("reference", fct.a);
   public static final fdd q = a("time_check", fdk.a);
   public static final fdd r = a("value_check", fdl.a);
   public static final fdd s = a("enchantment_active_check", fcw.a);

   private static fdd a(String $$0, MapCodec<? extends fdc> $$1) {
      return js.a(mg.F, alg.b($$0), new fdd($$1));
   }
}

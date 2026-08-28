import com.mojang.serialization.MapCodec;

public class fds {
   public static final fdr a = a("inverted", fdn.a);
   public static final fdr b = a("any_of", fde.a);
   public static final fdr c = a("all_of", fdd.a);
   public static final fdr d = a("random_chance", fdv.a);
   public static final fdr e = a("random_chance_with_enchanted_bonus", fdw.a);
   public static final fdr f = a("entity_properties", fdt.a);
   public static final fdr g = a("killed_by_player", fdu.a);
   public static final fdr h = a("entity_scores", fdl.a);
   public static final fdr i = a("block_state_property", fdp.a);
   public static final fdr j = a("match_tool", fdx.a);
   public static final fdr k = a("table_bonus", fdf.a);
   public static final fdr l = a("survives_explosion", fdm.a);
   public static final fdr m = a("damage_source_properties", fdj.a);
   public static final fdr n = a("location_check", fdo.a);
   public static final fdr o = a("weather_check", fea.a);
   public static final fdr p = a("reference", fdh.a);
   public static final fdr q = a("time_check", fdy.a);
   public static final fdr r = a("value_check", fdz.a);
   public static final fdr s = a("enchantment_active_check", fdk.a);

   private static fdr a(String $$0, MapCodec<? extends fdq> $$1) {
      return js.a(mg.F, ali.b($$0), new fdr($$1));
   }
}

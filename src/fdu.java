import com.mojang.serialization.MapCodec;

public class fdu {
   public static final fdt a = a("inverted", fdp.a);
   public static final fdt b = a("any_of", fdg.a);
   public static final fdt c = a("all_of", fdf.a);
   public static final fdt d = a("random_chance", fdx.a);
   public static final fdt e = a("random_chance_with_enchanted_bonus", fdy.a);
   public static final fdt f = a("entity_properties", fdv.a);
   public static final fdt g = a("killed_by_player", fdw.a);
   public static final fdt h = a("entity_scores", fdn.a);
   public static final fdt i = a("block_state_property", fdr.a);
   public static final fdt j = a("match_tool", fdz.a);
   public static final fdt k = a("table_bonus", fdh.a);
   public static final fdt l = a("survives_explosion", fdo.a);
   public static final fdt m = a("damage_source_properties", fdl.a);
   public static final fdt n = a("location_check", fdq.a);
   public static final fdt o = a("weather_check", fec.a);
   public static final fdt p = a("reference", fdj.a);
   public static final fdt q = a("time_check", fea.a);
   public static final fdt r = a("value_check", feb.a);
   public static final fdt s = a("enchantment_active_check", fdm.a);

   private static fdt a(String $$0, MapCodec<? extends fds> $$1) {
      return jt.a(mh.F, alk.b($$0), new fdt($$1));
   }
}

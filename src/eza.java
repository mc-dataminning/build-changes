import com.mojang.serialization.MapCodec;

public class eza {
   public static final eyz a = a("inverted", eyv.a);
   public static final eyz b = a("any_of", eym.a);
   public static final eyz c = a("all_of", eyl.a);
   public static final eyz d = a("random_chance", ezd.a);
   public static final eyz e = a("random_chance_with_enchanted_bonus", eze.a);
   public static final eyz f = a("entity_properties", ezb.a);
   public static final eyz g = a("killed_by_player", ezc.a);
   public static final eyz h = a("entity_scores", eyt.a);
   public static final eyz i = a("block_state_property", eyx.a);
   public static final eyz j = a("match_tool", ezf.a);
   public static final eyz k = a("table_bonus", eyn.a);
   public static final eyz l = a("survives_explosion", eyu.a);
   public static final eyz m = a("damage_source_properties", eyr.a);
   public static final eyz n = a("location_check", eyw.a);
   public static final eyz o = a("weather_check", ezi.a);
   public static final eyz p = a("reference", eyp.a);
   public static final eyz q = a("time_check", ezg.a);
   public static final eyz r = a("value_check", ezh.a);
   public static final eyz s = a("enchantment_active_check", eys.a);

   private static eyz a(String $$0, MapCodec<? extends eyy> $$1) {
      return ke.a(mb.F, aku.b($$0), new eyz($$1));
   }
}

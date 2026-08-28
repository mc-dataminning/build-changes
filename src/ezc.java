import com.mojang.serialization.MapCodec;

public class ezc {
   public static final ezb a = a("inverted", eyx.a);
   public static final ezb b = a("any_of", eyo.a);
   public static final ezb c = a("all_of", eyn.a);
   public static final ezb d = a("random_chance", ezf.a);
   public static final ezb e = a("random_chance_with_enchanted_bonus", ezg.a);
   public static final ezb f = a("entity_properties", ezd.a);
   public static final ezb g = a("killed_by_player", eze.a);
   public static final ezb h = a("entity_scores", eyv.a);
   public static final ezb i = a("block_state_property", eyz.a);
   public static final ezb j = a("match_tool", ezh.a);
   public static final ezb k = a("table_bonus", eyp.a);
   public static final ezb l = a("survives_explosion", eyw.a);
   public static final ezb m = a("damage_source_properties", eyt.a);
   public static final ezb n = a("location_check", eyy.a);
   public static final ezb o = a("weather_check", ezk.a);
   public static final ezb p = a("reference", eyr.a);
   public static final ezb q = a("time_check", ezi.a);
   public static final ezb r = a("value_check", ezj.a);
   public static final ezb s = a("enchantment_active_check", eyu.a);

   private static ezb a(String $$0, MapCodec<? extends eza> $$1) {
      return ke.a(mb.F, akv.b($$0), new ezb($$1));
   }
}

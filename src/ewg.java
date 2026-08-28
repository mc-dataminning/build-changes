import com.mojang.serialization.MapCodec;

public class ewg {
   public static final ewf a = a("inverted", ewb.a);
   public static final ewf b = a("any_of", evs.a);
   public static final ewf c = a("all_of", evr.a);
   public static final ewf d = a("random_chance", ewj.a);
   public static final ewf e = a("random_chance_with_enchanted_bonus", ewk.a);
   public static final ewf f = a("entity_properties", ewh.a);
   public static final ewf g = a("killed_by_player", ewi.a);
   public static final ewf h = a("entity_scores", evz.a);
   public static final ewf i = a("block_state_property", ewd.a);
   public static final ewf j = a("match_tool", ewl.a);
   public static final ewf k = a("table_bonus", evt.a);
   public static final ewf l = a("survives_explosion", ewa.a);
   public static final ewf m = a("damage_source_properties", evx.a);
   public static final ewf n = a("location_check", ewc.a);
   public static final ewf o = a("weather_check", ewo.a);
   public static final ewf p = a("reference", evv.a);
   public static final ewf q = a("time_check", ewm.a);
   public static final ewf r = a("value_check", ewn.a);
   public static final ewf s = a("enchantment_active_check", evy.a);

   private static ewf a(String $$0, MapCodec<? extends ewe> $$1) {
      return ka.a(lu.F, alb.b($$0), new ewf($$1));
   }
}

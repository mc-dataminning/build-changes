import com.mojang.serialization.MapCodec;

public class ewy {
   public static final ewx a = a("inverted", ewt.a);
   public static final ewx b = a("any_of", ewk.a);
   public static final ewx c = a("all_of", ewj.a);
   public static final ewx d = a("random_chance", exb.a);
   public static final ewx e = a("random_chance_with_enchanted_bonus", exc.a);
   public static final ewx f = a("entity_properties", ewz.a);
   public static final ewx g = a("killed_by_player", exa.a);
   public static final ewx h = a("entity_scores", ewr.a);
   public static final ewx i = a("block_state_property", ewv.a);
   public static final ewx j = a("match_tool", exd.a);
   public static final ewx k = a("table_bonus", ewl.a);
   public static final ewx l = a("survives_explosion", ews.a);
   public static final ewx m = a("damage_source_properties", ewp.a);
   public static final ewx n = a("location_check", ewu.a);
   public static final ewx o = a("weather_check", exg.a);
   public static final ewx p = a("reference", ewn.a);
   public static final ewx q = a("time_check", exe.a);
   public static final ewx r = a("value_check", exf.a);
   public static final ewx s = a("enchantment_active_check", ewq.a);

   private static ewx a(String $$0, MapCodec<? extends eww> $$1) {
      return kb.a(lv.F, ale.b($$0), new ewx($$1));
   }
}

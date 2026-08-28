import com.mojang.serialization.MapCodec;

public class ewu {
   public static final ewt a = a("inverted", ewp.a);
   public static final ewt b = a("any_of", ewg.a);
   public static final ewt c = a("all_of", ewf.a);
   public static final ewt d = a("random_chance", ewx.a);
   public static final ewt e = a("random_chance_with_enchanted_bonus", ewy.a);
   public static final ewt f = a("entity_properties", ewv.a);
   public static final ewt g = a("killed_by_player", eww.a);
   public static final ewt h = a("entity_scores", ewn.a);
   public static final ewt i = a("block_state_property", ewr.a);
   public static final ewt j = a("match_tool", ewz.a);
   public static final ewt k = a("table_bonus", ewh.a);
   public static final ewt l = a("survives_explosion", ewo.a);
   public static final ewt m = a("damage_source_properties", ewl.a);
   public static final ewt n = a("location_check", ewq.a);
   public static final ewt o = a("weather_check", exc.a);
   public static final ewt p = a("reference", ewj.a);
   public static final ewt q = a("time_check", exa.a);
   public static final ewt r = a("value_check", exb.a);
   public static final ewt s = a("enchantment_active_check", ewm.a);

   private static ewt a(String $$0, MapCodec<? extends ews> $$1) {
      return ka.a(lu.F, alc.b($$0), new ewt($$1));
   }
}

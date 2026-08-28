import com.mojang.serialization.MapCodec;

public class fcs {
   public static final fcr a = a("inverted", fcn.a);
   public static final fcr b = a("any_of", fce.a);
   public static final fcr c = a("all_of", fcd.a);
   public static final fcr d = a("random_chance", fcv.a);
   public static final fcr e = a("random_chance_with_enchanted_bonus", fcw.a);
   public static final fcr f = a("entity_properties", fct.a);
   public static final fcr g = a("killed_by_player", fcu.a);
   public static final fcr h = a("entity_scores", fcl.a);
   public static final fcr i = a("block_state_property", fcp.a);
   public static final fcr j = a("match_tool", fcx.a);
   public static final fcr k = a("table_bonus", fcf.a);
   public static final fcr l = a("survives_explosion", fcm.a);
   public static final fcr m = a("damage_source_properties", fcj.a);
   public static final fcr n = a("location_check", fco.a);
   public static final fcr o = a("weather_check", fda.a);
   public static final fcr p = a("reference", fch.a);
   public static final fcr q = a("time_check", fcy.a);
   public static final fcr r = a("value_check", fcz.a);
   public static final fcr s = a("enchantment_active_check", fck.a);

   private static fcr a(String $$0, MapCodec<? extends fcq> $$1) {
      return jr.a(mf.F, alg.b($$0), new fcr($$1));
   }
}

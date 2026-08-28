import com.mojang.serialization.MapCodec;

public class evc {
   public static final evb a = a("inverted", eux.a);
   public static final evb b = a("any_of", euo.a);
   public static final evb c = a("all_of", eun.a);
   public static final evb d = a("random_chance", evf.a);
   public static final evb e = a("random_chance_with_enchanted_bonus", evg.a);
   public static final evb f = a("entity_properties", evd.a);
   public static final evb g = a("killed_by_player", eve.a);
   public static final evb h = a("entity_scores", euv.a);
   public static final evb i = a("block_state_property", euz.a);
   public static final evb j = a("match_tool", evh.a);
   public static final evb k = a("table_bonus", eup.a);
   public static final evb l = a("survives_explosion", euw.a);
   public static final evb m = a("damage_source_properties", eut.a);
   public static final evb n = a("location_check", euy.a);
   public static final evb o = a("weather_check", evk.a);
   public static final evb p = a("reference", eur.a);
   public static final evb q = a("time_check", evi.a);
   public static final evb r = a("value_check", evj.a);
   public static final evb s = a("enchantment_active_check", euu.a);

   private static evb a(String $$0, MapCodec<? extends eva> $$1) {
      return jz.a(lt.F, akr.b($$0), new evb($$1));
   }
}

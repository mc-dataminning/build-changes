import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class esn {
   private static final Codec<esl> u = le.H.q().dispatch("condition", esl::b, esm::a);
   public static final Codec<esl> a = Codec.lazyInitialized(() -> Codec.withAlternative(u, erz.b));
   public static final Codec<ix<esl>> b = aki.a(lf.aW, a);
   public static final esm c = a("inverted", esi.a);
   public static final esm d = a("any_of", esa.a);
   public static final esm e = a("all_of", erz.a);
   public static final esm f = a("random_chance", esq.a);
   public static final esm g = a("random_chance_with_looting", esr.a);
   public static final esm h = a("entity_properties", eso.a);
   public static final esm i = a("killed_by_player", esp.a);
   public static final esm j = a("entity_scores", esg.a);
   public static final esm k = a("block_state_property", esk.a);
   public static final esm l = a("match_tool", ess.a);
   public static final esm m = a("table_bonus", esb.a);
   public static final esm n = a("survives_explosion", esh.a);
   public static final esm o = a("damage_source_properties", esf.a);
   public static final esm p = a("location_check", esj.a);
   public static final esm q = a("weather_check", esv.a);
   public static final esm r = a("reference", esd.a);
   public static final esm s = a("time_check", est.a);
   public static final esm t = a("value_check", esu.a);

   private static esm a(String $$0, MapCodec<? extends esl> $$1) {
      return jk.a(le.H, new akm($$0), new esm($$1));
   }
}

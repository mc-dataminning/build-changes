import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class esp {
   private static final Codec<esn> u = le.H.q().dispatch("condition", esn::b, eso::a);
   public static final Codec<esn> a = Codec.lazyInitialized(() -> Codec.withAlternative(u, esb.b));
   public static final Codec<ix<esn>> b = akj.a(lf.aW, a);
   public static final eso c = a("inverted", esk.a);
   public static final eso d = a("any_of", esc.a);
   public static final eso e = a("all_of", esb.a);
   public static final eso f = a("random_chance", ess.a);
   public static final eso g = a("random_chance_with_looting", est.a);
   public static final eso h = a("entity_properties", esq.a);
   public static final eso i = a("killed_by_player", esr.a);
   public static final eso j = a("entity_scores", esi.a);
   public static final eso k = a("block_state_property", esm.a);
   public static final eso l = a("match_tool", esu.a);
   public static final eso m = a("table_bonus", esd.a);
   public static final eso n = a("survives_explosion", esj.a);
   public static final eso o = a("damage_source_properties", esh.a);
   public static final eso p = a("location_check", esl.a);
   public static final eso q = a("weather_check", esx.a);
   public static final eso r = a("reference", esf.a);
   public static final eso s = a("time_check", esv.a);
   public static final eso t = a("value_check", esw.a);

   private static eso a(String $$0, MapCodec<? extends esn> $$1) {
      return jk.a(le.H, new akn($$0), new eso($$1));
   }
}

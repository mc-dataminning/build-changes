import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public class erj {
   private static final Codec<erh> t = lc.H.q().dispatch("condition", erh::b, eri::a);
   public static final Codec<erh> a = axe.a((Supplier<Codec<erh>>)(() -> axe.e(t, eqv.b)));
   public static final eri b = a("inverted", ere.a);
   public static final eri c = a("any_of", eqw.a);
   public static final eri d = a("all_of", eqv.a);
   public static final eri e = a("random_chance", erm.a);
   public static final eri f = a("random_chance_with_looting", ern.a);
   public static final eri g = a("entity_properties", erk.a);
   public static final eri h = a("killed_by_player", erl.a);
   public static final eri i = a("entity_scores", erc.a);
   public static final eri j = a("block_state_property", erg.a);
   public static final eri k = a("match_tool", ero.a);
   public static final eri l = a("table_bonus", eqx.a);
   public static final eri m = a("survives_explosion", erd.a);
   public static final eri n = a("damage_source_properties", erb.a);
   public static final eri o = a("location_check", erf.a);
   public static final eri p = a("weather_check", err.a);
   public static final eri q = a("reference", eqz.a);
   public static final eri r = a("time_check", erp.a);
   public static final eri s = a("value_check", erq.a);

   private static eri a(String $$0, Codec<? extends erh> $$1) {
      return ji.a(lc.H, new akf($$0), new eri($$1));
   }
}

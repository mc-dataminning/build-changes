import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public class ers {
   private static final Codec<erq> u = ld.H.q().dispatch("condition", erq::b, err::a);
   public static final Codec<erq> a = axh.a((Supplier<Codec<erq>>)(() -> axh.e(u, ere.b)));
   public static final Codec<iw<erq>> b = akd.a(le.aW, a);
   public static final err c = a("inverted", ern.a);
   public static final err d = a("any_of", erf.a);
   public static final err e = a("all_of", ere.a);
   public static final err f = a("random_chance", erv.a);
   public static final err g = a("random_chance_with_looting", erw.a);
   public static final err h = a("entity_properties", ert.a);
   public static final err i = a("killed_by_player", eru.a);
   public static final err j = a("entity_scores", erl.a);
   public static final err k = a("block_state_property", erp.a);
   public static final err l = a("match_tool", erx.a);
   public static final err m = a("table_bonus", erg.a);
   public static final err n = a("survives_explosion", erm.a);
   public static final err o = a("damage_source_properties", erk.a);
   public static final err p = a("location_check", ero.a);
   public static final err q = a("weather_check", esa.a);
   public static final err r = a("reference", eri.a);
   public static final err s = a("time_check", ery.a);
   public static final err t = a("value_check", erz.a);

   private static err a(String $$0, Codec<? extends erq> $$1) {
      return jj.a(ld.H, new akh($$0), new err($$1));
   }
}

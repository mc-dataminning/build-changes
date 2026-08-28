import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class erz {
   public static final BiFunction<cur, eqk, cur> a = ($$0, $$1) -> $$0;
   public static final Codec<erx> b = lp.G.q().dispatch("function", erx::b, ery::a);
   public static final Codec<erx> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, esc.b));
   public static final Codec<ji<erx>> d = alb.a(lq.aV, c);
   public static final ery<esp> e = a("set_count", esp.a);
   public static final ery<esr> f = a("set_item", esr.a);
   public static final ery<ero> g = a("enchant_with_levels", ero.a);
   public static final ery<ern> h = a("enchant_randomly", ern.a);
   public static final ery<esl> i = a("set_enchantments", esl.a);
   public static final ery<esj> j = a("set_custom_data", esj.a);
   public static final ery<esg> k = a("set_components", esg.a);
   public static final ery<esz> l = a("furnace_smelt", esz.a);
   public static final ery<esa> m = a("looting_enchant", esa.b);
   public static final ery<esq> n = a("set_damage", esq.a);
   public static final ery<esd> o = a("set_attributes", esd.a);
   public static final ery<est> p = a("set_name", est.a);
   public static final ery<erp> q = a("exploration_map", erp.f);
   public static final ery<esw> r = a("set_stew_effect", esw.a);
   public static final ery<erm> s = a("copy_name", erm.a);
   public static final ery<esh> t = a("set_contents", esh.a);
   public static final ery<esb> u = a("modify_contents", esb.a);
   public static final ery<err> v = a("filtered", err.a);
   public static final ery<eru> w = a("limit_count", eru.a);
   public static final ery<erh> x = a("apply_bonus", erh.a);
   public static final ery<esi> y = a("set_loot_table", esi.a);
   public static final ery<eri> z = a("explosion_decay", eri.a);
   public static final ery<ess> A = a("set_lore", ess.a);
   public static final ery<erq> B = a("fill_player_head", erq.a);
   public static final ery<erl> C = a("copy_custom_data", erl.a);
   public static final ery<erj> D = a("copy_state", erj.a);
   public static final ery<ese> E = a("set_banner_pattern", ese.a);
   public static final ery<esv> F = a("set_potion", esv.a);
   public static final ery<eso> G = a("set_instrument", eso.a);
   public static final ery<ers> H = a("reference", ers.a);
   public static final ery<esc> I = a("sequence", esc.a);
   public static final ery<erk> J = a("copy_components", erk.a);
   public static final ery<esn> K = a("set_fireworks", esn.a);
   public static final ery<esm> L = a("set_firework_explosion", esm.a);
   public static final ery<esf> M = a("set_book_cover", esf.a);
   public static final ery<esy> N = a("set_written_book_pages", esy.b);
   public static final ery<esx> O = a("set_writable_book_pages", esx.a);
   public static final ery<eta> P = a("toggle_tooltips", eta.a);
   public static final ery<esu> Q = a("set_ominous_bottle_amplifier", esu.a);
   public static final ery<esk> R = a("set_custom_model_data", esk.a);

   private static <T extends erx> ery<T> a(String $$0, MapCodec<T> $$1) {
      return jv.a(lp.G, new alf($$0), new ery<>($$1));
   }

   public static BiFunction<cur, eqk, cur> a(List<? extends BiFunction<cur, eqk, cur>> $$0) {
      List<BiFunction<cur, eqk, cur>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cur, eqk, cur> $$2 = $$1.get(0);
            BiFunction<cur, eqk, cur> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cur, eqk, cur> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

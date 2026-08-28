import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class erx {
   public static final BiFunction<cup, eqi, cup> a = ($$0, $$1) -> $$0;
   public static final Codec<erv> b = lp.G.q().dispatch("function", erv::b, erw::a);
   public static final Codec<erv> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, esa.b));
   public static final Codec<ji<erv>> d = alb.a(lq.aV, c);
   public static final erw<esn> e = a("set_count", esn.a);
   public static final erw<esp> f = a("set_item", esp.a);
   public static final erw<erm> g = a("enchant_with_levels", erm.a);
   public static final erw<erl> h = a("enchant_randomly", erl.a);
   public static final erw<esj> i = a("set_enchantments", esj.a);
   public static final erw<esh> j = a("set_custom_data", esh.a);
   public static final erw<ese> k = a("set_components", ese.a);
   public static final erw<esx> l = a("furnace_smelt", esx.a);
   public static final erw<ery> m = a("looting_enchant", ery.b);
   public static final erw<eso> n = a("set_damage", eso.a);
   public static final erw<esb> o = a("set_attributes", esb.a);
   public static final erw<esr> p = a("set_name", esr.a);
   public static final erw<ern> q = a("exploration_map", ern.f);
   public static final erw<esu> r = a("set_stew_effect", esu.a);
   public static final erw<erk> s = a("copy_name", erk.a);
   public static final erw<esf> t = a("set_contents", esf.a);
   public static final erw<erz> u = a("modify_contents", erz.a);
   public static final erw<erp> v = a("filtered", erp.a);
   public static final erw<ers> w = a("limit_count", ers.a);
   public static final erw<erf> x = a("apply_bonus", erf.a);
   public static final erw<esg> y = a("set_loot_table", esg.a);
   public static final erw<erg> z = a("explosion_decay", erg.a);
   public static final erw<esq> A = a("set_lore", esq.a);
   public static final erw<ero> B = a("fill_player_head", ero.a);
   public static final erw<erj> C = a("copy_custom_data", erj.a);
   public static final erw<erh> D = a("copy_state", erh.a);
   public static final erw<esc> E = a("set_banner_pattern", esc.a);
   public static final erw<est> F = a("set_potion", est.a);
   public static final erw<esm> G = a("set_instrument", esm.a);
   public static final erw<erq> H = a("reference", erq.a);
   public static final erw<esa> I = a("sequence", esa.a);
   public static final erw<eri> J = a("copy_components", eri.a);
   public static final erw<esl> K = a("set_fireworks", esl.a);
   public static final erw<esk> L = a("set_firework_explosion", esk.a);
   public static final erw<esd> M = a("set_book_cover", esd.a);
   public static final erw<esw> N = a("set_written_book_pages", esw.b);
   public static final erw<esv> O = a("set_writable_book_pages", esv.a);
   public static final erw<esy> P = a("toggle_tooltips", esy.a);
   public static final erw<ess> Q = a("set_ominous_bottle_amplifier", ess.a);
   public static final erw<esi> R = a("set_custom_model_data", esi.a);

   private static <T extends erv> erw<T> a(String $$0, MapCodec<T> $$1) {
      return jv.a(lp.G, new alf($$0), new erw<>($$1));
   }

   public static BiFunction<cup, eqi, cup> a(List<? extends BiFunction<cup, eqi, cup>> $$0) {
      List<BiFunction<cup, eqi, cup>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cup, eqi, cup> $$2 = $$1.get(0);
            BiFunction<cup, eqi, cup> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cup, eqi, cup> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

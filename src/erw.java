import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class erw {
   public static final BiFunction<cuo, eqh, cuo> a = ($$0, $$1) -> $$0;
   public static final Codec<eru> b = lp.G.q().dispatch("function", eru::b, erv::a);
   public static final Codec<eru> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, erz.b));
   public static final Codec<ji<eru>> d = ala.a(lq.aV, c);
   public static final erv<esm> e = a("set_count", esm.a);
   public static final erv<eso> f = a("set_item", eso.a);
   public static final erv<erl> g = a("enchant_with_levels", erl.a);
   public static final erv<erk> h = a("enchant_randomly", erk.a);
   public static final erv<esi> i = a("set_enchantments", esi.a);
   public static final erv<esg> j = a("set_custom_data", esg.a);
   public static final erv<esd> k = a("set_components", esd.a);
   public static final erv<esw> l = a("furnace_smelt", esw.a);
   public static final erv<erx> m = a("looting_enchant", erx.b);
   public static final erv<esn> n = a("set_damage", esn.a);
   public static final erv<esa> o = a("set_attributes", esa.a);
   public static final erv<esq> p = a("set_name", esq.a);
   public static final erv<erm> q = a("exploration_map", erm.f);
   public static final erv<est> r = a("set_stew_effect", est.a);
   public static final erv<erj> s = a("copy_name", erj.a);
   public static final erv<ese> t = a("set_contents", ese.a);
   public static final erv<ery> u = a("modify_contents", ery.a);
   public static final erv<ero> v = a("filtered", ero.a);
   public static final erv<err> w = a("limit_count", err.a);
   public static final erv<ere> x = a("apply_bonus", ere.a);
   public static final erv<esf> y = a("set_loot_table", esf.a);
   public static final erv<erf> z = a("explosion_decay", erf.a);
   public static final erv<esp> A = a("set_lore", esp.a);
   public static final erv<ern> B = a("fill_player_head", ern.a);
   public static final erv<eri> C = a("copy_custom_data", eri.a);
   public static final erv<erg> D = a("copy_state", erg.a);
   public static final erv<esb> E = a("set_banner_pattern", esb.a);
   public static final erv<ess> F = a("set_potion", ess.a);
   public static final erv<esl> G = a("set_instrument", esl.a);
   public static final erv<erp> H = a("reference", erp.a);
   public static final erv<erz> I = a("sequence", erz.a);
   public static final erv<erh> J = a("copy_components", erh.a);
   public static final erv<esk> K = a("set_fireworks", esk.a);
   public static final erv<esj> L = a("set_firework_explosion", esj.a);
   public static final erv<esc> M = a("set_book_cover", esc.a);
   public static final erv<esv> N = a("set_written_book_pages", esv.b);
   public static final erv<esu> O = a("set_writable_book_pages", esu.a);
   public static final erv<esx> P = a("toggle_tooltips", esx.a);
   public static final erv<esr> Q = a("set_ominous_bottle_amplifier", esr.a);
   public static final erv<esh> R = a("set_custom_model_data", esh.a);

   private static <T extends eru> erv<T> a(String $$0, MapCodec<T> $$1) {
      return jv.a(lp.G, new ale($$0), new erv<>($$1));
   }

   public static BiFunction<cuo, eqh, cuo> a(List<? extends BiFunction<cuo, eqh, cuo>> $$0) {
      List<BiFunction<cuo, eqh, cuo>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cuo, eqh, cuo> $$2 = $$1.get(0);
            BiFunction<cuo, eqh, cuo> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cuo, eqh, cuo> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class erv {
   public static final BiFunction<cun, eqg, cun> a = ($$0, $$1) -> $$0;
   public static final Codec<ert> b = lp.G.q().dispatch("function", ert::b, eru::a);
   public static final Codec<ert> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, ery.b));
   public static final Codec<ji<ert>> d = ala.a(lq.aV, c);
   public static final eru<esl> e = a("set_count", esl.a);
   public static final eru<esn> f = a("set_item", esn.a);
   public static final eru<erk> g = a("enchant_with_levels", erk.a);
   public static final eru<erj> h = a("enchant_randomly", erj.a);
   public static final eru<esh> i = a("set_enchantments", esh.a);
   public static final eru<esf> j = a("set_custom_data", esf.a);
   public static final eru<esc> k = a("set_components", esc.a);
   public static final eru<esv> l = a("furnace_smelt", esv.a);
   public static final eru<erw> m = a("looting_enchant", erw.b);
   public static final eru<esm> n = a("set_damage", esm.a);
   public static final eru<erz> o = a("set_attributes", erz.a);
   public static final eru<esp> p = a("set_name", esp.a);
   public static final eru<erl> q = a("exploration_map", erl.f);
   public static final eru<ess> r = a("set_stew_effect", ess.a);
   public static final eru<eri> s = a("copy_name", eri.a);
   public static final eru<esd> t = a("set_contents", esd.a);
   public static final eru<erx> u = a("modify_contents", erx.a);
   public static final eru<ern> v = a("filtered", ern.a);
   public static final eru<erq> w = a("limit_count", erq.a);
   public static final eru<erd> x = a("apply_bonus", erd.a);
   public static final eru<ese> y = a("set_loot_table", ese.a);
   public static final eru<ere> z = a("explosion_decay", ere.a);
   public static final eru<eso> A = a("set_lore", eso.a);
   public static final eru<erm> B = a("fill_player_head", erm.a);
   public static final eru<erh> C = a("copy_custom_data", erh.a);
   public static final eru<erf> D = a("copy_state", erf.a);
   public static final eru<esa> E = a("set_banner_pattern", esa.a);
   public static final eru<esr> F = a("set_potion", esr.a);
   public static final eru<esk> G = a("set_instrument", esk.a);
   public static final eru<ero> H = a("reference", ero.a);
   public static final eru<ery> I = a("sequence", ery.a);
   public static final eru<erg> J = a("copy_components", erg.a);
   public static final eru<esj> K = a("set_fireworks", esj.a);
   public static final eru<esi> L = a("set_firework_explosion", esi.a);
   public static final eru<esb> M = a("set_book_cover", esb.a);
   public static final eru<esu> N = a("set_written_book_pages", esu.b);
   public static final eru<est> O = a("set_writable_book_pages", est.a);
   public static final eru<esw> P = a("toggle_tooltips", esw.a);
   public static final eru<esq> Q = a("set_ominous_bottle_amplifier", esq.a);
   public static final eru<esg> R = a("set_custom_model_data", esg.a);

   private static <T extends ert> eru<T> a(String $$0, MapCodec<T> $$1) {
      return jv.a(lp.G, new ale($$0), new eru<>($$1));
   }

   public static BiFunction<cun, eqg, cun> a(List<? extends BiFunction<cun, eqg, cun>> $$0) {
      List<BiFunction<cun, eqg, cun>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cun, eqg, cun> $$2 = $$1.get(0);
            BiFunction<cun, eqg, cun> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cun, eqg, cun> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

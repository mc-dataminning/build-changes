import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class ery {
   public static final BiFunction<cuq, eqj, cuq> a = ($$0, $$1) -> $$0;
   public static final Codec<erw> b = lp.G.q().dispatch("function", erw::b, erx::a);
   public static final Codec<erw> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, esb.b));
   public static final Codec<ji<erw>> d = alb.a(lq.aV, c);
   public static final erx<eso> e = a("set_count", eso.a);
   public static final erx<esq> f = a("set_item", esq.a);
   public static final erx<ern> g = a("enchant_with_levels", ern.a);
   public static final erx<erm> h = a("enchant_randomly", erm.a);
   public static final erx<esk> i = a("set_enchantments", esk.a);
   public static final erx<esi> j = a("set_custom_data", esi.a);
   public static final erx<esf> k = a("set_components", esf.a);
   public static final erx<esy> l = a("furnace_smelt", esy.a);
   public static final erx<erz> m = a("looting_enchant", erz.b);
   public static final erx<esp> n = a("set_damage", esp.a);
   public static final erx<esc> o = a("set_attributes", esc.a);
   public static final erx<ess> p = a("set_name", ess.a);
   public static final erx<ero> q = a("exploration_map", ero.f);
   public static final erx<esv> r = a("set_stew_effect", esv.a);
   public static final erx<erl> s = a("copy_name", erl.a);
   public static final erx<esg> t = a("set_contents", esg.a);
   public static final erx<esa> u = a("modify_contents", esa.a);
   public static final erx<erq> v = a("filtered", erq.a);
   public static final erx<ert> w = a("limit_count", ert.a);
   public static final erx<erg> x = a("apply_bonus", erg.a);
   public static final erx<esh> y = a("set_loot_table", esh.a);
   public static final erx<erh> z = a("explosion_decay", erh.a);
   public static final erx<esr> A = a("set_lore", esr.a);
   public static final erx<erp> B = a("fill_player_head", erp.a);
   public static final erx<erk> C = a("copy_custom_data", erk.a);
   public static final erx<eri> D = a("copy_state", eri.a);
   public static final erx<esd> E = a("set_banner_pattern", esd.a);
   public static final erx<esu> F = a("set_potion", esu.a);
   public static final erx<esn> G = a("set_instrument", esn.a);
   public static final erx<err> H = a("reference", err.a);
   public static final erx<esb> I = a("sequence", esb.a);
   public static final erx<erj> J = a("copy_components", erj.a);
   public static final erx<esm> K = a("set_fireworks", esm.a);
   public static final erx<esl> L = a("set_firework_explosion", esl.a);
   public static final erx<ese> M = a("set_book_cover", ese.a);
   public static final erx<esx> N = a("set_written_book_pages", esx.b);
   public static final erx<esw> O = a("set_writable_book_pages", esw.a);
   public static final erx<esz> P = a("toggle_tooltips", esz.a);
   public static final erx<est> Q = a("set_ominous_bottle_amplifier", est.a);
   public static final erx<esj> R = a("set_custom_model_data", esj.a);

   private static <T extends erw> erx<T> a(String $$0, MapCodec<T> $$1) {
      return jv.a(lp.G, new alf($$0), new erx<>($$1));
   }

   public static BiFunction<cuq, eqj, cuq> a(List<? extends BiFunction<cuq, eqj, cuq>> $$0) {
      List<BiFunction<cuq, eqj, cuq>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cuq, eqj, cuq> $$2 = $$1.get(0);
            BiFunction<cuq, eqj, cuq> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cuq, eqj, cuq> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

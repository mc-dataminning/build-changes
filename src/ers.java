import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class ers {
   public static final BiFunction<cuk, eqd, cuk> a = ($$0, $$1) -> $$0;
   public static final Codec<erq> b = lp.G.q().dispatch("function", erq::b, err::a);
   public static final Codec<erq> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, erv.b));
   public static final Codec<ji<erq>> d = akx.a(lq.aV, c);
   public static final err<esi> e = a("set_count", esi.a);
   public static final err<esk> f = a("set_item", esk.a);
   public static final err<erh> g = a("enchant_with_levels", erh.a);
   public static final err<erg> h = a("enchant_randomly", erg.a);
   public static final err<ese> i = a("set_enchantments", ese.a);
   public static final err<esc> j = a("set_custom_data", esc.a);
   public static final err<erz> k = a("set_components", erz.a);
   public static final err<ess> l = a("furnace_smelt", ess.a);
   public static final err<ert> m = a("looting_enchant", ert.b);
   public static final err<esj> n = a("set_damage", esj.a);
   public static final err<erw> o = a("set_attributes", erw.a);
   public static final err<esm> p = a("set_name", esm.a);
   public static final err<eri> q = a("exploration_map", eri.f);
   public static final err<esp> r = a("set_stew_effect", esp.a);
   public static final err<erf> s = a("copy_name", erf.a);
   public static final err<esa> t = a("set_contents", esa.a);
   public static final err<eru> u = a("modify_contents", eru.a);
   public static final err<erk> v = a("filtered", erk.a);
   public static final err<ern> w = a("limit_count", ern.a);
   public static final err<era> x = a("apply_bonus", era.a);
   public static final err<esb> y = a("set_loot_table", esb.a);
   public static final err<erb> z = a("explosion_decay", erb.a);
   public static final err<esl> A = a("set_lore", esl.a);
   public static final err<erj> B = a("fill_player_head", erj.a);
   public static final err<ere> C = a("copy_custom_data", ere.a);
   public static final err<erc> D = a("copy_state", erc.a);
   public static final err<erx> E = a("set_banner_pattern", erx.a);
   public static final err<eso> F = a("set_potion", eso.a);
   public static final err<esh> G = a("set_instrument", esh.a);
   public static final err<erl> H = a("reference", erl.a);
   public static final err<erv> I = a("sequence", erv.a);
   public static final err<erd> J = a("copy_components", erd.a);
   public static final err<esg> K = a("set_fireworks", esg.a);
   public static final err<esf> L = a("set_firework_explosion", esf.a);
   public static final err<ery> M = a("set_book_cover", ery.a);
   public static final err<esr> N = a("set_written_book_pages", esr.b);
   public static final err<esq> O = a("set_writable_book_pages", esq.a);
   public static final err<est> P = a("toggle_tooltips", est.a);
   public static final err<esn> Q = a("set_ominous_bottle_amplifier", esn.a);
   public static final err<esd> R = a("set_custom_model_data", esd.a);

   private static <T extends erq> err<T> a(String $$0, MapCodec<T> $$1) {
      return jv.a(lp.G, new alb($$0), new err<>($$1));
   }

   public static BiFunction<cuk, eqd, cuk> a(List<? extends BiFunction<cuk, eqd, cuk>> $$0) {
      List<BiFunction<cuk, eqd, cuk>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cuk, eqd, cuk> $$2 = $$1.get(0);
            BiFunction<cuk, eqd, cuk> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cuk, eqd, cuk> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

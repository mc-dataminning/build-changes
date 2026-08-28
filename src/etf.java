import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class etf {
   public static final BiFunction<cuq, erp, cuq> a = ($$0, $$1) -> $$0;
   public static final Codec<etd> b = lt.E.r().dispatch("function", etd::b, ete::a);
   public static final Codec<etd> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, eth.b));
   public static final Codec<jm<etd>> d = akn.a(lu.bd, c);
   public static final ete<etu> e = a("set_count", etu.a);
   public static final ete<etw> f = a("set_item", etw.a);
   public static final ete<est> g = a("enchant_with_levels", est.a);
   public static final ete<ess> h = a("enchant_randomly", ess.a);
   public static final ete<etq> i = a("set_enchantments", etq.a);
   public static final ete<eto> j = a("set_custom_data", eto.a);
   public static final ete<etl> k = a("set_components", etl.a);
   public static final ete<eue> l = a("furnace_smelt", eue.a);
   public static final ete<esu> m = a("enchanted_count_increase", esu.b);
   public static final ete<etv> n = a("set_damage", etv.a);
   public static final ete<eti> o = a("set_attributes", eti.a);
   public static final ete<ety> p = a("set_name", ety.a);
   public static final ete<esv> q = a("exploration_map", esv.f);
   public static final ete<eub> r = a("set_stew_effect", eub.a);
   public static final ete<esr> s = a("copy_name", esr.a);
   public static final ete<etm> t = a("set_contents", etm.a);
   public static final ete<etg> u = a("modify_contents", etg.a);
   public static final ete<esx> v = a("filtered", esx.a);
   public static final ete<eta> w = a("limit_count", eta.a);
   public static final ete<esm> x = a("apply_bonus", esm.a);
   public static final ete<etn> y = a("set_loot_table", etn.a);
   public static final ete<esn> z = a("explosion_decay", esn.a);
   public static final ete<etx> A = a("set_lore", etx.a);
   public static final ete<esw> B = a("fill_player_head", esw.a);
   public static final ete<esq> C = a("copy_custom_data", esq.a);
   public static final ete<eso> D = a("copy_state", eso.a);
   public static final ete<etj> E = a("set_banner_pattern", etj.a);
   public static final ete<eua> F = a("set_potion", eua.a);
   public static final ete<ett> G = a("set_instrument", ett.a);
   public static final ete<esy> H = a("reference", esy.a);
   public static final ete<eth> I = a("sequence", eth.a);
   public static final ete<esp> J = a("copy_components", esp.a);
   public static final ete<ets> K = a("set_fireworks", ets.a);
   public static final ete<etr> L = a("set_firework_explosion", etr.a);
   public static final ete<etk> M = a("set_book_cover", etk.a);
   public static final ete<eud> N = a("set_written_book_pages", eud.b);
   public static final ete<euc> O = a("set_writable_book_pages", euc.a);
   public static final ete<euf> P = a("toggle_tooltips", euf.a);
   public static final ete<etz> Q = a("set_ominous_bottle_amplifier", etz.a);
   public static final ete<etp> R = a("set_custom_model_data", etp.a);

   private static <T extends etd> ete<T> a(String $$0, MapCodec<T> $$1) {
      return jz.a(lt.E, akr.b($$0), new ete<>($$1));
   }

   public static BiFunction<cuq, erp, cuq> a(List<? extends BiFunction<cuq, erp, cuq>> $$0) {
      List<BiFunction<cuq, erp, cuq>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cuq, erp, cuq> $$2 = $$1.get(0);
            BiFunction<cuq, erp, cuq> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cuq, erp, cuq> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

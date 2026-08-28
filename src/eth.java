import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class eth {
   public static final BiFunction<cuq, err, cuq> a = ($$0, $$1) -> $$0;
   public static final Codec<etf> b = lt.E.r().dispatch("function", etf::b, etg::a);
   public static final Codec<etf> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, etj.b));
   public static final Codec<jm<etf>> d = akn.a(lu.bd, c);
   public static final etg<etw> e = a("set_count", etw.a);
   public static final etg<ety> f = a("set_item", ety.a);
   public static final etg<esv> g = a("enchant_with_levels", esv.a);
   public static final etg<esu> h = a("enchant_randomly", esu.a);
   public static final etg<ets> i = a("set_enchantments", ets.a);
   public static final etg<etq> j = a("set_custom_data", etq.a);
   public static final etg<etn> k = a("set_components", etn.a);
   public static final etg<eug> l = a("furnace_smelt", eug.a);
   public static final etg<esw> m = a("enchanted_count_increase", esw.b);
   public static final etg<etx> n = a("set_damage", etx.a);
   public static final etg<etk> o = a("set_attributes", etk.a);
   public static final etg<eua> p = a("set_name", eua.a);
   public static final etg<esx> q = a("exploration_map", esx.f);
   public static final etg<eud> r = a("set_stew_effect", eud.a);
   public static final etg<est> s = a("copy_name", est.a);
   public static final etg<eto> t = a("set_contents", eto.a);
   public static final etg<eti> u = a("modify_contents", eti.a);
   public static final etg<esz> v = a("filtered", esz.a);
   public static final etg<etc> w = a("limit_count", etc.a);
   public static final etg<eso> x = a("apply_bonus", eso.a);
   public static final etg<etp> y = a("set_loot_table", etp.a);
   public static final etg<esp> z = a("explosion_decay", esp.a);
   public static final etg<etz> A = a("set_lore", etz.a);
   public static final etg<esy> B = a("fill_player_head", esy.a);
   public static final etg<ess> C = a("copy_custom_data", ess.a);
   public static final etg<esq> D = a("copy_state", esq.a);
   public static final etg<etl> E = a("set_banner_pattern", etl.a);
   public static final etg<euc> F = a("set_potion", euc.a);
   public static final etg<etv> G = a("set_instrument", etv.a);
   public static final etg<eta> H = a("reference", eta.a);
   public static final etg<etj> I = a("sequence", etj.a);
   public static final etg<esr> J = a("copy_components", esr.a);
   public static final etg<etu> K = a("set_fireworks", etu.a);
   public static final etg<ett> L = a("set_firework_explosion", ett.a);
   public static final etg<etm> M = a("set_book_cover", etm.a);
   public static final etg<euf> N = a("set_written_book_pages", euf.b);
   public static final etg<eue> O = a("set_writable_book_pages", eue.a);
   public static final etg<euh> P = a("toggle_tooltips", euh.a);
   public static final etg<eub> Q = a("set_ominous_bottle_amplifier", eub.a);
   public static final etg<etr> R = a("set_custom_model_data", etr.a);

   private static <T extends etf> etg<T> a(String $$0, MapCodec<T> $$1) {
      return jz.a(lt.E, akr.b($$0), new etg<>($$1));
   }

   public static BiFunction<cuq, err, cuq> a(List<? extends BiFunction<cuq, err, cuq>> $$0) {
      List<BiFunction<cuq, err, cuq>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cuq, err, cuq> $$2 = $$1.get(0);
            BiFunction<cuq, err, cuq> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cuq, err, cuq> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

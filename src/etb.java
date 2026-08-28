import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class etb {
   public static final BiFunction<cuo, erl, cuo> a = ($$0, $$1) -> $$0;
   public static final Codec<esz> b = lt.E.r().dispatch("function", esz::b, eta::a);
   public static final Codec<esz> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, etd.b));
   public static final Codec<jm<esz>> d = akm.a(lu.bd, c);
   public static final eta<etq> e = a("set_count", etq.a);
   public static final eta<ets> f = a("set_item", ets.a);
   public static final eta<esp> g = a("enchant_with_levels", esp.a);
   public static final eta<eso> h = a("enchant_randomly", eso.a);
   public static final eta<etm> i = a("set_enchantments", etm.a);
   public static final eta<etk> j = a("set_custom_data", etk.a);
   public static final eta<eth> k = a("set_components", eth.a);
   public static final eta<eua> l = a("furnace_smelt", eua.a);
   public static final eta<esq> m = a("enchanted_count_increase", esq.b);
   public static final eta<etr> n = a("set_damage", etr.a);
   public static final eta<ete> o = a("set_attributes", ete.a);
   public static final eta<etu> p = a("set_name", etu.a);
   public static final eta<esr> q = a("exploration_map", esr.f);
   public static final eta<etx> r = a("set_stew_effect", etx.a);
   public static final eta<esn> s = a("copy_name", esn.a);
   public static final eta<eti> t = a("set_contents", eti.a);
   public static final eta<etc> u = a("modify_contents", etc.a);
   public static final eta<est> v = a("filtered", est.a);
   public static final eta<esw> w = a("limit_count", esw.a);
   public static final eta<esi> x = a("apply_bonus", esi.a);
   public static final eta<etj> y = a("set_loot_table", etj.a);
   public static final eta<esj> z = a("explosion_decay", esj.a);
   public static final eta<ett> A = a("set_lore", ett.a);
   public static final eta<ess> B = a("fill_player_head", ess.a);
   public static final eta<esm> C = a("copy_custom_data", esm.a);
   public static final eta<esk> D = a("copy_state", esk.a);
   public static final eta<etf> E = a("set_banner_pattern", etf.a);
   public static final eta<etw> F = a("set_potion", etw.a);
   public static final eta<etp> G = a("set_instrument", etp.a);
   public static final eta<esu> H = a("reference", esu.a);
   public static final eta<etd> I = a("sequence", etd.a);
   public static final eta<esl> J = a("copy_components", esl.a);
   public static final eta<eto> K = a("set_fireworks", eto.a);
   public static final eta<etn> L = a("set_firework_explosion", etn.a);
   public static final eta<etg> M = a("set_book_cover", etg.a);
   public static final eta<etz> N = a("set_written_book_pages", etz.b);
   public static final eta<ety> O = a("set_writable_book_pages", ety.a);
   public static final eta<eub> P = a("toggle_tooltips", eub.a);
   public static final eta<etv> Q = a("set_ominous_bottle_amplifier", etv.a);
   public static final eta<etl> R = a("set_custom_model_data", etl.a);

   private static <T extends esz> eta<T> a(String $$0, MapCodec<T> $$1) {
      return jz.a(lt.E, akq.b($$0), new eta<>($$1));
   }

   public static BiFunction<cuo, erl, cuo> a(List<? extends BiFunction<cuo, erl, cuo>> $$0) {
      List<BiFunction<cuo, erl, cuo>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cuo, erl, cuo> $$2 = $$1.get(0);
            BiFunction<cuo, erl, cuo> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cuo, erl, cuo> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

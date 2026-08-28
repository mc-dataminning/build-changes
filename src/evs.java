import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class evs {
   public static final BiFunction<cwb, euc, cwb> a = ($$0, $$1) -> $$0;
   public static final Codec<evq> b = ly.E.q().dispatch("function", evq::b, evr::a);
   public static final Codec<evq> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, evu.b));
   public static final Codec<jq<evq>> d = ale.a(lz.be, c);
   public static final evr<ewh> e = a("set_count", ewh.a);
   public static final evr<ewj> f = a("set_item", ewj.a);
   public static final evr<evg> g = a("enchant_with_levels", evg.a);
   public static final evr<evf> h = a("enchant_randomly", evf.a);
   public static final evr<ewd> i = a("set_enchantments", ewd.a);
   public static final evr<ewb> j = a("set_custom_data", ewb.a);
   public static final evr<evy> k = a("set_components", evy.a);
   public static final evr<ewr> l = a("furnace_smelt", ewr.a);
   public static final evr<evh> m = a("enchanted_count_increase", evh.b);
   public static final evr<ewi> n = a("set_damage", ewi.a);
   public static final evr<evv> o = a("set_attributes", evv.a);
   public static final evr<ewl> p = a("set_name", ewl.a);
   public static final evr<evi> q = a("exploration_map", evi.f);
   public static final evr<ewo> r = a("set_stew_effect", ewo.a);
   public static final evr<eve> s = a("copy_name", eve.a);
   public static final evr<evz> t = a("set_contents", evz.a);
   public static final evr<evt> u = a("modify_contents", evt.a);
   public static final evr<evk> v = a("filtered", evk.a);
   public static final evr<evn> w = a("limit_count", evn.a);
   public static final evr<euz> x = a("apply_bonus", euz.a);
   public static final evr<ewa> y = a("set_loot_table", ewa.a);
   public static final evr<eva> z = a("explosion_decay", eva.a);
   public static final evr<ewk> A = a("set_lore", ewk.a);
   public static final evr<evj> B = a("fill_player_head", evj.a);
   public static final evr<evd> C = a("copy_custom_data", evd.a);
   public static final evr<evb> D = a("copy_state", evb.a);
   public static final evr<evw> E = a("set_banner_pattern", evw.a);
   public static final evr<ewn> F = a("set_potion", ewn.a);
   public static final evr<ewg> G = a("set_instrument", ewg.a);
   public static final evr<evl> H = a("reference", evl.a);
   public static final evr<evu> I = a("sequence", evu.a);
   public static final evr<evc> J = a("copy_components", evc.a);
   public static final evr<ewf> K = a("set_fireworks", ewf.a);
   public static final evr<ewe> L = a("set_firework_explosion", ewe.a);
   public static final evr<evx> M = a("set_book_cover", evx.a);
   public static final evr<ewq> N = a("set_written_book_pages", ewq.b);
   public static final evr<ewp> O = a("set_writable_book_pages", ewp.a);
   public static final evr<ews> P = a("toggle_tooltips", ews.a);
   public static final evr<ewm> Q = a("set_ominous_bottle_amplifier", ewm.a);
   public static final evr<ewc> R = a("set_custom_model_data", ewc.a);

   private static <T extends evq> evr<T> a(String $$0, MapCodec<T> $$1) {
      return kd.a(ly.E, ali.b($$0), new evr<>($$1));
   }

   public static BiFunction<cwb, euc, cwb> a(List<? extends BiFunction<cwb, euc, cwb>> $$0) {
      List<BiFunction<cwb, euc, cwb>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cwb, euc, cwb> $$2 = $$1.get(0);
            BiFunction<cwb, euc, cwb> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cwb, euc, cwb> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

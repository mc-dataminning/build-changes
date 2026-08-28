import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class evw {
   public static final BiFunction<cwf, eug, cwf> a = ($$0, $$1) -> $$0;
   public static final Codec<evu> b = lz.E.q().dispatch("function", evu::b, evv::a);
   public static final Codec<evu> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, evy.b));
   public static final Codec<jq<evu>> d = alh.a(ma.be, c);
   public static final evv<ewl> e = a("set_count", ewl.a);
   public static final evv<ewn> f = a("set_item", ewn.a);
   public static final evv<evk> g = a("enchant_with_levels", evk.a);
   public static final evv<evj> h = a("enchant_randomly", evj.a);
   public static final evv<ewh> i = a("set_enchantments", ewh.a);
   public static final evv<ewf> j = a("set_custom_data", ewf.a);
   public static final evv<ewc> k = a("set_components", ewc.a);
   public static final evv<ewv> l = a("furnace_smelt", ewv.a);
   public static final evv<evl> m = a("enchanted_count_increase", evl.b);
   public static final evv<ewm> n = a("set_damage", ewm.a);
   public static final evv<evz> o = a("set_attributes", evz.a);
   public static final evv<ewp> p = a("set_name", ewp.a);
   public static final evv<evm> q = a("exploration_map", evm.f);
   public static final evv<ews> r = a("set_stew_effect", ews.a);
   public static final evv<evi> s = a("copy_name", evi.a);
   public static final evv<ewd> t = a("set_contents", ewd.a);
   public static final evv<evx> u = a("modify_contents", evx.a);
   public static final evv<evo> v = a("filtered", evo.a);
   public static final evv<evr> w = a("limit_count", evr.a);
   public static final evv<evd> x = a("apply_bonus", evd.a);
   public static final evv<ewe> y = a("set_loot_table", ewe.a);
   public static final evv<eve> z = a("explosion_decay", eve.a);
   public static final evv<ewo> A = a("set_lore", ewo.a);
   public static final evv<evn> B = a("fill_player_head", evn.a);
   public static final evv<evh> C = a("copy_custom_data", evh.a);
   public static final evv<evf> D = a("copy_state", evf.a);
   public static final evv<ewa> E = a("set_banner_pattern", ewa.a);
   public static final evv<ewr> F = a("set_potion", ewr.a);
   public static final evv<ewk> G = a("set_instrument", ewk.a);
   public static final evv<evp> H = a("reference", evp.a);
   public static final evv<evy> I = a("sequence", evy.a);
   public static final evv<evg> J = a("copy_components", evg.a);
   public static final evv<ewj> K = a("set_fireworks", ewj.a);
   public static final evv<ewi> L = a("set_firework_explosion", ewi.a);
   public static final evv<ewb> M = a("set_book_cover", ewb.a);
   public static final evv<ewu> N = a("set_written_book_pages", ewu.b);
   public static final evv<ewt> O = a("set_writable_book_pages", ewt.a);
   public static final evv<eww> P = a("toggle_tooltips", eww.a);
   public static final evv<ewq> Q = a("set_ominous_bottle_amplifier", ewq.a);
   public static final evv<ewg> R = a("set_custom_model_data", ewg.a);

   private static <T extends evu> evv<T> a(String $$0, MapCodec<T> $$1) {
      return kd.a(lz.E, all.b($$0), new evv<>($$1));
   }

   public static BiFunction<cwf, eug, cwf> a(List<? extends BiFunction<cwf, eug, cwf>> $$0) {
      List<BiFunction<cwf, eug, cwf>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cwf, eug, cwf> $$2 = $$1.get(0);
            BiFunction<cwf, eug, cwf> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cwf, eug, cwf> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

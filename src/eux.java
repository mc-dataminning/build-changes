import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class eux {
   public static final BiFunction<cvp, eth, cvp> a = ($$0, $$1) -> $$0;
   public static final Codec<euv> b = lu.E.q().dispatch("function", euv::b, euw::a);
   public static final Codec<euv> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, euz.b));
   public static final Codec<jn<euv>> d = aky.a(lv.be, c);
   public static final euw<evm> e = a("set_count", evm.a);
   public static final euw<evo> f = a("set_item", evo.a);
   public static final euw<eul> g = a("enchant_with_levels", eul.a);
   public static final euw<euk> h = a("enchant_randomly", euk.a);
   public static final euw<evi> i = a("set_enchantments", evi.a);
   public static final euw<evg> j = a("set_custom_data", evg.a);
   public static final euw<evd> k = a("set_components", evd.a);
   public static final euw<evw> l = a("furnace_smelt", evw.a);
   public static final euw<eum> m = a("enchanted_count_increase", eum.b);
   public static final euw<evn> n = a("set_damage", evn.a);
   public static final euw<eva> o = a("set_attributes", eva.a);
   public static final euw<evq> p = a("set_name", evq.a);
   public static final euw<eun> q = a("exploration_map", eun.f);
   public static final euw<evt> r = a("set_stew_effect", evt.a);
   public static final euw<euj> s = a("copy_name", euj.a);
   public static final euw<eve> t = a("set_contents", eve.a);
   public static final euw<euy> u = a("modify_contents", euy.a);
   public static final euw<eup> v = a("filtered", eup.a);
   public static final euw<eus> w = a("limit_count", eus.a);
   public static final euw<eue> x = a("apply_bonus", eue.a);
   public static final euw<evf> y = a("set_loot_table", evf.a);
   public static final euw<euf> z = a("explosion_decay", euf.a);
   public static final euw<evp> A = a("set_lore", evp.a);
   public static final euw<euo> B = a("fill_player_head", euo.a);
   public static final euw<eui> C = a("copy_custom_data", eui.a);
   public static final euw<eug> D = a("copy_state", eug.a);
   public static final euw<evb> E = a("set_banner_pattern", evb.a);
   public static final euw<evs> F = a("set_potion", evs.a);
   public static final euw<evl> G = a("set_instrument", evl.a);
   public static final euw<euq> H = a("reference", euq.a);
   public static final euw<euz> I = a("sequence", euz.a);
   public static final euw<euh> J = a("copy_components", euh.a);
   public static final euw<evk> K = a("set_fireworks", evk.a);
   public static final euw<evj> L = a("set_firework_explosion", evj.a);
   public static final euw<evc> M = a("set_book_cover", evc.a);
   public static final euw<evv> N = a("set_written_book_pages", evv.b);
   public static final euw<evu> O = a("set_writable_book_pages", evu.a);
   public static final euw<evx> P = a("toggle_tooltips", evx.a);
   public static final euw<evr> Q = a("set_ominous_bottle_amplifier", evr.a);
   public static final euw<evh> R = a("set_custom_model_data", evh.a);

   private static <T extends euv> euw<T> a(String $$0, MapCodec<T> $$1) {
      return ka.a(lu.E, alc.b($$0), new euw<>($$1));
   }

   public static BiFunction<cvp, eth, cvp> a(List<? extends BiFunction<cvp, eth, cvp>> $$0) {
      List<BiFunction<cvp, eth, cvp>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cvp, eth, cvp> $$2 = $$1.get(0);
            BiFunction<cvp, eth, cvp> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cvp, eth, cvp> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

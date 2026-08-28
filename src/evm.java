import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class evm {
   public static final BiFunction<cvx, etw, cvx> a = ($$0, $$1) -> $$0;
   public static final Codec<evk> b = lx.E.q().dispatch("function", evk::b, evl::a);
   public static final Codec<evk> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, evo.b));
   public static final Codec<jp<evk>> d = ald.a(ly.be, c);
   public static final evl<ewb> e = a("set_count", ewb.a);
   public static final evl<ewd> f = a("set_item", ewd.a);
   public static final evl<eva> g = a("enchant_with_levels", eva.a);
   public static final evl<euz> h = a("enchant_randomly", euz.a);
   public static final evl<evx> i = a("set_enchantments", evx.a);
   public static final evl<evv> j = a("set_custom_data", evv.a);
   public static final evl<evs> k = a("set_components", evs.a);
   public static final evl<ewl> l = a("furnace_smelt", ewl.a);
   public static final evl<evb> m = a("enchanted_count_increase", evb.b);
   public static final evl<ewc> n = a("set_damage", ewc.a);
   public static final evl<evp> o = a("set_attributes", evp.a);
   public static final evl<ewf> p = a("set_name", ewf.a);
   public static final evl<evc> q = a("exploration_map", evc.f);
   public static final evl<ewi> r = a("set_stew_effect", ewi.a);
   public static final evl<euy> s = a("copy_name", euy.a);
   public static final evl<evt> t = a("set_contents", evt.a);
   public static final evl<evn> u = a("modify_contents", evn.a);
   public static final evl<eve> v = a("filtered", eve.a);
   public static final evl<evh> w = a("limit_count", evh.a);
   public static final evl<eut> x = a("apply_bonus", eut.a);
   public static final evl<evu> y = a("set_loot_table", evu.a);
   public static final evl<euu> z = a("explosion_decay", euu.a);
   public static final evl<ewe> A = a("set_lore", ewe.a);
   public static final evl<evd> B = a("fill_player_head", evd.a);
   public static final evl<eux> C = a("copy_custom_data", eux.a);
   public static final evl<euv> D = a("copy_state", euv.a);
   public static final evl<evq> E = a("set_banner_pattern", evq.a);
   public static final evl<ewh> F = a("set_potion", ewh.a);
   public static final evl<ewa> G = a("set_instrument", ewa.a);
   public static final evl<evf> H = a("reference", evf.a);
   public static final evl<evo> I = a("sequence", evo.a);
   public static final evl<euw> J = a("copy_components", euw.a);
   public static final evl<evz> K = a("set_fireworks", evz.a);
   public static final evl<evy> L = a("set_firework_explosion", evy.a);
   public static final evl<evr> M = a("set_book_cover", evr.a);
   public static final evl<ewk> N = a("set_written_book_pages", ewk.b);
   public static final evl<ewj> O = a("set_writable_book_pages", ewj.a);
   public static final evl<ewm> P = a("toggle_tooltips", ewm.a);
   public static final evl<ewg> Q = a("set_ominous_bottle_amplifier", ewg.a);
   public static final evl<evw> R = a("set_custom_model_data", evw.a);

   private static <T extends evk> evl<T> a(String $$0, MapCodec<T> $$1) {
      return kc.a(lx.E, alh.b($$0), new evl<>($$1));
   }

   public static BiFunction<cvx, etw, cvx> a(List<? extends BiFunction<cvx, etw, cvx>> $$0) {
      List<BiFunction<cvx, etw, cvx>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cvx, etw, cvx> $$2 = $$1.get(0);
            BiFunction<cvx, etw, cvx> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cvx, etw, cvx> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

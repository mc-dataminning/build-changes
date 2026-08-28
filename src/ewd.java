import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class ewd {
   public static final BiFunction<cwm, eun, cwm> a = ($$0, $$1) -> $$0;
   public static final Codec<ewb> b = lz.E.q().dispatch("function", ewb::b, ewc::a);
   public static final Codec<ewb> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, ewf.b));
   public static final Codec<jq<ewb>> d = alf.a(ma.be, c);
   public static final ewc<ews> e = a("set_count", ews.a);
   public static final ewc<ewu> f = a("set_item", ewu.a);
   public static final ewc<evr> g = a("enchant_with_levels", evr.a);
   public static final ewc<evq> h = a("enchant_randomly", evq.a);
   public static final ewc<ewo> i = a("set_enchantments", ewo.a);
   public static final ewc<ewm> j = a("set_custom_data", ewm.a);
   public static final ewc<ewj> k = a("set_components", ewj.a);
   public static final ewc<exc> l = a("furnace_smelt", exc.a);
   public static final ewc<evs> m = a("enchanted_count_increase", evs.b);
   public static final ewc<ewt> n = a("set_damage", ewt.a);
   public static final ewc<ewg> o = a("set_attributes", ewg.a);
   public static final ewc<eww> p = a("set_name", eww.a);
   public static final ewc<evt> q = a("exploration_map", evt.f);
   public static final ewc<ewz> r = a("set_stew_effect", ewz.a);
   public static final ewc<evp> s = a("copy_name", evp.a);
   public static final ewc<ewk> t = a("set_contents", ewk.a);
   public static final ewc<ewe> u = a("modify_contents", ewe.a);
   public static final ewc<evv> v = a("filtered", evv.a);
   public static final ewc<evy> w = a("limit_count", evy.a);
   public static final ewc<evk> x = a("apply_bonus", evk.a);
   public static final ewc<ewl> y = a("set_loot_table", ewl.a);
   public static final ewc<evl> z = a("explosion_decay", evl.a);
   public static final ewc<ewv> A = a("set_lore", ewv.a);
   public static final ewc<evu> B = a("fill_player_head", evu.a);
   public static final ewc<evo> C = a("copy_custom_data", evo.a);
   public static final ewc<evm> D = a("copy_state", evm.a);
   public static final ewc<ewh> E = a("set_banner_pattern", ewh.a);
   public static final ewc<ewy> F = a("set_potion", ewy.a);
   public static final ewc<ewr> G = a("set_instrument", ewr.a);
   public static final ewc<evw> H = a("reference", evw.a);
   public static final ewc<ewf> I = a("sequence", ewf.a);
   public static final ewc<evn> J = a("copy_components", evn.a);
   public static final ewc<ewq> K = a("set_fireworks", ewq.a);
   public static final ewc<ewp> L = a("set_firework_explosion", ewp.a);
   public static final ewc<ewi> M = a("set_book_cover", ewi.a);
   public static final ewc<exb> N = a("set_written_book_pages", exb.b);
   public static final ewc<exa> O = a("set_writable_book_pages", exa.a);
   public static final ewc<exd> P = a("toggle_tooltips", exd.a);
   public static final ewc<ewx> Q = a("set_ominous_bottle_amplifier", ewx.a);
   public static final ewc<ewn> R = a("set_custom_model_data", ewn.a);

   private static <T extends ewb> ewc<T> a(String $$0, MapCodec<T> $$1) {
      return kd.a(lz.E, alj.b($$0), new ewc<>($$1));
   }

   public static BiFunction<cwm, eun, cwm> a(List<? extends BiFunction<cwm, eun, cwm>> $$0) {
      List<BiFunction<cwm, eun, cwm>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cwm, eun, cwm> $$2 = $$1.get(0);
            BiFunction<cwm, eun, cwm> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cwm, eun, cwm> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class exh {
   public static final BiFunction<cwp, evr, cwp> a = ($$0, $$1) -> $$0;
   public static final Codec<exf> b = mb.E.q().dispatch("function", exf::b, exg::a);
   public static final Codec<exf> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, exj.b));
   public static final Codec<jr<exf>> d = akq.a(mc.bh, c);
   public static final exg<exw> e = a("set_count", exw.a);
   public static final exg<exy> f = a("set_item", exy.a);
   public static final exg<ewv> g = a("enchant_with_levels", ewv.a);
   public static final exg<ewu> h = a("enchant_randomly", ewu.a);
   public static final exg<exs> i = a("set_enchantments", exs.a);
   public static final exg<exq> j = a("set_custom_data", exq.a);
   public static final exg<exn> k = a("set_components", exn.a);
   public static final exg<eyg> l = a("furnace_smelt", eyg.a);
   public static final exg<eww> m = a("enchanted_count_increase", eww.b);
   public static final exg<exx> n = a("set_damage", exx.a);
   public static final exg<exk> o = a("set_attributes", exk.a);
   public static final exg<eya> p = a("set_name", eya.a);
   public static final exg<ewx> q = a("exploration_map", ewx.f);
   public static final exg<eyd> r = a("set_stew_effect", eyd.a);
   public static final exg<ewt> s = a("copy_name", ewt.a);
   public static final exg<exo> t = a("set_contents", exo.a);
   public static final exg<exi> u = a("modify_contents", exi.a);
   public static final exg<ewz> v = a("filtered", ewz.a);
   public static final exg<exc> w = a("limit_count", exc.a);
   public static final exg<ewo> x = a("apply_bonus", ewo.a);
   public static final exg<exp> y = a("set_loot_table", exp.a);
   public static final exg<ewp> z = a("explosion_decay", ewp.a);
   public static final exg<exz> A = a("set_lore", exz.a);
   public static final exg<ewy> B = a("fill_player_head", ewy.a);
   public static final exg<ews> C = a("copy_custom_data", ews.a);
   public static final exg<ewq> D = a("copy_state", ewq.a);
   public static final exg<exl> E = a("set_banner_pattern", exl.a);
   public static final exg<eyc> F = a("set_potion", eyc.a);
   public static final exg<exv> G = a("set_instrument", exv.a);
   public static final exg<exa> H = a("reference", exa.a);
   public static final exg<exj> I = a("sequence", exj.a);
   public static final exg<ewr> J = a("copy_components", ewr.a);
   public static final exg<exu> K = a("set_fireworks", exu.a);
   public static final exg<ext> L = a("set_firework_explosion", ext.a);
   public static final exg<exm> M = a("set_book_cover", exm.a);
   public static final exg<eyf> N = a("set_written_book_pages", eyf.b);
   public static final exg<eye> O = a("set_writable_book_pages", eye.a);
   public static final exg<eyh> P = a("toggle_tooltips", eyh.a);
   public static final exg<eyb> Q = a("set_ominous_bottle_amplifier", eyb.a);
   public static final exg<exr> R = a("set_custom_model_data", exr.a);

   private static <T extends exf> exg<T> a(String $$0, MapCodec<T> $$1) {
      return ke.a(mb.E, aku.b($$0), new exg<>($$1));
   }

   public static BiFunction<cwp, evr, cwp> a(List<? extends BiFunction<cwp, evr, cwp>> $$0) {
      List<BiFunction<cwp, evr, cwp>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cwp, evr, cwp> $$2 = $$1.get(0);
            BiFunction<cwp, evr, cwp> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cwp, evr, cwp> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

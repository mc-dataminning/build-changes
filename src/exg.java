import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class exg {
   public static final BiFunction<cwo, evq, cwo> a = ($$0, $$1) -> $$0;
   public static final Codec<exe> b = mb.E.q().dispatch("function", exe::b, exf::a);
   public static final Codec<exe> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, exi.b));
   public static final Codec<jr<exe>> d = akr.a(mc.bh, c);
   public static final exf<exv> e = a("set_count", exv.a);
   public static final exf<exx> f = a("set_item", exx.a);
   public static final exf<ewu> g = a("enchant_with_levels", ewu.a);
   public static final exf<ewt> h = a("enchant_randomly", ewt.a);
   public static final exf<exr> i = a("set_enchantments", exr.a);
   public static final exf<exp> j = a("set_custom_data", exp.a);
   public static final exf<exm> k = a("set_components", exm.a);
   public static final exf<eyf> l = a("furnace_smelt", eyf.a);
   public static final exf<ewv> m = a("enchanted_count_increase", ewv.b);
   public static final exf<exw> n = a("set_damage", exw.a);
   public static final exf<exj> o = a("set_attributes", exj.a);
   public static final exf<exz> p = a("set_name", exz.a);
   public static final exf<eww> q = a("exploration_map", eww.f);
   public static final exf<eyc> r = a("set_stew_effect", eyc.a);
   public static final exf<ews> s = a("copy_name", ews.a);
   public static final exf<exn> t = a("set_contents", exn.a);
   public static final exf<exh> u = a("modify_contents", exh.a);
   public static final exf<ewy> v = a("filtered", ewy.a);
   public static final exf<exb> w = a("limit_count", exb.a);
   public static final exf<ewn> x = a("apply_bonus", ewn.a);
   public static final exf<exo> y = a("set_loot_table", exo.a);
   public static final exf<ewo> z = a("explosion_decay", ewo.a);
   public static final exf<exy> A = a("set_lore", exy.a);
   public static final exf<ewx> B = a("fill_player_head", ewx.a);
   public static final exf<ewr> C = a("copy_custom_data", ewr.a);
   public static final exf<ewp> D = a("copy_state", ewp.a);
   public static final exf<exk> E = a("set_banner_pattern", exk.a);
   public static final exf<eyb> F = a("set_potion", eyb.a);
   public static final exf<exu> G = a("set_instrument", exu.a);
   public static final exf<ewz> H = a("reference", ewz.a);
   public static final exf<exi> I = a("sequence", exi.a);
   public static final exf<ewq> J = a("copy_components", ewq.a);
   public static final exf<ext> K = a("set_fireworks", ext.a);
   public static final exf<exs> L = a("set_firework_explosion", exs.a);
   public static final exf<exl> M = a("set_book_cover", exl.a);
   public static final exf<eye> N = a("set_written_book_pages", eye.b);
   public static final exf<eyd> O = a("set_writable_book_pages", eyd.a);
   public static final exf<eyg> P = a("toggle_tooltips", eyg.a);
   public static final exf<eya> Q = a("set_ominous_bottle_amplifier", eya.a);
   public static final exf<exq> R = a("set_custom_model_data", exq.a);

   private static <T extends exe> exf<T> a(String $$0, MapCodec<T> $$1) {
      return ke.a(mb.E, akv.b($$0), new exf<>($$1));
   }

   public static BiFunction<cwo, evq, cwo> a(List<? extends BiFunction<cwo, evq, cwo>> $$0) {
      List<BiFunction<cwo, evq, cwo>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cwo, evq, cwo> $$2 = $$1.get(0);
            BiFunction<cwo, evq, cwo> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cwo, evq, cwo> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

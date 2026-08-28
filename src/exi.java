import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class exi {
   public static final BiFunction<cwq, evs, cwq> a = ($$0, $$1) -> $$0;
   public static final Codec<exg> b = mb.E.q().dispatch("function", exg::b, exh::a);
   public static final Codec<exg> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, exk.b));
   public static final Codec<jr<exg>> d = akr.a(mc.bh, c);
   public static final exh<exx> e = a("set_count", exx.a);
   public static final exh<exz> f = a("set_item", exz.a);
   public static final exh<eww> g = a("enchant_with_levels", eww.a);
   public static final exh<ewv> h = a("enchant_randomly", ewv.a);
   public static final exh<ext> i = a("set_enchantments", ext.a);
   public static final exh<exr> j = a("set_custom_data", exr.a);
   public static final exh<exo> k = a("set_components", exo.a);
   public static final exh<eyh> l = a("furnace_smelt", eyh.a);
   public static final exh<ewx> m = a("enchanted_count_increase", ewx.b);
   public static final exh<exy> n = a("set_damage", exy.a);
   public static final exh<exl> o = a("set_attributes", exl.a);
   public static final exh<eyb> p = a("set_name", eyb.a);
   public static final exh<ewy> q = a("exploration_map", ewy.f);
   public static final exh<eye> r = a("set_stew_effect", eye.a);
   public static final exh<ewu> s = a("copy_name", ewu.a);
   public static final exh<exp> t = a("set_contents", exp.a);
   public static final exh<exj> u = a("modify_contents", exj.a);
   public static final exh<exa> v = a("filtered", exa.a);
   public static final exh<exd> w = a("limit_count", exd.a);
   public static final exh<ewp> x = a("apply_bonus", ewp.a);
   public static final exh<exq> y = a("set_loot_table", exq.a);
   public static final exh<ewq> z = a("explosion_decay", ewq.a);
   public static final exh<eya> A = a("set_lore", eya.a);
   public static final exh<ewz> B = a("fill_player_head", ewz.a);
   public static final exh<ewt> C = a("copy_custom_data", ewt.a);
   public static final exh<ewr> D = a("copy_state", ewr.a);
   public static final exh<exm> E = a("set_banner_pattern", exm.a);
   public static final exh<eyd> F = a("set_potion", eyd.a);
   public static final exh<exw> G = a("set_instrument", exw.a);
   public static final exh<exb> H = a("reference", exb.a);
   public static final exh<exk> I = a("sequence", exk.a);
   public static final exh<ews> J = a("copy_components", ews.a);
   public static final exh<exv> K = a("set_fireworks", exv.a);
   public static final exh<exu> L = a("set_firework_explosion", exu.a);
   public static final exh<exn> M = a("set_book_cover", exn.a);
   public static final exh<eyg> N = a("set_written_book_pages", eyg.b);
   public static final exh<eyf> O = a("set_writable_book_pages", eyf.a);
   public static final exh<eyi> P = a("toggle_tooltips", eyi.a);
   public static final exh<eyc> Q = a("set_ominous_bottle_amplifier", eyc.a);
   public static final exh<exs> R = a("set_custom_model_data", exs.a);

   private static <T extends exg> exh<T> a(String $$0, MapCodec<T> $$1) {
      return ke.a(mb.E, akv.b($$0), new exh<>($$1));
   }

   public static BiFunction<cwq, evs, cwq> a(List<? extends BiFunction<cwq, evs, cwq>> $$0) {
      List<BiFunction<cwq, evs, cwq>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cwq, evs, cwq> $$2 = $$1.get(0);
            BiFunction<cwq, evs, cwq> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cwq, evs, cwq> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

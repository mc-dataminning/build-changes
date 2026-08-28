import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class eyf {
   public static final BiFunction<cxp, ewp, cxp> a = ($$0, $$1) -> $$0;
   public static final Codec<eyd> b = ma.E.q().dispatch("function", eyd::b, eye::a);
   public static final Codec<eyd> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, eyh.b));
   public static final Codec<jq<eyd>> d = alv.a(mb.bh, c);
   public static final eye<eyu> e = a("set_count", eyu.a);
   public static final eye<eyw> f = a("set_item", eyw.a);
   public static final eye<ext> g = a("enchant_with_levels", ext.a);
   public static final eye<exs> h = a("enchant_randomly", exs.a);
   public static final eye<eyq> i = a("set_enchantments", eyq.a);
   public static final eye<eyo> j = a("set_custom_data", eyo.a);
   public static final eye<eyl> k = a("set_components", eyl.a);
   public static final eye<eze> l = a("furnace_smelt", eze.a);
   public static final eye<exu> m = a("enchanted_count_increase", exu.b);
   public static final eye<eyv> n = a("set_damage", eyv.a);
   public static final eye<eyi> o = a("set_attributes", eyi.a);
   public static final eye<eyy> p = a("set_name", eyy.a);
   public static final eye<exv> q = a("exploration_map", exv.f);
   public static final eye<ezb> r = a("set_stew_effect", ezb.a);
   public static final eye<exr> s = a("copy_name", exr.a);
   public static final eye<eym> t = a("set_contents", eym.a);
   public static final eye<eyg> u = a("modify_contents", eyg.a);
   public static final eye<exx> v = a("filtered", exx.a);
   public static final eye<eya> w = a("limit_count", eya.a);
   public static final eye<exm> x = a("apply_bonus", exm.a);
   public static final eye<eyn> y = a("set_loot_table", eyn.a);
   public static final eye<exn> z = a("explosion_decay", exn.a);
   public static final eye<eyx> A = a("set_lore", eyx.a);
   public static final eye<exw> B = a("fill_player_head", exw.a);
   public static final eye<exq> C = a("copy_custom_data", exq.a);
   public static final eye<exo> D = a("copy_state", exo.a);
   public static final eye<eyj> E = a("set_banner_pattern", eyj.a);
   public static final eye<eza> F = a("set_potion", eza.a);
   public static final eye<eyt> G = a("set_instrument", eyt.a);
   public static final eye<exy> H = a("reference", exy.a);
   public static final eye<eyh> I = a("sequence", eyh.a);
   public static final eye<exp> J = a("copy_components", exp.a);
   public static final eye<eys> K = a("set_fireworks", eys.a);
   public static final eye<eyr> L = a("set_firework_explosion", eyr.a);
   public static final eye<eyk> M = a("set_book_cover", eyk.a);
   public static final eye<ezd> N = a("set_written_book_pages", ezd.b);
   public static final eye<ezc> O = a("set_writable_book_pages", ezc.a);
   public static final eye<ezf> P = a("toggle_tooltips", ezf.a);
   public static final eye<eyz> Q = a("set_ominous_bottle_amplifier", eyz.a);
   public static final eye<eyp> R = a("set_custom_model_data", eyp.a);

   private static <T extends eyd> eye<T> a(String $$0, MapCodec<T> $$1) {
      return kd.a(ma.E, alz.b($$0), new eye<>($$1));
   }

   public static BiFunction<cxp, ewp, cxp> a(List<? extends BiFunction<cxp, ewp, cxp>> $$0) {
      List<BiFunction<cxp, ewp, cxp>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cxp, ewp, cxp> $$2 = $$1.get(0);
            BiFunction<cxp, ewp, cxp> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cxp, ewp, cxp> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

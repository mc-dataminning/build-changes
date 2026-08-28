import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class eye {
   public static final BiFunction<cxh, ewo, cxh> a = ($$0, $$1) -> $$0;
   public static final Codec<eyc> b = mb.E.q().dispatch("function", eyc::b, eyd::a);
   public static final Codec<eyc> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, eyg.b));
   public static final Codec<jr<eyc>> d = akq.a(mc.bj, c);
   public static final eyd<eyt> e = a("set_count", eyt.a);
   public static final eyd<eyv> f = a("set_item", eyv.a);
   public static final eyd<exs> g = a("enchant_with_levels", exs.a);
   public static final eyd<exr> h = a("enchant_randomly", exr.a);
   public static final eyd<eyp> i = a("set_enchantments", eyp.a);
   public static final eyd<eyn> j = a("set_custom_data", eyn.a);
   public static final eyd<eyk> k = a("set_components", eyk.a);
   public static final eyd<ezd> l = a("furnace_smelt", ezd.a);
   public static final eyd<ext> m = a("enchanted_count_increase", ext.b);
   public static final eyd<eyu> n = a("set_damage", eyu.a);
   public static final eyd<eyh> o = a("set_attributes", eyh.a);
   public static final eyd<eyx> p = a("set_name", eyx.a);
   public static final eyd<exu> q = a("exploration_map", exu.f);
   public static final eyd<eza> r = a("set_stew_effect", eza.a);
   public static final eyd<exq> s = a("copy_name", exq.a);
   public static final eyd<eyl> t = a("set_contents", eyl.a);
   public static final eyd<eyf> u = a("modify_contents", eyf.a);
   public static final eyd<exw> v = a("filtered", exw.a);
   public static final eyd<exz> w = a("limit_count", exz.a);
   public static final eyd<exl> x = a("apply_bonus", exl.a);
   public static final eyd<eym> y = a("set_loot_table", eym.a);
   public static final eyd<exm> z = a("explosion_decay", exm.a);
   public static final eyd<eyw> A = a("set_lore", eyw.a);
   public static final eyd<exv> B = a("fill_player_head", exv.a);
   public static final eyd<exp> C = a("copy_custom_data", exp.a);
   public static final eyd<exn> D = a("copy_state", exn.a);
   public static final eyd<eyi> E = a("set_banner_pattern", eyi.a);
   public static final eyd<eyz> F = a("set_potion", eyz.a);
   public static final eyd<eys> G = a("set_instrument", eys.a);
   public static final eyd<exx> H = a("reference", exx.a);
   public static final eyd<eyg> I = a("sequence", eyg.a);
   public static final eyd<exo> J = a("copy_components", exo.a);
   public static final eyd<eyr> K = a("set_fireworks", eyr.a);
   public static final eyd<eyq> L = a("set_firework_explosion", eyq.a);
   public static final eyd<eyj> M = a("set_book_cover", eyj.a);
   public static final eyd<ezc> N = a("set_written_book_pages", ezc.a);
   public static final eyd<ezb> O = a("set_writable_book_pages", ezb.a);
   public static final eyd<eze> P = a("toggle_tooltips", eze.a);
   public static final eyd<eyy> Q = a("set_ominous_bottle_amplifier", eyy.a);
   public static final eyd<eyo> R = a("set_custom_model_data", eyo.a);

   private static <T extends eyc> eyd<T> a(String $$0, MapCodec<T> $$1) {
      return ke.a(mb.E, aku.b($$0), new eyd<>($$1));
   }

   public static BiFunction<cxh, ewo, cxh> a(List<? extends BiFunction<cxh, ewo, cxh>> $$0) {
      List<BiFunction<cxh, ewo, cxh>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cxh, ewo, cxh> $$2 = $$1.get(0);
            BiFunction<cxh, ewo, cxh> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cxh, ewo, cxh> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

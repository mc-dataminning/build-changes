import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class exy {
   public static final BiFunction<cxg, ewi, cxg> a = ($$0, $$1) -> $$0;
   public static final Codec<exw> b = ma.E.q().dispatch("function", exw::b, exx::a);
   public static final Codec<exw> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, eya.b));
   public static final Codec<jq<exw>> d = all.a(mb.bh, c);
   public static final exx<eyn> e = a("set_count", eyn.a);
   public static final exx<eyp> f = a("set_item", eyp.a);
   public static final exx<exm> g = a("enchant_with_levels", exm.a);
   public static final exx<exl> h = a("enchant_randomly", exl.a);
   public static final exx<eyj> i = a("set_enchantments", eyj.a);
   public static final exx<eyh> j = a("set_custom_data", eyh.a);
   public static final exx<eye> k = a("set_components", eye.a);
   public static final exx<eyx> l = a("furnace_smelt", eyx.a);
   public static final exx<exn> m = a("enchanted_count_increase", exn.b);
   public static final exx<eyo> n = a("set_damage", eyo.a);
   public static final exx<eyb> o = a("set_attributes", eyb.a);
   public static final exx<eyr> p = a("set_name", eyr.a);
   public static final exx<exo> q = a("exploration_map", exo.f);
   public static final exx<eyu> r = a("set_stew_effect", eyu.a);
   public static final exx<exk> s = a("copy_name", exk.a);
   public static final exx<eyf> t = a("set_contents", eyf.a);
   public static final exx<exz> u = a("modify_contents", exz.a);
   public static final exx<exq> v = a("filtered", exq.a);
   public static final exx<ext> w = a("limit_count", ext.a);
   public static final exx<exf> x = a("apply_bonus", exf.a);
   public static final exx<eyg> y = a("set_loot_table", eyg.a);
   public static final exx<exg> z = a("explosion_decay", exg.a);
   public static final exx<eyq> A = a("set_lore", eyq.a);
   public static final exx<exp> B = a("fill_player_head", exp.a);
   public static final exx<exj> C = a("copy_custom_data", exj.a);
   public static final exx<exh> D = a("copy_state", exh.a);
   public static final exx<eyc> E = a("set_banner_pattern", eyc.a);
   public static final exx<eyt> F = a("set_potion", eyt.a);
   public static final exx<eym> G = a("set_instrument", eym.a);
   public static final exx<exr> H = a("reference", exr.a);
   public static final exx<eya> I = a("sequence", eya.a);
   public static final exx<exi> J = a("copy_components", exi.a);
   public static final exx<eyl> K = a("set_fireworks", eyl.a);
   public static final exx<eyk> L = a("set_firework_explosion", eyk.a);
   public static final exx<eyd> M = a("set_book_cover", eyd.a);
   public static final exx<eyw> N = a("set_written_book_pages", eyw.b);
   public static final exx<eyv> O = a("set_writable_book_pages", eyv.a);
   public static final exx<eyy> P = a("toggle_tooltips", eyy.a);
   public static final exx<eys> Q = a("set_ominous_bottle_amplifier", eys.a);
   public static final exx<eyi> R = a("set_custom_model_data", eyi.a);

   private static <T extends exw> exx<T> a(String $$0, MapCodec<T> $$1) {
      return kd.a(ma.E, alp.b($$0), new exx<>($$1));
   }

   public static BiFunction<cxg, ewi, cxg> a(List<? extends BiFunction<cxg, ewi, cxg>> $$0) {
      List<BiFunction<cxg, ewi, cxg>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cxg, ewi, cxg> $$2 = $$1.get(0);
            BiFunction<cxg, ewi, cxg> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cxg, ewi, cxg> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

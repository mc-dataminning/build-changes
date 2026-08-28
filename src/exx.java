import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class exx {
   public static final BiFunction<cxk, ewh, cxk> a = ($$0, $$1) -> $$0;
   public static final Codec<exv> b = ma.E.q().dispatch("function", exv::b, exw::a);
   public static final Codec<exv> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, exz.b));
   public static final Codec<jq<exv>> d = alv.a(mb.bg, c);
   public static final exw<eym> e = a("set_count", eym.a);
   public static final exw<eyo> f = a("set_item", eyo.a);
   public static final exw<exl> g = a("enchant_with_levels", exl.a);
   public static final exw<exk> h = a("enchant_randomly", exk.a);
   public static final exw<eyi> i = a("set_enchantments", eyi.a);
   public static final exw<eyg> j = a("set_custom_data", eyg.a);
   public static final exw<eyd> k = a("set_components", eyd.a);
   public static final exw<eyw> l = a("furnace_smelt", eyw.a);
   public static final exw<exm> m = a("enchanted_count_increase", exm.b);
   public static final exw<eyn> n = a("set_damage", eyn.a);
   public static final exw<eya> o = a("set_attributes", eya.a);
   public static final exw<eyq> p = a("set_name", eyq.a);
   public static final exw<exn> q = a("exploration_map", exn.f);
   public static final exw<eyt> r = a("set_stew_effect", eyt.a);
   public static final exw<exj> s = a("copy_name", exj.a);
   public static final exw<eye> t = a("set_contents", eye.a);
   public static final exw<exy> u = a("modify_contents", exy.a);
   public static final exw<exp> v = a("filtered", exp.a);
   public static final exw<exs> w = a("limit_count", exs.a);
   public static final exw<exe> x = a("apply_bonus", exe.a);
   public static final exw<eyf> y = a("set_loot_table", eyf.a);
   public static final exw<exf> z = a("explosion_decay", exf.a);
   public static final exw<eyp> A = a("set_lore", eyp.a);
   public static final exw<exo> B = a("fill_player_head", exo.a);
   public static final exw<exi> C = a("copy_custom_data", exi.a);
   public static final exw<exg> D = a("copy_state", exg.a);
   public static final exw<eyb> E = a("set_banner_pattern", eyb.a);
   public static final exw<eys> F = a("set_potion", eys.a);
   public static final exw<eyl> G = a("set_instrument", eyl.a);
   public static final exw<exq> H = a("reference", exq.a);
   public static final exw<exz> I = a("sequence", exz.a);
   public static final exw<exh> J = a("copy_components", exh.a);
   public static final exw<eyk> K = a("set_fireworks", eyk.a);
   public static final exw<eyj> L = a("set_firework_explosion", eyj.a);
   public static final exw<eyc> M = a("set_book_cover", eyc.a);
   public static final exw<eyv> N = a("set_written_book_pages", eyv.b);
   public static final exw<eyu> O = a("set_writable_book_pages", eyu.a);
   public static final exw<eyx> P = a("toggle_tooltips", eyx.a);
   public static final exw<eyr> Q = a("set_ominous_bottle_amplifier", eyr.a);
   public static final exw<eyh> R = a("set_custom_model_data", eyh.a);

   private static <T extends exv> exw<T> a(String $$0, MapCodec<T> $$1) {
      return kd.a(ma.E, alz.b($$0), new exw<>($$1));
   }

   public static BiFunction<cxk, ewh, cxk> a(List<? extends BiFunction<cxk, ewh, cxk>> $$0) {
      List<BiFunction<cxk, ewh, cxk>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cxk, ewh, cxk> $$2 = $$1.get(0);
            BiFunction<cxk, ewh, cxk> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cxk, ewh, cxk> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

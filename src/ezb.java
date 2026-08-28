import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class ezb {
   public static final BiFunction<cxy, exl, cxy> a = ($$0, $$1) -> $$0;
   public static final Codec<eyz> b = md.E.q().dispatch("function", eyz::b, eza::a);
   public static final Codec<eyz> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, ezd.b));
   public static final Codec<js<eyz>> d = akz.a(me.bo, c);
   public static final eza<ezq> e = a("set_count", ezq.a);
   public static final eza<ezs> f = a("set_item", ezs.a);
   public static final eza<eyp> g = a("enchant_with_levels", eyp.a);
   public static final eza<eyo> h = a("enchant_randomly", eyo.a);
   public static final eza<ezm> i = a("set_enchantments", ezm.a);
   public static final eza<ezk> j = a("set_custom_data", ezk.a);
   public static final eza<ezh> k = a("set_components", ezh.a);
   public static final eza<faa> l = a("furnace_smelt", faa.a);
   public static final eza<eyq> m = a("enchanted_count_increase", eyq.b);
   public static final eza<ezr> n = a("set_damage", ezr.a);
   public static final eza<eze> o = a("set_attributes", eze.a);
   public static final eza<ezu> p = a("set_name", ezu.a);
   public static final eza<eyr> q = a("exploration_map", eyr.f);
   public static final eza<ezx> r = a("set_stew_effect", ezx.a);
   public static final eza<eyn> s = a("copy_name", eyn.a);
   public static final eza<ezi> t = a("set_contents", ezi.a);
   public static final eza<ezc> u = a("modify_contents", ezc.a);
   public static final eza<eyt> v = a("filtered", eyt.a);
   public static final eza<eyw> w = a("limit_count", eyw.a);
   public static final eza<eyi> x = a("apply_bonus", eyi.a);
   public static final eza<ezj> y = a("set_loot_table", ezj.a);
   public static final eza<eyj> z = a("explosion_decay", eyj.a);
   public static final eza<ezt> A = a("set_lore", ezt.a);
   public static final eza<eys> B = a("fill_player_head", eys.a);
   public static final eza<eym> C = a("copy_custom_data", eym.a);
   public static final eza<eyk> D = a("copy_state", eyk.a);
   public static final eza<ezf> E = a("set_banner_pattern", ezf.a);
   public static final eza<ezw> F = a("set_potion", ezw.a);
   public static final eza<ezp> G = a("set_instrument", ezp.a);
   public static final eza<eyu> H = a("reference", eyu.a);
   public static final eza<ezd> I = a("sequence", ezd.a);
   public static final eza<eyl> J = a("copy_components", eyl.a);
   public static final eza<ezo> K = a("set_fireworks", ezo.a);
   public static final eza<ezn> L = a("set_firework_explosion", ezn.a);
   public static final eza<ezg> M = a("set_book_cover", ezg.a);
   public static final eza<ezz> N = a("set_written_book_pages", ezz.a);
   public static final eza<ezy> O = a("set_writable_book_pages", ezy.a);
   public static final eza<fab> P = a("toggle_tooltips", fab.a);
   public static final eza<ezv> Q = a("set_ominous_bottle_amplifier", ezv.a);
   public static final eza<ezl> R = a("set_custom_model_data", ezl.a);

   private static <T extends eyz> eza<T> a(String $$0, MapCodec<T> $$1) {
      return kf.a(md.E, ald.b($$0), new eza<>($$1));
   }

   public static BiFunction<cxy, exl, cxy> a(List<? extends BiFunction<cxy, exl, cxy>> $$0) {
      List<BiFunction<cxy, exl, cxy>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cxy, exl, cxy> $$2 = $$1.get(0);
            BiFunction<cxy, exl, cxy> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cxy, exl, cxy> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

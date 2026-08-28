import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class exf {
   public static final BiFunction<cwn, evp, cwn> a = ($$0, $$1) -> $$0;
   public static final Codec<exd> b = mb.E.q().dispatch("function", exd::b, exe::a);
   public static final Codec<exd> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, exh.b));
   public static final Codec<jr<exd>> d = akq.a(mc.bh, c);
   public static final exe<exu> e = a("set_count", exu.a);
   public static final exe<exw> f = a("set_item", exw.a);
   public static final exe<ewt> g = a("enchant_with_levels", ewt.a);
   public static final exe<ews> h = a("enchant_randomly", ews.a);
   public static final exe<exq> i = a("set_enchantments", exq.a);
   public static final exe<exo> j = a("set_custom_data", exo.a);
   public static final exe<exl> k = a("set_components", exl.a);
   public static final exe<eye> l = a("furnace_smelt", eye.a);
   public static final exe<ewu> m = a("enchanted_count_increase", ewu.b);
   public static final exe<exv> n = a("set_damage", exv.a);
   public static final exe<exi> o = a("set_attributes", exi.a);
   public static final exe<exy> p = a("set_name", exy.a);
   public static final exe<ewv> q = a("exploration_map", ewv.f);
   public static final exe<eyb> r = a("set_stew_effect", eyb.a);
   public static final exe<ewr> s = a("copy_name", ewr.a);
   public static final exe<exm> t = a("set_contents", exm.a);
   public static final exe<exg> u = a("modify_contents", exg.a);
   public static final exe<ewx> v = a("filtered", ewx.a);
   public static final exe<exa> w = a("limit_count", exa.a);
   public static final exe<ewm> x = a("apply_bonus", ewm.a);
   public static final exe<exn> y = a("set_loot_table", exn.a);
   public static final exe<ewn> z = a("explosion_decay", ewn.a);
   public static final exe<exx> A = a("set_lore", exx.a);
   public static final exe<eww> B = a("fill_player_head", eww.a);
   public static final exe<ewq> C = a("copy_custom_data", ewq.a);
   public static final exe<ewo> D = a("copy_state", ewo.a);
   public static final exe<exj> E = a("set_banner_pattern", exj.a);
   public static final exe<eya> F = a("set_potion", eya.a);
   public static final exe<ext> G = a("set_instrument", ext.a);
   public static final exe<ewy> H = a("reference", ewy.a);
   public static final exe<exh> I = a("sequence", exh.a);
   public static final exe<ewp> J = a("copy_components", ewp.a);
   public static final exe<exs> K = a("set_fireworks", exs.a);
   public static final exe<exr> L = a("set_firework_explosion", exr.a);
   public static final exe<exk> M = a("set_book_cover", exk.a);
   public static final exe<eyd> N = a("set_written_book_pages", eyd.b);
   public static final exe<eyc> O = a("set_writable_book_pages", eyc.a);
   public static final exe<eyf> P = a("toggle_tooltips", eyf.a);
   public static final exe<exz> Q = a("set_ominous_bottle_amplifier", exz.a);
   public static final exe<exp> R = a("set_custom_model_data", exp.a);

   private static <T extends exd> exe<T> a(String $$0, MapCodec<T> $$1) {
      return ke.a(mb.E, aku.b($$0), new exe<>($$1));
   }

   public static BiFunction<cwn, evp, cwn> a(List<? extends BiFunction<cwn, evp, cwn>> $$0) {
      List<BiFunction<cwn, evp, cwn>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cwn, evp, cwn> $$2 = $$1.get(0);
            BiFunction<cwn, evp, cwn> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cwn, evp, cwn> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

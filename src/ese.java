import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class ese {
   public static final BiFunction<cua, eqo, cua> a = ($$0, $$1) -> $$0;
   public static final Codec<esc> b = lq.E.r().dispatch("function", esc::b, esd::a);
   public static final Codec<esc> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, esg.b));
   public static final Codec<jj<esc>> d = akg.a(lr.bc, c);
   public static final esd<est> e = a("set_count", est.a);
   public static final esd<esv> f = a("set_item", esv.a);
   public static final esd<ers> g = a("enchant_with_levels", ers.a);
   public static final esd<err> h = a("enchant_randomly", err.a);
   public static final esd<esp> i = a("set_enchantments", esp.a);
   public static final esd<esn> j = a("set_custom_data", esn.a);
   public static final esd<esk> k = a("set_components", esk.a);
   public static final esd<etd> l = a("furnace_smelt", etd.a);
   public static final esd<ert> m = a("enchanted_count_increase", ert.b);
   public static final esd<esu> n = a("set_damage", esu.a);
   public static final esd<esh> o = a("set_attributes", esh.a);
   public static final esd<esx> p = a("set_name", esx.a);
   public static final esd<eru> q = a("exploration_map", eru.f);
   public static final esd<eta> r = a("set_stew_effect", eta.a);
   public static final esd<erq> s = a("copy_name", erq.a);
   public static final esd<esl> t = a("set_contents", esl.a);
   public static final esd<esf> u = a("modify_contents", esf.a);
   public static final esd<erw> v = a("filtered", erw.a);
   public static final esd<erz> w = a("limit_count", erz.a);
   public static final esd<erl> x = a("apply_bonus", erl.a);
   public static final esd<esm> y = a("set_loot_table", esm.a);
   public static final esd<erm> z = a("explosion_decay", erm.a);
   public static final esd<esw> A = a("set_lore", esw.a);
   public static final esd<erv> B = a("fill_player_head", erv.a);
   public static final esd<erp> C = a("copy_custom_data", erp.a);
   public static final esd<ern> D = a("copy_state", ern.a);
   public static final esd<esi> E = a("set_banner_pattern", esi.a);
   public static final esd<esz> F = a("set_potion", esz.a);
   public static final esd<ess> G = a("set_instrument", ess.a);
   public static final esd<erx> H = a("reference", erx.a);
   public static final esd<esg> I = a("sequence", esg.a);
   public static final esd<ero> J = a("copy_components", ero.a);
   public static final esd<esr> K = a("set_fireworks", esr.a);
   public static final esd<esq> L = a("set_firework_explosion", esq.a);
   public static final esd<esj> M = a("set_book_cover", esj.a);
   public static final esd<etc> N = a("set_written_book_pages", etc.b);
   public static final esd<etb> O = a("set_writable_book_pages", etb.a);
   public static final esd<ete> P = a("toggle_tooltips", ete.a);
   public static final esd<esy> Q = a("set_ominous_bottle_amplifier", esy.a);
   public static final esd<eso> R = a("set_custom_model_data", eso.a);

   private static <T extends esc> esd<T> a(String $$0, MapCodec<T> $$1) {
      return jw.a(lq.E, new akk($$0), new esd<>($$1));
   }

   public static BiFunction<cua, eqo, cua> a(List<? extends BiFunction<cua, eqo, cua>> $$0) {
      List<BiFunction<cua, eqo, cua>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cua, eqo, cua> $$2 = $$1.get(0);
            BiFunction<cua, eqo, cua> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cua, eqo, cua> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

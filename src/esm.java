import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class esm {
   public static final BiFunction<cud, eqw, cud> a = ($$0, $$1) -> $$0;
   public static final Codec<esk> b = lq.E.r().dispatch("function", esk::b, esl::a);
   public static final Codec<esk> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, eso.b));
   public static final Codec<jj<esk>> d = akg.a(lr.bc, c);
   public static final esl<etb> e = a("set_count", etb.a);
   public static final esl<etd> f = a("set_item", etd.a);
   public static final esl<esa> g = a("enchant_with_levels", esa.a);
   public static final esl<erz> h = a("enchant_randomly", erz.a);
   public static final esl<esx> i = a("set_enchantments", esx.a);
   public static final esl<esv> j = a("set_custom_data", esv.a);
   public static final esl<ess> k = a("set_components", ess.a);
   public static final esl<etl> l = a("furnace_smelt", etl.a);
   public static final esl<esb> m = a("enchanted_count_increase", esb.b);
   public static final esl<etc> n = a("set_damage", etc.a);
   public static final esl<esp> o = a("set_attributes", esp.a);
   public static final esl<etf> p = a("set_name", etf.a);
   public static final esl<esc> q = a("exploration_map", esc.f);
   public static final esl<eti> r = a("set_stew_effect", eti.a);
   public static final esl<ery> s = a("copy_name", ery.a);
   public static final esl<est> t = a("set_contents", est.a);
   public static final esl<esn> u = a("modify_contents", esn.a);
   public static final esl<ese> v = a("filtered", ese.a);
   public static final esl<esh> w = a("limit_count", esh.a);
   public static final esl<ert> x = a("apply_bonus", ert.a);
   public static final esl<esu> y = a("set_loot_table", esu.a);
   public static final esl<eru> z = a("explosion_decay", eru.a);
   public static final esl<ete> A = a("set_lore", ete.a);
   public static final esl<esd> B = a("fill_player_head", esd.a);
   public static final esl<erx> C = a("copy_custom_data", erx.a);
   public static final esl<erv> D = a("copy_state", erv.a);
   public static final esl<esq> E = a("set_banner_pattern", esq.a);
   public static final esl<eth> F = a("set_potion", eth.a);
   public static final esl<eta> G = a("set_instrument", eta.a);
   public static final esl<esf> H = a("reference", esf.a);
   public static final esl<eso> I = a("sequence", eso.a);
   public static final esl<erw> J = a("copy_components", erw.a);
   public static final esl<esz> K = a("set_fireworks", esz.a);
   public static final esl<esy> L = a("set_firework_explosion", esy.a);
   public static final esl<esr> M = a("set_book_cover", esr.a);
   public static final esl<etk> N = a("set_written_book_pages", etk.b);
   public static final esl<etj> O = a("set_writable_book_pages", etj.a);
   public static final esl<etm> P = a("toggle_tooltips", etm.a);
   public static final esl<etg> Q = a("set_ominous_bottle_amplifier", etg.a);
   public static final esl<esw> R = a("set_custom_model_data", esw.a);

   private static <T extends esk> esl<T> a(String $$0, MapCodec<T> $$1) {
      return jw.a(lq.E, new akk($$0), new esl<>($$1));
   }

   public static BiFunction<cud, eqw, cud> a(List<? extends BiFunction<cud, eqw, cud>> $$0) {
      List<BiFunction<cud, eqw, cud>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cud, eqw, cud> $$2 = $$1.get(0);
            BiFunction<cud, eqw, cud> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cud, eqw, cud> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

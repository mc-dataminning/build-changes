import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class esk {
   public static final BiFunction<cuc, equ, cuc> a = ($$0, $$1) -> $$0;
   public static final Codec<esi> b = lq.E.r().dispatch("function", esi::b, esj::a);
   public static final Codec<esi> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, esm.b));
   public static final Codec<jj<esi>> d = akg.a(lr.bc, c);
   public static final esj<esz> e = a("set_count", esz.a);
   public static final esj<etb> f = a("set_item", etb.a);
   public static final esj<ery> g = a("enchant_with_levels", ery.a);
   public static final esj<erx> h = a("enchant_randomly", erx.a);
   public static final esj<esv> i = a("set_enchantments", esv.a);
   public static final esj<est> j = a("set_custom_data", est.a);
   public static final esj<esq> k = a("set_components", esq.a);
   public static final esj<etj> l = a("furnace_smelt", etj.a);
   public static final esj<erz> m = a("enchanted_count_increase", erz.b);
   public static final esj<eta> n = a("set_damage", eta.a);
   public static final esj<esn> o = a("set_attributes", esn.a);
   public static final esj<etd> p = a("set_name", etd.a);
   public static final esj<esa> q = a("exploration_map", esa.f);
   public static final esj<etg> r = a("set_stew_effect", etg.a);
   public static final esj<erw> s = a("copy_name", erw.a);
   public static final esj<esr> t = a("set_contents", esr.a);
   public static final esj<esl> u = a("modify_contents", esl.a);
   public static final esj<esc> v = a("filtered", esc.a);
   public static final esj<esf> w = a("limit_count", esf.a);
   public static final esj<err> x = a("apply_bonus", err.a);
   public static final esj<ess> y = a("set_loot_table", ess.a);
   public static final esj<ers> z = a("explosion_decay", ers.a);
   public static final esj<etc> A = a("set_lore", etc.a);
   public static final esj<esb> B = a("fill_player_head", esb.a);
   public static final esj<erv> C = a("copy_custom_data", erv.a);
   public static final esj<ert> D = a("copy_state", ert.a);
   public static final esj<eso> E = a("set_banner_pattern", eso.a);
   public static final esj<etf> F = a("set_potion", etf.a);
   public static final esj<esy> G = a("set_instrument", esy.a);
   public static final esj<esd> H = a("reference", esd.a);
   public static final esj<esm> I = a("sequence", esm.a);
   public static final esj<eru> J = a("copy_components", eru.a);
   public static final esj<esx> K = a("set_fireworks", esx.a);
   public static final esj<esw> L = a("set_firework_explosion", esw.a);
   public static final esj<esp> M = a("set_book_cover", esp.a);
   public static final esj<eti> N = a("set_written_book_pages", eti.b);
   public static final esj<eth> O = a("set_writable_book_pages", eth.a);
   public static final esj<etk> P = a("toggle_tooltips", etk.a);
   public static final esj<ete> Q = a("set_ominous_bottle_amplifier", ete.a);
   public static final esj<esu> R = a("set_custom_model_data", esu.a);

   private static <T extends esi> esj<T> a(String $$0, MapCodec<T> $$1) {
      return jw.a(lq.E, new akk($$0), new esj<>($$1));
   }

   public static BiFunction<cuc, equ, cuc> a(List<? extends BiFunction<cuc, equ, cuc>> $$0) {
      List<BiFunction<cuc, equ, cuc>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cuc, equ, cuc> $$2 = $$1.get(0);
            BiFunction<cuc, equ, cuc> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cuc, equ, cuc> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class fad {
   public static final BiFunction<cys, eyn, cys> a = ($$0, $$1) -> $$0;
   public static final Codec<fab> b = mf.E.q().dispatch("function", fab::b, fac::a);
   public static final Codec<fab> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, faf.b));
   public static final Codec<je<fab>> d = ala.a(mg.bp, c);
   public static final fac<fas> e = a("set_count", fas.a);
   public static final fac<fau> f = a("set_item", fau.a);
   public static final fac<ezr> g = a("enchant_with_levels", ezr.a);
   public static final fac<ezq> h = a("enchant_randomly", ezq.a);
   public static final fac<fao> i = a("set_enchantments", fao.a);
   public static final fac<fam> j = a("set_custom_data", fam.a);
   public static final fac<faj> k = a("set_components", faj.a);
   public static final fac<fbc> l = a("furnace_smelt", fbc.a);
   public static final fac<ezs> m = a("enchanted_count_increase", ezs.b);
   public static final fac<fat> n = a("set_damage", fat.a);
   public static final fac<fag> o = a("set_attributes", fag.a);
   public static final fac<faw> p = a("set_name", faw.a);
   public static final fac<ezt> q = a("exploration_map", ezt.f);
   public static final fac<faz> r = a("set_stew_effect", faz.a);
   public static final fac<ezp> s = a("copy_name", ezp.a);
   public static final fac<fak> t = a("set_contents", fak.a);
   public static final fac<fae> u = a("modify_contents", fae.a);
   public static final fac<ezv> v = a("filtered", ezv.a);
   public static final fac<ezy> w = a("limit_count", ezy.a);
   public static final fac<ezk> x = a("apply_bonus", ezk.a);
   public static final fac<fal> y = a("set_loot_table", fal.a);
   public static final fac<ezl> z = a("explosion_decay", ezl.a);
   public static final fac<fav> A = a("set_lore", fav.a);
   public static final fac<ezu> B = a("fill_player_head", ezu.a);
   public static final fac<ezo> C = a("copy_custom_data", ezo.a);
   public static final fac<ezm> D = a("copy_state", ezm.a);
   public static final fac<fah> E = a("set_banner_pattern", fah.a);
   public static final fac<fay> F = a("set_potion", fay.a);
   public static final fac<far> G = a("set_instrument", far.a);
   public static final fac<ezw> H = a("reference", ezw.a);
   public static final fac<faf> I = a("sequence", faf.a);
   public static final fac<ezn> J = a("copy_components", ezn.a);
   public static final fac<faq> K = a("set_fireworks", faq.a);
   public static final fac<fap> L = a("set_firework_explosion", fap.a);
   public static final fac<fai> M = a("set_book_cover", fai.a);
   public static final fac<fbb> N = a("set_written_book_pages", fbb.a);
   public static final fac<fba> O = a("set_writable_book_pages", fba.a);
   public static final fac<fbd> P = a("toggle_tooltips", fbd.a);
   public static final fac<fax> Q = a("set_ominous_bottle_amplifier", fax.a);
   public static final fac<fan> R = a("set_custom_model_data", fan.a);

   private static <T extends fab> fac<T> a(String $$0, MapCodec<T> $$1) {
      return jr.a(mf.E, ale.b($$0), new fac<>($$1));
   }

   public static BiFunction<cys, eyn, cys> a(List<? extends BiFunction<cys, eyn, cys>> $$0) {
      List<BiFunction<cys, eyn, cys>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cys, eyn, cys> $$2 = $$1.get(0);
            BiFunction<cys, eyn, cys> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cys, eyn, cys> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

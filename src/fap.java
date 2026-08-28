import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class fap {
   public static final BiFunction<cyy, eyz, cyy> a = ($$0, $$1) -> $$0;
   public static final Codec<fan> b = mf.E.q().dispatch("function", fan::b, fao::a);
   public static final Codec<fan> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, far.b));
   public static final Codec<je<fan>> d = alc.a(mg.bq, c);
   public static final fao<fbe> e = a("set_count", fbe.a);
   public static final fao<fbg> f = a("set_item", fbg.a);
   public static final fao<fad> g = a("enchant_with_levels", fad.a);
   public static final fao<fac> h = a("enchant_randomly", fac.a);
   public static final fao<fba> i = a("set_enchantments", fba.a);
   public static final fao<fay> j = a("set_custom_data", fay.a);
   public static final fao<fav> k = a("set_components", fav.a);
   public static final fao<fbo> l = a("furnace_smelt", fbo.a);
   public static final fao<fae> m = a("enchanted_count_increase", fae.b);
   public static final fao<fbf> n = a("set_damage", fbf.a);
   public static final fao<fas> o = a("set_attributes", fas.a);
   public static final fao<fbi> p = a("set_name", fbi.a);
   public static final fao<faf> q = a("exploration_map", faf.f);
   public static final fao<fbl> r = a("set_stew_effect", fbl.a);
   public static final fao<fab> s = a("copy_name", fab.a);
   public static final fao<faw> t = a("set_contents", faw.a);
   public static final fao<faq> u = a("modify_contents", faq.a);
   public static final fao<fah> v = a("filtered", fah.a);
   public static final fao<fak> w = a("limit_count", fak.a);
   public static final fao<ezw> x = a("apply_bonus", ezw.a);
   public static final fao<fax> y = a("set_loot_table", fax.a);
   public static final fao<ezx> z = a("explosion_decay", ezx.a);
   public static final fao<fbh> A = a("set_lore", fbh.a);
   public static final fao<fag> B = a("fill_player_head", fag.a);
   public static final fao<faa> C = a("copy_custom_data", faa.a);
   public static final fao<ezy> D = a("copy_state", ezy.a);
   public static final fao<fat> E = a("set_banner_pattern", fat.a);
   public static final fao<fbk> F = a("set_potion", fbk.a);
   public static final fao<fbd> G = a("set_instrument", fbd.a);
   public static final fao<fai> H = a("reference", fai.a);
   public static final fao<far> I = a("sequence", far.a);
   public static final fao<ezz> J = a("copy_components", ezz.a);
   public static final fao<fbc> K = a("set_fireworks", fbc.a);
   public static final fao<fbb> L = a("set_firework_explosion", fbb.a);
   public static final fao<fau> M = a("set_book_cover", fau.a);
   public static final fao<fbn> N = a("set_written_book_pages", fbn.a);
   public static final fao<fbm> O = a("set_writable_book_pages", fbm.a);
   public static final fao<fbp> P = a("toggle_tooltips", fbp.a);
   public static final fao<fbj> Q = a("set_ominous_bottle_amplifier", fbj.a);
   public static final fao<faz> R = a("set_custom_model_data", faz.a);

   private static <T extends fan> fao<T> a(String $$0, MapCodec<T> $$1) {
      return jr.a(mf.E, alg.b($$0), new fao<>($$1));
   }

   public static BiFunction<cyy, eyz, cyy> a(List<? extends BiFunction<cyy, eyz, cyy>> $$0) {
      List<BiFunction<cyy, eyz, cyy>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cyy, eyz, cyy> $$2 = $$1.get(0);
            BiFunction<cyy, eyz, cyy> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cyy, eyz, cyy> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

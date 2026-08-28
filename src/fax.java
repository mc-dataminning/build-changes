import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class fax {
   public static final BiFunction<czd, ezh, czd> a = ($$0, $$1) -> $$0;
   public static final Codec<fav> b = mf.E.q().dispatch("function", fav::b, faw::a);
   public static final Codec<fav> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, faz.b));
   public static final Codec<je<fav>> d = alc.a(mg.br, c);
   public static final faw<fbm> e = a("set_count", fbm.a);
   public static final faw<fbo> f = a("set_item", fbo.a);
   public static final faw<fal> g = a("enchant_with_levels", fal.a);
   public static final faw<fak> h = a("enchant_randomly", fak.a);
   public static final faw<fbi> i = a("set_enchantments", fbi.a);
   public static final faw<fbg> j = a("set_custom_data", fbg.a);
   public static final faw<fbd> k = a("set_components", fbd.a);
   public static final faw<fbw> l = a("furnace_smelt", fbw.a);
   public static final faw<fam> m = a("enchanted_count_increase", fam.b);
   public static final faw<fbn> n = a("set_damage", fbn.a);
   public static final faw<fba> o = a("set_attributes", fba.a);
   public static final faw<fbq> p = a("set_name", fbq.a);
   public static final faw<fan> q = a("exploration_map", fan.f);
   public static final faw<fbt> r = a("set_stew_effect", fbt.a);
   public static final faw<faj> s = a("copy_name", faj.a);
   public static final faw<fbe> t = a("set_contents", fbe.a);
   public static final faw<fay> u = a("modify_contents", fay.a);
   public static final faw<fap> v = a("filtered", fap.a);
   public static final faw<fas> w = a("limit_count", fas.a);
   public static final faw<fae> x = a("apply_bonus", fae.a);
   public static final faw<fbf> y = a("set_loot_table", fbf.a);
   public static final faw<faf> z = a("explosion_decay", faf.a);
   public static final faw<fbp> A = a("set_lore", fbp.a);
   public static final faw<fao> B = a("fill_player_head", fao.a);
   public static final faw<fai> C = a("copy_custom_data", fai.a);
   public static final faw<fag> D = a("copy_state", fag.a);
   public static final faw<fbb> E = a("set_banner_pattern", fbb.a);
   public static final faw<fbs> F = a("set_potion", fbs.a);
   public static final faw<fbl> G = a("set_instrument", fbl.a);
   public static final faw<faq> H = a("reference", faq.a);
   public static final faw<faz> I = a("sequence", faz.a);
   public static final faw<fah> J = a("copy_components", fah.a);
   public static final faw<fbk> K = a("set_fireworks", fbk.a);
   public static final faw<fbj> L = a("set_firework_explosion", fbj.a);
   public static final faw<fbc> M = a("set_book_cover", fbc.a);
   public static final faw<fbv> N = a("set_written_book_pages", fbv.a);
   public static final faw<fbu> O = a("set_writable_book_pages", fbu.a);
   public static final faw<fbx> P = a("toggle_tooltips", fbx.a);
   public static final faw<fbr> Q = a("set_ominous_bottle_amplifier", fbr.a);
   public static final faw<fbh> R = a("set_custom_model_data", fbh.a);

   private static <T extends fav> faw<T> a(String $$0, MapCodec<T> $$1) {
      return jr.a(mf.E, alg.b($$0), new faw<>($$1));
   }

   public static BiFunction<czd, ezh, czd> a(List<? extends BiFunction<czd, ezh, czd>> $$0) {
      List<BiFunction<czd, ezh, czd>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<czd, ezh, czd> $$2 = $$1.get(0);
            BiFunction<czd, ezh, czd> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<czd, ezh, czd> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class fbe {
   public static final BiFunction<czk, ezo, czk> a = ($$0, $$1) -> $$0;
   public static final Codec<fbc> b = mg.E.q().dispatch("function", fbc::b, fbd::a);
   public static final Codec<fbc> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, fbg.b));
   public static final Codec<jf<fbc>> d = alc.a(mh.br, c);
   public static final fbd<fbt> e = a("set_count", fbt.a);
   public static final fbd<fbv> f = a("set_item", fbv.a);
   public static final fbd<fas> g = a("enchant_with_levels", fas.a);
   public static final fbd<far> h = a("enchant_randomly", far.a);
   public static final fbd<fbp> i = a("set_enchantments", fbp.a);
   public static final fbd<fbn> j = a("set_custom_data", fbn.a);
   public static final fbd<fbk> k = a("set_components", fbk.a);
   public static final fbd<fcd> l = a("furnace_smelt", fcd.a);
   public static final fbd<fat> m = a("enchanted_count_increase", fat.b);
   public static final fbd<fbu> n = a("set_damage", fbu.a);
   public static final fbd<fbh> o = a("set_attributes", fbh.a);
   public static final fbd<fbx> p = a("set_name", fbx.a);
   public static final fbd<fau> q = a("exploration_map", fau.f);
   public static final fbd<fca> r = a("set_stew_effect", fca.a);
   public static final fbd<faq> s = a("copy_name", faq.a);
   public static final fbd<fbl> t = a("set_contents", fbl.a);
   public static final fbd<fbf> u = a("modify_contents", fbf.a);
   public static final fbd<faw> v = a("filtered", faw.a);
   public static final fbd<faz> w = a("limit_count", faz.a);
   public static final fbd<fal> x = a("apply_bonus", fal.a);
   public static final fbd<fbm> y = a("set_loot_table", fbm.a);
   public static final fbd<fam> z = a("explosion_decay", fam.a);
   public static final fbd<fbw> A = a("set_lore", fbw.a);
   public static final fbd<fav> B = a("fill_player_head", fav.a);
   public static final fbd<fap> C = a("copy_custom_data", fap.a);
   public static final fbd<fan> D = a("copy_state", fan.a);
   public static final fbd<fbi> E = a("set_banner_pattern", fbi.a);
   public static final fbd<fbz> F = a("set_potion", fbz.a);
   public static final fbd<fbs> G = a("set_instrument", fbs.a);
   public static final fbd<fax> H = a("reference", fax.a);
   public static final fbd<fbg> I = a("sequence", fbg.a);
   public static final fbd<fao> J = a("copy_components", fao.a);
   public static final fbd<fbr> K = a("set_fireworks", fbr.a);
   public static final fbd<fbq> L = a("set_firework_explosion", fbq.a);
   public static final fbd<fbj> M = a("set_book_cover", fbj.a);
   public static final fbd<fcc> N = a("set_written_book_pages", fcc.a);
   public static final fbd<fcb> O = a("set_writable_book_pages", fcb.a);
   public static final fbd<fce> P = a("toggle_tooltips", fce.a);
   public static final fbd<fby> Q = a("set_ominous_bottle_amplifier", fby.a);
   public static final fbd<fbo> R = a("set_custom_model_data", fbo.a);

   private static <T extends fbc> fbd<T> a(String $$0, MapCodec<T> $$1) {
      return js.a(mg.E, alg.b($$0), new fbd<>($$1));
   }

   public static BiFunction<czk, ezo, czk> a(List<? extends BiFunction<czk, ezo, czk>> $$0) {
      List<BiFunction<czk, ezo, czk>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<czk, ezo, czk> $$2 = $$1.get(0);
            BiFunction<czk, ezo, czk> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<czk, ezo, czk> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

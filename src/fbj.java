import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class fbj {
   public static final BiFunction<czn, ezt, czn> a = ($$0, $$1) -> $$0;
   public static final Codec<fbh> b = mg.E.q().dispatch("function", fbh::b, fbi::a);
   public static final Codec<fbh> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, fbl.b));
   public static final Codec<jf<fbh>> d = alc.a(mh.bs, c);
   public static final fbi<fby> e = a("set_count", fby.a);
   public static final fbi<fca> f = a("set_item", fca.a);
   public static final fbi<fax> g = a("enchant_with_levels", fax.a);
   public static final fbi<faw> h = a("enchant_randomly", faw.a);
   public static final fbi<fbu> i = a("set_enchantments", fbu.a);
   public static final fbi<fbs> j = a("set_custom_data", fbs.a);
   public static final fbi<fbp> k = a("set_components", fbp.a);
   public static final fbi<fci> l = a("furnace_smelt", fci.a);
   public static final fbi<fay> m = a("enchanted_count_increase", fay.b);
   public static final fbi<fbz> n = a("set_damage", fbz.a);
   public static final fbi<fbm> o = a("set_attributes", fbm.a);
   public static final fbi<fcc> p = a("set_name", fcc.a);
   public static final fbi<faz> q = a("exploration_map", faz.f);
   public static final fbi<fcf> r = a("set_stew_effect", fcf.a);
   public static final fbi<fav> s = a("copy_name", fav.a);
   public static final fbi<fbq> t = a("set_contents", fbq.a);
   public static final fbi<fbk> u = a("modify_contents", fbk.a);
   public static final fbi<fbb> v = a("filtered", fbb.a);
   public static final fbi<fbe> w = a("limit_count", fbe.a);
   public static final fbi<faq> x = a("apply_bonus", faq.a);
   public static final fbi<fbr> y = a("set_loot_table", fbr.a);
   public static final fbi<far> z = a("explosion_decay", far.a);
   public static final fbi<fcb> A = a("set_lore", fcb.a);
   public static final fbi<fba> B = a("fill_player_head", fba.a);
   public static final fbi<fau> C = a("copy_custom_data", fau.a);
   public static final fbi<fas> D = a("copy_state", fas.a);
   public static final fbi<fbn> E = a("set_banner_pattern", fbn.a);
   public static final fbi<fce> F = a("set_potion", fce.a);
   public static final fbi<fbx> G = a("set_instrument", fbx.a);
   public static final fbi<fbc> H = a("reference", fbc.a);
   public static final fbi<fbl> I = a("sequence", fbl.a);
   public static final fbi<fat> J = a("copy_components", fat.a);
   public static final fbi<fbw> K = a("set_fireworks", fbw.a);
   public static final fbi<fbv> L = a("set_firework_explosion", fbv.a);
   public static final fbi<fbo> M = a("set_book_cover", fbo.a);
   public static final fbi<fch> N = a("set_written_book_pages", fch.a);
   public static final fbi<fcg> O = a("set_writable_book_pages", fcg.a);
   public static final fbi<fcj> P = a("toggle_tooltips", fcj.a);
   public static final fbi<fcd> Q = a("set_ominous_bottle_amplifier", fcd.a);
   public static final fbi<fbt> R = a("set_custom_model_data", fbt.a);

   private static <T extends fbh> fbi<T> a(String $$0, MapCodec<T> $$1) {
      return js.a(mg.E, alg.b($$0), new fbi<>($$1));
   }

   public static BiFunction<czn, ezt, czn> a(List<? extends BiFunction<czn, ezt, czn>> $$0) {
      List<BiFunction<czn, ezt, czn>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<czn, ezt, czn> $$2 = $$1.get(0);
            BiFunction<czn, ezt, czn> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<czn, ezt, czn> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

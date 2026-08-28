import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class fbx {
   public static final BiFunction<czy, fah, czy> a = ($$0, $$1) -> $$0;
   public static final Codec<fbv> b = mg.E.q().dispatch("function", fbv::b, fbw::a);
   public static final Codec<fbv> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, fbz.b));
   public static final Codec<jf<fbv>> d = ale.a(mh.bs, c);
   public static final fbw<fcm> e = a("set_count", fcm.a);
   public static final fbw<fco> f = a("set_item", fco.a);
   public static final fbw<fbl> g = a("enchant_with_levels", fbl.a);
   public static final fbw<fbk> h = a("enchant_randomly", fbk.a);
   public static final fbw<fci> i = a("set_enchantments", fci.a);
   public static final fbw<fcg> j = a("set_custom_data", fcg.a);
   public static final fbw<fcd> k = a("set_components", fcd.a);
   public static final fbw<fcw> l = a("furnace_smelt", fcw.a);
   public static final fbw<fbm> m = a("enchanted_count_increase", fbm.b);
   public static final fbw<fcn> n = a("set_damage", fcn.a);
   public static final fbw<fca> o = a("set_attributes", fca.a);
   public static final fbw<fcq> p = a("set_name", fcq.a);
   public static final fbw<fbn> q = a("exploration_map", fbn.f);
   public static final fbw<fct> r = a("set_stew_effect", fct.a);
   public static final fbw<fbj> s = a("copy_name", fbj.a);
   public static final fbw<fce> t = a("set_contents", fce.a);
   public static final fbw<fby> u = a("modify_contents", fby.a);
   public static final fbw<fbp> v = a("filtered", fbp.a);
   public static final fbw<fbs> w = a("limit_count", fbs.a);
   public static final fbw<fbe> x = a("apply_bonus", fbe.a);
   public static final fbw<fcf> y = a("set_loot_table", fcf.a);
   public static final fbw<fbf> z = a("explosion_decay", fbf.a);
   public static final fbw<fcp> A = a("set_lore", fcp.a);
   public static final fbw<fbo> B = a("fill_player_head", fbo.a);
   public static final fbw<fbi> C = a("copy_custom_data", fbi.a);
   public static final fbw<fbg> D = a("copy_state", fbg.a);
   public static final fbw<fcb> E = a("set_banner_pattern", fcb.a);
   public static final fbw<fcs> F = a("set_potion", fcs.a);
   public static final fbw<fcl> G = a("set_instrument", fcl.a);
   public static final fbw<fbq> H = a("reference", fbq.a);
   public static final fbw<fbz> I = a("sequence", fbz.a);
   public static final fbw<fbh> J = a("copy_components", fbh.a);
   public static final fbw<fck> K = a("set_fireworks", fck.a);
   public static final fbw<fcj> L = a("set_firework_explosion", fcj.a);
   public static final fbw<fcc> M = a("set_book_cover", fcc.a);
   public static final fbw<fcv> N = a("set_written_book_pages", fcv.a);
   public static final fbw<fcu> O = a("set_writable_book_pages", fcu.a);
   public static final fbw<fcx> P = a("toggle_tooltips", fcx.a);
   public static final fbw<fcr> Q = a("set_ominous_bottle_amplifier", fcr.a);
   public static final fbw<fch> R = a("set_custom_model_data", fch.a);

   private static <T extends fbv> fbw<T> a(String $$0, MapCodec<T> $$1) {
      return js.a(mg.E, ali.b($$0), new fbw<>($$1));
   }

   public static BiFunction<czy, fah, czy> a(List<? extends BiFunction<czy, fah, czy>> $$0) {
      List<BiFunction<czy, fah, czy>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<czy, fah, czy> $$2 = $$1.get(0);
            BiFunction<czy, fah, czy> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<czy, fah, czy> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

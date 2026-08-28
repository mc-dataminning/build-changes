import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class fbz {
   public static final BiFunction<daa, faj, daa> a = ($$0, $$1) -> $$0;
   public static final Codec<fbx> b = mh.E.q().dispatch("function", fbx::b, fby::a);
   public static final Codec<fbx> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, fcb.b));
   public static final Codec<jg<fbx>> d = alg.a(mi.bs, c);
   public static final fby<fco> e = a("set_count", fco.a);
   public static final fby<fcq> f = a("set_item", fcq.a);
   public static final fby<fbn> g = a("enchant_with_levels", fbn.a);
   public static final fby<fbm> h = a("enchant_randomly", fbm.a);
   public static final fby<fck> i = a("set_enchantments", fck.a);
   public static final fby<fci> j = a("set_custom_data", fci.a);
   public static final fby<fcf> k = a("set_components", fcf.a);
   public static final fby<fcy> l = a("furnace_smelt", fcy.a);
   public static final fby<fbo> m = a("enchanted_count_increase", fbo.b);
   public static final fby<fcp> n = a("set_damage", fcp.a);
   public static final fby<fcc> o = a("set_attributes", fcc.a);
   public static final fby<fcs> p = a("set_name", fcs.a);
   public static final fby<fbp> q = a("exploration_map", fbp.f);
   public static final fby<fcv> r = a("set_stew_effect", fcv.a);
   public static final fby<fbl> s = a("copy_name", fbl.a);
   public static final fby<fcg> t = a("set_contents", fcg.a);
   public static final fby<fca> u = a("modify_contents", fca.a);
   public static final fby<fbr> v = a("filtered", fbr.a);
   public static final fby<fbu> w = a("limit_count", fbu.a);
   public static final fby<fbg> x = a("apply_bonus", fbg.a);
   public static final fby<fch> y = a("set_loot_table", fch.a);
   public static final fby<fbh> z = a("explosion_decay", fbh.a);
   public static final fby<fcr> A = a("set_lore", fcr.a);
   public static final fby<fbq> B = a("fill_player_head", fbq.a);
   public static final fby<fbk> C = a("copy_custom_data", fbk.a);
   public static final fby<fbi> D = a("copy_state", fbi.a);
   public static final fby<fcd> E = a("set_banner_pattern", fcd.a);
   public static final fby<fcu> F = a("set_potion", fcu.a);
   public static final fby<fcn> G = a("set_instrument", fcn.a);
   public static final fby<fbs> H = a("reference", fbs.a);
   public static final fby<fcb> I = a("sequence", fcb.a);
   public static final fby<fbj> J = a("copy_components", fbj.a);
   public static final fby<fcm> K = a("set_fireworks", fcm.a);
   public static final fby<fcl> L = a("set_firework_explosion", fcl.a);
   public static final fby<fce> M = a("set_book_cover", fce.a);
   public static final fby<fcx> N = a("set_written_book_pages", fcx.a);
   public static final fby<fcw> O = a("set_writable_book_pages", fcw.a);
   public static final fby<fcz> P = a("toggle_tooltips", fcz.a);
   public static final fby<fct> Q = a("set_ominous_bottle_amplifier", fct.a);
   public static final fby<fcj> R = a("set_custom_model_data", fcj.a);

   private static <T extends fbx> fby<T> a(String $$0, MapCodec<T> $$1) {
      return jt.a(mh.E, alk.b($$0), new fby<>($$1));
   }

   public static BiFunction<daa, faj, daa> a(List<? extends BiFunction<daa, faj, daa>> $$0) {
      List<BiFunction<daa, faj, daa>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<daa, faj, daa> $$2 = $$1.get(0);
            BiFunction<daa, faj, daa> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<daa, faj, daa> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

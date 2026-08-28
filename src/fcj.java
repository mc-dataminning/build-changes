import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class fcj {
   public static final BiFunction<dak, fat, dak> a = ($$0, $$1) -> $$0;
   public static final Codec<fch> b = mh.E.q().dispatch("function", fch::b, fci::a);
   public static final Codec<fch> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, fcl.b));
   public static final Codec<jg<fch>> d = aln.a(mi.bs, c);
   public static final fci<fcy> e = a("set_count", fcy.a);
   public static final fci<fda> f = a("set_item", fda.a);
   public static final fci<fbx> g = a("enchant_with_levels", fbx.a);
   public static final fci<fbw> h = a("enchant_randomly", fbw.a);
   public static final fci<fcu> i = a("set_enchantments", fcu.a);
   public static final fci<fcs> j = a("set_custom_data", fcs.a);
   public static final fci<fcp> k = a("set_components", fcp.a);
   public static final fci<fdi> l = a("furnace_smelt", fdi.a);
   public static final fci<fby> m = a("enchanted_count_increase", fby.b);
   public static final fci<fcz> n = a("set_damage", fcz.a);
   public static final fci<fcm> o = a("set_attributes", fcm.a);
   public static final fci<fdc> p = a("set_name", fdc.a);
   public static final fci<fbz> q = a("exploration_map", fbz.f);
   public static final fci<fdf> r = a("set_stew_effect", fdf.a);
   public static final fci<fbv> s = a("copy_name", fbv.a);
   public static final fci<fcq> t = a("set_contents", fcq.a);
   public static final fci<fck> u = a("modify_contents", fck.a);
   public static final fci<fcb> v = a("filtered", fcb.a);
   public static final fci<fce> w = a("limit_count", fce.a);
   public static final fci<fbq> x = a("apply_bonus", fbq.a);
   public static final fci<fcr> y = a("set_loot_table", fcr.a);
   public static final fci<fbr> z = a("explosion_decay", fbr.a);
   public static final fci<fdb> A = a("set_lore", fdb.a);
   public static final fci<fca> B = a("fill_player_head", fca.a);
   public static final fci<fbu> C = a("copy_custom_data", fbu.a);
   public static final fci<fbs> D = a("copy_state", fbs.a);
   public static final fci<fcn> E = a("set_banner_pattern", fcn.a);
   public static final fci<fde> F = a("set_potion", fde.a);
   public static final fci<fcx> G = a("set_instrument", fcx.a);
   public static final fci<fcc> H = a("reference", fcc.a);
   public static final fci<fcl> I = a("sequence", fcl.a);
   public static final fci<fbt> J = a("copy_components", fbt.a);
   public static final fci<fcw> K = a("set_fireworks", fcw.a);
   public static final fci<fcv> L = a("set_firework_explosion", fcv.a);
   public static final fci<fco> M = a("set_book_cover", fco.a);
   public static final fci<fdh> N = a("set_written_book_pages", fdh.a);
   public static final fci<fdg> O = a("set_writable_book_pages", fdg.a);
   public static final fci<fdj> P = a("toggle_tooltips", fdj.a);
   public static final fci<fdd> Q = a("set_ominous_bottle_amplifier", fdd.a);
   public static final fci<fct> R = a("set_custom_model_data", fct.a);

   private static <T extends fch> fci<T> a(String $$0, MapCodec<T> $$1) {
      return jt.a(mh.E, alr.b($$0), new fci<>($$1));
   }

   public static BiFunction<dak, fat, dak> a(List<? extends BiFunction<dak, fat, dak>> $$0) {
      List<BiFunction<dak, fat, dak>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<dak, fat, dak> $$2 = $$1.get(0);
            BiFunction<dak, fat, dak> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<dak, fat, dak> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

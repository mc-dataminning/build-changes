import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class epz {
   public static final BiFunction<csz, eol, csz> a = ($$0, $$1) -> $$0;
   public static final Codec<epx> b = ld.G.q().dispatch("function", epx::b, epy::a);
   public static final Codec<epx> c = axh.a((Supplier<Codec<epx>>)(() -> axh.e(b, eqb.b)));
   public static final Codec<iw<epx>> d = akd.a(le.aV, c);
   public static final epy e = a("set_count", eqn.a);
   public static final epy f = a("enchant_with_levels", epp.a);
   public static final epy g = a("enchant_randomly", epo.a);
   public static final epy h = a("set_enchantments", eqj.a);
   public static final epy i = a("set_custom_data", eqi.a);
   public static final epy j = a("set_components", eqf.a);
   public static final epy k = a("furnace_smelt", eqv.a);
   public static final epy l = a("looting_enchant", eqa.b);
   public static final epy m = a("set_damage", eqo.a);
   public static final epy n = a("set_attributes", eqc.a);
   public static final epy o = a("set_name", eqq.a);
   public static final epy p = a("exploration_map", epq.f);
   public static final epy q = a("set_stew_effect", eqs.a);
   public static final epy r = a("copy_name", epn.a);
   public static final epy s = a("set_contents", eqg.a);
   public static final epy t = a("limit_count", epu.a);
   public static final epy u = a("apply_bonus", epi.a);
   public static final epy v = a("set_loot_table", eqh.a);
   public static final epy w = a("explosion_decay", epj.a);
   public static final epy x = a("set_lore", eqp.a);
   public static final epy y = a("fill_player_head", epr.a);
   public static final epy z = a("copy_custom_data", epm.a);
   public static final epy A = a("copy_state", epk.a);
   public static final epy B = a("set_banner_pattern", eqd.a);
   public static final epy C = a("set_potion", eqr.a);
   public static final epy D = a("set_instrument", eqm.a);
   public static final epy E = a("reference", eps.a);
   public static final epy F = a("sequence", eqb.a);
   public static final epy G = a("copy_components", epl.a);
   public static final epy H = a("set_fireworks", eql.a);
   public static final epy I = a("set_firework_explosion", eqk.a);
   public static final epy J = a("set_book_cover", eqe.a);
   public static final epy K = a("set_written_book_pages", equ.b);
   public static final epy L = a("set_writable_book_pages", eqt.a);
   public static final epy M = a("toggle_tooltips", eqw.a);

   private static epy a(String $$0, Codec<? extends epx> $$1) {
      return jj.a(ld.G, new akh($$0), new epy($$1));
   }

   public static BiFunction<csz, eol, csz> a(List<? extends BiFunction<csz, eol, csz>> $$0) {
      List<BiFunction<csz, eol, csz>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<csz, eol, csz> $$2 = $$1.get(0);
            BiFunction<csz, eol, csz> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<csz, eol, csz> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

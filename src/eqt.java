import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class eqt {
   public static final BiFunction<cto, epf, cto> a = ($$0, $$1) -> $$0;
   public static final Codec<eqr> b = le.G.q().dispatch("function", eqr::b, eqs::a);
   public static final Codec<eqr> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, eqv.b));
   public static final Codec<ix<eqr>> d = aki.a(lf.aV, c);
   public static final eqs e = a("set_count", erh.a);
   public static final eqs f = a("enchant_with_levels", eqj.a);
   public static final eqs g = a("enchant_randomly", eqi.a);
   public static final eqs h = a("set_enchantments", erd.a);
   public static final eqs i = a("set_custom_data", erc.a);
   public static final eqs j = a("set_components", eqz.a);
   public static final eqs k = a("furnace_smelt", erq.a);
   public static final eqs l = a("looting_enchant", equ.b);
   public static final eqs m = a("set_damage", eri.a);
   public static final eqs n = a("set_attributes", eqw.a);
   public static final eqs o = a("set_name", erk.a);
   public static final eqs p = a("exploration_map", eqk.f);
   public static final eqs q = a("set_stew_effect", ern.a);
   public static final eqs r = a("copy_name", eqh.a);
   public static final eqs s = a("set_contents", era.a);
   public static final eqs t = a("limit_count", eqo.a);
   public static final eqs u = a("apply_bonus", eqc.a);
   public static final eqs v = a("set_loot_table", erb.a);
   public static final eqs w = a("explosion_decay", eqd.a);
   public static final eqs x = a("set_lore", erj.a);
   public static final eqs y = a("fill_player_head", eql.a);
   public static final eqs z = a("copy_custom_data", eqg.a);
   public static final eqs A = a("copy_state", eqe.a);
   public static final eqs B = a("set_banner_pattern", eqx.a);
   public static final eqs C = a("set_potion", erm.a);
   public static final eqs D = a("set_instrument", erg.a);
   public static final eqs E = a("reference", eqm.a);
   public static final eqs F = a("sequence", eqv.a);
   public static final eqs G = a("copy_components", eqf.a);
   public static final eqs H = a("set_fireworks", erf.a);
   public static final eqs I = a("set_firework_explosion", ere.a);
   public static final eqs J = a("set_book_cover", eqy.a);
   public static final eqs K = a("set_written_book_pages", erp.b);
   public static final eqs L = a("set_writable_book_pages", ero.a);
   public static final eqs M = a("toggle_tooltips", err.a);
   public static final eqs N = a("set_ominous_bottle_amplifier", erl.a);

   private static eqs a(String $$0, MapCodec<? extends eqr> $$1) {
      return jk.a(le.G, new akm($$0), new eqs($$1));
   }

   public static BiFunction<cto, epf, cto> a(List<? extends BiFunction<cto, epf, cto>> $$0) {
      List<BiFunction<cto, epf, cto>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cto, epf, cto> $$2 = $$1.get(0);
            BiFunction<cto, epf, cto> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cto, epf, cto> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

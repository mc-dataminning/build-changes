import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class eqv {
   public static final BiFunction<ctq, eph, ctq> a = ($$0, $$1) -> $$0;
   public static final Codec<eqt> b = le.G.q().dispatch("function", eqt::b, equ::a);
   public static final Codec<eqt> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, eqx.b));
   public static final Codec<ix<eqt>> d = akj.a(lf.aV, c);
   public static final equ e = a("set_count", erj.a);
   public static final equ f = a("enchant_with_levels", eql.a);
   public static final equ g = a("enchant_randomly", eqk.a);
   public static final equ h = a("set_enchantments", erf.a);
   public static final equ i = a("set_custom_data", ere.a);
   public static final equ j = a("set_components", erb.a);
   public static final equ k = a("furnace_smelt", ers.a);
   public static final equ l = a("looting_enchant", eqw.b);
   public static final equ m = a("set_damage", erk.a);
   public static final equ n = a("set_attributes", eqy.a);
   public static final equ o = a("set_name", erm.a);
   public static final equ p = a("exploration_map", eqm.f);
   public static final equ q = a("set_stew_effect", erp.a);
   public static final equ r = a("copy_name", eqj.a);
   public static final equ s = a("set_contents", erc.a);
   public static final equ t = a("limit_count", eqq.a);
   public static final equ u = a("apply_bonus", eqe.a);
   public static final equ v = a("set_loot_table", erd.a);
   public static final equ w = a("explosion_decay", eqf.a);
   public static final equ x = a("set_lore", erl.a);
   public static final equ y = a("fill_player_head", eqn.a);
   public static final equ z = a("copy_custom_data", eqi.a);
   public static final equ A = a("copy_state", eqg.a);
   public static final equ B = a("set_banner_pattern", eqz.a);
   public static final equ C = a("set_potion", ero.a);
   public static final equ D = a("set_instrument", eri.a);
   public static final equ E = a("reference", eqo.a);
   public static final equ F = a("sequence", eqx.a);
   public static final equ G = a("copy_components", eqh.a);
   public static final equ H = a("set_fireworks", erh.a);
   public static final equ I = a("set_firework_explosion", erg.a);
   public static final equ J = a("set_book_cover", era.a);
   public static final equ K = a("set_written_book_pages", err.b);
   public static final equ L = a("set_writable_book_pages", erq.a);
   public static final equ M = a("toggle_tooltips", ert.a);
   public static final equ N = a("set_ominous_bottle_amplifier", ern.a);

   private static equ a(String $$0, MapCodec<? extends eqt> $$1) {
      return jk.a(le.G, new akn($$0), new equ($$1));
   }

   public static BiFunction<ctq, eph, ctq> a(List<? extends BiFunction<ctq, eph, ctq>> $$0) {
      List<BiFunction<ctq, eph, ctq>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<ctq, eph, ctq> $$2 = $$1.get(0);
            BiFunction<ctq, eph, ctq> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<ctq, eph, ctq> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

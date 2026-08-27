import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class eef {
   public static final BiFunction<cjf, ecq, cjf> a = ($$0, $$1) -> $$0;
   private static final Codec<eed> D = jd.H.q().dispatch("function", eed::b, eee::a);
   public static final Codec<eed> b = arg.a((Supplier<Codec<eed>>)(() -> arg.e(D, eeh.b)));
   public static final eee c = a("set_count", eeo.a);
   public static final eee d = a("enchant_with_levels", edw.a);
   public static final eee e = a("enchant_randomly", edv.a);
   public static final eee f = a("set_enchantments", eem.a);
   public static final eee g = a("set_nbt", ees.a);
   public static final eee h = a("furnace_smelt", eev.a);
   public static final eee i = a("looting_enchant", eeg.b);
   public static final eee j = a("set_damage", eep.a);
   public static final eee k = a("set_attributes", eei.a);
   public static final eee l = a("set_name", eer.a);
   public static final eee m = a("exploration_map", edx.f);
   public static final eee n = a("set_stew_effect", eeu.a);
   public static final eee o = a("copy_name", edt.a);
   public static final eee p = a("set_contents", eek.a);
   public static final eee q = a("limit_count", eeb.a);
   public static final eee r = a("apply_bonus", edq.a);
   public static final eee s = a("set_loot_table", eel.a);
   public static final eee t = a("explosion_decay", edr.a);
   public static final eee u = a("set_lore", eeq.a);
   public static final eee v = a("fill_player_head", edy.a);
   public static final eee w = a("copy_nbt", edu.a);
   public static final eee x = a("copy_state", eds.a);
   public static final eee y = a("set_banner_pattern", eej.a);
   public static final eee z = a("set_potion", eet.a);
   public static final eee A = a("set_instrument", een.a);
   public static final eee B = a("reference", edz.a);
   public static final eee C = a("sequence", eeh.a);

   private static eee a(String $$0, Codec<? extends eed> $$1) {
      return ht.a(jd.H, new aex($$0), new eee($$1));
   }

   public static BiFunction<cjf, ecq, cjf> a(List<? extends BiFunction<cjf, ecq, cjf>> $$0) {
      List<BiFunction<cjf, ecq, cjf>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cjf, ecq, cjf> $$2 = $$1.get(0);
            BiFunction<cjf, ecq, cjf> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cjf, ecq, cjf> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class eeh {
   public static final BiFunction<cjh, ecs, cjh> a = ($$0, $$1) -> $$0;
   private static final Codec<eef> D = jd.H.q().dispatch("function", eef::b, eeg::a);
   public static final Codec<eef> b = arh.a((Supplier<Codec<eef>>)(() -> arh.e(D, eej.b)));
   public static final eeg c = a("set_count", eeq.a);
   public static final eeg d = a("enchant_with_levels", edy.a);
   public static final eeg e = a("enchant_randomly", edx.a);
   public static final eeg f = a("set_enchantments", eeo.a);
   public static final eeg g = a("set_nbt", eeu.a);
   public static final eeg h = a("furnace_smelt", eex.a);
   public static final eeg i = a("looting_enchant", eei.b);
   public static final eeg j = a("set_damage", eer.a);
   public static final eeg k = a("set_attributes", eek.a);
   public static final eeg l = a("set_name", eet.a);
   public static final eeg m = a("exploration_map", edz.f);
   public static final eeg n = a("set_stew_effect", eew.a);
   public static final eeg o = a("copy_name", edv.a);
   public static final eeg p = a("set_contents", eem.a);
   public static final eeg q = a("limit_count", eed.a);
   public static final eeg r = a("apply_bonus", eds.a);
   public static final eeg s = a("set_loot_table", een.a);
   public static final eeg t = a("explosion_decay", edt.a);
   public static final eeg u = a("set_lore", ees.a);
   public static final eeg v = a("fill_player_head", eea.a);
   public static final eeg w = a("copy_nbt", edw.a);
   public static final eeg x = a("copy_state", edu.a);
   public static final eeg y = a("set_banner_pattern", eel.a);
   public static final eeg z = a("set_potion", eev.a);
   public static final eeg A = a("set_instrument", eep.a);
   public static final eeg B = a("reference", eeb.a);
   public static final eeg C = a("sequence", eej.a);

   private static eeg a(String $$0, Codec<? extends eef> $$1) {
      return ht.a(jd.H, new aey($$0), new eeg($$1));
   }

   public static BiFunction<cjh, ecs, cjh> a(List<? extends BiFunction<cjh, ecs, cjh>> $$0) {
      List<BiFunction<cjh, ecs, cjh>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cjh, ecs, cjh> $$2 = $$1.get(0);
            BiFunction<cjh, ecs, cjh> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cjh, ecs, cjh> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

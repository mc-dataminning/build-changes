import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class egm {
   public static final BiFunction<clj, eex, clj> a = ($$0, $$1) -> $$0;
   private static final Codec<egk> D = jy.H.q().dispatch("function", egk::b, egl::a);
   public static final Codec<egk> b = asu.a((Supplier<Codec<egk>>)(() -> asu.e(D, ego.b)));
   public static final egl c = a("set_count", egv.a);
   public static final egl d = a("enchant_with_levels", egd.a);
   public static final egl e = a("enchant_randomly", egc.a);
   public static final egl f = a("set_enchantments", egt.a);
   public static final egl g = a("set_nbt", egz.a);
   public static final egl h = a("furnace_smelt", ehc.a);
   public static final egl i = a("looting_enchant", egn.b);
   public static final egl j = a("set_damage", egw.a);
   public static final egl k = a("set_attributes", egp.a);
   public static final egl l = a("set_name", egy.a);
   public static final egl m = a("exploration_map", ege.f);
   public static final egl n = a("set_stew_effect", ehb.a);
   public static final egl o = a("copy_name", ega.a);
   public static final egl p = a("set_contents", egr.a);
   public static final egl q = a("limit_count", egi.a);
   public static final egl r = a("apply_bonus", efx.a);
   public static final egl s = a("set_loot_table", egs.a);
   public static final egl t = a("explosion_decay", efy.a);
   public static final egl u = a("set_lore", egx.a);
   public static final egl v = a("fill_player_head", egf.a);
   public static final egl w = a("copy_nbt", egb.a);
   public static final egl x = a("copy_state", efz.a);
   public static final egl y = a("set_banner_pattern", egq.a);
   public static final egl z = a("set_potion", eha.a);
   public static final egl A = a("set_instrument", egu.a);
   public static final egl B = a("reference", egg.a);
   public static final egl C = a("sequence", ego.a);

   private static egl a(String $$0, Codec<? extends egk> $$1) {
      return io.a(jy.H, new agi($$0), new egl($$1));
   }

   public static BiFunction<clj, eex, clj> a(List<? extends BiFunction<clj, eex, clj>> $$0) {
      List<BiFunction<clj, eex, clj>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<clj, eex, clj> $$2 = $$1.get(0);
            BiFunction<clj, eex, clj> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<clj, eex, clj> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

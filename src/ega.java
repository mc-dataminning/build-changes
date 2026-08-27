import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class ega {
   public static final BiFunction<clb, eel, clb> a = ($$0, $$1) -> $$0;
   private static final Codec<efy> D = jy.H.q().dispatch("function", efy::b, efz::a);
   public static final Codec<efy> b = asq.a((Supplier<Codec<efy>>)(() -> asq.e(D, egc.b)));
   public static final efz c = a("set_count", egj.a);
   public static final efz d = a("enchant_with_levels", efr.a);
   public static final efz e = a("enchant_randomly", efq.a);
   public static final efz f = a("set_enchantments", egh.a);
   public static final efz g = a("set_nbt", egn.a);
   public static final efz h = a("furnace_smelt", egq.a);
   public static final efz i = a("looting_enchant", egb.b);
   public static final efz j = a("set_damage", egk.a);
   public static final efz k = a("set_attributes", egd.a);
   public static final efz l = a("set_name", egm.a);
   public static final efz m = a("exploration_map", efs.f);
   public static final efz n = a("set_stew_effect", egp.a);
   public static final efz o = a("copy_name", efo.a);
   public static final efz p = a("set_contents", egf.a);
   public static final efz q = a("limit_count", efw.a);
   public static final efz r = a("apply_bonus", efl.a);
   public static final efz s = a("set_loot_table", egg.a);
   public static final efz t = a("explosion_decay", efm.a);
   public static final efz u = a("set_lore", egl.a);
   public static final efz v = a("fill_player_head", eft.a);
   public static final efz w = a("copy_nbt", efp.a);
   public static final efz x = a("copy_state", efn.a);
   public static final efz y = a("set_banner_pattern", ege.a);
   public static final efz z = a("set_potion", ego.a);
   public static final efz A = a("set_instrument", egi.a);
   public static final efz B = a("reference", efu.a);
   public static final efz C = a("sequence", egc.a);

   private static efz a(String $$0, Codec<? extends efy> $$1) {
      return io.a(jy.H, new agg($$0), new efz($$1));
   }

   public static BiFunction<clb, eel, clb> a(List<? extends BiFunction<clb, eel, clb>> $$0) {
      List<BiFunction<clb, eel, clb>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<clb, eel, clb> $$2 = $$1.get(0);
            BiFunction<clb, eel, clb> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<clb, eel, clb> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

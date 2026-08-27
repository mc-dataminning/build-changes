import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class eea {
   public static final BiFunction<cja, ecl, cja> a = ($$0, $$1) -> $$0;
   private static final Codec<edy> D = jd.H.q().dispatch("function", edy::b, edz::a);
   public static final Codec<edy> b = arb.a((Supplier<Codec<edy>>)(() -> arb.e(D, eec.b)));
   public static final edz c = a("set_count", eej.a);
   public static final edz d = a("enchant_with_levels", edr.a);
   public static final edz e = a("enchant_randomly", edq.a);
   public static final edz f = a("set_enchantments", eeh.a);
   public static final edz g = a("set_nbt", een.a);
   public static final edz h = a("furnace_smelt", eeq.a);
   public static final edz i = a("looting_enchant", eeb.b);
   public static final edz j = a("set_damage", eek.a);
   public static final edz k = a("set_attributes", eed.a);
   public static final edz l = a("set_name", eem.a);
   public static final edz m = a("exploration_map", eds.f);
   public static final edz n = a("set_stew_effect", eep.a);
   public static final edz o = a("copy_name", edo.a);
   public static final edz p = a("set_contents", eef.a);
   public static final edz q = a("limit_count", edw.a);
   public static final edz r = a("apply_bonus", edl.a);
   public static final edz s = a("set_loot_table", eeg.a);
   public static final edz t = a("explosion_decay", edm.a);
   public static final edz u = a("set_lore", eel.a);
   public static final edz v = a("fill_player_head", edt.a);
   public static final edz w = a("copy_nbt", edp.a);
   public static final edz x = a("copy_state", edn.a);
   public static final edz y = a("set_banner_pattern", eee.a);
   public static final edz z = a("set_potion", eeo.a);
   public static final edz A = a("set_instrument", eei.a);
   public static final edz B = a("reference", edu.a);
   public static final edz C = a("sequence", eec.a);

   private static edz a(String $$0, Codec<? extends edy> $$1) {
      return ht.a(jd.H, new aeu($$0), new edz($$1));
   }

   public static BiFunction<cja, ecl, cja> a(List<? extends BiFunction<cja, ecl, cja>> $$0) {
      List<BiFunction<cja, ecl, cja>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cja, ecl, cja> $$2 = $$1.get(0);
            BiFunction<cja, ecl, cja> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cja, ecl, cja> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

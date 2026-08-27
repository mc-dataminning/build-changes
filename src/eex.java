import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class eex {
   public static final BiFunction<ckj, edi, ckj> a = ($$0, $$1) -> $$0;
   private static final Codec<eev> D = jy.H.q().dispatch("function", eev::b, eew::a);
   public static final Codec<eev> b = asg.a((Supplier<Codec<eev>>)(() -> asg.e(D, eez.b)));
   public static final eew c = a("set_count", efg.a);
   public static final eew d = a("enchant_with_levels", eeo.a);
   public static final eew e = a("enchant_randomly", een.a);
   public static final eew f = a("set_enchantments", efe.a);
   public static final eew g = a("set_nbt", efk.a);
   public static final eew h = a("furnace_smelt", efn.a);
   public static final eew i = a("looting_enchant", eey.b);
   public static final eew j = a("set_damage", efh.a);
   public static final eew k = a("set_attributes", efa.a);
   public static final eew l = a("set_name", efj.a);
   public static final eew m = a("exploration_map", eep.f);
   public static final eew n = a("set_stew_effect", efm.a);
   public static final eew o = a("copy_name", eel.a);
   public static final eew p = a("set_contents", efc.a);
   public static final eew q = a("limit_count", eet.a);
   public static final eew r = a("apply_bonus", eei.a);
   public static final eew s = a("set_loot_table", efd.a);
   public static final eew t = a("explosion_decay", eej.a);
   public static final eew u = a("set_lore", efi.a);
   public static final eew v = a("fill_player_head", eeq.a);
   public static final eew w = a("copy_nbt", eem.a);
   public static final eew x = a("copy_state", eek.a);
   public static final eew y = a("set_banner_pattern", efb.a);
   public static final eew z = a("set_potion", efl.a);
   public static final eew A = a("set_instrument", eff.a);
   public static final eew B = a("reference", eer.a);
   public static final eew C = a("sequence", eez.a);

   private static eew a(String $$0, Codec<? extends eev> $$1) {
      return io.a(jy.H, new afw($$0), new eew($$1));
   }

   public static BiFunction<ckj, edi, ckj> a(List<? extends BiFunction<ckj, edi, ckj>> $$0) {
      List<BiFunction<ckj, edi, ckj>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<ckj, edi, ckj> $$2 = $$1.get(0);
            BiFunction<ckj, edi, ckj> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<ckj, edi, ckj> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

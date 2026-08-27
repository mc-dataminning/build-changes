import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class edv {
   public static final BiFunction<cix, ecg, cix> a = ($$0, $$1) -> $$0;
   private static final Codec<edt> D = jb.H.q().dispatch("function", edt::b, edu::a);
   public static final Codec<edt> b = aqy.a((Supplier<Codec<edt>>)(() -> aqy.c(D, edx.b)));
   public static final edu c = a("set_count", eee.a);
   public static final edu d = a("enchant_with_levels", edm.a);
   public static final edu e = a("enchant_randomly", edl.a);
   public static final edu f = a("set_enchantments", eec.a);
   public static final edu g = a("set_nbt", eei.a);
   public static final edu h = a("furnace_smelt", eel.a);
   public static final edu i = a("looting_enchant", edw.b);
   public static final edu j = a("set_damage", eef.a);
   public static final edu k = a("set_attributes", edy.a);
   public static final edu l = a("set_name", eeh.a);
   public static final edu m = a("exploration_map", edn.f);
   public static final edu n = a("set_stew_effect", eek.a);
   public static final edu o = a("copy_name", edj.a);
   public static final edu p = a("set_contents", eea.a);
   public static final edu q = a("limit_count", edr.a);
   public static final edu r = a("apply_bonus", edg.a);
   public static final edu s = a("set_loot_table", eeb.a);
   public static final edu t = a("explosion_decay", edh.a);
   public static final edu u = a("set_lore", eeg.a);
   public static final edu v = a("fill_player_head", edo.a);
   public static final edu w = a("copy_nbt", edk.a);
   public static final edu x = a("copy_state", edi.a);
   public static final edu y = a("set_banner_pattern", edz.a);
   public static final edu z = a("set_potion", eej.a);
   public static final edu A = a("set_instrument", eed.a);
   public static final edu B = a("reference", edp.a);
   public static final edu C = a("sequence", edx.a);

   private static edu a(String $$0, Codec<? extends edt> $$1) {
      return hr.a(jb.H, new aer($$0), new edu($$1));
   }

   public static BiFunction<cix, ecg, cix> a(List<? extends BiFunction<cix, ecg, cix>> $$0) {
      List<BiFunction<cix, ecg, cix>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cix, ecg, cix> $$2 = $$1.get(0);
            BiFunction<cix, ecg, cix> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cix, ecg, cix> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

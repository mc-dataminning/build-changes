import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class edz {
   public static final BiFunction<cjl, eck, cjl> a = ($$0, $$1) -> $$0;
   private static final Codec<edx> D = jb.H.q().dispatch("function", edx::b, edy::a);
   public static final Codec<edx> b = arj.a((Supplier<Codec<edx>>)(() -> arj.e(D, eeb.b)));
   public static final edy c = a("set_count", eei.a);
   public static final edy d = a("enchant_with_levels", edq.a);
   public static final edy e = a("enchant_randomly", edp.a);
   public static final edy f = a("set_enchantments", eeg.a);
   public static final edy g = a("set_nbt", eem.a);
   public static final edy h = a("furnace_smelt", eep.a);
   public static final edy i = a("looting_enchant", eea.b);
   public static final edy j = a("set_damage", eej.a);
   public static final edy k = a("set_attributes", eec.a);
   public static final edy l = a("set_name", eel.a);
   public static final edy m = a("exploration_map", edr.f);
   public static final edy n = a("set_stew_effect", eeo.a);
   public static final edy o = a("copy_name", edn.a);
   public static final edy p = a("set_contents", eee.a);
   public static final edy q = a("limit_count", edv.a);
   public static final edy r = a("apply_bonus", edk.a);
   public static final edy s = a("set_loot_table", eef.a);
   public static final edy t = a("explosion_decay", edl.a);
   public static final edy u = a("set_lore", eek.a);
   public static final edy v = a("fill_player_head", eds.a);
   public static final edy w = a("copy_nbt", edo.a);
   public static final edy x = a("copy_state", edm.a);
   public static final edy y = a("set_banner_pattern", eed.a);
   public static final edy z = a("set_potion", een.a);
   public static final edy A = a("set_instrument", eeh.a);
   public static final edy B = a("reference", edt.a);
   public static final edy C = a("sequence", eeb.a);

   private static edy a(String $$0, Codec<? extends edx> $$1) {
      return hq.a(jb.H, new aez($$0), new edy($$1));
   }

   public static BiFunction<cjl, eck, cjl> a(List<? extends BiFunction<cjl, eck, cjl>> $$0) {
      List<BiFunction<cjl, eck, cjl>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cjl, eck, cjl> $$2 = $$1.get(0);
            BiFunction<cjl, eck, cjl> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cjl, eck, cjl> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class emj {
   public static final BiFunction<cqk, eku, cqk> a = ($$0, $$1) -> $$0;
   private static final Codec<emh> D = ki.G.q().dispatch("function", emh::b, emi::a);
   public static final Codec<emh> b = awe.a((Supplier<Codec<emh>>)(() -> awe.e(D, eml.b)));
   public static final emi c = a("set_count", ems.a);
   public static final emi d = a("enchant_with_levels", ema.a);
   public static final emi e = a("enchant_randomly", elz.a);
   public static final emi f = a("set_enchantments", emq.a);
   public static final emi g = a("set_nbt", emw.a);
   public static final emi h = a("furnace_smelt", emz.a);
   public static final emi i = a("looting_enchant", emk.b);
   public static final emi j = a("set_damage", emt.a);
   public static final emi k = a("set_attributes", emm.a);
   public static final emi l = a("set_name", emv.a);
   public static final emi m = a("exploration_map", emb.f);
   public static final emi n = a("set_stew_effect", emy.a);
   public static final emi o = a("copy_name", elx.a);
   public static final emi p = a("set_contents", emo.a);
   public static final emi q = a("limit_count", emf.a);
   public static final emi r = a("apply_bonus", elu.a);
   public static final emi s = a("set_loot_table", emp.a);
   public static final emi t = a("explosion_decay", elv.a);
   public static final emi u = a("set_lore", emu.a);
   public static final emi v = a("fill_player_head", emc.a);
   public static final emi w = a("copy_nbt", ely.a);
   public static final emi x = a("copy_state", elw.a);
   public static final emi y = a("set_banner_pattern", emn.a);
   public static final emi z = a("set_potion", emx.a);
   public static final emi A = a("set_instrument", emr.a);
   public static final emi B = a("reference", emd.a);
   public static final emi C = a("sequence", eml.a);

   private static emi a(String $$0, Codec<? extends emh> $$1) {
      return iy.a(ki.G, new ajh($$0), new emi($$1));
   }

   public static BiFunction<cqk, eku, cqk> a(List<? extends BiFunction<cqk, eku, cqk>> $$0) {
      List<BiFunction<cqk, eku, cqk>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cqk, eku, cqk> $$2 = $$1.get(0);
            BiFunction<cqk, eku, cqk> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cqk, eku, cqk> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

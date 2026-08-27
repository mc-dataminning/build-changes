import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class eie {
   public static final BiFunction<cmr, egp, cmr> a = ($$0, $$1) -> $$0;
   private static final Codec<eic> D = kd.G.q().dispatch("function", eic::b, eid::a);
   public static final Codec<eic> b = atq.a((Supplier<Codec<eic>>)(() -> atq.e(D, eig.b)));
   public static final eid c = a("set_count", ein.a);
   public static final eid d = a("enchant_with_levels", ehv.a);
   public static final eid e = a("enchant_randomly", ehu.a);
   public static final eid f = a("set_enchantments", eil.a);
   public static final eid g = a("set_nbt", eir.a);
   public static final eid h = a("furnace_smelt", eiu.a);
   public static final eid i = a("looting_enchant", eif.b);
   public static final eid j = a("set_damage", eio.a);
   public static final eid k = a("set_attributes", eih.a);
   public static final eid l = a("set_name", eiq.a);
   public static final eid m = a("exploration_map", ehw.f);
   public static final eid n = a("set_stew_effect", eit.a);
   public static final eid o = a("copy_name", ehs.a);
   public static final eid p = a("set_contents", eij.a);
   public static final eid q = a("limit_count", eia.a);
   public static final eid r = a("apply_bonus", ehp.a);
   public static final eid s = a("set_loot_table", eik.a);
   public static final eid t = a("explosion_decay", ehq.a);
   public static final eid u = a("set_lore", eip.a);
   public static final eid v = a("fill_player_head", ehx.a);
   public static final eid w = a("copy_nbt", eht.a);
   public static final eid x = a("copy_state", ehr.a);
   public static final eid y = a("set_banner_pattern", eii.a);
   public static final eid z = a("set_potion", eis.a);
   public static final eid A = a("set_instrument", eim.a);
   public static final eid B = a("reference", ehy.a);
   public static final eid C = a("sequence", eig.a);

   private static eid a(String $$0, Codec<? extends eic> $$1) {
      return it.a(kd.G, new ahd($$0), new eid($$1));
   }

   public static BiFunction<cmr, egp, cmr> a(List<? extends BiFunction<cmr, egp, cmr>> $$0) {
      List<BiFunction<cmr, egp, cmr>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cmr, egp, cmr> $$2 = $$1.get(0);
            BiFunction<cmr, egp, cmr> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cmr, egp, cmr> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

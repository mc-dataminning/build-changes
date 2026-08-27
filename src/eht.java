import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class eht {
   public static final BiFunction<cmh, ege, cmh> a = ($$0, $$1) -> $$0;
   private static final Codec<ehr> D = kb.G.q().dispatch("function", ehr::b, ehs::a);
   public static final Codec<ehr> b = atg.a((Supplier<Codec<ehr>>)(() -> atg.e(D, ehv.b)));
   public static final ehs c = a("set_count", eic.a);
   public static final ehs d = a("enchant_with_levels", ehk.a);
   public static final ehs e = a("enchant_randomly", ehj.a);
   public static final ehs f = a("set_enchantments", eia.a);
   public static final ehs g = a("set_nbt", eig.a);
   public static final ehs h = a("furnace_smelt", eij.a);
   public static final ehs i = a("looting_enchant", ehu.b);
   public static final ehs j = a("set_damage", eid.a);
   public static final ehs k = a("set_attributes", ehw.a);
   public static final ehs l = a("set_name", eif.a);
   public static final ehs m = a("exploration_map", ehl.f);
   public static final ehs n = a("set_stew_effect", eii.a);
   public static final ehs o = a("copy_name", ehh.a);
   public static final ehs p = a("set_contents", ehy.a);
   public static final ehs q = a("limit_count", ehp.a);
   public static final ehs r = a("apply_bonus", ehe.a);
   public static final ehs s = a("set_loot_table", ehz.a);
   public static final ehs t = a("explosion_decay", ehf.a);
   public static final ehs u = a("set_lore", eie.a);
   public static final ehs v = a("fill_player_head", ehm.a);
   public static final ehs w = a("copy_nbt", ehi.a);
   public static final ehs x = a("copy_state", ehg.a);
   public static final ehs y = a("set_banner_pattern", ehx.a);
   public static final ehs z = a("set_potion", eih.a);
   public static final ehs A = a("set_instrument", eib.a);
   public static final ehs B = a("reference", ehn.a);
   public static final ehs C = a("sequence", ehv.a);

   private static ehs a(String $$0, Codec<? extends ehr> $$1) {
      return ir.a(kb.G, new agt($$0), new ehs($$1));
   }

   public static BiFunction<cmh, ege, cmh> a(List<? extends BiFunction<cmh, ege, cmh>> $$0) {
      List<BiFunction<cmh, ege, cmh>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cmh, ege, cmh> $$2 = $$1.get(0);
            BiFunction<cmh, ege, cmh> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cmh, ege, cmh> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class eik {
   public static final BiFunction<cmx, egv, cmx> a = ($$0, $$1) -> $$0;
   private static final Codec<eii> D = kd.G.q().dispatch("function", eii::b, eij::a);
   public static final Codec<eii> b = atv.a((Supplier<Codec<eii>>)(() -> atv.e(D, eim.b)));
   public static final eij c = a("set_count", eit.a);
   public static final eij d = a("enchant_with_levels", eib.a);
   public static final eij e = a("enchant_randomly", eia.a);
   public static final eij f = a("set_enchantments", eir.a);
   public static final eij g = a("set_nbt", eix.a);
   public static final eij h = a("furnace_smelt", eja.a);
   public static final eij i = a("looting_enchant", eil.b);
   public static final eij j = a("set_damage", eiu.a);
   public static final eij k = a("set_attributes", ein.a);
   public static final eij l = a("set_name", eiw.a);
   public static final eij m = a("exploration_map", eic.f);
   public static final eij n = a("set_stew_effect", eiz.a);
   public static final eij o = a("copy_name", ehy.a);
   public static final eij p = a("set_contents", eip.a);
   public static final eij q = a("limit_count", eig.a);
   public static final eij r = a("apply_bonus", ehv.a);
   public static final eij s = a("set_loot_table", eiq.a);
   public static final eij t = a("explosion_decay", ehw.a);
   public static final eij u = a("set_lore", eiv.a);
   public static final eij v = a("fill_player_head", eid.a);
   public static final eij w = a("copy_nbt", ehz.a);
   public static final eij x = a("copy_state", ehx.a);
   public static final eij y = a("set_banner_pattern", eio.a);
   public static final eij z = a("set_potion", eiy.a);
   public static final eij A = a("set_instrument", eis.a);
   public static final eij B = a("reference", eie.a);
   public static final eij C = a("sequence", eim.a);

   private static eij a(String $$0, Codec<? extends eii> $$1) {
      return it.a(kd.G, new ahg($$0), new eij($$1));
   }

   public static BiFunction<cmx, egv, cmx> a(List<? extends BiFunction<cmx, egv, cmx>> $$0) {
      List<BiFunction<cmx, egv, cmx>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cmx, egv, cmx> $$2 = $$1.get(0);
            BiFunction<cmx, egv, cmx> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cmx, egv, cmx> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

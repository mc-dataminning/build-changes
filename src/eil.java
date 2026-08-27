import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class eil {
   public static final BiFunction<cmy, egw, cmy> a = ($$0, $$1) -> $$0;
   private static final Codec<eij> D = kd.G.q().dispatch("function", eij::b, eik::a);
   public static final Codec<eij> b = atw.a((Supplier<Codec<eij>>)(() -> atw.e(D, ein.b)));
   public static final eik c = a("set_count", eiu.a);
   public static final eik d = a("enchant_with_levels", eic.a);
   public static final eik e = a("enchant_randomly", eib.a);
   public static final eik f = a("set_enchantments", eis.a);
   public static final eik g = a("set_nbt", eiy.a);
   public static final eik h = a("furnace_smelt", ejb.a);
   public static final eik i = a("looting_enchant", eim.b);
   public static final eik j = a("set_damage", eiv.a);
   public static final eik k = a("set_attributes", eio.a);
   public static final eik l = a("set_name", eix.a);
   public static final eik m = a("exploration_map", eid.f);
   public static final eik n = a("set_stew_effect", eja.a);
   public static final eik o = a("copy_name", ehz.a);
   public static final eik p = a("set_contents", eiq.a);
   public static final eik q = a("limit_count", eih.a);
   public static final eik r = a("apply_bonus", ehw.a);
   public static final eik s = a("set_loot_table", eir.a);
   public static final eik t = a("explosion_decay", ehx.a);
   public static final eik u = a("set_lore", eiw.a);
   public static final eik v = a("fill_player_head", eie.a);
   public static final eik w = a("copy_nbt", eia.a);
   public static final eik x = a("copy_state", ehy.a);
   public static final eik y = a("set_banner_pattern", eip.a);
   public static final eik z = a("set_potion", eiz.a);
   public static final eik A = a("set_instrument", eit.a);
   public static final eik B = a("reference", eif.a);
   public static final eik C = a("sequence", ein.a);

   private static eik a(String $$0, Codec<? extends eij> $$1) {
      return it.a(kd.G, new ahg($$0), new eik($$1));
   }

   public static BiFunction<cmy, egw, cmy> a(List<? extends BiFunction<cmy, egw, cmy>> $$0) {
      List<BiFunction<cmy, egw, cmy>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cmy, egw, cmy> $$2 = $$1.get(0);
            BiFunction<cmy, egw, cmy> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cmy, egw, cmy> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

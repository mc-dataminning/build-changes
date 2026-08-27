import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class etd {
   public static final BiFunction<cuh, erp, cuh> a = ($$0, $$1) -> $$0;
   public static final Codec<etb> b = lh.G.q().dispatch("function", etb::b, etc::a);
   public static final Codec<etb> c = axu.a((Supplier<Codec<etb>>)(() -> axu.e(b, etf.b)));
   public static final Codec<ja<etb>> d = akp.a(li.aV, c);
   public static final etc e = a("set_count", etr.a);
   public static final etc f = a("enchant_with_levels", est.a);
   public static final etc g = a("enchant_randomly", ess.a);
   public static final etc h = a("set_enchantments", etn.a);
   public static final etc i = a("set_custom_data", etm.a);
   public static final etc j = a("set_components", etj.a);
   public static final etc k = a("furnace_smelt", etz.a);
   public static final etc l = a("looting_enchant", ete.b);
   public static final etc m = a("set_damage", ets.a);
   public static final etc n = a("set_attributes", etg.a);
   public static final etc o = a("set_name", etu.a);
   public static final etc p = a("exploration_map", esu.f);
   public static final etc q = a("set_stew_effect", etw.a);
   public static final etc r = a("copy_name", esr.a);
   public static final etc s = a("set_contents", etk.a);
   public static final etc t = a("limit_count", esy.a);
   public static final etc u = a("apply_bonus", esm.a);
   public static final etc v = a("set_loot_table", etl.a);
   public static final etc w = a("explosion_decay", esn.a);
   public static final etc x = a("set_lore", ett.a);
   public static final etc y = a("fill_player_head", esv.a);
   public static final etc z = a("copy_custom_data", esq.a);
   public static final etc A = a("copy_state", eso.a);
   public static final etc B = a("set_banner_pattern", eth.a);
   public static final etc C = a("set_potion", etv.a);
   public static final etc D = a("set_instrument", etq.a);
   public static final etc E = a("reference", esw.a);
   public static final etc F = a("sequence", etf.a);
   public static final etc G = a("copy_components", esp.a);
   public static final etc H = a("set_fireworks", etp.a);
   public static final etc I = a("set_firework_explosion", eto.a);
   public static final etc J = a("set_book_cover", eti.a);
   public static final etc K = a("set_written_book_pages", ety.b);
   public static final etc L = a("set_writable_book_pages", etx.a);
   public static final etc M = a("toggle_tooltips", eua.a);

   private static etc a(String $$0, Codec<? extends etb> $$1) {
      return jn.a(lh.G, new akt($$0), new etc($$1));
   }

   public static BiFunction<cuh, erp, cuh> a(List<? extends BiFunction<cuh, erp, cuh>> $$0) {
      List<BiFunction<cuh, erp, cuh>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cuh, erp, cuh> $$2 = $$1.get(0);
            BiFunction<cuh, erp, cuh> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cuh, erp, cuh> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

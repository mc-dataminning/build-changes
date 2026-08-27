import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class epa {
   public static final BiFunction<crs, enk, crs> a = ($$0, $$1) -> $$0;
   private static final Codec<eoy> F = kt.G.q().dispatch("function", eoy::b, eoz::a);
   public static final Codec<eoy> b = awu.a((Supplier<Codec<eoy>>)(() -> awu.e(F, epc.b)));
   public static final eoz c = a("set_count", epl.a);
   public static final eoz d = a("enchant_with_levels", eor.a);
   public static final eoz e = a("enchant_randomly", eoq.a);
   public static final eoz f = a("set_enchantments", epj.a);
   public static final eoz g = a("set_custom_data", epi.a);
   public static final eoz h = a("set_components", epf.a);
   public static final eoz i = a("furnace_smelt", epr.a);
   public static final eoz j = a("looting_enchant", epb.b);
   public static final eoz k = a("set_damage", epm.a);
   public static final eoz l = a("set_attributes", epd.a);
   public static final eoz m = a("set_name", epo.a);
   public static final eoz n = a("exploration_map", eos.f);
   public static final eoz o = a("set_stew_effect", epq.a);
   public static final eoz p = a("copy_name", eop.a);
   public static final eoz q = a("set_contents", epg.a);
   public static final eoz r = a("limit_count", eow.a);
   public static final eoz s = a("apply_bonus", eok.a);
   public static final eoz t = a("set_loot_table", eph.a);
   public static final eoz u = a("explosion_decay", eol.a);
   public static final eoz v = a("set_lore", epn.a);
   public static final eoz w = a("fill_player_head", eot.a);
   public static final eoz x = a("copy_custom_data", eoo.a);
   public static final eoz y = a("copy_state", eom.a);
   public static final eoz z = a("set_banner_pattern", epe.a);
   public static final eoz A = a("set_potion", epp.a);
   public static final eoz B = a("set_instrument", epk.a);
   public static final eoz C = a("reference", eou.a);
   public static final eoz D = a("sequence", epc.a);
   public static final eoz E = a("copy_components", eon.a);

   private static eoz a(String $$0, Codec<? extends eoy> $$1) {
      return ja.a(kt.G, new ajv($$0), new eoz($$1));
   }

   public static BiFunction<crs, enk, crs> a(List<? extends BiFunction<crs, enk, crs>> $$0) {
      List<BiFunction<crs, enk, crs>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<crs, enk, crs> $$2 = $$1.get(0);
            BiFunction<crs, enk, crs> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<crs, enk, crs> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

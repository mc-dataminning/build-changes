import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class epr {
   public static final BiFunction<csd, eoa, csd> a = ($$0, $$1) -> $$0;
   private static final Codec<epp> K = lc.G.q().dispatch("function", epp::b, epq::a);
   public static final Codec<epp> b = axe.a((Supplier<Codec<epp>>)(() -> axe.e(K, ept.b)));
   public static final epq c = a("set_count", eqf.a);
   public static final epq d = a("enchant_with_levels", eph.a);
   public static final epq e = a("enchant_randomly", epg.a);
   public static final epq f = a("set_enchantments", eqb.a);
   public static final epq g = a("set_custom_data", eqa.a);
   public static final epq h = a("set_components", epx.a);
   public static final epq i = a("furnace_smelt", eqn.a);
   public static final epq j = a("looting_enchant", eps.b);
   public static final epq k = a("set_damage", eqg.a);
   public static final epq l = a("set_attributes", epu.a);
   public static final epq m = a("set_name", eqi.a);
   public static final epq n = a("exploration_map", epi.f);
   public static final epq o = a("set_stew_effect", eqk.a);
   public static final epq p = a("copy_name", epf.a);
   public static final epq q = a("set_contents", epy.a);
   public static final epq r = a("limit_count", epm.a);
   public static final epq s = a("apply_bonus", epa.a);
   public static final epq t = a("set_loot_table", epz.a);
   public static final epq u = a("explosion_decay", epb.a);
   public static final epq v = a("set_lore", eqh.a);
   public static final epq w = a("fill_player_head", epj.a);
   public static final epq x = a("copy_custom_data", epe.a);
   public static final epq y = a("copy_state", epc.a);
   public static final epq z = a("set_banner_pattern", epv.a);
   public static final epq A = a("set_potion", eqj.a);
   public static final epq B = a("set_instrument", eqe.a);
   public static final epq C = a("reference", epk.a);
   public static final epq D = a("sequence", ept.a);
   public static final epq E = a("copy_components", epd.a);
   public static final epq F = a("set_fireworks", eqd.a);
   public static final epq G = a("set_firework_explosion", eqc.a);
   public static final epq H = a("set_book_cover", epw.a);
   public static final epq I = a("set_written_book_pages", eqm.a);
   public static final epq J = a("set_writable_book_pages", eql.a);

   private static epq a(String $$0, Codec<? extends epp> $$1) {
      return ji.a(lc.G, new akf($$0), new epq($$1));
   }

   public static BiFunction<csd, eoa, csd> a(List<? extends BiFunction<csd, eoa, csd>> $$0) {
      List<BiFunction<csd, eoa, csd>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<csd, eoa, csd> $$2 = $$1.get(0);
            BiFunction<csd, eoa, csd> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<csd, eoa, csd> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

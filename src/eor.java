import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class eor {
   public static final BiFunction<crj, enb, crj> a = ($$0, $$1) -> $$0;
   private static final Codec<eop> F = kr.G.q().dispatch("function", eop::b, eoq::a);
   public static final Codec<eop> b = aws.a((Supplier<Codec<eop>>)(() -> aws.e(F, eot.b)));
   public static final eoq c = a("set_count", epc.a);
   public static final eoq d = a("enchant_with_levels", eoi.a);
   public static final eoq e = a("enchant_randomly", eoh.a);
   public static final eoq f = a("set_enchantments", epa.a);
   public static final eoq g = a("set_custom_data", eoz.a);
   public static final eoq h = a("set_components", eow.a);
   public static final eoq i = a("furnace_smelt", epi.a);
   public static final eoq j = a("looting_enchant", eos.b);
   public static final eoq k = a("set_damage", epd.a);
   public static final eoq l = a("set_attributes", eou.a);
   public static final eoq m = a("set_name", epf.a);
   public static final eoq n = a("exploration_map", eoj.f);
   public static final eoq o = a("set_stew_effect", eph.a);
   public static final eoq p = a("copy_name", eog.a);
   public static final eoq q = a("set_contents", eox.a);
   public static final eoq r = a("limit_count", eon.a);
   public static final eoq s = a("apply_bonus", eob.a);
   public static final eoq t = a("set_loot_table", eoy.a);
   public static final eoq u = a("explosion_decay", eoc.a);
   public static final eoq v = a("set_lore", epe.a);
   public static final eoq w = a("fill_player_head", eok.a);
   public static final eoq x = a("copy_custom_data", eof.a);
   public static final eoq y = a("copy_state", eod.a);
   public static final eoq z = a("set_banner_pattern", eov.a);
   public static final eoq A = a("set_potion", epg.a);
   public static final eoq B = a("set_instrument", epb.a);
   public static final eoq C = a("reference", eol.a);
   public static final eoq D = a("sequence", eot.a);
   public static final eoq E = a("copy_components", eoe.a);

   private static eoq a(String $$0, Codec<? extends eop> $$1) {
      return iy.a(kr.G, new ajt($$0), new eoq($$1));
   }

   public static BiFunction<crj, enb, crj> a(List<? extends BiFunction<crj, enb, crj>> $$0) {
      List<BiFunction<crj, enb, crj>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<crj, enb, crj> $$2 = $$1.get(0);
            BiFunction<crj, enb, crj> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<crj, enb, crj> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

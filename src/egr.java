import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class egr {
   public static final BiFunction<clo, efc, clo> a = ($$0, $$1) -> $$0;
   private static final Codec<egp> D = kc.H.q().dispatch("function", egp::b, egq::a);
   public static final Codec<egp> b = asy.a((Supplier<Codec<egp>>)(() -> asy.e(D, egt.b)));
   public static final egq c = a("set_count", eha.a);
   public static final egq d = a("enchant_with_levels", egi.a);
   public static final egq e = a("enchant_randomly", egh.a);
   public static final egq f = a("set_enchantments", egy.a);
   public static final egq g = a("set_nbt", ehe.a);
   public static final egq h = a("furnace_smelt", ehh.a);
   public static final egq i = a("looting_enchant", egs.b);
   public static final egq j = a("set_damage", ehb.a);
   public static final egq k = a("set_attributes", egu.a);
   public static final egq l = a("set_name", ehd.a);
   public static final egq m = a("exploration_map", egj.f);
   public static final egq n = a("set_stew_effect", ehg.a);
   public static final egq o = a("copy_name", egf.a);
   public static final egq p = a("set_contents", egw.a);
   public static final egq q = a("limit_count", egn.a);
   public static final egq r = a("apply_bonus", egc.a);
   public static final egq s = a("set_loot_table", egx.a);
   public static final egq t = a("explosion_decay", egd.a);
   public static final egq u = a("set_lore", ehc.a);
   public static final egq v = a("fill_player_head", egk.a);
   public static final egq w = a("copy_nbt", egg.a);
   public static final egq x = a("copy_state", ege.a);
   public static final egq y = a("set_banner_pattern", egv.a);
   public static final egq z = a("set_potion", ehf.a);
   public static final egq A = a("set_instrument", egz.a);
   public static final egq B = a("reference", egl.a);
   public static final egq C = a("sequence", egt.a);

   private static egq a(String $$0, Codec<? extends egp> $$1) {
      return is.a(kc.H, new agm($$0), new egq($$1));
   }

   public static BiFunction<clo, efc, clo> a(List<? extends BiFunction<clo, efc, clo>> $$0) {
      List<BiFunction<clo, efc, clo>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<clo, efc, clo> $$2 = $$1.get(0);
            BiFunction<clo, efc, clo> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<clo, efc, clo> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

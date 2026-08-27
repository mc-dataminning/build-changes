import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class ekr {
   public static final BiFunction<cpd, ejc, cpd> a = ($$0, $$1) -> $$0;
   private static final Codec<ekp> D = kf.G.q().dispatch("function", ekp::b, ekq::a);
   public static final Codec<ekp> b = avq.a((Supplier<Codec<ekp>>)(() -> avq.e(D, ekt.b)));
   public static final ekq c = a("set_count", ela.a);
   public static final ekq d = a("enchant_with_levels", eki.a);
   public static final ekq e = a("enchant_randomly", ekh.a);
   public static final ekq f = a("set_enchantments", eky.a);
   public static final ekq g = a("set_nbt", ele.a);
   public static final ekq h = a("furnace_smelt", elh.a);
   public static final ekq i = a("looting_enchant", eks.b);
   public static final ekq j = a("set_damage", elb.a);
   public static final ekq k = a("set_attributes", eku.a);
   public static final ekq l = a("set_name", eld.a);
   public static final ekq m = a("exploration_map", ekj.f);
   public static final ekq n = a("set_stew_effect", elg.a);
   public static final ekq o = a("copy_name", ekf.a);
   public static final ekq p = a("set_contents", ekw.a);
   public static final ekq q = a("limit_count", ekn.a);
   public static final ekq r = a("apply_bonus", ekc.a);
   public static final ekq s = a("set_loot_table", ekx.a);
   public static final ekq t = a("explosion_decay", ekd.a);
   public static final ekq u = a("set_lore", elc.a);
   public static final ekq v = a("fill_player_head", ekk.a);
   public static final ekq w = a("copy_nbt", ekg.a);
   public static final ekq x = a("copy_state", eke.a);
   public static final ekq y = a("set_banner_pattern", ekv.a);
   public static final ekq z = a("set_potion", elf.a);
   public static final ekq A = a("set_instrument", ekz.a);
   public static final ekq B = a("reference", ekl.a);
   public static final ekq C = a("sequence", ekt.a);

   private static ekq a(String $$0, Codec<? extends ekp> $$1) {
      return iv.a(kf.G, new aiy($$0), new ekq($$1));
   }

   public static BiFunction<cpd, ejc, cpd> a(List<? extends BiFunction<cpd, ejc, cpd>> $$0) {
      List<BiFunction<cpd, ejc, cpd>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cpd, ejc, cpd> $$2 = $$1.get(0);
            BiFunction<cpd, ejc, cpd> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cpd, ejc, cpd> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

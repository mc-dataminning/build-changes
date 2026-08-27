import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class ekk {
   public static final BiFunction<coz, eiv, coz> a = ($$0, $$1) -> $$0;
   private static final Codec<eki> D = kf.G.q().dispatch("function", eki::b, ekj::a);
   public static final Codec<eki> b = avp.a((Supplier<Codec<eki>>)(() -> avp.e(D, ekm.b)));
   public static final ekj c = a("set_count", ekt.a);
   public static final ekj d = a("enchant_with_levels", ekb.a);
   public static final ekj e = a("enchant_randomly", eka.a);
   public static final ekj f = a("set_enchantments", ekr.a);
   public static final ekj g = a("set_nbt", ekx.a);
   public static final ekj h = a("furnace_smelt", ela.a);
   public static final ekj i = a("looting_enchant", ekl.b);
   public static final ekj j = a("set_damage", eku.a);
   public static final ekj k = a("set_attributes", ekn.a);
   public static final ekj l = a("set_name", ekw.a);
   public static final ekj m = a("exploration_map", ekc.f);
   public static final ekj n = a("set_stew_effect", ekz.a);
   public static final ekj o = a("copy_name", ejy.a);
   public static final ekj p = a("set_contents", ekp.a);
   public static final ekj q = a("limit_count", ekg.a);
   public static final ekj r = a("apply_bonus", ejv.a);
   public static final ekj s = a("set_loot_table", ekq.a);
   public static final ekj t = a("explosion_decay", ejw.a);
   public static final ekj u = a("set_lore", ekv.a);
   public static final ekj v = a("fill_player_head", ekd.a);
   public static final ekj w = a("copy_nbt", ejz.a);
   public static final ekj x = a("copy_state", ejx.a);
   public static final ekj y = a("set_banner_pattern", eko.a);
   public static final ekj z = a("set_potion", eky.a);
   public static final ekj A = a("set_instrument", eks.a);
   public static final ekj B = a("reference", eke.a);
   public static final ekj C = a("sequence", ekm.a);

   private static ekj a(String $$0, Codec<? extends eki> $$1) {
      return iv.a(kf.G, new aiy($$0), new ekj($$1));
   }

   public static BiFunction<coz, eiv, coz> a(List<? extends BiFunction<coz, eiv, coz>> $$0) {
      List<BiFunction<coz, eiv, coz>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<coz, eiv, coz> $$2 = $$1.get(0);
            BiFunction<coz, eiv, coz> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<coz, eiv, coz> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

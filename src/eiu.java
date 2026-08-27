import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class eiu {
   public static final BiFunction<cng, ehf, cng> a = ($$0, $$1) -> $$0;
   private static final Codec<eis> D = kd.G.q().dispatch("function", eis::b, eit::a);
   public static final Codec<eis> b = atx.a((Supplier<Codec<eis>>)(() -> atx.e(D, eiw.b)));
   public static final eit c = a("set_count", ejd.a);
   public static final eit d = a("enchant_with_levels", eil.a);
   public static final eit e = a("enchant_randomly", eik.a);
   public static final eit f = a("set_enchantments", ejb.a);
   public static final eit g = a("set_nbt", ejh.a);
   public static final eit h = a("furnace_smelt", ejk.a);
   public static final eit i = a("looting_enchant", eiv.b);
   public static final eit j = a("set_damage", eje.a);
   public static final eit k = a("set_attributes", eix.a);
   public static final eit l = a("set_name", ejg.a);
   public static final eit m = a("exploration_map", eim.f);
   public static final eit n = a("set_stew_effect", ejj.a);
   public static final eit o = a("copy_name", eii.a);
   public static final eit p = a("set_contents", eiz.a);
   public static final eit q = a("limit_count", eiq.a);
   public static final eit r = a("apply_bonus", eif.a);
   public static final eit s = a("set_loot_table", eja.a);
   public static final eit t = a("explosion_decay", eig.a);
   public static final eit u = a("set_lore", ejf.a);
   public static final eit v = a("fill_player_head", ein.a);
   public static final eit w = a("copy_nbt", eij.a);
   public static final eit x = a("copy_state", eih.a);
   public static final eit y = a("set_banner_pattern", eiy.a);
   public static final eit z = a("set_potion", eji.a);
   public static final eit A = a("set_instrument", ejc.a);
   public static final eit B = a("reference", eio.a);
   public static final eit C = a("sequence", eiw.a);

   private static eit a(String $$0, Codec<? extends eis> $$1) {
      return it.a(kd.G, new ahh($$0), new eit($$1));
   }

   public static BiFunction<cng, ehf, cng> a(List<? extends BiFunction<cng, ehf, cng>> $$0) {
      List<BiFunction<cng, ehf, cng>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cng, ehf, cng> $$2 = $$1.get(0);
            BiFunction<cng, ehf, cng> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cng, ehf, cng> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

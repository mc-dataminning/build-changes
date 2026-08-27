import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class edw {
   public static final BiFunction<ciy, ech, ciy> a = ($$0, $$1) -> $$0;
   private static final Codec<edu> D = jb.H.q().dispatch("function", edu::b, edv::a);
   public static final Codec<edu> b = aqy.a((Supplier<Codec<edu>>)(() -> aqy.c(D, edy.b)));
   public static final edv c = a("set_count", eef.a);
   public static final edv d = a("enchant_with_levels", edn.a);
   public static final edv e = a("enchant_randomly", edm.a);
   public static final edv f = a("set_enchantments", eed.a);
   public static final edv g = a("set_nbt", eej.a);
   public static final edv h = a("furnace_smelt", eem.a);
   public static final edv i = a("looting_enchant", edx.b);
   public static final edv j = a("set_damage", eeg.a);
   public static final edv k = a("set_attributes", edz.a);
   public static final edv l = a("set_name", eei.a);
   public static final edv m = a("exploration_map", edo.f);
   public static final edv n = a("set_stew_effect", eel.a);
   public static final edv o = a("copy_name", edk.a);
   public static final edv p = a("set_contents", eeb.a);
   public static final edv q = a("limit_count", eds.a);
   public static final edv r = a("apply_bonus", edh.a);
   public static final edv s = a("set_loot_table", eec.a);
   public static final edv t = a("explosion_decay", edi.a);
   public static final edv u = a("set_lore", eeh.a);
   public static final edv v = a("fill_player_head", edp.a);
   public static final edv w = a("copy_nbt", edl.a);
   public static final edv x = a("copy_state", edj.a);
   public static final edv y = a("set_banner_pattern", eea.a);
   public static final edv z = a("set_potion", eek.a);
   public static final edv A = a("set_instrument", eee.a);
   public static final edv B = a("reference", edq.a);
   public static final edv C = a("sequence", edy.a);

   private static edv a(String $$0, Codec<? extends edu> $$1) {
      return hr.a(jb.H, new aer($$0), new edv($$1));
   }

   public static BiFunction<ciy, ech, ciy> a(List<? extends BiFunction<ciy, ech, ciy>> $$0) {
      List<BiFunction<ciy, ech, ciy>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<ciy, ech, ciy> $$2 = $$1.get(0);
            BiFunction<ciy, ech, ciy> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<ciy, ech, ciy> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

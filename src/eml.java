import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class eml {
   public static final BiFunction<cqm, ekw, cqm> a = ($$0, $$1) -> $$0;
   private static final Codec<emj> D = ki.G.q().dispatch("function", emj::b, emk::a);
   public static final Codec<emj> b = awe.a((Supplier<Codec<emj>>)(() -> awe.e(D, emn.b)));
   public static final emk c = a("set_count", emu.a);
   public static final emk d = a("enchant_with_levels", emc.a);
   public static final emk e = a("enchant_randomly", emb.a);
   public static final emk f = a("set_enchantments", ems.a);
   public static final emk g = a("set_nbt", emy.a);
   public static final emk h = a("furnace_smelt", enb.a);
   public static final emk i = a("looting_enchant", emm.b);
   public static final emk j = a("set_damage", emv.a);
   public static final emk k = a("set_attributes", emo.a);
   public static final emk l = a("set_name", emx.a);
   public static final emk m = a("exploration_map", emd.f);
   public static final emk n = a("set_stew_effect", ena.a);
   public static final emk o = a("copy_name", elz.a);
   public static final emk p = a("set_contents", emq.a);
   public static final emk q = a("limit_count", emh.a);
   public static final emk r = a("apply_bonus", elw.a);
   public static final emk s = a("set_loot_table", emr.a);
   public static final emk t = a("explosion_decay", elx.a);
   public static final emk u = a("set_lore", emw.a);
   public static final emk v = a("fill_player_head", eme.a);
   public static final emk w = a("copy_nbt", ema.a);
   public static final emk x = a("copy_state", ely.a);
   public static final emk y = a("set_banner_pattern", emp.a);
   public static final emk z = a("set_potion", emz.a);
   public static final emk A = a("set_instrument", emt.a);
   public static final emk B = a("reference", emf.a);
   public static final emk C = a("sequence", emn.a);

   private static emk a(String $$0, Codec<? extends emj> $$1) {
      return iy.a(ki.G, new ajh($$0), new emk($$1));
   }

   public static BiFunction<cqm, ekw, cqm> a(List<? extends BiFunction<cqm, ekw, cqm>> $$0) {
      List<BiFunction<cqm, ekw, cqm>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cqm, ekw, cqm> $$2 = $$1.get(0);
            BiFunction<cqm, ekw, cqm> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cqm, ekw, cqm> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

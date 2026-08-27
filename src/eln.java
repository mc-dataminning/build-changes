import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class eln {
   public static final BiFunction<cpq, ejy, cpq> a = ($$0, $$1) -> $$0;
   private static final Codec<ell> D = kh.G.q().dispatch("function", ell::b, elm::a);
   public static final Codec<ell> b = avu.a((Supplier<Codec<ell>>)(() -> avu.e(D, elp.b)));
   public static final elm c = a("set_count", elw.a);
   public static final elm d = a("enchant_with_levels", ele.a);
   public static final elm e = a("enchant_randomly", eld.a);
   public static final elm f = a("set_enchantments", elu.a);
   public static final elm g = a("set_nbt", ema.a);
   public static final elm h = a("furnace_smelt", emd.a);
   public static final elm i = a("looting_enchant", elo.b);
   public static final elm j = a("set_damage", elx.a);
   public static final elm k = a("set_attributes", elq.a);
   public static final elm l = a("set_name", elz.a);
   public static final elm m = a("exploration_map", elf.f);
   public static final elm n = a("set_stew_effect", emc.a);
   public static final elm o = a("copy_name", elb.a);
   public static final elm p = a("set_contents", els.a);
   public static final elm q = a("limit_count", elj.a);
   public static final elm r = a("apply_bonus", eky.a);
   public static final elm s = a("set_loot_table", elt.a);
   public static final elm t = a("explosion_decay", ekz.a);
   public static final elm u = a("set_lore", ely.a);
   public static final elm v = a("fill_player_head", elg.a);
   public static final elm w = a("copy_nbt", elc.a);
   public static final elm x = a("copy_state", ela.a);
   public static final elm y = a("set_banner_pattern", elr.a);
   public static final elm z = a("set_potion", emb.a);
   public static final elm A = a("set_instrument", elv.a);
   public static final elm B = a("reference", elh.a);
   public static final elm C = a("sequence", elp.a);

   private static elm a(String $$0, Codec<? extends ell> $$1) {
      return ix.a(kh.G, new ajc($$0), new elm($$1));
   }

   public static BiFunction<cpq, ejy, cpq> a(List<? extends BiFunction<cpq, ejy, cpq>> $$0) {
      List<BiFunction<cpq, ejy, cpq>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<cpq, ejy, cpq> $$2 = $$1.get(0);
            BiFunction<cpq, ejy, cpq> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
         for (BiFunction<cpq, ejy, cpq> $$3x : $$1) {
            $$1x = $$3x.apply($$1x, $$2x);
         }

         return $$1x;
      };
      };
   }
}

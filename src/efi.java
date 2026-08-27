import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class efi {
   private static final Codec<efg> t = jb.I.q().dispatch("condition", efg::b, efh::a);
   public static final Codec<efg> a = aqy.a((Supplier<Codec<efg>>)(() -> aqy.c(t, eeu.b)));
   public static final efh b = a("inverted", efd.a);
   public static final efh c = a("any_of", eev.a);
   public static final efh d = a("all_of", eeu.a);
   public static final efh e = a("random_chance", efl.a);
   public static final efh f = a("random_chance_with_looting", efm.a);
   public static final efh g = a("entity_properties", efj.a);
   public static final efh h = a("killed_by_player", efk.a);
   public static final efh i = a("entity_scores", efb.a);
   public static final efh j = a("block_state_property", eff.a);
   public static final efh k = a("match_tool", efn.a);
   public static final efh l = a("table_bonus", eew.a);
   public static final efh m = a("survives_explosion", efc.a);
   public static final efh n = a("damage_source_properties", efa.a);
   public static final efh o = a("location_check", efe.a);
   public static final efh p = a("weather_check", efq.a);
   public static final efh q = a("reference", eey.a);
   public static final efh r = a("time_check", efo.a);
   public static final efh s = a("value_check", efp.a);

   private static efh a(String $$0, Codec<? extends efg> $$1) {
      return hr.a(jb.I, new aer($$0), new efh($$1));
   }

   public static <T> Predicate<T> a(List<? extends Predicate<T>> $$0) {
      List<Predicate<T>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> $$0x -> true;
         case 1 -> (Predicate)$$1.get(0);
         case 2 -> $$1.get(0).and($$1.get(1));
         default -> $$1x -> {
         for (Predicate<T> $$2 : $$1) {
            if (!$$2.test((T)$$1x)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static <T> Predicate<T> b(List<? extends Predicate<T>> $$0) {
      List<Predicate<T>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> $$0x -> false;
         case 1 -> (Predicate)$$1.get(0);
         case 2 -> $$1.get(0).or($$1.get(1));
         default -> $$1x -> {
         for (Predicate<T> $$2 : $$1) {
            if ($$2.test((T)$$1x)) {
               return true;
            }
         }

         return false;
      };
      };
   }
}

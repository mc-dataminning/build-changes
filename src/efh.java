import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class efh {
   private static final Codec<eff> t = jb.I.q().dispatch("condition", eff::b, efg::a);
   public static final Codec<eff> a = aqy.a((Supplier<Codec<eff>>)(() -> aqy.c(t, eet.b)));
   public static final efg b = a("inverted", efc.a);
   public static final efg c = a("any_of", eeu.a);
   public static final efg d = a("all_of", eet.a);
   public static final efg e = a("random_chance", efk.a);
   public static final efg f = a("random_chance_with_looting", efl.a);
   public static final efg g = a("entity_properties", efi.a);
   public static final efg h = a("killed_by_player", efj.a);
   public static final efg i = a("entity_scores", efa.a);
   public static final efg j = a("block_state_property", efe.a);
   public static final efg k = a("match_tool", efm.a);
   public static final efg l = a("table_bonus", eev.a);
   public static final efg m = a("survives_explosion", efb.a);
   public static final efg n = a("damage_source_properties", eez.a);
   public static final efg o = a("location_check", efd.a);
   public static final efg p = a("weather_check", efp.a);
   public static final efg q = a("reference", eex.a);
   public static final efg r = a("time_check", efn.a);
   public static final efg s = a("value_check", efo.a);

   private static efg a(String $$0, Codec<? extends eff> $$1) {
      return hr.a(jb.I, new aer($$0), new efg($$1));
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

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class efm {
   private static final Codec<efk> t = jd.I.q().dispatch("condition", efk::b, efl::a);
   public static final Codec<efk> a = arb.a((Supplier<Codec<efk>>)(() -> arb.e(t, eey.b)));
   public static final efl b = a("inverted", efh.a);
   public static final efl c = a("any_of", eez.a);
   public static final efl d = a("all_of", eey.a);
   public static final efl e = a("random_chance", efp.a);
   public static final efl f = a("random_chance_with_looting", efq.a);
   public static final efl g = a("entity_properties", efn.a);
   public static final efl h = a("killed_by_player", efo.a);
   public static final efl i = a("entity_scores", eff.a);
   public static final efl j = a("block_state_property", efj.a);
   public static final efl k = a("match_tool", efr.a);
   public static final efl l = a("table_bonus", efa.a);
   public static final efl m = a("survives_explosion", efg.a);
   public static final efl n = a("damage_source_properties", efe.a);
   public static final efl o = a("location_check", efi.a);
   public static final efl p = a("weather_check", efu.a);
   public static final efl q = a("reference", efc.a);
   public static final efl r = a("time_check", efs.a);
   public static final efl s = a("value_check", eft.a);

   private static efl a(String $$0, Codec<? extends efk> $$1) {
      return ht.a(jd.I, new aeu($$0), new efl($$1));
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

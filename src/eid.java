import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class eid {
   private static final Codec<eib> t = kc.I.q().dispatch("condition", eib::b, eic::a);
   public static final Codec<eib> a = asy.a((Supplier<Codec<eib>>)(() -> asy.e(t, ehp.b)));
   public static final eic b = a("inverted", ehy.a);
   public static final eic c = a("any_of", ehq.a);
   public static final eic d = a("all_of", ehp.a);
   public static final eic e = a("random_chance", eig.a);
   public static final eic f = a("random_chance_with_looting", eih.a);
   public static final eic g = a("entity_properties", eie.a);
   public static final eic h = a("killed_by_player", eif.a);
   public static final eic i = a("entity_scores", ehw.a);
   public static final eic j = a("block_state_property", eia.a);
   public static final eic k = a("match_tool", eii.a);
   public static final eic l = a("table_bonus", ehr.a);
   public static final eic m = a("survives_explosion", ehx.a);
   public static final eic n = a("damage_source_properties", ehv.a);
   public static final eic o = a("location_check", ehz.a);
   public static final eic p = a("weather_check", eil.a);
   public static final eic q = a("reference", eht.a);
   public static final eic r = a("time_check", eij.a);
   public static final eic s = a("value_check", eik.a);

   private static eic a(String $$0, Codec<? extends eib> $$1) {
      return is.a(kc.I, new agm($$0), new eic($$1));
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

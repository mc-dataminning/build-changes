import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ehm {
   private static final Codec<ehk> t = jy.I.q().dispatch("condition", ehk::b, ehl::a);
   public static final Codec<ehk> a = asq.a((Supplier<Codec<ehk>>)(() -> asq.e(t, egy.b)));
   public static final ehl b = a("inverted", ehh.a);
   public static final ehl c = a("any_of", egz.a);
   public static final ehl d = a("all_of", egy.a);
   public static final ehl e = a("random_chance", ehp.a);
   public static final ehl f = a("random_chance_with_looting", ehq.a);
   public static final ehl g = a("entity_properties", ehn.a);
   public static final ehl h = a("killed_by_player", eho.a);
   public static final ehl i = a("entity_scores", ehf.a);
   public static final ehl j = a("block_state_property", ehj.a);
   public static final ehl k = a("match_tool", ehr.a);
   public static final ehl l = a("table_bonus", eha.a);
   public static final ehl m = a("survives_explosion", ehg.a);
   public static final ehl n = a("damage_source_properties", ehe.a);
   public static final ehl o = a("location_check", ehi.a);
   public static final ehl p = a("weather_check", ehu.a);
   public static final ehl q = a("reference", ehc.a);
   public static final ehl r = a("time_check", ehs.a);
   public static final ehl s = a("value_check", eht.a);

   private static ehl a(String $$0, Codec<? extends ehk> $$1) {
      return io.a(jy.I, new agg($$0), new ehl($$1));
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

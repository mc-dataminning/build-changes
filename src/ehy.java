import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ehy {
   private static final Codec<ehw> t = jy.I.q().dispatch("condition", ehw::b, ehx::a);
   public static final Codec<ehw> a = asu.a((Supplier<Codec<ehw>>)(() -> asu.e(t, ehk.b)));
   public static final ehx b = a("inverted", eht.a);
   public static final ehx c = a("any_of", ehl.a);
   public static final ehx d = a("all_of", ehk.a);
   public static final ehx e = a("random_chance", eib.a);
   public static final ehx f = a("random_chance_with_looting", eic.a);
   public static final ehx g = a("entity_properties", ehz.a);
   public static final ehx h = a("killed_by_player", eia.a);
   public static final ehx i = a("entity_scores", ehr.a);
   public static final ehx j = a("block_state_property", ehv.a);
   public static final ehx k = a("match_tool", eid.a);
   public static final ehx l = a("table_bonus", ehm.a);
   public static final ehx m = a("survives_explosion", ehs.a);
   public static final ehx n = a("damage_source_properties", ehq.a);
   public static final ehx o = a("location_check", ehu.a);
   public static final ehx p = a("weather_check", eig.a);
   public static final ehx q = a("reference", eho.a);
   public static final ehx r = a("time_check", eie.a);
   public static final ehx s = a("value_check", eif.a);

   private static ehx a(String $$0, Codec<? extends ehw> $$1) {
      return io.a(jy.I, new agi($$0), new ehx($$1));
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

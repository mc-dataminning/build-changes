import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ekg {
   private static final Codec<eke> t = kd.H.q().dispatch("condition", eke::b, ekf::a);
   public static final Codec<eke> a = atx.a((Supplier<Codec<eke>>)(() -> atx.e(t, ejs.b)));
   public static final ekf b = a("inverted", ekb.a);
   public static final ekf c = a("any_of", ejt.a);
   public static final ekf d = a("all_of", ejs.a);
   public static final ekf e = a("random_chance", ekj.a);
   public static final ekf f = a("random_chance_with_looting", ekk.a);
   public static final ekf g = a("entity_properties", ekh.a);
   public static final ekf h = a("killed_by_player", eki.a);
   public static final ekf i = a("entity_scores", ejz.a);
   public static final ekf j = a("block_state_property", ekd.a);
   public static final ekf k = a("match_tool", ekl.a);
   public static final ekf l = a("table_bonus", eju.a);
   public static final ekf m = a("survives_explosion", eka.a);
   public static final ekf n = a("damage_source_properties", ejy.a);
   public static final ekf o = a("location_check", ekc.a);
   public static final ekf p = a("weather_check", eko.a);
   public static final ekf q = a("reference", ejw.a);
   public static final ekf r = a("time_check", ekm.a);
   public static final ekf s = a("value_check", ekn.a);

   private static ekf a(String $$0, Codec<? extends eke> $$1) {
      return it.a(kd.H, new ahh($$0), new ekf($$1));
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

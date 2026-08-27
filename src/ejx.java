import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ejx {
   private static final Codec<ejv> t = kd.H.q().dispatch("condition", ejv::b, ejw::a);
   public static final Codec<ejv> a = atw.a((Supplier<Codec<ejv>>)(() -> atw.e(t, ejj.b)));
   public static final ejw b = a("inverted", ejs.a);
   public static final ejw c = a("any_of", ejk.a);
   public static final ejw d = a("all_of", ejj.a);
   public static final ejw e = a("random_chance", eka.a);
   public static final ejw f = a("random_chance_with_looting", ekb.a);
   public static final ejw g = a("entity_properties", ejy.a);
   public static final ejw h = a("killed_by_player", ejz.a);
   public static final ejw i = a("entity_scores", ejq.a);
   public static final ejw j = a("block_state_property", eju.a);
   public static final ejw k = a("match_tool", ekc.a);
   public static final ejw l = a("table_bonus", ejl.a);
   public static final ejw m = a("survives_explosion", ejr.a);
   public static final ejw n = a("damage_source_properties", ejp.a);
   public static final ejw o = a("location_check", ejt.a);
   public static final ejw p = a("weather_check", ekf.a);
   public static final ejw q = a("reference", ejn.a);
   public static final ejw r = a("time_check", ekd.a);
   public static final ejw s = a("value_check", eke.a);

   private static ejw a(String $$0, Codec<? extends ejv> $$1) {
      return it.a(kd.H, new ahg($$0), new ejw($$1));
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

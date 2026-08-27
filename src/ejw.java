import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ejw {
   private static final Codec<eju> t = kd.H.q().dispatch("condition", eju::b, ejv::a);
   public static final Codec<eju> a = atv.a((Supplier<Codec<eju>>)(() -> atv.e(t, eji.b)));
   public static final ejv b = a("inverted", ejr.a);
   public static final ejv c = a("any_of", ejj.a);
   public static final ejv d = a("all_of", eji.a);
   public static final ejv e = a("random_chance", ejz.a);
   public static final ejv f = a("random_chance_with_looting", eka.a);
   public static final ejv g = a("entity_properties", ejx.a);
   public static final ejv h = a("killed_by_player", ejy.a);
   public static final ejv i = a("entity_scores", ejp.a);
   public static final ejv j = a("block_state_property", ejt.a);
   public static final ejv k = a("match_tool", ekb.a);
   public static final ejv l = a("table_bonus", ejk.a);
   public static final ejv m = a("survives_explosion", ejq.a);
   public static final ejv n = a("damage_source_properties", ejo.a);
   public static final ejv o = a("location_check", ejs.a);
   public static final ejv p = a("weather_check", eke.a);
   public static final ejv q = a("reference", ejm.a);
   public static final ejv r = a("time_check", ekc.a);
   public static final ejv s = a("value_check", ekd.a);

   private static ejv a(String $$0, Codec<? extends eju> $$1) {
      return it.a(kd.H, new ahg($$0), new ejv($$1));
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

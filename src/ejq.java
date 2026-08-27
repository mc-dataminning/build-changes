import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ejq {
   private static final Codec<ejo> t = kd.H.q().dispatch("condition", ejo::b, ejp::a);
   public static final Codec<ejo> a = atq.a((Supplier<Codec<ejo>>)(() -> atq.e(t, ejc.b)));
   public static final ejp b = a("inverted", ejl.a);
   public static final ejp c = a("any_of", ejd.a);
   public static final ejp d = a("all_of", ejc.a);
   public static final ejp e = a("random_chance", ejt.a);
   public static final ejp f = a("random_chance_with_looting", eju.a);
   public static final ejp g = a("entity_properties", ejr.a);
   public static final ejp h = a("killed_by_player", ejs.a);
   public static final ejp i = a("entity_scores", ejj.a);
   public static final ejp j = a("block_state_property", ejn.a);
   public static final ejp k = a("match_tool", ejv.a);
   public static final ejp l = a("table_bonus", eje.a);
   public static final ejp m = a("survives_explosion", ejk.a);
   public static final ejp n = a("damage_source_properties", eji.a);
   public static final ejp o = a("location_check", ejm.a);
   public static final ejp p = a("weather_check", ejy.a);
   public static final ejp q = a("reference", ejg.a);
   public static final ejp r = a("time_check", ejw.a);
   public static final ejp s = a("value_check", ejx.a);

   private static ejp a(String $$0, Codec<? extends ejo> $$1) {
      return it.a(kd.H, new ahd($$0), new ejp($$1));
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

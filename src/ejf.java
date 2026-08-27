import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ejf {
   private static final Codec<ejd> t = kb.H.q().dispatch("condition", ejd::b, eje::a);
   public static final Codec<ejd> a = atg.a((Supplier<Codec<ejd>>)(() -> atg.e(t, eir.b)));
   public static final eje b = a("inverted", eja.a);
   public static final eje c = a("any_of", eis.a);
   public static final eje d = a("all_of", eir.a);
   public static final eje e = a("random_chance", eji.a);
   public static final eje f = a("random_chance_with_looting", ejj.a);
   public static final eje g = a("entity_properties", ejg.a);
   public static final eje h = a("killed_by_player", ejh.a);
   public static final eje i = a("entity_scores", eiy.a);
   public static final eje j = a("block_state_property", ejc.a);
   public static final eje k = a("match_tool", ejk.a);
   public static final eje l = a("table_bonus", eit.a);
   public static final eje m = a("survives_explosion", eiz.a);
   public static final eje n = a("damage_source_properties", eix.a);
   public static final eje o = a("location_check", ejb.a);
   public static final eje p = a("weather_check", ejn.a);
   public static final eje q = a("reference", eiv.a);
   public static final eje r = a("time_check", ejl.a);
   public static final eje s = a("value_check", ejm.a);

   private static eje a(String $$0, Codec<? extends ejd> $$1) {
      return ir.a(kb.H, new agt($$0), new eje($$1));
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

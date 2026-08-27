import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class eft {
   private static final Codec<efr> t = jd.I.q().dispatch("condition", efr::b, efs::a);
   public static final Codec<efr> a = arh.a((Supplier<Codec<efr>>)(() -> arh.e(t, eff.b)));
   public static final efs b = a("inverted", efo.a);
   public static final efs c = a("any_of", efg.a);
   public static final efs d = a("all_of", eff.a);
   public static final efs e = a("random_chance", efw.a);
   public static final efs f = a("random_chance_with_looting", efx.a);
   public static final efs g = a("entity_properties", efu.a);
   public static final efs h = a("killed_by_player", efv.a);
   public static final efs i = a("entity_scores", efm.a);
   public static final efs j = a("block_state_property", efq.a);
   public static final efs k = a("match_tool", efy.a);
   public static final efs l = a("table_bonus", efh.a);
   public static final efs m = a("survives_explosion", efn.a);
   public static final efs n = a("damage_source_properties", efl.a);
   public static final efs o = a("location_check", efp.a);
   public static final efs p = a("weather_check", egb.a);
   public static final efs q = a("reference", efj.a);
   public static final efs r = a("time_check", efz.a);
   public static final efs s = a("value_check", ega.a);

   private static efs a(String $$0, Codec<? extends efr> $$1) {
      return ht.a(jd.I, new aey($$0), new efs($$1));
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

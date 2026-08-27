import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class efr {
   private static final Codec<efp> t = jb.I.q().dispatch("condition", efp::b, efq::a);
   public static final Codec<efp> a = arf.a((Supplier<Codec<efp>>)(() -> arf.e(t, efd.b)));
   public static final efq b = a("inverted", efm.a);
   public static final efq c = a("any_of", efe.a);
   public static final efq d = a("all_of", efd.a);
   public static final efq e = a("random_chance", efu.a);
   public static final efq f = a("random_chance_with_looting", efv.a);
   public static final efq g = a("entity_properties", efs.a);
   public static final efq h = a("killed_by_player", eft.a);
   public static final efq i = a("entity_scores", efk.a);
   public static final efq j = a("block_state_property", efo.a);
   public static final efq k = a("match_tool", efw.a);
   public static final efq l = a("table_bonus", eff.a);
   public static final efq m = a("survives_explosion", efl.a);
   public static final efq n = a("damage_source_properties", efj.a);
   public static final efq o = a("location_check", efn.a);
   public static final efq p = a("weather_check", efz.a);
   public static final efq q = a("reference", efh.a);
   public static final efq r = a("time_check", efx.a);
   public static final efq s = a("value_check", efy.a);

   private static efq a(String $$0, Codec<? extends efp> $$1) {
      return hq.a(jb.I, new aew($$0), new efq($$1));
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

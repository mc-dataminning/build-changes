import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class efl {
   private static final Codec<efj> t = jb.I.q().dispatch("condition", efj::b, efk::a);
   public static final Codec<efj> a = arj.a((Supplier<Codec<efj>>)(() -> arj.e(t, eex.b)));
   public static final efk b = a("inverted", efg.a);
   public static final efk c = a("any_of", eey.a);
   public static final efk d = a("all_of", eex.a);
   public static final efk e = a("random_chance", efo.a);
   public static final efk f = a("random_chance_with_looting", efp.a);
   public static final efk g = a("entity_properties", efm.a);
   public static final efk h = a("killed_by_player", efn.a);
   public static final efk i = a("entity_scores", efe.a);
   public static final efk j = a("block_state_property", efi.a);
   public static final efk k = a("match_tool", efq.a);
   public static final efk l = a("table_bonus", eez.a);
   public static final efk m = a("survives_explosion", eff.a);
   public static final efk n = a("damage_source_properties", efd.a);
   public static final efk o = a("location_check", efh.a);
   public static final efk p = a("weather_check", eft.a);
   public static final efk q = a("reference", efb.a);
   public static final efk r = a("time_check", efr.a);
   public static final efk s = a("value_check", efs.a);

   private static efk a(String $$0, Codec<? extends efj> $$1) {
      return hq.a(jb.I, new aez($$0), new efk($$1));
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

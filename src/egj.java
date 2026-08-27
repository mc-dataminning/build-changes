import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class egj {
   private static final Codec<egh> t = jy.I.q().dispatch("condition", egh::b, egi::a);
   public static final Codec<egh> a = asg.a((Supplier<Codec<egh>>)(() -> asg.e(t, efv.b)));
   public static final egi b = a("inverted", ege.a);
   public static final egi c = a("any_of", efw.a);
   public static final egi d = a("all_of", efv.a);
   public static final egi e = a("random_chance", egm.a);
   public static final egi f = a("random_chance_with_looting", egn.a);
   public static final egi g = a("entity_properties", egk.a);
   public static final egi h = a("killed_by_player", egl.a);
   public static final egi i = a("entity_scores", egc.a);
   public static final egi j = a("block_state_property", egg.a);
   public static final egi k = a("match_tool", ego.a);
   public static final egi l = a("table_bonus", efx.a);
   public static final egi m = a("survives_explosion", egd.a);
   public static final egi n = a("damage_source_properties", egb.a);
   public static final egi o = a("location_check", egf.a);
   public static final egi p = a("weather_check", egr.a);
   public static final egi q = a("reference", efz.a);
   public static final egi r = a("time_check", egp.a);
   public static final egi s = a("value_check", egq.a);

   private static egi a(String $$0, Codec<? extends egh> $$1) {
      return io.a(jy.I, new afw($$0), new egi($$1));
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

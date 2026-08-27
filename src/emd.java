import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class emd {
   private static final Codec<emb> t = kf.H.q().dispatch("condition", emb::b, emc::a);
   public static final Codec<emb> a = avq.a((Supplier<Codec<emb>>)(() -> avq.e(t, elp.b)));
   public static final emc b = a("inverted", ely.a);
   public static final emc c = a("any_of", elq.a);
   public static final emc d = a("all_of", elp.a);
   public static final emc e = a("random_chance", emg.a);
   public static final emc f = a("random_chance_with_looting", emh.a);
   public static final emc g = a("entity_properties", eme.a);
   public static final emc h = a("killed_by_player", emf.a);
   public static final emc i = a("entity_scores", elw.a);
   public static final emc j = a("block_state_property", ema.a);
   public static final emc k = a("match_tool", emi.a);
   public static final emc l = a("table_bonus", elr.a);
   public static final emc m = a("survives_explosion", elx.a);
   public static final emc n = a("damage_source_properties", elv.a);
   public static final emc o = a("location_check", elz.a);
   public static final emc p = a("weather_check", eml.a);
   public static final emc q = a("reference", elt.a);
   public static final emc r = a("time_check", emj.a);
   public static final emc s = a("value_check", emk.a);

   private static emc a(String $$0, Codec<? extends emb> $$1) {
      return iv.a(kf.H, new aiy($$0), new emc($$1));
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

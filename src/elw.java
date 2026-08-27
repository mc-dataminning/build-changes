import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class elw {
   private static final Codec<elu> t = kf.H.q().dispatch("condition", elu::b, elv::a);
   public static final Codec<elu> a = avp.a((Supplier<Codec<elu>>)(() -> avp.e(t, eli.b)));
   public static final elv b = a("inverted", elr.a);
   public static final elv c = a("any_of", elj.a);
   public static final elv d = a("all_of", eli.a);
   public static final elv e = a("random_chance", elz.a);
   public static final elv f = a("random_chance_with_looting", ema.a);
   public static final elv g = a("entity_properties", elx.a);
   public static final elv h = a("killed_by_player", ely.a);
   public static final elv i = a("entity_scores", elp.a);
   public static final elv j = a("block_state_property", elt.a);
   public static final elv k = a("match_tool", emb.a);
   public static final elv l = a("table_bonus", elk.a);
   public static final elv m = a("survives_explosion", elq.a);
   public static final elv n = a("damage_source_properties", elo.a);
   public static final elv o = a("location_check", els.a);
   public static final elv p = a("weather_check", eme.a);
   public static final elv q = a("reference", elm.a);
   public static final elv r = a("time_check", emc.a);
   public static final elv s = a("value_check", emd.a);

   private static elv a(String $$0, Codec<? extends elu> $$1) {
      return iv.a(kf.H, new aiy($$0), new elv($$1));
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

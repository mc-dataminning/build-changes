import java.util.function.Predicate;

public class efj {
   public static final efi a = a("inverted", new efe.a());
   public static final efi b = a("any_of", new eew.b());
   public static final efi c = a("all_of", new eev.b());
   public static final efi d = a("random_chance", new efm.a());
   public static final efi e = a("random_chance_with_looting", new efn.a());
   public static final efi f = a("entity_properties", new efk.a());
   public static final efi g = a("killed_by_player", new efl.a());
   public static final efi h = a("entity_scores", new efc.b());
   public static final efi i = a("block_state_property", new efg.b());
   public static final efi j = a("match_tool", new efo.a());
   public static final efi k = a("table_bonus", new eex.a());
   public static final efi l = a("survives_explosion", new efd.a());
   public static final efi m = a("damage_source_properties", new efb.a());
   public static final efi n = a("location_check", new eff.a());
   public static final efi o = a("weather_check", new efr.b());
   public static final efi p = a("reference", new eez.a());
   public static final efi q = a("time_check", new efp.b());
   public static final efi r = a("value_check", new efq.a());

   private static efi a(String $$0, ecq<? extends efh> $$1) {
      return hs.a(jc.I, new aep($$0), new efi($$1));
   }

   public static Object a() {
      return ecf.a(jc.I, "condition", "condition", efh::b).a();
   }

   public static <T> Predicate<T> a(Predicate<T>[] $$0) {
      return switch ($$0.length) {
         case 0 -> $$0x -> true;
         case 1 -> $$0[0];
         case 2 -> $$0[0].and($$0[1]);
         default -> $$1 -> {
         for (Predicate<T> $$2 : $$0) {
            if (!$$2.test((T)$$1)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static <T> Predicate<T> b(Predicate<T>[] $$0) {
      return switch ($$0.length) {
         case 0 -> $$0x -> false;
         case 1 -> $$0[0];
         case 2 -> $$0[0].or($$0[1]);
         default -> $$1 -> {
         for (Predicate<T> $$2 : $$0) {
            if ($$2.test((T)$$1)) {
               return true;
            }
         }

         return false;
      };
      };
   }
}

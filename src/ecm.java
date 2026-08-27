import java.util.function.Predicate;

public class ecm {
   public static final ecl a = a("inverted", new ech.a());
   public static final ecl b = a("any_of", new ebz.b());
   public static final ecl c = a("all_of", new eby.b());
   public static final ecl d = a("random_chance", new ecp.a());
   public static final ecl e = a("random_chance_with_looting", new ecq.a());
   public static final ecl f = a("entity_properties", new ecn.a());
   public static final ecl g = a("killed_by_player", new eco.a());
   public static final ecl h = a("entity_scores", new ecf.b());
   public static final ecl i = a("block_state_property", new ecj.b());
   public static final ecl j = a("match_tool", new ecr.a());
   public static final ecl k = a("table_bonus", new eca.a());
   public static final ecl l = a("survives_explosion", new ecg.a());
   public static final ecl m = a("damage_source_properties", new ece.a());
   public static final ecl n = a("location_check", new eci.a());
   public static final ecl o = a("weather_check", new ecu.b());
   public static final ecl p = a("reference", new ecc.a());
   public static final ecl q = a("time_check", new ecs.b());
   public static final ecl r = a("value_check", new ect.a());

   private static ecl a(String $$0, dzt<? extends eck> $$1) {
      return hr.a(jb.I, new acq($$0), new ecl($$1));
   }

   public static Object a() {
      return dzi.a(jb.I, "condition", "condition", eck::b).a();
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

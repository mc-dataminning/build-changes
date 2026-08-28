import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class csf {
   public static final jm<cse> a = a("leather", ad.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 1);
      $$0.put(csd.a.c, 2);
      $$0.put(csd.a.b, 3);
      $$0.put(csd.a.a, 1);
      $$0.put(csd.a.e, 3);
   }), 15, avo.av, 0.0F, 0.0F, () -> cyu.a(cur.qD), List.of(new cse.a(akq.b("leather"), "", true), new cse.a(akq.b("leather"), "_overlay", false)));
   public static final jm<cse> b = a("chainmail", ad.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 1);
      $$0.put(csd.a.c, 4);
      $$0.put(csd.a.b, 5);
      $$0.put(csd.a.a, 2);
      $$0.put(csd.a.e, 4);
   }), 12, avo.ap, 0.0F, 0.0F, () -> cyu.a(cur.oF));
   public static final jm<cse> c = a("iron", ad.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 2);
      $$0.put(csd.a.c, 5);
      $$0.put(csd.a.b, 6);
      $$0.put(csd.a.a, 2);
      $$0.put(csd.a.e, 5);
   }), 9, avo.au, 0.0F, 0.0F, () -> cyu.a(cur.oF));
   public static final jm<cse> d = a("gold", ad.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 1);
      $$0.put(csd.a.c, 3);
      $$0.put(csd.a.b, 5);
      $$0.put(csd.a.a, 2);
      $$0.put(csd.a.e, 7);
   }), 25, avo.at, 0.0F, 0.0F, () -> cyu.a(cur.oJ));
   public static final jm<cse> e = a("diamond", ad.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 3);
      $$0.put(csd.a.c, 6);
      $$0.put(csd.a.b, 8);
      $$0.put(csd.a.a, 3);
      $$0.put(csd.a.e, 11);
   }), 10, avo.aq, 2.0F, 0.0F, () -> cyu.a(cur.oz));
   public static final jm<cse> f = a("turtle", ad.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 2);
      $$0.put(csd.a.c, 5);
      $$0.put(csd.a.b, 6);
      $$0.put(csd.a.a, 2);
      $$0.put(csd.a.e, 5);
   }), 9, avo.ax, 0.0F, 0.0F, () -> cyu.a(cur.op));
   public static final jm<cse> g = a("netherite", ad.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 3);
      $$0.put(csd.a.c, 6);
      $$0.put(csd.a.b, 8);
      $$0.put(csd.a.a, 3);
      $$0.put(csd.a.e, 11);
   }), 15, avo.aw, 3.0F, 0.1F, () -> cyu.a(cur.oK));
   public static final jm<cse> h = a("armadillo", ad.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 3);
      $$0.put(csd.a.c, 6);
      $$0.put(csd.a.b, 8);
      $$0.put(csd.a.a, 3);
      $$0.put(csd.a.e, 11);
   }), 10, avo.ay, 0.0F, 0.0F, () -> cyu.a(cur.oq));

   public static jm<cse> a(jz<cse> $$0) {
      return a;
   }

   private static jm<cse> a(String $$0, EnumMap<csd.a, Integer> $$1, int $$2, jm<avn> $$3, float $$4, float $$5, Supplier<cyu> $$6) {
      List<cse.a> $$7 = List.of(new cse.a(akq.b($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static jm<cse> a(String $$0, EnumMap<csd.a, Integer> $$1, int $$2, jm<avn> $$3, float $$4, float $$5, Supplier<cyu> $$6, List<cse.a> $$7) {
      EnumMap<csd.a, Integer> $$8 = new EnumMap<>(csd.a.class);

      for (csd.a $$9 : csd.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return jz.b(lt.ap, akq.b($$0), new cse($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

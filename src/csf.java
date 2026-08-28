import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class csf {
   public static final ji<cse> a = a("leather", ac.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 1);
      $$0.put(csd.a.c, 2);
      $$0.put(csd.a.b, 3);
      $$0.put(csd.a.a, 1);
      $$0.put(csd.a.e, 3);
   }), 15, avz.av, 0.0F, 0.0F, () -> cyr.a(cur.qD), List.of(new cse.a(new ale("leather"), "", true), new cse.a(new ale("leather"), "_overlay", false)));
   public static final ji<cse> b = a("chainmail", ac.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 1);
      $$0.put(csd.a.c, 4);
      $$0.put(csd.a.b, 5);
      $$0.put(csd.a.a, 2);
      $$0.put(csd.a.e, 4);
   }), 12, avz.ap, 0.0F, 0.0F, () -> cyr.a(cur.oE));
   public static final ji<cse> c = a("iron", ac.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 2);
      $$0.put(csd.a.c, 5);
      $$0.put(csd.a.b, 6);
      $$0.put(csd.a.a, 2);
      $$0.put(csd.a.e, 5);
   }), 9, avz.au, 0.0F, 0.0F, () -> cyr.a(cur.oE));
   public static final ji<cse> d = a("gold", ac.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 1);
      $$0.put(csd.a.c, 3);
      $$0.put(csd.a.b, 5);
      $$0.put(csd.a.a, 2);
      $$0.put(csd.a.e, 7);
   }), 25, avz.at, 0.0F, 0.0F, () -> cyr.a(cur.oI));
   public static final ji<cse> e = a("diamond", ac.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 3);
      $$0.put(csd.a.c, 6);
      $$0.put(csd.a.b, 8);
      $$0.put(csd.a.a, 3);
      $$0.put(csd.a.e, 11);
   }), 10, avz.aq, 2.0F, 0.0F, () -> cyr.a(cur.oy));
   public static final ji<cse> f = a("turtle", ac.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 2);
      $$0.put(csd.a.c, 5);
      $$0.put(csd.a.b, 6);
      $$0.put(csd.a.a, 2);
      $$0.put(csd.a.e, 5);
   }), 9, avz.ax, 0.0F, 0.0F, () -> cyr.a(cur.op));
   public static final ji<cse> g = a("netherite", ac.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 3);
      $$0.put(csd.a.c, 6);
      $$0.put(csd.a.b, 8);
      $$0.put(csd.a.a, 3);
      $$0.put(csd.a.e, 11);
   }), 15, avz.aw, 3.0F, 0.1F, () -> cyr.a(cur.oJ));
   public static final ji<cse> h = a("armadillo", ac.a(new EnumMap<>(csd.a.class), $$0 -> {
      $$0.put(csd.a.d, 3);
      $$0.put(csd.a.c, 6);
      $$0.put(csd.a.b, 8);
      $$0.put(csd.a.a, 3);
      $$0.put(csd.a.e, 11);
   }), 10, avz.ay, 0.0F, 0.0F, () -> cyr.a(cur.oq));

   public static ji<cse> a(jv<cse> $$0) {
      return a;
   }

   private static ji<cse> a(String $$0, EnumMap<csd.a, Integer> $$1, int $$2, ji<avy> $$3, float $$4, float $$5, Supplier<cyr> $$6) {
      List<cse.a> $$7 = List.of(new cse.a(new ale($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ji<cse> a(String $$0, EnumMap<csd.a, Integer> $$1, int $$2, ji<avy> $$3, float $$4, float $$5, Supplier<cyr> $$6, List<cse.a> $$7) {
      EnumMap<csd.a, Integer> $$8 = new EnumMap<>(csd.a.class);

      for (csd.a $$9 : csd.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return jv.b(lp.ar, new ale($$0), new cse($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

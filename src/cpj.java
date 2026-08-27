import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class cpj {
   public static final in<cpi> a = a("leather", ac.a(new EnumMap<>(cph.a.class), $$0 -> {
      $$0.put(cph.a.d, 1);
      $$0.put(cph.a.c, 2);
      $$0.put(cph.a.b, 3);
      $$0.put(cph.a.a, 1);
      $$0.put(cph.a.e, 3);
   }), 15, auo.av, 0.0F, 0.0F, () -> cvp.a(crv.qC), List.of(new cpi.a(new ajv("leather"), "", true), new cpi.a(new ajv("leather"), "_overlay", false)));
   public static final in<cpi> b = a("chainmail", ac.a(new EnumMap<>(cph.a.class), $$0 -> {
      $$0.put(cph.a.d, 1);
      $$0.put(cph.a.c, 4);
      $$0.put(cph.a.b, 5);
      $$0.put(cph.a.a, 2);
      $$0.put(cph.a.e, 4);
   }), 12, auo.ap, 0.0F, 0.0F, () -> cvp.a(crv.oD));
   public static final in<cpi> c = a("iron", ac.a(new EnumMap<>(cph.a.class), $$0 -> {
      $$0.put(cph.a.d, 2);
      $$0.put(cph.a.c, 5);
      $$0.put(cph.a.b, 6);
      $$0.put(cph.a.a, 2);
      $$0.put(cph.a.e, 5);
   }), 9, auo.au, 0.0F, 0.0F, () -> cvp.a(crv.oD));
   public static final in<cpi> d = a("gold", ac.a(new EnumMap<>(cph.a.class), $$0 -> {
      $$0.put(cph.a.d, 1);
      $$0.put(cph.a.c, 3);
      $$0.put(cph.a.b, 5);
      $$0.put(cph.a.a, 2);
      $$0.put(cph.a.e, 7);
   }), 25, auo.at, 0.0F, 0.0F, () -> cvp.a(crv.oH));
   public static final in<cpi> e = a("diamond", ac.a(new EnumMap<>(cph.a.class), $$0 -> {
      $$0.put(cph.a.d, 3);
      $$0.put(cph.a.c, 6);
      $$0.put(cph.a.b, 8);
      $$0.put(cph.a.a, 3);
      $$0.put(cph.a.e, 11);
   }), 10, auo.aq, 2.0F, 0.0F, () -> cvp.a(crv.ox));
   public static final in<cpi> f = a("turtle", ac.a(new EnumMap<>(cph.a.class), $$0 -> {
      $$0.put(cph.a.d, 2);
      $$0.put(cph.a.c, 5);
      $$0.put(cph.a.b, 6);
      $$0.put(cph.a.a, 2);
      $$0.put(cph.a.e, 5);
   }), 9, auo.ax, 0.0F, 0.0F, () -> cvp.a(crv.oo));
   public static final in<cpi> g = a("netherite", ac.a(new EnumMap<>(cph.a.class), $$0 -> {
      $$0.put(cph.a.d, 3);
      $$0.put(cph.a.c, 6);
      $$0.put(cph.a.b, 8);
      $$0.put(cph.a.a, 3);
      $$0.put(cph.a.e, 11);
   }), 15, auo.aw, 3.0F, 0.1F, () -> cvp.a(crv.oI));
   public static final in<cpi> h = a("armadillo", ac.a(new EnumMap<>(cph.a.class), $$0 -> {
      $$0.put(cph.a.d, 3);
      $$0.put(cph.a.c, 6);
      $$0.put(cph.a.b, 8);
      $$0.put(cph.a.a, 3);
      $$0.put(cph.a.e, 11);
   }), 10, auo.ay, 0.0F, 0.0F, () -> cvp.a(crv.op));

   public static in<cpi> a(ja<cpi> $$0) {
      return a;
   }

   private static in<cpi> a(String $$0, EnumMap<cph.a, Integer> $$1, int $$2, in<aun> $$3, float $$4, float $$5, Supplier<cvp> $$6) {
      List<cpi.a> $$7 = List.of(new cpi.a(new ajv($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static in<cpi> a(String $$0, EnumMap<cph.a, Integer> $$1, int $$2, in<aun> $$3, float $$4, float $$5, Supplier<cvp> $$6, List<cpi.a> $$7) {
      EnumMap<cph.a, Integer> $$8 = new EnumMap<>(cph.a.class);

      for (cph.a $$9 : cph.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return ja.b(kt.ar, new ajv($$0), new cpi($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class cse {
   public static final ji<csd> a = a("leather", ac.a(new EnumMap<>(csc.a.class), $$0 -> {
      $$0.put(csc.a.d, 1);
      $$0.put(csc.a.c, 2);
      $$0.put(csc.a.b, 3);
      $$0.put(csc.a.a, 1);
      $$0.put(csc.a.e, 3);
   }), 15, avz.av, 0.0F, 0.0F, () -> cyq.a(cuq.qD), List.of(new csd.a(new ale("leather"), "", true), new csd.a(new ale("leather"), "_overlay", false)));
   public static final ji<csd> b = a("chainmail", ac.a(new EnumMap<>(csc.a.class), $$0 -> {
      $$0.put(csc.a.d, 1);
      $$0.put(csc.a.c, 4);
      $$0.put(csc.a.b, 5);
      $$0.put(csc.a.a, 2);
      $$0.put(csc.a.e, 4);
   }), 12, avz.ap, 0.0F, 0.0F, () -> cyq.a(cuq.oE));
   public static final ji<csd> c = a("iron", ac.a(new EnumMap<>(csc.a.class), $$0 -> {
      $$0.put(csc.a.d, 2);
      $$0.put(csc.a.c, 5);
      $$0.put(csc.a.b, 6);
      $$0.put(csc.a.a, 2);
      $$0.put(csc.a.e, 5);
   }), 9, avz.au, 0.0F, 0.0F, () -> cyq.a(cuq.oE));
   public static final ji<csd> d = a("gold", ac.a(new EnumMap<>(csc.a.class), $$0 -> {
      $$0.put(csc.a.d, 1);
      $$0.put(csc.a.c, 3);
      $$0.put(csc.a.b, 5);
      $$0.put(csc.a.a, 2);
      $$0.put(csc.a.e, 7);
   }), 25, avz.at, 0.0F, 0.0F, () -> cyq.a(cuq.oI));
   public static final ji<csd> e = a("diamond", ac.a(new EnumMap<>(csc.a.class), $$0 -> {
      $$0.put(csc.a.d, 3);
      $$0.put(csc.a.c, 6);
      $$0.put(csc.a.b, 8);
      $$0.put(csc.a.a, 3);
      $$0.put(csc.a.e, 11);
   }), 10, avz.aq, 2.0F, 0.0F, () -> cyq.a(cuq.oy));
   public static final ji<csd> f = a("turtle", ac.a(new EnumMap<>(csc.a.class), $$0 -> {
      $$0.put(csc.a.d, 2);
      $$0.put(csc.a.c, 5);
      $$0.put(csc.a.b, 6);
      $$0.put(csc.a.a, 2);
      $$0.put(csc.a.e, 5);
   }), 9, avz.ax, 0.0F, 0.0F, () -> cyq.a(cuq.op));
   public static final ji<csd> g = a("netherite", ac.a(new EnumMap<>(csc.a.class), $$0 -> {
      $$0.put(csc.a.d, 3);
      $$0.put(csc.a.c, 6);
      $$0.put(csc.a.b, 8);
      $$0.put(csc.a.a, 3);
      $$0.put(csc.a.e, 11);
   }), 15, avz.aw, 3.0F, 0.1F, () -> cyq.a(cuq.oJ));
   public static final ji<csd> h = a("armadillo", ac.a(new EnumMap<>(csc.a.class), $$0 -> {
      $$0.put(csc.a.d, 3);
      $$0.put(csc.a.c, 6);
      $$0.put(csc.a.b, 8);
      $$0.put(csc.a.a, 3);
      $$0.put(csc.a.e, 11);
   }), 10, avz.ay, 0.0F, 0.0F, () -> cyq.a(cuq.oq));

   public static ji<csd> a(jv<csd> $$0) {
      return a;
   }

   private static ji<csd> a(String $$0, EnumMap<csc.a, Integer> $$1, int $$2, ji<avy> $$3, float $$4, float $$5, Supplier<cyq> $$6) {
      List<csd.a> $$7 = List.of(new csd.a(new ale($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ji<csd> a(String $$0, EnumMap<csc.a, Integer> $$1, int $$2, ji<avy> $$3, float $$4, float $$5, Supplier<cyq> $$6, List<csd.a> $$7) {
      EnumMap<csc.a, Integer> $$8 = new EnumMap<>(csc.a.class);

      for (csc.a $$9 : csc.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return jv.b(lp.ar, new ale($$0), new csd($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

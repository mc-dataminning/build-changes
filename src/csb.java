import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class csb {
   public static final ji<csa> a = a("leather", ac.a(new EnumMap<>(crz.a.class), $$0 -> {
      $$0.put(crz.a.d, 1);
      $$0.put(crz.a.c, 2);
      $$0.put(crz.a.b, 3);
      $$0.put(crz.a.a, 1);
      $$0.put(crz.a.e, 3);
   }), 15, avw.av, 0.0F, 0.0F, () -> cyn.a(cun.qD), List.of(new csa.a(new alb("leather"), "", true), new csa.a(new alb("leather"), "_overlay", false)));
   public static final ji<csa> b = a("chainmail", ac.a(new EnumMap<>(crz.a.class), $$0 -> {
      $$0.put(crz.a.d, 1);
      $$0.put(crz.a.c, 4);
      $$0.put(crz.a.b, 5);
      $$0.put(crz.a.a, 2);
      $$0.put(crz.a.e, 4);
   }), 12, avw.ap, 0.0F, 0.0F, () -> cyn.a(cun.oE));
   public static final ji<csa> c = a("iron", ac.a(new EnumMap<>(crz.a.class), $$0 -> {
      $$0.put(crz.a.d, 2);
      $$0.put(crz.a.c, 5);
      $$0.put(crz.a.b, 6);
      $$0.put(crz.a.a, 2);
      $$0.put(crz.a.e, 5);
   }), 9, avw.au, 0.0F, 0.0F, () -> cyn.a(cun.oE));
   public static final ji<csa> d = a("gold", ac.a(new EnumMap<>(crz.a.class), $$0 -> {
      $$0.put(crz.a.d, 1);
      $$0.put(crz.a.c, 3);
      $$0.put(crz.a.b, 5);
      $$0.put(crz.a.a, 2);
      $$0.put(crz.a.e, 7);
   }), 25, avw.at, 0.0F, 0.0F, () -> cyn.a(cun.oI));
   public static final ji<csa> e = a("diamond", ac.a(new EnumMap<>(crz.a.class), $$0 -> {
      $$0.put(crz.a.d, 3);
      $$0.put(crz.a.c, 6);
      $$0.put(crz.a.b, 8);
      $$0.put(crz.a.a, 3);
      $$0.put(crz.a.e, 11);
   }), 10, avw.aq, 2.0F, 0.0F, () -> cyn.a(cun.oy));
   public static final ji<csa> f = a("turtle", ac.a(new EnumMap<>(crz.a.class), $$0 -> {
      $$0.put(crz.a.d, 2);
      $$0.put(crz.a.c, 5);
      $$0.put(crz.a.b, 6);
      $$0.put(crz.a.a, 2);
      $$0.put(crz.a.e, 5);
   }), 9, avw.ax, 0.0F, 0.0F, () -> cyn.a(cun.op));
   public static final ji<csa> g = a("netherite", ac.a(new EnumMap<>(crz.a.class), $$0 -> {
      $$0.put(crz.a.d, 3);
      $$0.put(crz.a.c, 6);
      $$0.put(crz.a.b, 8);
      $$0.put(crz.a.a, 3);
      $$0.put(crz.a.e, 11);
   }), 15, avw.aw, 3.0F, 0.1F, () -> cyn.a(cun.oJ));
   public static final ji<csa> h = a("armadillo", ac.a(new EnumMap<>(crz.a.class), $$0 -> {
      $$0.put(crz.a.d, 3);
      $$0.put(crz.a.c, 6);
      $$0.put(crz.a.b, 8);
      $$0.put(crz.a.a, 3);
      $$0.put(crz.a.e, 11);
   }), 10, avw.ay, 0.0F, 0.0F, () -> cyn.a(cun.oq));

   public static ji<csa> a(jv<csa> $$0) {
      return a;
   }

   private static ji<csa> a(String $$0, EnumMap<crz.a, Integer> $$1, int $$2, ji<avv> $$3, float $$4, float $$5, Supplier<cyn> $$6) {
      List<csa.a> $$7 = List.of(new csa.a(new alb($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ji<csa> a(String $$0, EnumMap<crz.a, Integer> $$1, int $$2, ji<avv> $$3, float $$4, float $$5, Supplier<cyn> $$6, List<csa.a> $$7) {
      EnumMap<crz.a, Integer> $$8 = new EnumMap<>(crz.a.class);

      for (crz.a $$9 : crz.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return jv.b(lp.ar, new alb($$0), new csa($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

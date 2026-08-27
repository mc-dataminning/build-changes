import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class cpu {
   public static final iv<cpt> a = a("leather", ac.a(new EnumMap<>(cps.a.class), $$0 -> {
      $$0.put(cps.a.d, 1);
      $$0.put(cps.a.c, 2);
      $$0.put(cps.a.b, 3);
      $$0.put(cps.a.a, 1);
      $$0.put(cps.a.e, 3);
   }), 15, auz.av, 0.0F, 0.0F, () -> cwd.a(csg.qD), List.of(new cpt.a(new akf("leather"), "", true), new cpt.a(new akf("leather"), "_overlay", false)));
   public static final iv<cpt> b = a("chainmail", ac.a(new EnumMap<>(cps.a.class), $$0 -> {
      $$0.put(cps.a.d, 1);
      $$0.put(cps.a.c, 4);
      $$0.put(cps.a.b, 5);
      $$0.put(cps.a.a, 2);
      $$0.put(cps.a.e, 4);
   }), 12, auz.ap, 0.0F, 0.0F, () -> cwd.a(csg.oE));
   public static final iv<cpt> c = a("iron", ac.a(new EnumMap<>(cps.a.class), $$0 -> {
      $$0.put(cps.a.d, 2);
      $$0.put(cps.a.c, 5);
      $$0.put(cps.a.b, 6);
      $$0.put(cps.a.a, 2);
      $$0.put(cps.a.e, 5);
   }), 9, auz.au, 0.0F, 0.0F, () -> cwd.a(csg.oE));
   public static final iv<cpt> d = a("gold", ac.a(new EnumMap<>(cps.a.class), $$0 -> {
      $$0.put(cps.a.d, 1);
      $$0.put(cps.a.c, 3);
      $$0.put(cps.a.b, 5);
      $$0.put(cps.a.a, 2);
      $$0.put(cps.a.e, 7);
   }), 25, auz.at, 0.0F, 0.0F, () -> cwd.a(csg.oI));
   public static final iv<cpt> e = a("diamond", ac.a(new EnumMap<>(cps.a.class), $$0 -> {
      $$0.put(cps.a.d, 3);
      $$0.put(cps.a.c, 6);
      $$0.put(cps.a.b, 8);
      $$0.put(cps.a.a, 3);
      $$0.put(cps.a.e, 11);
   }), 10, auz.aq, 2.0F, 0.0F, () -> cwd.a(csg.oy));
   public static final iv<cpt> f = a("turtle", ac.a(new EnumMap<>(cps.a.class), $$0 -> {
      $$0.put(cps.a.d, 2);
      $$0.put(cps.a.c, 5);
      $$0.put(cps.a.b, 6);
      $$0.put(cps.a.a, 2);
      $$0.put(cps.a.e, 5);
   }), 9, auz.ax, 0.0F, 0.0F, () -> cwd.a(csg.op));
   public static final iv<cpt> g = a("netherite", ac.a(new EnumMap<>(cps.a.class), $$0 -> {
      $$0.put(cps.a.d, 3);
      $$0.put(cps.a.c, 6);
      $$0.put(cps.a.b, 8);
      $$0.put(cps.a.a, 3);
      $$0.put(cps.a.e, 11);
   }), 15, auz.aw, 3.0F, 0.1F, () -> cwd.a(csg.oJ));
   public static final iv<cpt> h = a("armadillo", ac.a(new EnumMap<>(cps.a.class), $$0 -> {
      $$0.put(cps.a.d, 3);
      $$0.put(cps.a.c, 6);
      $$0.put(cps.a.b, 8);
      $$0.put(cps.a.a, 3);
      $$0.put(cps.a.e, 11);
   }), 10, auz.ay, 0.0F, 0.0F, () -> cwd.a(csg.oq));

   public static iv<cpt> a(ji<cpt> $$0) {
      return a;
   }

   private static iv<cpt> a(String $$0, EnumMap<cps.a, Integer> $$1, int $$2, iv<auy> $$3, float $$4, float $$5, Supplier<cwd> $$6) {
      List<cpt.a> $$7 = List.of(new cpt.a(new akf($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static iv<cpt> a(String $$0, EnumMap<cps.a, Integer> $$1, int $$2, iv<auy> $$3, float $$4, float $$5, Supplier<cwd> $$6, List<cpt.a> $$7) {
      EnumMap<cps.a, Integer> $$8 = new EnumMap<>(cps.a.class);

      for (cps.a $$9 : cps.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return ji.b(lc.ar, new akf($$0), new cpt($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

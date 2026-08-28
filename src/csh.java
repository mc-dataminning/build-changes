import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class csh {
   public static final ji<csg> a = a("leather", ac.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 1);
      $$0.put(csf.a.c, 2);
      $$0.put(csf.a.b, 3);
      $$0.put(csf.a.a, 1);
      $$0.put(csf.a.e, 3);
   }), 15, awa.av, 0.0F, 0.0F, () -> cyt.a(cut.qD), List.of(new csg.a(new alf("leather"), "", true), new csg.a(new alf("leather"), "_overlay", false)));
   public static final ji<csg> b = a("chainmail", ac.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 1);
      $$0.put(csf.a.c, 4);
      $$0.put(csf.a.b, 5);
      $$0.put(csf.a.a, 2);
      $$0.put(csf.a.e, 4);
   }), 12, awa.ap, 0.0F, 0.0F, () -> cyt.a(cut.oE));
   public static final ji<csg> c = a("iron", ac.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 2);
      $$0.put(csf.a.c, 5);
      $$0.put(csf.a.b, 6);
      $$0.put(csf.a.a, 2);
      $$0.put(csf.a.e, 5);
   }), 9, awa.au, 0.0F, 0.0F, () -> cyt.a(cut.oE));
   public static final ji<csg> d = a("gold", ac.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 1);
      $$0.put(csf.a.c, 3);
      $$0.put(csf.a.b, 5);
      $$0.put(csf.a.a, 2);
      $$0.put(csf.a.e, 7);
   }), 25, awa.at, 0.0F, 0.0F, () -> cyt.a(cut.oI));
   public static final ji<csg> e = a("diamond", ac.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 3);
      $$0.put(csf.a.c, 6);
      $$0.put(csf.a.b, 8);
      $$0.put(csf.a.a, 3);
      $$0.put(csf.a.e, 11);
   }), 10, awa.aq, 2.0F, 0.0F, () -> cyt.a(cut.oy));
   public static final ji<csg> f = a("turtle", ac.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 2);
      $$0.put(csf.a.c, 5);
      $$0.put(csf.a.b, 6);
      $$0.put(csf.a.a, 2);
      $$0.put(csf.a.e, 5);
   }), 9, awa.ax, 0.0F, 0.0F, () -> cyt.a(cut.op));
   public static final ji<csg> g = a("netherite", ac.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 3);
      $$0.put(csf.a.c, 6);
      $$0.put(csf.a.b, 8);
      $$0.put(csf.a.a, 3);
      $$0.put(csf.a.e, 11);
   }), 15, awa.aw, 3.0F, 0.1F, () -> cyt.a(cut.oJ));
   public static final ji<csg> h = a("armadillo", ac.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 3);
      $$0.put(csf.a.c, 6);
      $$0.put(csf.a.b, 8);
      $$0.put(csf.a.a, 3);
      $$0.put(csf.a.e, 11);
   }), 10, awa.ay, 0.0F, 0.0F, () -> cyt.a(cut.oq));

   public static ji<csg> a(jv<csg> $$0) {
      return a;
   }

   private static ji<csg> a(String $$0, EnumMap<csf.a, Integer> $$1, int $$2, ji<avz> $$3, float $$4, float $$5, Supplier<cyt> $$6) {
      List<csg.a> $$7 = List.of(new csg.a(new alf($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ji<csg> a(String $$0, EnumMap<csf.a, Integer> $$1, int $$2, ji<avz> $$3, float $$4, float $$5, Supplier<cyt> $$6, List<csg.a> $$7) {
      EnumMap<csf.a, Integer> $$8 = new EnumMap<>(csf.a.class);

      for (csf.a $$9 : csf.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return jv.b(lp.ar, new alf($$0), new csg($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class csg {
   public static final ji<csf> a = a("leather", ac.a(new EnumMap<>(cse.a.class), $$0 -> {
      $$0.put(cse.a.d, 1);
      $$0.put(cse.a.c, 2);
      $$0.put(cse.a.b, 3);
      $$0.put(cse.a.a, 1);
      $$0.put(cse.a.e, 3);
   }), 15, awa.av, 0.0F, 0.0F, () -> cys.a(cus.qD), List.of(new csf.a(new alf("leather"), "", true), new csf.a(new alf("leather"), "_overlay", false)));
   public static final ji<csf> b = a("chainmail", ac.a(new EnumMap<>(cse.a.class), $$0 -> {
      $$0.put(cse.a.d, 1);
      $$0.put(cse.a.c, 4);
      $$0.put(cse.a.b, 5);
      $$0.put(cse.a.a, 2);
      $$0.put(cse.a.e, 4);
   }), 12, awa.ap, 0.0F, 0.0F, () -> cys.a(cus.oE));
   public static final ji<csf> c = a("iron", ac.a(new EnumMap<>(cse.a.class), $$0 -> {
      $$0.put(cse.a.d, 2);
      $$0.put(cse.a.c, 5);
      $$0.put(cse.a.b, 6);
      $$0.put(cse.a.a, 2);
      $$0.put(cse.a.e, 5);
   }), 9, awa.au, 0.0F, 0.0F, () -> cys.a(cus.oE));
   public static final ji<csf> d = a("gold", ac.a(new EnumMap<>(cse.a.class), $$0 -> {
      $$0.put(cse.a.d, 1);
      $$0.put(cse.a.c, 3);
      $$0.put(cse.a.b, 5);
      $$0.put(cse.a.a, 2);
      $$0.put(cse.a.e, 7);
   }), 25, awa.at, 0.0F, 0.0F, () -> cys.a(cus.oI));
   public static final ji<csf> e = a("diamond", ac.a(new EnumMap<>(cse.a.class), $$0 -> {
      $$0.put(cse.a.d, 3);
      $$0.put(cse.a.c, 6);
      $$0.put(cse.a.b, 8);
      $$0.put(cse.a.a, 3);
      $$0.put(cse.a.e, 11);
   }), 10, awa.aq, 2.0F, 0.0F, () -> cys.a(cus.oy));
   public static final ji<csf> f = a("turtle", ac.a(new EnumMap<>(cse.a.class), $$0 -> {
      $$0.put(cse.a.d, 2);
      $$0.put(cse.a.c, 5);
      $$0.put(cse.a.b, 6);
      $$0.put(cse.a.a, 2);
      $$0.put(cse.a.e, 5);
   }), 9, awa.ax, 0.0F, 0.0F, () -> cys.a(cus.op));
   public static final ji<csf> g = a("netherite", ac.a(new EnumMap<>(cse.a.class), $$0 -> {
      $$0.put(cse.a.d, 3);
      $$0.put(cse.a.c, 6);
      $$0.put(cse.a.b, 8);
      $$0.put(cse.a.a, 3);
      $$0.put(cse.a.e, 11);
   }), 15, awa.aw, 3.0F, 0.1F, () -> cys.a(cus.oJ));
   public static final ji<csf> h = a("armadillo", ac.a(new EnumMap<>(cse.a.class), $$0 -> {
      $$0.put(cse.a.d, 3);
      $$0.put(cse.a.c, 6);
      $$0.put(cse.a.b, 8);
      $$0.put(cse.a.a, 3);
      $$0.put(cse.a.e, 11);
   }), 10, awa.ay, 0.0F, 0.0F, () -> cys.a(cus.oq));

   public static ji<csf> a(jv<csf> $$0) {
      return a;
   }

   private static ji<csf> a(String $$0, EnumMap<cse.a, Integer> $$1, int $$2, ji<avz> $$3, float $$4, float $$5, Supplier<cys> $$6) {
      List<csf.a> $$7 = List.of(new csf.a(new alf($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ji<csf> a(String $$0, EnumMap<cse.a, Integer> $$1, int $$2, ji<avz> $$3, float $$4, float $$5, Supplier<cys> $$6, List<csf.a> $$7) {
      EnumMap<cse.a, Integer> $$8 = new EnumMap<>(cse.a.class);

      for (cse.a $$9 : cse.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return jv.b(lp.ar, new alf($$0), new csf($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

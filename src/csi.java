import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class csi {
   public static final ji<csh> a = a("leather", ac.a(new EnumMap<>(csg.a.class), $$0 -> {
      $$0.put(csg.a.d, 1);
      $$0.put(csg.a.c, 2);
      $$0.put(csg.a.b, 3);
      $$0.put(csg.a.a, 1);
      $$0.put(csg.a.e, 3);
   }), 15, awa.av, 0.0F, 0.0F, () -> cyu.a(cuu.qD), List.of(new csh.a(new alf("leather"), "", true), new csh.a(new alf("leather"), "_overlay", false)));
   public static final ji<csh> b = a("chainmail", ac.a(new EnumMap<>(csg.a.class), $$0 -> {
      $$0.put(csg.a.d, 1);
      $$0.put(csg.a.c, 4);
      $$0.put(csg.a.b, 5);
      $$0.put(csg.a.a, 2);
      $$0.put(csg.a.e, 4);
   }), 12, awa.ap, 0.0F, 0.0F, () -> cyu.a(cuu.oE));
   public static final ji<csh> c = a("iron", ac.a(new EnumMap<>(csg.a.class), $$0 -> {
      $$0.put(csg.a.d, 2);
      $$0.put(csg.a.c, 5);
      $$0.put(csg.a.b, 6);
      $$0.put(csg.a.a, 2);
      $$0.put(csg.a.e, 5);
   }), 9, awa.au, 0.0F, 0.0F, () -> cyu.a(cuu.oE));
   public static final ji<csh> d = a("gold", ac.a(new EnumMap<>(csg.a.class), $$0 -> {
      $$0.put(csg.a.d, 1);
      $$0.put(csg.a.c, 3);
      $$0.put(csg.a.b, 5);
      $$0.put(csg.a.a, 2);
      $$0.put(csg.a.e, 7);
   }), 25, awa.at, 0.0F, 0.0F, () -> cyu.a(cuu.oI));
   public static final ji<csh> e = a("diamond", ac.a(new EnumMap<>(csg.a.class), $$0 -> {
      $$0.put(csg.a.d, 3);
      $$0.put(csg.a.c, 6);
      $$0.put(csg.a.b, 8);
      $$0.put(csg.a.a, 3);
      $$0.put(csg.a.e, 11);
   }), 10, awa.aq, 2.0F, 0.0F, () -> cyu.a(cuu.oy));
   public static final ji<csh> f = a("turtle", ac.a(new EnumMap<>(csg.a.class), $$0 -> {
      $$0.put(csg.a.d, 2);
      $$0.put(csg.a.c, 5);
      $$0.put(csg.a.b, 6);
      $$0.put(csg.a.a, 2);
      $$0.put(csg.a.e, 5);
   }), 9, awa.ax, 0.0F, 0.0F, () -> cyu.a(cuu.op));
   public static final ji<csh> g = a("netherite", ac.a(new EnumMap<>(csg.a.class), $$0 -> {
      $$0.put(csg.a.d, 3);
      $$0.put(csg.a.c, 6);
      $$0.put(csg.a.b, 8);
      $$0.put(csg.a.a, 3);
      $$0.put(csg.a.e, 11);
   }), 15, awa.aw, 3.0F, 0.1F, () -> cyu.a(cuu.oJ));
   public static final ji<csh> h = a("armadillo", ac.a(new EnumMap<>(csg.a.class), $$0 -> {
      $$0.put(csg.a.d, 3);
      $$0.put(csg.a.c, 6);
      $$0.put(csg.a.b, 8);
      $$0.put(csg.a.a, 3);
      $$0.put(csg.a.e, 11);
   }), 10, awa.ay, 0.0F, 0.0F, () -> cyu.a(cuu.oq));

   public static ji<csh> a(jv<csh> $$0) {
      return a;
   }

   private static ji<csh> a(String $$0, EnumMap<csg.a, Integer> $$1, int $$2, ji<avz> $$3, float $$4, float $$5, Supplier<cyu> $$6) {
      List<csh.a> $$7 = List.of(new csh.a(new alf($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ji<csh> a(String $$0, EnumMap<csg.a, Integer> $$1, int $$2, ji<avz> $$3, float $$4, float $$5, Supplier<cyu> $$6, List<csh.a> $$7) {
      EnumMap<csg.a, Integer> $$8 = new EnumMap<>(csg.a.class);

      for (csg.a $$9 : csg.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return jv.b(lp.ar, new alf($$0), new csh($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

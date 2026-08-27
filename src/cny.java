import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class cny {
   public static final il<cnx> a = a("leather", ac.a(new EnumMap<>(cnw.a.class), $$0 -> {
      $$0.put(cnw.a.d, 1);
      $$0.put(cnw.a.c, 2);
      $$0.put(cnw.a.b, 3);
      $$0.put(cnw.a.a, 1);
      $$0.put(cnw.a.e, 3);
   }), 15, aty.av, 0.0F, 0.0F, () -> ctk.a(cqn.qC), List.of(new cnx.a(new ajh("leather"), "", true), new cnx.a(new ajh("leather"), "_overlay", false)));
   public static final il<cnx> b = a("chainmail", ac.a(new EnumMap<>(cnw.a.class), $$0 -> {
      $$0.put(cnw.a.d, 1);
      $$0.put(cnw.a.c, 4);
      $$0.put(cnw.a.b, 5);
      $$0.put(cnw.a.a, 2);
      $$0.put(cnw.a.e, 4);
   }), 12, aty.ap, 0.0F, 0.0F, () -> ctk.a(cqn.oD));
   public static final il<cnx> c = a("iron", ac.a(new EnumMap<>(cnw.a.class), $$0 -> {
      $$0.put(cnw.a.d, 2);
      $$0.put(cnw.a.c, 5);
      $$0.put(cnw.a.b, 6);
      $$0.put(cnw.a.a, 2);
      $$0.put(cnw.a.e, 5);
   }), 9, aty.au, 0.0F, 0.0F, () -> ctk.a(cqn.oD));
   public static final il<cnx> d = a("gold", ac.a(new EnumMap<>(cnw.a.class), $$0 -> {
      $$0.put(cnw.a.d, 1);
      $$0.put(cnw.a.c, 3);
      $$0.put(cnw.a.b, 5);
      $$0.put(cnw.a.a, 2);
      $$0.put(cnw.a.e, 7);
   }), 25, aty.at, 0.0F, 0.0F, () -> ctk.a(cqn.oH));
   public static final il<cnx> e = a("diamond", ac.a(new EnumMap<>(cnw.a.class), $$0 -> {
      $$0.put(cnw.a.d, 3);
      $$0.put(cnw.a.c, 6);
      $$0.put(cnw.a.b, 8);
      $$0.put(cnw.a.a, 3);
      $$0.put(cnw.a.e, 11);
   }), 10, aty.aq, 2.0F, 0.0F, () -> ctk.a(cqn.ox));
   public static final il<cnx> f = a("turtle", ac.a(new EnumMap<>(cnw.a.class), $$0 -> {
      $$0.put(cnw.a.d, 2);
      $$0.put(cnw.a.c, 5);
      $$0.put(cnw.a.b, 6);
      $$0.put(cnw.a.a, 2);
      $$0.put(cnw.a.e, 5);
   }), 9, aty.ax, 0.0F, 0.0F, () -> ctk.a(cqn.oo));
   public static final il<cnx> g = a("netherite", ac.a(new EnumMap<>(cnw.a.class), $$0 -> {
      $$0.put(cnw.a.d, 3);
      $$0.put(cnw.a.c, 6);
      $$0.put(cnw.a.b, 8);
      $$0.put(cnw.a.a, 3);
      $$0.put(cnw.a.e, 11);
   }), 15, aty.aw, 3.0F, 0.1F, () -> ctk.a(cqn.oI));
   public static final il<cnx> h = a("armadillo", ac.a(new EnumMap<>(cnw.a.class), $$0 -> {
      $$0.put(cnw.a.d, 3);
      $$0.put(cnw.a.c, 6);
      $$0.put(cnw.a.b, 8);
      $$0.put(cnw.a.a, 3);
      $$0.put(cnw.a.e, 11);
   }), 10, aty.ay, 0.0F, 0.0F, () -> ctk.a(cqn.op));

   public static il<cnx> a(iy<cnx> $$0) {
      return a;
   }

   private static il<cnx> a(String $$0, EnumMap<cnw.a, Integer> $$1, int $$2, il<atx> $$3, float $$4, float $$5, Supplier<ctk> $$6) {
      List<cnx.a> $$7 = List.of(new cnx.a(new ajh($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static il<cnx> a(String $$0, EnumMap<cnw.a, Integer> $$1, int $$2, il<atx> $$3, float $$4, float $$5, Supplier<ctk> $$6, List<cnx.a> $$7) {
      EnumMap<cnw.a, Integer> $$8 = new EnumMap<>(cnw.a.class);

      for (cnw.a $$9 : cnw.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return iy.b(ki.as, new ajh($$0), new cnx($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

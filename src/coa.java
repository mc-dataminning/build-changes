import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class coa {
   public static final il<cnz> a = a("leather", ac.a(new EnumMap<>(cny.a.class), $$0 -> {
      $$0.put(cny.a.d, 1);
      $$0.put(cny.a.c, 2);
      $$0.put(cny.a.b, 3);
      $$0.put(cny.a.a, 1);
      $$0.put(cny.a.e, 3);
   }), 15, aty.av, 0.0F, 0.0F, () -> ctm.a(cqp.qC), List.of(new cnz.a(new ajh("leather"), "", true), new cnz.a(new ajh("leather"), "_overlay", false)));
   public static final il<cnz> b = a("chainmail", ac.a(new EnumMap<>(cny.a.class), $$0 -> {
      $$0.put(cny.a.d, 1);
      $$0.put(cny.a.c, 4);
      $$0.put(cny.a.b, 5);
      $$0.put(cny.a.a, 2);
      $$0.put(cny.a.e, 4);
   }), 12, aty.ap, 0.0F, 0.0F, () -> ctm.a(cqp.oD));
   public static final il<cnz> c = a("iron", ac.a(new EnumMap<>(cny.a.class), $$0 -> {
      $$0.put(cny.a.d, 2);
      $$0.put(cny.a.c, 5);
      $$0.put(cny.a.b, 6);
      $$0.put(cny.a.a, 2);
      $$0.put(cny.a.e, 5);
   }), 9, aty.au, 0.0F, 0.0F, () -> ctm.a(cqp.oD));
   public static final il<cnz> d = a("gold", ac.a(new EnumMap<>(cny.a.class), $$0 -> {
      $$0.put(cny.a.d, 1);
      $$0.put(cny.a.c, 3);
      $$0.put(cny.a.b, 5);
      $$0.put(cny.a.a, 2);
      $$0.put(cny.a.e, 7);
   }), 25, aty.at, 0.0F, 0.0F, () -> ctm.a(cqp.oH));
   public static final il<cnz> e = a("diamond", ac.a(new EnumMap<>(cny.a.class), $$0 -> {
      $$0.put(cny.a.d, 3);
      $$0.put(cny.a.c, 6);
      $$0.put(cny.a.b, 8);
      $$0.put(cny.a.a, 3);
      $$0.put(cny.a.e, 11);
   }), 10, aty.aq, 2.0F, 0.0F, () -> ctm.a(cqp.ox));
   public static final il<cnz> f = a("turtle", ac.a(new EnumMap<>(cny.a.class), $$0 -> {
      $$0.put(cny.a.d, 2);
      $$0.put(cny.a.c, 5);
      $$0.put(cny.a.b, 6);
      $$0.put(cny.a.a, 2);
      $$0.put(cny.a.e, 5);
   }), 9, aty.ax, 0.0F, 0.0F, () -> ctm.a(cqp.oo));
   public static final il<cnz> g = a("netherite", ac.a(new EnumMap<>(cny.a.class), $$0 -> {
      $$0.put(cny.a.d, 3);
      $$0.put(cny.a.c, 6);
      $$0.put(cny.a.b, 8);
      $$0.put(cny.a.a, 3);
      $$0.put(cny.a.e, 11);
   }), 15, aty.aw, 3.0F, 0.1F, () -> ctm.a(cqp.oI));
   public static final il<cnz> h = a("armadillo", ac.a(new EnumMap<>(cny.a.class), $$0 -> {
      $$0.put(cny.a.d, 3);
      $$0.put(cny.a.c, 6);
      $$0.put(cny.a.b, 8);
      $$0.put(cny.a.a, 3);
      $$0.put(cny.a.e, 11);
   }), 10, aty.ay, 0.0F, 0.0F, () -> ctm.a(cqp.op));

   public static il<cnz> a(iy<cnz> $$0) {
      return a;
   }

   private static il<cnz> a(String $$0, EnumMap<cny.a, Integer> $$1, int $$2, il<atx> $$3, float $$4, float $$5, Supplier<ctm> $$6) {
      List<cnz.a> $$7 = List.of(new cnz.a(new ajh($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static il<cnz> a(String $$0, EnumMap<cny.a, Integer> $$1, int $$2, il<atx> $$3, float $$4, float $$5, Supplier<ctm> $$6, List<cnz.a> $$7) {
      EnumMap<cny.a, Integer> $$8 = new EnumMap<>(cny.a.class);

      for (cny.a $$9 : cny.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return iy.b(ki.as, new ajh($$0), new cnz($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

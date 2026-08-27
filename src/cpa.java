import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class cpa {
   public static final il<coz> a = a("leather", ac.a(new EnumMap<>(coy.a.class), $$0 -> {
      $$0.put(coy.a.d, 1);
      $$0.put(coy.a.c, 2);
      $$0.put(coy.a.b, 3);
      $$0.put(coy.a.a, 1);
      $$0.put(coy.a.e, 3);
   }), 15, aum.av, 0.0F, 0.0F, () -> cvg.a(crm.qC), List.of(new coz.a(new ajt("leather"), "", true), new coz.a(new ajt("leather"), "_overlay", false)));
   public static final il<coz> b = a("chainmail", ac.a(new EnumMap<>(coy.a.class), $$0 -> {
      $$0.put(coy.a.d, 1);
      $$0.put(coy.a.c, 4);
      $$0.put(coy.a.b, 5);
      $$0.put(coy.a.a, 2);
      $$0.put(coy.a.e, 4);
   }), 12, aum.ap, 0.0F, 0.0F, () -> cvg.a(crm.oD));
   public static final il<coz> c = a("iron", ac.a(new EnumMap<>(coy.a.class), $$0 -> {
      $$0.put(coy.a.d, 2);
      $$0.put(coy.a.c, 5);
      $$0.put(coy.a.b, 6);
      $$0.put(coy.a.a, 2);
      $$0.put(coy.a.e, 5);
   }), 9, aum.au, 0.0F, 0.0F, () -> cvg.a(crm.oD));
   public static final il<coz> d = a("gold", ac.a(new EnumMap<>(coy.a.class), $$0 -> {
      $$0.put(coy.a.d, 1);
      $$0.put(coy.a.c, 3);
      $$0.put(coy.a.b, 5);
      $$0.put(coy.a.a, 2);
      $$0.put(coy.a.e, 7);
   }), 25, aum.at, 0.0F, 0.0F, () -> cvg.a(crm.oH));
   public static final il<coz> e = a("diamond", ac.a(new EnumMap<>(coy.a.class), $$0 -> {
      $$0.put(coy.a.d, 3);
      $$0.put(coy.a.c, 6);
      $$0.put(coy.a.b, 8);
      $$0.put(coy.a.a, 3);
      $$0.put(coy.a.e, 11);
   }), 10, aum.aq, 2.0F, 0.0F, () -> cvg.a(crm.ox));
   public static final il<coz> f = a("turtle", ac.a(new EnumMap<>(coy.a.class), $$0 -> {
      $$0.put(coy.a.d, 2);
      $$0.put(coy.a.c, 5);
      $$0.put(coy.a.b, 6);
      $$0.put(coy.a.a, 2);
      $$0.put(coy.a.e, 5);
   }), 9, aum.ax, 0.0F, 0.0F, () -> cvg.a(crm.oo));
   public static final il<coz> g = a("netherite", ac.a(new EnumMap<>(coy.a.class), $$0 -> {
      $$0.put(coy.a.d, 3);
      $$0.put(coy.a.c, 6);
      $$0.put(coy.a.b, 8);
      $$0.put(coy.a.a, 3);
      $$0.put(coy.a.e, 11);
   }), 15, aum.aw, 3.0F, 0.1F, () -> cvg.a(crm.oI));
   public static final il<coz> h = a("armadillo", ac.a(new EnumMap<>(coy.a.class), $$0 -> {
      $$0.put(coy.a.d, 3);
      $$0.put(coy.a.c, 6);
      $$0.put(coy.a.b, 8);
      $$0.put(coy.a.a, 3);
      $$0.put(coy.a.e, 11);
   }), 10, aum.ay, 0.0F, 0.0F, () -> cvg.a(crm.op));

   public static il<coz> a(iy<coz> $$0) {
      return a;
   }

   private static il<coz> a(String $$0, EnumMap<coy.a, Integer> $$1, int $$2, il<aul> $$3, float $$4, float $$5, Supplier<cvg> $$6) {
      List<coz.a> $$7 = List.of(new coz.a(new ajt($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static il<coz> a(String $$0, EnumMap<coy.a, Integer> $$1, int $$2, il<aul> $$3, float $$4, float $$5, Supplier<cvg> $$6, List<coz.a> $$7) {
      EnumMap<coy.a, Integer> $$8 = new EnumMap<>(coy.a.class);

      for (coy.a $$9 : coy.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return iy.b(kr.as, new ajt($$0), new coz($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

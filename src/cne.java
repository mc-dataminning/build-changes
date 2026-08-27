import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class cne {
   public static final il<cnd> a = a("leather", ac.a(new EnumMap<>(cnc.a.class), $$0 -> {
      $$0.put(cnc.a.d, 1);
      $$0.put(cnc.a.c, 2);
      $$0.put(cnc.a.b, 3);
      $$0.put(cnc.a.a, 1);
      $$0.put(cnc.a.e, 3);
   }), 15, atp.at, 0.0F, 0.0F, () -> csp.a(cpt.qC), List.of(new cnd.a(new ajc("leather"), "", true), new cnd.a(new ajc("leather"), "_overlay", false)));
   public static final il<cnd> b = a("chainmail", ac.a(new EnumMap<>(cnc.a.class), $$0 -> {
      $$0.put(cnc.a.d, 1);
      $$0.put(cnc.a.c, 4);
      $$0.put(cnc.a.b, 5);
      $$0.put(cnc.a.a, 2);
      $$0.put(cnc.a.e, 4);
   }), 12, atp.an, 0.0F, 0.0F, () -> csp.a(cpt.oD));
   public static final il<cnd> c = a("iron", ac.a(new EnumMap<>(cnc.a.class), $$0 -> {
      $$0.put(cnc.a.d, 2);
      $$0.put(cnc.a.c, 5);
      $$0.put(cnc.a.b, 6);
      $$0.put(cnc.a.a, 2);
      $$0.put(cnc.a.e, 5);
   }), 9, atp.as, 0.0F, 0.0F, () -> csp.a(cpt.oD));
   public static final il<cnd> d = a("gold", ac.a(new EnumMap<>(cnc.a.class), $$0 -> {
      $$0.put(cnc.a.d, 1);
      $$0.put(cnc.a.c, 3);
      $$0.put(cnc.a.b, 5);
      $$0.put(cnc.a.a, 2);
      $$0.put(cnc.a.e, 7);
   }), 25, atp.ar, 0.0F, 0.0F, () -> csp.a(cpt.oH));
   public static final il<cnd> e = a("diamond", ac.a(new EnumMap<>(cnc.a.class), $$0 -> {
      $$0.put(cnc.a.d, 3);
      $$0.put(cnc.a.c, 6);
      $$0.put(cnc.a.b, 8);
      $$0.put(cnc.a.a, 3);
      $$0.put(cnc.a.e, 11);
   }), 10, atp.ao, 2.0F, 0.0F, () -> csp.a(cpt.ox));
   public static final il<cnd> f = a("turtle", ac.a(new EnumMap<>(cnc.a.class), $$0 -> {
      $$0.put(cnc.a.d, 2);
      $$0.put(cnc.a.c, 5);
      $$0.put(cnc.a.b, 6);
      $$0.put(cnc.a.a, 2);
      $$0.put(cnc.a.e, 5);
   }), 9, atp.av, 0.0F, 0.0F, () -> csp.a(cpt.oo));
   public static final il<cnd> g = a("netherite", ac.a(new EnumMap<>(cnc.a.class), $$0 -> {
      $$0.put(cnc.a.d, 3);
      $$0.put(cnc.a.c, 6);
      $$0.put(cnc.a.b, 8);
      $$0.put(cnc.a.a, 3);
      $$0.put(cnc.a.e, 11);
   }), 15, atp.au, 3.0F, 0.1F, () -> csp.a(cpt.oI));
   public static final il<cnd> h = a("armadillo", ac.a(new EnumMap<>(cnc.a.class), $$0 -> {
      $$0.put(cnc.a.d, 3);
      $$0.put(cnc.a.c, 6);
      $$0.put(cnc.a.b, 8);
      $$0.put(cnc.a.a, 3);
      $$0.put(cnc.a.e, 11);
   }), 10, atp.aw, 0.0F, 0.0F, () -> csp.a(cpt.op));

   public static il<cnd> a(ix<cnd> $$0) {
      return a;
   }

   private static il<cnd> a(String $$0, EnumMap<cnc.a, Integer> $$1, int $$2, il<ato> $$3, float $$4, float $$5, Supplier<csp> $$6) {
      List<cnd.a> $$7 = List.of(new cnd.a(new ajc($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static il<cnd> a(String $$0, EnumMap<cnc.a, Integer> $$1, int $$2, il<ato> $$3, float $$4, float $$5, Supplier<csp> $$6, List<cnd.a> $$7) {
      EnumMap<cnc.a, Integer> $$8 = new EnumMap<>(cnc.a.class);

      for (cnc.a $$9 : cnc.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return ix.b(kh.as, new ajc($$0), new cnd($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

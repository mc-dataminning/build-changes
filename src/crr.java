import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class crr {
   public static final jj<crq> a = a("leather", ac.a(new EnumMap<>(crp.a.class), $$0 -> {
      $$0.put(crp.a.d, 1);
      $$0.put(crp.a.c, 2);
      $$0.put(crp.a.b, 3);
      $$0.put(crp.a.a, 1);
      $$0.put(crp.a.e, 3);
   }), 15, avf.av, 0.0F, 0.0F, () -> cyd.a(cud.qD), List.of(new crq.a(new akk("leather"), "", true), new crq.a(new akk("leather"), "_overlay", false)));
   public static final jj<crq> b = a("chainmail", ac.a(new EnumMap<>(crp.a.class), $$0 -> {
      $$0.put(crp.a.d, 1);
      $$0.put(crp.a.c, 4);
      $$0.put(crp.a.b, 5);
      $$0.put(crp.a.a, 2);
      $$0.put(crp.a.e, 4);
   }), 12, avf.ap, 0.0F, 0.0F, () -> cyd.a(cud.oE));
   public static final jj<crq> c = a("iron", ac.a(new EnumMap<>(crp.a.class), $$0 -> {
      $$0.put(crp.a.d, 2);
      $$0.put(crp.a.c, 5);
      $$0.put(crp.a.b, 6);
      $$0.put(crp.a.a, 2);
      $$0.put(crp.a.e, 5);
   }), 9, avf.au, 0.0F, 0.0F, () -> cyd.a(cud.oE));
   public static final jj<crq> d = a("gold", ac.a(new EnumMap<>(crp.a.class), $$0 -> {
      $$0.put(crp.a.d, 1);
      $$0.put(crp.a.c, 3);
      $$0.put(crp.a.b, 5);
      $$0.put(crp.a.a, 2);
      $$0.put(crp.a.e, 7);
   }), 25, avf.at, 0.0F, 0.0F, () -> cyd.a(cud.oI));
   public static final jj<crq> e = a("diamond", ac.a(new EnumMap<>(crp.a.class), $$0 -> {
      $$0.put(crp.a.d, 3);
      $$0.put(crp.a.c, 6);
      $$0.put(crp.a.b, 8);
      $$0.put(crp.a.a, 3);
      $$0.put(crp.a.e, 11);
   }), 10, avf.aq, 2.0F, 0.0F, () -> cyd.a(cud.oy));
   public static final jj<crq> f = a("turtle", ac.a(new EnumMap<>(crp.a.class), $$0 -> {
      $$0.put(crp.a.d, 2);
      $$0.put(crp.a.c, 5);
      $$0.put(crp.a.b, 6);
      $$0.put(crp.a.a, 2);
      $$0.put(crp.a.e, 5);
   }), 9, avf.ax, 0.0F, 0.0F, () -> cyd.a(cud.op));
   public static final jj<crq> g = a("netherite", ac.a(new EnumMap<>(crp.a.class), $$0 -> {
      $$0.put(crp.a.d, 3);
      $$0.put(crp.a.c, 6);
      $$0.put(crp.a.b, 8);
      $$0.put(crp.a.a, 3);
      $$0.put(crp.a.e, 11);
   }), 15, avf.aw, 3.0F, 0.1F, () -> cyd.a(cud.oJ));
   public static final jj<crq> h = a("armadillo", ac.a(new EnumMap<>(crp.a.class), $$0 -> {
      $$0.put(crp.a.d, 3);
      $$0.put(crp.a.c, 6);
      $$0.put(crp.a.b, 8);
      $$0.put(crp.a.a, 3);
      $$0.put(crp.a.e, 11);
   }), 10, avf.ay, 0.0F, 0.0F, () -> cyd.a(cud.oq));

   public static jj<crq> a(jw<crq> $$0) {
      return a;
   }

   private static jj<crq> a(String $$0, EnumMap<crp.a, Integer> $$1, int $$2, jj<ave> $$3, float $$4, float $$5, Supplier<cyd> $$6) {
      List<crq.a> $$7 = List.of(new crq.a(new akk($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static jj<crq> a(String $$0, EnumMap<crp.a, Integer> $$1, int $$2, jj<ave> $$3, float $$4, float $$5, Supplier<cyd> $$6, List<crq.a> $$7) {
      EnumMap<crp.a, Integer> $$8 = new EnumMap<>(crp.a.class);

      for (crp.a $$9 : crp.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return jw.b(lq.ap, new akk($$0), new crq($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

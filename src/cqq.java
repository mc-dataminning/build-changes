import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class cqq {
   public static final iw<cqp> a = a("leather", ac.a(new EnumMap<>(cqo.a.class), $$0 -> {
      $$0.put(cqo.a.d, 1);
      $$0.put(cqo.a.c, 2);
      $$0.put(cqo.a.b, 3);
      $$0.put(cqo.a.a, 1);
      $$0.put(cqo.a.e, 3);
   }), 15, avc.av, 0.0F, 0.0F, () -> cxa.a(ctc.qD), List.of(new cqp.a(new akh("leather"), "", true), new cqp.a(new akh("leather"), "_overlay", false)));
   public static final iw<cqp> b = a("chainmail", ac.a(new EnumMap<>(cqo.a.class), $$0 -> {
      $$0.put(cqo.a.d, 1);
      $$0.put(cqo.a.c, 4);
      $$0.put(cqo.a.b, 5);
      $$0.put(cqo.a.a, 2);
      $$0.put(cqo.a.e, 4);
   }), 12, avc.ap, 0.0F, 0.0F, () -> cxa.a(ctc.oE));
   public static final iw<cqp> c = a("iron", ac.a(new EnumMap<>(cqo.a.class), $$0 -> {
      $$0.put(cqo.a.d, 2);
      $$0.put(cqo.a.c, 5);
      $$0.put(cqo.a.b, 6);
      $$0.put(cqo.a.a, 2);
      $$0.put(cqo.a.e, 5);
   }), 9, avc.au, 0.0F, 0.0F, () -> cxa.a(ctc.oE));
   public static final iw<cqp> d = a("gold", ac.a(new EnumMap<>(cqo.a.class), $$0 -> {
      $$0.put(cqo.a.d, 1);
      $$0.put(cqo.a.c, 3);
      $$0.put(cqo.a.b, 5);
      $$0.put(cqo.a.a, 2);
      $$0.put(cqo.a.e, 7);
   }), 25, avc.at, 0.0F, 0.0F, () -> cxa.a(ctc.oI));
   public static final iw<cqp> e = a("diamond", ac.a(new EnumMap<>(cqo.a.class), $$0 -> {
      $$0.put(cqo.a.d, 3);
      $$0.put(cqo.a.c, 6);
      $$0.put(cqo.a.b, 8);
      $$0.put(cqo.a.a, 3);
      $$0.put(cqo.a.e, 11);
   }), 10, avc.aq, 2.0F, 0.0F, () -> cxa.a(ctc.oy));
   public static final iw<cqp> f = a("turtle", ac.a(new EnumMap<>(cqo.a.class), $$0 -> {
      $$0.put(cqo.a.d, 2);
      $$0.put(cqo.a.c, 5);
      $$0.put(cqo.a.b, 6);
      $$0.put(cqo.a.a, 2);
      $$0.put(cqo.a.e, 5);
   }), 9, avc.ax, 0.0F, 0.0F, () -> cxa.a(ctc.op));
   public static final iw<cqp> g = a("netherite", ac.a(new EnumMap<>(cqo.a.class), $$0 -> {
      $$0.put(cqo.a.d, 3);
      $$0.put(cqo.a.c, 6);
      $$0.put(cqo.a.b, 8);
      $$0.put(cqo.a.a, 3);
      $$0.put(cqo.a.e, 11);
   }), 15, avc.aw, 3.0F, 0.1F, () -> cxa.a(ctc.oJ));
   public static final iw<cqp> h = a("armadillo", ac.a(new EnumMap<>(cqo.a.class), $$0 -> {
      $$0.put(cqo.a.d, 3);
      $$0.put(cqo.a.c, 6);
      $$0.put(cqo.a.b, 8);
      $$0.put(cqo.a.a, 3);
      $$0.put(cqo.a.e, 11);
   }), 10, avc.ay, 0.0F, 0.0F, () -> cxa.a(ctc.oq));

   public static iw<cqp> a(jj<cqp> $$0) {
      return a;
   }

   private static iw<cqp> a(String $$0, EnumMap<cqo.a, Integer> $$1, int $$2, iw<avb> $$3, float $$4, float $$5, Supplier<cxa> $$6) {
      List<cqp.a> $$7 = List.of(new cqp.a(new akh($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static iw<cqp> a(String $$0, EnumMap<cqo.a, Integer> $$1, int $$2, iw<avb> $$3, float $$4, float $$5, Supplier<cxa> $$6, List<cqp.a> $$7) {
      EnumMap<cqo.a, Integer> $$8 = new EnumMap<>(cqo.a.class);

      for (cqo.a $$9 : cqo.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return jj.b(ld.ar, new akh($$0), new cqp($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

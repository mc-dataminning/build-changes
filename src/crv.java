import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class crv {
   public static final jj<cru> a = a("leather", ac.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 1);
      $$0.put(crt.a.c, 2);
      $$0.put(crt.a.b, 3);
      $$0.put(crt.a.a, 1);
      $$0.put(crt.a.e, 3);
   }), 15, avh.av, 0.0F, 0.0F, () -> cyg.a(cug.qD), List.of(new cru.a(new akk("leather"), "", true), new cru.a(new akk("leather"), "_overlay", false)));
   public static final jj<cru> b = a("chainmail", ac.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 1);
      $$0.put(crt.a.c, 4);
      $$0.put(crt.a.b, 5);
      $$0.put(crt.a.a, 2);
      $$0.put(crt.a.e, 4);
   }), 12, avh.ap, 0.0F, 0.0F, () -> cyg.a(cug.oF));
   public static final jj<cru> c = a("iron", ac.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 2);
      $$0.put(crt.a.c, 5);
      $$0.put(crt.a.b, 6);
      $$0.put(crt.a.a, 2);
      $$0.put(crt.a.e, 5);
   }), 9, avh.au, 0.0F, 0.0F, () -> cyg.a(cug.oF));
   public static final jj<cru> d = a("gold", ac.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 1);
      $$0.put(crt.a.c, 3);
      $$0.put(crt.a.b, 5);
      $$0.put(crt.a.a, 2);
      $$0.put(crt.a.e, 7);
   }), 25, avh.at, 0.0F, 0.0F, () -> cyg.a(cug.oJ));
   public static final jj<cru> e = a("diamond", ac.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 3);
      $$0.put(crt.a.c, 6);
      $$0.put(crt.a.b, 8);
      $$0.put(crt.a.a, 3);
      $$0.put(crt.a.e, 11);
   }), 10, avh.aq, 2.0F, 0.0F, () -> cyg.a(cug.oz));
   public static final jj<cru> f = a("turtle", ac.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 2);
      $$0.put(crt.a.c, 5);
      $$0.put(crt.a.b, 6);
      $$0.put(crt.a.a, 2);
      $$0.put(crt.a.e, 5);
   }), 9, avh.ax, 0.0F, 0.0F, () -> cyg.a(cug.op));
   public static final jj<cru> g = a("netherite", ac.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 3);
      $$0.put(crt.a.c, 6);
      $$0.put(crt.a.b, 8);
      $$0.put(crt.a.a, 3);
      $$0.put(crt.a.e, 11);
   }), 15, avh.aw, 3.0F, 0.1F, () -> cyg.a(cug.oK));
   public static final jj<cru> h = a("armadillo", ac.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 3);
      $$0.put(crt.a.c, 6);
      $$0.put(crt.a.b, 8);
      $$0.put(crt.a.a, 3);
      $$0.put(crt.a.e, 11);
   }), 10, avh.ay, 0.0F, 0.0F, () -> cyg.a(cug.oq));

   public static jj<cru> a(jw<cru> $$0) {
      return a;
   }

   private static jj<cru> a(String $$0, EnumMap<crt.a, Integer> $$1, int $$2, jj<avg> $$3, float $$4, float $$5, Supplier<cyg> $$6) {
      List<cru.a> $$7 = List.of(new cru.a(new akk($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static jj<cru> a(String $$0, EnumMap<crt.a, Integer> $$1, int $$2, jj<avg> $$3, float $$4, float $$5, Supplier<cyg> $$6, List<cru.a> $$7) {
      EnumMap<crt.a, Integer> $$8 = new EnumMap<>(crt.a.class);

      for (crt.a $$9 : crt.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return jw.b(lq.ap, new akk($$0), new cru($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

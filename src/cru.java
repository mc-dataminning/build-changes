import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class cru {
   public static final jj<crt> a = a("leather", ac.a(new EnumMap<>(crs.a.class), $$0 -> {
      $$0.put(crs.a.d, 1);
      $$0.put(crs.a.c, 2);
      $$0.put(crs.a.b, 3);
      $$0.put(crs.a.a, 1);
      $$0.put(crs.a.e, 3);
   }), 15, avh.av, 0.0F, 0.0F, () -> cyf.a(cuf.qD), List.of(new crt.a(new akk("leather"), "", true), new crt.a(new akk("leather"), "_overlay", false)));
   public static final jj<crt> b = a("chainmail", ac.a(new EnumMap<>(crs.a.class), $$0 -> {
      $$0.put(crs.a.d, 1);
      $$0.put(crs.a.c, 4);
      $$0.put(crs.a.b, 5);
      $$0.put(crs.a.a, 2);
      $$0.put(crs.a.e, 4);
   }), 12, avh.ap, 0.0F, 0.0F, () -> cyf.a(cuf.oF));
   public static final jj<crt> c = a("iron", ac.a(new EnumMap<>(crs.a.class), $$0 -> {
      $$0.put(crs.a.d, 2);
      $$0.put(crs.a.c, 5);
      $$0.put(crs.a.b, 6);
      $$0.put(crs.a.a, 2);
      $$0.put(crs.a.e, 5);
   }), 9, avh.au, 0.0F, 0.0F, () -> cyf.a(cuf.oF));
   public static final jj<crt> d = a("gold", ac.a(new EnumMap<>(crs.a.class), $$0 -> {
      $$0.put(crs.a.d, 1);
      $$0.put(crs.a.c, 3);
      $$0.put(crs.a.b, 5);
      $$0.put(crs.a.a, 2);
      $$0.put(crs.a.e, 7);
   }), 25, avh.at, 0.0F, 0.0F, () -> cyf.a(cuf.oJ));
   public static final jj<crt> e = a("diamond", ac.a(new EnumMap<>(crs.a.class), $$0 -> {
      $$0.put(crs.a.d, 3);
      $$0.put(crs.a.c, 6);
      $$0.put(crs.a.b, 8);
      $$0.put(crs.a.a, 3);
      $$0.put(crs.a.e, 11);
   }), 10, avh.aq, 2.0F, 0.0F, () -> cyf.a(cuf.oz));
   public static final jj<crt> f = a("turtle", ac.a(new EnumMap<>(crs.a.class), $$0 -> {
      $$0.put(crs.a.d, 2);
      $$0.put(crs.a.c, 5);
      $$0.put(crs.a.b, 6);
      $$0.put(crs.a.a, 2);
      $$0.put(crs.a.e, 5);
   }), 9, avh.ax, 0.0F, 0.0F, () -> cyf.a(cuf.op));
   public static final jj<crt> g = a("netherite", ac.a(new EnumMap<>(crs.a.class), $$0 -> {
      $$0.put(crs.a.d, 3);
      $$0.put(crs.a.c, 6);
      $$0.put(crs.a.b, 8);
      $$0.put(crs.a.a, 3);
      $$0.put(crs.a.e, 11);
   }), 15, avh.aw, 3.0F, 0.1F, () -> cyf.a(cuf.oK));
   public static final jj<crt> h = a("armadillo", ac.a(new EnumMap<>(crs.a.class), $$0 -> {
      $$0.put(crs.a.d, 3);
      $$0.put(crs.a.c, 6);
      $$0.put(crs.a.b, 8);
      $$0.put(crs.a.a, 3);
      $$0.put(crs.a.e, 11);
   }), 10, avh.ay, 0.0F, 0.0F, () -> cyf.a(cuf.oq));

   public static jj<crt> a(jw<crt> $$0) {
      return a;
   }

   private static jj<crt> a(String $$0, EnumMap<crs.a, Integer> $$1, int $$2, jj<avg> $$3, float $$4, float $$5, Supplier<cyf> $$6) {
      List<crt.a> $$7 = List.of(new crt.a(new akk($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static jj<crt> a(String $$0, EnumMap<crs.a, Integer> $$1, int $$2, jj<avg> $$3, float $$4, float $$5, Supplier<cyf> $$6, List<crt.a> $$7) {
      EnumMap<crs.a, Integer> $$8 = new EnumMap<>(crs.a.class);

      for (crs.a $$9 : crs.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return jw.b(lq.ap, new akk($$0), new crt($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

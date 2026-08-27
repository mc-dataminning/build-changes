import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class crv {
   public static final ja<cru> a = a("leather", ad.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 1);
      $$0.put(crt.a.c, 2);
      $$0.put(crt.a.b, 3);
      $$0.put(crt.a.a, 1);
      $$0.put(crt.a.e, 3);
   }), 15, avo.aA, 0.0F, 0.0F, () -> cyv.a(cuk.sa), List.of(new cru.a(new akt("leather"), "", true), new cru.a(new akt("leather"), "_overlay", false)));
   public static final ja<cru> b = a("chainmail", ad.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 1);
      $$0.put(crt.a.c, 4);
      $$0.put(crt.a.b, 5);
      $$0.put(crt.a.a, 2);
      $$0.put(crt.a.e, 4);
   }), 12, avo.au, 0.0F, 0.0F, () -> cyv.a(cuk.pX));
   public static final ja<cru> c = a("iron", ad.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 2);
      $$0.put(crt.a.c, 5);
      $$0.put(crt.a.b, 6);
      $$0.put(crt.a.a, 2);
      $$0.put(crt.a.e, 5);
   }), 9, avo.az, 0.0F, 0.0F, () -> cyv.a(cuk.pX));
   public static final ja<cru> d = a("gold", ad.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 1);
      $$0.put(crt.a.c, 3);
      $$0.put(crt.a.b, 5);
      $$0.put(crt.a.a, 2);
      $$0.put(crt.a.e, 7);
   }), 25, avo.ay, 0.0F, 0.0F, () -> cyv.a(cuk.qb));
   public static final ja<cru> e = a("diamond", ad.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 3);
      $$0.put(crt.a.c, 6);
      $$0.put(crt.a.b, 8);
      $$0.put(crt.a.a, 3);
      $$0.put(crt.a.e, 11);
   }), 10, avo.av, 2.0F, 0.0F, () -> cyv.a(cuk.pO));
   public static final ja<cru> f = a("turtle", ad.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 2);
      $$0.put(crt.a.c, 5);
      $$0.put(crt.a.b, 6);
      $$0.put(crt.a.a, 2);
      $$0.put(crt.a.e, 5);
   }), 9, avo.aC, 0.0F, 0.0F, () -> cyv.a(cuk.pF));
   public static final ja<cru> g = a("netherite", ad.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 3);
      $$0.put(crt.a.c, 6);
      $$0.put(crt.a.b, 8);
      $$0.put(crt.a.a, 3);
      $$0.put(crt.a.e, 11);
   }), 15, avo.aB, 3.0F, 0.1F, () -> cyv.a(cuk.qc));
   public static final ja<cru> h = a("armadillo", ad.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 3);
      $$0.put(crt.a.c, 6);
      $$0.put(crt.a.b, 8);
      $$0.put(crt.a.a, 3);
      $$0.put(crt.a.e, 11);
   }), 10, avo.aD, 0.0F, 0.0F, () -> cyv.a(cuk.pG));
   public static final ja<cru> i = a("potato", ad.a(new EnumMap<>(crt.a.class), $$0 -> {
      $$0.put(crt.a.d, 0);
      $$0.put(crt.a.c, 0);
      $$0.put(crt.a.b, 0);
      $$0.put(crt.a.a, 0);
      $$0.put(crt.a.e, 0);
   }), 9, avo.aC, 0.0F, 0.0F, () -> cyv.a(cuk.AH));

   public static ja<cru> a(jn<cru> $$0) {
      return a;
   }

   private static ja<cru> a(String $$0, EnumMap<crt.a, Integer> $$1, int $$2, ja<avn> $$3, float $$4, float $$5, Supplier<cyv> $$6) {
      List<cru.a> $$7 = List.of(new cru.a(new akt($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ja<cru> a(String $$0, EnumMap<crt.a, Integer> $$1, int $$2, ja<avn> $$3, float $$4, float $$5, Supplier<cyv> $$6, List<cru.a> $$7) {
      EnumMap<crt.a, Integer> $$8 = new EnumMap<>(crt.a.class);

      for (crt.a $$9 : crt.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return jn.b(lh.ar, new akt($$0), new cru($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

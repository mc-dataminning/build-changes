import java.util.EnumMap;
import java.util.List;
import java.util.function.Predicate;

public class ctk {
   static int a = 15;
   static int b = 12;
   static int c = 9;
   static int d = 25;
   static int e = 10;
   static int f = 9;
   static int g = 15;
   public static final jn<ctj> h = a("leather", ad.a(new EnumMap<>(cti.a.class), $$0 -> {
      $$0.put(cti.a.d, 1);
      $$0.put(cti.a.c, 2);
      $$0.put(cti.a.b, 3);
      $$0.put(cti.a.a, 1);
      $$0.put(cti.a.e, 3);
   }), awe.av, 0.0F, 0.0F, $$0 -> $$0.a(cvt.qE), List.of(new ctj.a(alc.b("leather"), "", true), new ctj.a(alc.b("leather"), "_overlay", false)));
   public static final jn<ctj> i = a("chainmail", ad.a(new EnumMap<>(cti.a.class), $$0 -> {
      $$0.put(cti.a.d, 1);
      $$0.put(cti.a.c, 4);
      $$0.put(cti.a.b, 5);
      $$0.put(cti.a.a, 2);
      $$0.put(cti.a.e, 4);
   }), awe.ap, 0.0F, 0.0F, $$0 -> $$0.a(cvt.oG));
   public static final jn<ctj> j = a("iron", ad.a(new EnumMap<>(cti.a.class), $$0 -> {
      $$0.put(cti.a.d, 2);
      $$0.put(cti.a.c, 5);
      $$0.put(cti.a.b, 6);
      $$0.put(cti.a.a, 2);
      $$0.put(cti.a.e, 5);
   }), awe.au, 0.0F, 0.0F, $$0 -> $$0.a(cvt.oG));
   public static final jn<ctj> k = a("gold", ad.a(new EnumMap<>(cti.a.class), $$0 -> {
      $$0.put(cti.a.d, 1);
      $$0.put(cti.a.c, 3);
      $$0.put(cti.a.b, 5);
      $$0.put(cti.a.a, 2);
      $$0.put(cti.a.e, 7);
   }), awe.at, 0.0F, 0.0F, $$0 -> $$0.a(cvt.oK));
   public static final jn<ctj> l = a("diamond", ad.a(new EnumMap<>(cti.a.class), $$0 -> {
      $$0.put(cti.a.d, 3);
      $$0.put(cti.a.c, 6);
      $$0.put(cti.a.b, 8);
      $$0.put(cti.a.a, 3);
      $$0.put(cti.a.e, 11);
   }), awe.aq, 2.0F, 0.0F, $$0 -> $$0.a(cvt.oA));
   public static final jn<ctj> m = a("turtle", ad.a(new EnumMap<>(cti.a.class), $$0 -> {
      $$0.put(cti.a.d, 2);
      $$0.put(cti.a.c, 5);
      $$0.put(cti.a.b, 6);
      $$0.put(cti.a.a, 2);
      $$0.put(cti.a.e, 5);
   }), awe.ax, 0.0F, 0.0F, $$0 -> $$0.a(cvt.oq));
   public static final jn<ctj> n = a("netherite", ad.a(new EnumMap<>(cti.a.class), $$0 -> {
      $$0.put(cti.a.d, 3);
      $$0.put(cti.a.c, 6);
      $$0.put(cti.a.b, 8);
      $$0.put(cti.a.a, 3);
      $$0.put(cti.a.e, 11);
   }), awe.aw, 3.0F, 0.1F, $$0 -> $$0.a(cvt.oL));
   public static final jn<ctj> o = a("armadillo", ad.a(new EnumMap<>(cti.a.class), $$0 -> {
      $$0.put(cti.a.d, 3);
      $$0.put(cti.a.c, 6);
      $$0.put(cti.a.b, 8);
      $$0.put(cti.a.a, 3);
      $$0.put(cti.a.e, 11);
   }), awe.ay, 0.0F, 0.0F, $$0 -> $$0.a(cvt.or));

   public static jn<ctj> a(ka<ctj> $$0) {
      return h;
   }

   private static jn<ctj> a(String $$0, EnumMap<cti.a, Integer> $$1, jn<awd> $$2, float $$3, float $$4, Predicate<cvp> $$5) {
      List<ctj.a> $$6 = List.of(new ctj.a(alc.b($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private static jn<ctj> a(String $$0, EnumMap<cti.a, Integer> $$1, jn<awd> $$2, float $$3, float $$4, Predicate<cvp> $$5, List<ctj.a> $$6) {
      EnumMap<cti.a, Integer> $$7 = new EnumMap<>(cti.a.class);

      for (cti.a $$8 : cti.a.values()) {
         $$7.put($$8, $$1.get($$8));
      }

      return ka.b(lu.ao, alc.b($$0), new ctj($$7, $$2, $$5, $$6, $$3, $$4));
   }
}

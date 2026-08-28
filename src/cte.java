import java.util.EnumMap;
import java.util.List;
import java.util.function.Predicate;

public class cte {
   public static final jn<ctd> a = a("leather", ad.a(new EnumMap<>(ctc.a.class), $$0 -> {
      $$0.put(ctc.a.d, 1);
      $$0.put(ctc.a.c, 2);
      $$0.put(ctc.a.b, 3);
      $$0.put(ctc.a.a, 1);
      $$0.put(ctc.a.e, 3);
   }), 15, awd.av, 0.0F, 0.0F, $$0 -> $$0.a(cvo.qE), List.of(new ctd.a(alb.b("leather"), "", true), new ctd.a(alb.b("leather"), "_overlay", false)));
   public static final jn<ctd> b = a("chainmail", ad.a(new EnumMap<>(ctc.a.class), $$0 -> {
      $$0.put(ctc.a.d, 1);
      $$0.put(ctc.a.c, 4);
      $$0.put(ctc.a.b, 5);
      $$0.put(ctc.a.a, 2);
      $$0.put(ctc.a.e, 4);
   }), 12, awd.ap, 0.0F, 0.0F, $$0 -> $$0.a(cvo.oG));
   public static final jn<ctd> c = a("iron", ad.a(new EnumMap<>(ctc.a.class), $$0 -> {
      $$0.put(ctc.a.d, 2);
      $$0.put(ctc.a.c, 5);
      $$0.put(ctc.a.b, 6);
      $$0.put(ctc.a.a, 2);
      $$0.put(ctc.a.e, 5);
   }), 9, awd.au, 0.0F, 0.0F, $$0 -> $$0.a(cvo.oG));
   public static final jn<ctd> d = a("gold", ad.a(new EnumMap<>(ctc.a.class), $$0 -> {
      $$0.put(ctc.a.d, 1);
      $$0.put(ctc.a.c, 3);
      $$0.put(ctc.a.b, 5);
      $$0.put(ctc.a.a, 2);
      $$0.put(ctc.a.e, 7);
   }), 25, awd.at, 0.0F, 0.0F, $$0 -> $$0.a(cvo.oK));
   public static final jn<ctd> e = a("diamond", ad.a(new EnumMap<>(ctc.a.class), $$0 -> {
      $$0.put(ctc.a.d, 3);
      $$0.put(ctc.a.c, 6);
      $$0.put(ctc.a.b, 8);
      $$0.put(ctc.a.a, 3);
      $$0.put(ctc.a.e, 11);
   }), 10, awd.aq, 2.0F, 0.0F, $$0 -> $$0.a(cvo.oA));
   public static final jn<ctd> f = a("turtle", ad.a(new EnumMap<>(ctc.a.class), $$0 -> {
      $$0.put(ctc.a.d, 2);
      $$0.put(ctc.a.c, 5);
      $$0.put(ctc.a.b, 6);
      $$0.put(ctc.a.a, 2);
      $$0.put(ctc.a.e, 5);
   }), 9, awd.ax, 0.0F, 0.0F, $$0 -> $$0.a(cvo.oq));
   public static final jn<ctd> g = a("netherite", ad.a(new EnumMap<>(ctc.a.class), $$0 -> {
      $$0.put(ctc.a.d, 3);
      $$0.put(ctc.a.c, 6);
      $$0.put(ctc.a.b, 8);
      $$0.put(ctc.a.a, 3);
      $$0.put(ctc.a.e, 11);
   }), 15, awd.aw, 3.0F, 0.1F, $$0 -> $$0.a(cvo.oL));
   public static final jn<ctd> h = a("armadillo", ad.a(new EnumMap<>(ctc.a.class), $$0 -> {
      $$0.put(ctc.a.d, 3);
      $$0.put(ctc.a.c, 6);
      $$0.put(ctc.a.b, 8);
      $$0.put(ctc.a.a, 3);
      $$0.put(ctc.a.e, 11);
   }), 10, awd.ay, 0.0F, 0.0F, $$0 -> $$0.a(cvo.or));

   public static jn<ctd> a(ka<ctd> $$0) {
      return a;
   }

   private static jn<ctd> a(String $$0, EnumMap<ctc.a, Integer> $$1, int $$2, jn<awc> $$3, float $$4, float $$5, Predicate<cvl> $$6) {
      List<ctd.a> $$7 = List.of(new ctd.a(alb.b($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static jn<ctd> a(String $$0, EnumMap<ctc.a, Integer> $$1, int $$2, jn<awc> $$3, float $$4, float $$5, Predicate<cvl> $$6, List<ctd.a> $$7) {
      EnumMap<ctc.a, Integer> $$8 = new EnumMap<>(ctc.a.class);

      for (ctc.a $$9 : ctc.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return ka.b(lu.ao, alb.b($$0), new ctd($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

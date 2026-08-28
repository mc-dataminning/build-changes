import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class csh {
   public static final jm<csg> a = a("leather", ad.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 1);
      $$0.put(csf.a.c, 2);
      $$0.put(csf.a.b, 3);
      $$0.put(csf.a.a, 1);
      $$0.put(csf.a.e, 3);
   }), 15, avp.av, 0.0F, 0.0F, () -> cyw.a(cut.qD), List.of(new csg.a(akr.b("leather"), "", true), new csg.a(akr.b("leather"), "_overlay", false)));
   public static final jm<csg> b = a("chainmail", ad.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 1);
      $$0.put(csf.a.c, 4);
      $$0.put(csf.a.b, 5);
      $$0.put(csf.a.a, 2);
      $$0.put(csf.a.e, 4);
   }), 12, avp.ap, 0.0F, 0.0F, () -> cyw.a(cut.oF));
   public static final jm<csg> c = a("iron", ad.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 2);
      $$0.put(csf.a.c, 5);
      $$0.put(csf.a.b, 6);
      $$0.put(csf.a.a, 2);
      $$0.put(csf.a.e, 5);
   }), 9, avp.au, 0.0F, 0.0F, () -> cyw.a(cut.oF));
   public static final jm<csg> d = a("gold", ad.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 1);
      $$0.put(csf.a.c, 3);
      $$0.put(csf.a.b, 5);
      $$0.put(csf.a.a, 2);
      $$0.put(csf.a.e, 7);
   }), 25, avp.at, 0.0F, 0.0F, () -> cyw.a(cut.oJ));
   public static final jm<csg> e = a("diamond", ad.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 3);
      $$0.put(csf.a.c, 6);
      $$0.put(csf.a.b, 8);
      $$0.put(csf.a.a, 3);
      $$0.put(csf.a.e, 11);
   }), 10, avp.aq, 2.0F, 0.0F, () -> cyw.a(cut.oz));
   public static final jm<csg> f = a("turtle", ad.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 2);
      $$0.put(csf.a.c, 5);
      $$0.put(csf.a.b, 6);
      $$0.put(csf.a.a, 2);
      $$0.put(csf.a.e, 5);
   }), 9, avp.ax, 0.0F, 0.0F, () -> cyw.a(cut.op));
   public static final jm<csg> g = a("netherite", ad.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 3);
      $$0.put(csf.a.c, 6);
      $$0.put(csf.a.b, 8);
      $$0.put(csf.a.a, 3);
      $$0.put(csf.a.e, 11);
   }), 15, avp.aw, 3.0F, 0.1F, () -> cyw.a(cut.oK));
   public static final jm<csg> h = a("armadillo", ad.a(new EnumMap<>(csf.a.class), $$0 -> {
      $$0.put(csf.a.d, 3);
      $$0.put(csf.a.c, 6);
      $$0.put(csf.a.b, 8);
      $$0.put(csf.a.a, 3);
      $$0.put(csf.a.e, 11);
   }), 10, avp.ay, 0.0F, 0.0F, () -> cyw.a(cut.oq));

   public static jm<csg> a(jz<csg> $$0) {
      return a;
   }

   private static jm<csg> a(String $$0, EnumMap<csf.a, Integer> $$1, int $$2, jm<avo> $$3, float $$4, float $$5, Supplier<cyw> $$6) {
      List<csg.a> $$7 = List.of(new csg.a(akr.b($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static jm<csg> a(String $$0, EnumMap<csf.a, Integer> $$1, int $$2, jm<avo> $$3, float $$4, float $$5, Supplier<cyw> $$6, List<csg.a> $$7) {
      EnumMap<csf.a, Integer> $$8 = new EnumMap<>(csf.a.class);

      for (csf.a $$9 : csf.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return jz.b(lt.ap, akr.b($$0), new csg($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

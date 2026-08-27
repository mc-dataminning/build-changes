import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class crf {
   public static final ix<cre> a = a("leather", ac.a(new EnumMap<>(crd.a.class), $$0 -> {
      $$0.put(crd.a.d, 1);
      $$0.put(crd.a.c, 2);
      $$0.put(crd.a.b, 3);
      $$0.put(crd.a.a, 1);
      $$0.put(crd.a.e, 3);
   }), 15, avh.av, 0.0F, 0.0F, () -> cxr.a(ctr.qD), List.of(new cre.a(new akm("leather"), "", true), new cre.a(new akm("leather"), "_overlay", false)));
   public static final ix<cre> b = a("chainmail", ac.a(new EnumMap<>(crd.a.class), $$0 -> {
      $$0.put(crd.a.d, 1);
      $$0.put(crd.a.c, 4);
      $$0.put(crd.a.b, 5);
      $$0.put(crd.a.a, 2);
      $$0.put(crd.a.e, 4);
   }), 12, avh.ap, 0.0F, 0.0F, () -> cxr.a(ctr.oE));
   public static final ix<cre> c = a("iron", ac.a(new EnumMap<>(crd.a.class), $$0 -> {
      $$0.put(crd.a.d, 2);
      $$0.put(crd.a.c, 5);
      $$0.put(crd.a.b, 6);
      $$0.put(crd.a.a, 2);
      $$0.put(crd.a.e, 5);
   }), 9, avh.au, 0.0F, 0.0F, () -> cxr.a(ctr.oE));
   public static final ix<cre> d = a("gold", ac.a(new EnumMap<>(crd.a.class), $$0 -> {
      $$0.put(crd.a.d, 1);
      $$0.put(crd.a.c, 3);
      $$0.put(crd.a.b, 5);
      $$0.put(crd.a.a, 2);
      $$0.put(crd.a.e, 7);
   }), 25, avh.at, 0.0F, 0.0F, () -> cxr.a(ctr.oI));
   public static final ix<cre> e = a("diamond", ac.a(new EnumMap<>(crd.a.class), $$0 -> {
      $$0.put(crd.a.d, 3);
      $$0.put(crd.a.c, 6);
      $$0.put(crd.a.b, 8);
      $$0.put(crd.a.a, 3);
      $$0.put(crd.a.e, 11);
   }), 10, avh.aq, 2.0F, 0.0F, () -> cxr.a(ctr.oy));
   public static final ix<cre> f = a("turtle", ac.a(new EnumMap<>(crd.a.class), $$0 -> {
      $$0.put(crd.a.d, 2);
      $$0.put(crd.a.c, 5);
      $$0.put(crd.a.b, 6);
      $$0.put(crd.a.a, 2);
      $$0.put(crd.a.e, 5);
   }), 9, avh.ax, 0.0F, 0.0F, () -> cxr.a(ctr.op));
   public static final ix<cre> g = a("netherite", ac.a(new EnumMap<>(crd.a.class), $$0 -> {
      $$0.put(crd.a.d, 3);
      $$0.put(crd.a.c, 6);
      $$0.put(crd.a.b, 8);
      $$0.put(crd.a.a, 3);
      $$0.put(crd.a.e, 11);
   }), 15, avh.aw, 3.0F, 0.1F, () -> cxr.a(ctr.oJ));
   public static final ix<cre> h = a("armadillo", ac.a(new EnumMap<>(crd.a.class), $$0 -> {
      $$0.put(crd.a.d, 3);
      $$0.put(crd.a.c, 6);
      $$0.put(crd.a.b, 8);
      $$0.put(crd.a.a, 3);
      $$0.put(crd.a.e, 11);
   }), 10, avh.ay, 0.0F, 0.0F, () -> cxr.a(ctr.oq));

   public static ix<cre> a(jk<cre> $$0) {
      return a;
   }

   private static ix<cre> a(String $$0, EnumMap<crd.a, Integer> $$1, int $$2, ix<avg> $$3, float $$4, float $$5, Supplier<cxr> $$6) {
      List<cre.a> $$7 = List.of(new cre.a(new akm($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ix<cre> a(String $$0, EnumMap<crd.a, Integer> $$1, int $$2, ix<avg> $$3, float $$4, float $$5, Supplier<cxr> $$6, List<cre.a> $$7) {
      EnumMap<crd.a, Integer> $$8 = new EnumMap<>(crd.a.class);

      for (crd.a $$9 : crd.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return jk.b(le.ar, new akm($$0), new cre($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

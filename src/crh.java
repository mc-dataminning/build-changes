import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class crh {
   public static final ix<crg> a = a("leather", ac.a(new EnumMap<>(crf.a.class), $$0 -> {
      $$0.put(crf.a.d, 1);
      $$0.put(crf.a.c, 2);
      $$0.put(crf.a.b, 3);
      $$0.put(crf.a.a, 1);
      $$0.put(crf.a.e, 3);
   }), 15, avi.av, 0.0F, 0.0F, () -> cxt.a(ctt.qD), List.of(new crg.a(new akn("leather"), "", true), new crg.a(new akn("leather"), "_overlay", false)));
   public static final ix<crg> b = a("chainmail", ac.a(new EnumMap<>(crf.a.class), $$0 -> {
      $$0.put(crf.a.d, 1);
      $$0.put(crf.a.c, 4);
      $$0.put(crf.a.b, 5);
      $$0.put(crf.a.a, 2);
      $$0.put(crf.a.e, 4);
   }), 12, avi.ap, 0.0F, 0.0F, () -> cxt.a(ctt.oE));
   public static final ix<crg> c = a("iron", ac.a(new EnumMap<>(crf.a.class), $$0 -> {
      $$0.put(crf.a.d, 2);
      $$0.put(crf.a.c, 5);
      $$0.put(crf.a.b, 6);
      $$0.put(crf.a.a, 2);
      $$0.put(crf.a.e, 5);
   }), 9, avi.au, 0.0F, 0.0F, () -> cxt.a(ctt.oE));
   public static final ix<crg> d = a("gold", ac.a(new EnumMap<>(crf.a.class), $$0 -> {
      $$0.put(crf.a.d, 1);
      $$0.put(crf.a.c, 3);
      $$0.put(crf.a.b, 5);
      $$0.put(crf.a.a, 2);
      $$0.put(crf.a.e, 7);
   }), 25, avi.at, 0.0F, 0.0F, () -> cxt.a(ctt.oI));
   public static final ix<crg> e = a("diamond", ac.a(new EnumMap<>(crf.a.class), $$0 -> {
      $$0.put(crf.a.d, 3);
      $$0.put(crf.a.c, 6);
      $$0.put(crf.a.b, 8);
      $$0.put(crf.a.a, 3);
      $$0.put(crf.a.e, 11);
   }), 10, avi.aq, 2.0F, 0.0F, () -> cxt.a(ctt.oy));
   public static final ix<crg> f = a("turtle", ac.a(new EnumMap<>(crf.a.class), $$0 -> {
      $$0.put(crf.a.d, 2);
      $$0.put(crf.a.c, 5);
      $$0.put(crf.a.b, 6);
      $$0.put(crf.a.a, 2);
      $$0.put(crf.a.e, 5);
   }), 9, avi.ax, 0.0F, 0.0F, () -> cxt.a(ctt.op));
   public static final ix<crg> g = a("netherite", ac.a(new EnumMap<>(crf.a.class), $$0 -> {
      $$0.put(crf.a.d, 3);
      $$0.put(crf.a.c, 6);
      $$0.put(crf.a.b, 8);
      $$0.put(crf.a.a, 3);
      $$0.put(crf.a.e, 11);
   }), 15, avi.aw, 3.0F, 0.1F, () -> cxt.a(ctt.oJ));
   public static final ix<crg> h = a("armadillo", ac.a(new EnumMap<>(crf.a.class), $$0 -> {
      $$0.put(crf.a.d, 3);
      $$0.put(crf.a.c, 6);
      $$0.put(crf.a.b, 8);
      $$0.put(crf.a.a, 3);
      $$0.put(crf.a.e, 11);
   }), 10, avi.ay, 0.0F, 0.0F, () -> cxt.a(ctt.oq));

   public static ix<crg> a(jk<crg> $$0) {
      return a;
   }

   private static ix<crg> a(String $$0, EnumMap<crf.a, Integer> $$1, int $$2, ix<avh> $$3, float $$4, float $$5, Supplier<cxt> $$6) {
      List<crg.a> $$7 = List.of(new crg.a(new akn($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static ix<crg> a(String $$0, EnumMap<crf.a, Integer> $$1, int $$2, ix<avh> $$3, float $$4, float $$5, Supplier<cxt> $$6, List<crg.a> $$7) {
      EnumMap<crf.a, Integer> $$8 = new EnumMap<>(crf.a.class);

      for (crf.a $$9 : crf.a.values()) {
         $$8.put($$9, $$1.get($$9));
      }

      return jk.b(le.ar, new akn($$0), new crg($$8, $$2, $$3, $$6, $$7, $$4, $$5));
   }
}

import java.util.EnumMap;
import java.util.List;
import java.util.function.Predicate;

public class ctn {
   static int a = 15;
   static int b = 12;
   static int c = 9;
   static int d = 25;
   static int e = 10;
   static int f = 9;
   static int g = 15;
   public static final jo<ctm> h = a("leather", ad.a(new EnumMap<>(ctl.a.class), $$0 -> {
      $$0.put(ctl.a.d, 1);
      $$0.put(ctl.a.c, 2);
      $$0.put(ctl.a.b, 3);
      $$0.put(ctl.a.a, 1);
      $$0.put(ctl.a.e, 3);
   }), awg.av, 0.0F, 0.0F, $$0 -> $$0.a(cvw.qE), List.of(new ctm.a(ale.b("leather"), "", true), new ctm.a(ale.b("leather"), "_overlay", false)));
   public static final jo<ctm> i = a("chainmail", ad.a(new EnumMap<>(ctl.a.class), $$0 -> {
      $$0.put(ctl.a.d, 1);
      $$0.put(ctl.a.c, 4);
      $$0.put(ctl.a.b, 5);
      $$0.put(ctl.a.a, 2);
      $$0.put(ctl.a.e, 4);
   }), awg.ap, 0.0F, 0.0F, $$0 -> $$0.a(cvw.oG));
   public static final jo<ctm> j = a("iron", ad.a(new EnumMap<>(ctl.a.class), $$0 -> {
      $$0.put(ctl.a.d, 2);
      $$0.put(ctl.a.c, 5);
      $$0.put(ctl.a.b, 6);
      $$0.put(ctl.a.a, 2);
      $$0.put(ctl.a.e, 5);
   }), awg.au, 0.0F, 0.0F, $$0 -> $$0.a(cvw.oG));
   public static final jo<ctm> k = a("gold", ad.a(new EnumMap<>(ctl.a.class), $$0 -> {
      $$0.put(ctl.a.d, 1);
      $$0.put(ctl.a.c, 3);
      $$0.put(ctl.a.b, 5);
      $$0.put(ctl.a.a, 2);
      $$0.put(ctl.a.e, 7);
   }), awg.at, 0.0F, 0.0F, $$0 -> $$0.a(cvw.oK));
   public static final jo<ctm> l = a("diamond", ad.a(new EnumMap<>(ctl.a.class), $$0 -> {
      $$0.put(ctl.a.d, 3);
      $$0.put(ctl.a.c, 6);
      $$0.put(ctl.a.b, 8);
      $$0.put(ctl.a.a, 3);
      $$0.put(ctl.a.e, 11);
   }), awg.aq, 2.0F, 0.0F, $$0 -> $$0.a(cvw.oA));
   public static final jo<ctm> m = a("turtle", ad.a(new EnumMap<>(ctl.a.class), $$0 -> {
      $$0.put(ctl.a.d, 2);
      $$0.put(ctl.a.c, 5);
      $$0.put(ctl.a.b, 6);
      $$0.put(ctl.a.a, 2);
      $$0.put(ctl.a.e, 5);
   }), awg.ax, 0.0F, 0.0F, $$0 -> $$0.a(cvw.oq));
   public static final jo<ctm> n = a("netherite", ad.a(new EnumMap<>(ctl.a.class), $$0 -> {
      $$0.put(ctl.a.d, 3);
      $$0.put(ctl.a.c, 6);
      $$0.put(ctl.a.b, 8);
      $$0.put(ctl.a.a, 3);
      $$0.put(ctl.a.e, 11);
   }), awg.aw, 3.0F, 0.1F, $$0 -> $$0.a(cvw.oL));
   public static final jo<ctm> o = a("armadillo", ad.a(new EnumMap<>(ctl.a.class), $$0 -> {
      $$0.put(ctl.a.d, 3);
      $$0.put(ctl.a.c, 6);
      $$0.put(ctl.a.b, 8);
      $$0.put(ctl.a.a, 3);
      $$0.put(ctl.a.e, 11);
   }), awg.ay, 0.0F, 0.0F, $$0 -> $$0.a(cvw.or));

   public static jo<ctm> a(kb<ctm> $$0) {
      return h;
   }

   private static jo<ctm> a(String $$0, EnumMap<ctl.a, Integer> $$1, jo<awf> $$2, float $$3, float $$4, Predicate<cvs> $$5) {
      List<ctm.a> $$6 = List.of(new ctm.a(ale.b($$0)));
      return a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private static jo<ctm> a(String $$0, EnumMap<ctl.a, Integer> $$1, jo<awf> $$2, float $$3, float $$4, Predicate<cvs> $$5, List<ctm.a> $$6) {
      EnumMap<ctl.a, Integer> $$7 = new EnumMap<>(ctl.a.class);

      for (ctl.a $$8 : ctl.a.values()) {
         $$7.put($$8, $$1.get($$8));
      }

      return kb.b(lv.ao, ale.b($$0), new ctm($$7, $$2, $$5, $$6, $$3, $$4));
   }
}

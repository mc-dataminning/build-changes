public class eda {
   public static final edd a = a("empty", new ecx.a());
   public static final edd b = a("item", new ecz.a());
   public static final edd c = a("loot_table", new edf.a());
   public static final edd d = a("dynamic", new ecw.a());
   public static final edd e = a("tag", new edh.a());
   public static final edd f = a("alternatives", ecv.a(ect::new));
   public static final edd g = a("sequence", ecv.a(edg::new));
   public static final edd h = a("group", ecv.a(ecy::new));

   private static edd a(String $$0, ecq<? extends edc> $$1) {
      return hs.a(jc.G, new aep($$0), new edd($$1));
   }

   public static Object a() {
      return ecf.<edc, edd>a(jc.G, "entry", "type", edc::a).a();
   }
}

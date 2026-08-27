public class chl<T extends cge> implements cfs {
   public static final chl<cgl> a = a("generic_9x1", cgl::a);
   public static final chl<cgl> b = a("generic_9x2", cgl::b);
   public static final chl<cgl> c = a("generic_9x3", cgl::c);
   public static final chl<cgl> d = a("generic_9x4", cgl::d);
   public static final chl<cgl> e = a("generic_9x5", cgl::e);
   public static final chl<cgl> f = a("generic_9x6", cgl::f);
   public static final chl<cgx> g = a("generic_3x3", cgx::new);
   public static final chl<cgs> h = a("crafter_3x3", cgs::new);
   public static final chl<cgg> i = a("anvil", cgg::new);
   public static final chl<cgh> j = a("beacon", cgh::new);
   public static final chl<cgi> k = a("blast_furnace", cgi::new);
   public static final chl<cgj> l = a("brewing_stand", cgj::new);
   public static final chl<cgv> m = a("crafting", cgv::new);
   public static final chl<cgy> n = a("enchantment", cgy::new);
   public static final chl<cha> o = a("furnace", cha::new);
   public static final chl<chc> p = a("grindstone", chc::new);
   public static final chl<chd> q = a("hopper", chd::new);
   public static final chl<chi> r = a("lectern", ($$0, $$1) -> new chi($$0));
   public static final chl<chj> s = a("loom", chj::new);
   public static final chl<chn> t = a("merchant", chn::new);
   public static final chl<chw> u = a("shulker_box", chw::new);
   public static final chl<cia> v = a("smithing", cia::new);
   public static final chl<cib> w = a("smoker", cib::new);
   public static final chl<cgk> x = a("cartography_table", cgk::new);
   public static final chl<cid> y = a("stonecutter", cid::new);
   private final cfv z;
   private final chl.a<T> A;

   private static <T extends cge> chl<T> a(String $$0, chl.a<T> $$1) {
      return io.a(jy.s, $$0, new chl<>($$1, cfx.g));
   }

   private static <T extends cge> chl<T> a(String $$0, chl.a<T> $$1, cft... $$2) {
      return io.a(jy.s, $$0, new chl<>($$1, cfx.e.a($$2)));
   }

   private chl(chl.a<T> $$0, cfv $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cdl $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cfv m() {
      return this.z;
   }

   interface a<T extends cge> {
      T create(int var1, cdl var2);
   }
}

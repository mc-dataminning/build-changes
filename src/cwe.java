public class cwe<T extends cuv> implements cuj {
   public static final cwe<cve> a = a("generic_9x1", cve::a);
   public static final cwe<cve> b = a("generic_9x2", cve::b);
   public static final cwe<cve> c = a("generic_9x3", cve::c);
   public static final cwe<cve> d = a("generic_9x4", cve::d);
   public static final cwe<cve> e = a("generic_9x5", cve::e);
   public static final cwe<cve> f = a("generic_9x6", cve::f);
   public static final cwe<cvq> g = a("generic_3x3", cvq::new);
   public static final cwe<cvl> h = a("crafter_3x3", cvl::new);
   public static final cwe<cuy> i = a("anvil", cuy::new);
   public static final cwe<cva> j = a("beacon", cva::new);
   public static final cwe<cvb> k = a("blast_furnace", cvb::new);
   public static final cwe<cvc> l = a("brewing_stand", cvc::new);
   public static final cwe<cvo> m = a("crafting", cvo::new);
   public static final cwe<cvr> n = a("enchantment", cvr::new);
   public static final cwe<cvt> o = a("furnace", cvt::new);
   public static final cwe<cvv> p = a("grindstone", cvv::new);
   public static final cwe<cvw> q = a("hopper", cvw::new);
   public static final cwe<cwb> r = a("lectern", ($$0, $$1) -> new cwb($$0));
   public static final cwe<cwc> s = a("loom", cwc::new);
   public static final cwe<cwg> t = a("merchant", cwg::new);
   public static final cwe<cwp> u = a("shulker_box", cwp::new);
   public static final cwe<cwv> v = a("smithing", cwv::new);
   public static final cwe<cww> w = a("smoker", cww::new);
   public static final cwe<cvd> x = a("cartography_table", cvd::new);
   public static final cwe<cwy> y = a("stonecutter", cwy::new);
   private final cum z;
   private final cwe.a<T> A;

   private static <T extends cuv> cwe<T> a(String $$0, cwe.a<T> $$1) {
      return jr.a(mf.p, $$0, new cwe<>($$1, cuo.g));
   }

   private static <T extends cuv> cwe<T> a(String $$0, cwe.a<T> $$1, cuk... $$2) {
      return jr.a(mf.p, $$0, new cwe<>($$1, cuo.e.a($$2)));
   }

   private cwe(cwe.a<T> $$0, cum $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, crb $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cum k() {
      return this.z;
   }

   interface a<T extends cuv> {
      T create(int var1, crb var2);
   }
}

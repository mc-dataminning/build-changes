public class cxk<T extends cwb> implements cvp {
   public static final cxk<cwk> a = a("generic_9x1", cwk::a);
   public static final cxk<cwk> b = a("generic_9x2", cwk::b);
   public static final cxk<cwk> c = a("generic_9x3", cwk::c);
   public static final cxk<cwk> d = a("generic_9x4", cwk::d);
   public static final cxk<cwk> e = a("generic_9x5", cwk::e);
   public static final cxk<cwk> f = a("generic_9x6", cwk::f);
   public static final cxk<cww> g = a("generic_3x3", cww::new);
   public static final cxk<cwr> h = a("crafter_3x3", cwr::new);
   public static final cxk<cwe> i = a("anvil", cwe::new);
   public static final cxk<cwg> j = a("beacon", cwg::new);
   public static final cxk<cwh> k = a("blast_furnace", cwh::new);
   public static final cxk<cwi> l = a("brewing_stand", cwi::new);
   public static final cxk<cwu> m = a("crafting", cwu::new);
   public static final cxk<cwx> n = a("enchantment", cwx::new);
   public static final cxk<cwz> o = a("furnace", cwz::new);
   public static final cxk<cxb> p = a("grindstone", cxb::new);
   public static final cxk<cxc> q = a("hopper", cxc::new);
   public static final cxk<cxh> r = a("lectern", ($$0, $$1) -> new cxh($$0));
   public static final cxk<cxi> s = a("loom", cxi::new);
   public static final cxk<cxm> t = a("merchant", cxm::new);
   public static final cxk<cxw> u = a("shulker_box", cxw::new);
   public static final cxk<cyc> v = a("smithing", cyc::new);
   public static final cxk<cyd> w = a("smoker", cyd::new);
   public static final cxk<cwj> x = a("cartography_table", cwj::new);
   public static final cxk<cyf> y = a("stonecutter", cyf::new);
   private final cvs z;
   private final cxk.a<T> A;

   private static <T extends cwb> cxk<T> a(String $$0, cxk.a<T> $$1) {
      return jt.a(mh.p, $$0, new cxk<>($$1, cvu.g));
   }

   private static <T extends cwb> cxk<T> a(String $$0, cxk.a<T> $$1, cvq... $$2) {
      return jt.a(mh.p, $$0, new cxk<>($$1, cvu.e.a($$2)));
   }

   private cxk(cxk.a<T> $$0, cvs $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, csh $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cvs k() {
      return this.z;
   }

   interface a<T extends cwb> {
      T create(int var1, csh var2);
   }
}

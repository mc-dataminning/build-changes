public class cwz<T extends cvq> implements cve {
   public static final cwz<cvz> a = a("generic_9x1", cvz::a);
   public static final cwz<cvz> b = a("generic_9x2", cvz::b);
   public static final cwz<cvz> c = a("generic_9x3", cvz::c);
   public static final cwz<cvz> d = a("generic_9x4", cvz::d);
   public static final cwz<cvz> e = a("generic_9x5", cvz::e);
   public static final cwz<cvz> f = a("generic_9x6", cvz::f);
   public static final cwz<cwl> g = a("generic_3x3", cwl::new);
   public static final cwz<cwg> h = a("crafter_3x3", cwg::new);
   public static final cwz<cvt> i = a("anvil", cvt::new);
   public static final cwz<cvv> j = a("beacon", cvv::new);
   public static final cwz<cvw> k = a("blast_furnace", cvw::new);
   public static final cwz<cvx> l = a("brewing_stand", cvx::new);
   public static final cwz<cwj> m = a("crafting", cwj::new);
   public static final cwz<cwm> n = a("enchantment", cwm::new);
   public static final cwz<cwo> o = a("furnace", cwo::new);
   public static final cwz<cwq> p = a("grindstone", cwq::new);
   public static final cwz<cwr> q = a("hopper", cwr::new);
   public static final cwz<cww> r = a("lectern", ($$0, $$1) -> new cww($$0));
   public static final cwz<cwx> s = a("loom", cwx::new);
   public static final cwz<cxb> t = a("merchant", cxb::new);
   public static final cwz<cxk> u = a("shulker_box", cxk::new);
   public static final cwz<cxq> v = a("smithing", cxq::new);
   public static final cwz<cxr> w = a("smoker", cxr::new);
   public static final cwz<cvy> x = a("cartography_table", cvy::new);
   public static final cwz<cxt> y = a("stonecutter", cxt::new);
   private final cvh z;
   private final cwz.a<T> A;

   private static <T extends cvq> cwz<T> a(String $$0, cwz.a<T> $$1) {
      return js.a(mg.p, $$0, new cwz<>($$1, cvj.g));
   }

   private static <T extends cvq> cwz<T> a(String $$0, cwz.a<T> $$1, cvf... $$2) {
      return js.a(mg.p, $$0, new cwz<>($$1, cvj.e.a($$2)));
   }

   private cwz(cwz.a<T> $$0, cvh $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, crw $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cvh k() {
      return this.z;
   }

   interface a<T extends cvq> {
      T create(int var1, crw var2);
   }
}

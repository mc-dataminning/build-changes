public class cwl<T extends cvc> implements cuq {
   public static final cwl<cvl> a = a("generic_9x1", cvl::a);
   public static final cwl<cvl> b = a("generic_9x2", cvl::b);
   public static final cwl<cvl> c = a("generic_9x3", cvl::c);
   public static final cwl<cvl> d = a("generic_9x4", cvl::d);
   public static final cwl<cvl> e = a("generic_9x5", cvl::e);
   public static final cwl<cvl> f = a("generic_9x6", cvl::f);
   public static final cwl<cvx> g = a("generic_3x3", cvx::new);
   public static final cwl<cvs> h = a("crafter_3x3", cvs::new);
   public static final cwl<cvf> i = a("anvil", cvf::new);
   public static final cwl<cvh> j = a("beacon", cvh::new);
   public static final cwl<cvi> k = a("blast_furnace", cvi::new);
   public static final cwl<cvj> l = a("brewing_stand", cvj::new);
   public static final cwl<cvv> m = a("crafting", cvv::new);
   public static final cwl<cvy> n = a("enchantment", cvy::new);
   public static final cwl<cwa> o = a("furnace", cwa::new);
   public static final cwl<cwc> p = a("grindstone", cwc::new);
   public static final cwl<cwd> q = a("hopper", cwd::new);
   public static final cwl<cwi> r = a("lectern", ($$0, $$1) -> new cwi($$0));
   public static final cwl<cwj> s = a("loom", cwj::new);
   public static final cwl<cwn> t = a("merchant", cwn::new);
   public static final cwl<cww> u = a("shulker_box", cww::new);
   public static final cwl<cxc> v = a("smithing", cxc::new);
   public static final cwl<cxd> w = a("smoker", cxd::new);
   public static final cwl<cvk> x = a("cartography_table", cvk::new);
   public static final cwl<cxf> y = a("stonecutter", cxf::new);
   private final cut z;
   private final cwl.a<T> A;

   private static <T extends cvc> cwl<T> a(String $$0, cwl.a<T> $$1) {
      return js.a(mg.p, $$0, new cwl<>($$1, cuv.g));
   }

   private static <T extends cvc> cwl<T> a(String $$0, cwl.a<T> $$1, cur... $$2) {
      return js.a(mg.p, $$0, new cwl<>($$1, cuv.e.a($$2)));
   }

   private cwl(cwl.a<T> $$0, cut $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cri $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cut k() {
      return this.z;
   }

   interface a<T extends cvc> {
      T create(int var1, cri var2);
   }
}

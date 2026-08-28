public class cwo<T extends cvf> implements cut {
   public static final cwo<cvo> a = a("generic_9x1", cvo::a);
   public static final cwo<cvo> b = a("generic_9x2", cvo::b);
   public static final cwo<cvo> c = a("generic_9x3", cvo::c);
   public static final cwo<cvo> d = a("generic_9x4", cvo::d);
   public static final cwo<cvo> e = a("generic_9x5", cvo::e);
   public static final cwo<cvo> f = a("generic_9x6", cvo::f);
   public static final cwo<cwa> g = a("generic_3x3", cwa::new);
   public static final cwo<cvv> h = a("crafter_3x3", cvv::new);
   public static final cwo<cvi> i = a("anvil", cvi::new);
   public static final cwo<cvk> j = a("beacon", cvk::new);
   public static final cwo<cvl> k = a("blast_furnace", cvl::new);
   public static final cwo<cvm> l = a("brewing_stand", cvm::new);
   public static final cwo<cvy> m = a("crafting", cvy::new);
   public static final cwo<cwb> n = a("enchantment", cwb::new);
   public static final cwo<cwd> o = a("furnace", cwd::new);
   public static final cwo<cwf> p = a("grindstone", cwf::new);
   public static final cwo<cwg> q = a("hopper", cwg::new);
   public static final cwo<cwl> r = a("lectern", ($$0, $$1) -> new cwl($$0));
   public static final cwo<cwm> s = a("loom", cwm::new);
   public static final cwo<cwq> t = a("merchant", cwq::new);
   public static final cwo<cwz> u = a("shulker_box", cwz::new);
   public static final cwo<cxf> v = a("smithing", cxf::new);
   public static final cwo<cxg> w = a("smoker", cxg::new);
   public static final cwo<cvn> x = a("cartography_table", cvn::new);
   public static final cwo<cxi> y = a("stonecutter", cxi::new);
   private final cuw z;
   private final cwo.a<T> A;

   private static <T extends cvf> cwo<T> a(String $$0, cwo.a<T> $$1) {
      return js.a(mg.p, $$0, new cwo<>($$1, cuy.g));
   }

   private static <T extends cvf> cwo<T> a(String $$0, cwo.a<T> $$1, cuu... $$2) {
      return js.a(mg.p, $$0, new cwo<>($$1, cuy.e.a($$2)));
   }

   private cwo(cwo.a<T> $$0, cuw $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, crl $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cuw k() {
      return this.z;
   }

   interface a<T extends cvf> {
      T create(int var1, crl var2);
   }
}

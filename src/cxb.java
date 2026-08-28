public class cxb<T extends cvs> implements cvg {
   public static final cxb<cwb> a = a("generic_9x1", cwb::a);
   public static final cxb<cwb> b = a("generic_9x2", cwb::b);
   public static final cxb<cwb> c = a("generic_9x3", cwb::c);
   public static final cxb<cwb> d = a("generic_9x4", cwb::d);
   public static final cxb<cwb> e = a("generic_9x5", cwb::e);
   public static final cxb<cwb> f = a("generic_9x6", cwb::f);
   public static final cxb<cwn> g = a("generic_3x3", cwn::new);
   public static final cxb<cwi> h = a("crafter_3x3", cwi::new);
   public static final cxb<cvv> i = a("anvil", cvv::new);
   public static final cxb<cvx> j = a("beacon", cvx::new);
   public static final cxb<cvy> k = a("blast_furnace", cvy::new);
   public static final cxb<cvz> l = a("brewing_stand", cvz::new);
   public static final cxb<cwl> m = a("crafting", cwl::new);
   public static final cxb<cwo> n = a("enchantment", cwo::new);
   public static final cxb<cwq> o = a("furnace", cwq::new);
   public static final cxb<cws> p = a("grindstone", cws::new);
   public static final cxb<cwt> q = a("hopper", cwt::new);
   public static final cxb<cwy> r = a("lectern", ($$0, $$1) -> new cwy($$0));
   public static final cxb<cwz> s = a("loom", cwz::new);
   public static final cxb<cxd> t = a("merchant", cxd::new);
   public static final cxb<cxm> u = a("shulker_box", cxm::new);
   public static final cxb<cxs> v = a("smithing", cxs::new);
   public static final cxb<cxt> w = a("smoker", cxt::new);
   public static final cxb<cwa> x = a("cartography_table", cwa::new);
   public static final cxb<cxv> y = a("stonecutter", cxv::new);
   private final cvj z;
   private final cxb.a<T> A;

   private static <T extends cvs> cxb<T> a(String $$0, cxb.a<T> $$1) {
      return jt.a(mh.p, $$0, new cxb<>($$1, cvl.g));
   }

   private static <T extends cvs> cxb<T> a(String $$0, cxb.a<T> $$1, cvh... $$2) {
      return jt.a(mh.p, $$0, new cxb<>($$1, cvl.e.a($$2)));
   }

   private cxb(cxb.a<T> $$0, cvj $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cry $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cvj k() {
      return this.z;
   }

   interface a<T extends cvs> {
      T create(int var1, cry var2);
   }
}

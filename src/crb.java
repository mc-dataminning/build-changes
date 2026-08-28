public class crb<T extends cpu> implements cpi {
   public static final crb<cqb> a = a("generic_9x1", cqb::a);
   public static final crb<cqb> b = a("generic_9x2", cqb::b);
   public static final crb<cqb> c = a("generic_9x3", cqb::c);
   public static final crb<cqb> d = a("generic_9x4", cqb::d);
   public static final crb<cqb> e = a("generic_9x5", cqb::e);
   public static final crb<cqb> f = a("generic_9x6", cqb::f);
   public static final crb<cqn> g = a("generic_3x3", cqn::new);
   public static final crb<cqi> h = a("crafter_3x3", cqi::new);
   public static final crb<cpw> i = a("anvil", cpw::new);
   public static final crb<cpx> j = a("beacon", cpx::new);
   public static final crb<cpy> k = a("blast_furnace", cpy::new);
   public static final crb<cpz> l = a("brewing_stand", cpz::new);
   public static final crb<cql> m = a("crafting", cql::new);
   public static final crb<cqo> n = a("enchantment", cqo::new);
   public static final crb<cqq> o = a("furnace", cqq::new);
   public static final crb<cqs> p = a("grindstone", cqs::new);
   public static final crb<cqt> q = a("hopper", cqt::new);
   public static final crb<cqy> r = a("lectern", ($$0, $$1) -> new cqy($$0));
   public static final crb<cqz> s = a("loom", cqz::new);
   public static final crb<crd> t = a("merchant", crd::new);
   public static final crb<crm> u = a("shulker_box", crm::new);
   public static final crb<crs> v = a("smithing", crs::new);
   public static final crb<crt> w = a("smoker", crt::new);
   public static final crb<cqa> x = a("cartography_table", cqa::new);
   public static final crb<crv> y = a("stonecutter", crv::new);
   private final cpl z;
   private final crb.a<T> A;

   private static <T extends cpu> crb<T> a(String $$0, crb.a<T> $$1) {
      return jv.a(lp.r, $$0, new crb<>($$1, cpn.g));
   }

   private static <T extends cpu> crb<T> a(String $$0, crb.a<T> $$1, cpj... $$2) {
      return jv.a(lp.r, $$0, new crb<>($$1, cpn.e.a($$2)));
   }

   private crb(crb.a<T> $$0, cpl $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cmw $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cpl i() {
      return this.z;
   }

   interface a<T extends cpu> {
      T create(int var1, cmw var2);
   }
}

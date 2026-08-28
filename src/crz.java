public class crz<T extends cqq> implements cqe {
   public static final crz<cqz> a = a("generic_9x1", cqz::a);
   public static final crz<cqz> b = a("generic_9x2", cqz::b);
   public static final crz<cqz> c = a("generic_9x3", cqz::c);
   public static final crz<cqz> d = a("generic_9x4", cqz::d);
   public static final crz<cqz> e = a("generic_9x5", cqz::e);
   public static final crz<cqz> f = a("generic_9x6", cqz::f);
   public static final crz<crl> g = a("generic_3x3", crl::new);
   public static final crz<crg> h = a("crafter_3x3", crg::new);
   public static final crz<cqt> i = a("anvil", cqt::new);
   public static final crz<cqv> j = a("beacon", cqv::new);
   public static final crz<cqw> k = a("blast_furnace", cqw::new);
   public static final crz<cqx> l = a("brewing_stand", cqx::new);
   public static final crz<crj> m = a("crafting", crj::new);
   public static final crz<crm> n = a("enchantment", crm::new);
   public static final crz<cro> o = a("furnace", cro::new);
   public static final crz<crq> p = a("grindstone", crq::new);
   public static final crz<crr> q = a("hopper", crr::new);
   public static final crz<crw> r = a("lectern", ($$0, $$1) -> new crw($$0));
   public static final crz<crx> s = a("loom", crx::new);
   public static final crz<csb> t = a("merchant", csb::new);
   public static final crz<csk> u = a("shulker_box", csk::new);
   public static final crz<csq> v = a("smithing", csq::new);
   public static final crz<csr> w = a("smoker", csr::new);
   public static final crz<cqy> x = a("cartography_table", cqy::new);
   public static final crz<cst> y = a("stonecutter", cst::new);
   private final cqh z;
   private final crz.a<T> A;

   private static <T extends cqq> crz<T> a(String $$0, crz.a<T> $$1) {
      return ka.a(lu.p, $$0, new crz<>($$1, cqj.h));
   }

   private static <T extends cqq> crz<T> a(String $$0, crz.a<T> $$1, cqf... $$2) {
      return ka.a(lu.p, $$0, new crz<>($$1, cqj.f.a($$2)));
   }

   private crz(crz.a<T> $$0, cqh $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cno $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cqh i() {
      return this.z;
   }

   interface a<T extends cqq> {
      T create(int var1, cno var2);
   }
}

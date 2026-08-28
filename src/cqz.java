public class cqz<T extends cps> implements cpg {
   public static final cqz<cpz> a = a("generic_9x1", cpz::a);
   public static final cqz<cpz> b = a("generic_9x2", cpz::b);
   public static final cqz<cpz> c = a("generic_9x3", cpz::c);
   public static final cqz<cpz> d = a("generic_9x4", cpz::d);
   public static final cqz<cpz> e = a("generic_9x5", cpz::e);
   public static final cqz<cpz> f = a("generic_9x6", cpz::f);
   public static final cqz<cql> g = a("generic_3x3", cql::new);
   public static final cqz<cqg> h = a("crafter_3x3", cqg::new);
   public static final cqz<cpu> i = a("anvil", cpu::new);
   public static final cqz<cpv> j = a("beacon", cpv::new);
   public static final cqz<cpw> k = a("blast_furnace", cpw::new);
   public static final cqz<cpx> l = a("brewing_stand", cpx::new);
   public static final cqz<cqj> m = a("crafting", cqj::new);
   public static final cqz<cqm> n = a("enchantment", cqm::new);
   public static final cqz<cqo> o = a("furnace", cqo::new);
   public static final cqz<cqq> p = a("grindstone", cqq::new);
   public static final cqz<cqr> q = a("hopper", cqr::new);
   public static final cqz<cqw> r = a("lectern", ($$0, $$1) -> new cqw($$0));
   public static final cqz<cqx> s = a("loom", cqx::new);
   public static final cqz<crb> t = a("merchant", crb::new);
   public static final cqz<crk> u = a("shulker_box", crk::new);
   public static final cqz<crq> v = a("smithing", crq::new);
   public static final cqz<crr> w = a("smoker", crr::new);
   public static final cqz<cpy> x = a("cartography_table", cpy::new);
   public static final cqz<crt> y = a("stonecutter", crt::new);
   private final cpj z;
   private final cqz.a<T> A;

   private static <T extends cps> cqz<T> a(String $$0, cqz.a<T> $$1) {
      return jv.a(lp.r, $$0, new cqz<>($$1, cpl.g));
   }

   private static <T extends cps> cqz<T> a(String $$0, cqz.a<T> $$1, cph... $$2) {
      return jv.a(lp.r, $$0, new cqz<>($$1, cpl.e.a($$2)));
   }

   private cqz(cqz.a<T> $$0, cpj $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cmu $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cpj i() {
      return this.z;
   }

   interface a<T extends cps> {
      T create(int var1, cmu var2);
   }
}

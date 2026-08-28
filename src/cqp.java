public class cqp<T extends cph> implements cov {
   public static final cqp<cpp> a = a("generic_9x1", cpp::a);
   public static final cqp<cpp> b = a("generic_9x2", cpp::b);
   public static final cqp<cpp> c = a("generic_9x3", cpp::c);
   public static final cqp<cpp> d = a("generic_9x4", cpp::d);
   public static final cqp<cpp> e = a("generic_9x5", cpp::e);
   public static final cqp<cpp> f = a("generic_9x6", cpp::f);
   public static final cqp<cqb> g = a("generic_3x3", cqb::new);
   public static final cqp<cpw> h = a("crafter_3x3", cpw::new);
   public static final cqp<cpj> i = a("anvil", cpj::new);
   public static final cqp<cpl> j = a("beacon", cpl::new);
   public static final cqp<cpm> k = a("blast_furnace", cpm::new);
   public static final cqp<cpn> l = a("brewing_stand", cpn::new);
   public static final cqp<cpz> m = a("crafting", cpz::new);
   public static final cqp<cqc> n = a("enchantment", cqc::new);
   public static final cqp<cqe> o = a("furnace", cqe::new);
   public static final cqp<cqg> p = a("grindstone", cqg::new);
   public static final cqp<cqh> q = a("hopper", cqh::new);
   public static final cqp<cqm> r = a("lectern", ($$0, $$1) -> new cqm($$0));
   public static final cqp<cqn> s = a("loom", cqn::new);
   public static final cqp<cqr> t = a("merchant", cqr::new);
   public static final cqp<cra> u = a("shulker_box", cra::new);
   public static final cqp<crg> v = a("smithing", crg::new);
   public static final cqp<crh> w = a("smoker", crh::new);
   public static final cqp<cpo> x = a("cartography_table", cpo::new);
   public static final cqp<crj> y = a("stonecutter", crj::new);
   private final coy z;
   private final cqp.a<T> A;

   private static <T extends cph> cqp<T> a(String $$0, cqp.a<T> $$1) {
      return jw.a(lq.p, $$0, new cqp<>($$1, cpa.f));
   }

   private static <T extends cph> cqp<T> a(String $$0, cqp.a<T> $$1, cow... $$2) {
      return jw.a(lq.p, $$0, new cqp<>($$1, cpa.d.a($$2)));
   }

   private cqp(cqp.a<T> $$0, coy $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cmj $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public coy i() {
      return this.z;
   }

   interface a<T extends cph> {
      T create(int var1, cmj var2);
   }
}

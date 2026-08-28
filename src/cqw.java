public class cqw<T extends cpp> implements cpd {
   public static final cqw<cpw> a = a("generic_9x1", cpw::a);
   public static final cqw<cpw> b = a("generic_9x2", cpw::b);
   public static final cqw<cpw> c = a("generic_9x3", cpw::c);
   public static final cqw<cpw> d = a("generic_9x4", cpw::d);
   public static final cqw<cpw> e = a("generic_9x5", cpw::e);
   public static final cqw<cpw> f = a("generic_9x6", cpw::f);
   public static final cqw<cqi> g = a("generic_3x3", cqi::new);
   public static final cqw<cqd> h = a("crafter_3x3", cqd::new);
   public static final cqw<cpr> i = a("anvil", cpr::new);
   public static final cqw<cps> j = a("beacon", cps::new);
   public static final cqw<cpt> k = a("blast_furnace", cpt::new);
   public static final cqw<cpu> l = a("brewing_stand", cpu::new);
   public static final cqw<cqg> m = a("crafting", cqg::new);
   public static final cqw<cqj> n = a("enchantment", cqj::new);
   public static final cqw<cql> o = a("furnace", cql::new);
   public static final cqw<cqn> p = a("grindstone", cqn::new);
   public static final cqw<cqo> q = a("hopper", cqo::new);
   public static final cqw<cqt> r = a("lectern", ($$0, $$1) -> new cqt($$0));
   public static final cqw<cqu> s = a("loom", cqu::new);
   public static final cqw<cqy> t = a("merchant", cqy::new);
   public static final cqw<crh> u = a("shulker_box", crh::new);
   public static final cqw<crn> v = a("smithing", crn::new);
   public static final cqw<cro> w = a("smoker", cro::new);
   public static final cqw<cpv> x = a("cartography_table", cpv::new);
   public static final cqw<crq> y = a("stonecutter", crq::new);
   private final cpg z;
   private final cqw.a<T> A;

   private static <T extends cpp> cqw<T> a(String $$0, cqw.a<T> $$1) {
      return jv.a(lp.r, $$0, new cqw<>($$1, cpi.g));
   }

   private static <T extends cpp> cqw<T> a(String $$0, cqw.a<T> $$1, cpe... $$2) {
      return jv.a(lp.r, $$0, new cqw<>($$1, cpi.e.a($$2)));
   }

   private cqw(cqw.a<T> $$0, cpg $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cmr $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cpg i() {
      return this.z;
   }

   interface a<T extends cpp> {
      T create(int var1, cmr var2);
   }
}

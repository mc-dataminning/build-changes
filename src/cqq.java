public class cqq<T extends cpi> implements cow {
   public static final cqq<cpq> a = a("generic_9x1", cpq::a);
   public static final cqq<cpq> b = a("generic_9x2", cpq::b);
   public static final cqq<cpq> c = a("generic_9x3", cpq::c);
   public static final cqq<cpq> d = a("generic_9x4", cpq::d);
   public static final cqq<cpq> e = a("generic_9x5", cpq::e);
   public static final cqq<cpq> f = a("generic_9x6", cpq::f);
   public static final cqq<cqc> g = a("generic_3x3", cqc::new);
   public static final cqq<cpx> h = a("crafter_3x3", cpx::new);
   public static final cqq<cpk> i = a("anvil", cpk::new);
   public static final cqq<cpm> j = a("beacon", cpm::new);
   public static final cqq<cpn> k = a("blast_furnace", cpn::new);
   public static final cqq<cpo> l = a("brewing_stand", cpo::new);
   public static final cqq<cqa> m = a("crafting", cqa::new);
   public static final cqq<cqd> n = a("enchantment", cqd::new);
   public static final cqq<cqf> o = a("furnace", cqf::new);
   public static final cqq<cqh> p = a("grindstone", cqh::new);
   public static final cqq<cqi> q = a("hopper", cqi::new);
   public static final cqq<cqn> r = a("lectern", ($$0, $$1) -> new cqn($$0));
   public static final cqq<cqo> s = a("loom", cqo::new);
   public static final cqq<cqs> t = a("merchant", cqs::new);
   public static final cqq<crb> u = a("shulker_box", crb::new);
   public static final cqq<crh> v = a("smithing", crh::new);
   public static final cqq<cri> w = a("smoker", cri::new);
   public static final cqq<cpp> x = a("cartography_table", cpp::new);
   public static final cqq<crk> y = a("stonecutter", crk::new);
   private final coz z;
   private final cqq.a<T> A;

   private static <T extends cpi> cqq<T> a(String $$0, cqq.a<T> $$1) {
      return jw.a(lq.p, $$0, new cqq<>($$1, cpb.f));
   }

   private static <T extends cpi> cqq<T> a(String $$0, cqq.a<T> $$1, cox... $$2) {
      return jw.a(lq.p, $$0, new cqq<>($$1, cpb.d.a($$2)));
   }

   private cqq(cqq.a<T> $$0, coz $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cmk $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public coz i() {
      return this.z;
   }

   interface a<T extends cpi> {
      T create(int var1, cmk var2);
   }
}

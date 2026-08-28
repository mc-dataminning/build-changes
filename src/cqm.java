public class cqm<T extends cpe> implements cos {
   public static final cqm<cpm> a = a("generic_9x1", cpm::a);
   public static final cqm<cpm> b = a("generic_9x2", cpm::b);
   public static final cqm<cpm> c = a("generic_9x3", cpm::c);
   public static final cqm<cpm> d = a("generic_9x4", cpm::d);
   public static final cqm<cpm> e = a("generic_9x5", cpm::e);
   public static final cqm<cpm> f = a("generic_9x6", cpm::f);
   public static final cqm<cpy> g = a("generic_3x3", cpy::new);
   public static final cqm<cpt> h = a("crafter_3x3", cpt::new);
   public static final cqm<cpg> i = a("anvil", cpg::new);
   public static final cqm<cpi> j = a("beacon", cpi::new);
   public static final cqm<cpj> k = a("blast_furnace", cpj::new);
   public static final cqm<cpk> l = a("brewing_stand", cpk::new);
   public static final cqm<cpw> m = a("crafting", cpw::new);
   public static final cqm<cpz> n = a("enchantment", cpz::new);
   public static final cqm<cqb> o = a("furnace", cqb::new);
   public static final cqm<cqd> p = a("grindstone", cqd::new);
   public static final cqm<cqe> q = a("hopper", cqe::new);
   public static final cqm<cqj> r = a("lectern", ($$0, $$1) -> new cqj($$0));
   public static final cqm<cqk> s = a("loom", cqk::new);
   public static final cqm<cqo> t = a("merchant", cqo::new);
   public static final cqm<cqx> u = a("shulker_box", cqx::new);
   public static final cqm<crd> v = a("smithing", crd::new);
   public static final cqm<cre> w = a("smoker", cre::new);
   public static final cqm<cpl> x = a("cartography_table", cpl::new);
   public static final cqm<crg> y = a("stonecutter", crg::new);
   private final cov z;
   private final cqm.a<T> A;

   private static <T extends cpe> cqm<T> a(String $$0, cqm.a<T> $$1) {
      return jw.a(lq.p, $$0, new cqm<>($$1, cox.f));
   }

   private static <T extends cpe> cqm<T> a(String $$0, cqm.a<T> $$1, cot... $$2) {
      return jw.a(lq.p, $$0, new cqm<>($$1, cox.d.a($$2)));
   }

   private cqm(cqm.a<T> $$0, cov $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cmg $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cov i() {
      return this.z;
   }

   interface a<T extends cpe> {
      T create(int var1, cmg var2);
   }
}

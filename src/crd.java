public class crd<T extends cpw> implements cpk {
   public static final crd<cqd> a = a("generic_9x1", cqd::a);
   public static final crd<cqd> b = a("generic_9x2", cqd::b);
   public static final crd<cqd> c = a("generic_9x3", cqd::c);
   public static final crd<cqd> d = a("generic_9x4", cqd::d);
   public static final crd<cqd> e = a("generic_9x5", cqd::e);
   public static final crd<cqd> f = a("generic_9x6", cqd::f);
   public static final crd<cqp> g = a("generic_3x3", cqp::new);
   public static final crd<cqk> h = a("crafter_3x3", cqk::new);
   public static final crd<cpy> i = a("anvil", cpy::new);
   public static final crd<cpz> j = a("beacon", cpz::new);
   public static final crd<cqa> k = a("blast_furnace", cqa::new);
   public static final crd<cqb> l = a("brewing_stand", cqb::new);
   public static final crd<cqn> m = a("crafting", cqn::new);
   public static final crd<cqq> n = a("enchantment", cqq::new);
   public static final crd<cqs> o = a("furnace", cqs::new);
   public static final crd<cqu> p = a("grindstone", cqu::new);
   public static final crd<cqv> q = a("hopper", cqv::new);
   public static final crd<cra> r = a("lectern", ($$0, $$1) -> new cra($$0));
   public static final crd<crb> s = a("loom", crb::new);
   public static final crd<crf> t = a("merchant", crf::new);
   public static final crd<cro> u = a("shulker_box", cro::new);
   public static final crd<cru> v = a("smithing", cru::new);
   public static final crd<crv> w = a("smoker", crv::new);
   public static final crd<cqc> x = a("cartography_table", cqc::new);
   public static final crd<crx> y = a("stonecutter", crx::new);
   private final cpn z;
   private final crd.a<T> A;

   private static <T extends cpw> crd<T> a(String $$0, crd.a<T> $$1) {
      return jv.a(lp.r, $$0, new crd<>($$1, cpp.g));
   }

   private static <T extends cpw> crd<T> a(String $$0, crd.a<T> $$1, cpl... $$2) {
      return jv.a(lp.r, $$0, new crd<>($$1, cpp.e.a($$2)));
   }

   private crd(crd.a<T> $$0, cpn $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cmy $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cpn i() {
      return this.z;
   }

   interface a<T extends cpw> {
      T create(int var1, cmy var2);
   }
}

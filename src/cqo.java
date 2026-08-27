public class cqo<T extends cpg> implements col {
   public static final cqo<cpn> a = a("generic_9x1", cpn::a);
   public static final cqo<cpn> b = a("generic_9x2", cpn::b);
   public static final cqo<cpn> c = a("generic_9x3", cpn::c);
   public static final cqo<cpn> d = a("generic_9x4", cpn::d);
   public static final cqo<cpn> e = a("generic_9x5", cpn::e);
   public static final cqo<cpn> f = a("generic_9x6", cpn::f);
   public static final cqo<cpz> g = a("generic_3x3", cpz::new);
   public static final cqo<cpu> h = a("crafter_3x3", cpu::new);
   public static final cqo<cpi> i = a("anvil", cpi::new);
   public static final cqo<cpj> j = a("beacon", cpj::new);
   public static final cqo<cpk> k = a("blast_furnace", cpk::new);
   public static final cqo<cpl> l = a("brewing_stand", cpl::new);
   public static final cqo<cpx> m = a("crafting", cpx::new);
   public static final cqo<cqa> n = a("enchantment", cqa::new);
   public static final cqo<cqd> o = a("furnace", cqd::new);
   public static final cqo<cqb> p = a("fletching", cqb::new);
   public static final cqo<cqf> q = a("grindstone", cqf::new);
   public static final cqo<cqg> r = a("hopper", cqg::new);
   public static final cqo<cql> s = a("lectern", ($$0, $$1) -> new cql($$0));
   public static final cqo<cqm> t = a("loom", cqm::new);
   public static final cqo<cqq> u = a("merchant", cqq::new);
   public static final cqo<crb> v = a("shulker_box", crb::new);
   public static final cqo<crh> w = a("smithing", crh::new);
   public static final cqo<cri> x = a("smoker", cri::new);
   public static final cqo<cpm> y = a("cartography_table", cpm::new);
   public static final cqo<crk> z = a("stonecutter", crk::new);
   public static final cqo<cqu> A = a("poisonous_potato_cutter", cqu::new);
   public static final cqo<cqv> B = a("potato_refinery", cqv::new);
   private final cop C;
   private final cqo.a<T> D;

   private static <T extends cpg> cqo<T> a(String $$0, cqo.a<T> $$1) {
      return jn.a(lh.r, $$0, new cqo<>($$1, cor.g));
   }

   private static <T extends cpg> cqo<T> a(String $$0, cqo.a<T> $$1, com... $$2) {
      return jn.a(lh.r, $$0, new cqo<>($$1, cor.e.a($$2)));
   }

   private cqo(cqo.a<T> $$0, cop $$1) {
      this.D = $$0;
      this.C = $$1;
   }

   public T a(int $$0, clx $$1) {
      return this.D.create($$0, $$1);
   }

   @Override
   public cop m() {
      return this.C;
   }

   interface a<T extends cpg> {
      T create(int var1, clx var2);
   }
}

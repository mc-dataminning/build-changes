public class cqc<T extends cov> implements coi {
   public static final cqc<cpc> a = a("generic_9x1", cpc::a);
   public static final cqc<cpc> b = a("generic_9x2", cpc::b);
   public static final cqc<cpc> c = a("generic_9x3", cpc::c);
   public static final cqc<cpc> d = a("generic_9x4", cpc::d);
   public static final cqc<cpc> e = a("generic_9x5", cpc::e);
   public static final cqc<cpc> f = a("generic_9x6", cpc::f);
   public static final cqc<cpo> g = a("generic_3x3", cpo::new);
   public static final cqc<cpj> h = a("crafter_3x3", cpj::new);
   public static final cqc<cox> i = a("anvil", cox::new);
   public static final cqc<coy> j = a("beacon", coy::new);
   public static final cqc<coz> k = a("blast_furnace", coz::new);
   public static final cqc<cpa> l = a("brewing_stand", cpa::new);
   public static final cqc<cpm> m = a("crafting", cpm::new);
   public static final cqc<cpp> n = a("enchantment", cpp::new);
   public static final cqc<cpr> o = a("furnace", cpr::new);
   public static final cqc<cpt> p = a("grindstone", cpt::new);
   public static final cqc<cpu> q = a("hopper", cpu::new);
   public static final cqc<cpz> r = a("lectern", ($$0, $$1) -> new cpz($$0));
   public static final cqc<cqa> s = a("loom", cqa::new);
   public static final cqc<cqe> t = a("merchant", cqe::new);
   public static final cqc<cqn> u = a("shulker_box", cqn::new);
   public static final cqc<cqt> v = a("smithing", cqt::new);
   public static final cqc<cqu> w = a("smoker", cqu::new);
   public static final cqc<cpb> x = a("cartography_table", cpb::new);
   public static final cqc<cqw> y = a("stonecutter", cqw::new);
   private final col z;
   private final cqc.a<T> A;

   private static <T extends cov> cqc<T> a(String $$0, cqc.a<T> $$1) {
      return jk.a(le.r, $$0, new cqc<>($$1, coo.g));
   }

   private static <T extends cov> cqc<T> a(String $$0, cqc.a<T> $$1, coj... $$2) {
      return jk.a(le.r, $$0, new cqc<>($$1, coo.e.a($$2)));
   }

   private cqc(cqc.a<T> $$0, col $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, clx $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public col i() {
      return this.z;
   }

   interface a<T extends cov> {
      T create(int var1, clx var2);
   }
}

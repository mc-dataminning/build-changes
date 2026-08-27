public class cqa<T extends cot> implements cog {
   public static final cqa<cpa> a = a("generic_9x1", cpa::a);
   public static final cqa<cpa> b = a("generic_9x2", cpa::b);
   public static final cqa<cpa> c = a("generic_9x3", cpa::c);
   public static final cqa<cpa> d = a("generic_9x4", cpa::d);
   public static final cqa<cpa> e = a("generic_9x5", cpa::e);
   public static final cqa<cpa> f = a("generic_9x6", cpa::f);
   public static final cqa<cpm> g = a("generic_3x3", cpm::new);
   public static final cqa<cph> h = a("crafter_3x3", cph::new);
   public static final cqa<cov> i = a("anvil", cov::new);
   public static final cqa<cow> j = a("beacon", cow::new);
   public static final cqa<cox> k = a("blast_furnace", cox::new);
   public static final cqa<coy> l = a("brewing_stand", coy::new);
   public static final cqa<cpk> m = a("crafting", cpk::new);
   public static final cqa<cpn> n = a("enchantment", cpn::new);
   public static final cqa<cpp> o = a("furnace", cpp::new);
   public static final cqa<cpr> p = a("grindstone", cpr::new);
   public static final cqa<cps> q = a("hopper", cps::new);
   public static final cqa<cpx> r = a("lectern", ($$0, $$1) -> new cpx($$0));
   public static final cqa<cpy> s = a("loom", cpy::new);
   public static final cqa<cqc> t = a("merchant", cqc::new);
   public static final cqa<cql> u = a("shulker_box", cql::new);
   public static final cqa<cqr> v = a("smithing", cqr::new);
   public static final cqa<cqs> w = a("smoker", cqs::new);
   public static final cqa<coz> x = a("cartography_table", coz::new);
   public static final cqa<cqu> y = a("stonecutter", cqu::new);
   private final coj z;
   private final cqa.a<T> A;

   private static <T extends cot> cqa<T> a(String $$0, cqa.a<T> $$1) {
      return jk.a(le.r, $$0, new cqa<>($$1, col.g));
   }

   private static <T extends cot> cqa<T> a(String $$0, cqa.a<T> $$1, coh... $$2) {
      return jk.a(le.r, $$0, new cqa<>($$1, col.e.a($$2)));
   }

   private cqa(cqa.a<T> $$0, coj $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, clv $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public coj i() {
      return this.z;
   }

   interface a<T extends cot> {
      T create(int var1, clv var2);
   }
}

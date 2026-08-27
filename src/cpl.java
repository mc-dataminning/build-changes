public class cpl<T extends cod> implements cnr {
   public static final cpl<cok> a = a("generic_9x1", cok::a);
   public static final cpl<cok> b = a("generic_9x2", cok::b);
   public static final cpl<cok> c = a("generic_9x3", cok::c);
   public static final cpl<cok> d = a("generic_9x4", cok::d);
   public static final cpl<cok> e = a("generic_9x5", cok::e);
   public static final cpl<cok> f = a("generic_9x6", cok::f);
   public static final cpl<cox> g = a("generic_3x3", cox::new);
   public static final cpl<cos> h = a("crafter_3x3", cos::new);
   public static final cpl<cof> i = a("anvil", cof::new);
   public static final cpl<cog> j = a("beacon", cog::new);
   public static final cpl<coh> k = a("blast_furnace", coh::new);
   public static final cpl<coi> l = a("brewing_stand", coi::new);
   public static final cpl<cov> m = a("crafting", cov::new);
   public static final cpl<coy> n = a("enchantment", coy::new);
   public static final cpl<cpa> o = a("furnace", cpa::new);
   public static final cpl<cpc> p = a("grindstone", cpc::new);
   public static final cpl<cpd> q = a("hopper", cpd::new);
   public static final cpl<cpi> r = a("lectern", ($$0, $$1) -> new cpi($$0));
   public static final cpl<cpj> s = a("loom", cpj::new);
   public static final cpl<cpn> t = a("merchant", cpn::new);
   public static final cpl<cpw> u = a("shulker_box", cpw::new);
   public static final cpl<cqc> v = a("smithing", cqc::new);
   public static final cpl<cqd> w = a("smoker", cqd::new);
   public static final cpl<coj> x = a("cartography_table", coj::new);
   public static final cpl<cqf> y = a("stonecutter", cqf::new);
   private final cnu z;
   private final cpl.a<T> A;

   private static <T extends cod> cpl<T> a(String $$0, cpl.a<T> $$1) {
      return jj.a(ld.r, $$0, new cpl<>($$1, cnw.g));
   }

   private static <T extends cod> cpl<T> a(String $$0, cpl.a<T> $$1, cns... $$2) {
      return jj.a(ld.r, $$0, new cpl<>($$1, cnw.e.a($$2)));
   }

   private cpl(cpl.a<T> $$0, cnu $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, clg $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cnu m() {
      return this.z;
   }

   interface a<T extends cod> {
      T create(int var1, clg var2);
   }
}

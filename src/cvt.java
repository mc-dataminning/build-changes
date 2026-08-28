public class cvt<T extends cuk> implements cty {
   public static final cvt<cut> a = a("generic_9x1", cut::a);
   public static final cvt<cut> b = a("generic_9x2", cut::b);
   public static final cvt<cut> c = a("generic_9x3", cut::c);
   public static final cvt<cut> d = a("generic_9x4", cut::d);
   public static final cvt<cut> e = a("generic_9x5", cut::e);
   public static final cvt<cut> f = a("generic_9x6", cut::f);
   public static final cvt<cvf> g = a("generic_3x3", cvf::new);
   public static final cvt<cva> h = a("crafter_3x3", cva::new);
   public static final cvt<cun> i = a("anvil", cun::new);
   public static final cvt<cup> j = a("beacon", cup::new);
   public static final cvt<cuq> k = a("blast_furnace", cuq::new);
   public static final cvt<cur> l = a("brewing_stand", cur::new);
   public static final cvt<cvd> m = a("crafting", cvd::new);
   public static final cvt<cvg> n = a("enchantment", cvg::new);
   public static final cvt<cvi> o = a("furnace", cvi::new);
   public static final cvt<cvk> p = a("grindstone", cvk::new);
   public static final cvt<cvl> q = a("hopper", cvl::new);
   public static final cvt<cvq> r = a("lectern", ($$0, $$1) -> new cvq($$0));
   public static final cvt<cvr> s = a("loom", cvr::new);
   public static final cvt<cvv> t = a("merchant", cvv::new);
   public static final cvt<cwe> u = a("shulker_box", cwe::new);
   public static final cvt<cwk> v = a("smithing", cwk::new);
   public static final cvt<cwl> w = a("smoker", cwl::new);
   public static final cvt<cus> x = a("cartography_table", cus::new);
   public static final cvt<cwn> y = a("stonecutter", cwn::new);
   private final cub z;
   private final cvt.a<T> A;

   private static <T extends cuk> cvt<T> a(String $$0, cvt.a<T> $$1) {
      return jr.a(mf.p, $$0, new cvt<>($$1, cud.g));
   }

   private static <T extends cuk> cvt<T> a(String $$0, cvt.a<T> $$1, ctz... $$2) {
      return jr.a(mf.p, $$0, new cvt<>($$1, cud.e.a($$2)));
   }

   private cvt(cvt.a<T> $$0, cub $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cqr $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cub k() {
      return this.z;
   }

   interface a<T extends cuk> {
      T create(int var1, cqr var2);
   }
}

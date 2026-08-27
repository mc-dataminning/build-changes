public class cop<T extends cnh> implements cmv {
   public static final cop<cno> a = a("generic_9x1", cno::a);
   public static final cop<cno> b = a("generic_9x2", cno::b);
   public static final cop<cno> c = a("generic_9x3", cno::c);
   public static final cop<cno> d = a("generic_9x4", cno::d);
   public static final cop<cno> e = a("generic_9x5", cno::e);
   public static final cop<cno> f = a("generic_9x6", cno::f);
   public static final cop<coa> g = a("generic_3x3", coa::new);
   public static final cop<cnv> h = a("crafter_3x3", cnv::new);
   public static final cop<cnj> i = a("anvil", cnj::new);
   public static final cop<cnk> j = a("beacon", cnk::new);
   public static final cop<cnl> k = a("blast_furnace", cnl::new);
   public static final cop<cnm> l = a("brewing_stand", cnm::new);
   public static final cop<cny> m = a("crafting", cny::new);
   public static final cop<cob> n = a("enchantment", cob::new);
   public static final cop<cod> o = a("furnace", cod::new);
   public static final cop<cof> p = a("grindstone", cof::new);
   public static final cop<cog> q = a("hopper", cog::new);
   public static final cop<col> r = a("lectern", ($$0, $$1) -> new col($$0));
   public static final cop<com> s = a("loom", com::new);
   public static final cop<cor> t = a("merchant", cor::new);
   public static final cop<cpa> u = a("shulker_box", cpa::new);
   public static final cop<cpg> v = a("smithing", cpg::new);
   public static final cop<cph> w = a("smoker", cph::new);
   public static final cop<cnn> x = a("cartography_table", cnn::new);
   public static final cop<cpj> y = a("stonecutter", cpj::new);
   private final cmy z;
   private final cop.a<T> A;

   private static <T extends cnh> cop<T> a(String $$0, cop.a<T> $$1) {
      return ji.a(lc.r, $$0, new cop<>($$1, cna.g));
   }

   private static <T extends cnh> cop<T> a(String $$0, cop.a<T> $$1, cmw... $$2) {
      return ji.a(lc.r, $$0, new cop<>($$1, cna.e.a($$2)));
   }

   private cop(cop.a<T> $$0, cmy $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, ckk $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cmy m() {
      return this.z;
   }

   interface a<T extends cnh> {
      T create(int var1, ckk var2);
   }
}

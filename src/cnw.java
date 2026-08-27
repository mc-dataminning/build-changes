public class cnw<T extends cmp> implements cmd {
   public static final cnw<cmw> a = a("generic_9x1", cmw::a);
   public static final cnw<cmw> b = a("generic_9x2", cmw::b);
   public static final cnw<cmw> c = a("generic_9x3", cmw::c);
   public static final cnw<cmw> d = a("generic_9x4", cmw::d);
   public static final cnw<cmw> e = a("generic_9x5", cmw::e);
   public static final cnw<cmw> f = a("generic_9x6", cmw::f);
   public static final cnw<cni> g = a("generic_3x3", cni::new);
   public static final cnw<cnd> h = a("crafter_3x3", cnd::new);
   public static final cnw<cmr> i = a("anvil", cmr::new);
   public static final cnw<cms> j = a("beacon", cms::new);
   public static final cnw<cmt> k = a("blast_furnace", cmt::new);
   public static final cnw<cmu> l = a("brewing_stand", cmu::new);
   public static final cnw<cng> m = a("crafting", cng::new);
   public static final cnw<cnj> n = a("enchantment", cnj::new);
   public static final cnw<cnl> o = a("furnace", cnl::new);
   public static final cnw<cnn> p = a("grindstone", cnn::new);
   public static final cnw<cno> q = a("hopper", cno::new);
   public static final cnw<cnt> r = a("lectern", ($$0, $$1) -> new cnt($$0));
   public static final cnw<cnu> s = a("loom", cnu::new);
   public static final cnw<cny> t = a("merchant", cny::new);
   public static final cnw<coh> u = a("shulker_box", coh::new);
   public static final cnw<col> v = a("smithing", col::new);
   public static final cnw<com> w = a("smoker", com::new);
   public static final cnw<cmv> x = a("cartography_table", cmv::new);
   public static final cnw<cop> y = a("stonecutter", cop::new);
   private final cmg z;
   private final cnw.a<T> A;

   private static <T extends cmp> cnw<T> a(String $$0, cnw.a<T> $$1) {
      return iy.a(kr.r, $$0, new cnw<>($$1, cmi.g));
   }

   private static <T extends cmp> cnw<T> a(String $$0, cnw.a<T> $$1, cme... $$2) {
      return iy.a(kr.r, $$0, new cnw<>($$1, cmi.e.a($$2)));
   }

   private cnw(cnw.a<T> $$0, cmg $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cjs $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cmg m() {
      return this.z;
   }

   interface a<T extends cmp> {
      T create(int var1, cjs var2);
   }
}

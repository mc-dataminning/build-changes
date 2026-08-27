public class cmx<T extends clq> implements cle {
   public static final cmx<clx> a = a("generic_9x1", clx::a);
   public static final cmx<clx> b = a("generic_9x2", clx::b);
   public static final cmx<clx> c = a("generic_9x3", clx::c);
   public static final cmx<clx> d = a("generic_9x4", clx::d);
   public static final cmx<clx> e = a("generic_9x5", clx::e);
   public static final cmx<clx> f = a("generic_9x6", clx::f);
   public static final cmx<cmj> g = a("generic_3x3", cmj::new);
   public static final cmx<cme> h = a("crafter_3x3", cme::new);
   public static final cmx<cls> i = a("anvil", cls::new);
   public static final cmx<clt> j = a("beacon", clt::new);
   public static final cmx<clu> k = a("blast_furnace", clu::new);
   public static final cmx<clv> l = a("brewing_stand", clv::new);
   public static final cmx<cmh> m = a("crafting", cmh::new);
   public static final cmx<cmk> n = a("enchantment", cmk::new);
   public static final cmx<cmm> o = a("furnace", cmm::new);
   public static final cmx<cmo> p = a("grindstone", cmo::new);
   public static final cmx<cmp> q = a("hopper", cmp::new);
   public static final cmx<cmu> r = a("lectern", ($$0, $$1) -> new cmu($$0));
   public static final cmx<cmv> s = a("loom", cmv::new);
   public static final cmx<cmz> t = a("merchant", cmz::new);
   public static final cmx<cni> u = a("shulker_box", cni::new);
   public static final cmx<cnm> v = a("smithing", cnm::new);
   public static final cmx<cnn> w = a("smoker", cnn::new);
   public static final cmx<clw> x = a("cartography_table", clw::new);
   public static final cmx<cnp> y = a("stonecutter", cnp::new);
   private final clh z;
   private final cmx.a<T> A;

   private static <T extends clq> cmx<T> a(String $$0, cmx.a<T> $$1) {
      return iy.a(ki.r, $$0, new cmx<>($$1, clj.g));
   }

   private static <T extends clq> cmx<T> a(String $$0, cmx.a<T> $$1, clf... $$2) {
      return iy.a(ki.r, $$0, new cmx<>($$1, clj.e.a($$2)));
   }

   private cmx(cmx.a<T> $$0, clh $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cit $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public clh m() {
      return this.z;
   }

   interface a<T extends clq> {
      T create(int var1, cit var2);
   }
}

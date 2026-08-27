public class cmv<T extends clo> implements clc {
   public static final cmv<clv> a = a("generic_9x1", clv::a);
   public static final cmv<clv> b = a("generic_9x2", clv::b);
   public static final cmv<clv> c = a("generic_9x3", clv::c);
   public static final cmv<clv> d = a("generic_9x4", clv::d);
   public static final cmv<clv> e = a("generic_9x5", clv::e);
   public static final cmv<clv> f = a("generic_9x6", clv::f);
   public static final cmv<cmh> g = a("generic_3x3", cmh::new);
   public static final cmv<cmc> h = a("crafter_3x3", cmc::new);
   public static final cmv<clq> i = a("anvil", clq::new);
   public static final cmv<clr> j = a("beacon", clr::new);
   public static final cmv<cls> k = a("blast_furnace", cls::new);
   public static final cmv<clt> l = a("brewing_stand", clt::new);
   public static final cmv<cmf> m = a("crafting", cmf::new);
   public static final cmv<cmi> n = a("enchantment", cmi::new);
   public static final cmv<cmk> o = a("furnace", cmk::new);
   public static final cmv<cmm> p = a("grindstone", cmm::new);
   public static final cmv<cmn> q = a("hopper", cmn::new);
   public static final cmv<cms> r = a("lectern", ($$0, $$1) -> new cms($$0));
   public static final cmv<cmt> s = a("loom", cmt::new);
   public static final cmv<cmx> t = a("merchant", cmx::new);
   public static final cmv<cng> u = a("shulker_box", cng::new);
   public static final cmv<cnk> v = a("smithing", cnk::new);
   public static final cmv<cnl> w = a("smoker", cnl::new);
   public static final cmv<clu> x = a("cartography_table", clu::new);
   public static final cmv<cnn> y = a("stonecutter", cnn::new);
   private final clf z;
   private final cmv.a<T> A;

   private static <T extends clo> cmv<T> a(String $$0, cmv.a<T> $$1) {
      return iy.a(ki.r, $$0, new cmv<>($$1, clh.g));
   }

   private static <T extends clo> cmv<T> a(String $$0, cmv.a<T> $$1, cld... $$2) {
      return iy.a(ki.r, $$0, new cmv<>($$1, clh.e.a($$2)));
   }

   private cmv(cmv.a<T> $$0, clf $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cir $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public clf m() {
      return this.z;
   }

   interface a<T extends clo> {
      T create(int var1, cir var2);
   }
}

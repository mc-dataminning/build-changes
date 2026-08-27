public class cmb<T extends cku> implements cki {
   public static final cmb<clb> a = a("generic_9x1", clb::a);
   public static final cmb<clb> b = a("generic_9x2", clb::b);
   public static final cmb<clb> c = a("generic_9x3", clb::c);
   public static final cmb<clb> d = a("generic_9x4", clb::d);
   public static final cmb<clb> e = a("generic_9x5", clb::e);
   public static final cmb<clb> f = a("generic_9x6", clb::f);
   public static final cmb<cln> g = a("generic_3x3", cln::new);
   public static final cmb<cli> h = a("crafter_3x3", cli::new);
   public static final cmb<ckw> i = a("anvil", ckw::new);
   public static final cmb<ckx> j = a("beacon", ckx::new);
   public static final cmb<cky> k = a("blast_furnace", cky::new);
   public static final cmb<ckz> l = a("brewing_stand", ckz::new);
   public static final cmb<cll> m = a("crafting", cll::new);
   public static final cmb<clo> n = a("enchantment", clo::new);
   public static final cmb<clq> o = a("furnace", clq::new);
   public static final cmb<cls> p = a("grindstone", cls::new);
   public static final cmb<clt> q = a("hopper", clt::new);
   public static final cmb<cly> r = a("lectern", ($$0, $$1) -> new cly($$0));
   public static final cmb<clz> s = a("loom", clz::new);
   public static final cmb<cmd> t = a("merchant", cmd::new);
   public static final cmb<cmm> u = a("shulker_box", cmm::new);
   public static final cmb<cmq> v = a("smithing", cmq::new);
   public static final cmb<cmr> w = a("smoker", cmr::new);
   public static final cmb<cla> x = a("cartography_table", cla::new);
   public static final cmb<cmt> y = a("stonecutter", cmt::new);
   private final ckl z;
   private final cmb.a<T> A;

   private static <T extends cku> cmb<T> a(String $$0, cmb.a<T> $$1) {
      return ix.a(kh.r, $$0, new cmb<>($$1, ckn.g));
   }

   private static <T extends cku> cmb<T> a(String $$0, cmb.a<T> $$1, ckj... $$2) {
      return ix.a(kh.r, $$0, new cmb<>($$1, ckn.e.a($$2)));
   }

   private cmb(cmb.a<T> $$0, ckl $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, chz $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public ckl m() {
      return this.z;
   }

   interface a<T extends cku> {
      T create(int var1, chz var2);
   }
}

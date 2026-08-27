public class clm<T extends ckf> implements cjt {
   public static final clm<ckm> a = a("generic_9x1", ckm::a);
   public static final clm<ckm> b = a("generic_9x2", ckm::b);
   public static final clm<ckm> c = a("generic_9x3", ckm::c);
   public static final clm<ckm> d = a("generic_9x4", ckm::d);
   public static final clm<ckm> e = a("generic_9x5", ckm::e);
   public static final clm<ckm> f = a("generic_9x6", ckm::f);
   public static final clm<cky> g = a("generic_3x3", cky::new);
   public static final clm<ckt> h = a("crafter_3x3", ckt::new);
   public static final clm<ckh> i = a("anvil", ckh::new);
   public static final clm<cki> j = a("beacon", cki::new);
   public static final clm<ckj> k = a("blast_furnace", ckj::new);
   public static final clm<ckk> l = a("brewing_stand", ckk::new);
   public static final clm<ckw> m = a("crafting", ckw::new);
   public static final clm<ckz> n = a("enchantment", ckz::new);
   public static final clm<clb> o = a("furnace", clb::new);
   public static final clm<cld> p = a("grindstone", cld::new);
   public static final clm<cle> q = a("hopper", cle::new);
   public static final clm<clj> r = a("lectern", ($$0, $$1) -> new clj($$0));
   public static final clm<clk> s = a("loom", clk::new);
   public static final clm<clo> t = a("merchant", clo::new);
   public static final clm<clx> u = a("shulker_box", clx::new);
   public static final clm<cmb> v = a("smithing", cmb::new);
   public static final clm<cmc> w = a("smoker", cmc::new);
   public static final clm<ckl> x = a("cartography_table", ckl::new);
   public static final clm<cme> y = a("stonecutter", cme::new);
   private final cjw z;
   private final clm.a<T> A;

   private static <T extends ckf> clm<T> a(String $$0, clm.a<T> $$1) {
      return iv.a(kf.r, $$0, new clm<>($$1, cjy.g));
   }

   private static <T extends ckf> clm<T> a(String $$0, clm.a<T> $$1, cju... $$2) {
      return iv.a(kf.r, $$0, new clm<>($$1, cjy.e.a($$2)));
   }

   private clm(clm.a<T> $$0, cjw $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, chk $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cjw m() {
      return this.z;
   }

   interface a<T extends ckf> {
      T create(int var1, chk var2);
   }
}

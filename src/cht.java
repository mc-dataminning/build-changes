public class cht<T extends cgm> implements cga {
   public static final cht<cgt> a = a("generic_9x1", cgt::a);
   public static final cht<cgt> b = a("generic_9x2", cgt::b);
   public static final cht<cgt> c = a("generic_9x3", cgt::c);
   public static final cht<cgt> d = a("generic_9x4", cgt::d);
   public static final cht<cgt> e = a("generic_9x5", cgt::e);
   public static final cht<cgt> f = a("generic_9x6", cgt::f);
   public static final cht<chf> g = a("generic_3x3", chf::new);
   public static final cht<cha> h = a("crafter_3x3", cha::new);
   public static final cht<cgo> i = a("anvil", cgo::new);
   public static final cht<cgp> j = a("beacon", cgp::new);
   public static final cht<cgq> k = a("blast_furnace", cgq::new);
   public static final cht<cgr> l = a("brewing_stand", cgr::new);
   public static final cht<chd> m = a("crafting", chd::new);
   public static final cht<chg> n = a("enchantment", chg::new);
   public static final cht<chi> o = a("furnace", chi::new);
   public static final cht<chk> p = a("grindstone", chk::new);
   public static final cht<chl> q = a("hopper", chl::new);
   public static final cht<chq> r = a("lectern", ($$0, $$1) -> new chq($$0));
   public static final cht<chr> s = a("loom", chr::new);
   public static final cht<chv> t = a("merchant", chv::new);
   public static final cht<cie> u = a("shulker_box", cie::new);
   public static final cht<cii> v = a("smithing", cii::new);
   public static final cht<cij> w = a("smoker", cij::new);
   public static final cht<cgs> x = a("cartography_table", cgs::new);
   public static final cht<cil> y = a("stonecutter", cil::new);
   private final cgd z;
   private final cht.a<T> A;

   private static <T extends cgm> cht<T> a(String $$0, cht.a<T> $$1) {
      return io.a(jy.s, $$0, new cht<>($$1, cgf.g));
   }

   private static <T extends cgm> cht<T> a(String $$0, cht.a<T> $$1, cgb... $$2) {
      return io.a(jy.s, $$0, new cht<>($$1, cgf.e.a($$2)));
   }

   private cht(cht.a<T> $$0, cgd $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cdt $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cgd m() {
      return this.z;
   }

   interface a<T extends cgm> {
      T create(int var1, cdt var2);
   }
}

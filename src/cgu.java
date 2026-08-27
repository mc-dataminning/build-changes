public class cgu<T extends cfp> implements cfd {
   public static final cgu<cfw> a = a("generic_9x1", cfw::a);
   public static final cgu<cfw> b = a("generic_9x2", cfw::b);
   public static final cgu<cfw> c = a("generic_9x3", cfw::c);
   public static final cgu<cfw> d = a("generic_9x4", cfw::d);
   public static final cgu<cfw> e = a("generic_9x5", cfw::e);
   public static final cgu<cfw> f = a("generic_9x6", cfw::f);
   public static final cgu<cgg> g = a("generic_3x3", cgg::new);
   public static final cgu<cfr> h = a("anvil", cfr::new);
   public static final cgu<cfs> i = a("beacon", cfs::new);
   public static final cgu<cft> j = a("blast_furnace", cft::new);
   public static final cgu<cfu> k = a("brewing_stand", cfu::new);
   public static final cgu<cge> l = a("crafting", cge::new);
   public static final cgu<cgh> m = a("enchantment", cgh::new);
   public static final cgu<cgj> n = a("furnace", cgj::new);
   public static final cgu<cgl> o = a("grindstone", cgl::new);
   public static final cgu<cgm> p = a("hopper", cgm::new);
   public static final cgu<cgr> q = a("lectern", ($$0, $$1) -> new cgr($$0));
   public static final cgu<cgs> r = a("loom", cgs::new);
   public static final cgu<cgw> s = a("merchant", cgw::new);
   public static final cgu<che> t = a("shulker_box", che::new);
   public static final cgu<chi> u = a("smithing", chi::new);
   public static final cgu<chj> v = a("smoker", chj::new);
   public static final cgu<cfv> w = a("cartography_table", cfv::new);
   public static final cgu<chl> x = a("stonecutter", chl::new);
   private final cfg y;
   private final cgu.a<T> z;

   private static <T extends cfp> cgu<T> a(String $$0, cgu.a<T> $$1) {
      return io.a(jy.s, $$0, new cgu<>($$1, cfi.f));
   }

   private static <T extends cfp> cgu<T> a(String $$0, cgu.a<T> $$1, cfe... $$2) {
      return io.a(jy.s, $$0, new cgu<>($$1, cfi.d.a($$2)));
   }

   private cgu(cgu.a<T> $$0, cfg $$1) {
      this.z = $$0;
      this.y = $$1;
   }

   public T a(int $$0, ccw $$1) {
      return this.z.create($$0, $$1);
   }

   @Override
   public cfg m() {
      return this.y;
   }

   interface a<T extends cfp> {
      T create(int var1, ccw var2);
   }
}

public class cfl<T extends ceg> implements cdu {
   public static final cfl<cen> a = a("generic_9x1", cen::a);
   public static final cfl<cen> b = a("generic_9x2", cen::b);
   public static final cfl<cen> c = a("generic_9x3", cen::c);
   public static final cfl<cen> d = a("generic_9x4", cen::d);
   public static final cfl<cen> e = a("generic_9x5", cen::e);
   public static final cfl<cen> f = a("generic_9x6", cen::f);
   public static final cfl<cex> g = a("generic_3x3", cex::new);
   public static final cfl<cei> h = a("anvil", cei::new);
   public static final cfl<cej> i = a("beacon", cej::new);
   public static final cfl<cek> j = a("blast_furnace", cek::new);
   public static final cfl<cel> k = a("brewing_stand", cel::new);
   public static final cfl<cev> l = a("crafting", cev::new);
   public static final cfl<cey> m = a("enchantment", cey::new);
   public static final cfl<cfa> n = a("furnace", cfa::new);
   public static final cfl<cfc> o = a("grindstone", cfc::new);
   public static final cfl<cfd> p = a("hopper", cfd::new);
   public static final cfl<cfi> q = a("lectern", ($$0, $$1) -> new cfi($$0));
   public static final cfl<cfj> r = a("loom", cfj::new);
   public static final cfl<cfn> s = a("merchant", cfn::new);
   public static final cfl<cfv> t = a("shulker_box", cfv::new);
   public static final cfl<cfz> u = a("smithing", cfz::new);
   public static final cfl<cga> v = a("smoker", cga::new);
   public static final cfl<cem> w = a("cartography_table", cem::new);
   public static final cfl<cgc> x = a("stonecutter", cgc::new);
   private final cdx y;
   private final cfl.a<T> z;

   private static <T extends ceg> cfl<T> a(String $$0, cfl.a<T> $$1) {
      return ht.a(jd.s, $$0, new cfl<>($$1, cdz.f));
   }

   private static <T extends ceg> cfl<T> a(String $$0, cfl.a<T> $$1, cdv... $$2) {
      return ht.a(jd.s, $$0, new cfl<>($$1, cdz.d.a($$2)));
   }

   private cfl(cfl.a<T> $$0, cdx $$1) {
      this.z = $$0;
      this.y = $$1;
   }

   public T a(int $$0, cbo $$1) {
      return this.z.create($$0, $$1);
   }

   @Override
   public cdx m() {
      return this.y;
   }

   interface a<T extends ceg> {
      T create(int var1, cbo var2);
   }
}
